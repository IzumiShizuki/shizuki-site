package io.github.shizuki.site.media.task;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeObjectKeyFactory;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeProcessResult;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeProcessor;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeTaskService;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MediaDerivativeWorkerTest {

    private MediaDerivativeTaskService taskService;
    private MediaDerivativeProcessor processor;
    private MediaDerivativeFeatureProperties properties;

    @BeforeEach
    void setUp() {
        taskService = Mockito.mock(MediaDerivativeTaskService.class);
        processor = Mockito.mock(MediaDerivativeProcessor.class);
        properties = new MediaDerivativeFeatureProperties();
        properties.setEnabled(true);
        properties.setWorkerEnabled(true);
        properties.setOssProcessingEnabled(true);
        properties.setBatchSize(2);
    }

    @Test
    void processesAClaimWithAVersionedObjectKeyAndCommitsReady() {
        MediaAssetVariantEntity task = task(51L);
        MediaDerivativeProcessResult result = new MediaDerivativeProcessResult(901L, 1280, 720);
        when(taskService.claimNext()).thenReturn(Optional.of(task), Optional.empty());
        when(processor.supports(task)).thenReturn(true);
        when(processor.process(
            eq(task),
            eq("personal-content/derivatives/42/v7/public-materialized/display-webp.webp")
        )).thenReturn(result);
        when(taskService.markReady(task, result)).thenReturn(true);

        MediaDerivativeWorker worker = worker();

        assertThat(worker.processBatch()).isEqualTo(1);
        verify(taskService).failExhaustedStaleClaims();
        verify(taskService).markReady(task, result);
        verify(taskService, never()).markFailed(any(), any());
    }

    @Test
    void storesARedactedFailureCauseAndLeavesRetryPolicyToTheQueue() {
        MediaAssetVariantEntity task = task(52L);
        when(taskService.claimNext()).thenReturn(Optional.of(task), Optional.empty());
        when(processor.supports(task)).thenReturn(true);
        when(processor.process(any(), any())).thenThrow(new IllegalStateException(
            "https://oss.example/object?x-oss-signature=secret at 31.230416,121.473701"
        ));
        when(taskService.markFailed(task, "IllegalStateException: [REDACTED]")).thenReturn(true);

        assertThat(worker().processBatch()).isEqualTo(1);

        verify(taskService).markFailed(task, "IllegalStateException: [REDACTED]");
        verify(taskService, never()).markReady(any(), any());
    }

    @Test
    void redactsOssStorageIdentityFromFailureReasonsBeforePersistenceOrLogging() {
        String reason = MediaDerivativeWorker.safeFailureReason(new IllegalStateException(
            "OSS request failed for bucketName=site-private objectKey=personal-content/originals/42.jpg"
        ));

        assertThat(reason).isEqualTo("IllegalStateException: [REDACTED]");
        assertThat(reason).doesNotContain("site-private", "personal-content/originals/42.jpg");
    }

    @Test
    void doesNotTouchTheQueueWhileTheFeatureGateIsDisabled() {
        properties.setEnabled(false);
        properties.setWorkerEnabled(false);
        properties.setOssProcessingEnabled(false);

        assertThat(worker().processBatch()).isZero();

        verify(taskService, never()).claimNext();
        verify(taskService, never()).failExhaustedStaleClaims();
    }

    @Test
    void failureReasonIsBoundedToTheDatabaseColumn() {
        String reason = MediaDerivativeWorker.safeFailureReason(
            new IllegalArgumentException("x".repeat(2_000))
        );

        assertThat(reason).hasSize(1024);
    }

    private MediaDerivativeWorker worker() {
        return new MediaDerivativeWorker(
            taskService,
            new MediaDerivativeObjectKeyFactory(),
            properties,
            List.of(processor)
        );
    }

    private MediaAssetVariantEntity task(long id) {
        MediaAssetVariantEntity task = new MediaAssetVariantEntity();
        task.setId(id);
        task.setSourceAssetId(42L);
        task.setVariantCode("DISPLAY_WEBP");
        task.setDeliveryScope("PUBLIC_MATERIALIZED");
        task.setProcessorVersion("v7");
        task.setProcessStatus("PROCESSING");
        task.setRetryCount(0);
        task.setVersion(2);
        return task;
    }
}
