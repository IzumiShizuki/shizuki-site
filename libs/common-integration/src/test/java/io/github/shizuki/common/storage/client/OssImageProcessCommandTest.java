package io.github.shizuki.common.storage.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import org.junit.jupiter.api.Test;

class OssImageProcessCommandTest {

    @Test
    void encodesTransformationsWithoutAllowingCallersToOwnTheImagePrefix() {
        assertThat(OssImageProcessCommand.transform(List.of(
            "auto-orient,1",
            "resize,m_lfit,w_1600,h_1600",
            "quality,q_86",
            "format,webp"
        ))).isEqualTo(
            "image/auto-orient,1/resize,m_lfit,w_1600,h_1600/quality,q_86/format,webp"
        );
    }

    @Test
    void urlSafeBase64EncodesUnicodeAndReservedDestinationCharactersForSaveAs() {
        String bucket = "shizuki-private-01";
        String key = "life/相册 01/展示图+最终.webp";

        String command = OssImageProcessCommand.saveAs(
            List.of("resize,m_lfit,w_1600", "format,webp"),
            bucket,
            key
        );

        assertThat(command).isEqualTo(
            "image/resize,m_lfit,w_1600/format,webp/sys/saveas,o_"
                + encode(key) + ",b_" + encode(bucket)
        );
        assertThat(command)
            .doesNotContain(key)
            .doesNotContain("+")
            .doesNotContain("=");
    }

    @Test
    void rejectsProcessInjectionEmptyOperationsAndInvalidDestinations() {
        assertThatThrownBy(() -> OssImageProcessCommand.transform(List.of()))
            .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> OssImageProcessCommand.transform(List.of("sys/saveas,o_attack")))
            .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> OssImageProcessCommand.saveAs(
            List.of("format,webp"),
            "INVALID_BUCKET",
            "safe.webp"
        )).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> OssImageProcessCommand.saveAs(
            List.of("format,webp"),
            "safe-bucket",
            " "
        )).isInstanceOf(IllegalArgumentException.class);
    }

    private static String encode(String raw) {
        return Base64.getUrlEncoder()
            .withoutPadding()
            .encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }
}
