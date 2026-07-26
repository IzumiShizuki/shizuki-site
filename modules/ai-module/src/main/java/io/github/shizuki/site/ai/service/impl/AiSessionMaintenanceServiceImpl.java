package io.github.shizuki.site.ai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.ai.entity.AiMessageEntity;
import io.github.shizuki.site.ai.entity.AiSessionEntity;
import io.github.shizuki.site.ai.mapper.AiMessageMapper;
import io.github.shizuki.site.ai.mapper.AiSessionMapper;
import io.github.shizuki.site.ai.request.UpdateAiSessionRequest;
import io.github.shizuki.site.ai.response.AiSessionListItemResponse;
import io.github.shizuki.site.ai.response.AiSessionMessageResponse;
import io.github.shizuki.site.ai.response.AiSessionMessagesResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import io.github.shizuki.site.ai.service.AiSessionMaintenanceService;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AiSessionMaintenanceServiceImpl implements AiSessionMaintenanceService {

    private static final int DEFAULT_MESSAGE_LIMIT = 200;
    private static final int MAX_MESSAGE_LIMIT = 500;
    private static final int MAX_LIST_SESSIONS = 50;
    private static final Set<String> SUPPORTED_SESSION_MODES = Set.of("quick_chat", "normal", "tavern", "town_npc", "companion");

    private final AiSessionMapper aiSessionMapper;
    private final AiMessageMapper aiMessageMapper;
    private final ObjectMapper objectMapper;

    public AiSessionMaintenanceServiceImpl(AiSessionMapper aiSessionMapper,
                                           AiMessageMapper aiMessageMapper,
                                           ObjectMapper objectMapper) {
        this.aiSessionMapper = aiSessionMapper;
        this.aiMessageMapper = aiMessageMapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<AiSessionListItemResponse> listSessionSummaries() {
        Long userId = requireLoginUserId();
        return aiSessionMapper.selectList(
                new LambdaQueryWrapper<AiSessionEntity>()
                    .eq(AiSessionEntity::getUserId, userId)
                    .eq(AiSessionEntity::getDeleted, 0)
                    .orderByDesc(AiSessionEntity::getUpdatedAt)
                    .last("LIMIT " + MAX_LIST_SESSIONS)
            ).stream()
            .map(this::toListItem)
            .toList();
    }

    @Override
    public AiSessionMessagesResponse listSessionMessages(String sessionId, Integer limit) {
        Long userId = requireLoginUserId();
        AiSessionEntity session = loadOwnedSession(sessionId, userId);
        int normalizedLimit = normalizeLimit(limit);

        List<AiMessageEntity> rows = aiMessageMapper.selectList(
            new LambdaQueryWrapper<AiMessageEntity>()
                .eq(AiMessageEntity::getSessionId, session.getId())
                .eq(AiMessageEntity::getDeleted, 0)
                .orderByDesc(AiMessageEntity::getId)
                .last("LIMIT " + normalizedLimit)
        );

        List<AiSessionMessageResponse> messages = rows.stream()
            .sorted((left, right) -> Long.compare(safeId(left), safeId(right)))
            .map(row -> new AiSessionMessageResponse(
                row.getId(),
                normalizeRole(row.getRoleName()),
                row.getContent() == null ? "" : row.getContent(),
                row.getCreatedAt()
            ))
            .toList();

        return new AiSessionMessagesResponse(
            session.getSessionId(),
            session.getTitle(),
            normalizeSessionMode(session.getMode()),
            session.getCharacterId(),
            parseWorldbookIds(session.getBoundWorldbookJson()),
            normalizeOptionalText(session.getScenePrompt()),
            normalizeCode(session.getTownRoomCode()),
            normalizeCode(session.getActorCode()),
            messages
        );
    }

    @Override
    public AiSessionSummary updateSession(String sessionId, UpdateAiSessionRequest request) {
        Long userId = requireLoginUserId();
        AiSessionEntity session = loadOwnedSession(sessionId, userId);

        String title = request == null ? "" : normalizeTitle(request.getTitle());
        if (title.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Session title cannot be empty");
        }
        session.setTitle(title);
        session.setUpdatedAt(LocalDateTime.now());
        aiSessionMapper.updateById(session);
        return toSummary(session);
    }

    @Override
    public void deleteSession(String sessionId) {
        Long userId = requireLoginUserId();
        AiSessionEntity session = loadOwnedSession(sessionId, userId);
        session.setDeleted(1);
        session.setUpdatedAt(LocalDateTime.now());
        aiSessionMapper.updateById(session);
    }

    private AiSessionEntity loadOwnedSession(String sessionId, Long userId) {
        String normalized = sessionId == null ? "" : sessionId.trim();
        if (normalized.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "sessionId is required");
        }
        AiSessionEntity session = aiSessionMapper.selectOne(
            new LambdaQueryWrapper<AiSessionEntity>()
                .eq(AiSessionEntity::getSessionId, normalized)
                .eq(AiSessionEntity::getUserId, userId)
                .eq(AiSessionEntity::getDeleted, 0)
        );
        if (session == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Session not found");
        }
        return session;
    }

    private Long requireLoginUserId() {
        Long userId = LoginUserContext.get().map(loginUser -> loginUser.getUserId()).orElse(null);
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
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

    private AiSessionListItemResponse toListItem(AiSessionEntity entity) {
        return new AiSessionListItemResponse(
            entity.getSessionId(),
            entity.getTitle(),
            normalizeSessionMode(entity.getMode()),
            entity.getCharacterId(),
            parseWorldbookIds(entity.getBoundWorldbookJson()),
            normalizeOptionalText(entity.getScenePrompt()),
            normalizeCode(entity.getTownRoomCode()),
            normalizeCode(entity.getActorCode()),
            toEpochMillis(entity.getUpdatedAt())
        );
    }

    private Long toEpochMillis(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
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
            return List.of();
        }
    }

    private Long toLongOrNull(Object value) {
        if (value instanceof Number number) {
            return number.longValue();
        }
        try {
            return Long.parseLong(String.valueOf(value).trim());
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    private long safeId(AiMessageEntity entity) {
        return entity.getId() == null ? 0L : entity.getId();
    }

    private int normalizeLimit(Integer limit) {
        if (limit == null || limit <= 0) {
            return DEFAULT_MESSAGE_LIMIT;
        }
        return Math.min(limit, MAX_MESSAGE_LIMIT);
    }

    private String normalizeRole(String rawRole) {
        String normalized = rawRole == null ? "" : rawRole.trim().toLowerCase(Locale.ROOT);
        return switch (normalized) {
            case "assistant", "system" -> normalized;
            default -> "user";
        };
    }

    private String normalizeSessionMode(String rawMode) {
        String normalized = rawMode == null ? "" : rawMode.trim().toLowerCase(Locale.ROOT);
        return SUPPORTED_SESSION_MODES.contains(normalized) ? normalized : "quick_chat";
    }

    private String normalizeTitle(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        if (normalized.length() > 255) {
            return normalized.substring(0, 255);
        }
        return normalized;
    }

    private String normalizeOptionalText(String raw) {
        String normalized = raw == null ? "" : raw.trim();
        return normalized.isEmpty() ? null : normalized;
    }

    private String normalizeCode(String raw) {
        String normalized = raw == null ? "" : raw.trim();
        return normalized.isEmpty() ? null : normalized;
    }
}
