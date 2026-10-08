package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Flow;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class PixivClientTest {
    private final ObjectMapper mapper = new ObjectMapper();

    @Test void repeatPreviewsReuseDownloadedImageAfterFreshSafetyCheck() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> detail = detail("123", "https://i.pximg.net/example.jpg", 0);
        HttpResponse<byte[]> image = response(new byte[] {1, 2, 3}, "image/jpeg");
        when(transport.send(any(), any())).thenAnswer(call ->
                ((HttpRequest) call.getArgument(0)).uri().getHost().equals("www.pixiv.net") ? detail : image);
        PixivClient client = new PixivClient(mapper, transport);

        assertThat(client.preview("123").bytes()).containsExactly(1, 2, 3);
        assertThat(client.preview("123").bytes()).containsExactly(1, 2, 3);

        ArgumentCaptor<HttpRequest> requests = ArgumentCaptor.forClass(HttpRequest.class);
        verify(transport, atLeastOnce()).send(requests.capture(), any());
        assertThat(requests.getAllValues()).filteredOn(request -> request.uri().getHost().equals("www.pixiv.net")).hasSize(2);
        assertThat(requests.getAllValues()).filteredOn(request -> request.uri().getHost().equals("i.pximg.net")).hasSize(1);
    }

    private HttpResponse<byte[]> detail(String id, String url, int restriction) {
        return response(("{\"error\":false,\"body\":{\"illustId\":\"" + id + "\",\"xRestrict\":" + restriction
                + ",\"urls\":{\"regular\":\"" + url + "\"}}}").getBytes(StandardCharsets.UTF_8), "application/json");
    }

    @SuppressWarnings("unchecked") private HttpResponse<byte[]> response(byte[] bytes, String contentType) {
        HttpResponse<byte[]> response = mock(HttpResponse.class);
        when(response.statusCode()).thenReturn(200);
        when(response.body()).thenReturn(bytes);
        when(response.headers()).thenReturn(HttpHeaders.of(Map.of("Content-Type", List.of(contentType)), (key, value) -> true));
        return response;
    }

    @Test void cachedImagesNeverBypassChangedSafetyMetadata() throws Exception {
        for (String fields : List.of("\"xRestrict\":1", "\"xRestrict\":2", "\"xRestrict\":null",
                "\"xRestrict\":0,\"isUnlisted\":true", "\"xRestrict\":0,\"tags\":[\"R-18G\"]")) {
            HttpClient transport = mock(HttpClient.class);
            AtomicReference<HttpResponse<byte[]>> current = new AtomicReference<>(detail("123", "https://i.pximg.net/example.jpg", 0));
            HttpResponse<byte[]> image = response(new byte[] {1}, "image/png");
            when(transport.send(any(), any())).thenAnswer(call ->
                    ((HttpRequest) call.getArgument(0)).uri().getHost().equals("www.pixiv.net") ? current.get() : image);
            PixivClient client = new PixivClient(mapper, transport);
            client.preview("123");
            current.set(response(("{\"error\":false,\"body\":{\"illustId\":\"123\"," + fields
                    + ",\"urls\":{\"regular\":\"https://i.pximg.net/example.jpg\"}}}").getBytes(StandardCharsets.UTF_8), "application/json"));

            assertThatThrownBy(() -> client.preview("123")).hasMessageContaining("不属于全年龄");
            verify(transport, times(3)).send(any(), any());
        }
    }

    @Test void cachedImageDoesNotHideValidationFailureOrChangedSource() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> image = response(new byte[] {1}, "image/jpeg");
        AtomicReference<HttpResponse<byte[]>> current = new AtomicReference<>(detail("123", "https://i.pximg.net/old.jpg", 0));
        when(transport.send(any(), any())).thenAnswer(call ->
                ((HttpRequest) call.getArgument(0)).uri().getHost().equals("www.pixiv.net") ? current.get() : image);
        PixivClient client = new PixivClient(mapper, transport);
        client.preview("123");
        current.set(response("{\"error\":true}".getBytes(StandardCharsets.UTF_8), "application/json"));
        assertThatThrownBy(() -> client.preview("123")).hasMessageContaining("请求失败");
        current.set(detail("123", "https://127.0.0.1/internal", 0));
        assertThatThrownBy(() -> client.preview("123")).hasMessageContaining("不受信任");
        current.set(detail("456", "https://i.pximg.net/old.jpg", 0));
        assertThatThrownBy(() -> client.preview("123")).hasMessageContaining("不属于全年龄");
        current.set(detail("123", "https://i.pximg.net/new.jpg", 0));
        client.preview("123");

        ArgumentCaptor<HttpRequest> requests = ArgumentCaptor.forClass(HttpRequest.class);
        verify(transport, times(7)).send(requests.capture(), any());
        assertThat(requests.getAllValues()).filteredOn(request -> request.uri().getHost().equals("i.pximg.net"))
                .extracting(request -> request.uri().getPath()).containsExactly("/old.jpg", "/new.jpg");
        assertThat(requests.getAllValues()).allSatisfy(request -> assertThat(request.headers().firstValue("Cookie")).isEmpty());
    }

    @Test void failedOrUnsupportedDownloadsCanBeRetried() throws Exception {
        for (boolean unsupported : List.of(true, false)) {
            HttpClient transport = mock(HttpClient.class);
            HttpResponse<byte[]> detail = detail("123", "https://i.pximg.net/example.jpg", 0);
            HttpResponse<byte[]> failed = response(new byte[] {9}, unsupported ? "text/html" : "image/jpeg");
            if (!unsupported) when(failed.statusCode()).thenReturn(503);
            HttpResponse<byte[]> image = response(new byte[] {1}, "image/jpeg");
            AtomicInteger downloads = new AtomicInteger();
            when(transport.send(any(), any())).thenAnswer(call -> {
                if (((HttpRequest) call.getArgument(0)).uri().getHost().equals("www.pixiv.net")) return detail;
                return downloads.getAndIncrement() == 0 ? failed : image;
            });
            PixivClient client = new PixivClient(mapper, transport);
            assertThatThrownBy(() -> client.preview("123")).isInstanceOf(io.github.shizuki.common.core.error.BusinessException.class);
            assertThat(client.preview("123").bytes()).containsExactly(1);
            assertThat(client.preview("123").bytes()).containsExactly(1);
            assertThat(downloads).hasValue(2);
        }
    }

    @Test void concurrentColdPreviewsShareOneImageDownload() throws Exception {
        HttpClient transport = mock(HttpClient.class);
        HttpResponse<byte[]> detail = detail("123", "https://i.pximg.net/example.jpg", 0);
        HttpResponse<byte[]> image = response(new byte[] {1, 2, 3}, "image/webp");
        CountDownLatch metadataSeen = new CountDownLatch(2);
        CountDownLatch imageStarted = new CountDownLatch(1);
        CountDownLatch releaseImage = new CountDownLatch(1);
        AtomicInteger downloads = new AtomicInteger();
        when(transport.send(any(), any())).thenAnswer(call -> {
            if (((HttpRequest) call.getArgument(0)).uri().getHost().equals("www.pixiv.net")) {
                metadataSeen.countDown();
                return detail;
            }
            downloads.incrementAndGet();
            imageStarted.countDown();
            assertThat(releaseImage.await(5, TimeUnit.SECONDS)).isTrue();
            return image;
        });
        PixivClient client = new PixivClient(mapper, transport);
        var workers = Executors.newFixedThreadPool(2);
        try {
            var first = workers.submit(() -> client.preview("123"));
            assertThat(imageStarted.await(5, TimeUnit.SECONDS)).isTrue();
            var second = workers.submit(() -> client.preview("123"));
            assertThat(metadataSeen.await(5, TimeUnit.SECONDS)).isTrue();
            releaseImage.countDown();
            assertThat(first.get(5, TimeUnit.SECONDS).bytes()).containsExactly(1, 2, 3);
            assertThat(second.get(5, TimeUnit.SECONDS).bytes()).containsExactly(1, 2, 3);
            assertThat(downloads).hasValue(1);
        } finally {
            releaseImage.countDown();
            workers.shutdownNow();
        }
    }

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
