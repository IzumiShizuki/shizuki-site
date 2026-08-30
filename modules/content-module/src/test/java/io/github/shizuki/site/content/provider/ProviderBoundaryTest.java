package io.github.shizuki.site.content.provider;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ProviderBoundaryTest {

    private final BoundedProviderJsonParser parser = new BoundedProviderJsonParser(new ObjectMapper());

    @Test
    void exposesOnlyFixedHttpsProviderHostsAndUniformBounds() {
        assertThat(ExternalWidgetProviderPolicies.OPEN_METEO.allowedHosts())
            .containsExactly("api.open-meteo.com");
        assertThat(ExternalWidgetProviderPolicies.HITOKOTO.allowedHosts())
            .containsExactly("v1.hitokoto.cn");
        assertThat(ExternalWidgetProviderPolicies.OPEN_METEO.connectTimeout()).isEqualTo(Duration.ofSeconds(2));
        assertThat(ExternalWidgetProviderPolicies.OPEN_METEO.readTimeout()).isEqualTo(Duration.ofSeconds(5));
        assertThat(ExternalWidgetProviderPolicies.HITOKOTO.maxResponseBytes()).isEqualTo(32 * 1024);

        assertThatThrownBy(() -> ExternalWidgetProviderPolicies.OPEN_METEO.requireAllowedEndpoint(
            URI.create("http://api.open-meteo.com/v1/forecast")
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> ExternalWidgetProviderPolicies.OPEN_METEO.requireAllowedEndpoint(
            URI.create("https://example.test/v1/forecast")
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> ExternalWidgetProviderPolicies.OPEN_METEO.requireAllowedEndpoint(
            URI.create("https://user@api.open-meteo.com/v1/forecast")
        )).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void rejectsOversizedDuplicateTrailingAndNonObjectJson() {
        ProviderHttpPolicy tinyPolicy = new ProviderHttpPolicy(
            "TEST",
            URI.create("https://provider.test"),
            Set.of("provider.test"),
            Duration.ofMillis(100),
            Duration.ofMillis(200),
            256
        );
        assertUnavailable(() -> parse(repeat("x", 257), tinyPolicy));
        assertUnavailable(() -> parse("{\"value\":1,\"value\":2}", tinyPolicy));
        assertUnavailable(() -> parse("{\"value\":1} true", tinyPolicy));
        assertUnavailable(() -> parse("[1,2,3]", tinyPolicy));
    }

    @Test
    void schemaRejectsMissingUnknownAndWrongScalarFields() {
        ProviderHttpPolicy policy = ExternalWidgetProviderPolicies.HITOKOTO;
        ProviderJsonSchema<String> schema = root -> {
            StrictProviderJson.requireExactFields(root, Set.of("text", "temperature"), Set.of("author"));
            String text = StrictProviderJson.requiredText(root, "text", 20);
            double temperature = StrictProviderJson.requiredFiniteNumber(root, "temperature");
            return text + ":" + temperature;
        };

        assertThat(parser.parse(stream("{\"text\":\"moon\",\"temperature\":18.5}"), policy, schema))
            .isEqualTo("moon:18.5");
        assertUnavailable(() -> parser.parse(stream("{\"text\":\"moon\"}"), policy, schema));
        assertUnavailable(() -> parser.parse(
            stream("{\"text\":\"moon\",\"temperature\":18,\"unexpected\":true}"),
            policy,
            schema
        ));
        assertUnavailable(() -> parser.parse(
            stream("{\"text\":9,\"temperature\":18}"),
            policy,
            schema
        ));
    }

    private String parse(String json, ProviderHttpPolicy policy) {
        return parser.parse(stream(json), policy, root -> root.toString());
    }

    private ByteArrayInputStream stream(String value) {
        return new ByteArrayInputStream(value.getBytes(StandardCharsets.UTF_8));
    }

    private String repeat(String value, int count) {
        return value.repeat(count);
    }

    private void assertUnavailable(ThrowingAction action) {
        assertThatThrownBy(action::run)
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.UPSTREAM_UNAVAILABLE)
            );
    }

    @FunctionalInterface
    private interface ThrowingAction {
        void run();
    }
}
