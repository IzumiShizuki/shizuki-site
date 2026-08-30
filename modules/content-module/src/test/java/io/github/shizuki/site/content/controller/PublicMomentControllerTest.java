package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.response.PublicMomentDetailResponse;
import io.github.shizuki.site.content.response.PublicMomentResponse;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import java.time.Instant;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class PublicMomentControllerTest {

    @Mock
    private PublicMomentQueryService queryService;

    @Test
    void publicFeedIsShareCacheable() {
        when(queryService.feed(null, 10)).thenReturn(CursorPageResponse.of(List.of(), null, false));

        var response = controller().feed(null, 10);

        assertThat(response.getHeaders().getCacheControl()).contains("public").contains("max-age=45");
    }

    @Test
    void unlistedDetailIsPrivateNoStoreAndNoindex() {
        PublicMomentResponse moment = new PublicMomentResponse(
            "mom_opaque",
            "正文",
            false,
            false,
            Instant.parse("2026-08-28T00:00:00Z"),
            List.of()
        );
        when(queryService.detail("mom_opaque"))
            .thenReturn(new PublicMomentDetailResponse(moment, true, true));

        var response = controller().detail("mom_opaque");

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("private, no-store, max-age=0");
        assertThat(response.getHeaders().getFirst("X-Robots-Tag")).contains("noindex");
    }

    @Test
    void publicDetailDoesNotCarryNoindexHeader() {
        PublicMomentResponse moment = new PublicMomentResponse(
            "mom_opaque",
            "正文",
            false,
            false,
            Instant.parse("2026-08-28T00:00:00Z"),
            List.of()
        );
        when(queryService.detail("mom_opaque"))
            .thenReturn(new PublicMomentDetailResponse(moment, false, false));

        var response = controller().detail("mom_opaque");

        assertThat(response.getHeaders().getCacheControl()).contains("public");
        assertThat(response.getHeaders().getFirst("X-Robots-Tag")).isNull();
    }

    @Test
    void privateAndMissingMomentHaveTheSameHttpNotFoundShape() throws Exception {
        when(queryService.detail("mom_private"))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found"));
        when(queryService.detail("mom_missing"))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found"));
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller())
            .setControllerAdvice(new GlobalExceptionHandler())
            .build();

        for (String publicId : List.of("mom_private", "mom_missing")) {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/moments/{public_id}", publicId))
                .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.detail").value("Moment was not found"));
        }
    }

    private PublicMomentController controller() {
        return new PublicMomentController(queryService);
    }
}
