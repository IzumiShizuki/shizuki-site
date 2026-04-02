package io.github.shizuki.site.ai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.response.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.response.AiCharacterCreateResponse;
import io.github.shizuki.site.ai.response.AiCharacterImportResponse;
import io.github.shizuki.site.ai.response.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.response.AiCompanionConfigResponse;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;
import io.github.shizuki.site.ai.response.AiMemoryScopeResponse;
import io.github.shizuki.site.ai.response.AiQuotaStatusResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import io.github.shizuki.site.ai.response.AiTownMapNodeResponse;
import io.github.shizuki.site.ai.response.AiTownNpcResponse;
import io.github.shizuki.site.ai.request.AiCharacterCreateRequest;
import io.github.shizuki.site.ai.request.AiCharacterImportRequest;
import io.github.shizuki.site.ai.request.AiTownAssetPreviewRequest;
import io.github.shizuki.site.ai.response.AiTownAssetPreviewResponse;
import io.github.shizuki.site.ai.response.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.response.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.response.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.response.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.response.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.response.AiWorldbookSummaryResponse;
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
import io.github.shizuki.site.ai.service.AiService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class AiServiceImpl implements AiService {

    private static final String DEFAULT_SESSION_MODE = "quick_chat";
    private static final String DEFAULT_VISIBILITY_TYPE = "PRIVATE";
    private static final String DEFAULT_COMPANION_CODE = "my_home_ai";
    private static final String DEFAULT_COMPANION_SCENE_CODE = "home";
    private static final int MAX_LIST_SESSIONS = 50;
    private static final int MAX_LIST_CHARACTERS = 100;
    private static final int MAX_LIST_WORLDBOOKS = 100;
    private static final Set<String> SUPPORTED_SESSION_MODES = Set.of("quick_chat", "normal", "tavern", "town_npc", "companion");
    private static final Set<String> SUPPORTED_VISIBILITY_TYPES = Set.of("PRIVATE", "PUBLIC");
    private static final Set<String> MEMORY_SCENE_SESSION_MODES = Set.of("town_npc", "companion");

    private final AiQuotaUsageMapper aiQuotaUsageMapper;
    private final AiCharacterMapper aiCharacterMapper;
    private final AiCompanionProfileMapper aiCompanionProfileMapper;
    private final AiMemoryScopeMapper aiMemoryScopeMapper;
    private final AiSessionMapper aiSessionMapper;
    private final AiMessageMapper aiMessageMapper;
    private final AiTownAssetImportMapper aiTownAssetImportMapper;
    private final AiWorldbookMapper aiWorldbookMapper;
    private final AiWorldbookEntryMapper aiWorldbookEntryMapper;
    private final AiQuotaProperties aiQuotaProperties;
    private final MemoryOsClient memoryOsClient;
    private final UserQuotaGateway userQuotaClient;
    private final ObjectMapper objectMapper;

    public AiServiceImpl(AiQuotaUsageMapper aiQuotaUsageMapper,
                         AiCharacterMapper aiCharacterMapper,
                         AiCompanionProfileMapper aiCompanionProfileMapper,
                         AiMemoryScopeMapper aiMemoryScopeMapper,
                         AiSessionMapper aiSessionMapper,
                         AiMessageMapper aiMessageMapper,
                         AiTownAssetImportMapper aiTownAssetImportMapper,
                         AiWorldbookMapper aiWorldbookMapper,
                         AiWorldbookEntryMapper aiWorldbookEntryMapper,
                         AiQuotaProperties aiQuotaProperties,
                         MemoryOsClient memoryOsClient,
                         UserQuotaGateway userQuotaClient,
                         ObjectMapper objectMapper) {
        this.aiQuotaUsageMapper = aiQuotaUsageMapper;
        this.aiCharacterMapper = aiCharacterMapper;
        this.aiCompanionProfileMapper = aiCompanionProfileMapper;
        this.aiMemoryScopeMapper = aiMemoryScopeMapper;
        this.aiSessionMapper = aiSessionMapper;
        this.aiMessageMapper = aiMessageMapper;
        this.aiTownAssetImportMapper = aiTownAssetImportMapper;
        this.aiWorldbookMapper = aiWorldbookMapper;
        this.aiWorldbookEntryMapper = aiWorldbookEntryMapper;
        this.aiQuotaProperties = aiQuotaProperties;
        this.memoryOsClient = memoryOsClient;
        this.userQuotaClient = userQuotaClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public AiSessionSummary createSession(CreateSessionRequest request) {
        String mode = normalizeSessionMode(request.getMode());
        if (MEMORY_SCENE_SESSION_MODES.contains(mode)) {
            requireLoginUserId();
            requireAdminRole();
        }
        Long userId = currentUserIdOrNull();
        String sessionCode = "session-" + UUID.randomUUID();

        AiSessionSummary summary = new AiSessionSummary(
            sessionCode,
            normalizeTitle(request.getTitle()),
            mode,
            normalizePositiveLong(request.getCharacterId()),
            normalizeWorldbookIds(request.getWorldbookIds()),
            normalizeOptionalText(request.getScenePrompt()),
            normalizeCode(request.getTownRoomCode()),
            normalizeCode(request.getActorCode())
        );

        if (!isLoggedIn(userId)) {
            return summary;
        }

        LocalDateTime now = LocalDateTime.now();
        AiSessionEntity entity = new AiSessionEntity();
        entity.setSessionId(summary.sessionId());
        entity.setUserId(userId);
        entity.setTitle(summary.title());
        entity.setMode(summary.mode());
        entity.setCharacterId(summary.characterId());
        entity.setBoundWorldbookJson(toJsonValue(summary.worldbookIds()));
        entity.setScenePrompt(summary.scenePrompt());
        entity.setTownRoomCode(summary.townRoomCode());
        entity.setActorCode(summary.actorCode());
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiSessionMapper.insert(entity);
        return toSummary(entity);
    }

    @Override
    public List<AiSessionSummary> listSessions() {
        Long userId = currentUserIdOrNull();
        if (!isLoggedIn(userId)) {
            return List.of();
        }
        return aiSessionMapper.selectList(
                new LambdaQueryWrapper<AiSessionEntity>()
                    .eq(AiSessionEntity::getUserId, userId)
                    .eq(AiSessionEntity::getDeleted, 0)
                    .orderByDesc(AiSessionEntity::getUpdatedAt)
                    .last("LIMIT " + MAX_LIST_SESSIONS)
            ).stream()
            .map(this::toSummary)
            .toList();
    }

    @Override
    public AiMessageSendResponse sendMessage(String sessionId, SendMessageRequest request) {
        Long userId = requireLoginUserId();
        AiSessionEntity session = loadOwnedSession(sessionId, userId);
        String sessionMode = normalizeSessionMode(session.getMode());
        if (MEMORY_SCENE_SESSION_MODES.contains(sessionMode)) {
            requireAdminRole();
        }
        List<Long> worldbookIds = parseWorldbookIds(session.getBoundWorldbookJson());
        boolean memoryEnabled = Boolean.TRUE.equals(request.getMemoryEnabled());
        String normalizedMessage = request.getMessage().trim();
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();

        long total = resolveTotalQuota();
        AiQuotaUsageEntity usage = loadOrCreateUsage(userId, total);
        boolean unlimitedQuota = usage.getTotalRounds() != null && usage.getTotalRounds() < 0;
        long next = usage.getUsedRounds() + 1;
        if (!unlimitedQuota && next > usage.getTotalRounds()) {
            throw new BusinessException(
                ErrorCode.FORBIDDEN,
                "AI quota exhausted",
                Map.of(
                    "quota_code", usage.getQuotaCode(),
                    "total", usage.getTotalRounds(),
                    "used", usage.getUsedRounds(),
                    "remaining", 0
                )
            );
        }

        usage.setUsedRounds(next);
        usage.setUpdatedAt(LocalDateTime.now());
        aiQuotaUsageMapper.updateById(usage);

        MemoryConversationContext memoryContext = buildMemoryContext(sessionMode, session, userId, request, memoryEnabled, normalizedMessage);
        String assistantMessage = buildAssistantReply(
            sessionMode,
            session,
            worldbookIds,
            normalizedMessage,
            contextSize,
            memoryContext.enabled(),
            memoryContext.scopeId(),
            memoryContext
        );

        persistMessage(session.getId(), userId, "user", normalizedMessage);
        persistMessage(session.getId(), userId, "assistant", assistantMessage);
        session.setUpdatedAt(LocalDateTime.now());
        aiSessionMapper.updateById(session);
        if (memoryContext.shouldPersistRecord()) {
            writeMemoryRecord(memoryContext, session, normalizedMessage, assistantMessage);
        }

        return new AiMessageSendResponse(
            sessionId,
            normalizedMessage,
            assistantMessage,
            sessionMode,
            contextSize,
            memoryContext.enabled(),
            memoryContext.scopeId(),
            true,
            session.getCharacterId(),
            worldbookIds,
            session.getScenePrompt(),
            session.getTownRoomCode(),
            session.getActorCode(),
            usage.getQuotaCode(),
            usage.getTotalRounds(),
            usage.getUsedRounds(),
            unlimitedQuota ? -1 : Math.max(0, usage.getTotalRounds() - usage.getUsedRounds()),
            memoryContext.summaryHighlights(),
            memoryContext.journalHighlights()
        );
    }

    @Override
    public AiQuotaStatusResponse myQuota() {
        Long userId = requireLoginUserId();
        long total = resolveTotalQuota();
        AiQuotaUsageEntity usage = loadOrCreateUsage(userId, total);
        long remaining = usage.getTotalRounds() != null && usage.getTotalRounds() < 0
            ? -1
            : Math.max(0, usage.getTotalRounds() - usage.getUsedRounds());

        return new AiQuotaStatusResponse(
            usage.getQuotaCode(),
            usage.getTotalRounds(),
            usage.getUsedRounds(),
            remaining
        );
    }

    @Override
    public AiCharacterCreateResponse createCharacter(AiCharacterCreateRequest request) {
        String displayName = normalizeDisplayName(request == null ? null : request.getDisplayName(), "未命名角色");
        String visibilityType = normalizeVisibilityType(request == null ? null : request.getVisibilityType());
        Long coverAssetId = normalizePositiveLong(request == null ? null : request.getCoverAssetId());
        Map<String, Object> payload = buildCharacterCreatePayload(request, displayName, visibilityType, coverAssetId);
        return saveCharacter("character", displayName, visibilityType, coverAssetId, payload);
    }

    @Override
    public AiCharacterImportResponse importCharacterCard(AiCharacterImportRequest request) {
        String displayName = normalizeDisplayName(request == null ? null : request.getDisplayName(), "导入角色卡");
        String visibilityType = normalizeVisibilityType(request == null ? null : request.getVisibilityType());
        Long coverAssetId = normalizePositiveLong(request == null ? null : request.getCoverAssetId());
        Map<String, Object> payload = buildCharacterImportPayload(request, displayName, visibilityType, coverAssetId);
        AiCharacterCreateResponse response = saveCharacter("character_card_png", displayName, visibilityType, coverAssetId, payload);
        return new AiCharacterImportResponse(
            response.status(),
            response.type(),
            response.id(),
            response.displayName(),
            response.visibilityType(),
            response.payload()
        );
    }

    @Override
    public List<AiCharacterSummaryResponse> listCharacters() {
        Long userId = requireLoginUserId();
        return aiCharacterMapper.selectList(
                new QueryWrapper<AiCharacterEntity>()
                    .select("id", "character_type", "display_name", "cover_asset_id", "visibility_type", "create_time")
                    .eq("user_id", userId)
                    .eq("deleted_flag", 0)
                    .orderByDesc("create_time")
                    .last("LIMIT " + MAX_LIST_CHARACTERS)
            ).stream()
            .map(this::toCharacterSummary)
            .toList();
    }

    @Override
    public AiCharacterDetailResponse getCharacter(Long characterId) {
        Long userId = requireLoginUserId();
        return toCharacterDetail(loadOwnedCharacter(characterId, userId));
    }

    @Override
    public List<AiTownSceneSummaryResponse> listTownScenes() {
        return AiTownCatalog.listScenes().stream()
            .map(this::toTownSceneSummary)
            .toList();
    }

    @Override
    public AiTownSceneDetailResponse getTownScene(String sceneCode) {
        return toTownSceneDetail(loadTownScene(sceneCode));
    }

    @Override
    public AiTownPublicMapResponse getTownPublicMap() {
        return new AiTownPublicMapResponse(
            AiTownCatalog.listScenes().stream()
                .map(scene -> new AiTownMapNodeResponse(
                    scene.sceneCode(),
                    scene.title(),
                    scene.coordX(),
                    scene.coordY(),
                    scene.tone()
                ))
                .toList()
        );
    }

    @Override
    public AiTownAssetPreviewResponse importAdminTownAsset(MultipartFile file, String sceneCode) {
        Long userId = requireLoginUserId();
        requireAdminRole();
        if (file == null || file.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "RPGMaker asset file is required");
        }

        byte[] content;
        try {
            content = file.getBytes();
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Failed to read RPGMaker asset");
        }

        String attachedSceneCode = normalizeCode(sceneCode);
        if (attachedSceneCode != null) {
            loadTownScene(attachedSceneCode);
        }

        ParsedTownAsset parsed = parseTownAsset(file.getOriginalFilename(), content, attachedSceneCode);
        LocalDateTime now = LocalDateTime.now();
        AiTownAssetImportEntity entity = new AiTownAssetImportEntity();
        entity.setAssetCode("rpg-" + UUID.randomUUID());
        entity.setOwnerUserId(userId);
        entity.setSourceName(parsed.sourceName());
        entity.setAssetType(parsed.assetType());
        entity.setParserStatus("READY");
        entity.setAttachedSceneCode(attachedSceneCode);
        entity.setRawSizeBytes((long) content.length);
        entity.setMetadataJson(toJsonValue(parsed.metadata()));
        entity.setPreviewJson(toJsonValue(parsed.preview()));
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiTownAssetImportMapper.insert(entity);
        return toTownAssetPreview(entity, parsed);
    }

    @Override
    public AiTownAssetPreviewResponse previewAdminTownAsset(AiTownAssetPreviewRequest request) {
        Long userId = requireLoginUserId();
        requireAdminRole();
        AiTownAssetImportEntity entity = loadTownAssetImport(request, userId);
        return toTownAssetPreview(entity);
    }

    @Override
    public AiSessionSummary createAdminTownNpcSession(String npcCode) {
        Long userId = requireLoginUserId();
        requireAdminRole();
        AiTownCatalog.NpcDefinition npc = loadTownNpc(npcCode);
        if (!npc.adminOnly()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "NPC session is only available for admin-only entries");
        }
        AiTownCatalog.SceneDefinition scene = loadTownScene(npc.sceneCode());

        CreateSessionRequest request = new CreateSessionRequest();
        request.setTitle(scene.title() + " · " + npc.displayName());
        request.setMode("town_npc");
        request.setCharacterId(normalizePositiveLong(npc.characterId()));
        request.setWorldbookIds(normalizeWorldbookIds(npc.worldbookIds()));
        request.setScenePrompt(scene.description() + " " + npc.intro());
        request.setTownRoomCode(scene.sceneCode());
        request.setActorCode(npc.npcCode());

        AiSessionSummary summary = createSession(request);
        if (summary.sessionId() == null || summary.sessionId().isBlank()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Failed to create NPC session for user " + userId);
        }
        return summary;
    }

    @Override
    public AiCompanionConfigResponse getAdminCompanionConfig() {
        Long userId = requireLoginUserId();
        requireAdminRole();
        return toCompanionConfig(loadExistingCompanionProfile(userId));
    }

    @Override
    public AiCompanionConfigResponse updateAdminCompanionConfig(UpdateCompanionConfigRequest request) {
        Long userId = requireLoginUserId();
        requireAdminRole();
        List<Long> worldbookIds = loadOwnedWorldbookIds(request.getWorldbookIds(), userId);
        LocalDateTime now = LocalDateTime.now();

        AiCompanionProfileEntity entity = loadExistingCompanionProfile(userId);
        if (entity == null) {
            entity = new AiCompanionProfileEntity();
            entity.setOwnerUserId(userId);
            entity.setCreatedAt(now);
            entity.setDeleted(0);
            entity.setVersion(0);
        }

        entity.setCompanionCode(normalizeCompanionCode(request.getCompanionCode()));
        entity.setDisplayName(normalizeDisplayName(request.getDisplayName(), "自宅 companion"));
        entity.setPersonaJson(toJsonValue(Map.of("persona_prompt", normalizeCompanionPersonaPrompt(request.getPersonaPrompt()))));
        entity.setAvatarAssetId(normalizePositiveLong(request.getAvatarAssetId()));
        entity.setMemoryEnabled(toFlag(request.getMemoryEnabled(), false));
        entity.setBoundWorldbookJson(toJsonValue(worldbookIds));
        entity.setScenePrompt(normalizeCompanionScenePrompt(request.getScenePrompt()));
        entity.setUpdatedAt(now);

        if (entity.getId() == null) {
            aiCompanionProfileMapper.insert(entity);
        } else {
            aiCompanionProfileMapper.updateById(entity);
        }
        return toCompanionConfig(entity);
    }

    @Override
    public AiSessionSummary createAdminCompanionSession() {
        requireLoginUserId();
        requireAdminRole();
        AiCompanionConfigResponse config = getAdminCompanionConfig();

        CreateSessionRequest request = new CreateSessionRequest();
        request.setTitle("自宅 · " + config.displayName());
        request.setMode("companion");
        request.setWorldbookIds(config.worldbookIds());
        request.setScenePrompt(buildCompanionSessionPrompt(config));
        request.setTownRoomCode(DEFAULT_COMPANION_SCENE_CODE);
        request.setActorCode(config.companionCode());
        return createSession(request);
    }

    @Override
    public AiMemoryScopeResponse getAdminMemoryScope(String scopeId) {
        requireLoginUserId();
        requireAdminRole();
        AiMemoryScopeEntity entity = loadMemoryScope(scopeId);
        return toMemoryScopeResponse(entity, true, entity == null ? null : entity.getLastQuery(), null);
    }

    @Override
    public AiMemoryScopeResponse updateAdminMemoryScope(String scopeId, UpdateAiMemoryScopeRequest request) {
        Long userId = requireLoginUserId();
        requireAdminRole();
        String normalizedScopeId = normalizeScopeId(scopeId);
        if (normalizedScopeId == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "scope_id is required");
        }

        AiMemoryScopeEntity entity = loadMemoryScope(normalizedScopeId);
        if (entity == null) {
            ScopeParts scopeParts = parseScopeParts(normalizedScopeId);
            entity = new AiMemoryScopeEntity();
            entity.setScopeId(normalizedScopeId);
            entity.setOwnerUserId(userId);
            entity.setDomainType(scopeParts.domainType());
            entity.setActorCode(scopeParts.actorCode());
            entity.setSceneCode(scopeParts.sceneCode());
            entity.setEnabled(toFlag(request == null ? null : request.getEnabled(), true));
            entity.setCreatedAt(LocalDateTime.now());
            entity.setDeleted(0);
            entity.setVersion(0);
        } else if (entity.getOwnerUserId() != null && !entity.getOwnerUserId().equals(userId)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "This memory scope does not belong to current admin");
        }

        if (request != null && request.getEnabled() != null) {
            entity.setEnabled(toFlag(request.getEnabled(), isEnabled(entity.getEnabled())));
        }
        if (request != null) {
            entity.setNote(normalizeMemoryNote(request.getNote()));
            entity.setLastQuery(normalizeMemoryQuery(request.getQuery()));
        }
        entity.setLastAccessedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());

        if (entity.getId() == null) {
            aiMemoryScopeMapper.insert(entity);
        } else {
            aiMemoryScopeMapper.updateById(entity);
        }

        boolean includeSnapshot = request == null || request.getIncludeSnapshot() == null || request.getIncludeSnapshot();
        Integer journalLimit = request == null ? null : request.getJournalLimit();
        return toMemoryScopeResponse(entity, includeSnapshot, entity.getLastQuery(), journalLimit);
    }

    @Override
    public AiWorldbookDetailResponse createWorldbook(CreateWorldbookRequest request) {
        Long userId = requireLoginUserId();
        LocalDateTime now = LocalDateTime.now();
        AiWorldbookEntity entity = new AiWorldbookEntity();
        entity.setWorldbookCode("worldbook-" + UUID.randomUUID());
        entity.setOwnerUserId(userId);
        entity.setTitle(normalizeTitle(request.getTitle()));
        entity.setVisibilityType(normalizeVisibilityType(request.getVisibilityType()));
        entity.setEnabled(toFlag(request.getEnabled(), true));
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiWorldbookMapper.insert(entity);
        return toWorldbookDetail(entity, List.of());
    }

    @Override
    public List<AiWorldbookSummaryResponse> listWorldbooks() {
        Long userId = requireLoginUserId();
        List<AiWorldbookEntity> worldbooks = aiWorldbookMapper.selectList(
            new QueryWrapper<AiWorldbookEntity>()
                .select("id", "worldbook_code", "title_text", "visibility_type", "enabled_flag", "create_time", "update_time")
                .eq("owner_user_id", userId)
                .eq("deleted_flag", 0)
                .orderByDesc("update_time")
                .last("LIMIT " + MAX_LIST_WORLDBOOKS)
        );
        Map<Long, Integer> entryCounts = loadWorldbookEntryCounts(
            worldbooks.stream().map(AiWorldbookEntity::getId).filter(id -> id != null && id > 0).toList()
        );
        return worldbooks.stream()
            .map(entity -> toWorldbookSummary(entity, entryCounts.getOrDefault(entity.getId(), 0)))
            .toList();
    }

    @Override
    public AiWorldbookDetailResponse getWorldbook(Long worldbookId) {
        Long userId = requireLoginUserId();
        AiWorldbookEntity entity = loadOwnedWorldbook(worldbookId, userId);
        return toWorldbookDetail(entity, loadWorldbookEntries(entity.getId()));
    }

    @Override
    public AiWorldbookDetailResponse updateWorldbook(Long worldbookId, UpdateWorldbookRequest request) {
        Long userId = requireLoginUserId();
        AiWorldbookEntity entity = loadOwnedWorldbook(worldbookId, userId);
        entity.setTitle(normalizeTitle(request.getTitle()));
        entity.setVisibilityType(normalizeVisibilityType(request.getVisibilityType()));
        entity.setEnabled(toFlag(request.getEnabled(), isEnabled(entity.getEnabled())));
        entity.setUpdatedAt(LocalDateTime.now());
        aiWorldbookMapper.updateById(entity);
        return toWorldbookDetail(entity, loadWorldbookEntries(entity.getId()));
    }

    @Override
    public AiWorldbookEntryResponse createWorldbookEntry(Long worldbookId, UpsertWorldbookEntryRequest request) {
        Long userId = requireLoginUserId();
        AiWorldbookEntity worldbook = loadOwnedWorldbook(worldbookId, userId);
        LocalDateTime now = LocalDateTime.now();
        AiWorldbookEntryEntity entity = new AiWorldbookEntryEntity();
        entity.setWorldbookId(worldbook.getId());
        entity.setKeywordJson(toJsonValue(normalizeKeywords(request.getKeywords())));
        entity.setContent(normalizeRequiredContent(request.getContent()));
        entity.setPriorityNum(normalizePriority(request.getPriorityNum()));
        entity.setEnabled(toFlag(request.getEnabled(), true));
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiWorldbookEntryMapper.insert(entity);
        return toWorldbookEntryResponse(entity);
    }

    @Override
    public AiWorldbookEntryResponse updateWorldbookEntry(Long worldbookId, Long entryId, UpsertWorldbookEntryRequest request) {
        Long userId = requireLoginUserId();
        AiWorldbookEntity worldbook = loadOwnedWorldbook(worldbookId, userId);
        AiWorldbookEntryEntity entity = loadOwnedWorldbookEntry(worldbook.getId(), entryId);
        entity.setKeywordJson(toJsonValue(normalizeKeywords(request.getKeywords())));
        entity.setContent(normalizeRequiredContent(request.getContent()));
        entity.setPriorityNum(normalizePriority(request.getPriorityNum()));
        entity.setEnabled(toFlag(request.getEnabled(), isEnabled(entity.getEnabled())));
        entity.setUpdatedAt(LocalDateTime.now());
        aiWorldbookEntryMapper.updateById(entity);
        return toWorldbookEntryResponse(entity);
    }

    private AiCharacterCreateResponse saveCharacter(String type,
                                                    String displayName,
                                                    String visibilityType,
                                                    Long coverAssetId,
                                                    Map<String, Object> payload) {
        Long userId = requireLoginUserId();
        LocalDateTime now = LocalDateTime.now();
        AiCharacterEntity entity = new AiCharacterEntity();
        entity.setUserId(userId);
        entity.setTypeName(type);
        entity.setDisplayName(displayName);
        entity.setCoverAssetId(coverAssetId);
        entity.setVisibilityType(visibilityType);
        entity.setPayloadJson(toJson(payload));
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiCharacterMapper.insert(entity);

        return new AiCharacterCreateResponse(
            "CREATED",
            type,
            entity.getId(),
            entity.getDisplayName(),
            entity.getVisibilityType(),
            payload
        );
    }

    private Map<String, Object> buildCharacterCreatePayload(AiCharacterCreateRequest request,
                                                            String displayName,
                                                            String visibilityType,
                                                            Long coverAssetId) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("displayName", displayName);
        if (request != null) {
            putIfPresent(payload, "persona", request.getPersona());
            putIfPresent(payload, "description", request.getDescription());
            if (normalizeOptionalText(request.getVisibilityType()) != null) {
                payload.put("visibilityType", visibilityType);
            }
        }
        if (coverAssetId != null) {
            payload.put("coverAssetId", coverAssetId);
        }
        return payload;
    }

    private Map<String, Object> buildCharacterImportPayload(AiCharacterImportRequest request,
                                                            String displayName,
                                                            String visibilityType,
                                                            Long coverAssetId) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("displayName", displayName);
        if (request != null) {
            putIfPresent(payload, "rawCardJson", request.getRawCardJson());
            if (normalizeOptionalText(request.getVisibilityType()) != null) {
                payload.put("visibilityType", visibilityType);
            }
        }
        if (coverAssetId != null) {
            payload.put("coverAssetId", coverAssetId);
        }
        return payload;
    }

    private void putIfPresent(Map<String, Object> payload, String key, String value) {
        String normalized = normalizeOptionalText(value);
        if (normalized != null) {
            payload.put(key, normalized);
        }
    }

    private AiQuotaUsageEntity loadOrCreateUsage(Long userId, long total) {
        AiQuotaUsageEntity usage = aiQuotaUsageMapper.selectOne(
            new LambdaQueryWrapper<AiQuotaUsageEntity>()
                .eq(AiQuotaUsageEntity::getUserId, userId)
                .eq(AiQuotaUsageEntity::getQuotaCode, aiQuotaProperties.getCode())
        );
        if (usage != null) {
            if (!usage.getTotalRounds().equals(total)) {
                usage.setTotalRounds(total);
                usage.setUpdatedAt(LocalDateTime.now());
                aiQuotaUsageMapper.updateById(usage);
            }
            return usage;
        }

        AiQuotaUsageEntity created = new AiQuotaUsageEntity();
        created.setUserId(userId);
        created.setQuotaCode(aiQuotaProperties.getCode());
        created.setTotalRounds(total);
        created.setUsedRounds(0L);
        created.setCreatedAt(LocalDateTime.now());
        created.setUpdatedAt(LocalDateTime.now());
        aiQuotaUsageMapper.insert(created);
        return created;
    }

    private long resolveTotalQuota() {
        Set<String> groups = LoginUserContext.get().map(loginUser -> loginUser.getGroups()).orElse(Set.of());
        Long resolved = userQuotaClient.resolveQuota(
            aiQuotaProperties.getCode(),
            groups,
            aiQuotaProperties.getDefaultTotalRounds()
        );
        return resolved == null ? aiQuotaProperties.getDefaultTotalRounds() : resolved;
    }

    private AiCharacterEntity loadOwnedCharacter(Long characterId, Long userId) {
        if (characterId == null || characterId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "character_id is required");
        }
        AiCharacterEntity entity = aiCharacterMapper.selectOne(
            new LambdaQueryWrapper<AiCharacterEntity>()
                .eq(AiCharacterEntity::getId, characterId)
                .eq(AiCharacterEntity::getUserId, userId)
                .eq(AiCharacterEntity::getDeleted, 0)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Character not found");
        }
        return entity;
    }

    private AiSessionEntity loadOwnedSession(String sessionId, Long userId) {
        AiSessionEntity session = aiSessionMapper.selectOne(
            new LambdaQueryWrapper<AiSessionEntity>()
                .eq(AiSessionEntity::getSessionId, sessionId)
                .eq(AiSessionEntity::getUserId, userId)
                .eq(AiSessionEntity::getDeleted, 0)
        );
        if (session == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Session not found");
        }
        return session;
    }

    private AiWorldbookEntity loadOwnedWorldbook(Long worldbookId, Long userId) {
        if (worldbookId == null || worldbookId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "worldbook_id is required");
        }
        AiWorldbookEntity entity = aiWorldbookMapper.selectOne(
            new LambdaQueryWrapper<AiWorldbookEntity>()
                .eq(AiWorldbookEntity::getId, worldbookId)
                .eq(AiWorldbookEntity::getOwnerUserId, userId)
                .eq(AiWorldbookEntity::getDeleted, 0)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Worldbook not found");
        }
        return entity;
    }

    private AiMemoryScopeEntity loadMemoryScope(String scopeId) {
        String normalizedScopeId = normalizeScopeId(scopeId);
        if (normalizedScopeId == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "scope_id is required");
        }
        return aiMemoryScopeMapper.selectOne(
            new LambdaQueryWrapper<AiMemoryScopeEntity>()
                .eq(AiMemoryScopeEntity::getScopeId, normalizedScopeId)
                .eq(AiMemoryScopeEntity::getDeleted, 0)
                .last("LIMIT 1")
        );
    }

    private AiTownAssetImportEntity loadTownAssetImport(AiTownAssetPreviewRequest request, Long userId) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "preview request is required");
        }
        String assetCode = normalizeCode(request.getAssetCode());
        String sceneCode = normalizeCode(request.getSceneCode());
        AiTownAssetImportEntity entity;
        if (assetCode != null) {
            entity = aiTownAssetImportMapper.selectOne(
                new LambdaQueryWrapper<AiTownAssetImportEntity>()
                    .eq(AiTownAssetImportEntity::getAssetCode, assetCode)
                    .eq(AiTownAssetImportEntity::getOwnerUserId, userId)
                    .eq(AiTownAssetImportEntity::getDeleted, 0)
                    .last("LIMIT 1")
            );
        } else if (sceneCode != null) {
            entity = aiTownAssetImportMapper.selectOne(
                new LambdaQueryWrapper<AiTownAssetImportEntity>()
                    .eq(AiTownAssetImportEntity::getOwnerUserId, userId)
                    .eq(AiTownAssetImportEntity::getAttachedSceneCode, sceneCode)
                    .eq(AiTownAssetImportEntity::getDeleted, 0)
                    .orderByDesc(AiTownAssetImportEntity::getUpdatedAt)
                    .last("LIMIT 1")
            );
        } else {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "asset_code or scene_code is required");
        }
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Town asset preview not found");
        }
        return entity;
    }

    private AiTownCatalog.SceneDefinition loadTownScene(String sceneCode) {
        String normalized = normalizeCode(sceneCode);
        if (normalized == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "scene_code is required");
        }
        AiTownCatalog.SceneDefinition scene = AiTownCatalog.findScene(normalized);
        if (scene == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "AI town scene not found");
        }
        return scene;
    }

    private AiTownCatalog.NpcDefinition loadTownNpc(String npcCode) {
        String normalized = normalizeCode(npcCode);
        if (normalized == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "npc_code is required");
        }
        AiTownCatalog.NpcDefinition npc = AiTownCatalog.findNpc(normalized);
        if (npc == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "AI town NPC not found");
        }
        return npc;
    }

    private AiWorldbookEntryEntity loadOwnedWorldbookEntry(Long worldbookId, Long entryId) {
        if (entryId == null || entryId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "entry_id is required");
        }
        AiWorldbookEntryEntity entity = aiWorldbookEntryMapper.selectOne(
            new LambdaQueryWrapper<AiWorldbookEntryEntity>()
                .eq(AiWorldbookEntryEntity::getId, entryId)
                .eq(AiWorldbookEntryEntity::getWorldbookId, worldbookId)
                .eq(AiWorldbookEntryEntity::getDeleted, 0)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Worldbook entry not found");
        }
        return entity;
    }

    private List<AiWorldbookEntryEntity> loadWorldbookEntries(Long worldbookId) {
        return aiWorldbookEntryMapper.selectList(
            new QueryWrapper<AiWorldbookEntryEntity>()
                .select("id", "worldbook_id", "keyword_json", "content_text", "priority_num", "enabled_flag", "create_time", "update_time")
                .eq("worldbook_id", worldbookId)
                .eq("deleted_flag", 0)
                .orderByDesc("priority_num")
                .orderByAsc("id")
        );
    }

    private Map<Long, Integer> loadWorldbookEntryCounts(List<Long> worldbookIds) {
        if (worldbookIds == null || worldbookIds.isEmpty()) {
            return Map.of();
        }
        List<Map<String, Object>> rows = aiWorldbookEntryMapper.selectMaps(
            new QueryWrapper<AiWorldbookEntryEntity>()
                .select("worldbook_id", "COUNT(1) AS entry_count")
                .in("worldbook_id", worldbookIds)
                .eq("deleted_flag", 0)
                .groupBy("worldbook_id")
        );
        Map<Long, Integer> counts = new HashMap<>();
        for (Map<String, Object> row : rows) {
            Long worldbookId = toLongOrNull(row.get("worldbook_id"));
            Long count = toLongOrNull(row.get("entry_count"));
            if (worldbookId != null) {
                counts.put(worldbookId, count == null ? 0 : Math.toIntExact(count));
            }
        }
        return counts;
    }

    private void persistMessage(Long sessionDbId, Long userId, String roleName, String content) {
        AiMessageEntity entity = new AiMessageEntity();
        entity.setSessionId(sessionDbId);
        entity.setUserId(userId);
        entity.setRoleName(roleName);
        entity.setContent(content);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        entity.setDeleted(0);
        entity.setVersion(0);
        aiMessageMapper.insert(entity);
    }

    private String buildAssistantReply(String sessionMode,
                                       AiSessionEntity session,
                                       List<Long> worldbookIds,
                                       String normalizedMessage,
                                       int contextSize,
                                       boolean memoryEnabled,
                                       String scopeId,
                                       MemoryConversationContext memoryContext) {
        String normalized = normalizedMessage;
        if (normalized.length() > 120) {
            normalized = normalized.substring(0, 120);
        }
        String focus = normalized.toLowerCase(Locale.ROOT);

        if ("tavern".equals(sessionMode)) {
            String scenePrompt = session == null ? "" : previewText(session.getScenePrompt(), 28);
            long worldbookCount = worldbookIds.size();
            String actorHint = session != null && session.getCharacterId() != null ? "character=" + session.getCharacterId() : "character=unset";
            String sceneHint = scenePrompt.isBlank() ? "scene=default" : "scene=" + scenePrompt;
            return "[Tavern mode] " + actorHint + ", worldbooks=" + worldbookCount + ", " + sceneHint
                + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        if ("normal".equals(sessionMode)) {
            return "[Normal mode] Context=" + contextSize + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        if ("companion".equals(sessionMode) || "town_npc".equals(sessionMode)) {
            List<String> memoryHighlights = new ArrayList<>();
            if (memoryContext != null) {
                if (normalizeOptionalText(memoryContext.profileSummary()) != null) {
                    memoryHighlights.add("profile=" + previewText(memoryContext.profileSummary(), 60));
                }
                if (!memoryContext.summaryHighlights().isEmpty()) {
                    memoryHighlights.add("summary=" + previewText(memoryContext.summaryHighlights().get(0), 48));
                }
                if (!memoryContext.episodicHighlights().isEmpty()) {
                    memoryHighlights.add("episodic=" + previewText(memoryContext.episodicHighlights().get(0), 48));
                }
                if (!memoryContext.journalHighlights().isEmpty()) {
                    memoryHighlights.add("journal=" + previewText(memoryContext.journalHighlights().get(0), 48));
                }
            }
            String memoryHint = memoryHighlights.isEmpty() ? "memory_context=empty" : String.join(", ", memoryHighlights);
            return "[Scene mode] mode=" + sessionMode + ", scope=" + (scopeId == null ? "none" : scopeId)
                + ", memory=" + memoryEnabled + ", " + memoryHint + ", focus on: " + focus;
        }

        return "[Quick chat] Context=" + contextSize + ", focus on: " + focus;
    }

    private MemoryConversationContext buildMemoryContext(String sessionMode,
                                                         AiSessionEntity session,
                                                         Long userId,
                                                         SendMessageRequest request,
                                                         boolean memoryEnabled,
                                                         String normalizedMessage) {
        String scopeId = resolveScopeId(sessionMode, session, userId, request, memoryEnabled);
        if (!memoryEnabled || scopeId == null || !MEMORY_SCENE_SESSION_MODES.contains(sessionMode) || session == null) {
            return MemoryConversationContext.disabled(scopeId);
        }

        AiMemoryScopeEntity scope = upsertMemoryScopeRecord(scopeId, userId, sessionMode, session);
        scope.setLastQuery(normalizeMemoryQuery(normalizedMessage));
        scope.setLastAccessedAt(LocalDateTime.now());
        scope.setUpdatedAt(LocalDateTime.now());
        aiMemoryScopeMapper.updateById(scope);
        if (!isEnabled(scope.getEnabled()) || !memoryOsClient.isConfigured()) {
            return new MemoryConversationContext(
                scopeId,
                false,
                "",
                List.of(),
                List.of(),
                List.of(),
                false
            );
        }

        try {
            MemoryOsClient.MemorySnapshot snapshot = memoryOsClient.retrieve(scopeId, normalizedMessage, null);
            return new MemoryConversationContext(
                scopeId,
                true,
                normalizeOptionalText(snapshot.profileSummary()) == null ? "" : snapshot.profileSummary(),
                limitStrings(snapshot.summaryHighlights(), 3, 160),
                limitStrings(snapshot.episodicHighlights(), 3, 160),
                limitStrings(snapshot.journalHighlights(), 3, 160),
                true
            );
        } catch (BusinessException exception) {
            return new MemoryConversationContext(
                scopeId,
                false,
                "",
                List.of(),
                List.of(),
                List.of(),
                false
            );
        }
    }

    private void writeMemoryRecord(MemoryConversationContext memoryContext,
                                   AiSessionEntity session,
                                   String normalizedMessage,
                                   String assistantMessage) {
        try {
            memoryOsClient.record(
                memoryContext.scopeId(),
                normalizedMessage,
                assistantMessage,
                Map.of(
                    "session_mode", normalizeSessionMode(session.getMode()),
                    "session_id", session.getSessionId(),
                    "scene_code", normalizeOptionalText(session.getTownRoomCode()) == null ? "" : session.getTownRoomCode(),
                    "actor_code", normalizeOptionalText(session.getActorCode()) == null ? "" : session.getActorCode()
                )
            );
        } catch (BusinessException ignored) {
        }
    }

    private String resolveScopeId(String sessionMode,
                                  AiSessionEntity session,
                                  Long userId,
                                  SendMessageRequest request,
                                  boolean memoryEnabled) {
        if (!memoryEnabled || !MEMORY_SCENE_SESSION_MODES.contains(sessionMode) || session == null || !isLoggedIn(userId)) {
            return null;
        }
        String actorCode = normalizeScopeSegment(session.getActorCode());
        String sceneCode = resolveScopeSceneCode(sessionMode, session);
        if (actorCode == null || sceneCode == null) {
            return null;
        }
        return userId + ":" + sessionMode + ":" + actorCode + ":" + sceneCode;
    }

    private Long currentUserIdOrNull() {
        return LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(null);
    }

    private Long requireLoginUserId() {
        Long userId = currentUserIdOrNull();
        if (!isLoggedIn(userId)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
    }

    private boolean isLoggedIn(Long userId) {
        return userId != null && userId > 0;
    }

    private void requireAdminRole() {
        Set<String> groups = LoginUserContext.get().map(loginUser -> loginUser.getGroups()).orElse(Set.of());
        boolean isAdmin = groups.stream()
            .map(group -> String.valueOf(group).trim().toUpperCase(Locale.ROOT))
            .anyMatch("ADMIN"::equals);
        if (!isAdmin) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Admin required");
        }
    }

    private String toJson(Map<String, Object> payload) {
        return toJsonValue(payload == null ? Map.of() : payload);
    }

    private String toJsonValue(Object payload) {
        try {
            return objectMapper.writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid payload json");
        }
    }

    private AiSessionSummary toSummary(AiSessionEntity entity) {
        return new AiSessionSummary(
            entity.getSessionId(),
            entity.getTitle(),
            normalizeSessionMode(entity.getMode()),
            entity.getCharacterId(),
            parseWorldbookIds(entity.getBoundWorldbookJson()),
            normalizeOptionalText(entity.getScenePrompt()),
            normalizeCode(entity.getTownRoomCode()),
            normalizeCode(entity.getActorCode())
        );
    }

    private AiCharacterSummaryResponse toCharacterSummary(AiCharacterEntity entity) {
        return new AiCharacterSummaryResponse(
            entity.getId(),
            entity.getTypeName(),
            resolveCharacterDisplayName(entity),
            entity.getCoverAssetId(),
            normalizeVisibilityType(entity.getVisibilityType()),
            entity.getCreatedAt()
        );
    }

    private AiCharacterDetailResponse toCharacterDetail(AiCharacterEntity entity) {
        return new AiCharacterDetailResponse(
            entity.getId(),
            entity.getTypeName(),
            resolveCharacterDisplayName(entity),
            entity.getCoverAssetId(),
            normalizeVisibilityType(entity.getVisibilityType()),
            toPayloadMap(entity.getPayloadJson()),
            entity.getCreatedAt(),
            entity.getUpdatedAt()
        );
    }

    private AiWorldbookSummaryResponse toWorldbookSummary(AiWorldbookEntity entity, int entryCount) {
        return new AiWorldbookSummaryResponse(
            entity.getId(),
            entity.getWorldbookCode(),
            entity.getTitle(),
            normalizeVisibilityType(entity.getVisibilityType()),
            isEnabled(entity.getEnabled()),
            entryCount,
            entity.getCreatedAt(),
            entity.getUpdatedAt()
        );
    }

    private AiWorldbookDetailResponse toWorldbookDetail(AiWorldbookEntity entity, List<AiWorldbookEntryEntity> entries) {
        return new AiWorldbookDetailResponse(
            entity.getId(),
            entity.getWorldbookCode(),
            entity.getTitle(),
            normalizeVisibilityType(entity.getVisibilityType()),
            isEnabled(entity.getEnabled()),
            entries.stream().map(this::toWorldbookEntryResponse).toList(),
            entity.getCreatedAt(),
            entity.getUpdatedAt()
        );
    }

    private AiWorldbookEntryResponse toWorldbookEntryResponse(AiWorldbookEntryEntity entity) {
        return new AiWorldbookEntryResponse(
            entity.getId(),
            parseKeywords(entity.getKeywordJson()),
            entity.getContent(),
            entity.getPriorityNum(),
            isEnabled(entity.getEnabled()),
            entity.getCreatedAt(),
            entity.getUpdatedAt()
        );
    }

    private AiCompanionConfigResponse toCompanionConfig(AiCompanionProfileEntity entity) {
        if (entity == null) {
            return new AiCompanionConfigResponse(
                null,
                DEFAULT_COMPANION_CODE,
                "自宅 companion",
                "",
                null,
                Boolean.FALSE,
                List.of(),
                "",
                null
            );
        }
        return new AiCompanionConfigResponse(
            entity.getId(),
            normalizeCompanionCode(entity.getCompanionCode()),
            normalizeDisplayName(entity.getDisplayName(), "自宅 companion"),
            parseCompanionPersonaPrompt(entity.getPersonaJson()),
            normalizePositiveLong(entity.getAvatarAssetId()),
            isEnabled(entity.getMemoryEnabled()),
            parseWorldbookIds(entity.getBoundWorldbookJson()),
            normalizeOptionalText(entity.getScenePrompt()),
            entity.getUpdatedAt()
        );
    }

    private AiTownSceneSummaryResponse toTownSceneSummary(AiTownCatalog.SceneDefinition scene) {
        return new AiTownSceneSummaryResponse(
            scene.sceneCode(),
            scene.title(),
            scene.sceneType(),
            scene.description(),
            scene.atmosphereHint(),
            scene.npcs().size(),
            true
        );
    }

    private AiTownSceneDetailResponse toTownSceneDetail(AiTownCatalog.SceneDefinition scene) {
        return new AiTownSceneDetailResponse(
            scene.sceneCode(),
            scene.title(),
            scene.sceneType(),
            scene.description(),
            scene.atmosphereHint(),
            true,
            scene.highlights(),
            scene.npcs().stream()
                .map(npc -> toTownNpcResponse(scene.sceneCode(), npc))
                .toList()
        );
    }

    private AiTownNpcResponse toTownNpcResponse(String sceneCode, AiTownCatalog.NpcDefinition npc) {
        return new AiTownNpcResponse(
            npc.npcCode(),
            sceneCode,
            npc.displayName(),
            npc.roleLabel(),
            npc.intro(),
            npc.adminOnly(),
            npc.memoryEnabled(),
            npc.characterId(),
            normalizeWorldbookIds(npc.worldbookIds())
        );
    }

    private String normalizeSessionMode(String raw) {
        String normalized = String.valueOf(raw == null ? DEFAULT_SESSION_MODE : raw).trim().toLowerCase(Locale.ROOT);
        if (!SUPPORTED_SESSION_MODES.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported AI session mode: " + raw);
        }
        return normalized;
    }

    private String normalizeTitle(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        if (normalized.length() > 255) {
            return normalized.substring(0, 255);
        }
        return normalized;
    }

    private String normalizeDisplayName(String raw, String fallback) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return fallback;
        }
        return normalized.length() > 128 ? normalized.substring(0, 128) : normalized;
    }

    private String normalizeVisibilityType(String raw) {
        String normalized = String.valueOf(raw == null ? DEFAULT_VISIBILITY_TYPE : raw).trim().toUpperCase(Locale.ROOT);
        if (!SUPPORTED_VISIBILITY_TYPES.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported visibility_type: " + raw);
        }
        return normalized;
    }

    private Long normalizePositiveLong(Long value) {
        if (value == null || value <= 0) {
            return null;
        }
        return value;
    }

    private List<Long> normalizeWorldbookIds(List<Long> worldbookIds) {
        if (worldbookIds == null || worldbookIds.isEmpty()) {
            return List.of();
        }
        return worldbookIds.stream()
            .filter(value -> value != null && value > 0)
            .distinct()
            .limit(20)
            .toList();
    }

    private List<Long> loadOwnedWorldbookIds(List<Long> worldbookIds, Long userId) {
        List<Long> normalized = normalizeWorldbookIds(worldbookIds);
        if (normalized.isEmpty()) {
            return normalized;
        }
        List<AiWorldbookEntity> ownedWorldbooks = aiWorldbookMapper.selectList(
            new QueryWrapper<AiWorldbookEntity>()
                .select("id")
                .eq("owner_user_id", userId)
                .eq("deleted_flag", 0)
                .in("id", normalized)
        );
        List<Long> ownedIds = ownedWorldbooks.stream()
            .map(AiWorldbookEntity::getId)
            .filter(id -> id != null && id > 0)
            .distinct()
            .toList();
        if (ownedIds.size() != normalized.size()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "worldbook_ids contain invalid entries");
        }
        return normalized;
    }

    private String normalizeOptionalText(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        return normalized.isEmpty() ? null : normalized;
    }

    private String normalizeCode(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 64 ? normalized.substring(0, 64) : normalized;
    }

    private String normalizeCompanionCode(String raw) {
        String normalized = normalizeCode(raw);
        return normalized == null ? DEFAULT_COMPANION_CODE : normalized;
    }

    private String normalizeScopeId(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 128 ? normalized.substring(0, 128) : normalized;
    }

    private String normalizeScopeSegment(String raw) {
        String normalized = normalizeCode(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 32 ? normalized.substring(0, 32) : normalized;
    }

    private String normalizeRequiredContent(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "content is required");
        }
        return normalized.length() > 4000 ? normalized.substring(0, 4000) : normalized;
    }

    private String normalizeCompanionPersonaPrompt(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return "";
        }
        return normalized.length() > 4000 ? normalized.substring(0, 4000) : normalized;
    }

    private String normalizeCompanionScenePrompt(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 2000 ? normalized.substring(0, 2000) : normalized;
    }

    private int normalizePriority(Integer value) {
        if (value == null) {
            return 0;
        }
        return Math.max(-9999, Math.min(9999, value));
    }

    private int toFlag(Boolean value, boolean defaultValue) {
        if (value == null) {
            return defaultValue ? 1 : 0;
        }
        return value ? 1 : 0;
    }

    private boolean isEnabled(Integer value) {
        return value == null || value.intValue() != 0;
    }

    private List<Long> parseWorldbookIds(String rawJson) {
        if (rawJson == null || rawJson.isBlank()) {
            return List.of();
        }
        try {
            List<?> parsed = objectMapper.readValue(rawJson, List.class);
            return parsed.stream()
                .map(this::toLongOrNull)
                .filter(value -> value != null && value > 0)
                .distinct()
                .toList();
        } catch (IOException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid worldbook binding json");
        }
    }

    private String parseCompanionPersonaPrompt(String rawJson) {
        Map<String, Object> payload = toPayloadMap(rawJson);
        String personaPrompt = resolveOptionalText(
            payload.get("persona_prompt"),
            payload.get("personaPrompt"),
            payload.get("persona"),
            payload.get("description")
        );
        return personaPrompt == null ? "" : personaPrompt;
    }

    private Long toLongOrNull(Object raw) {
        if (raw instanceof Number number) {
            return number.longValue();
        }
        if (raw == null) {
            return null;
        }
        try {
            return Long.parseLong(String.valueOf(raw).trim());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private List<String> normalizeKeywords(List<String> rawKeywords) {
        if (rawKeywords == null || rawKeywords.isEmpty()) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        for (String raw : rawKeywords) {
            String normalized = normalizeOptionalText(raw);
            if (normalized == null) {
                continue;
            }
            if (normalized.length() > 64) {
                normalized = normalized.substring(0, 64);
            }
            if (!result.contains(normalized)) {
                result.add(normalized);
            }
            if (result.size() >= 12) {
                break;
            }
        }
        return result;
    }

    private List<String> parseKeywords(String rawJson) {
        if (rawJson == null || rawJson.isBlank()) {
            return List.of();
        }
        try {
            List<?> parsed = objectMapper.readValue(rawJson, List.class);
            return parsed.stream()
                .map(item -> normalizeOptionalText(item == null ? null : String.valueOf(item)))
                .filter(item -> item != null && !item.isBlank())
                .distinct()
                .toList();
        } catch (IOException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid worldbook keyword json");
        }
    }

    private Map<String, Object> toPayloadMap(String rawJson) {
        if (rawJson == null || rawJson.isBlank()) {
            return Map.of();
        }
        try {
            Map<?, ?> parsed = objectMapper.readValue(rawJson, Map.class);
            Map<String, Object> result = new LinkedHashMap<>();
            parsed.forEach((key, value) -> result.put(String.valueOf(key), value));
            return result;
        } catch (IOException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid character payload json");
        }
    }

    private String resolveCharacterDisplayName(Map<String, Object> payload, String type) {
        String displayName = resolveOptionalText(
            payload.get("display_name"),
            payload.get("displayName"),
            payload.get("name"),
            payload.get("title"),
            payload.get("character_name"),
            payload.get("characterName"),
            payload.get("nickname")
        );
        if (displayName != null) {
            return displayName.length() > 128 ? displayName.substring(0, 128) : displayName;
        }
        return "character_card_png".equals(type) ? "导入角色卡" : "未命名角色";
    }

    private String resolveCharacterDisplayName(AiCharacterEntity entity) {
        String displayName = normalizeOptionalText(entity.getDisplayName());
        if (displayName != null) {
            return displayName;
        }
        Map<String, Object> payload = toPayloadMap(entity.getPayloadJson());
        return resolveCharacterDisplayName(payload, entity.getTypeName());
    }

    private String resolveOptionalText(Object... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        for (Object value : values) {
            String normalized = normalizeOptionalText(value == null ? null : String.valueOf(value));
            if (normalized != null) {
                return normalized;
            }
        }
        return null;
    }

    private String resolveScopeSceneCode(String sessionMode, AiSessionEntity session) {
        String townRoomCode = normalizeScopeSegment(session == null ? null : session.getTownRoomCode());
        if (townRoomCode != null) {
            return townRoomCode;
        }
        if ("companion".equals(sessionMode)) {
            return DEFAULT_COMPANION_SCENE_CODE;
        }
        return null;
    }

    private Long resolveOptionalLong(Object... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        for (Object value : values) {
            Long resolved = toLongOrNull(value);
            if (resolved != null && resolved > 0) {
                return resolved;
            }
        }
        return null;
    }

    private String previewText(String raw, int maxLength) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return "";
        }
        if (normalized.length() <= maxLength) {
            return normalized;
        }
        return normalized.substring(0, maxLength) + "...";
    }

    private String buildCompanionSessionPrompt(AiCompanionConfigResponse config) {
        List<String> parts = new ArrayList<>();
        parts.add("自宅 companion：" + config.displayName());
        String personaPrompt = normalizeOptionalText(config.personaPrompt());
        if (personaPrompt != null) {
            parts.add("人格设定：" + personaPrompt);
        }
        String scenePrompt = normalizeOptionalText(config.scenePrompt());
        if (scenePrompt != null) {
            parts.add("场景补充：" + scenePrompt);
        }
        return String.join("；", parts);
    }

    private AiCompanionProfileEntity loadExistingCompanionProfile(Long userId) {
        return aiCompanionProfileMapper.selectOne(
            new QueryWrapper<AiCompanionProfileEntity>()
                .eq("owner_user_id", userId)
                .eq("deleted_flag", 0)
                .last("LIMIT 1")
        );
    }

    private AiMemoryScopeEntity upsertMemoryScopeRecord(String scopeId,
                                                        Long userId,
                                                        String sessionMode,
                                                        AiSessionEntity session) {
        AiMemoryScopeEntity entity = loadMemoryScope(scopeId);
        LocalDateTime now = LocalDateTime.now();
        if (entity == null) {
            entity = new AiMemoryScopeEntity();
            entity.setScopeId(scopeId);
            entity.setOwnerUserId(userId);
            entity.setDomainType(sessionMode);
            entity.setActorCode(normalizeCode(session.getActorCode()));
            entity.setSceneCode(resolveScopeSceneCode(sessionMode, session));
            entity.setEnabled(1);
            entity.setCreatedAt(now);
            entity.setDeleted(0);
            entity.setVersion(0);
            entity.setLastAccessedAt(now);
            entity.setUpdatedAt(now);
            aiMemoryScopeMapper.insert(entity);
            return entity;
        }

        entity.setOwnerUserId(entity.getOwnerUserId() == null ? userId : entity.getOwnerUserId());
        entity.setDomainType(normalizeOptionalText(entity.getDomainType()) == null ? sessionMode : entity.getDomainType());
        entity.setActorCode(normalizeOptionalText(entity.getActorCode()) == null ? normalizeCode(session.getActorCode()) : entity.getActorCode());
        entity.setSceneCode(normalizeOptionalText(entity.getSceneCode()) == null ? resolveScopeSceneCode(sessionMode, session) : entity.getSceneCode());
        entity.setLastAccessedAt(now);
        entity.setUpdatedAt(now);
        aiMemoryScopeMapper.updateById(entity);
        return entity;
    }

    private AiMemoryScopeResponse toMemoryScopeResponse(AiMemoryScopeEntity entity,
                                                        boolean includeSnapshot,
                                                        String query,
                                                        Integer journalLimit) {
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Memory scope not found");
        }

        String profileSummary = "";
        List<String> summaryHighlights = List.of();
        List<String> episodicHighlights = List.of();
        List<String> journalHighlights = List.of();

        if (includeSnapshot && memoryOsClient.isConfigured()) {
            String effectiveQuery = normalizeMemoryQuery(query);
            if (effectiveQuery == null) {
                effectiveQuery = normalizeMemoryQuery(entity.getLastQuery());
            }
            if (effectiveQuery == null) {
                effectiveQuery = (normalizeOptionalText(entity.getActorCode()) == null ? "" : entity.getActorCode())
                    + " "
                    + (normalizeOptionalText(entity.getSceneCode()) == null ? "" : entity.getSceneCode());
                effectiveQuery = effectiveQuery.trim();
            }
            try {
                MemoryOsClient.MemorySnapshot snapshot = memoryOsClient.retrieve(entity.getScopeId(), effectiveQuery, journalLimit);
                profileSummary = normalizeOptionalText(snapshot.profileSummary()) == null ? "" : snapshot.profileSummary();
                summaryHighlights = limitStrings(snapshot.summaryHighlights(), 4, 180);
                episodicHighlights = limitStrings(snapshot.episodicHighlights(), 4, 180);
                journalHighlights = limitStrings(snapshot.journalHighlights(), 4, 180);
            } catch (BusinessException exception) {
                try {
                    MemoryOsClient.MemoryProfileSnapshot snapshot = memoryOsClient.getProfile(entity.getScopeId(), true, journalLimit);
                    profileSummary = normalizeOptionalText(snapshot.profileSummary()) == null ? "" : snapshot.profileSummary();
                    journalHighlights = limitStrings(snapshot.journalHighlights(), 4, 180);
                } catch (BusinessException ignored) {
                }
            }
        }

        return new AiMemoryScopeResponse(
            entity.getId(),
            entity.getScopeId(),
            entity.getOwnerUserId(),
            entity.getDomainType(),
            entity.getActorCode(),
            entity.getSceneCode(),
            isEnabled(entity.getEnabled()),
            normalizeOptionalText(entity.getNote()),
            normalizeOptionalText(entity.getLastQuery()),
            profileSummary,
            summaryHighlights,
            episodicHighlights,
            journalHighlights,
            entity.getLastAccessedAt(),
            entity.getUpdatedAt()
        );
    }

    private AiTownAssetPreviewResponse toTownAssetPreview(AiTownAssetImportEntity entity, ParsedTownAsset parsed) {
        return new AiTownAssetPreviewResponse(
            entity.getId(),
            entity.getAssetCode(),
            entity.getSourceName(),
            entity.getAssetType(),
            entity.getParserStatus(),
            entity.getRawSizeBytes(),
            normalizeCode(entity.getAttachedSceneCode()),
            parsed.previewHighlights(),
            parsed.metadata(),
            parsed.preview(),
            entity.getUpdatedAt()
        );
    }

    private AiTownAssetPreviewResponse toTownAssetPreview(AiTownAssetImportEntity entity) {
        return new AiTownAssetPreviewResponse(
            entity.getId(),
            entity.getAssetCode(),
            entity.getSourceName(),
            entity.getAssetType(),
            entity.getParserStatus(),
            entity.getRawSizeBytes(),
            normalizeCode(entity.getAttachedSceneCode()),
            limitStrings(parseStringListFromMap(toPayloadMap(entity.getPreviewJson()).get("preview_highlights")), 6, 180),
            toPayloadMap(entity.getMetadataJson()),
            toPayloadMap(entity.getPreviewJson()),
            entity.getUpdatedAt()
        );
    }

    private ParsedTownAsset parseTownAsset(String originalFilename, byte[] content, String attachedSceneCode) {
        String sourceName = normalizeSourceName(originalFilename);
        String lowerName = sourceName.toLowerCase(Locale.ROOT);
        if (lowerName.endsWith(".zip")) {
            return parseZipTownAsset(sourceName, content, attachedSceneCode);
        }
        if (lowerName.endsWith(".json")) {
            return parseJsonTownAsset(sourceName, content, attachedSceneCode);
        }
        if (lowerName.endsWith(".png") || lowerName.endsWith(".jpg") || lowerName.endsWith(".jpeg") || lowerName.endsWith(".webp")) {
            return parseImageTownAsset(sourceName, content, attachedSceneCode);
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Only RPGMaker zip/json/image assets are supported");
    }

    private ParsedTownAsset parseZipTownAsset(String sourceName, byte[] content, String attachedSceneCode) {
        List<String> sampleEntries = new ArrayList<>();
        List<String> mapJsonFiles = new ArrayList<>();
        int jsonEntryCount = 0;
        int imageEntryCount = 0;
        Map<String, Object> embeddedMapPreview = Map.of();
        List<String> previewHighlights = new ArrayList<>();

        try (ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(content), StandardCharsets.UTF_8)) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                if (entry.isDirectory()) {
                    continue;
                }
                String entryName = normalizeSourceName(entry.getName());
                if (sampleEntries.size() < 12) {
                    sampleEntries.add(entryName);
                }
                String lowerName = entryName.toLowerCase(Locale.ROOT);
                if (lowerName.endsWith(".json")) {
                    jsonEntryCount += 1;
                    if (entryName.matches("(?i)(.*/)?Map\\d+\\.json")) {
                        mapJsonFiles.add(entryName);
                        if (embeddedMapPreview.isEmpty()) {
                            embeddedMapPreview = parseJsonPreview(readEntryBytes(zipInputStream));
                        }
                    }
                }
                if (lowerName.endsWith(".png") || lowerName.endsWith(".jpg") || lowerName.endsWith(".jpeg") || lowerName.endsWith(".webp")) {
                    imageEntryCount += 1;
                }
            }
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Failed to parse RPGMaker zip asset");
        }

        previewHighlights.add("Zip 资产已解析，共 " + (jsonEntryCount + imageEntryCount) + " 个主要文件");
        if (!mapJsonFiles.isEmpty()) {
            previewHighlights.add("检测到地图 JSON：" + mapJsonFiles.get(0));
        }
        if (attachedSceneCode != null) {
            previewHighlights.add("当前挂接场景：" + attachedSceneCode);
        }

        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("entry_count", jsonEntryCount + imageEntryCount);
        metadata.put("json_entry_count", jsonEntryCount);
        metadata.put("image_entry_count", imageEntryCount);
        metadata.put("map_json_files", mapJsonFiles);
        metadata.put("sample_entries", sampleEntries);
        metadata.put("attached_scene_code", attachedSceneCode);

        Map<String, Object> preview = new LinkedHashMap<>();
        preview.put("source_kind", "zip_bundle");
        preview.put("attached_scene_code", attachedSceneCode);
        preview.put("embedded_map_preview", embeddedMapPreview);
        preview.put("preview_highlights", previewHighlights);
        preview.put("sample_entries", sampleEntries);

        return new ParsedTownAsset("rpg_bundle", sourceName, metadata, preview, previewHighlights);
    }

    private ParsedTownAsset parseJsonTownAsset(String sourceName, byte[] content, String attachedSceneCode) {
        Map<String, Object> preview = parseJsonPreview(content);
        Map<String, Object> metadata = new LinkedHashMap<>(preview);
        metadata.remove("preview_highlights");
        metadata.put("attached_scene_code", attachedSceneCode);
        List<String> previewHighlights = limitStrings(parseStringListFromMap(preview.get("preview_highlights")), 6, 180);
        if (attachedSceneCode != null && !previewHighlights.contains("当前挂接场景：" + attachedSceneCode)) {
            previewHighlights = new ArrayList<>(previewHighlights);
            previewHighlights.add("当前挂接场景：" + attachedSceneCode);
        }
        preview.put("attached_scene_code", attachedSceneCode);
        preview.put("preview_highlights", previewHighlights);
        String assetType = Boolean.TRUE.equals(preview.get("map_like")) ? "rpg_map" : "json_asset";
        return new ParsedTownAsset(assetType, sourceName, metadata, preview, previewHighlights);
    }

    private ParsedTownAsset parseImageTownAsset(String sourceName, byte[] content, String attachedSceneCode) {
        List<String> previewHighlights = new ArrayList<>();
        previewHighlights.add("图像资源已导入，可作为地图参考素材使用");
        if (attachedSceneCode != null) {
            previewHighlights.add("当前挂接场景：" + attachedSceneCode);
        }

        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("file_extension", sourceName.substring(sourceName.lastIndexOf('.') + 1).toLowerCase(Locale.ROOT));
        metadata.put("raw_size_bytes", content.length);
        metadata.put("attached_scene_code", attachedSceneCode);

        Map<String, Object> preview = new LinkedHashMap<>();
        preview.put("source_kind", "image_asset");
        preview.put("attached_scene_code", attachedSceneCode);
        preview.put("preview_highlights", previewHighlights);

        return new ParsedTownAsset("tileset_image", sourceName, metadata, preview, previewHighlights);
    }

    private Map<String, Object> parseJsonPreview(byte[] content) {
        try {
            JsonNode root = objectMapper.readTree(content);
            Map<String, Object> preview = new LinkedHashMap<>();
            List<String> previewHighlights = new ArrayList<>();
            preview.put("root_type", root.isArray() ? "array" : "object");
            if (root.isObject()) {
                List<String> topLevelKeys = toMapFromJsonNode(root).keySet().stream()
                    .map(String::valueOf)
                    .toList();
                preview.put("top_level_keys", limitStrings(topLevelKeys, 10, 64));
            }
            boolean mapLike = root.isObject()
                && root.path("width").canConvertToInt()
                && root.path("height").canConvertToInt()
                && root.path("data").isArray();
            preview.put("map_like", mapLike);
            if (mapLike) {
                int width = root.path("width").asInt(0);
                int height = root.path("height").asInt(0);
                int eventCount = countEvents(root.path("events"));
                preview.put("width", width);
                preview.put("height", height);
                preview.put("event_count", eventCount);
                preview.put("tileset_id", root.path("tilesetId").asInt(0));
                previewHighlights.add("地图尺寸 " + width + "x" + height);
                previewHighlights.add("事件点位 " + eventCount + " 个");
            } else if (root.isArray()) {
                preview.put("item_count", root.size());
                previewHighlights.add("JSON 数组条目 " + root.size() + " 个");
            } else {
                previewHighlights.add("JSON 对象已解析，可继续挂接到小镇编辑区");
            }
            preview.put("preview_highlights", previewHighlights);
            return preview;
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid RPGMaker json asset");
        }
    }

    private byte[] readEntryBytes(InputStream inputStream) throws IOException {
        return inputStream.readAllBytes();
    }

    private int countEvents(JsonNode eventsNode) {
        if (eventsNode == null || eventsNode.isMissingNode() || eventsNode.isNull()) {
            return 0;
        }
        if (eventsNode.isArray()) {
            int count = 0;
            for (JsonNode node : eventsNode) {
                if (node != null && !node.isNull() && !node.isMissingNode()) {
                    count += 1;
                }
            }
            return count;
        }
        if (eventsNode.isObject()) {
            return eventsNode.size();
        }
        return 0;
    }

    private Map<String, Object> toMapFromJsonNode(JsonNode node) {
        return objectMapper.convertValue(node, Map.class);
    }

    private List<String> parseStringListFromMap(Object rawValue) {
        if (rawValue instanceof List<?> list) {
            return list.stream()
                .map(item -> normalizeOptionalText(item == null ? null : String.valueOf(item)))
                .filter(item -> item != null && !item.isBlank())
                .toList();
        }
        return List.of();
    }

    private List<String> limitStrings(List<String> rawValues, int maxItems, int maxLength) {
        if (rawValues == null || rawValues.isEmpty()) {
            return List.of();
        }
        LinkedHashSet<String> results = new LinkedHashSet<>();
        for (String rawValue : rawValues) {
            String normalized = normalizeOptionalText(rawValue);
            if (normalized == null) {
                continue;
            }
            if (normalized.length() > maxLength) {
                normalized = normalized.substring(0, maxLength);
            }
            results.add(normalized);
            if (results.size() >= maxItems) {
                break;
            }
        }
        return List.copyOf(results);
    }

    private String normalizeSourceName(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return "unnamed.asset";
        }
        return normalized.length() > 255 ? normalized.substring(0, 255) : normalized;
    }

    private String normalizeMemoryNote(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 500 ? normalized.substring(0, 500) : normalized;
    }

    private String normalizeMemoryQuery(String raw) {
        String normalized = normalizeOptionalText(raw);
        if (normalized == null) {
            return null;
        }
        return normalized.length() > 240 ? normalized.substring(0, 240) : normalized;
    }

    private ScopeParts parseScopeParts(String scopeId) {
        String normalizedScopeId = normalizeScopeId(scopeId);
        if (normalizedScopeId == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "scope_id is required");
        }
        String[] segments = normalizedScopeId.split(":");
        if (segments.length != 4) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "scope_id format is invalid");
        }
        return new ScopeParts(segments[1], segments[2], segments[3]);
    }

    private record ScopeParts(
        String domainType,
        String actorCode,
        String sceneCode
    ) {
    }

    private record ParsedTownAsset(
        String assetType,
        String sourceName,
        Map<String, Object> metadata,
        Map<String, Object> preview,
        List<String> previewHighlights
    ) {
    }

    private record MemoryConversationContext(
        String scopeId,
        boolean enabled,
        String profileSummary,
        List<String> summaryHighlights,
        List<String> episodicHighlights,
        List<String> journalHighlights,
        boolean shouldPersistRecord
    ) {
        private static MemoryConversationContext disabled(String scopeId) {
            return new MemoryConversationContext(scopeId, false, "", List.of(), List.of(), List.of(), false);
        }
    }
}
