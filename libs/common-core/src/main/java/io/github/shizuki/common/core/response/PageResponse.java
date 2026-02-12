package io.github.shizuki.common.core.response;

import java.util.List;

/**
 * 分页响应体。
 *
 * @param items 当前页数据
 * @param total 总条数
 * @param pageNo 当前页号
 * @param pageSize 当前页大小
 * @param <T> 数据类型
 */
public record PageResponse<T>(List<T> items, long total, long pageNo, long pageSize) {

    /**
     * 构造分页响应。
     *
     * @param items 当前页数据
     * @param total 总条数
     * @param pageNo 当前页号
     * @param pageSize 当前页大小
     * @param <T> 数据类型
     * @return 分页响应
     */
    public static <T> PageResponse<T> of(List<T> items, long total, long pageNo, long pageSize) {
        return new PageResponse<>(items, total, pageNo, pageSize);
    }
}
