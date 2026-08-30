package io.github.shizuki.site.common.response;

import java.util.List;

/**
 * 面向公开内容的无总数游标分页响应。
 *
 * @param items 当前批次，顺序由对应查询的稳定排序契约决定
 * @param nextCursor 下一批次的不透明游标；没有后续内容时为 {@code null}
 * @param hasMore 是否仍有后续内容
 * @param <T> 公开条目类型
 */
public record CursorPageResponse<T>(List<T> items, String nextCursor, boolean hasMore) {

    public CursorPageResponse {
        items = items == null ? List.of() : List.copyOf(items);
        if (hasMore && (nextCursor == null || nextCursor.isBlank())) {
            throw new IllegalArgumentException("nextCursor is required when hasMore is true");
        }
        if (!hasMore) {
            nextCursor = null;
        } else {
            nextCursor = validateCursor(nextCursor);
        }
    }

    public static <T> CursorPageResponse<T> of(List<T> items, String nextCursor, boolean hasMore) {
        return new CursorPageResponse<>(items, nextCursor, hasMore);
    }

    private static String validateCursor(String raw) {
        String cursor = raw.trim();
        if (cursor.length() > 2048 || cursor.indexOf('\r') >= 0 || cursor.indexOf('\n') >= 0) {
            throw new IllegalArgumentException("nextCursor is invalid");
        }
        return cursor;
    }
}
