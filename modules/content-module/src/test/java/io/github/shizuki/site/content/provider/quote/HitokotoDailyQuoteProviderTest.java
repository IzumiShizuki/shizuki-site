package io.github.shizuki.site.content.provider.quote;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.BoundedProviderJsonParser;
import io.github.shizuki.site.content.provider.ExternalWidgetProviderPolicies;
import io.github.shizuki.site.content.provider.ProviderHttpTransport;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HitokotoDailyQuoteProviderTest {

    private static final Instant NOW = Instant.parse("2026-08-28T13:00:00Z");

    @Mock
    private ProviderHttpTransport transport;

    private ExternalWidgetFeatureProperties features;
    private HitokotoDailyQuoteProvider provider;

    @BeforeEach
    void setUp() {
        features = new ExternalWidgetFeatureProperties();
        provider = new HitokotoDailyQuoteProvider(
            transport,
            new BoundedProviderJsonParser(new ObjectMapper()),
            features,
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
    }

    @Test
    void featureGatePreventsVisitorLikeDirectUpstreamAccess() {
        assertThatThrownBy(() -> provider.fetch())
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FEATURE_DISABLED));
        verify(transport, never()).get(any(), any());
    }

    @Test
    void officialPayloadPreservesIdentityTypeWorkSpeakerAndSource() {
        enableQuoteUpstream();
        when(transport.get(any(), eq(ExternalWidgetProviderPolicies.HITOKOTO)))
            .thenReturn(stream(validPayload()));

        NormalizedDailyQuote quote = provider.fetch();

        ArgumentCaptor<URI> endpoint = ArgumentCaptor.forClass(URI.class);
        verify(transport).get(endpoint.capture(), eq(ExternalWidgetProviderPolicies.HITOKOTO));
        assertThat(endpoint.getValue()).isEqualTo(URI.create("https://v1.hitokoto.cn/?encode=json"));
        assertThat(quote.providerCode()).isEqualTo("HITOKOTO");
        assertThat(quote.externalId()).isEqualTo("550e8400-e29b-41d4-a716-446655440000");
        assertThat(quote.text()).isEqualTo("愿你眼里有光，心中有海。");
        assertThat(quote.category()).isEqualTo("i");
        assertThat(quote.sourceTitle()).isEqualTo("测试作品");
        assertThat(quote.author()).isEqualTo("测试作者");
        assertThat(quote.sourceDestination())
            .isEqualTo(URI.create("https://hitokoto.cn/sentences/550e8400-e29b-41d4-a716-446655440000"));
        assertThat(quote.fetchedAt()).isEqualTo(NOW);
        assertThat(quote.attribution().name()).isEqualTo("Hitokoto");
    }

    @Test
    void unknownFieldsInvalidTypesAndTransportFailuresAreRejected() {
        enableQuoteUpstream();
        when(transport.get(any(), eq(ExternalWidgetProviderPolicies.HITOKOTO)))
            .thenReturn(stream(validPayload().replace("\"length\": 14", "\"length\": 14, \"redirect\": \"https://evil.example\"")))
            .thenReturn(stream(validPayload().replace("\"type\": \"i\"", "\"type\": \"unknown\"")))
            .thenThrow(new IllegalStateException("timeout"));

        for (int attempt = 0; attempt < 3; attempt++) {
            assertThatThrownBy(() -> provider.fetch())
                .isInstanceOfSatisfying(BusinessException.class, exception ->
                    assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.UPSTREAM_UNAVAILABLE));
        }
    }

    private void enableQuoteUpstream() {
        features.setEnabled(true);
        features.setQuoteEnabled(true);
        features.setUpstreamRequestsEnabled(true);
        features.afterPropertiesSet();
    }

    private ByteArrayInputStream stream(String payload) {
        return new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8));
    }

    private String validPayload() {
        return """
            {
              "id": 1,
              "uuid": "550e8400-e29b-41d4-a716-446655440000",
              "hitokoto": "愿你眼里有光，心中有海。",
              "type": "i",
              "from": "测试作品",
              "from_who": "测试作者",
              "creator": "tester",
              "creator_uid": 1,
              "reviewer": 2,
              "commit_from": "web",
              "created_at": "1787880000",
              "length": 14
            }
            """;
    }
}
