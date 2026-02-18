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
import io.github.shizuki.site.ai.entity.AiQuotaUsageEntity;
import io.github.shizuki.site.ai.mapper.AiCharacterMapper;
import io.github.shizuki.site.ai.mapper.AiQuotaUsageMapper;
import io.github.shizuki.site.ai.service.AiService;
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

    private final AiQuotaUsageMapper aiQuotaUsageMapper;
    private final AiCharacterMapper aiCharacterMapper;
    private final AiQuotaProperties aiQuotaProperties;
    private final UserQuotaGateway userQuotaClient;
    private final ObjectMapper objectMapper;

    public AiServiceImpl(AiQuotaUsageMapper aiQuotaUsageMapper,
                         AiCharacterMapper aiCharacterMapper,
                         AiQuotaProperties aiQuotaProperties,
                         UserQuotaGateway userQuotaClient,
                         ObjectMapper objectMapper) {
        this.aiQuotaUsageMapper = aiQuotaUsageMapper;
        this.aiCharacterMapper = aiCharacterMapper;
        this.aiQuotaProperties = aiQuotaProperties;
        this.userQuotaClient = userQuotaClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public AiSessionSummary createSession(CreateSessionRequest request) {
        // 会话记忆保留在前端，本接口仅回传一个新的会话编号用于客户端分组。
        return new AiSessionSummary("session-" + UUID.randomUUID(), request.getTitle());
    }

    @Override
    public List<AiSessionSummary> listSessions() {
        // 会话列表由前端本地维护，服务端不存储历史会话。
        return List.of();
    }

    @Override
    public Map<String, Object> sendMessage(String sessionId, SendMessageRequest request) {
        Long userId = currentUserIdOrNull();

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

        String assistantMessage = buildAssistantReply(request);
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("session_id", sessionId);
        response.put("user_message", request.getMessage());
        response.put("assistant_message", assistantMessage);
        response.put("context_size", contextSize);
        response.put("quota_applied", isLoggedIn(userId));

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

    private String buildAssistantReply(SendMessageRequest request) {
        int contextSize = request.getContext() == null ? 0 : request.getContext().size();
        String normalized = request.getMessage().trim();
        if (normalized.length() > 120) {
            normalized = normalized.substring(0, 120);
        }
        return "[Mock reply] Context=" + contextSize + ", focus on: " + normalized.toLowerCase(Locale.ROOT);
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
        try {
            return objectMapper.writeValueAsString(payload == null ? Map.of() : payload);
        } catch (JsonProcessingException e) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid payload json");
        }
    }
}
