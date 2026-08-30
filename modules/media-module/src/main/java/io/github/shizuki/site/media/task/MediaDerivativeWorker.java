package io.github.shizuki.site.media.task;

import io.github.shizuki.common.audit.util.SensitiveMasker;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeObjectKeyFactory;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeProcessResult;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeProcessor;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeTaskService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 数据库支持的图片派生 worker。领取与状态提交使用短 CAS，耗时处理在事务外执行。
 */
@Component
public class MediaDerivativeWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(MediaDerivativeWorker.class);
    private static final int MAX_ERROR_LENGTH = 1024;

    private final MediaDerivativeTaskService taskService;
    private final MediaDerivativeObjectKeyFactory objectKeyFactory;
    private final MediaDerivativeFeatureProperties properties;
    private final List<MediaDerivativeProcessor> processors;

    public MediaDerivativeWorker(MediaDerivativeTaskService taskService,
                                 MediaDerivativeObjectKeyFactory objectKeyFactory,
                                 MediaDerivativeFeatureProperties properties,
                                 List<MediaDerivativeProcessor> processors) {
        this.taskService = taskService;
        this.objectKeyFactory = objectKeyFactory;
        this.properties = properties;
        this.processors = processors == null ? List.of() : List.copyOf(processors);
    }

    @Scheduled(fixedDelayString = "${shizuki.media.derivatives.worker-poll-interval-ms:5000}")
    public void processAvailableTasks() {
        processBatch();
    }

    int processBatch() {
        if (!properties.canRunWorker()) {
            return 0;
        }

        int expired = taskService.failExhaustedStaleClaims();
        if (expired > 0) {
            LOGGER.warn("MEDIA_DERIVATIVE_EXHAUSTED_LEASES count={}", expired);
        }

        int processed = 0;
        while (processed < properties.getBatchSize()) {
            Optional<MediaAssetVariantEntity> next = taskService.claimNext();
            if (next.isEmpty()) {
                break;
            }
            processClaim(next.get());
            processed += 1;
        }
        return processed;
    }

    private void processClaim(MediaAssetVariantEntity task) {
        try {
            MediaDerivativeProcessor processor = processors.stream()
                .filter(candidate -> candidate.supports(task))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no derivative processor supports this task"));
            String targetObjectKey = objectKeyFactory.create(task);
            MediaDerivativeProcessResult result = processor.process(task, targetObjectKey);
            if (!taskService.markReady(task, result)) {
                LOGGER.warn("MEDIA_DERIVATIVE_READY_CAS_LOST taskId={}", task.getId());
            }
        } catch (RuntimeException exception) {
            String reason = safeFailureReason(exception);
            if (!taskService.markFailed(task, reason)) {
                LOGGER.warn("MEDIA_DERIVATIVE_FAILED_CAS_LOST taskId={}", task.getId());
                return;
            }
            LOGGER.warn(
                "MEDIA_DERIVATIVE_PROCESS_FAIL taskId={} variant={} scope={} reason={}",
                task.getId(),
                task.getVariantCode(),
                task.getDeliveryScope(),
                reason
            );
        }
    }

    static String safeFailureReason(RuntimeException exception) {
        String type = exception == null ? "RuntimeException" : exception.getClass().getSimpleName();
        String message = exception == null ? null : SensitiveMasker.maskText(exception.getMessage());
        String combined = message == null || message.isBlank()
            ? type
            : type + ": " + message.replaceAll("\\s+", " ").trim();
        return combined.length() <= MAX_ERROR_LENGTH
            ? combined
            : combined.substring(0, MAX_ERROR_LENGTH);
    }
}
