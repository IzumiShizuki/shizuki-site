package io.github.shizuki.site.ai.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.request.UpdateAiSessionRequest;
import io.github.shizuki.site.ai.response.AiSessionListItemResponse;
import io.github.shizuki.site.ai.response.AiSessionMessagesResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class AiSessionMaintenanceServiceImplTest {

    private AiSessionMapper aiSessionMapper;
    private AiMessageMapper aiMessageMapper;

    private AiSessionMaintenanceServiceImpl service;

    @BeforeEach
    void setUp() {
        aiSessionMapper = Mockito.mock(AiSessionMapper.class);
        aiMessageMapper = Mockito.mock(AiMessageMapper.class);
        service = new AiSessionMaintenanceServiceImpl(aiSessionMapper, aiMessageMapper, new ObjectMapper());
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    private AiSessionEntity ownedSession() {
        AiSessionEntity session = new AiSessionEntity();
        session.setId(601L);
        session.setSessionId("session-abc");
        session.setUserId(9L);
        session.setTitle("旧标题");
        session.setMode("tavern");
        session.setCharacterId(1001L);
        session.setBoundWorldbookJson("[11, 12]");
        session.setScenePrompt("深夜图书馆");
        session.setDeleted(0);
        session.setVersion(0);
        return session;
    }

    private AiMessageEntity message(long id, String role, String content) {
        AiMessageEntity entity = new AiMessageEntity();
        entity.setId(id);
        entity.setSessionId(601L);
        entity.setUserId(9L);
        entity.setRoleName(role);
        entity.setContent(content);
        entity.setCreatedAt(LocalDateTime.of(2026, 7, 20, 12, 0));
        entity.setDeleted(0);
        return entity;
    }

    @Test
    void shouldListSessionSummariesWithUpdatedTimestamp() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        AiSessionEntity session = ownedSession();
        session.setUpdatedAt(LocalDateTime.of(2026, 7, 26, 9, 30));
        Mockito.when(aiSessionMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(session));

        List<AiSessionListItemResponse> items = service.listSessionSummaries();

        Assertions.assertEquals(1, items.size());
        AiSessionListItemResponse item = items.get(0);
        Assertions.assertEquals("session-abc", item.sessionId());
        Assertions.assertEquals("tavern", item.mode());
        Assertions.assertEquals(List.of(11L, 12L), item.worldbookIds());
        Assertions.assertNotNull(item.updatedAtEpochMs());
        Assertions.assertTrue(item.updatedAtEpochMs() > 0L);
    }

    @Test
    void shouldRejectGuestSummariesListing() {
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> service.listSessionSummaries()
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void shouldListSessionMessagesOldestFirst() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(ownedSession());
        Mockito.when(aiMessageMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(
            message(32L, "assistant", "你好，需要我做什么？"),
            message(31L, "user", "你好")
        ));

        AiSessionMessagesResponse response = service.listSessionMessages("session-abc", null);

        Assertions.assertEquals("session-abc", response.sessionId());
        Assertions.assertEquals("tavern", response.mode());
        Assertions.assertEquals(List.of(11L, 12L), response.worldbookIds());
        Assertions.assertEquals(2, response.messages().size());
        Assertions.assertEquals("user", response.messages().get(0).role());
        Assertions.assertEquals("你好", response.messages().get(0).content());
        Assertions.assertEquals("assistant", response.messages().get(1).role());
        Assertions.assertEquals(31L, response.messages().get(0).messageId());
    }

    @Test
    void shouldRejectGuestHistoryRead() {
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> service.listSessionMessages("session-abc", null)
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
        Mockito.verify(aiSessionMapper, Mockito.never()).selectOne(ArgumentMatchers.any());
    }

    @Test
    void shouldRejectHistoryReadForUnownedSession() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> service.listSessionMessages("session-of-others", null)
        );
        Assertions.assertEquals(ErrorCode.NOT_FOUND, exception.getErrorCode());
    }

    @Test
    void shouldRenameOwnedSession() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(ownedSession());

        UpdateAiSessionRequest request = new UpdateAiSessionRequest();
        request.setTitle("  新标题  ");

        AiSessionSummary summary = service.updateSession("session-abc", request);

        Assertions.assertEquals("新标题", summary.title());
        ArgumentCaptor<AiSessionEntity> captor = ArgumentCaptor.forClass(AiSessionEntity.class);
        Mockito.verify(aiSessionMapper).updateById(captor.capture());
        Assertions.assertEquals("新标题", captor.getValue().getTitle());
    }

    @Test
    void shouldRejectEmptyRenameTitle() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(ownedSession());

        UpdateAiSessionRequest request = new UpdateAiSessionRequest();
        request.setTitle("   ");

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> service.updateSession("session-abc", request)
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
        Mockito.verify(aiSessionMapper, Mockito.never()).updateById(ArgumentMatchers.any(AiSessionEntity.class));
    }

    @Test
    void shouldSoftDeleteOwnedSession() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(ownedSession());

        service.deleteSession("session-abc");

        ArgumentCaptor<AiSessionEntity> captor = ArgumentCaptor.forClass(AiSessionEntity.class);
        Mockito.verify(aiSessionMapper).updateById(captor.capture());
        Assertions.assertEquals(1, captor.getValue().getDeleted());
    }
}
