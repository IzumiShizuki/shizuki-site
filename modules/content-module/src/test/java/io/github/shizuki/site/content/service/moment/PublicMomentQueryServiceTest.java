package io.github.shizuki.site.content.service.moment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.mapper.PublicMomentMapper;
import io.github.shizuki.site.content.mapper.PublicMomentPhotoReadRow;
import io.github.shizuki.site.content.mapper.PublicMomentReadRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentCursorCodec;
import io.github.shizuki.site.content.model.PublicContentType;
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
import org.springframework.beans.factory.ObjectProvider;

@ExtendWith(MockitoExtension.class)
class PublicMomentQueryServiceTest {

    @Mock
    private PublicMomentMapper mapper;
    @Mock
    private ObjectProvider<PublicMediaPresentationPort> portProvider;
    @Mock
    private PublicMediaPresentationPort mediaPort;

    private PersonalContentFeatureProperties features;
    private PublicContentCursorCodec cursorCodec;
    private PublicMomentQueryService service;

    @BeforeEach
    void setUp() {
        features = new PersonalContentFeatureProperties();
        features.setEnabled(true);
        features.setPublicApiEnabled(true);
        features.setDefaultPageSize(2);
        features.setMaxPageSize(20);
        features.afterPropertiesSet();
        cursorCodec = new PublicContentCursorCodec(new byte[32]);
        service = new PublicMomentQueryService(
            mapper,
            cursorCodec,
            features,
            portProvider,
            Clock.system(ZoneOffset.UTC)
        );
    }

    @Test
    void feedUsesStableOpaqueCursorAndOnlyAuthorizedSiteMediaRoutes() {
        PublicMomentReadRow first = row(30L, LocalDateTime.of(2026, 8, 28, 3, 0), "PUBLIC");
        PublicMomentReadRow second = row(20L, LocalDateTime.of(2026, 8, 27, 3, 0), "PUBLIC");
        PublicMomentReadRow lookahead = row(10L, LocalDateTime.of(2026, 8, 26, 3, 0), "PUBLIC");
        when(mapper.selectPublicFeed(null, null, null, 3)).thenReturn(List.of(first, second, lookahead));

        String mediaRef = validMediaRef();
        PublicMomentPhotoReadRow photo = photo(second.getId(), mediaRef);
        when(mapper.selectPhotos(List.of(first.getId(), second.getId()))).thenReturn(List.of(photo));
        when(portProvider.getIfAvailable()).thenReturn(mediaPort);
        when(mediaPort.resolvePublicPresentation(mediaRef)).thenReturn(Optional.of(
            new PublicMediaPresentationResponse(mediaRef, "夜空", List.of(
                new PublicMediaVariantRouteResponse(
                    ImageVariantTypeEnum.DISPLAY_WEBP,
                    "/api/v1/media/" + mediaRef + "/variants/DISPLAY_WEBP",
                    1200,
                    800,
                    "webp"
                )
            ))
        ));

        var page = service.feed(null, null);

        assertThat(page.items()).hasSize(2);
        assertThat(page.hasMore()).isTrue();
        assertThat(page.nextCursor()).startsWith("pc1.");
        var decoded = cursorCodec.decode(PublicContentType.MOMENT, page.nextCursor());
        assertThat(decoded.stableSortKey()).isEqualTo(second.getId());
        assertThat(page.items().get(1).photos()).singleElement().satisfies(item -> {
            assertThat(item.variants()).singleElement().satisfies(variant ->
                assertThat(variant.path()).startsWith("/api/v1/media/med_").doesNotContain("http")
            );
            assertThat(item.protectedVariants()).isEmpty();
        });
    }

    @Test
    void unlistedDetailUsesProtectedCapabilityPresentationAndNoPublicVariants() {
        PublicMomentReadRow unlisted = row(4L, LocalDateTime.of(2026, 8, 28, 4, 0), "UNLISTED");
        when(mapper.selectDirectDetail(unlisted.getPublicId())).thenReturn(unlisted);
        String mediaRef = validMediaRef();
        when(mapper.selectPhotos(List.of(4L))).thenReturn(List.of(photo(4L, mediaRef)));
        when(portProvider.getIfAvailable()).thenReturn(mediaPort);
        when(mediaPort.resolveUnlistedPresentation(mediaRef)).thenReturn(Optional.of(
            new ProtectedMediaPresentationResponse(mediaRef, "窗边", List.of(
                new ProtectedMediaVariantRouteResponse(
                    ImageVariantTypeEnum.DISPLAY_WEBP,
                    "/api/v1/media/" + mediaRef + "/variants/DISPLAY_WEBP",
                    900,
                    600,
                    "webp",
                    "short-lived-capability"
                )
            ))
        ));

        var detail = service.detail(unlisted.getPublicId());

        assertThat(detail.unlisted()).isTrue();
        assertThat(detail.noindex()).isTrue();
        assertThat(detail.moment().photos()).singleElement().satisfies(item -> {
            assertThat(item.variants()).isEmpty();
            assertThat(item.protectedVariants()).singleElement().satisfies(variant -> {
                assertThat(variant.path()).doesNotContain("?").doesNotContain("http");
                assertThat(variant.capability()).isEqualTo("short-lived-capability");
            });
        });
    }

    @Test
    void detailDoesNotExposeLocationOrGpsWhenPublishedLocationLabelIsAbsent() {
        PublicMomentReadRow moment = row(5L, LocalDateTime.of(2026, 8, 28, 5, 0), "PUBLIC");
        when(mapper.selectDirectDetail(moment.getPublicId())).thenReturn(moment);
        String mediaRef = validMediaRef();
        PublicMomentPhotoReadRow photo = photo(5L, mediaRef);
        photo.setPublishedLocationLabel(null);
        when(mapper.selectPhotos(List.of(5L))).thenReturn(List.of(photo));
        when(portProvider.getIfAvailable()).thenReturn(mediaPort);
        when(mediaPort.resolvePublicPresentation(mediaRef)).thenReturn(Optional.of(
            new PublicMediaPresentationResponse(mediaRef, "夜空", List.of(
                new PublicMediaVariantRouteResponse(
                    ImageVariantTypeEnum.DISPLAY_WEBP,
                    "/api/v1/media/" + mediaRef + "/variants/DISPLAY_WEBP",
                    1200,
                    800,
                    "webp"
                )
            ))
        ));

        var publicPhoto = service.detail(moment.getPublicId()).moment().photos().get(0);

        assertThat(publicPhoto.publishedLocationLabel()).isNull();
        assertThat(publicPhoto.getClass().getRecordComponents())
            .extracting(component -> component.getName().toLowerCase())
            .doesNotContain("latitude", "longitude", "gps", "coordinates");
    }

    @Test
    void privateAndMissingDetailsHaveTheSameNotFoundShape() {
        String privateId = validPublicId();
        when(mapper.selectDirectDetail(privateId)).thenReturn(null);

        assertThatThrownBy(() -> service.detail(privateId))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND);
                assertThat(exception.getMessage()).isEqualTo("Moment was not found");
            });
        assertThatThrownBy(() -> service.detail("not-a-moment-id"))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND));
    }

    @Test
    void emptyFeedIsHonestAndDoesNotRequestPlaceholderMedia() {
        when(mapper.selectPublicFeed(null, null, null, 3)).thenReturn(List.of());

        var page = service.feed(null, null);

        assertThat(page.items()).isEmpty();
        assertThat(page.hasMore()).isFalse();
        assertThat(page.nextCursor()).isNull();
        verify(mapper, never()).selectPhotos(anyList());
        verify(portProvider, never()).getIfAvailable();
    }

    @Test
    void featureFlagFailsClosedBeforeDatabaseAccess() {
        features.setPublicApiEnabled(false);

        assertThatThrownBy(() -> service.feed(null, null))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FEATURE_DISABLED));
        verify(mapper, never()).selectPublicFeed(null, null, null, 3);
    }

    private PublicMomentReadRow row(long id, LocalDateTime publishedAt, String visibility) {
        PublicMomentReadRow row = new PublicMomentReadRow();
        row.setId(id);
        row.setPublicId(validPublicId());
        row.setBody("完整正文 " + id);
        row.setVisibilityStatus(visibility);
        row.setPublishedAt(publishedAt);
        row.setFeatured(true);
        row.setPinned(false);
        return row;
    }

    private PublicMomentPhotoReadRow photo(long momentId, String mediaRef) {
        PublicMomentPhotoReadRow row = new PublicMomentPhotoReadRow();
        row.setMomentId(momentId);
        row.setMediaRef(mediaRef);
        row.setPublishedLocationLabel("上海");
        row.setSortNum(0);
        return row;
    }

    private String validPublicId() {
        return new OpaquePublicIdentifierGenerator().generate(PublicContentType.MOMENT);
    }

    private String validMediaRef() {
        return OpaqueMediaReference.generate(new SecureRandom());
    }
}
