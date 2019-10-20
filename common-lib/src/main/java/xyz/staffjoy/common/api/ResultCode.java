package xyz.staffjoy.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * Result Code Enum
 * 把状态码封装成一个枚举对象，不用每个地方自己处理不同的状态码
 * <p>
 * 相比于直接返回状态码，可以简化状态的处理，统一来处理(比如返回消息)
 *
 * @author william
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    /**
     * 结果状态码
     */
    SUCCESS(HttpServletResponse.SC_OK, "Operation is Successful"),

    FAILURE(HttpServletResponse.SC_BAD_REQUEST, "Biz Exception"),

    UN_AUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED, "Request Unauthorized"),

    NOT_FOUND(HttpServletResponse.SC_NOT_FOUND, "404 Not Found"),

    MSG_NOT_READABLE(HttpServletResponse.SC_BAD_REQUEST, "Message Can't be Read"),

    METHOD_NOT_SUPPORTED(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Method Not Supported"),

    MEDIA_TYPE_NOT_SUPPORTED(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Media Type Not Supported"),

    REQ_REJECT(HttpServletResponse.SC_FORBIDDEN, "Request Rejected"),

    INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal Server Error"),

    PARAM_MISS(HttpServletResponse.SC_BAD_REQUEST, "Missing Required Parameter"),

    PARAM_TYPE_ERROR(HttpServletResponse.SC_BAD_REQUEST, "Parameter Type Mismatch"),

    PARAM_BIND_ERROR(HttpServletResponse.SC_BAD_REQUEST, "Parameter Binding Error"),

    PARAM_VALID_ERROR(HttpServletResponse.SC_BAD_REQUEST, "Parameter Validation Error");

    final int code;

    final String msg;
}
