package io.github.shizuki.site.media.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.security.purge.PurgeCapabilityGrant;
import io.github.shizuki.common.security.purge.PurgeCapabilityService;
import io.github.shizuki.site.admin.request.AdminPurgeConfirmationRequest;
import io.github.shizuki.site.admin.request.AdminPurgeDryRunRequest;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.media.response.PhotoPurgeDryRunResponse;
import io.github.shizuki.site.media.service.retention.PhotoRetentionService;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class AdminPhotoRetentionControllerTest {

    @Test
    void eligibleDryRunIssuesPhotoScopedCapabilityAndPurgeConsumesItFirst() {
        PhotoRetentionService retention = mock(PhotoRetentionService.class);
        PurgeCapabilityService capabilities = mock(PurgeCapabilityService.class);
        LocalDateTime purgeAfter = LocalDateTime.parse("2026-08-29T07:00:00");
        Instant expiresAt = Instant.parse("2026-08-29T08:05:00Z");
        when(retention.dryRunPurge(7L, 4)).thenReturn(
            new PhotoPurgeDryRunResponse(7L, 4, true, purgeAfter, 3, List.of())
        );
        when(capabilities.issue("PHOTO", 7L, 4)).thenReturn(new PurgeCapabilityGrant("opaque", expiresAt));
        when(retention.purge(7L, 4)).thenReturn(OptimisticVersionResponse.of(5));
        AdminPhotoRetentionController controller = new AdminPhotoRetentionController(retention, capabilities);

        var dryRun = controller.dryRunPurge(7L, new AdminPurgeDryRunRequest(4));
        assertThat(dryRun.getBody().data()).satisfies(data -> {
            assertThat(data.targetType()).isEqualTo("PHOTO");
            assertThat(data.derivativeCount()).isEqualTo(3);
            assertThat(data.capability()).isEqualTo("opaque");
            assertThat(data.confirmationPhrase()).isEqualTo("PURGE PHOTO 7");
        });

        controller.purge(7L, new AdminPurgeConfirmationRequest(4, "opaque", "PURGE PHOTO 7"));

        InOrder order = inOrder(capabilities, retention);
        order.verify(capabilities).consume("opaque", "PHOTO", 7L, 4);
        order.verify(retention).purge(7L, 4);
    }
}
