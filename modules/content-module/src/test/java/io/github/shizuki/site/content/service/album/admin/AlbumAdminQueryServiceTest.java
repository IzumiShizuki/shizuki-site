package io.github.shizuki.site.content.service.album.admin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.controller.album.AlbumAdminPreviewResponse;
import io.github.shizuki.site.content.controller.album.AlbumAdminResponse;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminPhotoReadRow;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminReadMapper;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminReadRow;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminVariantReadRow;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AlbumAdminQueryServiceTest {

    @Mock
    private AlbumAdminReadMapper mapper;

    private AlbumAdminQueryService service;

    @BeforeEach
    void setUp() {
        service = new AlbumAdminQueryService(mapper, "v1");
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void buildsProtectedPreviewWithTruthfulProcessingAndNoStorageDetails() throws Exception {
        AlbumAdminReadRow album = albumRow();
        AlbumAdminPhotoReadRow photo = photoRow();
        when(mapper.selectAlbum(17L)).thenReturn(album);
        when(mapper.selectPhotos(17L)).thenReturn(List.of(photo));
        when(mapper.selectVariants(17L, "PRIVATE_WORKING", "v1")).thenReturn(List.of(
            variant("THUMB_WEBP", "READY", 1),
            variant("DISPLAY_WEBP", "FAILED", 3),
            variant("FULL_SANITIZED", "READY", 2)
        ));

        AlbumAdminResponse detail = service.detail(17L);
        AlbumAdminPreviewResponse preview = service.preview(17L);

        assertThat(detail.audit().etag()).isEqualTo("\"v4\"");
        assertThat(detail.photos()).hasSize(1);
        assertThat(detail.photos().get(0).processing().status()).isEqualTo(ImageDerivativeStatusEnum.FAILED);
        assertThat(detail.photos().get(0).processing().readyForPublication()).isFalse();
        assertThat(detail.photos().get(0).processing().variants())
            .filteredOn(item -> item.variant() == ImageVariantTypeEnum.DISPLAY_WEBP)
            .singleElement()
            .satisfies(item -> {
                assertThat(item.retryAllowed()).isTrue();
                assertThat(item.errorCode()).isEqualTo(ErrorCode.MEDIA_NOT_READY);
                assertThat(item.etag()).isEqualTo("\"v3\"");
                assertThat(item.retryRoute())
                    .startsWith("/api/v1/admin/life/media-associations/")
                    .endsWith("/processing/DISPLAY_WEBP/retry");
            });
        assertThat(preview.photos().get(0).variants())
            .allSatisfy(item -> assertThat(item.route())
                .startsWith("/api/v1/admin/life/media-associations/")
                .doesNotStartWith("/api/v1/media/"));

        String json = new ObjectMapper().findAndRegisterModules().writeValueAsString(preview);
        assertThat(json)
            .doesNotContainIgnoringCase("bucket")
            .doesNotContainIgnoringCase("objectKey")
            .doesNotContainIgnoringCase("signature")
            .doesNotContainIgnoringCase("capability")
            .doesNotContain("/api/v1/media/");
    }

    @Test
    void rejectsManagementReadWithoutBothAdminGroupAndPermission() {
        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("life.content.manage")));

        assertThatThrownBy(() -> service.detail(17L))
            .isInstanceOfSatisfying(BusinessException.class,
                exception -> assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
    }

    @Test
    void publicDraftUsesPublicReadinessButPrivateWorkingPreviewRoutes() {
        AlbumAdminReadRow album = albumRow();
        album.setVisibilityStatus("PUBLIC");
        when(mapper.selectAlbum(17L)).thenReturn(album);
        when(mapper.selectPhotos(17L)).thenReturn(List.of(photoRow()));
        when(mapper.selectVariants(17L, "PUBLIC_MATERIALIZED", "v1")).thenReturn(List.of(
            variant("DISPLAY_WEBP", "FAILED", 3)
        ));
        when(mapper.selectVariants(17L, "PRIVATE_WORKING", "v1")).thenReturn(List.of(
            variant("DISPLAY_WEBP", "READY", 7)
        ));

        AlbumAdminResponse detail = service.detail(17L);

        assertThat(detail.photos().get(0).processing().status()).isEqualTo(ImageDerivativeStatusEnum.FAILED);
        assertThat(detail.photos().get(0).previewVariants())
            .extracting(AlbumAdminResponse.AdminPreviewVariant::variant)
            .containsExactly(ImageVariantTypeEnum.DISPLAY_WEBP);
    }

    private AlbumAdminReadRow albumRow() {
        AlbumAdminReadRow row = new AlbumAdminReadRow();
        row.setId(17L);
        row.setPublicSlug("alb_safe_opaque_slug");
        row.setTitle("Private draft");
        row.setSummary("Preview only");
        row.setCoverPhotoId(23L);
        row.setLifecycleStatus("DRAFT");
        row.setVisibilityStatus("PRIVATE");
        row.setFeatured(0);
        row.setSortNum(0);
        row.setPhotoCount(1);
        row.setCreatedAt(LocalDateTime.of(2026, 8, 20, 10, 0));
        row.setUpdatedAt(LocalDateTime.of(2026, 8, 21, 10, 0));
        row.setVersion(4);
        return row;
    }

    private AlbumAdminPhotoReadRow photoRow() {
        AlbumAdminPhotoReadRow row = new AlbumAdminPhotoReadRow();
        row.setPhotoId(23L);
        row.setMediaRef("mr_AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        row.setTitle("A private photograph");
        row.setAltText("A quiet evening");
        row.setCaption("draft caption");
        row.setPhotoProcessingStatus("READY");
        row.setSortNum(0);
        row.setDownloadMode("NONE");
        row.setAssociationVersion(2);
        return row;
    }

    private AlbumAdminVariantReadRow variant(String code, String status, int version) {
        AlbumAdminVariantReadRow row = new AlbumAdminVariantReadRow();
        row.setPhotoId(23L);
        row.setVariantCode(code);
        row.setProcessStatus(status);
        row.setWidth(1200);
        row.setHeight(800);
        row.setRetryCount(status.equals("FAILED") ? 2 : 0);
        row.setVersion(version);
        return row;
    }
}
