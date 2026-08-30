package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

class PersonalContentMigrationContractTest {

    private static final String MYSQL_MIGRATION =
        "monolith/db/migration/V431__personal_content_foundation.sql";
    private static final String POSTGRES_MIGRATION =
        "monolith/db/migration-pg/V1012__personal_content_foundation.sql";

    private static final List<String> REQUIRED_TABLES = List.of(
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

    private static final List<String> REQUIRED_PERMISSIONS = List.of(
        "life.content.manage",
        "site.widgets.manage",
        "media.derivative.manage"
    );

    @Test
    void mysqlAndPostgresMigrationsExposeTheSameFoundation() throws IOException {
        String mysql = readResource(MYSQL_MIGRATION).toUpperCase(Locale.ROOT);
        String postgres = readResource(POSTGRES_MIGRATION).toUpperCase(Locale.ROOT);

        assertThat(mysql).contains("TARGET_CODE", "DETAIL_JSON");
        assertThat(postgres).contains("TARGET_CODE", "DETAIL_JSON");
        for (String table : REQUIRED_TABLES) {
            assertThat(mysql).contains("CREATE TABLE IF NOT EXISTS " + table);
            assertThat(postgres).contains("CREATE TABLE IF NOT EXISTS " + table);
        }

        assertThat(mysql).contains("AK_CTN_DAILY_QUOTE_SNAPSHOT_1");
        assertThat(postgres).contains("AK_CTN_DAILY_QUOTE_SNAPSHOT_1");
        assertThat(mysql).contains("SOURCE_ASSET_ID, VARIANT_CODE, DELIVERY_SCOPE, PROCESSOR_VERSION");
        assertThat(postgres).contains("SOURCE_ASSET_ID, VARIANT_CODE, DELIVERY_SCOPE, PROCESSOR_VERSION");
        assertThat(mysql).contains("AK_CTN_ALBUM_PHOTO_2 UNIQUE (MEDIA_REF_ID)");
        assertThat(postgres).contains("AK_CTN_ALBUM_PHOTO_2 UNIQUE (MEDIA_REF_ID)");
        assertThat(mysql).contains("DELIVERY_REVOKED_FLAG TINYINT(1) NOT NULL DEFAULT 1");
        assertThat(postgres).contains("DELIVERY_REVOKED_FLAG SMALLINT NOT NULL DEFAULT 1");
        assertThat(mysql).contains("AK_CTN_MOMENT_PHOTO_2 UNIQUE (MEDIA_REF_ID)");
        assertThat(postgres).contains("AK_CTN_MOMENT_PHOTO_2 UNIQUE (MEDIA_REF_ID)");
    }

    @Test
    void migrationsGrantOnlyNamedAdminPermissionsAndSeedNoLifeContent() throws IOException {
        for (String path : List.of(MYSQL_MIGRATION, POSTGRES_MIGRATION)) {
            String sql = readResource(path);
            for (String permission : REQUIRED_PERMISSIONS) {
                assertThat(sql).contains("('ADMIN', '" + permission + "')");
            }
            assertThat(Pattern.compile("(?i)INSERT\\s+INTO\\s+(CTN_|MDA_)").matcher(sql).find()).isFalse();
        }
    }

    @Test
    void externalProvidersAreDisabledBySchemaDefaults() throws IOException {
        String mysql = readResource(MYSQL_MIGRATION).toUpperCase(Locale.ROOT);
        String postgres = readResource(POSTGRES_MIGRATION).toUpperCase(Locale.ROOT);

        for (String sql : List.of(mysql, postgres)) {
            assertThat(sql).contains("WEATHER_ENABLED_FLAG");
            assertThat(sql).contains("WEATHER_ENABLED_FLAG").contains("DEFAULT 0");
            assertThat(sql).contains("HITOKOTO_ENABLED_FLAG").contains("QUOTE_SOURCE_MODE");
        }
    }

    private String readResource(String path) throws IOException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(path)) {
            assertThat(input).as("migration resource %s", path).isNotNull();
            return new String(input.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
