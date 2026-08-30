package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import org.junit.jupiter.api.Test;

class MediaDerivativeObjectKeyFactoryTest {

    private final MediaDerivativeObjectKeyFactory factory = new MediaDerivativeObjectKeyFactory();

    @Test
    void buildsStableVersionedKeyFromThePersistedTaskIdentity() {
        MediaAssetVariantEntity task = task("DISPLAY_WEBP", "PUBLIC_MATERIALIZED", "v7.2");

        assertThat(factory.create(task)).isEqualTo(
            "personal-content/derivatives/42/v7.2/public-materialized/display-webp.webp"
        );
    }

    @Test
    void usesAvifExtensionOnlyForTheOptionalAvifVariant() {
        MediaAssetVariantEntity task = task("DISPLAY_AVIF", "PRIVATE_WORKING", "v8");

        assertThat(factory.create(task)).endsWith("/private-working/display-avif.avif");
    }

    @Test
    void rejectsAProcessorVersionThatCouldEscapeTheObjectPrefix() {
        MediaAssetVariantEntity task = task("THUMB_WEBP", "PRIVATE_WORKING", "../v9");

        assertThatThrownBy(() -> factory.create(task))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("processor version");
    }

    private MediaAssetVariantEntity task(String variant, String scope, String version) {
        MediaAssetVariantEntity task = new MediaAssetVariantEntity();
        task.setSourceAssetId(42L);
        task.setVariantCode(variant);
        task.setDeliveryScope(scope);
        task.setProcessorVersion(version);
        return task;
    }
}
