package io.github.shizuki.site.monolith.ops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.admin.entity.MeguriPromptCacheMetricsEntity;
import io.github.shizuki.site.admin.request.MeguriPromptCacheMetricsRequest;
import io.github.shizuki.site.monolith.config.MeguriPromptCacheMetricsProperties;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class MeguriPromptCacheMetricsServiceTest {

    @Test
    void authenticatesAndPersistsContentFreeSnapshot() {
        MeguriPromptCacheMetricsMapper mapper = Mockito.mock(MeguriPromptCacheMetricsMapper.class);
        MeguriPromptCacheMetricsProperties properties = new MeguriPromptCacheMetricsProperties();
        properties.setIngestToken("metrics-secret");
        Clock clock = Clock.fixed(Instant.parse("2026-07-22T09:00:00Z"), ZoneOffset.UTC);
        MeguriPromptCacheMetricsService service = new MeguriPromptCacheMetricsService(
            mapper, properties, new ObjectMapper(), clock);

        service.ingest(snapshot(), "metrics-secret");

        ArgumentCaptor<MeguriPromptCacheMetricsEntity> captor = ArgumentCaptor.forClass(MeguriPromptCacheMetricsEntity.class);
        Mockito.verify(mapper).insert(captor.capture());
        assertEquals("meguri-desktop", captor.getValue().getSourceId());
        assertFalse(captor.getValue().getPayloadJson().contains("persona"));
        assertEquals(LocalDateTime.of(2026, 7, 22, 9, 0), captor.getValue().getReceivedAt());
    }

    @Test
    void rejectsInvalidIngestToken() {
        MeguriPromptCacheMetricsMapper mapper = Mockito.mock(MeguriPromptCacheMetricsMapper.class);
        MeguriPromptCacheMetricsProperties properties = new MeguriPromptCacheMetricsProperties();
        properties.setIngestToken("metrics-secret");
        MeguriPromptCacheMetricsService service = new MeguriPromptCacheMetricsService(
            mapper, properties, new ObjectMapper(), Clock.systemUTC());

        assertThrows(BusinessException.class, () -> service.ingest(snapshot(), "wrong"));
        Mockito.verify(mapper, Mockito.never())
            .insert(Mockito.<MeguriPromptCacheMetricsEntity>any());
    }

    private MeguriPromptCacheMetricsRequest snapshot() {
        return new MeguriPromptCacheMetricsRequest(
            "meguri-desktop",
            "2026-07-22T08:59:00Z",
            "2026-07-22T08:00:00Z",
            "openai-compatible/langchain4j",
            "deepseek-chat",
            "provider_managed_prefix_cache",
            "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef",
            800L,
            2L,
            1L,
            1L,
            1L,
            1L,
            120L,
            20L,
            140L,
            80L,
            40L,
            2.0 / 3.0,
            0.5,
            "ready",
            "",
            "ok",
            "2026-07-22T08:59:00Z",
            "",
            List.of(),
            List.of()
        );
    }
}
