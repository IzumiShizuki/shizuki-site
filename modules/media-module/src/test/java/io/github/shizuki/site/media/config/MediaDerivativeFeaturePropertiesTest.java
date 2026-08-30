package io.github.shizuki.site.media.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class MediaDerivativeFeaturePropertiesTest {

    @Test
    void defaultsDerivativeWorkerAndOssProcessingToDisabled() throws Exception {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();

        properties.afterPropertiesSet();

        assertThat(properties.isEnabled()).isFalse();
        assertThat(properties.isWorkerEnabled()).isFalse();
        assertThat(properties.isOssProcessingEnabled()).isFalse();
        assertThat(properties.canRunWorker()).isFalse();
        assertThat(properties.canUseOssProcessing()).isFalse();
        assertThat(properties.getMaxRetries()).isEqualTo(3);
        assertThat(properties.getBatchSize()).isEqualTo(8);
        assertThat(properties.getLeaseTimeoutSeconds()).isEqualTo(300);
        assertThat(properties.isAvifEnabled()).isFalse();
    }

    @Test
    void rejectsWorkerWithoutExplicitOssProcessingPermission() {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();
        properties.setEnabled(true);
        properties.setWorkerEnabled(true);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("oss-processing-enabled");
    }

    @Test
    void permitsWorkerOnlyAfterAllThreeGatesAreEnabled() throws Exception {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();
        properties.setEnabled(true);
        properties.setWorkerEnabled(true);
        properties.setOssProcessingEnabled(true);

        properties.afterPropertiesSet();

        assertThat(properties.canRunWorker()).isTrue();
        assertThat(properties.canUseOssProcessing()).isTrue();
    }

    @Test
    void rejectsUnsafeProcessorVersion() {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();
        properties.setProcessorVersion("version/with/path");

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("unsupported characters");
    }

    @Test
    void rejectsUnsafeWorkerBounds() {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();
        properties.setBatchSize(0);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("batch-size");

        properties.setBatchSize(1);
        properties.setLeaseTimeoutSeconds(29);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("lease-timeout-seconds");
    }
}
