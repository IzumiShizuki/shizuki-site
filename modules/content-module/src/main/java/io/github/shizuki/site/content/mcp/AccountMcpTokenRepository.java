package io.github.shizuki.site.content.mcp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class AccountMcpTokenRepository {
    private final JdbcTemplate jdbc;

    AccountMcpTokenRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    boolean lockAccount(long userId) {
        return !jdbc.queryForList("SELECT id FROM USR_ACCOUNT WHERE id = ? AND deleted_flag = 0 FOR UPDATE",
            Long.class, userId).isEmpty();
    }

    Optional<Row> find(long userId) {
        return jdbc.query("""
            SELECT t.token_sha256, t.token_created_at, t.token_rotated_at, p.id AS todo_project_id
            FROM USR_MCP_ACCOUNT_TOKEN t
            JOIN USR_ACCOUNT a ON a.id = t.user_id AND a.deleted_flag = 0
            LEFT JOIN CTN_LA_PROJECT p ON p.id = t.todo_project_id AND p.user_id = t.user_id
              AND p.deleted_flag = 0 AND p.archived_flag = 0
            WHERE t.user_id = ?
            """, (rs, ignored) -> new Row(rs.getString("token_sha256") != null,
                rs.getObject("token_created_at", LocalDateTime.class),
                rs.getObject("token_rotated_at", LocalDateTime.class),
                rs.getObject("todo_project_id", Long.class)), userId).stream().findFirst();
    }

    int updateToken(long userId, String digest, LocalDateTime now) {
        return jdbc.update("""
            UPDATE USR_MCP_ACCOUNT_TOKEN
            SET token_sha256 = ?, token_created_at = COALESCE(token_created_at, ?), token_rotated_at = ?
            WHERE user_id = ?
            """, digest, now, now, userId);
    }

    void insertToken(long userId, String digest, LocalDateTime now) {
        jdbc.update("""
            INSERT INTO USR_MCP_ACCOUNT_TOKEN (user_id, token_sha256, token_created_at, token_rotated_at)
            VALUES (?, ?, ?, ?)
            """, userId, digest, now, now);
    }

    void revoke(long userId) {
        jdbc.update("""
            UPDATE USR_MCP_ACCOUNT_TOKEN
            SET token_sha256 = NULL, token_created_at = NULL, token_rotated_at = NULL
            WHERE user_id = ?
            """, userId);
    }

    boolean ownsProject(long userId, long projectId) {
        return !jdbc.queryForList("""
            SELECT id FROM CTN_LA_PROJECT
            WHERE user_id = ? AND id = ? AND deleted_flag = 0 AND archived_flag = 0
            """, Long.class, userId, projectId).isEmpty();
    }

    void setProject(long userId, Long projectId) {
        int updated = jdbc.update("UPDATE USR_MCP_ACCOUNT_TOKEN SET todo_project_id = ? WHERE user_id = ?",
            projectId, userId);
        if (updated == 0 && projectId != null && find(userId).isEmpty()) {
            jdbc.update("INSERT INTO USR_MCP_ACCOUNT_TOKEN (user_id, todo_project_id) VALUES (?, ?)", userId, projectId);
        }
    }

    List<Project> projects(long userId) {
        return jdbc.query("""
            SELECT id, name_text FROM CTN_LA_PROJECT
            WHERE user_id = ? AND deleted_flag = 0 AND archived_flag = 0
            ORDER BY name_text, id LIMIT 500
            """, (rs, ignored) -> new Project(rs.getLong("id"), rs.getString("name_text")), userId);
    }

    Optional<Grant> findGrant(String digest) {
        return jdbc.query("""
            SELECT t.user_id, p.id AS todo_project_id
            FROM USR_MCP_ACCOUNT_TOKEN t
            JOIN USR_ACCOUNT a ON a.id = t.user_id AND a.deleted_flag = 0
            LEFT JOIN CTN_LA_PROJECT p ON p.id = t.todo_project_id AND p.user_id = t.user_id
              AND p.deleted_flag = 0 AND p.archived_flag = 0
            WHERE t.token_sha256 = ?
            """, (rs, ignored) -> new Grant(rs.getLong("user_id"),
                rs.getObject("todo_project_id", Long.class)), digest).stream().findFirst();
    }

    record Row(boolean active, LocalDateTime created, LocalDateTime rotated, Long todoProjectId) { }
    record Project(long id, String name) { }
    record Grant(long userId, Long todoProjectId) { }
}
