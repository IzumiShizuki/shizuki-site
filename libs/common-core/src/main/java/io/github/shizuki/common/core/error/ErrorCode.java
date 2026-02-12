package io.github.shizuki.common.core.error;

/**
 * 通用业务错误码定义。
 */
public enum ErrorCode {
    /**
     * 请求参数或请求格式非法。
     */
    BAD_REQUEST("BAD_REQUEST", "请求参数错误"),
    /**
     * 未登录或凭证无效。
     */
    UNAUTHORIZED("UNAUTHORIZED", "未授权访问"),
    /**
     * 已登录但无权限执行当前操作。
     */
    FORBIDDEN("FORBIDDEN", "无权限访问"),
    /**
     * 目标资源不存在。
     */
    NOT_FOUND("NOT_FOUND", "资源不存在"),
    /**
     * 请求频率超限。
     */
    TOO_MANY_REQUESTS("TOO_MANY_REQUESTS", "请求过于频繁"),
    /**
     * 服务器内部错误。
     */
    INTERNAL_ERROR("INTERNAL_ERROR", "服务器内部错误");

    /**
     * 稳定错误码标识。
     */
    private final String code;
    /**
     * 默认中文错误消息。
     */
    private final String defaultMessage;

    ErrorCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    /**
     * 获取错误码。
     *
     * @return 错误码
     */
    public String code() {
        return code;
    }

    /**
     * 获取默认错误消息。
     *
     * @return 默认错误消息
     */
    public String defaultMessage() {
        return defaultMessage;
    }
}
