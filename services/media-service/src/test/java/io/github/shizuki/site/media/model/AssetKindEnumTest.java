package io.github.shizuki.site.media.model;

import io.github.shizuki.common.core.error.BusinessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssetKindEnumTest {

    @Test
    void shouldMapCodeToEnumAndNameToEnum() {
        Assertions.assertEquals(AssetKindEnum.STATIC_IMAGE, AssetKindEnum.fromCode(1));
        Assertions.assertEquals(AssetKindEnum.ANIMATED_IMAGE, AssetKindEnum.fromName("animated_image"));
        Assertions.assertEquals(AssetKindEnum.LIVE2D_PACKAGE, AssetKindEnum.fromName("LIVE2D_PACKAGE"));
    }

    @Test
    void shouldThrowWhenCodeNotSupported() {
        Assertions.assertThrows(BusinessException.class, () -> AssetKindEnum.fromCode(999));
    }
}
