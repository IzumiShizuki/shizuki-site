package io.github.shizuki.site.media.config;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class PhotoRetentionPropertiesTest {

    @Test
    void firstReleaseRejectsAutomaticCleanup() {
        PhotoRetentionProperties properties = new PhotoRetentionProperties();
        properties.setAutomaticCleanupEnabled(true);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("not available in the first release");
    }

    @Test
    void retentionPeriodIsBounded() {
        PhotoRetentionProperties properties = new PhotoRetentionProperties();
        properties.setRetentionDays(0);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("between 1 and 3650");
    }
}
