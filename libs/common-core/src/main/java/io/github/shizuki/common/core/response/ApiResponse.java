package io.github.shizuki.common.core.response;

import java.time.Instant;

/**
 * 通用 API 响应体。
 *
 * @param code 响应码
 * @param message 响应消息
 * @param data 响应数据
 * @param timestamp 响应时间
 * @param <T> 数据类型
 */
public record ApiResponse<T>(String code, String message, T data, Instant timestamp) {

    /**
     * 构造成功响应。
     *
     * @param data 响应数据
     * @param <T> 数据类型
     * @return 成功响应
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>("OK", "success", data, Instant.now());
    }

    /**
     * 构造失败响应。
     *
     * @param code 失败码
     * @param message 失败消息
     * @param <T> 数据类型
     * @return 失败响应
     */
    public static <T> ApiResponse<T> failure(String code, String message) {
        return new ApiResponse<>(code, message, null, Instant.now());
    }
}
