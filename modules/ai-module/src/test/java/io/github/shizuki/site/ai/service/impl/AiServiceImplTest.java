package io.github.shizuki.site.ai.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.response.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.response.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.response.AiCompanionConfigResponse;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;
import io.github.shizuki.site.ai.response.AiMemoryScopeResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import io.github.shizuki.site.ai.request.AiTownAssetPreviewRequest;
import io.github.shizuki.site.ai.response.AiTownAssetPreviewResponse;
import io.github.shizuki.site.ai.response.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.response.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.response.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.response.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.response.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.response.AiWorldbookSummaryResponse;
import io.github.shizuki.site.ai.request.AiCharacterCreateRequest;
import io.github.shizuki.site.ai.request.AiCharacterImportRequest;
import io.github.shizuki.site.ai.request.CreateSessionRequest;
import io.github.shizuki.site.ai.request.CreateWorldbookRequest;
import io.github.shizuki.site.ai.request.SendMessageRequest;
import io.github.shizuki.site.ai.request.UpdateAiMemoryScopeRequest;
import io.github.shizuki.site.ai.request.UpdateCompanionConfigRequest;
import io.github.shizuki.site.ai.request.UpdateWorldbookRequest;
import io.github.shizuki.site.ai.request.UpsertWorldbookEntryRequest;
import io.github.shizuki.site.ai.entity.AiCharacterEntity;
import io.github.shizuki.site.ai.entity.AiCompanionProfileEntity;
import io.github.shizuki.site.ai.entity.AiMemoryScopeEntity;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.entity.AiTownAssetImportEntity;
import io.github.shizuki.site.ai.entity.AiWorldbookEntity;
import io.github.shizuki.site.ai.entity.AiWorldbookEntryEntity;
import io.github.shizuki.site.ai.integration.MemoryOsClient;
import io.github.shizuki.site.ai.integration.UserQuotaGateway;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiCompanionProfileMapper;
import io.github.shizuki.site.ai.mapper.AiMemoryScopeMapper;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.mapper.AiTownAssetImportMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookEntryMapper;
import io.github.shizuki.site.ai.mapper.AiWorldbookMapper;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.mock.web.MockMultipartFile;

class AiServiceImplTest {

    private AiQuotaUsageMapper aiQuotaUsageMapper;
    private AiCharacterMapper aiCharacterMapper;
    private AiCompanionProfileMapper aiCompanionProfileMapper;
    private AiMemoryScopeMapper aiMemoryScopeMapper;
    private AiSessionMapper aiSessionMapper;
    private AiMessageMapper aiMessageMapper;
    private AiTownAssetImportMapper aiTownAssetImportMapper;
    private AiWorldbookMapper aiWorldbookMapper;
    private AiWorldbookEntryMapper aiWorldbookEntryMapper;
    private MemoryOsClient memoryOsClient;
    private UserQuotaGateway userQuotaGateway;

    private AiServiceImpl aiService;

    @BeforeEach
    void setUp() {
        aiQuotaUsageMapper = Mockito.mock(AiQuotaUsageMapper.class);
        aiCharacterMapper = Mockito.mock(AiCharacterMapper.class);
        aiCompanionProfileMapper = Mockito.mock(AiCompanionProfileMapper.class);
        aiMemoryScopeMapper = Mockito.mock(AiMemoryScopeMapper.class);
        aiSessionMapper = Mockito.mock(AiSessionMapper.class);
        aiMessageMapper = Mockito.mock(AiMessageMapper.class);
        aiTownAssetImportMapper = Mockito.mock(AiTownAssetImportMapper.class);
        aiWorldbookMapper = Mockito.mock(AiWorldbookMapper.class);
        aiWorldbookEntryMapper = Mockito.mock(AiWorldbookEntryMapper.class);
        memoryOsClient = Mockito.mock(MemoryOsClient.class);
        userQuotaGateway = Mockito.mock(UserQuotaGateway.class);

        AiQuotaProperties aiQuotaProperties = new AiQuotaProperties();
        aiQuotaProperties.setCode("ai_round_total");
        aiQuotaProperties.setDefaultTotalRounds(20L);

        Mockito.when(userQuotaGateway.resolveQuota(ArgumentMatchers.anyString(), ArgumentMatchers.anySet(), ArgumentMatchers.anyLong()))
            .thenAnswer(invocation -> invocation.getArgument(2));

        aiService = new AiServiceImpl(
            aiQuotaUsageMapper,
            aiCharacterMapper,
            aiCompanionProfileMapper,
            aiMemoryScopeMapper,
            aiSessionMapper,
            aiMessageMapper,
            aiTownAssetImportMapper,
            aiWorldbookMapper,
            aiWorldbookEntryMapper,
            aiQuotaProperties,
            memoryOsClient,
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

        AiMessageSendResponse response = aiService.sendMessage("session-001", request);

        Assertions.assertEquals("tavern", response.mode());
        Assertions.assertEquals(1001L, response.characterId());
        Assertions.assertEquals(List.of(11L, 12L), response.worldbookIds());
        Assertions.assertEquals(Boolean.FALSE, response.memoryEnabled());
        Assertions.assertNull(response.scopeId());
        Assertions.assertTrue(response.assistantMessage().contains("Tavern mode"));
        Mockito.verify(memoryOsClient, Mockito.never()).retrieve(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Mockito.verify(memoryOsClient, Mockito.never()).record(
            ArgumentMatchers.anyString(),
            ArgumentMatchers.anyString(),
            ArgumentMatchers.anyString(),
            ArgumentMatchers.anyMap()
        );

        ArgumentCaptor<AiMessageEntity> messageCaptor = ArgumentCaptor.forClass(AiMessageEntity.class);
        Mockito.verify(aiMessageMapper, Mockito.times(2)).insert(messageCaptor.capture());
        List<AiMessageEntity> persistedMessages = messageCaptor.getAllValues();
        Assertions.assertEquals("user", persistedMessages.get(0).getRoleName());
        Assertions.assertEquals("assistant", persistedMessages.get(1).getRoleName());
        Mockito.verify(aiSessionMapper).updateById(ArgumentMatchers.any(AiSessionEntity.class));
        Mockito.verify(aiQuotaUsageMapper).updateById(ArgumentMatchers.any(AiQuotaUsageEntity.class));
    }

    @Test
    void shouldRejectGuestSendMessageWithZeroQuota() {
        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("游客也想发言");

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> aiService.sendMessage("session-guest", request)
        );

        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
        Mockito.verify(aiSessionMapper, Mockito.never()).selectOne(ArgumentMatchers.any());
    }

    @Test
    void shouldRejectNonAdminSceneModeSessionCreation() {
        LoginUserContext.set(new LoginUser(18L, Set.of("USER"), Set.of()));

        CreateSessionRequest request = new CreateSessionRequest();
        request.setTitle("图书馆管理员会话");
        request.setMode("town_npc");
        request.setTownRoomCode("library");
        request.setActorCode("librarian");

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> aiService.createSession(request)
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
        Mockito.verify(aiSessionMapper, Mockito.never()).insert(ArgumentMatchers.any(AiSessionEntity.class));
    }

    @Test
    void shouldRejectNonAdminSceneModeSendMessage() {
        LoginUserContext.set(new LoginUser(19L, Set.of("USER"), Set.of()));

        AiSessionEntity session = new AiSessionEntity();
        session.setId(880L);
        session.setSessionId("session-town-user");
        session.setUserId(19L);
        session.setMode("town_npc");
        session.setTownRoomCode("library");
        session.setActorCode("librarian");
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(session);

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("我想偷偷和特殊 NPC 聊天");
        request.setMemoryEnabled(Boolean.TRUE);

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> aiService.sendMessage("session-town-user", request)
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
        Mockito.verify(aiQuotaUsageMapper, Mockito.never()).selectOne(ArgumentMatchers.any());
        Mockito.verify(aiMessageMapper, Mockito.never()).insert(ArgumentMatchers.any(AiMessageEntity.class));
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
    void shouldCreateCharacterWithCanonicalPayload() throws Exception {
        LoginUserContext.set(new LoginUser(17L, Set.of("USER"), Set.of()));
        AtomicLong sequence = new AtomicLong(300);

        Mockito.doAnswer(invocation -> {
            AiCharacterEntity entity = invocation.getArgument(0);
            entity.setId(sequence.incrementAndGet());
            return 1;
        }).when(aiCharacterMapper).insert(ArgumentMatchers.any(AiCharacterEntity.class));

        AiCharacterCreateRequest request = new AiCharacterCreateRequest();
        request.setDisplayName("馆长 Haru");
        request.setPersona("安静而可靠");
        request.setDescription("负责夜间借阅。");
        request.setVisibilityType("private");
        request.setCoverAssetId(901L);

        var response = aiService.createCharacter(request);

        Assertions.assertEquals("馆长 Haru", response.displayName());
        Assertions.assertEquals("PRIVATE", response.visibilityType());
        Assertions.assertEquals("馆长 Haru", response.payload().get("displayName"));
        Assertions.assertEquals("安静而可靠", response.payload().get("persona"));
        Assertions.assertEquals("负责夜间借阅。", response.payload().get("description"));
        Assertions.assertEquals("PRIVATE", response.payload().get("visibilityType"));
        Assertions.assertEquals(901L, response.payload().get("coverAssetId"));

        ArgumentCaptor<AiCharacterEntity> captor = ArgumentCaptor.forClass(AiCharacterEntity.class);
        Mockito.verify(aiCharacterMapper).insert(captor.capture());
        AiCharacterEntity persisted = captor.getValue();
        Assertions.assertEquals("馆长 Haru", persisted.getDisplayName());
        Assertions.assertEquals(901L, persisted.getCoverAssetId());
        Assertions.assertEquals("PRIVATE", persisted.getVisibilityType());

        Map<String, Object> payload = new ObjectMapper().readValue(persisted.getPayloadJson(), Map.class);
        Assertions.assertEquals("馆长 Haru", payload.get("displayName"));
        Assertions.assertEquals("安静而可靠", payload.get("persona"));
        Assertions.assertEquals("负责夜间借阅。", payload.get("description"));
        Assertions.assertEquals("PRIVATE", payload.get("visibilityType"));
        Assertions.assertEquals(901, payload.get("coverAssetId"));
        Assertions.assertFalse(payload.containsKey("display_name"));
    }

    @Test
    void shouldImportCharacterCardWithCanonicalPayload() throws Exception {
        LoginUserContext.set(new LoginUser(17L, Set.of("USER"), Set.of()));
        AtomicLong sequence = new AtomicLong(400);

        Mockito.doAnswer(invocation -> {
            AiCharacterEntity entity = invocation.getArgument(0);
            entity.setId(sequence.incrementAndGet());
            return 1;
        }).when(aiCharacterMapper).insert(ArgumentMatchers.any(AiCharacterEntity.class));

        AiCharacterImportRequest request = new AiCharacterImportRequest();
        request.setDisplayName("夜班馆长");
        request.setRawCardJson("{\"name\":\"夜班馆长\"}");
        request.setCoverAssetId(902L);

        var response = aiService.importCharacterCard(request);

        Assertions.assertEquals("夜班馆长", response.displayName());
        Assertions.assertEquals("PRIVATE", response.visibilityType());
        Assertions.assertEquals("{\"name\":\"夜班馆长\"}", response.payload().get("rawCardJson"));
        Assertions.assertEquals(902L, response.payload().get("coverAssetId"));
        Assertions.assertFalse(response.payload().containsKey("visibilityType"));

        ArgumentCaptor<AiCharacterEntity> captor = ArgumentCaptor.forClass(AiCharacterEntity.class);
        Mockito.verify(aiCharacterMapper).insert(captor.capture());
        Map<String, Object> payload = new ObjectMapper().readValue(captor.getValue().getPayloadJson(), Map.class);
        Assertions.assertEquals("夜班馆长", payload.get("displayName"));
        Assertions.assertEquals("{\"name\":\"夜班馆长\"}", payload.get("rawCardJson"));
        Assertions.assertEquals(902, payload.get("coverAssetId"));
        Assertions.assertFalse(payload.containsKey("raw_card_json"));
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
        LoginUserContext.set(new LoginUser(12L, Set.of("ADMIN"), Set.of()));

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

        AtomicLong scopeSequence = new AtomicLong(1200);
        Mockito.when(aiSessionMapper.selectOne(ArgumentMatchers.any())).thenReturn(session);
        Mockito.when(aiQuotaUsageMapper.selectOne(ArgumentMatchers.any())).thenReturn(usage);
        Mockito.when(aiMemoryScopeMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.doAnswer(invocation -> {
            AiMemoryScopeEntity entity = invocation.getArgument(0);
            entity.setId(scopeSequence.incrementAndGet());
            return 1;
        }).when(aiMemoryScopeMapper).insert(ArgumentMatchers.any(AiMemoryScopeEntity.class));
        Mockito.when(memoryOsClient.isConfigured()).thenReturn(true);
        Mockito.when(memoryOsClient.retrieve(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.any()))
            .thenReturn(new MemoryOsClient.MemorySnapshot(
                "12:companion:my_home_ai:home",
                "偏好暖光和安静的书桌环境。",
                List.of("喜欢暖光", "偏好安静空间"),
                List.of("上次聊到喜欢木质书桌 -> companion 记住了"),
                List.of("你说想把灯调暖一点 -> companion 回应已记住")
            ));

        SendMessageRequest request = new SendMessageRequest();
        request.setMessage("你还记得我上次喜欢的风格吗？");
        request.setMemoryEnabled(Boolean.TRUE);

        AiMessageSendResponse response = aiService.sendMessage("session-companion", request);

        Assertions.assertEquals("12:companion:my_home_ai:home", response.scopeId());
        Assertions.assertTrue(response.assistantMessage().contains("profile=偏好暖光和安静的书桌环境"));
        Mockito.verify(memoryOsClient).record(
            ArgumentMatchers.eq("12:companion:my_home_ai:home"),
            ArgumentMatchers.eq("你还记得我上次喜欢的风格吗？"),
            ArgumentMatchers.contains("scope=12:companion:my_home_ai:home"),
            ArgumentMatchers.anyMap()
        );
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
    void shouldReturnDefaultAdminCompanionConfigWhenProfileMissing() {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));

        AiCompanionConfigResponse response = aiService.getAdminCompanionConfig();

        Assertions.assertEquals("my_home_ai", response.companionCode());
        Assertions.assertEquals("自宅 companion", response.displayName());
        Assertions.assertFalse(response.memoryEnabled());
        Assertions.assertTrue(response.worldbookIds().isEmpty());
    }

    @Test
    void shouldUpsertCompanionConfigAndCreateAdminCompanionSession() {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong profileSequence = new AtomicLong(700);
        AtomicLong sessionSequence = new AtomicLong(900);

        Mockito.doAnswer(invocation -> {
            AiCompanionProfileEntity entity = invocation.getArgument(0);
            entity.setId(profileSequence.incrementAndGet());
            return 1;
        }).when(aiCompanionProfileMapper).insert(ArgumentMatchers.any(AiCompanionProfileEntity.class));
        Mockito.doAnswer(invocation -> {
            AiSessionEntity entity = invocation.getArgument(0);
            entity.setId(sessionSequence.incrementAndGet());
            return 1;
        }).when(aiSessionMapper).insert(ArgumentMatchers.any(AiSessionEntity.class));

        AiWorldbookEntity ownedWorldbook = new AiWorldbookEntity();
        ownedWorldbook.setId(501L);
        Mockito.when(aiWorldbookMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(ownedWorldbook));

        UpdateCompanionConfigRequest request = new UpdateCompanionConfigRequest();
        request.setCompanionCode("my_home_ai");
        request.setDisplayName("小春");
        request.setPersonaPrompt("温柔、可靠，会记得我的习惯。");
        request.setAvatarAssetId(20001L);
        request.setWorldbookIds(List.of(501L));
        request.setMemoryEnabled(Boolean.TRUE);
        request.setScenePrompt("房间里有落地灯和书桌。");

        AiCompanionConfigResponse config = aiService.updateAdminCompanionConfig(request);

        AiCompanionProfileEntity persistedProfile = new AiCompanionProfileEntity();
        persistedProfile.setId(config.companionProfileId());
        persistedProfile.setOwnerUserId(66L);
        persistedProfile.setCompanionCode(config.companionCode());
        persistedProfile.setDisplayName(config.displayName());
        persistedProfile.setPersonaJson("""
            {"persona_prompt":"温柔、可靠，会记得我的习惯。"}
            """);
        persistedProfile.setAvatarAssetId(config.avatarAssetId());
        persistedProfile.setMemoryEnabled(1);
        persistedProfile.setBoundWorldbookJson("[501]");
        persistedProfile.setScenePrompt(config.scenePrompt());
        Mockito.when(aiCompanionProfileMapper.selectOne(ArgumentMatchers.any())).thenReturn(persistedProfile);

        AiSessionSummary summary = aiService.createAdminCompanionSession();

        Assertions.assertEquals("小春", config.displayName());
        Assertions.assertTrue(config.memoryEnabled());
        Assertions.assertEquals("companion", summary.mode());
        Assertions.assertEquals("home", summary.townRoomCode());
        Assertions.assertEquals("my_home_ai", summary.actorCode());
        Assertions.assertEquals(List.of(501L), summary.worldbookIds());

        ArgumentCaptor<AiSessionEntity> sessionCaptor = ArgumentCaptor.forClass(AiSessionEntity.class);
        Mockito.verify(aiSessionMapper).insert(sessionCaptor.capture());
        AiSessionEntity persistedSession = sessionCaptor.getValue();
        Assertions.assertEquals("companion", persistedSession.getMode());
        Assertions.assertEquals("home", persistedSession.getTownRoomCode());
        Assertions.assertEquals("my_home_ai", persistedSession.getActorCode());
        Assertions.assertTrue(String.valueOf(persistedSession.getScenePrompt()).contains("人格设定"));
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

    @Test
    void shouldImportTownAssetAndLoadPreview() throws Exception {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong assetSequence = new AtomicLong(1500);

        Mockito.doAnswer(invocation -> {
            AiTownAssetImportEntity entity = invocation.getArgument(0);
            entity.setId(assetSequence.incrementAndGet());
            return 1;
        }).when(aiTownAssetImportMapper).insert(ArgumentMatchers.any(AiTownAssetImportEntity.class));

        MockMultipartFile file = new MockMultipartFile(
            "file",
            "Map001.json",
            "application/json",
            """
                {
                  "width": 20,
                  "height": 15,
                  "tilesetId": 3,
                  "data": [1, 2, 3],
                  "events": [null, {"id": 1}, {"id": 2}]
                }
                """.getBytes()
        );

        AiTownAssetPreviewResponse imported = aiService.importAdminTownAsset(file, "library");

        Assertions.assertEquals("rpg_map", imported.assetType());
        Assertions.assertEquals("library", imported.attachedSceneCode());
        Assertions.assertTrue(imported.previewHighlights().stream().anyMatch(item -> item.contains("地图尺寸 20x15")));

        AiTownAssetImportEntity persisted = new AiTownAssetImportEntity();
        persisted.setId(imported.assetImportId());
        persisted.setAssetCode(imported.assetCode());
        persisted.setOwnerUserId(66L);
        persisted.setSourceName(imported.sourceName());
        persisted.setAssetType(imported.assetType());
        persisted.setParserStatus(imported.parserStatus());
        persisted.setAttachedSceneCode(imported.attachedSceneCode());
        persisted.setRawSizeBytes(imported.rawSizeBytes());
        persisted.setMetadataJson(new ObjectMapper().writeValueAsString(imported.metadata()));
        persisted.setPreviewJson(new ObjectMapper().writeValueAsString(imported.preview()));
        persisted.setUpdatedAt(imported.updatedAt());
        Mockito.when(aiTownAssetImportMapper.selectOne(ArgumentMatchers.any())).thenReturn(persisted);

        AiTownAssetPreviewRequest previewRequest = new AiTownAssetPreviewRequest();
        previewRequest.setAssetCode(imported.assetCode());
        AiTownAssetPreviewResponse preview = aiService.previewAdminTownAsset(previewRequest);

        Assertions.assertEquals(imported.assetCode(), preview.assetCode());
        Assertions.assertEquals("rpg_map", preview.assetType());
    }

    @Test
    void shouldImportZipTownAssetWithEmbeddedMapPreview() throws Exception {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong assetSequence = new AtomicLong(1600);

        Mockito.doAnswer(invocation -> {
            AiTownAssetImportEntity entity = invocation.getArgument(0);
            entity.setId(assetSequence.incrementAndGet());
            return 1;
        }).when(aiTownAssetImportMapper).insert(ArgumentMatchers.any(AiTownAssetImportEntity.class));

        MockMultipartFile file = new MockMultipartFile(
            "file",
            "TownBundle.zip",
            "application/zip",
            buildZipAsset(
                Map.of(
                    "data/Map001.json",
                    """
                        {
                          "width": 10,
                          "height": 8,
                          "data": [1, 2, 3],
                          "events": {"1": {"id": 1}}
                        }
                        """,
                    "img/Tilesets/town.png",
                    "fake-image"
                )
            )
        );

        AiTownAssetPreviewResponse imported = aiService.importAdminTownAsset(file, "library");

        Assertions.assertEquals("rpg_bundle", imported.assetType());
        Assertions.assertTrue(imported.previewHighlights().stream().anyMatch(item -> item.contains("检测到地图 JSON")));
        Assertions.assertEquals("library", imported.attachedSceneCode());
        Assertions.assertTrue(String.valueOf(imported.preview().get("embedded_map_preview")).contains("width=10"));
    }

    @Test
    void shouldImportImageTownAssetForAdminPreview() {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong assetSequence = new AtomicLong(1700);

        Mockito.doAnswer(invocation -> {
            AiTownAssetImportEntity entity = invocation.getArgument(0);
            entity.setId(assetSequence.incrementAndGet());
            return 1;
        }).when(aiTownAssetImportMapper).insert(ArgumentMatchers.any(AiTownAssetImportEntity.class));

        MockMultipartFile file = new MockMultipartFile(
            "file",
            "tileset.png",
            "image/png",
            new byte[] {1, 2, 3, 4}
        );

        AiTownAssetPreviewResponse imported = aiService.importAdminTownAsset(file, "home_gate");

        Assertions.assertEquals("tileset_image", imported.assetType());
        Assertions.assertEquals("home_gate", imported.attachedSceneCode());
        Assertions.assertTrue(imported.previewHighlights().stream().anyMatch(item -> item.contains("当前挂接场景：home_gate")));
    }

    @Test
    void shouldLoadPreviewBySceneCodeWhenAssetCodeMissing() throws Exception {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));

        AiTownAssetImportEntity persisted = new AiTownAssetImportEntity();
        persisted.setId(1701L);
        persisted.setAssetCode("rpg-scene-latest");
        persisted.setOwnerUserId(66L);
        persisted.setSourceName("Map001.json");
        persisted.setAssetType("rpg_map");
        persisted.setParserStatus("READY");
        persisted.setAttachedSceneCode("library");
        persisted.setRawSizeBytes(256L);
        persisted.setMetadataJson(new ObjectMapper().writeValueAsString(Map.of("width", 20, "height", 15)));
        persisted.setPreviewJson(new ObjectMapper().writeValueAsString(Map.of("preview_highlights", List.of("地图尺寸 20x15"))));
        Mockito.when(aiTownAssetImportMapper.selectOne(ArgumentMatchers.any())).thenReturn(persisted);

        AiTownAssetPreviewRequest request = new AiTownAssetPreviewRequest();
        request.setSceneCode("library");
        AiTownAssetPreviewResponse preview = aiService.previewAdminTownAsset(request);

        Assertions.assertEquals("rpg-scene-latest", preview.assetCode());
        Assertions.assertEquals("library", preview.attachedSceneCode());
    }

    @Test
    void shouldUpdateAndReadAdminMemoryScope() {
        LoginUserContext.set(new LoginUser(66L, Set.of("ADMIN"), Set.of()));
        AtomicLong scopeSequence = new AtomicLong(2100);

        Mockito.when(aiMemoryScopeMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);
        Mockito.doAnswer(invocation -> {
            AiMemoryScopeEntity entity = invocation.getArgument(0);
            entity.setId(scopeSequence.incrementAndGet());
            return 1;
        }).when(aiMemoryScopeMapper).insert(ArgumentMatchers.any(AiMemoryScopeEntity.class));
        Mockito.when(memoryOsClient.isConfigured()).thenReturn(false);

        UpdateAiMemoryScopeRequest request = new UpdateAiMemoryScopeRequest();
        request.setEnabled(Boolean.FALSE);
        request.setNote("图书馆作用域先暂停写回");
        request.setQuery("图书馆偏好");

        AiMemoryScopeResponse response = aiService.updateAdminMemoryScope("66:town_npc:librarian:library", request);

        Assertions.assertEquals("town_npc", response.domainType());
        Assertions.assertEquals("librarian", response.actorCode());
        Assertions.assertFalse(response.enabled());
        Assertions.assertEquals("图书馆作用域先暂停写回", response.note());
    }

    private byte[] buildZipAsset(Map<String, String> entries) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream, StandardCharsets.UTF_8)) {
            for (Map.Entry<String, String> entry : entries.entrySet()) {
                zipOutputStream.putNextEntry(new ZipEntry(entry.getKey()));
                zipOutputStream.write(entry.getValue().getBytes(StandardCharsets.UTF_8));
                zipOutputStream.closeEntry();
            }
        }
        return outputStream.toByteArray();
    }
}
