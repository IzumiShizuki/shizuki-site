package io.github.shizuki.site.contract;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.life.model.WidgetFreshnessEnum;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class PersonalExperienceEnumJsonTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void serializesStableUppercaseContractValues() throws Exception {
        Map<String, Object> contract = new LinkedHashMap<>();
        contract.put("lifecycle", LifeContentLifecycleEnum.PUBLISHED);
        contract.put("visibility", LifeContentVisibilityEnum.UNLISTED);
        contract.put("variant", ImageVariantTypeEnum.FULL_SANITIZED);
        contract.put("derivativeStatus", ImageDerivativeStatusEnum.PROCESSING);
        contract.put("freshness", WidgetFreshnessEnum.STALE);
        contract.put("downloadMode", PhotoDownloadModeEnum.SANITIZED);
        contract.put("errorCode", ErrorCode.MEDIA_NOT_READY);

        assertThat(objectMapper.writeValueAsString(contract)).isEqualTo(
            "{\"lifecycle\":\"PUBLISHED\",\"visibility\":\"UNLISTED\","
                + "\"variant\":\"FULL_SANITIZED\",\"derivativeStatus\":\"PROCESSING\","
                + "\"freshness\":\"STALE\",\"downloadMode\":\"SANITIZED\","
                + "\"errorCode\":\"MEDIA_NOT_READY\"}"
        );
    }

    @Test
    void readsContractEnumsCaseInsensitivelyWithoutChangingCanonicalOutput() throws Exception {
        assertThat(objectMapper.readValue("\"draft\"", LifeContentLifecycleEnum.class))
            .isEqualTo(LifeContentLifecycleEnum.DRAFT);
        assertThat(objectMapper.readValue("\"public\"", LifeContentVisibilityEnum.class))
            .isEqualTo(LifeContentVisibilityEnum.PUBLIC);
        assertThat(objectMapper.readValue("\"thumb_webp\"", ImageVariantTypeEnum.class))
            .isEqualTo(ImageVariantTypeEnum.THUMB_WEBP);
        assertThat(objectMapper.readValue("\"ready\"", ImageDerivativeStatusEnum.class))
            .isEqualTo(ImageDerivativeStatusEnum.READY);
        assertThat(objectMapper.readValue("\"unavailable\"", WidgetFreshnessEnum.class))
            .isEqualTo(WidgetFreshnessEnum.UNAVAILABLE);
        assertThat(objectMapper.readValue("\"original\"", PhotoDownloadModeEnum.class))
            .isEqualTo(PhotoDownloadModeEnum.ORIGINAL);
    }

    @Test
    void keepsThePublishedEnumSetsExplicit() {
        assertThat(names(LifeContentLifecycleEnum.values()))
            .containsExactly("DRAFT", "PUBLISHED", "ARCHIVED", "RECYCLED");
        assertThat(names(LifeContentVisibilityEnum.values()))
            .containsExactly("PUBLIC", "UNLISTED", "PRIVATE");
        assertThat(names(ImageVariantTypeEnum.values()))
            .containsExactly("THUMB_WEBP", "DISPLAY_WEBP", "DISPLAY_AVIF", "FULL_SANITIZED");
        assertThat(names(ImageDerivativeStatusEnum.values()))
            .containsExactly("PENDING", "PROCESSING", "READY", "REVOKING", "REVOKED", "FAILED");
        assertThat(names(WidgetFreshnessEnum.values()))
            .containsExactly("FRESH", "STALE", "UNAVAILABLE");
        assertThat(names(PhotoDownloadModeEnum.values()))
            .containsExactly("NONE", "SANITIZED", "ORIGINAL");
        assertThat(Stream.of(
            ErrorCode.INVALID_CURSOR,
            ErrorCode.FEATURE_DISABLED,
            ErrorCode.MEDIA_NOT_READY,
            ErrorCode.UPSTREAM_UNAVAILABLE
        ).map(ErrorCode::code)).containsExactly(
            "INVALID_CURSOR",
            "FEATURE_DISABLED",
            "MEDIA_NOT_READY",
            "UPSTREAM_UNAVAILABLE"
        );
    }

    private static Stream<String> names(Enum<?>[] values) {
        return Stream.of(values).map(Enum::name);
    }
}
