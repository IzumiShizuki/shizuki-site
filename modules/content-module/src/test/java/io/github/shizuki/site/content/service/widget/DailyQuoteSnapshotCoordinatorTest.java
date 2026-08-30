package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.mapper.DailyQuoteSnapshotMapper;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.quote.DailyQuoteProvider;
import io.github.shizuki.site.content.provider.quote.NormalizedDailyQuote;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DuplicateKeyException;

@ExtendWith(MockitoExtension.class)
class DailyQuoteSnapshotCoordinatorTest {

    private static final Instant NOW = Instant.parse("2026-08-28T16:05:00Z");
    private static final LocalDate SITE_DATE = LocalDate.of(2026, 8, 29);
    private static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Hitokoto",
        URI.create("https://hitokoto.cn")
    );

    @Mock
    private SiteWidgetConfigMapper configMapper;
    @Mock
    private SiteLocationMapper locationMapper;
    @Mock
    private DailyQuoteSnapshotMapper snapshotMapper;
    @Mock
    private QuoteMapper quoteMapper;
    @Mock
    private DailyQuoteProvider provider;
    @Mock
    private DailyQuoteRefreshLock refreshLock;
    @Mock
    private SiteWidgetCacheInvalidator cacheInvalidator;

    private DailyQuoteSnapshotCoordinator coordinator;
    private ExternalWidgetFeatureProperties features;
    private DailyQuoteSnapshotProperties properties;

    @BeforeEach
    void setUp() {
        features = new ExternalWidgetFeatureProperties();
        features.setEnabled(true);
        features.setQuoteEnabled(true);
        features.setUpstreamRequestsEnabled(true);
        features.afterPropertiesSet();
        properties = new DailyQuoteSnapshotProperties();
        properties.afterPropertiesSet();
        lenient().when(provider.providerCode()).thenReturn("HITOKOTO");
        lenient().when(provider.attribution()).thenReturn(ATTRIBUTION);
        coordinator = newCoordinator(refreshLock);
        prepareConfiguration("HITOKOTO", true);
    }

    @Test
    void existingSiteLocalDateSnapshotIsReturnedWithoutAnyMutationOrUpstreamCall() {
        DailyQuoteSnapshotEntity existing = snapshot(91L, SITE_DATE, "已固定");
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(existing);

        DailyQuoteSnapshotEntity result = coordinator.refreshMissingCurrentDate();

        assertThat(result).isSameAs(existing);
        verify(refreshLock, never()).tryAcquire(any(), any(), any());
        verify(provider, never()).fetch();
        verify(snapshotMapper, never()).insert(any(DailyQuoteSnapshotEntity.class));
    }

    @Test
    void lockOwnerCommitsOneImmutableSnapshotWithCompleteProvenance() {
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(true);
        when(provider.fetch()).thenReturn(normalized());
        when(snapshotMapper.insert(any(DailyQuoteSnapshotEntity.class))).thenAnswer(invocation -> {
            DailyQuoteSnapshotEntity entity = invocation.getArgument(0);
            entity.setId(92L);
            return 1;
        });

        DailyQuoteSnapshotEntity result = coordinator.refreshMissingCurrentDate();

        assertThat(result.getId()).isEqualTo(92L);
        assertThat(result.getQuoteDate()).isEqualTo(SITE_DATE);
        assertThat(result.getQuoteId()).isNull();
        assertThat(result.getText()).isEqualTo("愿你眼里有光，心中有海。");
        assertThat(result.getCategoryCode()).isEqualTo("i");
        assertThat(result.getAuthor()).isEqualTo("测试作者");
        assertThat(result.getSourceTitle()).isEqualTo("测试作品");
        assertThat(result.getProviderCode()).isEqualTo("HITOKOTO");
        assertThat(result.getProviderUuid()).isEqualTo("550e8400-e29b-41d4-a716-446655440000");
        assertThat(result.getSourceUrl()).startsWith("https://hitokoto.cn/sentences/");
        assertThat(result.getFetchedAt()).isEqualTo(LocalDateTime.ofInstant(NOW, ZoneOffset.UTC));
        assertThat(result.getStale()).isFalse();
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(31L, 31L, false, true));
        verify(refreshLock).release(eq(SITE_DATE), any());
    }

    @Test
    void busyLeaseConvergesOnWinnerWithoutDuplicateProviderCall() {
        DailyQuoteSnapshotEntity winner = snapshot(93L, SITE_DATE, "另一个实例提交");
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null, winner);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(false);

        assertThat(coordinator.refreshMissingCurrentDate()).isSameAs(winner);
        verify(provider, never()).fetch();
        verify(snapshotMapper, never()).insert(any(DailyQuoteSnapshotEntity.class));
    }

    @Test
    void redisFailurePausesUpstreamRefresh() {
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any()))
            .thenThrow(new IllegalStateException("redis unavailable"));

        assertThat(coordinator.refreshMissingCurrentDate()).isNull();
        verify(provider, never()).fetch();
    }

    @Test
    void databaseReadFailurePausesLockAndUpstreamInsteadOfTreatingFailureAsMissing() {
        when(snapshotMapper.selectByQuoteDate(SITE_DATE))
            .thenThrow(new IllegalStateException("database unavailable"));

        assertThat(coordinator.refreshMissingCurrentDate()).isNull();

        verify(refreshLock, never()).tryAcquire(any(), any(), any());
        verify(provider, never()).fetch();
        verify(snapshotMapper, never()).insert(any(DailyQuoteSnapshotEntity.class));
    }

    @Test
    void databaseUniqueWinnerRemainsCanonicalWhenInsertRaces() {
        DailyQuoteSnapshotEntity winner = snapshot(94L, SITE_DATE, "唯一约束胜者");
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null, null, winner);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(true);
        when(provider.fetch()).thenReturn(normalized());
        when(snapshotMapper.insert(any(DailyQuoteSnapshotEntity.class)))
            .thenThrow(new DuplicateKeyException("quote_date unique"));

        assertThat(coordinator.refreshMissingCurrentDate()).isSameAs(winner);
        verify(cacheInvalidator, never()).invalidate(any());
        verify(refreshLock).release(eq(SITE_DATE), any());
    }

    @Test
    void localSourceModeNeverContactsHitokoto() {
        prepareConfiguration("LOCAL", false);
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(true);
        when(quoteMapper.selectApprovedEnabled(500)).thenReturn(java.util.List.of());

        assertThat(coordinator.refreshMissingCurrentDate()).isNull();
        verify(refreshLock).tryAcquire(eq(SITE_DATE), any(), any());
        verify(provider, never()).fetch();
    }

    @Test
    void localModeCommitsOnlyAnApprovedEnabledLibraryQuote() {
        prepareConfiguration("LOCAL", false);
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(true);
        QuoteEntity local = new QuoteEntity();
        local.setId(61L);
        local.setText("本地精选");
        local.setAuthor("站长");
        local.setSourceTitle("随笔");
        local.setCategoryCode("life");
        local.setProviderCode("LOCAL");
        local.setApprovalStatus("APPROVED");
        local.setEnabled(true);
        local.setDeleted(0);
        when(quoteMapper.selectApprovedEnabled(500)).thenReturn(java.util.List.of(local));
        when(snapshotMapper.insert(any(DailyQuoteSnapshotEntity.class))).thenReturn(1);

        DailyQuoteSnapshotEntity result = coordinator.refreshMissingCurrentDate();

        assertThat(result.getQuoteId()).isEqualTo(61L);
        assertThat(result.getText()).isEqualTo("本地精选");
        assertThat(result.getProviderCode()).isEqualTo("LOCAL");
        assertThat(result.getQuoteDate()).isEqualTo(SITE_DATE);
        verify(provider, never()).fetch();
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(31L, 31L, false, true));
    }

    @Test
    void hitokotoFailureCommitsApprovedLocalFallbackWithItsActualProvenance() {
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(refreshLock.tryAcquire(eq(SITE_DATE), any(), any())).thenReturn(true);
        when(provider.fetch()).thenThrow(new IllegalStateException("upstream unavailable"));
        QuoteEntity fallback = new QuoteEntity();
        fallback.setId(62L);
        fallback.setText("上游失败时的本地事实");
        fallback.setAuthor("站长");
        fallback.setSourceTitle("维护台精选");
        fallback.setCategoryCode("fallback");
        fallback.setProviderCode("LOCAL");
        fallback.setApprovalStatus("APPROVED");
        fallback.setEnabled(true);
        fallback.setDeleted(0);
        when(quoteMapper.selectApprovedEnabled(500)).thenReturn(List.of(fallback));
        when(snapshotMapper.insert(any(DailyQuoteSnapshotEntity.class))).thenReturn(1);

        DailyQuoteSnapshotEntity result = coordinator.refreshMissingCurrentDate();

        assertThat(result.getQuoteDate()).isEqualTo(SITE_DATE);
        assertThat(result.getQuoteId()).isEqualTo(62L);
        assertThat(result.getText()).isEqualTo("上游失败时的本地事实");
        assertThat(result.getProviderCode()).isEqualTo("LOCAL");
        assertThat(result.getSourceTitle()).isEqualTo("维护台精选");
        assertThat(result.getStale()).isFalse();
        verify(provider).fetch();
        verify(snapshotMapper).insert(result);
    }

    @Test
    void twoApplicationInstancesConvergeOnOneCommittedSnapshotAndOneProviderCall() throws Exception {
        AtomicReference<DailyQuoteSnapshotEntity> committed = new AtomicReference<>();
        AtomicBoolean leaseHeld = new AtomicBoolean();
        CountDownLatch providerEntered = new CountDownLatch(1);
        CountDownLatch contenderObservedLease = new CountDownLatch(1);
        CountDownLatch allowCommit = new CountDownLatch(1);
        CountDownLatch commitCompleted = new CountDownLatch(1);
        DailyQuoteRefreshLock sharedLock = new DailyQuoteRefreshLock() {
            @Override
            public boolean tryAcquire(LocalDate quoteDate, String token, java.time.Duration ttl) {
                if (leaseHeld.compareAndSet(false, true)) {
                    return true;
                }
                contenderObservedLease.countDown();
                await(commitCompleted);
                return false;
            }

            @Override
            public void release(LocalDate quoteDate, String token) {
                leaseHeld.set(false);
            }
        };
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenAnswer(invocation -> committed.get());
        when(provider.fetch()).thenAnswer(invocation -> {
            providerEntered.countDown();
            await(allowCommit);
            return normalized();
        });
        when(snapshotMapper.insert(any(DailyQuoteSnapshotEntity.class))).thenAnswer(invocation -> {
            DailyQuoteSnapshotEntity candidate = invocation.getArgument(0);
            candidate.setId(95L);
            boolean installed = committed.compareAndSet(null, candidate);
            commitCompleted.countDown();
            return installed ? 1 : 0;
        });
        DailyQuoteSnapshotCoordinator first = newCoordinator(sharedLock);
        DailyQuoteSnapshotCoordinator second = newCoordinator(sharedLock);

        AtomicReference<DailyQuoteSnapshotEntity> firstResult = new AtomicReference<>();
        AtomicReference<DailyQuoteSnapshotEntity> secondResult = new AtomicReference<>();
        Thread firstThread = new Thread(
            () -> firstResult.set(first.refreshMissingCurrentDate()),
            "daily-quote-instance-1"
        );
        Thread secondThread = new Thread(
            () -> secondResult.set(second.refreshMissingCurrentDate()),
            "daily-quote-instance-2"
        );
        firstThread.start();
        secondThread.start();

        assertThat(providerEntered.await(2, TimeUnit.SECONDS)).isTrue();
        assertThat(contenderObservedLease.await(2, TimeUnit.SECONDS)).isTrue();
        allowCommit.countDown();
        firstThread.join(2_000);
        secondThread.join(2_000);

        assertThat(firstThread.isAlive()).isFalse();
        assertThat(secondThread.isAlive()).isFalse();
        assertThat(firstResult.get()).isSameAs(committed.get());
        assertThat(secondResult.get()).isSameAs(committed.get());
        assertThat(committed.get().getQuoteDate()).isEqualTo(SITE_DATE);
        verify(provider, times(1)).fetch();
        verify(snapshotMapper, times(1)).insert(any(DailyQuoteSnapshotEntity.class));
    }

    private void prepareConfiguration(String sourceMode, boolean hitokotoEnabled) {
        SiteWidgetConfigEntity config = new SiteWidgetConfigEntity();
        config.setSingletonKey("SITE");
        config.setActiveLocationId(31L);
        config.setQuoteSourceMode(sourceMode);
        config.setHitokotoEnabled(hitokotoEnabled);
        config.setDeleted(0);
        lenient().when(configMapper.selectById("SITE")).thenReturn(config);

        SiteLocationEntity location = new SiteLocationEntity();
        location.setId(31L);
        location.setDisplayName("上海");
        location.setTimezone("Asia/Shanghai");
        location.setEnabled(true);
        location.setDeleted(0);
        lenient().when(locationMapper.selectById(31L)).thenReturn(location);
    }

    private DailyQuoteSnapshotCoordinator newCoordinator(DailyQuoteRefreshLock lock) {
        return new DailyQuoteSnapshotCoordinator(
            configMapper,
            locationMapper,
            snapshotMapper,
            quoteMapper,
            provider,
            lock,
            properties,
            features,
            cacheInvalidator,
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
    }

    private static void await(CountDownLatch latch) {
        try {
            if (!latch.await(2, TimeUnit.SECONDS)) {
                throw new IllegalStateException("test coordination timed out");
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("test coordination interrupted", exception);
        }
    }

    private NormalizedDailyQuote normalized() {
        return new NormalizedDailyQuote(
            "HITOKOTO",
            "550e8400-e29b-41d4-a716-446655440000",
            "愿你眼里有光，心中有海。",
            "i",
            "测试作者",
            "测试作品",
            URI.create("https://hitokoto.cn/sentences/550e8400-e29b-41d4-a716-446655440000"),
            NOW,
            ATTRIBUTION
        );
    }

    private DailyQuoteSnapshotEntity snapshot(long id, LocalDate quoteDate, String text) {
        DailyQuoteSnapshotEntity entity = new DailyQuoteSnapshotEntity();
        entity.setId(id);
        entity.setQuoteDate(quoteDate);
        entity.setText(text);
        entity.setProviderCode("HITOKOTO");
        entity.setProviderUuid("existing-" + id);
        entity.setSourceUrl("https://hitokoto.cn/sentences/existing-" + id);
        entity.setFetchedAt(LocalDateTime.ofInstant(NOW.minusSeconds(60), ZoneOffset.UTC));
        entity.setStale(false);
        entity.setDeleted(0);
        return entity;
    }
}
