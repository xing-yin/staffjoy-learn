package xyz.staffjoy.faraday.core.mappings;

import com.github.structlog4j.ILogger;
import com.github.structlog4j.SLoggerFactory;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import xyz.staffjoy.faraday.config.FaradayProperties;
import xyz.staffjoy.faraday.config.MappingProperties;
import xyz.staffjoy.faraday.core.http.HttpClientProvider;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.util.CollectionUtils.isEmpty;

/**
 * 路由映射表的实现超类
 */
public abstract class MappingsProvider {

    private static final ILogger log = SLoggerFactory.getLogger(MappingsProvider.class);

    protected final ServerProperties serverProperties;
    protected final FaradayProperties faradayProperties;
    protected final MappingsValidator mappingsValidator;
    protected final HttpClientProvider httpClientProvider;
    protected List<MappingProperties> mappings;

    public MappingsProvider(
            ServerProperties serverProperties,
            FaradayProperties faradayProperties,
            MappingsValidator mappingsValidator,
            HttpClientProvider httpClientProvider) {
        this.serverProperties = serverProperties;
        this.faradayProperties = faradayProperties;
        this.mappingsValidator = mappingsValidator;
        this.httpClientProvider = httpClientProvider;
    }

    /**
     * 解析目的对象的信息
     *
     * @param originHost
     * @param request
     * @return
     */
    public MappingProperties resolveMapping(String originHost, HttpServletRequest request) {
        if (shouldUpdateMappings(request)) {
            updateMappings();
        }
        List<MappingProperties> resolvedMappings = mappings.stream()
                .filter(mapping -> originHost.toLowerCase().equals(mapping.getHost().toLowerCase()))
                .collect(Collectors.toList());
        if (isEmpty(resolvedMappings)) {
            return null;
        }
        return resolvedMappings.get(0);
    }

    /**
     * 更新路由表
     */
    @PostConstruct
    protected synchronized void updateMappings() {
        List<MappingProperties> newMappings = retrieveMappings();
        mappingsValidator.validate(newMappings);
        mappings = newMappings;
        // 更新 HttpClients 路由表
        httpClientProvider.updateHttpClients(mappings);
        log.info("Destination mappings updated", mappings);
    }

    /**
     * 是否要更新映射
     *
     * @param request
     * @return
     */
    protected abstract boolean shouldUpdateMappings(HttpServletRequest request);

    protected abstract List<MappingProperties> retrieveMappings();
}
