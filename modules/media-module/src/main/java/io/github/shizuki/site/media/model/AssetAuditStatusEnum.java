package io.github.shizuki.site.media.model;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Arrays;

/**
 * 资源审核状态枚举。
 */
public enum AssetAuditStatusEnum {
    /**
     * 待审核。
     */
    PENDING_AUDIT,
    /**
     * 审核通过。
     */
    APPROVED,
    /**
     * 审核拒绝。
     */
    REJECTED;

    /**
     * 根据字符串解析审核状态。
     */
    public static AssetAuditStatusEnum fromName(String raw) {
        if (raw == null || raw.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Audit status is required");
        }
        return Arrays.stream(values())
            .filter(value -> value.name().equalsIgnoreCase(raw.trim()))
            .findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported audit status: " + raw));
    }
}
