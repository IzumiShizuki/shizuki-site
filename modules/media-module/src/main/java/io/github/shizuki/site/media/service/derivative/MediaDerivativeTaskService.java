package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.content.port.PublicContentCacheInvalidationPort;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * 持久化派生任务队列。数据库唯一约束保证最终幂等，版本号 CAS 保证多实例原子领取。
 */
@Service
public class MediaDerivativeTaskService {

    private static final int MAX_CLAIM_CONFLICTS = 8;

    private final MediaAssetVariantMapper mapper;
    private final MediaDerivativeFeatureProperties properties;
    private final Clock clock;
    private final PublicContentCacheInvalidationPort cacheInvalidationPort;

    @Autowired
    public MediaDerivativeTaskService(MediaAssetVariantMapper mapper,
                                      MediaDerivativeFeatureProperties properties,
                                      ObjectProvider<PublicContentCacheInvalidationPort> cacheInvalidationPortProvider) {
        this(mapper, properties, Clock.systemDefaultZone(), cacheInvalidationPortProvider.getIfAvailable());
    }

    MediaDerivativeTaskService(MediaAssetVariantMapper mapper,
                               MediaDerivativeFeatureProperties properties,
                               Clock clock) {
        this(mapper, properties, clock, null);
    }

    MediaDerivativeTaskService(MediaAssetVariantMapper mapper,
                               MediaDerivativeFeatureProperties properties,
                               Clock clock,
                               PublicContentCacheInvalidationPort cacheInvalidationPort) {
        this.mapper = mapper;
        this.properties = properties;
        this.clock = clock;
        this.cacheInvalidationPort = cacheInvalidationPort;
    }

    public MediaAssetVariantEntity enqueue(long sourceAssetId,
                                           ImageVariantTypeEnum variant,
                                           MediaDerivativeDeliveryScope scope) {
        if (sourceAssetId <= 0) {
            throw new IllegalArgumentException("sourceAssetId must be positive");
        }
        if (variant == null || scope == null) {
            throw new IllegalArgumentException("variant and delivery scope are required");
        }

        String processorVersion = properties.getProcessorVersion();
        MediaAssetVariantEntity existing = mapper.findByIdentity(
            sourceAssetId,
            variant.name(),
            scope.name(),
            processorVersion
        );
        if (existing != null) {
            if (ImageDerivativeStatusEnum.REVOKED.name().equals(existing.getProcessStatus())) {
                int expectedVersion = valueOrZero(existing.getVersion());
                if (mapper.reactivateRevoked(existing.getId(), expectedVersion) == 1) {
                    existing.setProcessStatus(ImageDerivativeStatusEnum.PENDING.name());
                    existing.setRetryCount(0);
                    existing.setLastError(null);
                    existing.setVersion(expectedVersion + 1);
                    existing.setUpdatedAt(LocalDateTime.now(clock));
                    invalidateSource(existing.getSourceAssetId());
                } else {
                    MediaAssetVariantEntity current = mapper.findByIdentity(
                        sourceAssetId,
                        variant.name(),
                        scope.name(),
                        processorVersion
                    );
                    return current == null ? existing : current;
                }
            }
            return existing;
        }

        MediaAssetVariantEntity task = new MediaAssetVariantEntity();
        task.setSourceAssetId(sourceAssetId);
        task.setVariantCode(variant.name());
        task.setDeliveryScope(scope.name());
        task.setProcessorVersion(processorVersion);
        task.setProcessStatus(ImageDerivativeStatusEnum.PENDING.name());
        task.setRetryCount(0);
        task.setDeleted(0);
        task.setVersion(0);
        try {
            mapper.insert(task);
            return task;
        } catch (DuplicateKeyException duplicate) {
            MediaAssetVariantEntity winner = mapper.findByIdentity(
                sourceAssetId,
                variant.name(),
                scope.name(),
                processorVersion
            );
            if (winner != null) {
                return winner;
            }
            throw duplicate;
        }
    }

    public Optional<MediaAssetVariantEntity> claimNext() {
        LocalDateTime staleBefore = staleBefore();
        for (int conflict = 0; conflict < MAX_CLAIM_CONFLICTS; conflict++) {
            MediaAssetVariantEntity candidate = mapper.findNextClaimCandidate(
                staleBefore,
                properties.getMaxRetries()
            );
            if (candidate == null) {
                return Optional.empty();
            }

            int expectedVersion = valueOrZero(candidate.getVersion());
            String previousStatus = candidate.getProcessStatus();
            int claimed = mapper.claim(
                candidate.getId(),
                expectedVersion,
                staleBefore,
                properties.getMaxRetries()
            );
            if (claimed == 1) {
                candidate.setProcessStatus(ImageDerivativeStatusEnum.PROCESSING.name());
                if (!ImageDerivativeStatusEnum.PENDING.name().equals(previousStatus)) {
                    candidate.setRetryCount(valueOrZero(candidate.getRetryCount()) + 1);
                }
                candidate.setLastError(null);
                candidate.setVersion(expectedVersion + 1);
                candidate.setUpdatedAt(LocalDateTime.now(clock));
                return Optional.of(candidate);
            }
        }
        return Optional.empty();
    }

    public int failExhaustedStaleClaims() {
        return mapper.failExhaustedStaleClaims(staleBefore(), properties.getMaxRetries());
    }

    public boolean markReady(MediaAssetVariantEntity claimed, MediaDerivativeProcessResult result) {
        requireClaimed(claimed);
        if (result == null) {
            throw new IllegalArgumentException("derivative process result is required");
        }
        boolean updated = mapper.markReady(
            claimed.getId(),
            valueOrZero(claimed.getVersion()),
            result.variantAssetId(),
            result.width(),
            result.height()
        ) == 1;
        if (updated) {
            invalidateSource(claimed.getSourceAssetId());
        }
        return updated;
    }

    public boolean markFailed(MediaAssetVariantEntity claimed, String lastError) {
        requireClaimed(claimed);
        if (lastError == null || lastError.isBlank() || lastError.length() > 1024) {
            throw new IllegalArgumentException("lastError must contain 1 to 1024 characters");
        }
        boolean updated = mapper.markFailed(
            claimed.getId(),
            valueOrZero(claimed.getVersion()),
            lastError
        ) == 1;
        if (updated) {
            invalidateSource(claimed.getSourceAssetId());
        }
        return updated;
    }

    private void invalidateSource(Long sourceAssetId) {
        if (cacheInvalidationPort != null && sourceAssetId != null && sourceAssetId > 0) {
            cacheInvalidationPort.invalidateBySourceAssetId(sourceAssetId);
        }
    }

    private LocalDateTime staleBefore() {
        return LocalDateTime.now(clock).minusSeconds(properties.getLeaseTimeoutSeconds());
    }

    private void requireClaimed(MediaAssetVariantEntity claimed) {
        if (claimed == null || claimed.getId() == null
            || !ImageDerivativeStatusEnum.PROCESSING.name().equals(claimed.getProcessStatus())) {
            throw new IllegalArgumentException("a claimed processing task is required");
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
