package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Flow;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class PixivClientTest {
    private final ObjectMapper mapper = new ObjectMapper();

    @Test void rejectsRestrictedMaskedAndSensitiveWorks() throws Exception {
        assertThat(PixivClient.safe(mapper.readTree("{\"id\":\"1\",\"xRestrict\":0,\"sl\":2}"))).isTrue();
        for (String flag : List.of("\"xRestrict\":1", "\"xRestrict\":2", "\"xRestrict\":0,\"isMasked\":true", "\"xRestrict\":0,\"sl\":6", "\"xRestrict\":0,\"restrict\":1",
                "\"xRestrict\":false", "\"xRestrict\":\"0\"", "\"xRestrict\":0.5", "\"xRestrict\":4294967296",
                "\"xRestrict\":0,\"restrict\":\"unknown\"", "\"xRestrict\":0,\"sl\":null", "\"xRestrict\":0,\"sl\":-1")) {
            assertThat(PixivClient.safe(mapper.readTree("{\"id\":\"1\"," + flag + "}"))).isFalse();
        }
        assertThat(PixivClient.safe(mapper.readTree("{\"id\":\"1\"}"))).isFalse();
    }

    @Test void rejectsAdultTagsInListingAndDetailEvenWithAnAllAgesFlag() throws Exception {
        for (String tags : List.of("[\"R-18\"]", "[\"r18g\"]", "[\"Ｒ－１８\"]", "{\"tags\":[{\"tag\":\"R-18G\"}]}")) {
            assertThat(PixivClient.safe(mapper.readTree("{\"id\":\"1\",\"xRestrict\":0,\"tags\":" + tags + "}"))).isFalse();
        }
        assertThat(PixivClient.safe(mapper.readTree("{\"id\":\"1\",\"xRestrict\":0,\"tags\":[\"五河琴里\"]}"))).isTrue();
    }

    @Test @SuppressWarnings("unchecked") void latestAndSearchExcludeAdultAndUnclassifiedListings() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> latest = mock(HttpResponse.class);
        HttpResponse<byte[]> search = mock(HttpResponse.class);
        String works = "[{\"id\":\"1\",\"xRestrict\":0},{\"id\":\"2\",\"xRestrict\":1},"
                + "{\"id\":\"3\",\"xRestrict\":2},{\"id\":\"4\"},{\"id\":\"5\",\"xRestrict\":0,\"tags\":[\"R-18\"]}]";
        when(latest.statusCode()).thenReturn(200);
        when(latest.body()).thenReturn(("{\"error\":false,\"body\":{\"illusts\":" + works + "}}").getBytes(StandardCharsets.UTF_8));
        when(search.statusCode()).thenReturn(200);
        when(search.body()).thenReturn(("{\"error\":false,\"body\":{\"illustManga\":{\"data\":" + works + "}}}").getBytes(StandardCharsets.UTF_8));
        doReturn(latest, search).when(transport).send(any(), any());
        PixivClient client = new PixivClient(mapper, transport);
        assertThat(client.latest("42")).extracting(work -> work.path("id").asText()).containsExactly("1");
        assertThat(client.search("五河琴里")).extracting(work -> work.path("id").asText()).containsExactly("1");
        ArgumentCaptor<HttpRequest> request = ArgumentCaptor.forClass(HttpRequest.class);
        verify(transport, times(2)).send(request.capture(), any());
        assertThat(request.getValue().uri().getQuery()).contains("mode=safe");
    }

    @Test @SuppressWarnings("unchecked") void previewsRejectAdultOrUnclassifiedMetadataBeforeImageDownload() throws Exception {
        for (String fields : List.of("\"xRestrict\":1", "\"xRestrict\":2", "\"xRestrict\":null", "\"xRestrict\":\"0\"",
                "\"xRestrict\":0,\"tags\":{\"tags\":[{\"tag\":\"R-18G\"}]}")) {
            HttpClient transport = mock(HttpClient.class);
            HttpResponse<byte[]> response = mock(HttpResponse.class);
            when(response.statusCode()).thenReturn(200);
            when(response.body()).thenReturn(("{\"error\":false,\"body\":{\"illustId\":\"123\"," + fields
                    + ",\"urls\":{\"regular\":\"https://i.pximg.net/example.jpg\"}}}").getBytes(StandardCharsets.UTF_8));
            doReturn(response).when(transport).send(any(), any());
            assertThatThrownBy(() -> new PixivClient(mapper, transport).preview("123")).hasMessageContaining("不属于全年龄");
            verify(transport, times(1)).send(any(), any());
        }
    }

    @Test void cancelsStreamingBodiesAsSoonAsTheyExceedTheLimit() {
        PixivClient.LimitedBody body = new PixivClient.LimitedBody(3);
        Flow.Subscription subscription = mock(Flow.Subscription.class);
        body.onSubscribe(subscription);
        body.onNext(List.of(ByteBuffer.wrap(new byte[] {1, 2, 3, 4})));
        verify(subscription).cancel();
        assertThat(body.getBody().toCompletableFuture()).isCompletedExceptionally();
    }

    @Test @SuppressWarnings("unchecked") void sendsSessionOnlyToPixivAndDoesNotCacheAuthenticatedFollows() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> response = mock(HttpResponse.class);
        when(response.statusCode()).thenReturn(200);
        when(response.body()).thenReturn("{\"error\":false,\"body\":{\"users\":[],\"total\":0}}".getBytes(StandardCharsets.UTF_8));
        doReturn(response).when(transport).send(any(), any());
        PixivClient client = new PixivClient(mapper, transport);
        client.following("42", "42_abcdefghijklmnop", 0, 48, false);
        client.following("42", "42_abcdefghijklmnop", 0, 48, false);
        ArgumentCaptor<HttpRequest> request = ArgumentCaptor.forClass(HttpRequest.class);
        verify(transport, times(2)).send(request.capture(), any());
        assertThat(request.getValue().uri().getHost()).isEqualTo("www.pixiv.net");
        assertThat(request.getValue().headers().firstValue("Cookie")).contains("PHPSESSID=42_abcdefghijklmnop");
        assertThat(request.getValue().timeout()).isPresent();
    }

    @Test @SuppressWarnings("unchecked") void refusesArbitraryPreviewHostsBeforeDownloading() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> response = mock(HttpResponse.class);
        when(response.statusCode()).thenReturn(200);
        when(response.body()).thenReturn("{\"error\":false,\"body\":{\"illustId\":\"123\",\"xRestrict\":0,\"urls\":{\"regular\":\"https://127.0.0.1/internal\"}}}".getBytes(StandardCharsets.UTF_8));
        doReturn(response).when(transport).send(any(), any());
        assertThatThrownBy(() -> new PixivClient(mapper, transport).preview("123")).hasMessageContaining("不受信任");
        verify(transport, times(1)).send(any(), any());
    }
}
