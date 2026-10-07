package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import static org.assertj.core.api.Assertions.assertThat;

/** Opt-in contract check against public, all-ages upstream content. Never needs an account/session. */
@EnabledIfSystemProperty(named = "pixiv.live", matches = "true")
class PixivClientLiveSmokeTest {
    @Test void readsRealPublicMetadataSearchAndImageThroughProductionTransport() {
        PixivClient client = new PixivClient(new ObjectMapper(), "");
        assertThat(client.user("660788").path("name").asText()).isNotBlank();
        assertThat(client.latest("660788")).isNotEmpty();
        var works = client.search("五河琴里");
        assertThat(works).isNotEmpty();
        assertThat(works).allMatch(PixivClient::safe);
        PixivClient.Preview preview = client.preview(works.get(0).path("id").asText());
        assertThat(preview.bytes()).hasSizeGreaterThan(100);
        assertThat(preview.contentType()).isIn("image/jpeg", "image/png", "image/webp");
    }
}
