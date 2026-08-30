package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.purge.PurgeCapabilityGrant;
import io.github.shizuki.common.security.purge.PurgeCapabilityService;
import io.github.shizuki.site.admin.request.AdminPurgeConfirmationRequest;
import io.github.shizuki.site.admin.request.AdminPurgeDryRunRequest;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.controller.album.AdminAlbumController;
import io.github.shizuki.site.content.life.ContentPurgeReadiness;
import io.github.shizuki.site.content.service.album.AlbumService;
import io.github.shizuki.site.content.service.moment.MomentService;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class AdminContentPurgeControllerTest {

    @Test
    void albumDryRunReturnsNoStoreSingleUseCapabilityOnlyWhenEligible() {
        AlbumService albumService = mock(AlbumService.class);
        PurgeCapabilityService capabilities = mock(PurgeCapabilityService.class);
        LocalDateTime purgeAfter = LocalDateTime.parse("2026-08-29T07:00:00");
        Instant expiresAt = Instant.parse("2026-08-29T08:05:00Z");
        when(albumService.dryRunPurge(4L, 2)).thenReturn(
            new ContentPurgeReadiness(true, purgeAfter, List.of())
        );
        when(capabilities.issue("ALBUM", 4L, 2)).thenReturn(new PurgeCapabilityGrant("opaque", expiresAt));
        AdminAlbumController controller = new AdminAlbumController(
            albumService, null, null, null, capabilities
        );

        var response = controller.dryRunPurge(4L, new AdminPurgeDryRunRequest(2));

        assertThat(response.getHeaders().getCacheControl()).contains("no-store");
        assertThat(response.getBody().data()).satisfies(data -> {
            assertThat(data.targetType()).isEqualTo("ALBUM");
            assertThat(data.capability()).isEqualTo("opaque");
            assertThat(data.capabilityExpiresAt()).isEqualTo(expiresAt);
            assertThat(data.confirmationPhrase()).isEqualTo("PURGE ALBUM 4");
        });
    }

    @Test
    void albumPurgeConsumesBoundCapabilityBeforeCallingDestructiveService() {
        AlbumService albumService = mock(AlbumService.class);
        PurgeCapabilityService capabilities = mock(PurgeCapabilityService.class);
        when(albumService.purge(4L, 2)).thenReturn(OptimisticVersionResponse.of(3));
        AdminAlbumController controller = new AdminAlbumController(
            albumService, null, null, null, capabilities
        );

        controller.purge(4L, new AdminPurgeConfirmationRequest(2, "opaque", "PURGE ALBUM 4"));

        InOrder order = inOrder(capabilities, albumService);
        order.verify(capabilities).consume("opaque", "ALBUM", 4L, 2);
        order.verify(albumService).purge(4L, 2);
    }

    @Test
    void momentPurgeRejectsMismatchedTypedPhraseBeforeCapabilityConsumption() {
        MomentService momentService = mock(MomentService.class);
        PurgeCapabilityService capabilities = mock(PurgeCapabilityService.class);
        AdminMomentController controller = new AdminMomentController(
            momentService, null, null, capabilities
        );

        assertThatThrownBy(() -> controller.purge(
            8L,
            new AdminPurgeConfirmationRequest(3, "opaque", "PURGE MOMENT 9")
        )).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST)
        );
        verifyNoInteractions(capabilities, momentService);
    }
}
