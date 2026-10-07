package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.shizuki.site.user.mapper.UserDailyArtMapper;
import io.github.shizuki.site.user.service.security.MusicApiKeyCryptoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class DailyArtServiceTest {
    private final ObjectMapper mapper = new ObjectMapper();
    private final UserDailyArtMapper repository = mock(UserDailyArtMapper.class);
    private final PixivClient pixiv = mock(PixivClient.class);
    private final MusicApiKeyCryptoService crypto = mock(MusicApiKeyCryptoService.class);
    private final Map<Long, ObjectNode> configs = new HashMap<>();
    private final Map<Long, ObjectNode> days = new HashMap<>();
    private DailyArtService service;

    @BeforeEach void setup() throws Exception {
        service = new DailyArtService(repository, crypto, pixiv, mapper,
                Clock.fixed(Instant.parse("2026-10-07T16:01:00Z"), ZoneOffset.UTC));
        when(repository.config(anyLong())).thenAnswer(call -> configs.getOrDefault(call.getArgument(0), mapper.createObjectNode()).toString());
        when(repository.daily(anyLong())).thenAnswer(call -> days.getOrDefault(call.getArgument(0), mapper.createObjectNode()).toString());
        doAnswer(call -> {
            Long user = call.getArgument(0);
            ObjectNode patch = (ObjectNode) mapper.readTree((String) call.getArgument(1));
            configs.computeIfAbsent(user, ignored -> mapper.createObjectNode()).setAll(patch);
            return null;
        }).when(repository).patchConfig(anyLong(), anyString());
        doAnswer(call -> {
            Long user = call.getArgument(0);
            ObjectNode incoming = (ObjectNode) mapper.readTree((String) call.getArgument(1));
            ObjectNode old = days.get(user);
            if (old != null && old.path("date").equals(incoming.path("date"))) incoming.setAll(old);
            days.put(user, incoming);
            return null;
        }).when(repository).saveDaily(anyLong(), anyString());
        when(pixiv.search(anyString())).thenAnswer(call -> List.of(work("999", call.getArgument(0))));
    }
    @AfterEach void cleanup() { service.close(); }
    private JsonNode work(String id, String tag) {
        ObjectNode work = mapper.createObjectNode().put("id", id).put("userId", "42").put("userName", "画师").put("title", "作品");
        work.putArray("tags").add(tag);
        return work;
    }

    @Test void persistsSuccessfulSectionsAndUsesShanghaiDateAcrossServiceRestarts() {
        configs.put(7L, mapper.createObjectNode());
        configs.get(7L).putArray("manual_artists").add(mapper.createObjectNode().put("id", "42"));
        doReturn(List.of(work("123", "妹"))).when(pixiv).latest("42");
        ObjectNode first = service.today(7L);
        assertThat(first.path("date").asText()).isEqualTo("2026-10-08");
        assertThat(first.path("artworks").size()).isEqualTo(1);
        clearInvocations(pixiv);
        DailyArtService restarted = new DailyArtService(repository, crypto, pixiv, mapper,
                Clock.fixed(Instant.parse("2026-10-07T16:02:00Z"), ZoneOffset.UTC));
        try {
            assertThat(restarted.today(7L).path("wife")).isEqualTo(first.path("wife"));
            verifyNoInteractions(pixiv);
        } finally { restarted.close(); }
    }

    @Test void retriesMissingRecommendationsWithoutRedrawingSuccessfulWife() {
        configs.put(7L, mapper.createObjectNode());
        configs.get(7L).putArray("manual_artists").add(mapper.createObjectNode().put("id", "42"));
        when(pixiv.latest("42")).thenThrow(new RuntimeException("unavailable"));
        ObjectNode first = service.today(7L);
        assertThat(first.path("recommendation_state").asText()).isEqualTo("unavailable");
        doReturn(List.of(work("123", "妹"))).when(pixiv).latest("42");
        clearInvocations(pixiv);
        ObjectNode recovered = service.today(7L);
        assertThat(recovered.path("artworks").size()).isEqualTo(1);
        assertThat(recovered.path("wife")).isEqualTo(first.path("wife"));
        verify(pixiv, never()).search(anyString());
    }

    @Test void encryptsVerifiedSessionAndNeverReturnsCipherOrPlaintext() throws Exception {
        when(pixiv.following("42", "42_abcdefghijklmnop", 0, 48, false))
                .thenReturn(mapper.readTree("{\"users\":[{\"userId\":\"50\",\"userName\":\"画师\"}],\"total\":1}"));
        when(pixiv.user("42")).thenReturn(mapper.createObjectNode().put("name", "Pixiv昵称"));
        when(crypto.encrypt("42_abcdefghijklmnop")).thenReturn("encrypted-value");
        ObjectNode response = service.connect(7L, "42", "PHPSESSID=42_abcdefghijklmnop; other=ignored");
        assertThat(configs.get(7L).path("session_cipher").asText()).isEqualTo("encrypted-value");
        assertThat(response.toString()).doesNotContain("encrypted-value", "abcdefghijklmnop", "session_cipher");
        assertThat(service.settings(8L).path("connected").asBoolean()).isFalse();
    }

    @Test void rejectsMismatchedOrFailedSessionsBeforeSaving() {
        assertThatThrownBy(() -> service.connect(7L, "43", "42_abcdefghijklmnop")).hasMessageContaining("不匹配");
        verifyNoInteractions(repository, pixiv, crypto);
        when(pixiv.following(anyString(), anyString(), anyInt(), anyInt(), anyBoolean())).thenThrow(PixivClient.bad("失效"));
        assertThatThrownBy(() -> service.connect(7L, "42", "42_abcdefghijklmnop")).hasMessageContaining("失效");
        verify(repository, never()).patchConfig(anyLong(), anyString());
    }

    @Test void disconnectRemovesImportedFollowsButRetainsManualArtistsAndDailySelection() throws Exception {
        configs.put(7L, (ObjectNode) mapper.readTree("{\"session_cipher\":\"cipher\",\"account_id\":\"42\",\"manual_artists\":[{\"id\":\"50\"}],\"followed_artists\":[{\"id\":\"51\"}]}"));
        ObjectNode result = service.disconnect(7L);
        assertThat(result.path("connected").asBoolean()).isFalse();
        assertThat(result.path("manual_artists").size()).isEqualTo(1);
        assertThat(result.path("followed_artists").size()).isZero();
        assertThat(configs.get(7L).path("session_cipher").asText()).isEmpty();
        verify(repository, never()).saveDaily(anyLong(), anyString());
    }

    @Test void reportsTruncatedSyncAndRejectsAConnectionChangedDuringSync() throws Exception {
        configs.put(7L, (ObjectNode) mapper.readTree("{\"session_cipher\":\"cipher\",\"account_id\":\"42\"}"));
        when(crypto.decrypt("cipher")).thenReturn("42_abcdefghijklmnop");
        ObjectNode page = mapper.createObjectNode().put("total", 300);
        for (int i = 0; i < 48; i++) page.withArray("users").add(mapper.createObjectNode().put("userId", String.valueOf(100 + i)).put("userName", "画师"));
        when(pixiv.following(anyString(), anyString(), anyInt(), anyInt(), eq(false))).thenReturn(page);
        when(repository.patchConnectedConfig(eq(7L), anyString(), eq("cipher"))).thenAnswer(call -> {
            configs.get(7L).setAll((ObjectNode) mapper.readTree((String) call.getArgument(1)));
            return 1;
        });
        assertThat(service.sync(7L, false).path("truncated").asBoolean()).isTrue();
        verify(pixiv, times(5)).following(anyString(), anyString(), anyInt(), anyInt(), eq(false));
        when(repository.patchConnectedConfig(anyLong(), anyString(), anyString())).thenReturn(0);
        assertThatThrownBy(() -> service.sync(7L, false)).hasMessageContaining("关联已更新");
    }
}
