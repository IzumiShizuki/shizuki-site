package io.github.shizuki.site.ai.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.integration.UserQuotaGateway;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class AiServiceImplTest {

    private AiQuotaUsageMapper aiQuotaUsageMapper;
    private AiCharacterMapper aiCharacterMapper;
    private AiSessionMapper aiSessionMapper;
    private AiMessageMapper aiMessageMapper;
    private UserQuotaGateway userQuotaGateway;

    private AiServiceImpl aiService;

    @BeforeEach
    void setUp() {
        aiQuotaUsageMapper = Mockito.mock(AiQuotaUsageMapper.class);
        aiCharacterMapper = Mockito.mock(AiCharacterMapper.class);
        aiSessionMapper = Mockito.mock(AiSessionMapper.class);
        aiMessageMapper = Mockito.mock(AiMessageMapper.class);
        userQuotaGateway = Mockito.mock(UserQuotaGateway.class);

        AiQuotaProperties aiQuotaProperties = new AiQuotaProperties();
        aiQuotaProperties.setCode("ai_round_total");
        aiQuotaProperties.setDefaultTotalRounds(20L);

        Mockito.when(userQuotaGateway.resolveQuota(ArgumentMatchers.anyString(), ArgumentMatchers.anySet(), ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> invocation.getArgument(2));

        aiService = new AiServiceImpl(
            aiQuotaUsageMapper,
            aiCharacterMapper,
            aiSessionMapper,
            aiMessageMapper,
            aiQuotaProperties,
            userQuotaGateway,
            new ObjectMapper()
        );
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldPersistLoggedInSessionWithModeBindings() {
        LoginUserContext.set(new LoginUser(7L, Set.of("USER"), Set.of()));
        AtomicLong sequence = new AtomicLong(100);

        Mockito.doAnswer(invocation -> {
            AiSessionEntity entity = invocation.getArgument(0);
            entity.setId(sequence.incrementAndGet());
            return 1;
        }).when(aiSessionMapper).insert(ArgumentMatchers.any(AiSessionEntity.class));

        CreateSessionRequest request = new CreateSessionRequest();
        request.setTitle("深夜图书馆");
        request.setMode("tavern");
        request.setCharacterId(1001L);
        request.setWorldbookIds(List.of(11L, 12L, 12L));
        request.setScenePrompt("雨夜、书架、暖色台灯");

        AiSessionSummary summary = aiService.createSession(request);

        Assertions.assertEquals("tavern", summary.mode());
        Assertions.assertEquals(1001L, summary.characterId());
        Assertions.assertEquals(List.of(11L, 12L), summary.worldbookIds());

        ArgumentCaptor<AiSessionEntity> captor = ArgumentCaptor.forClass(AiSessionEntity.class);
        Mockito.verify(aiSessionMapper).insert(captor.capture());
        AiSessionEntity persisted = captor.getValue();
        Assertions.assertEquals(7L, persisted.getUserId());
        Assertions.assertEquals("tavern", persisted.getMode());
        Assertions.assertEquals(1001L, persisted.getCharacterId());
        Assertions.assertTrue(String.valueOf(persisted.getBoundWorldbookJson()).contains("11"));
        Assertions.assertEquals("雨夜、书架、暖色台灯", persisted.getScenePrompt());
    }

    @Test
    void shouldReturnEphemeralSessionSummaryForGuest() {
        CreateSessionRequest request = new CreateSessionRequest();
        request.setTitle("游客临时会话");
        request.setMode("normal");

        AiSessionSummary summary = aiService.createSession(request);

        Assertions.assertEquals("normal", summary.mode());
        Assertions.assertEquals("游客临时会话", summary.title());
        Mockito.verify(aiSessionMapper, Mockito.never()).insert(ArgumentMatchers.any(AiSessionEntity.class));
    }

    @Test
    void shouldPersistMessagesAndReturnModeSpecificResponse() {
        LoginUserContext.set(new LoginUser(9L, Set.of("USER"), Set.of()));

        AiSessionEntity session = new AiSessionEntity();
        session.setId(501L);
        session.setSessionId("session-001");
        session.setUserId(9L);
        session.setTitle("图书馆夜话");
        session.setMode("tavern");
        session.setCharacterId(1001L);
        session.setBoundWorldbookJson("[11,12]");
        session.setScenePrompt("深夜图书馆");

        AiQuotaUsageEntity usage = new AiQuotaUsageEntity();
        usage.setId(801L);
        usage.setUserId(9L);
        usage.setQuotaCode("ai_round_total");
        usage.setTotalRounds(20L);
        usage.setUsedRounds(2L);

        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(session);
        Mockito.when(aiQuotaUsageMapper.selectOne(ArgumentMatchers.any())).thenReturn(usage);

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("今晚适合读什么？");
        request.setMemoryEnabled(Boolean.TRUE);
        request.setScopeId("session-001");

        Map<String, Object> response = aiService.sendMessage("session-001", request);

        Assertions.assertEquals("tavern", response.get("mode"));
        Assertions.assertEquals(1001L, response.get("character_id"));
        Assertions.assertEquals(List.of(11L, 12L), response.get("worldbook_ids"));
        Assertions.assertEquals(Boolean.TRUE, response.get("memory_enabled"));
        Assertions.assertTrue(String.valueOf(response.get("assistant_message")).contains("Tavern mode"));

        ArgumentCaptor<AiMessageEntity> messageCaptor = ArgumentCaptor.forClass(AiMessageEntity.class);
        Mockito.verify(aiMessageMapper, Mockito.times(2)).insert(messageCaptor.capture());
        List<AiMessageEntity> persistedMessages = messageCaptor.getAllValues();
        Assertions.assertEquals("user", persistedMessages.get(0).getRoleName());
        Assertions.assertEquals("assistant", persistedMessages.get(1).getRoleName());
        Mockito.verify(aiSessionMapper).updateById(ArgumentMatchers.any(AiSessionEntity.class));
        Mockito.verify(aiQuotaUsageMapper).updateById(ArgumentMatchers.any(AiQuotaUsageEntity.class));
    }

    @Test
    void shouldListPersistedSessionsForCurrentUser() {
        LoginUserContext.set(new LoginUser(5L, Set.of("USER"), Set.of()));

        AiSessionEntity normal = new AiSessionEntity();
        normal.setSessionId("session-normal");
        normal.setTitle("普通对话");
        normal.setMode("normal");

        AiSessionEntity tavern = new AiSessionEntity();
        tavern.setSessionId("session-tavern");
        tavern.setTitle("酒馆对话");
        tavern.setMode("tavern");
        tavern.setCharacterId(77L);
        tavern.setBoundWorldbookJson("[8,9]");
        tavern.setScenePrompt("雨天酒馆");

        Mockito.when(aiSessionMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(tavern, normal));

        List<AiSessionSummary> sessions = aiService.listSessions();

        Assertions.assertEquals(2, sessions.size());
        Assertions.assertEquals("tavern", sessions.get(0).mode());
        Assertions.assertEquals(List.of(8L, 9L), sessions.get(0).worldbookIds());
        Assertions.assertEquals("normal", sessions.get(1).mode());
    }
}
