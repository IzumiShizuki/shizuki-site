package io.github.shizuki.site.media.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.response.FreesoundTrackResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.header;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

class FreesoundProviderTest {

    private FreesoundProperties properties;
    private MockRestServiceServer server;
    private FreesoundProvider provider;

    @BeforeEach
    void setUp() {
        properties = new FreesoundProperties();
        properties.setApiKey("server-only-token");
        properties.setRetryCount(0);
        properties.setSoundsUrl("https://freesound.org/apiv2/sounds/");
        RestClient.Builder builder = RestClient.builder();
        server = MockRestServiceServer.bindTo(builder).build();
        provider = new FreesoundProvider(properties, builder.build(), new SpringRetryExecutor());
    }

    @Test
    void shouldPreferLightweightMp3WhenResolvingSoundForImport() {
        server.expect(requestTo(org.hamcrest.Matchers.startsWith(
                "https://freesound.org/apiv2/sounds/123456/?fields=")))
            .andExpect(method(HttpMethod.GET))
            .andExpect(header("Authorization", "Token server-only-token"))
            .andRespond(withSuccess("""
                {
                  "id": 123456,
                  "name": "Forest Rain",
                  "username": "field-recorder",
                  "license": "https://creativecommons.org/publicdomain/zero/1.0/",
                  "duration": 82.5,
                  "url": "https://freesound.org/people/field-recorder/sounds/123456/",
                  "previews": {
                    "preview-hq-mp3": "https://cdn.freesound.org/previews/123/123456_1-hq.mp3",
                    "preview-lq-mp3": "https://cdn.freesound.org/previews/123/123456_1-lq.mp3"
                  }
                }
                """, MediaType.APPLICATION_JSON));

        FreesoundTrackResponse result = provider.resolveAmbient("123456");

        assertThat(result.soundId()).isEqualTo("123456");
        assertThat(result.title()).isEqualTo("Forest Rain");
        assertThat(result.previewUrl()).endsWith("123456_1-lq.mp3");
        assertThat(result.license()).isEqualTo("cc0");
        assertThat(result.attributionRequired()).isFalse();
        server.verify();
    }

    @Test
    void shouldReturnEligibleSearchResultsFromProductionShapedPayload() {
        properties.setSearchUrl("https://freesound.org/apiv2/search/");
        server.expect(requestTo(org.hamcrest.Matchers.startsWith(
                "https://freesound.org/apiv2/search/?query=rain")))
            .andExpect(requestTo(org.hamcrest.Matchers.containsString(
                "fields=id%2Cname%2Cusername%2Clicense%2Cduration%2Curl%2Cpreviews")))
            .andExpect(requestTo(org.hamcrest.Matchers.not(org.hamcrest.Matchers.containsString("%252C"))))
            .andExpect(method(HttpMethod.GET))
            .andExpect(header("Authorization", "Token server-only-token"))
            .andRespond(withSuccess("""
                {
                  "count": 4775,
                  "results": [{
                    "id": 645924,
                    "url": "https://freesound.org/people/BonnyOrbit/sounds/645924/",
                    "name": "Light rain in a city backyard.wav",
                    "license": "http://creativecommons.org/publicdomain/zero/1.0/",
                    "duration": 207.226,
                    "username": "BonnyOrbit",
                    "previews": {
                      "preview-hq-mp3": "https://cdn.freesound.org/previews/645/645924_5902878-hq.mp3"
                    }
                  }]
                }
                """, MediaType.APPLICATION_JSON));

        var result = provider.searchAmbient("rain", "cc0", 1, 1);

        assertThat(result.total()).isEqualTo(4775);
        assertThat(result.items()).singleElement().satisfies(track -> {
            assertThat(track.soundId()).isEqualTo("645924");
            assertThat(track.title()).isEqualTo("Light rain in a city backyard.wav");
            assertThat(track.license()).isEqualTo("cc0");
            assertThat(track.previewUrl()).endsWith("645924_5902878-hq.mp3");
        });
        server.verify();
    }

    @Test
    void shouldRejectUnsupportedLicenseBeforeDownload() {
        server.expect(requestTo(org.hamcrest.Matchers.startsWith(
                "https://freesound.org/apiv2/sounds/7/?fields=")))
            .andRespond(withSuccess("""
                {
                  "id": 7,
                  "name": "Restricted Sound",
                  "username": "author",
                  "license": "https://creativecommons.org/licenses/by-nc/4.0/",
                  "duration": 30,
                  "url": "https://freesound.org/s/7/",
                  "previews": {"preview-hq-mp3": "https://cdn.freesound.org/previews/7.mp3"}
                }
                """, MediaType.APPLICATION_JSON));

        assertThatThrownBy(() -> provider.resolveAmbient("7"))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("license");
        server.verify();
    }

    @Test
    void shouldRejectMismatchedResolvedSoundId() {
        server.expect(requestTo(org.hamcrest.Matchers.startsWith(
                "https://freesound.org/apiv2/sounds/8/?fields=")))
            .andRespond(withSuccess("""
                {
                  "id": 9,
                  "name": "Wrong Sound",
                  "username": "author",
                  "license": "https://creativecommons.org/publicdomain/zero/1.0/",
                  "duration": 30,
                  "previews": {"preview-hq-mp3": "https://cdn.freesound.org/previews/9.mp3"}
                }
                """, MediaType.APPLICATION_JSON));

        assertThatThrownBy(() -> provider.resolveAmbient("8"))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("mismatched");
        server.verify();
    }
}
