package io.github.shizuki.site.ai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.ai.client.UserQuotaClient;
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
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl implements AiService {

    private final AiSessionMapper aiSessionMapper;
    private final AiMessageMapper aiMessageMapper;
    private final AiQuotaUsageMapper aiQuotaUsageMapper;
    private final AiCharacterMapper aiCharacterMapper;
    private final AiQuotaProperties aiQuotaProperties;
    private final UserQuotaClient userQuotaClient;
    private final ObjectMapper objectMapper;

    public AiServiceImpl(AiSessionMapper aiSessionMapper,
                      AiMessageMapper aiMessageMapper,
                      AiQuotaUsageMapper aiQuotaUsageMapper,
                      AiCharacterMapper aiCharacterMapper,
                      AiQuotaProperties aiQuotaProperties,
                      UserQuotaClient userQuotaClient,
                      ObjectMapper objectMapper) {
        this.aiSessionMapper = aiSessionMapper;
        this.aiMessageMapper = aiMessageMapper;
        this.aiQuotaUsageMapper = aiQuotaUsageMapper;
        this.aiCharacterMapper = aiCharacterMapper;
        this.aiQuotaProperties = aiQuotaProperties;
        this.userQuotaClient = userQuotaClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public AiSessionSummary createSession(CreateSessionRequest request) {
        // 会话 ID 使用业务前缀 + UUID，方便排查与后续扩展。
        Long userId = currentUserId();
        AiSessionEntity entity = new AiSessionEntity();
        entity.setSessionId("session-" + UUID.randomUUID());
        entity.setUserId(userId);
        entity.setTitle(request.getTitle());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        aiSessionMapper.insert(entity);
        return new AiSessionSummary(entity.getSessionId(), entity.getTitle());
    }

    @Override
    public List<AiSessionSummary> listSessions() {
        Long userId = currentUserId();
        // 只返回当前用户会话，按创建时间倒序展示最近会话。
        return aiSessionMapper.selectList(
                new LambdaQueryWrapper<AiSessionEntity>()
                    .eq(AiSessionEntity::getUserId, userId)
                    .orderByDesc(AiSessionEntity::getCreatedAt)
            )
            .stream()
            .map(session -> new AiSessionSummary(session.getSessionId(), session.getTitle()))
            .toList();
    }

    @Override
    public Map<String, Object> sendMessage(String sessionId, SendMessageRequest request) {
        Long userId = currentUserId();
        AiSessionEntity session = aiSessionMapper.selectOne(
            new LambdaQueryWrapper<AiSessionEntity>()
                .eq(AiSessionEntity::getSessionId, sessionId)
                .eq(AiSessionEntity::getUserId, userId)
        );
        if (session == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Session not found");
        }

        // 发送消息前先计算本次可用总额度，并执行扣减。
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

        // 当前阶段先返回 mock 回复，后续可替换为真实模型调用。
        insertMessage(session.getId(), userId, "user", request.getMessage());
        String assistantMessage = "[Mock reply] Focus on one thing at a time.";
        insertMessage(session.getId(), userId, "assistant", assistantMessage);

        return Map.of(
            "session_id", sessionId,
            "user_message", request.getMessage(),
            "assistant_message", assistantMessage,
            "used_rounds", next,
            "remaining_rounds", Math.max(0, usage.getTotalRounds() - next)
        );
    }

    @Override
    public Map<String, Object> myQuota() {
        Long userId = currentUserId();
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
        Long userId = currentUserId();
        AiCharacterEntity entity = new AiCharacterEntity();
        entity.setUserId(userId);
        entity.setTypeName(type);
        entity.setPayloadJson(toJson(request));
        entity.setCreatedAt(LocalDateTime.now());
        aiCharacterMapper.insert(entity);
        return Map.of("status", "CREATED", "type", type, "id", entity.getId(), "payload", request);
    }

    private void insertMessage(Long sessionId, Long userId, String role, String content) {
        AiMessageEntity entity = new AiMessageEntity();
        entity.setSessionId(sessionId);
        entity.setUserId(userId);
        entity.setRoleName(role);
        entity.setContent(content);
        entity.setCreatedAt(LocalDateTime.now());
        aiMessageMapper.insert(entity);
    }

    private AiQuotaUsageEntity loadOrCreateUsage(Long userId, long total) {
        AiQuotaUsageEntity usage = aiQuotaUsageMapper.selectOne(
            new LambdaQueryWrapper<AiQuotaUsageEntity>()
                .eq(AiQuotaUsageEntity::getUserId, userId)
                .eq(AiQuotaUsageEntity::getQuotaCode, aiQuotaProperties.getCode())
        );
        if (usage != null) {
            // 分组策略变化时，历史记录中的 total 需要同步刷新。
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
        Set<String> groups = LoginUserContext.get().map(loginUser -> loginUser.getGroups()).orElse(Set.of("USER"));
        // 配额策略由 user-service 统一解析，ai-service 只消费结果。
        Long resolved = userQuotaClient.resolveQuota(
            aiQuotaProperties.getCode(),
            groups,
            aiQuotaProperties.getDefaultTotalRounds()
        );
        return resolved == null ? aiQuotaProperties.getDefaultTotalRounds() : resolved;
    }

    private Long currentUserId() {
        return LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(0L);
    }

    private String toJson(Map<String, Object> payload) {
        try {
            return objectMapper.writeValueAsString(payload == null ? Map.of() : payload);
        } catch (JsonProcessingException e) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid payload json");
        }
    }
}
