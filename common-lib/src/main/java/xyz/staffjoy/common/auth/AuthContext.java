package xyz.staffjoy.common.auth;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 认证上下文助手类
 * <p>
 * 本项目后续的请求都需要用户id
 * A context holder class for holding the current userId and authz info
 *
 * @author bobo
 */
public class AuthContext {

    private static String getRequetHeader(String headerName) {
        // 通过 RequestContextHolder 获取请求属性信息(spring 提供的一种机制)
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes instanceof ServletRequestAttributes) {
            HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
            String value = request.getHeader(headerName);
            return value;
        }
        return null;
    }

    public static String getUserId() {
        return getRequetHeader(AuthConstant.CURRENT_USER_HEADER);
    }

    public static String getAuthz() {
        return getRequetHeader(AuthConstant.AUTHORIZATION_HEADER);
    }

}
