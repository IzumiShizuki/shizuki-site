package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers(disabledWithoutDocker = true)
class TodoDevMigrationIntegrationTest {

    @Container
    private static final MySQLContainer<?> MYSQL = new MySQLContainer<>("mysql:8.4");

    @Container
    private static final PostgreSQLContainer<?> POSTGRES = new PostgreSQLContainer<>("postgres:16-alpine");

    private static final String EVENT_INSERT = """
        INSERT INTO CTN_LA_TODO_DEV_EVENT
            (todo_id, request_id, request_hash, event_type, stage_code, status_code, source_code, summary_text,
             resulting_version_num)
        VALUES (1, '%s', 'digest', 'PROGRESS', 'DESIGN', 'IN_PROGRESS', 'MCP', 'test event', 1)
        """;

    @Test
    void migrationsDoNotBackfillLegacyRowsAndKeepEventsTiedToOneWorkflow() throws SQLException {
        verify(MYSQL, "monolith/db/migration/V438__light_app_todo_dev_workflow.sql");
        verify(POSTGRES, "monolith/db/migration-pg/V1108__light_app_todo_dev_workflow.sql");
    }

    private void verify(JdbcDatabaseContainer<?> database, String resource) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
            database.getJdbcUrl(), database.getUsername(), database.getPassword()
        ); Statement sql = connection.createStatement()) {
            sql.execute("""
                CREATE TABLE CTN_LA_TODO (
                    id BIGINT PRIMARY KEY,
                    title_text VARCHAR(200) NOT NULL,
                    reminder_enabled_flag SMALLINT NOT NULL
                )
                """);
            sql.execute("INSERT INTO CTN_LA_TODO VALUES (1, 'Dev Todo', 1), (2, 'Ordinary Todo', 1)");

            ScriptUtils.executeSqlScript(connection, new ClassPathResource(resource));
            ScriptUtils.executeSqlScript(connection, new ClassPathResource(resource));

            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO_DEV", 0);
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO WHERE reminder_enabled_flag = 1", 2);
            sql.execute("""
                INSERT INTO CTN_LA_TODO_DEV (todo_id, repository_ref, stage_code, status_code)
                VALUES (1, 'owner/repo', 'DESIGN', 'IN_PROGRESS')
                """);
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO_DEV WHERE todo_id = 1 AND version_num = 0", 1);
            assertThatThrownBy(() -> sql.execute("""
                INSERT INTO CTN_LA_TODO_DEV (todo_id, repository_ref, stage_code, status_code)
                VALUES (999, 'owner/repo', 'DESIGN', 'IN_PROGRESS')
                """)).isInstanceOf(SQLException.class);

            sql.execute(EVENT_INSERT.formatted("req-1"));
            assertThatThrownBy(() -> sql.execute(EVENT_INSERT.formatted("req-1"))).isInstanceOf(SQLException.class);
            sql.execute(EVENT_INSERT.formatted("Req-1"));
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO_DEV_EVENT", 2);

            sql.execute("DELETE FROM CTN_LA_TODO WHERE id = 1");
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO_DEV", 0);
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO_DEV_EVENT", 0);
            assertCount(sql, "SELECT COUNT(*) FROM CTN_LA_TODO WHERE id = 2 AND reminder_enabled_flag = 1", 1);
        }
    }

    private void assertCount(Statement sql, String query, int expected) throws SQLException {
        try (var result = sql.executeQuery(query)) {
            assertThat(result.next()).isTrue();
            assertThat(result.getInt(1)).isEqualTo(expected);
        }
    }
}
