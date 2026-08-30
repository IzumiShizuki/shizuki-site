package io.github.shizuki.site.admin.response;

import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;

/**
 * 管理端编辑、重排和显式命令共享的乐观版本响应。
 *
 * @param version 当前持久化版本
 * @param etag 可直接用于 HTTP {@code If-Match} 的强 ETag
 */
public record OptimisticVersionResponse(long version, String etag) {

    public OptimisticVersionResponse {
        if (version < 0L) {
            throw new IllegalArgumentException("version must not be negative");
        }
        String expected = toEtag(version);
        if (etag == null || !expected.equals(etag)) {
            throw new IllegalArgumentException("etag must match version");
        }
    }

    public static OptimisticVersionResponse of(long version) {
        return new OptimisticVersionResponse(version, toEtag(version));
    }

    public static String toEtag(long version) {
        return ManagementCommandVersionGuard.toStrongEtag(version);
    }
}
