package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class PersonalSiteStorageBoundaryContractTest {

    @Test
    void defaultMediaBucketsBelongToThePersonalSiteNamespace() throws IOException {
        String applicationYaml;
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream("application.yml")) {
            assertThat(stream).isNotNull();
            applicationYaml = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        }

        assertThat(applicationYaml)
            .contains("${OSS_PRIVATE_BUCKET:shizuki-private}")
            .contains("${OSS_PUBLIC_BUCKET:shizuki-public}")
            .doesNotContain("${OSS_PRIVATE_BUCKET:zhuowang-files}");
    }

    @Test
    void postgresDefaultsSelectTheApplicationSchema() throws IOException {
        String applicationYaml;
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream("application.yml")) {
            assertThat(stream).isNotNull();
            applicationYaml = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        }

        assertThat(applicationYaml)
            .contains("shizuki_app?currentSchema=shizuki_app,public")
            .contains("table: ${FLYWAY_TABLE:flyway_schema_history_pg}");
    }

    @Test
    void smtpDefaultsKeepAuthenticationAndTlsNegotiationExplicit() throws IOException {
        String applicationYaml;
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream("application.yml")) {
            assertThat(stream).isNotNull();
            applicationYaml = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        }

        assertThat(applicationYaml)
            .contains("MAIL_SMTP_AUTH_MECHANISMS:LOGIN")
            .contains("MAIL_SMTP_AUTH_LOGIN_DISABLE:false")
            .contains("MAIL_SMTP_AUTH_PLAIN_DISABLE:true")
            .contains("MAIL_SMTP_STARTTLS_REQUIRED:false")
            .contains("MAIL_SMTP_CONNECTION_TIMEOUT:10000")
            .contains("MAIL_SMTP_TIMEOUT:10000")
            .contains("MAIL_SMTP_WRITE_TIMEOUT:10000");
    }
}
