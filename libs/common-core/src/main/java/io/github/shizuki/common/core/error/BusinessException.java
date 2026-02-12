package io.github.shizuki.common.core.error;

import java.util.Map;

/**
 * 业务异常。
 *
 * <p>封装统一错误码与可选详情字段，用于向上层输出稳定错误语义。
 */
public class BusinessException extends RuntimeException {

    /**
     * 业务错误码。
     */
    private final ErrorCode errorCode;
    /**
     * 额外错误详情（只读副本）。
     */
    private final Map<String, Object> details;

    /**
     * 使用错误码默认消息构造异常。
     *
     * @param errorCode 错误码
     */
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.defaultMessage());
        this.errorCode = errorCode;
        this.details = Map.of();
    }

    /**
     * 使用自定义消息构造异常。
     *
     * @param errorCode 错误码
     * @param message 自定义消息
     */
    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.details = Map.of();
    }

    /**
     * 使用自定义消息和详情构造异常。
     *
     * @param errorCode 错误码
     * @param message 自定义消息
     * @param details 详情字段
     */
    public BusinessException(ErrorCode errorCode, String message, Map<String, Object> details) {
        super(message);
        this.errorCode = errorCode;
        this.details = details == null ? Map.of() : Map.copyOf(details);
    }

    /**
     * 获取错误码。
     *
     * @return 错误码
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 获取异常详情。
     *
     * @return 异常详情
     */
    public Map<String, Object> getDetails() {
        return details;
    }
}
