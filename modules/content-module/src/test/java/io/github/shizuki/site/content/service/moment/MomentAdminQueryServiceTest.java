package io.github.shizuki.site.content.service.moment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.mapper.MomentAdminPhotoProcessingRow;
import io.github.shizuki.site.content.mapper.MomentAdminReadMapper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MomentAdminQueryServiceTest {

    @Mock
    private MomentAdminReadMapper readMapper;

    private MomentAdminQueryService service;

    @BeforeEach
    void setUp() {
        service = new MomentAdminQueryService(readMapper);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void groupsDerivativeStateWithoutReturningStorageIdentityOrRawErrors() {
        MomentEntity moment = new MomentEntity();
        moment.setId(1L);
        moment.setPublicId("mom_opaque");
        moment.setBody("正文");
        moment.setLifecycleStatus("DRAFT");
        moment.setVisibilityStatus("PRIVATE");
        moment.setVersion(3);
        when(readMapper.selectAdminDetail(1L)).thenReturn(moment);

        MomentAdminPhotoProcessingRow thumb = row("THUMB_WEBP", "READY", "APPROVED");
        MomentAdminPhotoProcessingRow display = row("DISPLAY_WEBP", "FAILED", null);
        when(readMapper.selectPhotoProcessing(1L)).thenReturn(List.of(thumb, display));

        var result = service.get(1L);

        assertThat(result.etag()).isEqualTo("\"v3\"");
        assertThat(result.photos()).singleElement().satisfies(photo -> {
            assertThat(photo.mediaRef()).isEqualTo("med_opaque");
            assertThat(photo.derivatives()).hasSize(2);
            assertThat(photo.derivatives().get(0).previewPath())
                .isEqualTo("/api/v1/admin/life/media-associations/med_opaque/preview/THUMB_WEBP");
            assertThat(photo.derivatives().get(1).failureCode()).isEqualTo("DERIVATIVE_PROCESSING_FAILED");
            assertThat(photo.derivatives().get(1).retryEligible()).isTrue();
            assertThat(photo.derivatives().get(1).etag()).isEqualTo("\"v2\"");
            assertThat(photo.derivatives().get(1).retryRoute())
                .isEqualTo("/api/v1/admin/life/media-associations/med_opaque/processing/DISPLAY_WEBP/retry");
            assertThat(photo.derivatives().get(1).previewPath()).isNull();
        });
        assertThat(Arrays.stream(result.getClass().getRecordComponents()).map(component -> component.getName()))
            .noneMatch(name -> name.contains("asset") || name.contains("bucket")
                || name.contains("object") || name.contains("signature"));
    }

    @Test
    void rejectsUsersOutsideTheAdminAndPermissionIntersection() {
        LoginUserContext.set(new LoginUser(8L, Set.of("ADMIN"), Set.of()));

        assertThatThrownBy(() -> service.get(1L))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
    }

    private MomentAdminPhotoProcessingRow row(String variant, String status, String audit) {
        MomentAdminPhotoProcessingRow row = new MomentAdminPhotoProcessingRow();
        row.setPhotoId(10L);
        row.setMediaRef("med_opaque");
        row.setSortNum(0);
        row.setPhotoStatus("READY");
        row.setVariantCode(variant);
        row.setDeliveryScope("PRIVATE_WORKING");
        row.setDerivativeStatus(status);
        row.setDerivativeVersion(2);
        row.setAssetAuditStatus(audit);
        return row;
    }
}
