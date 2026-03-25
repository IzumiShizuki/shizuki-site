package io.github.shizuki.site.ai.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.dto.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.dto.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookSummaryResponse;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.CreateWorldbookRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.dto.UpdateWorldbookRequest;
import io.github.shizuki.site.ai.dto.UpsertWorldbookEntryRequest;
import io.github.shizuki.site.ai.entity.AiCharacterEntity;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.entity.AiWorldbookEntity;
import io.github.shizuki.site.ai.entity.AiWorldbookEntryEntity;
import io.github.shizuki.site.ai.integration.UserQuotaGateway;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookEntryMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookMapper;
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
    private AiWorldbookMapper aiWorldbookMapper;
    private AiWorldbookEntryMapper aiWorldbookEntryMapper;
    private UserQuotaGateway userQuotaGateway;

    private AiServiceImpl aiService;

    @BeforeEach
    void setUp() {
        aiQuotaUsageMapper = Mockito.mock(AiQuotaUsageMapper.class);
        aiCharacterMapper = Mockito.mock(AiCharacterMapper.class);
        aiSessionMapper = Mockito.mock(AiSessionMapper.class);
        aiMessageMapper = Mockito.mock(AiMessageMapper.class);
        aiWorldbookMapper = Mockito.mock(AiWorldbookMapper.class);
        aiWorldbookEntryMapper = Mockito.mock(AiWorldbookEntryMapper.class);
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
            aiWorldbookMapper,
            aiWorldbookEntryMapper,
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

    @Test
    void shouldListAndResolveCharacterMetadata() {
        LoginUserContext.set(new LoginUser(17L, Set.of("USER"), Set.of()));

        AiCharacterEntity entity = new AiCharacterEntity();
        entity.setId(301L);
        entity.setUserId(17L);
        entity.setTypeName("character_card_png");
        entity.setDisplayName("馆长 Haru");
        entity.setCoverAssetId(901L);
        entity.setVisibilityType("PRIVATE");
        entity.setPayloadJson("""
            {"display_name":"馆长 Haru","persona":"安静而可靠"}
            """);

        Mockito.when(aiCharacterMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(entity));
        Mockito.when(aiCharacterMapper.selectOne(ArgumentMatchers.any())).thenReturn(entity);

        List<AiCharacterSummaryResponse> characters = aiService.listCharacters();
        AiCharacterDetailResponse detail = aiService.getCharacter(301L);

        Assertions.assertEquals(1, characters.size());
        Assertions.assertEquals("馆长 Haru", characters.get(0).displayName());
        Assertions.assertEquals("character_card_png", characters.get(0).characterType());
        Assertions.assertEquals("馆长 Haru", detail.displayName());
        Assertions.assertEquals("安静而可靠", detail.payload().get("persona"));
    }

    @Test
    void shouldBatchWorldbookEntryCountsWhenListingWorldbooks() {
        LoginUserContext.set(new LoginUser(21L, Set.of("USER"), Set.of()));

        AiWorldbookEntity first = new AiWorldbookEntity();
        first.setId(501L);
        first.setWorldbookCode("worldbook-501");
        first.setTitle("图书馆设定集");
        first.setVisibilityType("PRIVATE");
        first.setEnabled(1);

        AiWorldbookEntity second = new AiWorldbookEntity();
        second.setId(502L);
        second.setWorldbookCode("worldbook-502");
        second.setTitle("雨夜设定集");
        second.setVisibilityType("PUBLIC");
        second.setEnabled(1);

        Mockito.when(aiWorldbookMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(first, second));
        Mockito.when(aiWorldbookEntryMapper.selectMaps(ArgumentMatchers.any())).thenReturn(List.of(
            Map.of("worldbook_id", 501L, "entry_count", 2L),
            Map.of("worldbook_id", 502L, "entry_count", 5L)
        ));

        List<AiWorldbookSummaryResponse> summaries = aiService.listWorldbooks();

        Assertions.assertEquals(2, summaries.size());
        AiWorldbookSummaryResponse firstSummary = (AiWorldbookSummaryResponse) summaries.get(0);
        AiWorldbookSummaryResponse secondSummary = (AiWorldbookSummaryResponse) summaries.get(1);
        Assertions.assertEquals(2, firstSummary.entryCount());
        Assertions.assertEquals(5, secondSummary.entryCount());
        Mockito.verify(aiWorldbookEntryMapper, Mockito.never()).selectCount(ArgumentMatchers.any());
    }

    @Test
    void shouldDeriveMemoryScopeForCompanionSession() {
        LoginUserContext.set(new LoginUser(12L, Set.of("USER"), Set.of()));

        AiSessionEntity session = new AiSessionEntity();
        session.setId(701L);
        session.setSessionId("session-companion");
        session.setUserId(12L);
        session.setMode("companion");
        session.setActorCode("my_home_ai");

        AiQuotaUsageEntity usage = new AiQuotaUsageEntity();
        usage.setId(901L);
        usage.setUserId(12L);
        usage.setQuotaCode("ai_round_total");
        usage.setTotalRounds(20L);
        usage.setUsedRounds(0L);

        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(session);
        Mockito.when(aiQuotaUsageMapper.selectOne(ArgumentMatchers.any())).thenReturn(usage);

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("你还记得我上次喜欢的风格吗？");
        request.setMemoryEnabled(Boolean.TRUE);

        Map<String, Object> response = aiService.sendMessage("session-companion", request);

        Assertions.assertEquals("12:companion:my_home_ai:home", response.get("scope_id"));
        Assertions.assertTrue(String.valueOf(response.get("assistant_message")).contains("12:companion:my_home_ai:home"));
    }

    @Test
    void shouldExposeTownScenesAndCreateAdminNpcSession() {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong sessionSequence = new AtomicLong(300);

        Mockito.doAnswer(invocation -> {
            AiSessionEntity entity = invocation.getArgument(0);
            entity.setId(sessionSequence.incrementAndGet());
            return 1;
        }).when(aiSessionMapper).insert(ArgumentMatchers.any(AiSessionEntity.class));

        List<AiTownSceneSummaryResponse> scenes = aiService.listTownScenes();
        AiTownSceneDetailResponse sceneDetail = aiService.getTownScene("library");
        AiTownPublicMapResponse publicMap = aiService.getTownPublicMap();
        AiSessionSummary sessionSummary = aiService.createAdminTownNpcSession("librarian");

        Assertions.assertEquals(3, scenes.size());
        Assertions.assertEquals("library", sceneDetail.sceneCode());
        Assertions.assertEquals(3, publicMap.scenes().size());
        Assertions.assertEquals("town_npc", sessionSummary.mode());
        Assertions.assertEquals("library", sessionSummary.townRoomCode());
        Assertions.assertEquals("librarian", sessionSummary.actorCode());

        ArgumentCaptor<AiSessionEntity> captor = ArgumentCaptor.forClass(AiSessionEntity.class);
        Mockito.verify(aiSessionMapper).insert(captor.capture());
        AiSessionEntity persisted = captor.getValue();
        Assertions.assertEquals("town_npc", persisted.getMode());
        Assertions.assertEquals("library", persisted.getTownRoomCode());
        Assertions.assertEquals("librarian", persisted.getActorCode());
    }

    @Test
    void shouldCreateWorldbookAndManageEntries() {
        LoginUserContext.set(new LoginUser(21L, Set.of("USER"), Set.of()));
        AtomicLong worldbookSequence = new AtomicLong(500);
        AtomicLong entrySequence = new AtomicLong(900);

        Mockito.doAnswer(invocation -> {
            AiWorldbookEntity entity = invocation.getArgument(0);
            entity.setId(worldbookSequence.incrementAndGet());
            return 1;
        }).when(aiWorldbookMapper).insert(ArgumentMatchers.any(AiWorldbookEntity.class));
        Mockito.doAnswer(invocation -> {
            AiWorldbookEntryEntity entity = invocation.getArgument(0);
            entity.setId(entrySequence.incrementAndGet());
            return 1;
        }).when(aiWorldbookEntryMapper).insert(ArgumentMatchers.any(AiWorldbookEntryEntity.class));

        CreateWorldbookRequest createRequest = new CreateWorldbookRequest();
        createRequest.setTitle("图书馆世界书");
        createRequest.setVisibilityType("PRIVATE");
        createRequest.setEnabled(Boolean.TRUE);

        AiWorldbookDetailResponse created = aiService.createWorldbook(createRequest);

        AiWorldbookEntity persistedWorldbook = new AiWorldbookEntity();
        persistedWorldbook.setId(created.worldbookId());
        persistedWorldbook.setWorldbookCode(created.worldbookCode());
        persistedWorldbook.setOwnerUserId(21L);
        persistedWorldbook.setTitle(created.title());
        persistedWorldbook.setVisibilityType("PRIVATE");
        persistedWorldbook.setEnabled(1);

        Mockito.when(aiWorldbookMapper.selectOne(ArgumentMatchers.any())).thenReturn(persistedWorldbook);

        UpsertWorldbookEntryRequest entryRequest = new UpsertWorldbookEntryRequest();
        entryRequest.setKeywords(List.of("图书馆", "夜间"));
        entryRequest.setContent("图书馆夜间会切换到安静模式。");
        entryRequest.setPriorityNum(10);
        entryRequest.setEnabled(Boolean.TRUE);

        AiWorldbookEntryResponse entry = aiService.createWorldbookEntry(created.worldbookId(), entryRequest);

        Assertions.assertEquals("图书馆世界书", created.title());
        Assertions.assertEquals(List.of("图书馆", "夜间"), entry.keywords());
        Assertions.assertEquals(10, entry.priorityNum());

        AiWorldbookEntryEntity persistedEntry = new AiWorldbookEntryEntity();
        persistedEntry.setId(entry.entryId());
        persistedEntry.setWorldbookId(created.worldbookId());
        persistedEntry.setKeywordJson("[\"图书馆\",\"夜间\"]");
        persistedEntry.setContent("图书馆夜间会切换到安静模式。");
        persistedEntry.setPriorityNum(10);
        persistedEntry.setEnabled(1);

        Mockito.when(aiWorldbookEntryMapper.selectOne(ArgumentMatchers.any())).thenReturn(persistedEntry);
        Mockito.when(aiWorldbookEntryMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(persistedEntry));

        UpdateWorldbookRequest updateRequest = new UpdateWorldbookRequest();
        updateRequest.setTitle("图书馆世界书 v2");
        updateRequest.setVisibilityType("PUBLIC");
        updateRequest.setEnabled(Boolean.FALSE);

        AiWorldbookDetailResponse updated = aiService.updateWorldbook(created.worldbookId(), updateRequest);

        Assertions.assertEquals("图书馆世界书 v2", updated.title());
        Assertions.assertEquals("PUBLIC", updated.visibilityType());
        Assertions.assertFalse(updated.enabled());
        Assertions.assertEquals(1, updated.entries().size());
    }
}
