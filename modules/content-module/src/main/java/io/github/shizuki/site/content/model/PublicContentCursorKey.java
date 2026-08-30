package io.github.shizuki.site.content.model;

import java.time.Instant;
import java.util.Comparator;

/**
 * 公开相册和动态游标的稳定排序键。
 *
 * <p>游标编码必须保持不透明；该内部键规定按发布时间、不可变排序键、公开标识依次倒序。
 * 排序键应使用不会在发布后被编辑操作重排的值（通常是数据库主键），而不是可变的展示顺序。
 */
public record PublicContentCursorKey(Instant publishedAt, long stableSortKey, String publicId) {

    public static final Comparator<PublicContentCursorKey> NEWEST_FIRST =
        Comparator.comparing(PublicContentCursorKey::publishedAt, Comparator.reverseOrder())
            .thenComparing(Comparator.comparingLong(PublicContentCursorKey::stableSortKey).reversed())
            .thenComparing(PublicContentCursorKey::publicId, Comparator.reverseOrder());

    public PublicContentCursorKey(Instant publishedAt, String publicId) {
        this(publishedAt, 0L, publicId);
    }

    public PublicContentCursorKey {
        if (publishedAt == null || publicId == null || publicId.isBlank()) {
            throw new IllegalArgumentException("publishedAt and publicId are required");
        }
        if (stableSortKey < 0L) {
            throw new IllegalArgumentException("stableSortKey must not be negative");
        }
        publicId = publicId.trim();
        if (publicId.length() > 96 || !publicId.matches("[A-Za-z0-9_-]+")) {
            throw new IllegalArgumentException("publicId must be a URL-safe identifier of at most 96 characters");
        }
    }
}
