package io.github.shizuki.site.content.service.discovery;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.controller.album.PublicAlbumDetailResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumMediaResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumMediaVariantResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumPhotoResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumSummaryResponse;
import io.github.shizuki.site.content.response.PublicMomentResponse;
import io.github.shizuki.site.content.response.PublicMomentDetailResponse;
import io.github.shizuki.site.content.response.PublicMomentPhotoResponse;
import io.github.shizuki.site.media.response.PublicMediaVariantRouteResponse;
import io.github.shizuki.site.content.response.PublicPostDocument;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.service.album.PublicAlbumQueryService;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PublicContentDiscoveryServiceTest {
    @Mock private ContentService content;
    @Mock private PublicAlbumQueryService albums;
    @Mock private PublicMomentQueryService moments;
    private PersonalContentFeatureProperties features;
    private PublicContentDiscoveryService service;

    @BeforeEach
    void setup() {
        features = new PersonalContentFeatureProperties();
        service = new PublicContentDiscoveryService(content, albums, moments, features);
    }

    @Test
    void disabledLifeContentDoesNotQueryOrRevealItsCatalog() {
        when(content.listDiscoverablePosts()).thenReturn(List.of());
        assertThat(service.catalog()).isEmpty();
        verifyNoInteractions(albums, moments);
    }

    @Test
    void catalogTraversesEveryVisitorPageAndRetainsTypeSpecificUrls() {
        features.setEnabled(true);
        features.setPublicApiEnabled(true);
        var now = Instant.parse("2026-10-17T00:00:00Z");
        when(content.listDiscoverablePosts()).thenReturn(List.of(new PublicPostDocument(42L, "文章", "摘要", null,
            "life", LocalDateTime.of(2026, 10, 17, 8, 0), "")));
        when(albums.list(null, 50)).thenReturn(CursorPageResponse.of(
            List.of(new PublicAlbumSummaryResponse("a_first", "第一册", "", now, 1, null)), "next", true));
        when(albums.list("next", 50)).thenReturn(CursorPageResponse.of(
            List.of(new PublicAlbumSummaryResponse("a_second", "第二册", "", now, 1, null)), null, false));
        when(moments.feed(null, 50)).thenReturn(CursorPageResponse.of(
            List.of(new PublicMomentResponse("m_safe", "日常", false, false, now, List.of())), null, false));

        assertThat(service.catalog()).extracting(PublicDiscoveryLink::path)
            .containsExactly("/read/posts/42", "/read/albums/a_first", "/read/albums/a_second", "/read/moments/m_safe");
    }

    @Test
    void linkOnlyAlbumNeverEmbedsMediaCapabilityInPageOrImageMetadata() {
        var media = new PublicAlbumMediaResponse("med_ref", "照片", List.of(new PublicAlbumMediaVariantResponse(
            ImageVariantTypeEnum.DISPLAY_WEBP, "/api/v1/media/med_safe/display.webp", 100, 100, "webp", "private-capability")));
        when(albums.detail("a_link")).thenReturn(new PublicAlbumDetailResponse("a_link", "链接相册", "摘要",
            LifeContentVisibilityEnum.UNLISTED, Instant.parse("2026-10-17T00:00:00Z"), true, false, false, false,
            List.of(new PublicAlbumPhotoResponse("照片", "照片描述", "说明", null, media))));

        var page = service.album("a_link");

        assertThat(page.noIndex()).isTrue();
        assertThat(page.image()).isNull();
        assertThat(page.bodyHtml()).contains("站内相册").doesNotContain("private-capability", "med_safe", "<img");
    }

    @Test
    void publicAlbumPrefersDisplayCoverAndExcludesCapabilityAndQueryRoutes() {
        String base = "/api/v1/media/med_" + "A".repeat(27) + "/variants/";
        var media = new PublicAlbumMediaResponse("med_public", "照片", List.of(
            new PublicAlbumMediaVariantResponse(ImageVariantTypeEnum.THUMB_WEBP, base + "THUMB_WEBP", 320, 240, "webp", null),
            new PublicAlbumMediaVariantResponse(ImageVariantTypeEnum.DISPLAY_WEBP, base + "DISPLAY_WEBP?capability=hidden", 1200, 900, "webp", null),
            new PublicAlbumMediaVariantResponse(ImageVariantTypeEnum.DISPLAY_WEBP, base + "DISPLAY_WEBP", 1200, 900, "webp", "secret"),
            new PublicAlbumMediaVariantResponse(ImageVariantTypeEnum.DISPLAY_AVIF, base + "DISPLAY_AVIF", 1200, 900, "avif", null),
            new PublicAlbumMediaVariantResponse(ImageVariantTypeEnum.DISPLAY_WEBP, base + "DISPLAY_WEBP", 1200, 900, "webp", null)));
        when(albums.detail("a_public")).thenReturn(new PublicAlbumDetailResponse("a_public", "公开相册", "摘要",
            LifeContentVisibilityEnum.PUBLIC, Instant.parse("2026-10-17T00:00:00Z"), false, true, true, false,
            List.of(new PublicAlbumPhotoResponse("照片", "照片描述", "说明", null, media))));

        var page = service.album("a_public");

        assertThat(page.image()).isEqualTo(base + "DISPLAY_WEBP");
        assertThat(page.bodyHtml()).contains(base + "DISPLAY_WEBP").doesNotContain("THUMB_WEBP", "hidden", "secret", "DISPLAY_AVIF");
    }

    @Test
    void momentPrefersDisplayAndUsesThumbnailWhenItIsTheOnlyPublicVariant() {
        String base = "/api/v1/media/med_" + "B".repeat(27) + "/variants/";
        var thumb = new PublicMediaVariantRouteResponse(ImageVariantTypeEnum.THUMB_WEBP, base + "THUMB_WEBP", 320, 240, "webp");
        var display = new PublicMediaVariantRouteResponse(ImageVariantTypeEnum.DISPLAY_WEBP, base + "DISPLAY_WEBP", 1200, 900, "webp");
        var now = Instant.parse("2026-10-17T00:00:00Z");
        var full = new PublicMomentResponse("m_public", "动态", false, false, now,
            List.of(new PublicMomentPhotoResponse("med_public", "照片", null, List.of(thumb, display), List.of())));
        var fallback = new PublicMomentResponse("m_thumb", "动态", false, false, now,
            List.of(new PublicMomentPhotoResponse("med_public", "照片", null, List.of(thumb), List.of())));
        when(moments.detail("m_public")).thenReturn(new PublicMomentDetailResponse(full, false, false));
        when(moments.detail("m_thumb")).thenReturn(new PublicMomentDetailResponse(fallback, false, false));

        assertThat(service.moment("m_public").image()).isEqualTo(base + "DISPLAY_WEBP");
        assertThat(service.moment("m_thumb").image()).isEqualTo(base + "THUMB_WEBP");
    }
}
