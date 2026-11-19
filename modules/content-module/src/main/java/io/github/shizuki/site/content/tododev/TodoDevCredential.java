package io.github.shizuki.site.content.tododev;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.content.mcp.AccountMcpTokenService;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Component;

@Component
public class TodoDevCredential {
    /** Recognized only to reject the retired credential, not to authenticate it. */
    public static final String RETIRED_HEADER = "X-Todo-Dev-Token";
    private final AccountMcpTokenService accountTokens;

    public TodoDevCredential(AccountMcpTokenService accountTokens) {
        this.accountTokens = accountTokens;
    }

    Actor agent(String accountToken, String retiredToken) {
        if (retiredToken != null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Use the website MCP account token");
        }
        var grant = accountTokens.authorize(accountToken, AccountMcpTokenService.TODO_DEV);
        return new Actor(grant.userId(), grant.projectId(), "MCP");
    }

    Actor human() {
        long id = LoginUserContext.get().filter(user -> !user.inGroup("GUEST") && !user.inGroup("GUEST_AUTHOR"))
            .map(user -> user.getUserId()).filter(value -> value > 0)
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
