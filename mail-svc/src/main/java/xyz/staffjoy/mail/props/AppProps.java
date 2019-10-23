package xyz.staffjoy.mail.props;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * 使用阿里云服务的配置
 */
@Component
// 使用这个注解，会绑定到 application.yml 的aliyun-access-key 和 aliyun-access-secret
@ConfigurationProperties(prefix = "staffjoy")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppProps {

    // aliyun directmail props
    @NotNull
    private String aliyunAccessKey;
    @NotNull
    private String aliyunAccessSecret;

}
