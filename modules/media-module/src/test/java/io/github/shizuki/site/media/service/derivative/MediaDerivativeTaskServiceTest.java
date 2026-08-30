package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.content.port.PublicContentCacheInvalidationPort;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.dao.DuplicateKeyException;

class MediaDerivativeTaskServiceTest {

    private MediaAssetVariantMapper mapper;
    private MediaDerivativeFeatureProperties properties;
    private MediaDerivativeTaskService service;

    @BeforeEach
    void setUp() {
        mapper = Mockito.mock(MediaAssetVariantMapper.class);
        properties = new MediaDerivativeFeatureProperties();
        properties.setProcessorVersion("v7");
        properties.setMaxRetries(3);
        properties.setLeaseTimeoutSeconds(60);
        Clock clock = Clock.fixed(Instant.parse("2026-08-28T12:00:00Z"), ZoneOffset.UTC);
        service = new MediaDerivativeTaskService(mapper, properties, clock);
    }

    @Test
    void returnsExistingTaskWithoutCreatingADuplicate() {
        MediaAssetVariantEntity existing = entity(11L, "PENDING", 0, 0);
        when(mapper.findByIdentity(42L, "THUMB_WEBP", "PRIVATE_WORKING", "v7"))
            .thenReturn(existing);

        MediaAssetVariantEntity result = service.enqueue(
            42L,
            ImageVariantTypeEnum.THUMB_WEBP,
            MediaDerivativeDeliveryScope.PRIVATE_WORKING
        );

        assertThat(result).isSameAs(existing);
        verify(mapper, never()).insert(Mockito.any(MediaAssetVariantEntity.class));
    }

    @Test
    void resolvesTheDatabaseWinnerWhenConcurrentEnqueueHitsTheUniqueConstraint() {
        MediaAssetVariantEntity winner = entity(12L, "PENDING", 0, 0);
        when(mapper.findByIdentity(42L, "DISPLAY_WEBP", "PUBLIC_MATERIALIZED", "v7"))
            .thenReturn(null, winner);
        when(mapper.insert(Mockito.any(MediaAssetVariantEntity.class)))
            .thenThrow(new DuplicateKeyException("duplicate derivative identity"));

        MediaAssetVariantEntity result = service.enqueue(
            42L,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED
        );

        assertThat(result).isSameAs(winner);
    }

    @Test
    void reactivatesARevokedPublicDerivativeWhenContentIsPublishedAgain() {
        MediaAssetVariantEntity revoked = entity(13L, "REVOKED", 2, 5);
        when(mapper.findByIdentity(42L, "DISPLAY_WEBP", "PUBLIC_MATERIALIZED", "v7"))
            .thenReturn(revoked);
        when(mapper.reactivateRevoked(13L, 5)).thenReturn(1);

        MediaAssetVariantEntity result = service.enqueue(
            42L,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED
        );

        assertThat(result.getProcessStatus()).isEqualTo("PENDING");
        assertThat(result.getRetryCount()).isZero();
        assertThat(result.getVersion()).isEqualTo(6);
        verify(mapper).reactivateRevoked(13L, 5);
    }

    @Test
    void reclaimsAStaleProcessingTaskAfterRestartAndCountsOneRetry() {
        MediaAssetVariantEntity stale = entity(21L, "PROCESSING", 1, 4);
        when(mapper.findNextClaimCandidate(LocalDateTime.parse("2026-08-28T11:59:00"), 3))
            .thenReturn(stale);
        when(mapper.claim(21L, 4, LocalDateTime.parse("2026-08-28T11:59:00"), 3))
            .thenReturn(1);

        Optional<MediaAssetVariantEntity> claimed = service.claimNext();

        assertThat(claimed).isPresent();
        assertThat(claimed.orElseThrow().getProcessStatus()).isEqualTo("PROCESSING");
        assertThat(claimed.orElseThrow().getRetryCount()).isEqualTo(2);
        assertThat(claimed.orElseThrow().getVersion()).isEqualTo(5);
        assertThat(claimed.orElseThrow().getUpdatedAt())
            .isEqualTo(LocalDateTime.parse("2026-08-28T12:00:00"));
    }

    @Test
    void returnsEmptyWhenAnotherWorkerWinsTheCompareAndSwap() {
        MediaAssetVariantEntity candidate = entity(31L, "PENDING", 0, 2);
        when(mapper.findNextClaimCandidate(any(LocalDateTime.class), eq(3)))
            .thenReturn(candidate, (MediaAssetVariantEntity) null);
        when(mapper.claim(eq(31L), eq(2), any(LocalDateTime.class), eq(3))).thenReturn(0);

        assertThat(service.claimNext()).isEmpty();
    }

    @Test
    void commitsReadyOnlyAgainstTheClaimVersion() {
        MediaAssetVariantEntity claimed = entity(41L, "PROCESSING", 0, 6);
        MediaDerivativeProcessResult result = new MediaDerivativeProcessResult(501L, 1280, 720);
        PublicContentCacheInvalidationPort cacheInvalidationPort =
            Mockito.mock(PublicContentCacheInvalidationPort.class);
        service = new MediaDerivativeTaskService(mapper, properties,
            Clock.fixed(Instant.parse("2026-08-28T12:00:00Z"), ZoneOffset.UTC), cacheInvalidationPort);
        when(mapper.markReady(41L, 6, 501L, 1280, 720)).thenReturn(1);

        assertThat(service.markReady(claimed, result)).isTrue();
        verify(mapper).markReady(41L, 6, 501L, 1280, 720);
        verify(cacheInvalidationPort).invalidateBySourceAssetId(42L);
    }

    private MediaAssetVariantEntity entity(long id, String status, int retryCount, int version) {
        MediaAssetVariantEntity entity = new MediaAssetVariantEntity();
        entity.setId(id);
        entity.setSourceAssetId(42L);
        entity.setVariantCode("DISPLAY_WEBP");
        entity.setDeliveryScope("PUBLIC_MATERIALIZED");
        entity.setProcessorVersion("v7");
        entity.setProcessStatus(status);
        entity.setRetryCount(retryCount);
        entity.setVersion(version);
        return entity;
    }
}
