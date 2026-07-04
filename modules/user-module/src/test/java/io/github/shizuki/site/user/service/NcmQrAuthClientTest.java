package io.github.shizuki.site.user.service;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.site.user.config.MusicNcmProperties;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class NcmQrAuthClientTest {

    @Test
    void shouldAppendTimestampAndEncodeQrKeyWhenCreatingQrSession() throws IOException {
        MusicNcmProperties properties = new MusicNcmProperties();
        AtomicReference<String> keyPath = new AtomicReference<>("");
        AtomicReference<String> createPath = new AtomicReference<>("");
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/login/qr/key", exchange -> {
            keyPath.set(readRawRequestTarget(exchange));
            writeJson(exchange, """
                {
                  "code": 200,
                  "data": {
                    "unikey": "qr+key/1="
                  }
                }
                """);
        });
        server.createContext("/login/qr/create", exchange -> {
            createPath.set(readRawRequestTarget(exchange));
            writeJson(exchange, """
                {
                  "code": 200,
                  "data": {
                    "qrimg": "data:image/png;base64,abc",
                    "qrurl": "https://music.163.com/login?codekey=demo"
                  }
                }
                """);
        });
        server.start();
        properties.setBaseUrl("http://127.0.0.1:" + server.getAddress().getPort());

        try {
            NcmQrAuthClient client = new NcmQrAuthClient(RestClient.builder(), properties);
            NcmQrAuthClient.QrCreateResult result = client.createQrSession();

            Assertions.assertEquals("qr+key/1=", result.qrKey());
            Assertions.assertEquals("https://music.163.com/login?codekey=demo", result.qrUrl());
            Assertions.assertEquals("data:image/png;base64,abc", result.qrImage());
            Assertions.assertTrue(
                keyPath.get().startsWith("/login/qr/key?timestamp="),
                "unexpected key path: " + keyPath.get()
            );
            Assertions.assertTrue(
                createPath.get().startsWith("/login/qr/create?qrimg=true&key=qr%2Bkey%2F1%3D&timestamp="),
                "unexpected create path: " + createPath.get()
            );
        } finally {
            server.stop(0);
        }
    }

    private static void writeJson(HttpExchange exchange, String body) throws IOException {
        byte[] payload = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json;charset=UTF-8");
        exchange.sendResponseHeaders(200, payload.length);
        try (var outputStream = exchange.getResponseBody()) {
            outputStream.write(payload);
        } finally {
            exchange.close();
        }
    }

    private static String readRawRequestTarget(HttpExchange exchange) {
        String rawPath = exchange.getRequestURI().getRawPath();
        String rawQuery = exchange.getRequestURI().getRawQuery();
        return rawQuery == null || rawQuery.isBlank() ? rawPath : rawPath + "?" + rawQuery;
    }
}
