package io.github.shizuki.common.audit.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.common.audit.model.AuditLogEntry;
import io.github.shizuki.common.audit.util.SensitiveMasker;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminMutationAuditRecorderTest {

    private static final Instant NOW = Instant.parse("2026-08-27T08:15:30Z");

    private CapturingAuditLogService auditLogService;
    private AdminMutationAuditRecorder recorder;

    @BeforeEach
    void setUp() {
        auditLogService = new CapturingAuditLogService();
        recorder = new AdminMutationAuditRecorder(auditLogService, Clock.fixed(NOW, ZoneOffset.UTC));
        LoginUserContext.set(new LoginUser(42L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void recordsSuccessfulMutationAndRedactsCredentialsSignedUrlsAndCoordinates() {
        recorder.recordSuccess("album.publish", "album:17", Map.of(
            "apiKey", "provider-key-value",
            "purgeCapability", "opaque-delete-token",
            "previewUrl", "https://media.example/photo.jpg?X-Amz-Signature=signed-value",
            "visitor", Map.of("latitude", 31.230416, "longitude", 121.473701),
            "changedFields", List.of("title", "visibility")
        ));

        AuditLogEntry entry = auditLogService.onlyEntry();
        assertThat(entry.getUserId()).isEqualTo(42L);
        assertThat(entry.getAction()).isEqualTo("album.publish");
        assertThat(entry.getTarget()).isEqualTo("album:17");
        assertThat(entry.getResult()).isEqualTo("SUCCESS");
        assertThat(entry.getCreatedAt()).isEqualTo(NOW);
        assertThat(entry.getDetails().toString())
            .contains(SensitiveMasker.REDACTED, "changedFields")
            .doesNotContain(
                "provider-key-value",
                "opaque-delete-token",
                "signed-value",
                "31.230416",
                "121.473701"
            );
    }

    @Test
    void recordsFailedMutationAndRedactsSensitiveValuesOnFailurePath() {
        recorder.recordFailure("weather.refresh", "site-location:3", "PROVIDER_TIMEOUT", Map.of(
            "authorization", "Bearer credential-value",
            "download", "https://media.example/raw.jpg?x-oss-signature=signed-failure-value",
            "visitorExactLocation", "31.230416,121.473701"
        ));

        AuditLogEntry entry = auditLogService.onlyEntry();
        assertThat(entry.getUserId()).isEqualTo(42L);
        assertThat(entry.getAction()).isEqualTo("weather.refresh");
        assertThat(entry.getTarget()).isEqualTo("site-location:3");
        assertThat(entry.getResult()).isEqualTo("FAILED");
        assertThat(entry.getErrorCode()).isEqualTo("PROVIDER_TIMEOUT");
        assertThat(entry.getCreatedAt()).isEqualTo(NOW);
        assertThat(entry.getDetails().toString())
            .contains(SensitiveMasker.REDACTED)
            .doesNotContain("credential-value", "signed-failure-value", "31.230416", "121.473701");
    }

    private static final class CapturingAuditLogService implements AuditLogService {

        private AuditLogEntry entry;

        @Override
        public void save(AuditLogEntry entry) {
            this.entry = entry;
        }

        private AuditLogEntry onlyEntry() {
            assertThat(entry).isNotNull();
            return entry;
        }
    }
}
