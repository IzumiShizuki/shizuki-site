package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.request.AdminMomentCreateRequest;
import io.github.shizuki.site.content.request.AdminMomentEditRequest;
import io.github.shizuki.site.content.request.AdminMomentPhotoIdsRequest;
import io.github.shizuki.site.content.response.AdminMomentPhotoOrderResponse;
import io.github.shizuki.site.content.response.AdminMomentSummaryResponse;
import io.github.shizuki.site.content.service.moment.MomentPhotoMutationResult;
import io.github.shizuki.site.content.service.moment.MomentAdminQueryService;
import io.github.shizuki.site.content.service.moment.MomentService;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminMomentControllerTest {

    @Mock
    private MomentService momentService;
    @Mock
    private MomentAdminQueryService queryService;

    @Test
    void classRequiresBothAdminGroupAndLifeContentPermission() {
        RequireGroup group = AdminMomentController.class.getAnnotation(RequireGroup.class);
        RequirePermission permission = AdminMomentController.class.getAnnotation(RequirePermission.class);

        assertThat(group).isNotNull();
        assertThat(group.value()).isEqualTo("ADMIN");
        assertThat(permission).isNotNull();
        assertThat(permission.value()).isEqualTo("life.content.manage");
    }

    @Test
    void createReturnsNoStoreAndCanonicalVersionEtag() {
        MomentEntity created = new MomentEntity();
        created.setId(9L);
        created.setPublicId("mom_opaque");
        created.setLifecycleStatus("DRAFT");
        created.setVisibilityStatus("PRIVATE");
        created.setVersion(0);
        when(momentService.createDraft("正文", LifeContentVisibilityEnum.PRIVATE)).thenReturn(created);

        var response = controller().create(new AdminMomentCreateRequest(
            "正文",
            LifeContentVisibilityEnum.PRIVATE
        ));

        assertThat(response.getHeaders().getETag()).isEqualTo("\"v0\"");
        assertThat(response.getHeaders().getCacheControl()).isEqualTo("no-store");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().data().id()).isEqualTo(9L);
    }

    @Test
    void listsStudioSummariesWithoutUsingThePublicFeedContract() {
        when(queryService.list(false, 50)).thenReturn(List.of(new AdminMomentSummaryResponse(
            9L, "正文摘要", "DRAFT", "PRIVATE", false, false, 2, 3, "\"v3\"", null
        )));

        var response = controller().list(false, 50);

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("no-store");
        assertThat(response.getBody().data()).singleElement().satisfies(item -> {
            assertThat(item.id()).isEqualTo(9L);
            assertThat(item.etag()).isEqualTo("\"v3\"");
        });
    }

    @Test
    void editUsesStrongIfMatchInsteadOfABodyVersion() {
        when(momentService.edit(
            9L,
            7,
            "正文",
            LifeContentVisibilityEnum.UNLISTED,
            true,
            false
        )).thenReturn(OptimisticVersionResponse.of(8));

        var response = controller().edit(
            9L,
            "\"v7\"",
            new AdminMomentEditRequest("正文", LifeContentVisibilityEnum.UNLISTED, true, false)
        );

        assertThat(response.getHeaders().getETag()).isEqualTo("\"v8\"");
        verify(momentService).edit(9L, 7, "正文", LifeContentVisibilityEnum.UNLISTED, true, false);
    }

    @Test
    void rejectsMissingWeakOrOversizedIfMatchBeforeCallingService() {
        AdminMomentEditRequest request = new AdminMomentEditRequest(
            "正文",
            LifeContentVisibilityEnum.PRIVATE,
            false,
            false
        );
        assertBadIfMatch(null, request);
        assertBadIfMatch("W/\"v1\"", request);
        assertBadIfMatch("\"v2147483648\"", request);
    }

    @Test
    void photoOrderResponseContainsOnlyOpaqueAssociationFields() {
        MomentPhotoEntity photo = new MomentPhotoEntity();
        photo.setPhotoId(12L);
        photo.setMediaRefId("med_opaque");
        photo.setSortNum(0);
        when(momentService.reorderPhotos(9L, 3, List.of(12L))).thenReturn(
            new MomentPhotoMutationResult(OptimisticVersionResponse.of(4), List.of(photo))
        );

        var response = controller().reorderPhotos(
            9L,
            "\"v3\"",
            new AdminMomentPhotoIdsRequest(List.of(12L))
        );

        AdminMomentPhotoOrderResponse data = response.getBody().data();
        assertThat(data.photos()).singleElement().satisfies(item -> {
            assertThat(item.photoId()).isEqualTo(12L);
            assertThat(item.mediaRef()).isEqualTo("med_opaque");
            assertThat(item.sort()).isZero();
        });
        assertThat(AdminMomentPhotoOrderResponse.class.getRecordComponents())
            .extracting(component -> component.getName().toLowerCase())
            .noneMatch(name -> name.contains("asset") || name.contains("bucket")
                || name.contains("object") || name.contains("signature") || name.contains("url"));
    }

    @Test
    void everyDestructiveCommandIsAudited() {
        for (String name : List.of("publish", "archive", "recycle", "restore")) {
            Method method;
            try {
                method = AdminMomentController.class.getMethod(name, long.class, String.class);
            } catch (ReflectiveOperationException exception) {
                throw new AssertionError(exception);
            }
            assertThat(method.getAnnotation(AuditLog.class)).isNotNull();
        }
    }

    private void assertBadIfMatch(String ifMatch, AdminMomentEditRequest request) {
        assertThatThrownBy(() -> controller().edit(9L, ifMatch, request))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
    }

    private AdminMomentController controller() {
        return new AdminMomentController(momentService, queryService);
    }
}
