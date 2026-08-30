package io.github.shizuki.site.content.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class PersonalContentFeaturePropertiesTest {

    @Test
    void defaultsAllPersonalContentSurfacesToDisabled() throws Exception {
        PersonalContentFeatureProperties properties = new PersonalContentFeatureProperties();

        properties.afterPropertiesSet();

        assertThat(properties.isEnabled()).isFalse();
        assertThat(properties.isPublicApiAvailable()).isFalse();
        assertThat(properties.isStudioAvailable()).isFalse();
    }

    @Test
    void rejectsChildSurfaceWithoutTheDomainGate() {
        PersonalContentFeatureProperties properties = new PersonalContentFeatureProperties();
        properties.setPublicApiEnabled(true);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("personal-content.enabled");
    }

    @Test
    void rejectsInvalidCursorPageLimits() {
        PersonalContentFeatureProperties properties = new PersonalContentFeatureProperties();
        properties.setDefaultPageSize(51);
        properties.setMaxPageSize(50);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("default-page-size");
    }
}
