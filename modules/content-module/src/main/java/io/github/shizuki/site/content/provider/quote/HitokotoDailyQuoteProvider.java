package io.github.shizuki.site.content.provider.quote;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.BoundedProviderJsonParser;
import io.github.shizuki.site.content.provider.ExternalWidgetProviderPolicies;
import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.ProviderHttpPolicy;
import io.github.shizuki.site.content.provider.ProviderHttpTransport;
import io.github.shizuki.site.content.provider.StrictProviderJson;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.util.Set;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** Strict adapter for the official Hitokoto JSON endpoint. */
@Component
public class HitokotoDailyQuoteProvider implements DailyQuoteProvider {

    static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Hitokoto",
        URI.create("https://hitokoto.cn")
    );

    private static final ProviderHttpPolicy POLICY = ExternalWidgetProviderPolicies.HITOKOTO;
    private static final URI ENDPOINT = URI.create("https://v1.hitokoto.cn/?encode=json");
    private static final Set<String> REQUIRED_FIELDS = Set.of("uuid", "hitokoto", "type", "from");
    private static final Set<String> OPTIONAL_FIELDS = Set.of(
        "id", "from_who", "creator", "creator_uid", "reviewer", "commit_from", "created_at", "length"
    );
    private static final Pattern UUID_PATTERN = Pattern.compile("[A-Za-z0-9-]{1,128}");
    private static final Set<String> ALLOWED_TYPES = Set.of(
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"
    );

    private final ProviderHttpTransport transport;
    private final BoundedProviderJsonParser parser;
    private final ExternalWidgetFeatureProperties featureProperties;
    private final Clock clock;

    @Autowired
    public HitokotoDailyQuoteProvider(
        ProviderHttpTransport transport,
        BoundedProviderJsonParser parser,
        ExternalWidgetFeatureProperties featureProperties
    ) {
        this(transport, parser, featureProperties, Clock.systemUTC());
    }

    HitokotoDailyQuoteProvider(
        ProviderHttpTransport transport,
        BoundedProviderJsonParser parser,
        ExternalWidgetFeatureProperties featureProperties,
        Clock clock
    ) {
        this.transport = transport;
        this.parser = parser;
        this.featureProperties = featureProperties;
        this.clock = clock;
    }

    @Override
    public String providerCode() {
        return POLICY.providerCode();
    }

    @Override
    public ProviderAttribution attribution() {
        return ATTRIBUTION;
    }

    @Override
    public NormalizedDailyQuote fetch() {
        if (!featureProperties.canContactQuoteUpstream()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "Hitokoto upstream requests are disabled");
        }
        try (InputStream response = transport.get(POLICY.requireAllowedEndpoint(ENDPOINT), POLICY)) {
            return parser.parse(response, POLICY, this::normalize);
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException | RuntimeException exception) {
            throw unavailable();
        }
    }

    private NormalizedDailyQuote normalize(JsonNode root) {
        StrictProviderJson.requireExactFields(root, REQUIRED_FIELDS, OPTIONAL_FIELDS);
        String uuid = StrictProviderJson.requiredText(root, "uuid", 128);
        String text = StrictProviderJson.requiredText(root, "hitokoto", 1000);
        String type = StrictProviderJson.requiredText(root, "type", 8);
        String sourceTitle = StrictProviderJson.requiredText(root, "from", 256);
        if (!UUID_PATTERN.matcher(uuid).matches() || !ALLOWED_TYPES.contains(type)) {
            throw unavailable();
        }
        String author = optionalText(root, "from_who", 256);
        Instant fetchedAt = clock.instant();
        return new NormalizedDailyQuote(
            providerCode(),
            uuid,
            text,
            type,
            author,
            sourceTitle,
            URI.create("https://hitokoto.cn/sentences/" + uuid),
            fetchedAt,
            ATTRIBUTION
        );
    }

    private String optionalText(JsonNode root, String field, int maxLength) {
        JsonNode value = root.get(field);
        if (value == null || value.isNull()) {
            return null;
        }
        if (!value.isTextual()) {
            throw unavailable();
        }
        String text = value.textValue().trim();
        if (text.isEmpty()) {
            return null;
        }
        if (text.length() > maxLength) {
            throw unavailable();
        }
        return text;
    }

    private BusinessException unavailable() {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Hitokoto response is unavailable or invalid");
    }
}
