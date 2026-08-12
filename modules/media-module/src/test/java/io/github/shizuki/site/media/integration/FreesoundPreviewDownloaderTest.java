package io.github.shizuki.site.media.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.config.FreesoundProperties;
import java.io.ByteArrayInputStream;
import java.util.Set;
import org.junit.jupiter.api.Test;

class FreesoundPreviewDownloaderTest {

    @Test
    void shouldAcceptOnlyFreesoundHttpsPreviewHosts() {
        assertThat(FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "https://cdn.freesound.org/previews/123/track.mp3").getHost()).isEqualTo("cdn.freesound.org");

        assertThatThrownBy(() -> FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "http://cdn.freesound.org/previews/track.mp3")).isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "https://cdn.freesound.org.attacker.example/track.mp3")).isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "https://127.0.0.1/private.mp3")).isInstanceOf(BusinessException.class);
    }

    @Test
    void shouldUseConfiguredPreviewHostAllowlist() {
        FreesoundProperties properties = new FreesoundProperties();
        properties.setPreviewHosts(Set.of("audio.example.test"));

        assertThat(FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "https://audio.example.test/previews/track.mp3", properties.getPreviewHosts()).getHost())
            .isEqualTo("audio.example.test");
        assertThatThrownBy(() -> FreesoundPreviewDownloader.requireAllowedPreviewUri(
            "https://cdn.freesound.org/previews/track.mp3", properties.getPreviewHosts()))
            .isInstanceOf(BusinessException.class);
    }

    @Test
    void shouldStopReadingWhenPayloadExceedsLimit() {
        byte[] payload = new byte[12];
        assertThatThrownBy(() -> FreesoundPreviewDownloader.readBounded(
            new ByteArrayInputStream(payload), -1L, 10L))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("size limit");
    }

    @Test
    void shouldRecognizeMp3Signature() {
        assertThat(FreesoundPreviewDownloader.looksLikeMp3(new byte[] {'I', 'D', '3', 4})).isTrue();
        assertThat(FreesoundPreviewDownloader.looksLikeMp3(new byte[] {(byte) 0xff, (byte) 0xfb, 0})).isTrue();
        assertThat(FreesoundPreviewDownloader.looksLikeMp3(new byte[] {'<', 'h', 't', 'm', 'l'})).isFalse();
    }
}
