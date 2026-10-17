package io.github.shizuki.site.content.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class PublicSitePropertiesTest {
    @ParameterizedTest
    @ValueSource(strings = {"javascript:alert(1)", "https://user:secret@example.com", "https://example.com?token=x", "https://example.com/#x", "https://example.com/path"})
    void rejectsNonCanonicalOrigins(String url) {
        assertThatThrownBy(() -> new PublicSiteProperties().setPublicSiteUrl(url)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void onlyAcceptsPortableQueryFreeImages() {
        var site = new PublicSiteProperties();
        site.setPublicSiteUrl("https://site.example/");
        assertThat(site.image("/images/cover.jpg")).isEqualTo("https://site.example/images/cover.jpg");
        assertThat(site.image("https://bucket.example/image?signature=secret")).isNull();
        assertThat(site.image("//other.example/image.jpg")).isNull();
        assertThat(site.image("data:image/svg+xml,<svg/>")).isNull();
    }
}
