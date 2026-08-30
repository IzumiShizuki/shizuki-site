package io.github.shizuki.site.content.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class ExternalWidgetFeaturePropertiesTest {

    @Test
    void defaultsWidgetsAndAllUpstreamRequestsToDisabled() throws Exception {
        ExternalWidgetFeatureProperties properties = new ExternalWidgetFeatureProperties();

        properties.afterPropertiesSet();

        assertThat(properties.isEnabled()).isFalse();
        assertThat(properties.isWeatherEnabled()).isFalse();
        assertThat(properties.isQuoteEnabled()).isFalse();
        assertThat(properties.canContactUpstream()).isFalse();
        assertThat(properties.canContactWeatherUpstream()).isFalse();
        assertThat(properties.canContactQuoteUpstream()).isFalse();
    }

    @Test
    void allowsServingLocalFactsWithoutPermittingUpstreamTraffic() throws Exception {
        ExternalWidgetFeatureProperties properties = new ExternalWidgetFeatureProperties();
        properties.setEnabled(true);
        properties.setWeatherEnabled(true);
        properties.setQuoteEnabled(true);

        properties.afterPropertiesSet();

        assertThat(properties.canContactUpstream()).isFalse();
        assertThat(properties.canContactWeatherUpstream()).isFalse();
        assertThat(properties.canContactQuoteUpstream()).isFalse();
    }

    @Test
    void rejectsUpstreamTrafficWhenTheWidgetDomainIsDisabled() {
        ExternalWidgetFeatureProperties properties = new ExternalWidgetFeatureProperties();
        properties.setUpstreamRequestsEnabled(true);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("external-widgets.enabled");
    }

    @Test
    void rejectsUpstreamTrafficWithoutAnEnabledWidget() {
        ExternalWidgetFeatureProperties properties = new ExternalWidgetFeatureProperties();
        properties.setEnabled(true);
        properties.setUpstreamRequestsEnabled(true);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("at least one enabled widget");
    }

    @Test
    void rejectsUnboundedProviderResponseConfiguration() {
        ExternalWidgetFeatureProperties properties = new ExternalWidgetFeatureProperties();
        properties.setMaxResponseBytes(5_000_000);

        assertThatThrownBy(properties::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("max-response-bytes");
    }
}
