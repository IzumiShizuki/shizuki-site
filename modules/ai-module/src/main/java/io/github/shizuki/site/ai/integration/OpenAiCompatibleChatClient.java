package io.github.shizuki.site.ai.integration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.ai.config.AiChatProperties;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Component
public class OpenAiCompatibleChatClient {

    private static final long DEFAULT_CONNECT_TIMEOUT_MS = 2_500L;
    private static final long DEFAULT_READ_TIMEOUT_MS = 90_000L;

    private final AiChatProperties properties;
    private final ObjectMapper objectMapper;
    private final RestClient restClient;

    public OpenAiCompatibleChatClient(RestClient.Builder restClientBuilder,
                                      AiChatProperties properties,
                                      ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(normalizeTimeout(properties.getConnectTimeoutMs(), DEFAULT_CONNECT_TIMEOUT_MS));
        requestFactory.setReadTimeout(normalizeTimeout(properties.getReadTimeoutMs(), DEFAULT_READ_TIMEOUT_MS));
        this.restClient = restClientBuilder
            .baseUrl(normalizeBaseUrl(properties.getBaseUrl()))
            .requestFactory(requestFactory)
            .build();
    }

    public boolean isConfigured() {
        return properties.isEnabled()
            && StringUtils.hasText(normalizeBaseUrl(properties.getBaseUrl()))
            && StringUtils.hasText(properties.getApiKey())
            && StringUtils.hasText(properties.getModel());
    }

    public String complete(List<ChatMessage> messages) {
        ensureConfigured();
        List<Map<String, String>> payloadMessages = normalizeMessages(messages);
        if (payloadMessages.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "AI chat message cannot be empty");
        }
        try {
            JsonNode root = exchangeJson(
                restClient.post()
                    .uri("/v1/chat/completions")
                    .header(HttpHeaders.AUTHORIZATION, "Bearer " + properties.getApiKey())
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(buildRequestBody(payloadMessages))
            );
            String content = extractAssistantContent(root);
            if (!StringUtils.hasText(content)) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "AI chat returned empty content");
            }
            return content;
        } catch (BusinessException exception) {
            throw exception;
        } catch (RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "AI chat request failed");
        }
    }

    private Map<String, Object> buildRequestBody(List<Map<String, String>> messages) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("model", properties.getModel());
        body.put("messages", messages);
        body.put("stream", false);
        body.put("temperature", properties.getTemperature());
        body.put("max_tokens", properties.getMaxTokens());
        return body;
    }

    private JsonNode exchangeJson(RestClient.RequestHeadersSpec<?> spec) {
        return spec.exchange((request, clientResponse) -> {
            String payload = StreamUtils.copyToString(clientResponse.getBody(), StandardCharsets.UTF_8);
            if (clientResponse.getStatusCode().isError()) {
                throw new BusinessException(
                    ErrorCode.INTERNAL_ERROR,
                    resolveRemoteErrorMessage(payload, clientResponse.getStatusCode().value())
                );
            }
            try {
                return objectMapper.readTree(payload);
            } catch (IOException exception) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "AI chat returned unreadable payload");
            }
        });
    }

    private List<Map<String, String>> normalizeMessages(List<ChatMessage> messages) {
        List<Map<String, String>> normalized = new ArrayList<>();
        if (messages == null || messages.isEmpty()) {
            return normalized;
        }
        for (ChatMessage message : messages) {
            if (message == null || !StringUtils.hasText(message.content())) {
                continue;
            }
            normalized.add(
                Map.of(
                    "role", normalizeRole(message.role()),
                    "content", message.content().trim()
                )
            );
        }
        return normalized;
    }

    private String extractAssistantContent(JsonNode root) {
        JsonNode messageNode = root.path("choices").path(0).path("message");
        JsonNode contentNode = messageNode.path("content");
        if (contentNode.isTextual()) {
            return contentNode.asText("").trim();
        }
        if (contentNode.isArray()) {
            List<String> parts = new ArrayList<>();
            for (JsonNode item : contentNode) {
                String text = item.path("text").asText("").trim();
                if (!StringUtils.hasText(text)) {
                    text = item.path("content").asText("").trim();
                }
                if (!StringUtils.hasText(text) && item.isTextual()) {
                    text = item.asText("").trim();
                }
                if (StringUtils.hasText(text)) {
                    parts.add(text);
                }
            }
            return String.join("\n", parts).trim();
        }
        return "";
    }

    private void ensureConfigured() {
        if (!isConfigured()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "AI chat is not configured");
        }
    }

    private String normalizeRole(String rawRole) {
        String normalized = rawRole == null ? "" : rawRole.trim().toLowerCase();
        return switch (normalized) {
            case "system", "assistant" -> normalized;
            default -> "user";
        };
    }

    private int normalizeTimeout(long rawTimeout, long fallback) {
        long normalized = rawTimeout > 0 ? rawTimeout : fallback;
        return normalized >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) normalized;
    }

    private String normalizeBaseUrl(String rawBaseUrl) {
        return rawBaseUrl == null ? "" : rawBaseUrl.trim().replaceAll("/+$", "");
    }

    private String resolveRemoteErrorMessage(String payload, int statusCode) {
        if (!StringUtils.hasText(payload)) {
            return statusCode >= 500 ? "AI chat request failed" : "AI chat request was rejected";
        }
        try {
            JsonNode root = objectMapper.readTree(payload);
            String message = root.path("error").path("message").asText("").trim();
            if (!StringUtils.hasText(message)) {
                message = root.path("message").asText("").trim();
            }
            if (StringUtils.hasText(message)) {
                return message;
            }
        } catch (Exception ignored) {
        }
        return payload.trim();
    }

    public record ChatMessage(String role, String content) {
    }
}
