package io.github.shizuki.common.core.response;

import java.util.List;

public record PageResponse<T>(List<T> items, long total, long pageNo, long pageSize) {

    public static <T> PageResponse<T> of(List<T> items, long total, long pageNo, long pageSize) {
        return new PageResponse<>(items, total, pageNo, pageSize);
    }
}
