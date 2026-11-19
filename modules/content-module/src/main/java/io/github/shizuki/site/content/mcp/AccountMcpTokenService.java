package io.github.shizuki.site.content.mcp;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.HexFormat;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountMcpTokenService {
    public static final String HEADER = "X-MCP-Token";
    public static final String TODO_DEV = "todo-dev";
    private static final String PREFIX = "mcp_";
    private static final SecureRandom RANDOM = new SecureRandom();
    private final AccountMcpTokenRepository repository;

    AccountMcpTokenService(AccountMcpTokenRepository repository) {
        this.repository = repository;
    }

    Status status(long userId) {
        return repository.find(userId).map(row -> new Status(row.active(), utc(row.created()), utc(row.rotated()),
            row.todoProjectId() == null ? List.of() : List.of(TODO_DEV),
            row.todoProjectId() == null ? null : row.todoProjectId().toString()))
            .orElseGet(() -> new Status(false, null, null, List.of(), null));
    }

    List<Project> projects(long userId) {
        return repository.projects(userId).stream().map(row -> new Project(Long.toString(row.id()), row.name())).toList();
    }

    @Transactional
    public Issued rotate(long userId) {
        lock(userId);
        byte[] secret = new byte[32];
        RANDOM.nextBytes(secret);
        String token = PREFIX + Base64.getUrlEncoder().withoutPadding().encodeToString(secret);
        String digest = digest(token);
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        if (repository.updateToken(userId, digest, now) == 0) {
            repository.insertToken(userId, digest, now);
        }
        return new Issued(status(userId), token);
    }

    @Transactional
    public Status revoke(long userId) {
        lock(userId);
        repository.revoke(userId);
        return status(userId);
    }

    @Transactional
    public Status bindTodoProject(long userId, Long projectId) {
        lock(userId);
        if (projectId != null && (projectId <= 0 || !repository.ownsProject(userId, projectId))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Project is unavailable");
        }
        repository.setProject(userId, projectId);
        return status(userId);
    }

    public ScopedGrant authorize(String token, String scope) {
        if (token == null || !token.matches("mcp_[A-Za-z0-9_-]{43}")) {
            throw unauthorized();
        }
        var row = repository.findGrant(digest(token)).orElseThrow(AccountMcpTokenService::unauthorized);
        if (!TODO_DEV.equals(scope) || row.todoProjectId() == null) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "MCP scope is not granted");
        }
        return new ScopedGrant(row.userId(), row.todoProjectId());
    }

    private void lock(long userId) {
        if (!repository.lockAccount(userId)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
    }

    static String digest(String token) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                .digest(token.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }

    private static String utc(LocalDateTime value) {
        return value == null ? null : value.toInstant(ZoneOffset.UTC).toString();
    }

    private static BusinessException unauthorized() {
        return new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid MCP account credential");
    }

    record Status(boolean active, String createdAt, String lastRotatedAt, List<String> scopes, String todoProjectId) { }
    record Project(String projectId, String name) { }
    public record Issued(Status status, String token) {
        @Override public String toString() { return "Issued[status=" + status + ", token=<redacted>]"; }
    }
    public record ScopedGrant(long userId, long projectId) { }
}
