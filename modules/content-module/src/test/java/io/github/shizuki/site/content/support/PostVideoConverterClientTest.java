package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class PostVideoConverterClientTest {

    private HttpServer server;

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
            server = null;
        }
    }

    @Test
    void shouldMapSummaryPayload() throws Exception {
        startServer((exchange) -> writeJson(exchange, 200, """
            {
              "success": true,
              "data": {
                "source": {
                  "sourceUrl": "https://www.youtube.com/watch?v=abc",
                  "platform": "youtube",
                  "title": "Demo",
                  "author": "Author",
                  "durationSeconds": 90,
                  "thumbnailUrl": "https://example.com/thumb.jpg",
                  "chapters": [{"title":"Intro","start":0,"end":30}],
                  "availableSubtitles": ["en"],
                  "availableAutoCaptions": ["zh-Hans"],
                  "needsCookies": false,
                  "metadata": {"id":"abc"}
                },
                "markdown": "# Demo\\n",
                "summary": ["point"],
                "timeline": [{"start":0,"end":30,"title":"Intro","summary":"point"}],
                "keyframes": [{"id":"keyframe-0001","timestamp":0,"description":""}],
                "ocr": [{"frameId":"keyframe-0001","timestamp":0,"texts":["Slide"]}],
                "transcript": {
                  "source": {
                    "sourceUrl": "https://www.youtube.com/watch?v=abc",
                    "platform": "youtube",
                    "title": "Demo",
                    "author": "Author",
                    "durationSeconds": 90,
                    "thumbnailUrl": "",
                    "chapters": [],
                    "availableSubtitles": [],
                    "availableAutoCaptions": [],
                    "needsCookies": false,
                    "metadata": {}
                  },
                  "transcriptSource": "platform_subtitle",
                  "segments": [{"start":0,"end":3,"text":"hello"}],
                  "formats": {"txt":"hello","md":"- [00:00:00] hello","srt":"","vtt":"","json":[{"start":0,"end":3,"text":"hello"}]},
                  "toolStatus": []
                },
                "toolStatus": [{"name":"yt-dlp","available":true,"detail":"ok"}]
              }
            }
            """));
        PostVideoConverterClient client = client();

        PostVideoSummaryResponse response = client.summarize(request());

        assertEquals("Demo", response.source().title());
        assertEquals("# Demo\n", response.markdown());
        assertEquals("Intro", response.timeline().get(0).title());
        assertEquals("Slide", response.ocr().get(0).texts().get(0));
        assertEquals("platform_subtitle", response.transcript().transcriptSource());
        assertEquals("yt-dlp", response.toolStatus().get(0).name());
    }

    @Test
    void shouldMapRemoteNeedsCookiesError() throws Exception {
        startServer((exchange) -> writeJson(exchange, 403, """
            {
              "success": false,
              "message": "login required",
              "needsCookies": true
            }
            """));
        PostVideoConverterClient client = client();

        BusinessException exception = assertThrows(BusinessException.class, () -> client.inspect(request()));

        assertEquals(ErrorCode.FORBIDDEN, exception.getErrorCode());
        assertEquals("login required", exception.getMessage());
        assertEquals(true, exception.getDetails().get("needs_cookies"));
    }

    @Test
    void shouldRejectMissingConfiguration() {
        PostVideoProperties properties = new PostVideoProperties();
        PostVideoConverterClient client = new PostVideoConverterClient(RestClient.builder(), properties, new ObjectMapper());

        BusinessException exception = assertThrows(BusinessException.class, () -> client.inspect(request()));

        assertEquals(ErrorCode.INTERNAL_ERROR, exception.getErrorCode());
        assertEquals("Video converter is not configured", exception.getMessage());
    }

    private PostVideoConverterClient client() {
        PostVideoProperties properties = new PostVideoProperties();
        properties.setConverterBaseUrl("http://127.0.0.1:" + server.getAddress().getPort());
        return new PostVideoConverterClient(RestClient.builder(), properties, new ObjectMapper());
    }

    private PostVideoProcessRequest request() {
        PostVideoProcessRequest request = new PostVideoProcessRequest();
        request.setSourceUrl("https://www.youtube.com/watch?v=abc");
        return request;
    }

    private void startServer(ExchangeHandler handler) throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/", exchange -> {
            try {
                handler.handle(exchange);
            } finally {
                exchange.close();
            }
        });
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    private void writeJson(com.sun.net.httpserver.HttpExchange exchange, int statusCode, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
        exchange.sendResponseHeaders(statusCode, bytes.length);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(bytes);
        }
    }

    @FunctionalInterface
    private interface ExchangeHandler {
        void handle(com.sun.net.httpserver.HttpExchange exchange) throws IOException;
    }
}
