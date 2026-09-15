package io.github.shizuki.site.media.service.playback;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.config.MusicPlaybackGatewayProperties;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.http.HttpHeaders;

class MusicPlaybackGatewayServiceTest {

    private MusicPlaybackGatewayProperties properties;
    private MusicPlaybackCapabilityCodec codec;
    private HttpClient httpClient;

    @BeforeEach
    void setUp() {
        MediaGatewayProperties mediaGatewayProperties = new MediaGatewayProperties();
        mediaGatewayProperties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        mediaGatewayProperties.afterPropertiesSet();
        properties = new MusicPlaybackGatewayProperties();
        properties.setTokenTtlSeconds(300L);
        properties.afterPropertiesSet();
        codec = new MusicPlaybackCapabilityCodec(mediaGatewayProperties, properties);
        httpClient = Mockito.mock(HttpClient.class);
    }

    @Test
    void rewritesResolvedAudioAsOpaqueSameOriginDeliveryUrl() throws Exception {
        MusicTrackResponse track = new MusicTrackResponse(
            "track-1",
            "netease",
            "Song",
            "Artist",
            "https://images.example.com/cover.jpg",
            "https://audio.example.com/song.mp3?token=private",
            "",
            0,
            true,
            "",
            Map.of("quality", "lossless")
        );

        MusicTrackResponse rewritten = serviceWithPublicDns().rewriteDeliveryUrl(track);

        assertThat(rewritten.audio()).startsWith("/api/v1/music/tracks/stream/");
        assertThat(rewritten.audio()).doesNotContain("audio.example.com", "private");
        assertThat(rewritten.metadata()).containsEntry("quality", "lossless")
            .containsEntry("audio_delivery", "site_gateway")
            .containsEntry("audio_range_supported", true);
    }

    @Test
    void forwardsSingleRangeAndReturnsPartialContentMetadata() throws Exception {
        byte[] audio = "test-audio".getBytes(StandardCharsets.UTF_8);
        HttpResponse<InputStream> upstream = upstreamResponse(
            206,
            audio,
            Map.of(
                HttpHeaders.CONTENT_TYPE, java.util.List.of("audio/mpeg"),
                HttpHeaders.CONTENT_LENGTH, java.util.List.of(String.valueOf(audio.length)),
                HttpHeaders.CONTENT_RANGE, java.util.List.of("bytes 64-73/1000"),
                HttpHeaders.ACCEPT_RANGES, java.util.List.of("bytes")
            )
        );
        when(httpClient.send(
            Mockito.any(HttpRequest.class),
            Mockito.<HttpResponse.BodyHandler<InputStream>>any()
        )).thenReturn(upstream);
        MusicPlaybackGatewayService service = serviceWithPublicDns();
        String capability = service.rewriteDeliveryUrl(track("https://audio.example.com/song.mp3"))
            .audio().substring("/api/v1/music/tracks/stream/".length());

        MusicPlaybackStream stream = service.open(capability, "BYTES=64-73");

        assertThat(stream.statusCode()).isEqualTo(206);
        assertThat(stream.contentType()).isEqualTo("audio/mpeg");
        assertThat(stream.contentLength()).isEqualTo(audio.length);
        assertThat(stream.contentRange()).isEqualTo("bytes 64-73/1000");
        assertThat(stream.acceptRanges()).isEqualTo("bytes");
        assertThat(stream.inputStream().readAllBytes()).isEqualTo(audio);
        ArgumentCaptor<HttpRequest> request = ArgumentCaptor.forClass(HttpRequest.class);
        Mockito.verify(httpClient).send(
            request.capture(),
            Mockito.<HttpResponse.BodyHandler<InputStream>>any()
        );
        assertThat(request.getValue().headers().firstValue(HttpHeaders.RANGE)).contains("bytes=64-73");
        assertThat(request.getValue().headers().firstValue(HttpHeaders.ACCEPT_ENCODING)).contains("identity");
    }

    @Test
    void rejectsPrivateDestinationsAndRedirectsBeforeConnecting() throws Exception {
        MusicPlaybackGatewayService privateDnsService = service(host -> new InetAddress[]{
            InetAddress.getByAddress(new byte[]{10, 0, 0, 8})
        });

        assertThatThrownBy(() -> privateDnsService.rewriteDeliveryUrl(
            track("https://private.example/song.mp3")
        )).isInstanceOfSatisfying(BusinessException.class,
            exception -> assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND));
        Mockito.verifyNoInteractions(httpClient);

        HttpResponse<InputStream> redirect = upstreamResponse(
            302,
            new byte[0],
            Map.of(HttpHeaders.LOCATION, java.util.List.of("http://127.0.0.1/internal"))
        );
        when(httpClient.send(
            Mockito.any(HttpRequest.class),
            Mockito.<HttpResponse.BodyHandler<InputStream>>any()
        )).thenReturn(redirect);
        MusicPlaybackGatewayService publicDnsService = serviceWithPublicDns();
        String capability = publicDnsService.rewriteDeliveryUrl(track("https://audio.example.com/song.mp3"))
            .audio().substring("/api/v1/music/tracks/stream/".length());

        assertThatThrownBy(() -> publicDnsService.open(capability, null))
            .isInstanceOfSatisfying(BusinessException.class,
                exception -> assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.NOT_FOUND));
    }

    @Test
    void rejectsMalformedOrMultipleRangesWithoutCallingUpstream() throws Exception {
        MusicPlaybackGatewayService service = serviceWithPublicDns();
        String capability = service.rewriteDeliveryUrl(track("https://audio.example.com/song.mp3"))
            .audio().substring("/api/v1/music/tracks/stream/".length());

        for (String range : java.util.List.of("bytes=-", "bytes=20-10", "bytes=0-1,4-5", "items=0-1")) {
            assertThatThrownBy(() -> service.open(capability, range))
                .as(range)
                .isInstanceOfSatisfying(BusinessException.class,
                    exception -> assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        }
        Mockito.verifyNoInteractions(httpClient);
    }

    private MusicPlaybackGatewayService serviceWithPublicDns() throws Exception {
        InetAddress publicAddress = InetAddress.getByAddress(new byte[]{93, (byte) 184, (byte) 216, 34});
        return service(host -> new InetAddress[]{publicAddress});
    }

    private MusicPlaybackGatewayService service(MusicPlaybackGatewayService.HostAddressResolver resolver) {
        return new MusicPlaybackGatewayService(codec, properties, httpClient, resolver);
    }

    private MusicTrackResponse track(String audioUrl) {
        return new MusicTrackResponse(
            "track-1",
            "netease",
            "Song",
            "Artist",
            "",
            audioUrl,
            "",
            0,
            true
        );
    }

    @SuppressWarnings("unchecked")
    private HttpResponse<InputStream> upstreamResponse(int status,
                                                       byte[] body,
                                                       Map<String, java.util.List<String>> headers) {
        HttpResponse<InputStream> response = Mockito.mock(HttpResponse.class);
        when(response.statusCode()).thenReturn(status);
        when(response.body()).thenReturn(new ByteArrayInputStream(body));
        when(response.headers()).thenReturn(java.net.http.HttpHeaders.of(headers, (name, value) -> true));
        return response;
    }
}
