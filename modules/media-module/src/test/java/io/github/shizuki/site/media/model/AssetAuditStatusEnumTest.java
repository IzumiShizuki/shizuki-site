package io.github.shizuki.site.media.model;

import io.github.shizuki.common.core.error.BusinessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssetAuditStatusEnumTest {

    @Test
    void shouldParseAuditStatusCaseInsensitive() {
        Assertions.assertEquals(AssetAuditStatusEnum.APPROVED, AssetAuditStatusEnum.fromName("approved"));
        Assertions.assertEquals(AssetAuditStatusEnum.PENDING_AUDIT, AssetAuditStatusEnum.fromName("PENDING_AUDIT"));
    }

    @Test
    void shouldThrowWhenAuditStatusUnsupported() {
        Assertions.assertThrows(BusinessException.class, () -> AssetAuditStatusEnum.fromName("WAITING"));
    }
}
