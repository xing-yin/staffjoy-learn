package xyz.staffjoy.common.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.util.StringUtils;

/**
 * Feign interceptor，for passing auth info to backend
 *
 * @author bobo
 */
public class FeignRequestHeaderInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        // 关键在于从 AuthContext 上下文中获取用户 id
        String userId = AuthContext.getUserId();
        if (!StringUtils.isEmpty(userId)) {
            // 通过 requestTemplate 继续向后传递
            requestTemplate.header(AuthConstant.CURRENT_USER_HEADER, userId);
        }
    }
}
