package io.github.shizuki.site.content.service.album;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumPhotoReadRow;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumReadMapper;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumReadRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentCursorCodec;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.port.PublicMediaPresentationPort;
import io.github.shizuki.site.media.response.ProtectedMediaPresentationResponse;
import io.github.shizuki.site.media.response.ProtectedMediaVariantRouteResponse;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import io.github.shizuki.site.media.response.PublicMediaVariantRouteResponse;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PublicAlbumQueryServiceTest {

    @Mock
    private PublicAlbumReadMapper mapper;
    @Mock
    private PublicMediaPresentationPort mediaPort;

    private PersonalContentFeatureProperties features;
    private PublicContentCursorCodec cursorCodec;
    private PublicAlbumQueryService service;

    @BeforeEach
    void setUp() {
        features = new PersonalContentFeatureProperties();
        features.setEnabled(true);
        features.setPublicApiEnabled(true);
        features.setDefaultPageSize(2);
        features.setMaxPageSize(20);
        features.afterPropertiesSet();
        cursorCodec = new PublicContentCursorCodec(new byte[32]);
        service = new PublicAlbumQueryService(
            mapper,
            cursorCodec,
            features,
            mediaPort,
            "v1",
            Clock.system(ZoneOffset.UTC)
        );
    }

    @Test
    void listUsesOpaqueCursorAndOnlyPublicAuthorizedCoverRoutes() {
        PublicAlbumReadRow first = album(30L, "PUBLIC", LocalDateTime.of(2026, 8, 28, 3, 0));
        PublicAlbumReadRow second = album(20L, "PUBLIC", LocalDateTime.of(2026, 8, 27, 3, 0));
        PublicAlbumReadRow lookahead = album(10L, "PUBLIC", LocalDateTime.of(2026, 8, 26, 3, 0));
        when(mapper.selectPublicPage(null, null, null, 3, "v1"))
            .thenReturn(List.of(first, second, lookahead));
        when(mediaPort.resolvePublicPresentation(anyString())).thenAnswer(invocation -> Optional.of(
            publicPresentation(invocation.getArgument(0))
        ));

        var page = service.list(null, null);

        assertThat(page.items()).hasSize(2);
        assertThat(page.hasMore()).isTrue();
        assertThat(page.nextCursor()).startsWith("pc1.");
        assertThat(cursorCodec.decode(PublicContentType.ALBUM, page.nextCursor()).stableSortKey())
            .isEqualTo(20L);
        assertThat(page.items().get(0).cover().variants()).singleElement().satisfies(variant -> {
            assertThat(variant.path()).startsWith("/api/v1/media/med_").doesNotContain("http");
            assertThat(variant.capability()).isNull();
        });
    }

    @Test
    void unlistedDetailIsLinkOnlyAndCarriesProtectedMediaCapability() {
        PublicAlbumReadRow album = album(4L, "UNLISTED", LocalDateTime.of(2026, 8, 28, 4, 0));
        when(mapper.selectVisitorDetail(album.getPublicSlug(), "v1")).thenReturn(album);
        PublicAlbumPhotoReadRow photo = new PublicAlbumPhotoReadRow();
        photo.setMediaRef(album.getCoverMediaRef());
        photo.setTitle("窗边");
        photo.setAltText("窗边的雨");
        photo.setCaption("八月");
        when(mapper.selectVisitorPhotos(4L)).thenReturn(List.of(photo));
        when(mediaPort.resolveUnlistedPresentation(album.getCoverMediaRef())).thenReturn(Optional.of(
            protectedPresentation(album.getCoverMediaRef())
        ));

        var detail = service.detail(album.getPublicSlug());

        assertThat(detail.visibility()).isEqualTo(LifeContentVisibilityEnum.UNLISTED);
        assertThat(detail.noIndex()).isTrue();
        assertThat(detail.searchEligible()).isFalse();
        assertThat(detail.feedEligible()).isFalse();
        assertThat(detail.sitemapEligible()).isFalse();
        assertThat(detail.photos()).singleElement().satisfies(item ->
            assertThat(item.media().variants()).singleElement().satisfies(variant -> {
                assertThat(variant.path()).doesNotContain("?").doesNotContain("http");
                assertThat(variant.capability()).isEqualTo("short-lived-capability");
            })
        );
    }

    @Test
    void detailDoesNotExposeLocationOrGpsWhenPublishedLocationLabelIsAbsent() {
        PublicAlbumReadRow album = album(5L, "PUBLIC", LocalDateTime.of(2026, 8, 28, 5, 0));
        when(mapper.selectVisitorDetail(album.getPublicSlug(), "v1")).thenReturn(album);
        PublicAlbumPhotoReadRow photo = new PublicAlbumPhotoReadRow();
        photo.setMediaRef(album.getCoverMediaRef());
        photo.setPublishedLocationLabel(null);
        when(mapper.selectVisitorPhotos(5L)).thenReturn(List.of(photo));
        when(mediaPort.resolvePublicPresentation(album.getCoverMediaRef())).thenReturn(Optional.of(
            publicPresentation(album.getCoverMediaRef())
        ));

        var publicPhoto = service.detail(album.getPublicSlug()).photos().get(0);

        assertThat(publicPhoto.locationLabel()).isNull();
        assertThat(publicPhoto.getClass().getRecordComponents())
            .extracting(component -> component.getName().toLowerCase())
            .doesNotContain("latitude", "longitude", "gps", "coordinates");
    }

    @Test
    void privateAndMissingAlbumAreIndistinguishableNotFound() {
        String slug = validAlbumId();
        when(mapper.selectVisitorDetail(slug, "v1")).thenReturn(null);

        assertThatThrownBy(() -> service.detail(slug))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND);
                assertThat(exception.getMessage()).isEqualTo("Album was not found");
            });
        assertThatThrownBy(() -> service.detail("invalid"))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND));
    }

    @Test
    void emptyDatabaseReturnsAnIntentionalEmptyPage() {
        when(mapper.selectPublicPage(null, null, null, 3, "v1")).thenReturn(List.of());

        var page = service.list(null, null);

        assertThat(page.items()).isEmpty();
        assertThat(page.hasMore()).isFalse();
        assertThat(page.nextCursor()).isNull();
    }

    private PublicAlbumReadRow album(long id, String visibility, LocalDateTime publishedAt) {
        PublicAlbumReadRow row = new PublicAlbumReadRow();
        row.setId(id);
        row.setPublicSlug(validAlbumId());
        row.setTitle("相册 " + id);
        row.setSummary("摘要");
        row.setVisibilityStatus(visibility);
        row.setPhotoCount(1);
        row.setPublishTime(publishedAt);
        row.setCoverMediaRef(validMediaRef());
        return row;
    }

    private PublicMediaPresentationResponse publicPresentation(String mediaRef) {
        return new PublicMediaPresentationResponse(mediaRef, "封面", List.of(
            new PublicMediaVariantRouteResponse(
                ImageVariantTypeEnum.DISPLAY_WEBP,
                "/api/v1/media/" + mediaRef + "/variants/DISPLAY_WEBP",
                1200,
                800,
                "webp"
            )
        ));
    }

    private ProtectedMediaPresentationResponse protectedPresentation(String mediaRef) {
        return new ProtectedMediaPresentationResponse(mediaRef, "窗边的雨", List.of(
            new ProtectedMediaVariantRouteResponse(
                ImageVariantTypeEnum.DISPLAY_WEBP,
                "/api/v1/media/" + mediaRef + "/variants/DISPLAY_WEBP",
                1200,
                800,
                "webp",
                "short-lived-capability"
            )
        ));
    }

    private String validAlbumId() {
        return new OpaquePublicIdentifierGenerator().generate(PublicContentType.ALBUM);
    }

    private String validMediaRef() {
        return OpaqueMediaReference.generate(new SecureRandom());
    }
}
