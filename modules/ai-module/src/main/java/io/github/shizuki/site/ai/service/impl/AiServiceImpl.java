package io.github.shizuki.site.ai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.ai.integration.UserQuotaGateway;
import io.github.shizuki.site.ai.config.AiQuotaProperties;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.entity.AiCharacterEntity;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.service.AiService;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
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
    private static final int MAX_LIST_SESSIONS = 50;
    private static final Set<String> SUPPORTED_SESSION_MODES = Set.of("quick_chat", "normal", "tavern", "town_npc", "companion");

    private final AiQuotaUsageMapper aiQuotaUsageMapper;
    private final AiCharacterMapper aiCharacterMapper;
    private final AiSessionMapper aiSessionMapper;
    private final AiMessageMapper aiMessageMapper;
    private final AiQuotaProperties aiQuotaProperties;
    private final UserQuotaGateway userQuotaClient;
    private final ObjectMapper objectMapper;

    public AiServiceImpl(AiQuotaUsageMapper aiQuotaUsageMapper,
                         AiCharacterMapper aiCharacterMapper,
                         AiSessionMapper aiSessionMapper,
                         AiMessageMapper aiMessageMapper,
                         AiQuotaProperties aiQuotaProperties,
                         UserQuotaGateway userQuotaClient,
                         ObjectMapper objectMapper) {
        this.aiQuotaUsageMapper = aiQuotaUsageMapper;
        this.aiCharacterMapper = aiCharacterMapper;
        this.aiSessionMapper = aiSessionMapper;
        this.aiMessageMapper = aiMessageMapper;
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
        String assistantMessage = buildAssistantReply(sessionMode, session, request);
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();

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
        response.put("memory_enabled", Boolean.TRUE.equals(request.getMemoryEnabled()));
        response.put("scope_id", normalizeOptionalText(request.getScopeId()));
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

    private Map<String, Object> saveCharacter(String type, Map<String, Object> request) {
        Long userId = requireLoginUserId();
        AiCharacterEntity entity = new AiCharacterEntity();
        entity.setUserId(userId);
        entity.setTypeName(type);
        entity.setPayloadJson(toJson(request));
        entity.setCreatedAt(LocalDateTime.now());
        aiCharacterMapper.insert(entity);

        return Map.of("status", "CREATED", "type", type, "id", entity.getId(), "payload", request == null ? Map.of() : request);
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

    private String buildAssistantReply(String sessionMode, AiSessionEntity session, SendMessageRequest request) {
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();
        String normalized = request.getMessage().trim();
        if (normalized.length() > 120) {
            normalized = normalized.substring(0, 120);
        }
        boolean memoryEnabled = Boolean.TRUE.equals(request.getMemoryEnabled());
        String focus = normalized.toLowerCase(Locale.ROOT);

        if ("tavern".equals(sessionMode)) {
            String scenePrompt = session == null ? "" : previewText(session.getScenePrompt(), 28);
            long worldbookCount = session == null ? 0 : parseWorldbookIds(session.getBoundWorldbookJson()).size();
            String actorHint = session != null && session.getCharacterId() != null ? "character=" + session.getCharacterId() : "character=unset";
            String sceneHint = scenePrompt.isBlank() ? "scene=default" : "scene=" + scenePrompt;
            return "[Tavern mode] " + actorHint + ", worldbooks=" + worldbookCount + ", " + sceneHint
                + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        if ("normal".equals(sessionMode)) {
            return "[Normal mode] Context=" + contextSize + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        if ("companion".equals(sessionMode) || "town_npc".equals(sessionMode)) {
            String scope = normalizeOptionalText(request.getScopeId());
            return "[Scene mode] mode=" + sessionMode + ", scope=" + (scope == null ? "none" : scope)
                + ", memory=" + memoryEnabled + ", focus on: " + focus;
        }

        return "[Quick chat] Context=" + contextSize + ", focus on: " + focus;
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
