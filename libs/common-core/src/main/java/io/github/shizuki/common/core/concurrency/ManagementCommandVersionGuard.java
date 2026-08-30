package io.github.shizuki.common.core.concurrency;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 管理命令使用的强 ETag 与乐观版本校验器。
 *
 * <p>调用方应先通过 {@link #parseRequiredIfMatch(String)} 取得请求版本，再把该版本放入数据库
 * 条件更新的 {@code WHERE version_num = ?} 中。条件更新后必须调用
 * {@link #requireSingleRowUpdated(int, LongSupplier)}，从而让并发写入以显式冲突结束，而不是覆盖
 * 另一会话刚刚提交的内容。
 */
public final class ManagementCommandVersionGuard {

    /**
     * 只接受本站管理命令生成的规范强 ETag，拒绝弱标签、通配符与标签列表。
     */
    private static final Pattern STRONG_VERSION_ETAG = Pattern.compile("\\\"v(0|[1-9][0-9]*)\\\"");

    private ManagementCommandVersionGuard() {
    }

    /**
     * 解析必需的 {@code If-Match} 请求头。
     *
     * @param ifMatch 原始请求头
     * @return 请求基于的持久化版本
     * @throws BusinessException 请求头缺失、为弱 ETag 或格式不规范时抛出
     */
    public static long parseRequiredIfMatch(String ifMatch) {
        if (ifMatch == null || ifMatch.isBlank()) {
            throw invalidIfMatch("If-Match header is required");
        }

        Matcher matcher = STRONG_VERSION_ETAG.matcher(ifMatch.trim());
        if (!matcher.matches()) {
            throw invalidIfMatch("If-Match must contain one canonical strong version ETag");
        }

        try {
            return Long.parseLong(matcher.group(1));
        } catch (NumberFormatException exception) {
            throw invalidIfMatch("If-Match version is outside the supported range");
        }
    }

    /**
     * 在已读取当前版本的场景中验证请求前置条件。
     *
     * <p>该方法适合在进入事务写入前尽早返回冲突；实际更新仍须带版本条件，并通过
     * {@link #requireSingleRowUpdated(int, LongSupplier)} 检查数据库写入结果。
     *
     * @param ifMatch 原始 {@code If-Match} 请求头
     * @param currentVersion 当前持久化版本
     * @return 已验证的请求版本
     */
    public static long requireMatch(String ifMatch, long currentVersion) {
        requireValidVersion(currentVersion, "currentVersion");
        long expectedVersion = parseRequiredIfMatch(ifMatch);
        if (expectedVersion != currentVersion) {
            throw conflict(currentVersion);
        }
        return expectedVersion;
    }

    /**
     * 验证带版本条件的单行管理写入确实提交。
     *
     * @param affectedRows 条件更新影响行数
     * @param currentVersionSupplier 零行更新时重新读取当前版本的函数
     * @throws BusinessException 条件更新因并发版本变化未命中时抛出
     */
    public static void requireSingleRowUpdated(int affectedRows, LongSupplier currentVersionSupplier) {
        if (affectedRows == 1) {
            return;
        }
        if (affectedRows < 0 || affectedRows > 1) {
            throw new IllegalStateException("versioned management update must affect zero or one row");
        }
        if (currentVersionSupplier == null) {
            throw new IllegalArgumentException("currentVersionSupplier is required");
        }

        long currentVersion = currentVersionSupplier.getAsLong();
        requireValidVersion(currentVersion, "currentVersionSupplier result");
        throw conflict(currentVersion);
    }

    /**
     * 将持久化版本编码为本站管理命令使用的强 ETag。
     *
     * @param version 非负版本
     * @return 形如 {@code "v17"} 的强 ETag
     */
    public static String toStrongEtag(long version) {
        requireValidVersion(version, "version");
        return "\"v" + version + "\"";
    }

    private static BusinessException invalidIfMatch(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private static BusinessException conflict(long currentVersion) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            "Management command version conflict",
            Map.of(
                "currentVersion", currentVersion,
                "currentEtag", toStrongEtag(currentVersion)
            )
        );
    }

    private static void requireValidVersion(long version, String field) {
        if (version < 0L) {
            throw new IllegalArgumentException(field + " must not be negative");
        }
    }
}
