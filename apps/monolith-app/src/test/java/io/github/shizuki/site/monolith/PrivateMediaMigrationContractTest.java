package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class PrivateMediaMigrationContractTest {
    @Test
    void bothMonolithProfilesRemoveOnlyAutomaticBuiltInVoiceGrants() throws Exception {
        for (String path : new String[] {
            "monolith/db/migration/V435__remove_default_voice_access.sql",
            "monolith/db/migration-pg/V1017__remove_default_voice_access.sql"
        }) {
            try (var stream = getClass().getClassLoader().getResourceAsStream(path)) {
                assertThat(stream).isNotNull();
                String sql = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                assertThat(sql).contains("DELETE FROM USR_GROUP_PERMISSION", "permission_code = 'music.asmr.access'",
                    "group_code IN ('FRIEND', 'USER', 'GUEST')");
                assertThat(sql).doesNotContain("'ADMIN'", "TRUNCATE", "USR_ACCOUNT");
            }
        }
    }
}
