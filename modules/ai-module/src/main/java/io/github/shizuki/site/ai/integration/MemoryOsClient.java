package io.github.shizuki.site.ai.integration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.ai.config.AiMemoryProperties;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Component
public class MemoryOsClient {

    private static final long DEFAULT_CONNECT_TIMEOUT_MS = 1_200L;
    private static final long DEFAULT_READ_TIMEOUT_MS = 4_000L;

    private final AiMemoryProperties properties;
    private final ObjectMapper objectMapper;
    private final RestClient restClient;

    public MemoryOsClient(RestClient.Builder restClientBuilder,
                          AiMemoryProperties properties,
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
        return properties.isEnabled() && StringUtils.hasText(normalizeBaseUrl(properties.getBaseUrl()));
    }

    public MemorySnapshot retrieve(String scopeId, String query, Integer journalLimit) {
        ensureConfigured();
        try {
            JsonNode payload = exchangeJson(
                restClient.post()
                    .uri("/api/v1/memory/sessions/{scopeId}/retrieve", scopeId)
                    .body(
                        Map.of(
                            "query", query,
                            "max_results", properties.getRetrievalMaxResults(),
                            "journal_limit", journalLimit == null ? properties.getJournalLimit() : journalLimit
                        )
                    )
            );
            return toSnapshot(payload);
        } catch (BusinessException exception) {
            throw exception;
        } catch (RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS retrieve failed");
        }
    }

    public MemoryProfileSnapshot getProfile(String scopeId, boolean includeJournal, Integer journalLimit) {
        ensureConfigured();
        try {
            JsonNode payload = exchangeJson(
                restClient.get()
                    .uri(uriBuilder -> uriBuilder
                        .path("/api/v1/memory/sessions/{scopeId}/profile")
                        .queryParam("include_journal", includeJournal)
                        .queryParam("journal_limit", journalLimit == null ? properties.getJournalLimit() : journalLimit)
                        .build(scopeId)
                    )
            );
            return toProfileSnapshot(payload);
        } catch (BusinessException exception) {
            throw exception;
        } catch (RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS profile query failed");
        }
    }

    public void record(String scopeId,
                       String userInput,
                       String assistantResponse,
                       Map<String, Object> metaData) {
        ensureConfigured();
        try {
            exchangeJson(
                restClient.post()
                    .uri("/api/v1/memory/sessions/{scopeId}/records", scopeId)
                    .body(
                        Map.of(
                            "user_input", userInput,
                            "assistant_response", assistantResponse,
                            "timestamp", LocalDateTime.now().toString(),
                            "meta_data", metaData == null ? Map.of() : metaData
                        )
                    )
            );
        } catch (BusinessException exception) {
            throw exception;
        } catch (RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS record write failed");
        }
    }

    private JsonNode exchangeJson(RestClient.RequestHeadersSpec<?> spec) {
        JsonNode root = spec.exchange((request, clientResponse) -> {
            if (clientResponse.getStatusCode().isError()) {
                String payload = StreamUtils.copyToString(clientResponse.getBody(), StandardCharsets.UTF_8);
                throw new BusinessException(
                    ErrorCode.INTERNAL_ERROR,
                    resolveRemoteErrorMessage(payload, clientResponse.getStatusCode().value())
                );
            }
            try {
                return objectMapper.readTree(clientResponse.getBody());
            } catch (IOException exception) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS returned unreadable payload");
            }
        });
        if (root == null || !root.path("success").asBoolean(false)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS returned invalid payload");
        }
        return root.path("data");
    }

    private void ensureConfigured() {
        if (!isConfigured()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "MemoryOS is not configured");
        }
    }

    private MemorySnapshot toSnapshot(JsonNode payload) {
        List<String> summaryHighlights = new ArrayList<>();
        JsonNode summaryNode = payload.path("summary");
        appendKnowledge(summaryHighlights, summaryNode.path("retrieved_user_knowledge"));
        appendKnowledge(summaryHighlights, summaryNode.path("retrieved_assistant_knowledge"));
        appendPlain(summaryHighlights, summaryNode.path("assistant_knowledge"));

        List<String> episodicHighlights = new ArrayList<>();
        for (JsonNode item : payload.path("episodic")) {
            String userInput = item.path("user_input").asText("").trim();
            String assistantResponse = item.path("assistant_response").asText("").trim();
            String combined = (userInput + " -> " + assistantResponse).trim();
            if (StringUtils.hasText(combined)) {
                episodicHighlights.add(combined);
            }
        }

        List<String> journalHighlights = extractJournalHighlights(payload.path("journal"));

        return new MemorySnapshot(
            payload.path("scope_id").asText(""),
            payload.path("profile").asText(""),
            summaryHighlights,
            episodicHighlights,
            journalHighlights
        );
    }

    private MemoryProfileSnapshot toProfileSnapshot(JsonNode payload) {
        return new MemoryProfileSnapshot(
            payload.path("scope_id").asText(""),
            payload.path("profile").asText(""),
            extractJournalHighlights(payload.path("journal"))
        );
    }

    private List<String> extractJournalHighlights(JsonNode journalNode) {
        List<String> results = new ArrayList<>();
        for (JsonNode item : journalNode) {
            String userInput = item.path("user_input").asText("").trim();
            String assistantResponse = item.path("assistant_response").asText("").trim();
            if (StringUtils.hasText(userInput) || StringUtils.hasText(assistantResponse)) {
                results.add((userInput + " -> " + assistantResponse).trim());
            }
        }
        return results;
    }

    private void appendKnowledge(List<String> target, JsonNode node) {
        for (JsonNode item : node) {
            String text = item.path("knowledge").asText("").trim();
            if (StringUtils.hasText(text)) {
                target.add(text);
            }
        }
    }

    private void appendPlain(List<String> target, JsonNode node) {
        for (JsonNode item : node) {
            String text = item.asText("").trim();
            if (StringUtils.hasText(text)) {
                target.add(text);
            }
        }
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
            return statusCode >= 500 ? "MemoryOS request failed" : "MemoryOS request was rejected";
        }
        try {
            JsonNode root = objectMapper.readTree(payload);
            String message = root.path("message").asText("").trim();
            if (StringUtils.hasText(message)) {
                return message;
            }
        } catch (Exception ignored) {
        }
        return payload.trim();
    }

    public record MemorySnapshot(
        String scopeId,
        String profileSummary,
        List<String> summaryHighlights,
        List<String> episodicHighlights,
        List<String> journalHighlights
    ) {
    }

    public record MemoryProfileSnapshot(
        String scopeId,
        String profileSummary,
        List<String> journalHighlights
    ) {
    }
}
