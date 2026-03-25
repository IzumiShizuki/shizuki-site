package io.github.shizuki.site.ai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.dto.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.dto.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
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
import io.github.shizuki.site.ai.service.AiService;
import io.github.shizuki.common.security.context.LoginUserContext;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl implements AiService {

    private static final String DEFAULT_SESSION_MODE = "quick_chat";
    private static final String DEFAULT_VISIBILITY_TYPE = "PRIVATE";
    private static final int MAX_LIST_SESSIONS = 50;
    private static final int MAX_LIST_CHARACTERS = 100;
    private static final int MAX_LIST_WORLDBOOKS = 100;
    private static final Set<String> SUPPORTED_SESSION_MODES = Set.of("quick_chat", "normal", "tavern", "town_npc", "companion");
    private static final Set<String> SUPPORTED_VISIBILITY_TYPES = Set.of("PRIVATE", "PUBLIC");
    private static final Set<String> MEMORY_SCENE_SESSION_MODES = Set.of("town_npc", "companion");

    private final AiQuotaUsageMapper aiQuotaUsageMapper;
    private final AiCharacterMapper aiCharacterMapper;
    private final AiSessionMapper aiSessionMapper;
    private final AiMessageMapper aiMessageMapper;
    private final AiWorldbookMapper aiWorldbookMapper;
    private final AiWorldbookEntryMapper aiWorldbookEntryMapper;
    private final AiQuotaProperties aiQuotaProperties;
    private final UserQuotaGateway userQuotaClient;
    private final ObjectMapper objectMapper;

    public AiServiceImpl(AiQuotaUsageMapper aiQuotaUsageMapper,
                         AiCharacterMapper aiCharacterMapper,
                         AiSessionMapper aiSessionMapper,
                         AiMessageMapper aiMessageMapper,
                         AiWorldbookMapper aiWorldbookMapper,
                         AiWorldbookEntryMapper aiWorldbookEntryMapper,
                         AiQuotaProperties aiQuotaProperties,
                         UserQuotaGateway userQuotaClient,
                         ObjectMapper objectMapper) {
        this.aiQuotaUsageMapper = aiQuotaUsageMapper;
        this.aiCharacterMapper = aiCharacterMapper;
        this.aiSessionMapper = aiSessionMapper;
        this.aiMessageMapper = aiMessageMapper;
        this.aiWorldbookMapper = aiWorldbookMapper;
        this.aiWorldbookEntryMapper = aiWorldbookEntryMapper;
        this.aiQuotaProperties = aiQuotaProperties;
        this.userQuotaClient = userQuotaClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public AiSessionSummary createSession(CreateSessionRequest request) {
        String mode = normalizeSessionMode(request.getMode());
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
    public Map<String, Object> sendMessage(String sessionId, SendMessageRequest request) {
        Long userId = currentUserIdOrNull();
        AiSessionEntity session = isLoggedIn(userId) ? loadOwnedSession(sessionId, userId) : null;
        String sessionMode = session == null ? DEFAULT_SESSION_MODE : normalizeSessionMode(session.getMode());
        List<Long> worldbookIds = session == null ? List.of() : parseWorldbookIds(session.getBoundWorldbookJson());
        boolean memoryEnabled = Boolean.TRUE.equals(request.getMemoryEnabled());

        Long usedRounds = null;
        Long remainingRounds = null;
        Long totalRounds = null;
        String quotaCode = null;

        if (isLoggedIn(userId)) {
            long total = resolveTotalQuota();
            AiQuotaUsageEntity usage = loadOrCreateUsage(userId, total);

            long next = usage.getUsedRounds() + 1;
            if (next > usage.getTotalRounds()) {
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

            usedRounds = next;
            remainingRounds = Math.max(0, usage.getTotalRounds() - next);
            totalRounds = usage.getTotalRounds();
            quotaCode = usage.getQuotaCode();
        }

        String normalizedMessage = request.getMessage().trim();
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();
        String scopeId = resolveScopeId(sessionMode, session, userId, request, memoryEnabled);
        String assistantMessage = buildAssistantReply(sessionMode, session, worldbookIds, normalizedMessage, contextSize, memoryEnabled, scopeId);

        if (session != null) {
            persistMessage(session.getId(), userId, "user", normalizedMessage);
            persistMessage(session.getId(), userId, "assistant", assistantMessage);
            session.setUpdatedAt(LocalDateTime.now());
            aiSessionMapper.updateById(session);
        }

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("session_id", sessionId);
        response.put("user_message", normalizedMessage);
        response.put("assistant_message", assistantMessage);
        response.put("mode", sessionMode);
        response.put("context_size", contextSize);
        response.put("memory_enabled", memoryEnabled);
        response.put("scope_id", scopeId);
        response.put("quota_applied", isLoggedIn(userId));
        response.put("character_id", session == null ? null : session.getCharacterId());
        response.put("worldbook_ids", worldbookIds);
        response.put("scene_prompt", session == null ? null : session.getScenePrompt());
        response.put("town_room_code", session == null ? null : session.getTownRoomCode());
        response.put("actor_code", session == null ? null : session.getActorCode());

        if (isLoggedIn(userId)) {
            response.put("quota_code", quotaCode);
            response.put("total_rounds", totalRounds);
            response.put("used_rounds", usedRounds);
            response.put("remaining_rounds", remainingRounds);
        }

        return response;
    }

    @Override
    public Map<String, Object> myQuota() {
        Long userId = requireLoginUserId();
        long total = resolveTotalQuota();
        AiQuotaUsageEntity usage = loadOrCreateUsage(userId, total);

        return Map.of(
            "quota_code", usage.getQuotaCode(),
            "total", usage.getTotalRounds(),
            "used", usage.getUsedRounds(),
            "remaining", Math.max(0, usage.getTotalRounds() - usage.getUsedRounds())
        );
    }

    @Override
    public Map<String, Object> createCharacter(Map<String, Object> request) {
        return saveCharacter("character", request);
    }

    @Override
    public Map<String, Object> importCharacterCard(Map<String, Object> request) {
        return saveCharacter("character_card_png", request);
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

    private Map<String, Object> saveCharacter(String type, Map<String, Object> request) {
        Long userId = requireLoginUserId();
        Map<String, Object> payload = request == null ? Map.of() : request;
        LocalDateTime now = LocalDateTime.now();
        AiCharacterEntity entity = new AiCharacterEntity();
        entity.setUserId(userId);
        entity.setTypeName(type);
        entity.setDisplayName(resolveCharacterDisplayName(payload, type));
        entity.setCoverAssetId(resolveOptionalLong(payload.get("cover_asset_id"), payload.get("coverAssetId"), payload.get("avatar_asset_id"), payload.get("avatarAssetId")));
        entity.setVisibilityType(normalizeVisibilityType(resolveOptionalText(payload.get("visibility_type"), payload.get("visibilityType"))));
        entity.setPayloadJson(toJson(payload));
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);
        entity.setDeleted(0);
        entity.setVersion(0);
        aiCharacterMapper.insert(entity);

        return Map.of(
            "status", "CREATED",
            "type", type,
            "id", entity.getId(),
            "display_name", entity.getDisplayName(),
            "visibility_type", entity.getVisibilityType(),
            "payload", payload
        );
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
                                       String scopeId) {
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
            return "[Scene mode] mode=" + sessionMode + ", scope=" + (scopeId == null ? "none" : scopeId)
                + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        return "[Quick chat] Context=" + contextSize + ", focus on: " + focus;
    }

    private String resolveScopeId(String sessionMode,
                                  AiSessionEntity session,
                                  Long userId,
                                  SendMessageRequest request,
                                  boolean memoryEnabled) {
        String requestedScopeId = normalizeScopeId(request == null ? null : request.getScopeId());
        if (!memoryEnabled) {
            return null;
        }
        if (!MEMORY_SCENE_SESSION_MODES.contains(sessionMode) || session == null || !isLoggedIn(userId)) {
            return requestedScopeId;
        }
        String actorCode = normalizeScopeSegment(session.getActorCode());
        String sceneCode = resolveScopeSceneCode(sessionMode, session);
        if (actorCode == null || sceneCode == null) {
            return requestedScopeId;
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
            return "home";
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
}
