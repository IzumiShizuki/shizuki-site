package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.controller.AdminMediaDerivativeRetryResponse;
import io.github.shizuki.site.media.mapper.admin.AdminMediaDerivativeRetryMapper;
import io.github.shizuki.site.media.mapper.admin.AdminMediaDerivativeRetryRow;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.content.port.PublicContentCacheInvalidationPort;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminMediaDerivativeRetryServiceTest {

    private static final String MEDIA_REF = "med_AAAAAAAAAAAAAAAAAAAAAAAAAAA";

    @Mock
    private AdminMediaDerivativeRetryMapper mapper;

    @Mock
    private PublicContentCacheInvalidationPort cacheInvalidationPort;

    private AdminMediaDerivativeRetryService service;

    @BeforeEach
    void setUp() {
        MediaDerivativeFeatureProperties properties = new MediaDerivativeFeatureProperties();
        properties.setProcessorVersion("v1");
        service = new AdminMediaDerivativeRetryService(mapper, properties, cacheInvalidationPort);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void retriesOnlyFailedVariantWithStrongEtagAndResetsPhotoProcessing() {
        AdminMediaDerivativeRetryRow row = row("FAILED", 5);
        when(mapper.selectRetryTarget(MEDIA_REF, "DISPLAY_WEBP", "v1")).thenReturn(row);
        when(mapper.retryFailed(31L, 5)).thenReturn(1);
        when(mapper.markPhotoProcessing(23L)).thenReturn(1);

        AdminMediaDerivativeRetryResponse response = service.retry(
            MEDIA_REF,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "\"v5\""
        );

        assertThat(response.status()).isEqualTo(ImageDerivativeStatusEnum.PENDING);
        assertThat(response.version()).isEqualTo(6);
        assertThat(response.etag()).isEqualTo("\"v6\"");
        verify(mapper).retryFailed(31L, 5);
        verify(mapper).markPhotoProcessing(23L);
        verify(cacheInvalidationPort).invalidateByPhotoId(23L);
    }

    @Test
    void refusesReadyVariantInsteadOfCreatingDuplicateWork() {
        when(mapper.selectRetryTarget(MEDIA_REF, "DISPLAY_WEBP", "v1")).thenReturn(row("READY", 5));

        assertThatThrownBy(() -> service.retry(
            MEDIA_REF,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "\"v5\""
        )).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
            assertThat(exception.getDetails()).containsEntry("currentStatus", "READY");
        });

        verify(mapper, never()).retryFailed(31L, 5);
    }

    @Test
    void rejectsCallerWithoutAdminBoundary() {
        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("life.content.manage")));

        assertThatThrownBy(() -> service.retry(
            MEDIA_REF,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "\"v5\""
        )).isInstanceOfSatisfying(BusinessException.class,
            exception -> assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
    }

    private AdminMediaDerivativeRetryRow row(String status, int version) {
        AdminMediaDerivativeRetryRow row = new AdminMediaDerivativeRetryRow();
        row.setVariantId(31L);
        row.setPhotoId(23L);
        row.setMediaRef(MEDIA_REF);
        row.setVariantCode("DISPLAY_WEBP");
        row.setProcessStatus(status);
        row.setVersion(version);
        return row;
    }
}
