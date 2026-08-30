package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.model.PublicContentType;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/** Best-effort invalidation registered only after a surrounding transaction commits. */
@Component
public class RedisPublicContentCacheInvalidator implements PublicContentCacheInvalidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisPublicContentCacheInvalidator.class);

    private final StringRedisTemplate redisTemplate;

    public RedisPublicContentCacheInvalidator(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void invalidateListsAfterCommit(PublicContentType type) {
        PublicContentType normalizedType = Objects.requireNonNull(type, "type");
        afterCommit(() -> advanceListGenerations(Set.of(normalizedType)));
    }

    @Override
    public void invalidateDetailAfterCommit(PublicContentType type, String opaqueIdentifier) {
        PublicContentCacheTarget target = new PublicContentCacheTarget(type, opaqueIdentifier);
        afterCommit(() -> invalidateDetails(List.of(target)));
    }

    @Override
    public void invalidateContentAfterCommit(PublicContentType type, String opaqueIdentifier) {
        invalidateContentsAfterCommit(List.of(new PublicContentCacheTarget(type, opaqueIdentifier)));
    }

    @Override
    public void invalidateContentsAfterCommit(Collection<PublicContentCacheTarget> targets) {
        List<PublicContentCacheTarget> normalizedTargets = targets == null
            ? List.of()
            : targets.stream().filter(Objects::nonNull).distinct().toList();
        if (normalizedTargets.isEmpty()) {
            return;
        }
        afterCommit(() -> {
            Set<PublicContentType> types = new LinkedHashSet<>();
            normalizedTargets.forEach(target -> types.add(target.type()));
            advanceListGenerations(types);
            invalidateDetails(normalizedTargets);
        });
    }

    private void advanceListGenerations(Collection<PublicContentType> types) {
        for (PublicContentType type : types) {
            increment(PublicContentCacheKeys.listGeneration(type), "list-generation");
        }
    }

    private void invalidateDetails(Collection<PublicContentCacheTarget> targets) {
        Set<String> detailKeys = new LinkedHashSet<>();
        for (PublicContentCacheTarget target : targets) {
            increment(
                PublicContentCacheKeys.detailGeneration(target.type(), target.opaqueIdentifier()),
                "detail-generation"
            );
            detailKeys.add(PublicContentCacheKeys.detail(target.type(), target.opaqueIdentifier()));
        }
        if (detailKeys.isEmpty()) {
            return;
        }
        try {
            redisTemplate.delete(detailKeys);
        } catch (RuntimeException exception) {
            logSkip("detail-delete", exception);
        }
    }

    private void increment(String key, String operation) {
        try {
            redisTemplate.opsForValue().increment(key);
        } catch (RuntimeException exception) {
            logSkip(operation, exception);
        }
    }

    private void afterCommit(Runnable invalidation) {
        if (TransactionSynchronizationManager.isSynchronizationActive()
            && TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    invalidation.run();
                }
            });
            return;
        }
        invalidation.run();
    }

    private static void logSkip(String operation, RuntimeException exception) {
        LOGGER.debug(
            "PUBLIC_CONTENT_CACHE_INVALIDATION_SKIP operation={} reason={}",
            operation,
            exception.getClass().getSimpleName()
        );
    }
}
