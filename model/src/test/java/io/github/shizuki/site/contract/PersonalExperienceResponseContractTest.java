package io.github.shizuki.site.contract;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.common.response.VisitorErrorResponse;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.response.MediaProcessingStatusResponse;
import io.github.shizuki.site.media.response.MediaVariantProcessingResponse;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PersonalExperienceResponseContractTest {

    private final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

    @Test
    void cursorPagePreservesStableQueryOrderAndExposesOnlyOpaquePaginationFields() throws Exception {
        List<String> source = new ArrayList<>(List.of("newest", "same-time-high-id", "same-time-low-id"));
        CursorPageResponse<String> response = CursorPageResponse.of(source, "eyJ2IjoxLCJrIjoib3BhcXVlIn0", true);
        source.clear();

        assertThat(response.items()).containsExactly("newest", "same-time-high-id", "same-time-low-id");
        assertThatThrownBy(() -> response.items().add("later"))
            .isInstanceOf(UnsupportedOperationException.class);

        JsonNode json = objectMapper.readTree(objectMapper.writeValueAsBytes(response));
        List<String> cursorFields = new ArrayList<>();
        json.fieldNames().forEachRemaining(cursorFields::add);
        assertThat(cursorFields).containsExactlyInAnyOrder("items", "nextCursor", "hasMore");
        assertThat(json.path("nextCursor").asText()).isEqualTo("eyJ2IjoxLCJrIjoib3BhcXVlIn0");
        assertThat(json.has("total")).isFalse();
        assertThat(json.has("pageNo")).isFalse();
    }

    @Test
    void cursorPageRejectsAmbiguousContinuationState() {
        assertThatThrownBy(() -> CursorPageResponse.of(List.of("item"), null, true))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("nextCursor");
    }

    @Test
    void optimisticVersionProducesAQuotedStrongEtag() {
        OptimisticVersionResponse response = OptimisticVersionResponse.of(17L);

        assertThat(response.version()).isEqualTo(17L);
        assertThat(response.etag()).isEqualTo("\"v17\"");
        assertThatThrownBy(() -> new OptimisticVersionResponse(17L, "\"v16\""))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void mediaStatusJsonContainsNoStorageIdentityOrUpstreamLocation() throws Exception {
        MediaProcessingStatusResponse response = new MediaProcessingStatusResponse(
            ImageDerivativeStatusEnum.READY,
            true,
            List.of(new MediaVariantProcessingResponse(
                ImageVariantTypeEnum.DISPLAY_WEBP,
                ImageDerivativeStatusEnum.READY,
                1600,
                1067,
                "WEBP",
                null
            ))
        );

        String json = objectMapper.writeValueAsString(response);
        String normalized = json.toLowerCase();

        assertThat(normalized)
            .doesNotContain("bucket")
            .doesNotContain("objectkey")
            .doesNotContain("object_key")
            .doesNotContain("assetid")
            .doesNotContain("asset_id")
            .doesNotContain("oss")
            .doesNotContain("signature")
            .doesNotContain("url");
        assertThat(objectMapper.readTree(json).path("variants").get(0).path("format").asText())
            .isEqualTo("webp");
    }

    @Test
    void visitorErrorUsesAStableMinimalShape() throws Exception {
        VisitorErrorResponse response = VisitorErrorResponse.of(
            ErrorCode.NOT_FOUND,
            "req-123",
            Instant.parse("2026-08-27T00:00:00Z")
        );

        JsonNode json = objectMapper.readTree(objectMapper.writeValueAsBytes(response));

        List<String> errorFields = new ArrayList<>();
        json.fieldNames().forEachRemaining(errorFields::add);
        assertThat(errorFields).containsExactlyInAnyOrder("code", "message", "requestId", "timestamp");
        assertThat(json.path("code").asText()).isEqualTo("NOT_FOUND");
        assertThat(json.path("message").asText()).isEqualTo(ErrorCode.NOT_FOUND.defaultMessage());
        assertThat(json.has("resourceId")).isFalse();
        assertThat(json.has("details")).isFalse();
    }
}
