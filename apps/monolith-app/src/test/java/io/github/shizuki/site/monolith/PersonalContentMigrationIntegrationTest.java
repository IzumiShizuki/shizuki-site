package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers(disabledWithoutDocker = true)
class PersonalContentMigrationIntegrationTest {

    private static final String MYSQL_MIGRATION =
        "monolith/db/migration/V431__personal_content_foundation.sql";
    private static final String POSTGRES_MIGRATION =
        "monolith/db/migration-pg/V1012__personal_content_foundation.sql";

    private static final List<String> FOUNDATION_TABLES = List.of(
        "CTN_PHOTO",
        "CTN_ALBUM",
        "CTN_ALBUM_PHOTO",
        "CTN_MOMENT",
        "CTN_MOMENT_PHOTO",
        "CTN_SITE_LOCATION",
        "CTN_SITE_WIDGET_CONFIG",
        "CTN_QUOTE",
        "CTN_DAILY_QUOTE_SNAPSHOT",
        "CTN_WEATHER_SNAPSHOT",
        "MDA_ASSET_VARIANT"
    );

    @Container
    private static final MySQLContainer<?> MYSQL = new MySQLContainer<>("mysql:8.4")
        .withDatabaseName("shizuki_migration")
        .withUsername("shizuki")
        .withPassword("shizuki");

    @Container
    private static final PostgreSQLContainer<?> POSTGRES = new PostgreSQLContainer<>("postgres:16-alpine")
        .withDatabaseName("shizuki_migration")
        .withUsername("shizuki")
        .withPassword("shizuki");

    @Test
    void freshSchemasAreEquivalentAndConstraintsSurviveRepeatedStartup() throws Exception {
        try (Connection mysql = connect(MYSQL); Connection postgres = connect(POSTGRES)) {
            reset(mysql, Dialect.MYSQL);
            reset(postgres, Dialect.POSTGRESQL);
            createPrerequisites(mysql, Dialect.MYSQL);
            createPrerequisites(postgres, Dialect.POSTGRESQL);

            executeMigration(mysql, MYSQL_MIGRATION);
            executeMigration(postgres, POSTGRES_MIGRATION);

            assertNoPersonalContent(mysql);
            assertNoPersonalContent(postgres);
            assertThat(readSchema(mysql, Dialect.MYSQL))
                .isEqualTo(readSchema(postgres, Dialect.POSTGRESQL));

            verifyUniqueConstraints(mysql);
            verifyUniqueConstraints(postgres);
            Map<String, Long> mysqlCounts = readFoundationCounts(mysql);
            Map<String, Long> postgresCounts = readFoundationCounts(postgres);

            executeMigration(mysql, MYSQL_MIGRATION);
            executeMigration(postgres, POSTGRES_MIGRATION);

            assertThat(readFoundationCounts(mysql)).isEqualTo(mysqlCounts);
            assertThat(readFoundationCounts(postgres)).isEqualTo(postgresCounts);
            assertPermissionSeedIsStable(mysql);
            assertPermissionSeedIsStable(postgres);
        }
    }

    @Test
    void existingRowsRemainIntactWhenFoundationIsAppliedAndReapplied() throws Exception {
        try (Connection mysql = connect(MYSQL); Connection postgres = connect(POSTGRES)) {
            for (DatabaseUnderTest database : List.of(
                new DatabaseUnderTest(mysql, Dialect.MYSQL, MYSQL_MIGRATION),
                new DatabaseUnderTest(postgres, Dialect.POSTGRESQL, POSTGRES_MIGRATION)
            )) {
                reset(database.connection(), database.dialect());
                createPrerequisites(database.connection(), database.dialect());
                seedExistingRows(database.connection());

                executeMigration(database.connection(), database.migration());
                assertExistingRowsRemain(database.connection());
                assertNoPersonalContent(database.connection());

                executeMigration(database.connection(), database.migration());
                assertExistingRowsRemain(database.connection());
                assertNoPersonalContent(database.connection());
                assertPermissionSeedIsStable(database.connection());
            }
        }
    }

    private Connection connect(org.testcontainers.containers.JdbcDatabaseContainer<?> container)
        throws SQLException {
        return DriverManager.getConnection(container.getJdbcUrl(), container.getUsername(), container.getPassword());
    }

    private void reset(Connection connection, Dialect dialect) throws SQLException {
        if (dialect == Dialect.POSTGRESQL) {
            execute(connection, "DROP SCHEMA public CASCADE");
            execute(connection, "CREATE SCHEMA public");
            return;
        }

        execute(connection, "SET FOREIGN_KEY_CHECKS = 0");
        List<String> tables = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(
            "SELECT table_name FROM information_schema.tables WHERE table_schema = DATABASE()"
        ); ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                tables.add(result.getString(1));
            }
        }
        for (String table : tables) {
            execute(connection, "DROP TABLE `" + table.replace("`", "``") + "`");
        }
        execute(connection, "SET FOREIGN_KEY_CHECKS = 1");
    }

    private void createPrerequisites(Connection connection, Dialect dialect) throws SQLException {
        if (dialect == Dialect.MYSQL) {
            execute(connection, """
                CREATE TABLE AUD_LOG (
                    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    resource_code VARCHAR(128) NULL
                )
                """);
            execute(connection, "CREATE TABLE MDA_ASSET (id BIGINT NOT NULL PRIMARY KEY)");
            execute(connection, """
                CREATE TABLE USR_GROUP_PERMISSION (
                    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    group_code VARCHAR(32) NOT NULL,
                    permission_code VARCHAR(128) NOT NULL,
                    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
                    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
                    CONSTRAINT AK_USR_GROUP_PERMISSION_1 UNIQUE (group_code, permission_code)
                )
                """);
            return;
        }

        execute(connection, """
            CREATE TABLE AUD_LOG (
                id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                resource_code VARCHAR(128) NULL
            )
            """);
        execute(connection, "CREATE TABLE MDA_ASSET (id BIGINT PRIMARY KEY)");
        execute(connection, """
            CREATE TABLE USR_GROUP_PERMISSION (
                id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                group_code VARCHAR(32) NOT NULL,
                permission_code VARCHAR(128) NOT NULL,
                update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                deleted_flag SMALLINT NOT NULL DEFAULT 0,
                CONSTRAINT AK_USR_GROUP_PERMISSION_1 UNIQUE (group_code, permission_code)
            )
            """);
    }

    private void seedExistingRows(Connection connection) throws SQLException {
        execute(connection, "INSERT INTO AUD_LOG (id, resource_code) VALUES (7001, 'existing-audit')");
        execute(connection, "INSERT INTO MDA_ASSET (id) VALUES (7001)");
        execute(connection, """
            INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
            VALUES ('ADMIN', 'migration.fixture.keep')
            """);
    }

    private void executeMigration(Connection connection, String resource) {
        ScriptUtils.executeSqlScript(connection, new ClassPathResource(resource));
    }

    private void assertNoPersonalContent(Connection connection) throws SQLException {
        assertThat(count(connection, "CTN_PHOTO")).isZero();
        assertThat(count(connection, "CTN_ALBUM")).isZero();
        assertThat(count(connection, "CTN_MOMENT")).isZero();
    }

    private void assertExistingRowsRemain(Connection connection) throws SQLException {
        assertThat(queryLong(connection,
            "SELECT COUNT(*) FROM AUD_LOG WHERE id = 7001 AND resource_code = 'existing-audit'"
        )).isOne();
        assertThat(queryLong(connection,
            "SELECT COUNT(*) FROM MDA_ASSET WHERE id = 7001"
        )).isOne();
        assertThat(queryLong(connection, """
            SELECT COUNT(*) FROM USR_GROUP_PERMISSION
            WHERE group_code = 'ADMIN' AND permission_code = 'migration.fixture.keep'
            """)).isOne();
    }

    private void assertPermissionSeedIsStable(Connection connection) throws SQLException {
        assertThat(queryLong(connection, """
            SELECT COUNT(*) FROM USR_GROUP_PERMISSION
            WHERE group_code = 'ADMIN'
              AND permission_code IN (
                  'life.content.manage',
                  'site.widgets.manage',
                  'media.derivative.manage'
              )
            """)).isEqualTo(3L);
    }

    private void verifyUniqueConstraints(Connection connection) throws SQLException {
        execute(connection, "INSERT INTO MDA_ASSET (id) VALUES (81001), (81002), (81003), (81004)");
        execute(connection, """
            INSERT INTO CTN_DAILY_QUOTE_SNAPSHOT
                (id, quote_date, quote_text, provider_code, fetched_at)
            VALUES (82001, '2026-08-27', 'first', 'LOCAL', CURRENT_TIMESTAMP)
            """);
        assertThatThrownBy(() -> execute(connection, """
            INSERT INTO CTN_DAILY_QUOTE_SNAPSHOT
                (id, quote_date, quote_text, provider_code, fetched_at)
            VALUES (82002, '2026-08-27', 'duplicate', 'LOCAL', CURRENT_TIMESTAMP)
            """))
            .isInstanceOf(SQLException.class);

        execute(connection, """
            INSERT INTO MDA_ASSET_VARIANT
                (id, source_asset_id, variant_code, delivery_scope, processor_version)
            VALUES (83001, 81001, 'DISPLAY_WEBP', 'PUBLIC', 'processor-v1')
            """);
        assertThatThrownBy(() -> execute(connection, """
            INSERT INTO MDA_ASSET_VARIANT
                (id, source_asset_id, variant_code, delivery_scope, processor_version)
            VALUES (83002, 81001, 'DISPLAY_WEBP', 'PUBLIC', 'processor-v1')
            """))
            .isInstanceOf(SQLException.class);

        execute(connection, """
            INSERT INTO CTN_PHOTO (id, original_asset_id, title_text, alt_text)
            VALUES
                (84001, 81001, 'photo-one', 'photo one'),
                (84002, 81002, 'photo-two', 'photo two')
            """);
        execute(connection, """
            INSERT INTO CTN_ALBUM (id, public_slug, title_text)
            VALUES
                (85001, 'album-one', 'Album one'),
                (85002, 'album-two', 'Album two')
            """);
        execute(connection, """
            INSERT INTO CTN_ALBUM_PHOTO (id, album_id, photo_id, media_ref_id)
            VALUES (86001, 85001, 84001, 'shared-album-media-ref')
            """);
        assertThatThrownBy(() -> execute(connection, """
            INSERT INTO CTN_ALBUM_PHOTO (id, album_id, photo_id, media_ref_id)
            VALUES (86002, 85002, 84002, 'shared-album-media-ref')
            """))
            .isInstanceOf(SQLException.class);

        execute(connection, """
            INSERT INTO CTN_MOMENT (id, public_id, body_text)
            VALUES
                (87001, 'moment-one', 'Moment one'),
                (87002, 'moment-two', 'Moment two')
            """);
        execute(connection, """
            INSERT INTO CTN_MOMENT_PHOTO (id, moment_id, photo_id, media_ref_id)
            VALUES (88001, 87001, 84001, 'shared-moment-media-ref')
            """);
        assertThatThrownBy(() -> execute(connection, """
            INSERT INTO CTN_MOMENT_PHOTO (id, moment_id, photo_id, media_ref_id)
            VALUES (88002, 87002, 84002, 'shared-moment-media-ref')
            """))
            .isInstanceOf(SQLException.class);
    }

    private SchemaSnapshot readSchema(Connection connection, Dialect dialect) throws SQLException {
        Map<String, Map<String, ColumnSpec>> tables = new TreeMap<>();
        Map<String, Set<List<String>>> uniqueScopes = new TreeMap<>();
        String schema = dialect == Dialect.MYSQL ? connection.getCatalog() : "public";

        for (String table : FOUNDATION_TABLES) {
            Map<String, ColumnSpec> columns = new TreeMap<>();
            try (PreparedStatement statement = connection.prepareStatement("""
                SELECT column_name, data_type, is_nullable
                FROM information_schema.columns
                WHERE LOWER(table_schema) = LOWER(?) AND LOWER(table_name) = LOWER(?)
                ORDER BY ordinal_position
                """)) {
                statement.setString(1, schema);
                statement.setString(2, table);
                try (ResultSet result = statement.executeQuery()) {
                    while (result.next()) {
                        columns.put(
                            result.getString("column_name").toUpperCase(Locale.ROOT),
                            new ColumnSpec(
                                normalizeType(result.getString("data_type")),
                                "YES".equalsIgnoreCase(result.getString("is_nullable"))
                            )
                        );
                    }
                }
            }
            assertThat(columns).as("columns for %s", table).isNotEmpty();
            tables.put(table, columns);
            uniqueScopes.put(table, readUniqueScopes(connection, schema, table));
        }
        return new SchemaSnapshot(tables, uniqueScopes);
    }

    private Set<List<String>> readUniqueScopes(Connection connection, String schema, String table)
        throws SQLException {
        Map<String, List<OrderedColumn>> constraints = new LinkedHashMap<>();
        try (PreparedStatement statement = connection.prepareStatement("""
            SELECT tc.constraint_name, kcu.column_name, kcu.ordinal_position
            FROM information_schema.table_constraints tc
            JOIN information_schema.key_column_usage kcu
              ON tc.constraint_schema = kcu.constraint_schema
             AND tc.constraint_name = kcu.constraint_name
             AND tc.table_name = kcu.table_name
            WHERE LOWER(tc.table_schema) = LOWER(?)
              AND LOWER(tc.table_name) = LOWER(?)
              AND tc.constraint_type IN ('PRIMARY KEY', 'UNIQUE')
            ORDER BY tc.constraint_name, kcu.ordinal_position
            """)) {
            statement.setString(1, schema);
            statement.setString(2, table);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    constraints.computeIfAbsent(result.getString(1), ignored -> new ArrayList<>())
                        .add(new OrderedColumn(result.getInt(3), result.getString(2).toUpperCase(Locale.ROOT)));
                }
            }
        }

        Set<List<String>> scopes = new LinkedHashSet<>();
        for (List<OrderedColumn> columns : constraints.values()) {
            scopes.add(columns.stream().sorted().map(OrderedColumn::name).toList());
        }
        return scopes;
    }

    private String normalizeType(String databaseType) {
        return switch (databaseType.toLowerCase(Locale.ROOT)) {
            case "tinyint", "smallint" -> "SMALLINT";
            case "int", "integer" -> "INTEGER";
            case "decimal", "numeric" -> "DECIMAL";
            case "datetime", "timestamp", "timestamp without time zone" -> "TIMESTAMP";
            case "json", "jsonb" -> "JSON";
            default -> databaseType.toUpperCase(Locale.ROOT);
        };
    }

    private Map<String, Long> readFoundationCounts(Connection connection) throws SQLException {
        Map<String, Long> counts = new LinkedHashMap<>();
        for (String table : FOUNDATION_TABLES) {
            counts.put(table, count(connection, table));
        }
        return counts;
    }

    private long count(Connection connection, String table) throws SQLException {
        assertThat(new TreeSet<>(FOUNDATION_TABLES)).contains(table);
        return queryLong(connection, "SELECT COUNT(*) FROM " + table);
    }

    private long queryLong(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement(); ResultSet result = statement.executeQuery(sql)) {
            assertThat(result.next()).isTrue();
            return result.getLong(1);
        }
    }

    private void execute(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
        }
    }

    private enum Dialect {
        MYSQL,
        POSTGRESQL
    }

    private record DatabaseUnderTest(Connection connection, Dialect dialect, String migration) {
    }

    private record ColumnSpec(String type, boolean nullable) {
    }

    private record SchemaSnapshot(
        Map<String, Map<String, ColumnSpec>> tables,
        Map<String, Set<List<String>>> uniqueScopes
    ) {
    }

    private record OrderedColumn(int ordinal, String name) implements Comparable<OrderedColumn> {
        @Override
        public int compareTo(OrderedColumn other) {
            return Integer.compare(ordinal, other.ordinal);
        }
    }
}
