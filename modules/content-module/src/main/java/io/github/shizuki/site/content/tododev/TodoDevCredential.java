package io.github.shizuki.site.content.tododev;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** First rollout: a single opt-in credential bound to one owner's project. */
@Component
public class TodoDevCredential {
    public static final String HEADER = "X-Todo-Dev-Token";
    private final byte[] digest;
    private final long ownerId;
    private final long projectId;

    public TodoDevCredential(
        @Value("${shizuki.todo-dev.token-sha256:${SHIZUKI_TODO_DEV_TOKEN_SHA256:}}") String digestHex,
        @Value("${shizuki.todo-dev.owner-id:${SHIZUKI_TODO_DEV_OWNER_ID:0}}") long ownerId,
        @Value("${shizuki.todo-dev.project-id:${SHIZUKI_TODO_DEV_PROJECT_ID:0}}") long projectId
    ) {
        this.digest = digestHex.matches("[0-9a-fA-F]{64}") ? HexFormat.of().parseHex(digestHex) : null;
        this.ownerId = ownerId;
        this.projectId = projectId;
    }

    Actor agent(String token) {
        if (ownerId <= 0 || projectId <= 0 || digest == null || token == null
            || !token.matches("[A-Za-z0-9_-]{32,256}") || !MessageDigest.isEqual(digest, sha256(token))) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid Todo development credential");
        }
        return new Actor(ownerId, projectId, "MCP");
    }

    Actor human(String token) {
        if (token != null) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "This action requires a website login");
        }
        long id = LoginUserContext.get().map(user -> user.getUserId()).filter(value -> value > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
        return new Actor(id, null, "WEB");
    }

    static byte[] sha256(String value) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(value.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    record Actor(long ownerId, Long projectId, String source) { }
}
