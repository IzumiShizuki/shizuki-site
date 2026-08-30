package io.github.shizuki.site.content.controller.album;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import io.github.shizuki.site.content.service.album.PublicAlbumQueryService;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
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
class PublicAlbumControllerTest {

    @Mock
    private PublicAlbumQueryService queryService;

    @Test
    void emptyPublicListRemainsShareCacheable() {
        when(queryService.list(null, 10)).thenReturn(CursorPageResponse.of(List.of(), null, false));

        var response = controller().list(null, 10);

        assertThat(response.getHeaders().getCacheControl()).contains("public").contains("max-age=45");
        assertThat(response.getBody().data().items()).isEmpty();
    }

    @Test
    void unlistedDetailIsPrivateNoStoreAndNoindex() {
        PublicAlbumDetailResponse detail = new PublicAlbumDetailResponse(
            "alb_opaque",
            "相册",
            null,
            LifeContentVisibilityEnum.UNLISTED,
            Instant.parse("2026-08-28T00:00:00Z"),
            true,
            false,
            false,
            false,
            List.of()
        );
        when(queryService.detail("alb_opaque")).thenReturn(detail);

        var response = controller().detail("alb_opaque");

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("private, no-store, max-age=0");
        assertThat(response.getHeaders().getFirst("X-Robots-Tag")).contains("noindex");
    }

    @Test
    void publicDetailIsEligibleAndDoesNotCarryNoindexHeader() {
        PublicAlbumDetailResponse detail = new PublicAlbumDetailResponse(
            "alb_opaque",
            "相册",
            null,
            LifeContentVisibilityEnum.PUBLIC,
            Instant.parse("2026-08-28T00:00:00Z"),
            false,
            true,
            true,
            true,
            List.of()
        );
        when(queryService.detail("alb_opaque")).thenReturn(detail);

        var response = controller().detail("alb_opaque");

        assertThat(response.getHeaders().getCacheControl()).contains("public");
        assertThat(response.getHeaders().getFirst("X-Robots-Tag")).isNull();
    }

    @Test
    void privateAndMissingAlbumHaveTheSameHttpNotFoundShape() throws Exception {
        when(queryService.detail("alb_private"))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Album was not found"));
        when(queryService.detail("alb_missing"))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Album was not found"));
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller())
            .setControllerAdvice(new GlobalExceptionHandler())
            .build();

        for (String slug : List.of("alb_private", "alb_missing")) {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/albums/{public_slug}", slug))
                .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.detail").value("Album was not found"));
        }
    }

    private PublicAlbumController controller() {
        return new PublicAlbumController(queryService);
    }
}
