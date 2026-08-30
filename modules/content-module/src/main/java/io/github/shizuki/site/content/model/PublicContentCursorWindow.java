package io.github.shizuki.site.content.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * 公开内容 keyset 分页的查询窗口规则。
 *
 * <p>数据库查询应采用相同的全倒序词典边界：
 * {@code publish_time < t OR (publish_time = t AND stable_sort_key < k) OR
 * (publish_time = t AND stable_sort_key = k AND public_id < p)}。不得使用 offset 继续游标页面。
 */
public final class PublicContentCursorWindow {

    private PublicContentCursorWindow() {
    }

    /**
     * 判断候选记录是否严格位于游标之后，因而属于下一页查询窗口。
     *
     * @param candidate 候选记录键
     * @param cursor 上一页最后一条记录键
     * @return 是否属于后续窗口
     */
    public static boolean isInNextPage(
        PublicContentCursorKey candidate,
        PublicContentCursorKey cursor
    ) {
        Objects.requireNonNull(candidate, "candidate");
        Objects.requireNonNull(cursor, "cursor");
        return PublicContentCursorKey.NEWEST_FIRST.compare(candidate, cursor) > 0;
    }

    /**
     * 在内存中应用与数据库相同的 keyset 窗口，主要供组合服务和契约测试复用。
     *
     * @param candidates 候选记录
     * @param keyExtractor 稳定键提取器
     * @param cursor 可空的上一页边界
     * @param limit 最大条数
     * @param <T> 记录类型
     * @return 新到旧排序的下一页
     */
    public static <T> List<T> nextPage(
        Collection<T> candidates,
        Function<T, PublicContentCursorKey> keyExtractor,
        PublicContentCursorKey cursor,
        int limit
    ) {
        Objects.requireNonNull(candidates, "candidates");
        Objects.requireNonNull(keyExtractor, "keyExtractor");
        if (limit < 1) {
            throw new IllegalArgumentException("limit must be positive");
        }
        Comparator<T> order = (left, right) -> PublicContentCursorKey.NEWEST_FIRST.compare(
            Objects.requireNonNull(keyExtractor.apply(left), "candidate cursor key"),
            Objects.requireNonNull(keyExtractor.apply(right), "candidate cursor key")
        );
        return candidates.stream()
            .filter(candidate -> cursor == null || isInNextPage(keyExtractor.apply(candidate), cursor))
            .sorted(order)
            .limit(limit)
            .toList();
    }
}
