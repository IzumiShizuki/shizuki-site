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
}
