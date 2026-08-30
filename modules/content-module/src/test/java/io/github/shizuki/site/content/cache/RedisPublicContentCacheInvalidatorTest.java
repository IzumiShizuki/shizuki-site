package io.github.shizuki.site.content.cache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.model.PublicContentType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

class RedisPublicContentCacheInvalidatorTest {

    private final Map<String, Long> generations = new HashMap<>();
    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> values;
    private RedisPublicContentCacheInvalidator invalidator;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redisTemplate = mock(StringRedisTemplate.class);
        values = mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(values);
        when(values.increment(anyString())).thenAnswer(invocation ->
            generations.merge(invocation.getArgument(0), 1L, Long::sum)
        );
        when(redisTemplate.delete(any(Collection.class))).thenReturn(0L);
        invalidator = new RedisPublicContentCacheInvalidator(redisTemplate);
    }

    @AfterEach
    void clearTransactionState() {
        if (TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.clearSynchronization();
        }
        TransactionSynchronizationManager.setActualTransactionActive(false);
    }

    @Test
    void contentInvalidationAdvancesTypeOnceAndDeletesOnlyExactDetailKeys() {
        String albumId = "alb_123456789012345678901234567";
        String momentId = "mom_123456789012345678901234567";

        invalidator.invalidateContentsAfterCommit(Set.of(
            new PublicContentCacheTarget(PublicContentType.ALBUM, albumId),
            new PublicContentCacheTarget(PublicContentType.ALBUM, "alb_abcdefghijklmnopqrstuvwxyz0"),
            new PublicContentCacheTarget(PublicContentType.MOMENT, momentId)
        ));

        assertThat(generations)
            .containsEntry(PublicContentCacheKeys.listGeneration(PublicContentType.ALBUM), 1L)
            .containsEntry(PublicContentCacheKeys.listGeneration(PublicContentType.MOMENT), 1L)
            .containsEntry(PublicContentCacheKeys.detailGeneration(PublicContentType.ALBUM, albumId), 1L)
            .containsEntry(PublicContentCacheKeys.detailGeneration(PublicContentType.MOMENT, momentId), 1L);
        verify(redisTemplate).delete(Set.of(
            PublicContentCacheKeys.detail(PublicContentType.ALBUM, albumId),
            PublicContentCacheKeys.detail(PublicContentType.ALBUM, "alb_abcdefghijklmnopqrstuvwxyz0"),
            PublicContentCacheKeys.detail(PublicContentType.MOMENT, momentId)
        ));
    }

    @Test
    void invalidationWaitsForCommitAndDoesNothingForRollback() {
        TransactionSynchronizationManager.setActualTransactionActive(true);
        TransactionSynchronizationManager.initSynchronization();

        invalidator.invalidateListsAfterCommit(PublicContentType.ALBUM);

        assertThat(generations).isEmpty();
        assertThat(TransactionSynchronizationManager.getSynchronizations()).hasSize(1);
        TransactionSynchronization synchronization = TransactionSynchronizationManager
            .getSynchronizations()
            .get(0);
        synchronization.afterCompletion(TransactionSynchronization.STATUS_ROLLED_BACK);
        assertThat(generations).isEmpty();
    }

    @Test
    void invalidationRunsOnlyAfterCommitWhenTransactionIsActive() {
        TransactionSynchronizationManager.setActualTransactionActive(true);
        TransactionSynchronizationManager.initSynchronization();

        invalidator.invalidateDetailAfterCommit(
            PublicContentType.MOMENT,
            "mom_123456789012345678901234567"
        );
        assertThat(generations).isEmpty();

        TransactionSynchronizationManager.getSynchronizations().get(0).afterCommit();

        assertThat(generations).containsEntry(
            PublicContentCacheKeys.detailGeneration(
                PublicContentType.MOMENT,
                "mom_123456789012345678901234567"
            ),
            1L
        );
    }

    @Test
    void invalidationRunsImmediatelyWithoutTransaction() {
        invalidator.invalidateListsAfterCommit(PublicContentType.MOMENT);

        assertThat(generations).containsEntry(
            PublicContentCacheKeys.listGeneration(PublicContentType.MOMENT),
            1L
        );
        verify(redisTemplate, never()).keys(anyString());
    }

    @Test
    void redisFailureNeverBreaksTheCommittedMutationPath() {
        when(values.increment(anyString())).thenThrow(new IllegalStateException("redis unavailable"));
        doAnswer(invocation -> {
            throw new IllegalStateException("redis unavailable");
        }).when(redisTemplate).delete(any(Collection.class));

        assertThatCode(() -> invalidator.invalidateContentAfterCommit(
            PublicContentType.ALBUM,
            "alb_123456789012345678901234567"
        )).doesNotThrowAnyException();
    }
}
