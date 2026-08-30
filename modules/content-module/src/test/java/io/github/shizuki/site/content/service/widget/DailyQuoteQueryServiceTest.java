package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.mapper.DailyQuoteSnapshotMapper;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import io.github.shizuki.site.content.provider.quote.DailyQuoteProvider;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DailyQuoteQueryServiceTest {

    private static final Instant NOW = Instant.parse("2026-08-28T16:05:00Z");
    private static final LocalDate SITE_DATE = LocalDate.of(2026, 8, 29);

    @Mock
    private SiteWidgetConfigMapper configMapper;
    @Mock
    private SiteLocationMapper locationMapper;
    @Mock
    private DailyQuoteSnapshotMapper snapshotMapper;
    @Mock
    private QuoteMapper quoteMapper;
    @Mock
    private DailyQuoteRedisStore redisStore;

    private ObjectMapper objectMapper;
    private DailyQuoteQueryService service;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper().findAndRegisterModules();
        ExternalWidgetFeatureProperties features = new ExternalWidgetFeatureProperties();
        features.setEnabled(true);
        features.setQuoteEnabled(true);
        features.afterPropertiesSet();
        service = new DailyQuoteQueryService(
            configMapper,
            locationMapper,
            snapshotMapper,
            quoteMapper,
            redisStore,
            features,
            objectMapper,
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
        prepareTimezone();
        lenient().when(redisStore.get()).thenReturn(null);
    }

    @Test
    void currentSnapshotIsReturnedAsCanonicalAndCachedWithoutRefreshDependency() {
        DailyQuoteSnapshotEntity current = snapshot(91L, SITE_DATE, "今天");
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(current);

        DailyQuoteView result = service.today();

        assertThat(result.state()).isEqualTo(DailyQuoteState.CURRENT);
        assertThat(result.snapshotId()).isEqualTo(91L);
        assertThat(result.effectiveDate()).isEqualTo(SITE_DATE);
        assertThat(result.text()).isEqualTo("今天");
        verify(snapshotMapper, never()).selectLatestBefore(any());
        verify(redisStore).put(any(), any());
        assertThat(Arrays.stream(DailyQuoteQueryService.class.getDeclaredFields())
            .map(field -> field.getType().getName()))
            .doesNotContain(
                DailyQuoteProvider.class.getName(),
                DailyQuoteSnapshotCoordinator.class.getName()
            );
    }

    @Test
    void missingTodayReturnsPriorCanonicalWithOriginalDateAsStale() {
        DailyQuoteSnapshotEntity prior = snapshot(90L, SITE_DATE.minusDays(1), "昨天");
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(snapshotMapper.selectLatestBefore(SITE_DATE)).thenReturn(prior);

        DailyQuoteView result = service.today();

        assertThat(result.state()).isEqualTo(DailyQuoteState.STALE);
        assertThat(result.effectiveDate()).isEqualTo(SITE_DATE.minusDays(1));
        assertThat(result.text()).isEqualTo("昨天");
    }

    @Test
    void noCurrentOrLastGoodSnapshotIsExplicitlyUnavailable() {
        when(snapshotMapper.selectByQuoteDate(SITE_DATE)).thenReturn(null);
        when(snapshotMapper.selectLatestBefore(SITE_DATE)).thenReturn(null);

        DailyQuoteView result = service.today();

        assertThat(result.state()).isEqualTo(DailyQuoteState.UNAVAILABLE);
        assertThat(result.text()).isNull();
        assertThat(result.effectiveDate()).isNull();
    }

    @Test
    void matchingRedisDocumentAvoidsDatabaseRead() throws Exception {
        DailyQuoteView cached = new DailyQuoteView(
            91L, null, SITE_DATE, "缓存", null, "作品", "i", "HITOKOTO", "uuid",
            "https://hitokoto.cn/sentences/uuid", NOW, DailyQuoteState.CURRENT
        );
        when(redisStore.get()).thenReturn(objectMapper.writeValueAsString(
            new DailyQuoteCacheDocument(SITE_DATE, cached)
        ));

        assertThat(service.today()).isEqualTo(cached);
        verify(snapshotMapper, never()).selectByQuoteDate(any());
    }

    @Test
    void localAlternativeCyclesOnlyThroughApprovedEnabledMapperResults() {
        QuoteEntity first = localQuote(11L, "第一句");
        QuoteEntity second = localQuote(15L, "第二句");
        when(quoteMapper.selectApprovedEnabled(500)).thenReturn(List.of(first, second));

        DailyQuoteView result = service.alternative(11L);

        assertThat(result.state()).isEqualTo(DailyQuoteState.LOCAL_ALTERNATIVE);
        assertThat(result.localQuoteId()).isEqualTo(15L);
        assertThat(result.text()).isEqualTo("第二句");
        assertThat(result.providerCode()).isEqualTo("LOCAL");
        verify(snapshotMapper, never()).selectByQuoteDate(any());
    }

    private void prepareTimezone() {
        SiteWidgetConfigEntity config = new SiteWidgetConfigEntity();
        config.setSingletonKey("SITE");
        config.setActiveLocationId(31L);
        config.setDeleted(0);
        lenient().when(configMapper.selectById("SITE")).thenReturn(config);
        SiteLocationEntity location = new SiteLocationEntity();
        location.setId(31L);
        location.setTimezone("Asia/Shanghai");
        location.setEnabled(true);
        location.setDeleted(0);
        lenient().when(locationMapper.selectById(31L)).thenReturn(location);
    }

    private DailyQuoteSnapshotEntity snapshot(long id, LocalDate date, String text) {
        DailyQuoteSnapshotEntity entity = new DailyQuoteSnapshotEntity();
        entity.setId(id);
        entity.setQuoteDate(date);
        entity.setText(text);
        entity.setSourceTitle("作品");
        entity.setCategoryCode("i");
        entity.setProviderCode("HITOKOTO");
        entity.setProviderUuid("uuid-" + id);
        entity.setSourceUrl("https://hitokoto.cn/sentences/uuid-" + id);
        entity.setFetchedAt(LocalDateTime.ofInstant(NOW.minusSeconds(60), ZoneOffset.UTC));
        entity.setDeleted(0);
        return entity;
    }

    private QuoteEntity localQuote(long id, String text) {
        QuoteEntity entity = new QuoteEntity();
        entity.setId(id);
        entity.setText(text);
        entity.setProviderCode("LOCAL");
        entity.setApprovalStatus("APPROVED");
        entity.setEnabled(true);
        entity.setDeleted(0);
        return entity;
    }
}
