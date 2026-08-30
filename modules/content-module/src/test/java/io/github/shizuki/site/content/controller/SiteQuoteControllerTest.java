package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.service.widget.DailyQuoteQueryService;
import io.github.shizuki.site.content.service.widget.DailyQuoteState;
import io.github.shizuki.site.content.service.widget.DailyQuoteView;
import java.time.Instant;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;

@ExtendWith(MockitoExtension.class)
class SiteQuoteControllerTest {

    @Mock
    private DailyQuoteQueryService queryService;

    @Test
    void todayIsPubliclyCacheableAndKeepsSnapshotProvenance() {
        DailyQuoteView view = currentQuote();
        when(queryService.today()).thenReturn(view);

        var response = controller().today();

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("max-age=300, public");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().data()).isEqualTo(view);
        assertThat(response.getBody().data().providerCode()).isEqualTo("HITOKOTO");
        verify(queryService).today();
    }

    @Test
    void alternativeIsPrivateNoStoreAndUsesCursor() {
        DailyQuoteView alternative = new DailyQuoteView(
            null,
            12L,
            null,
            "本地备选",
            "Shizuki",
            null,
            "LOCAL",
            "LOCAL",
            null,
            null,
            null,
            DailyQuoteState.LOCAL_ALTERNATIVE
        );
        when(queryService.alternative(11L)).thenReturn(alternative);

        var response = controller().alternative(11L);

        assertThat(response.getHeaders().getCacheControl()).isEqualTo("private, no-store, max-age=0");
        assertThat(response.getHeaders().getFirst(HttpHeaders.PRAGMA)).isEqualTo("no-cache");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().data()).isEqualTo(alternative);
        verify(queryService).alternative(11L);
    }

    private SiteQuoteController controller() {
        return new SiteQuoteController(queryService);
    }

    private DailyQuoteView currentQuote() {
        return new DailyQuoteView(
            8L,
            null,
            LocalDate.of(2026, 8, 28),
            "今日一言",
            "作者",
            "出处",
            "a",
            "HITOKOTO",
            "provider-id",
            "https://hitokoto.cn/",
            Instant.parse("2026-08-28T08:00:00Z"),
            DailyQuoteState.CURRENT
        );
    }
}
