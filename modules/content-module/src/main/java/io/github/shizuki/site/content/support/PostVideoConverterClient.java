package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import io.github.shizuki.site.content.response.PostVideoToolStatus;
import io.github.shizuki.site.content.response.PostVideoTranscriptResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Component
public class PostVideoConverterClient {

    private static final long DEFAULT_CONNECT_TIMEOUT_MS = 2_000L;
    private static final long DEFAULT_READ_TIMEOUT_MS = 900_000L;

    private final PostVideoProperties properties;
    private final ObjectMapper objectMapper;
    private final RestClient restClient;

    public PostVideoConverterClient(RestClient.Builder restClientBuilder,
                                    PostVideoProperties properties,
                                    ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(normalizeTimeout(properties.getConnectTimeoutMs(), DEFAULT_CONNECT_TIMEOUT_MS));
        requestFactory.setReadTimeout(normalizeTimeout(properties.getReadTimeoutMs(), DEFAULT_READ_TIMEOUT_MS));
        this.restClient = restClientBuilder
            .baseUrl(properties.getConverterBaseUrl())
            .requestFactory(requestFactory)
            .build();
    }

    public boolean isConfigured() {
        return StringUtils.hasText(properties.getConverterBaseUrl());
    }

    public PostVideoSourceResponse inspect(PostVideoProcessRequest request) {
        return toSource(exchange("/v1/video/inspect", request));
    }

    public PostVideoTranscriptResponse transcribe(PostVideoProcessRequest request) {
        return toTranscript(exchange("/v1/video/transcribe", request));
    }

    public PostVideoSummaryResponse summarize(PostVideoProcessRequest request) {
        return toSummary(exchange("/v1/video/summarize", request));
    }

    private JsonNode exchange(String path, PostVideoProcessRequest request) {
        ensureConfigured();
        try {
            JsonNode root = restClient.post()
                .uri(path)
                .body(toRequestBody(request))
                .exchange((clientRequest, clientResponse) -> {
                    if (clientResponse.getStatusCode().isError()) {
                        String payload = StreamUtils.copyToString(clientResponse.getBody(), StandardCharsets.UTF_8);
                        throw toRemoteException(payload, clientResponse.getStatusCode().value());
                    }
                    try {
                        return objectMapper.readTree(clientResponse.getBody());
                    } catch (IOException exception) {
                        throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Video converter returned unreadable payload");
                    }
                });
            if (root == null || !root.path("success").asBoolean(false)) {
                String message = root == null ? "" : root.path("message").asText("");
                throw new BusinessException(
                    ErrorCode.INTERNAL_ERROR,
                    StringUtils.hasText(message) ? message : "Video converter returned invalid payload"
                );
            }
            return root.path("data");
        } catch (BusinessException exception) {
            throw exception;
        } catch (RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Video converter is unavailable");
        }
    }

    private BusinessException toRemoteException(String payload, int statusCode) {
        String message = statusCode >= 500 ? "Video converter failed" : "Video converter rejected the request";
        boolean needsCookies = false;
        try {
            JsonNode root = objectMapper.readTree(payload == null ? "" : payload);
            String remoteMessage = root.path("message").asText("").trim();
            if (StringUtils.hasText(remoteMessage)) {
                message = remoteMessage;
            }
            needsCookies = root.path("needsCookies").asBoolean(root.path("needs_cookies").asBoolean(false));
        } catch (Exception ignored) {
            if (StringUtils.hasText(payload)) {
                message = payload.trim();
            }
        }
        ErrorCode code = switch (statusCode) {
            case 400, 413 -> ErrorCode.BAD_REQUEST;
            case 401, 403 -> ErrorCode.FORBIDDEN;
            case 404 -> ErrorCode.NOT_FOUND;
            default -> ErrorCode.INTERNAL_ERROR;
        };
        return new BusinessException(
            code,
            message,
            Map.of(
                "video_error_code", "VIDEO_CONVERTER_ERROR",
                "upstream_status", statusCode,
                "needs_cookies", needsCookies
            )
        );
    }

    private Map<String, Object> toRequestBody(PostVideoProcessRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("sourceUrl", readString(request == null ? null : request.getSourceUrl(), ""));
        body.put("filePath", readString(request == null ? null : request.getFilePath(), ""));
        body.put("preferredLanguages", request == null || request.getPreferredLanguages() == null ? List.of() : request.getPreferredLanguages());
        body.put("maxKeyframes", request == null || request.getMaxKeyframes() == null ? properties.getMaxKeyframes() : request.getMaxKeyframes());
        body.put("includeVision", request != null && Boolean.TRUE.equals(request.getIncludeVision()));
        body.put("outputFormat", readString(request == null ? null : request.getOutputFormat(), ""));
        return body;
    }

    private void ensureConfigured() {
        if (!isConfigured()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Video converter is not configured");
        }
    }

    private int normalizeTimeout(long rawTimeout, long fallback) {
        long normalized = rawTimeout > 0 ? rawTimeout : fallback;
        return normalized >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) normalized;
    }

    private PostVideoSummaryResponse toSummary(JsonNode node) {
        return new PostVideoSummaryResponse(
            toSource(node.path("source")),
            node.path("markdown").asText(""),
            toStringList(node.path("summary")),
            toTimeline(node.path("timeline")),
            toKeyframes(node.path("keyframes")),
            toOcr(node.path("ocr")),
            toTranscript(node.path("transcript")),
            toToolStatus(node.path("toolStatus"))
        );
    }

    private PostVideoTranscriptResponse toTranscript(JsonNode node) {
        List<PostVideoTranscriptResponse.SegmentItem> segments = toSegments(node.path("segments"));
        return new PostVideoTranscriptResponse(
            toSource(node.path("source")),
            node.path("transcriptSource").asText(""),
            segments,
            new PostVideoTranscriptResponse.FormatBundle(
                node.path("formats").path("txt").asText(""),
                node.path("formats").path("md").asText(""),
                node.path("formats").path("srt").asText(""),
                node.path("formats").path("vtt").asText(""),
                toSegments(node.path("formats").path("json"))
            ),
            toToolStatus(node.path("toolStatus"))
        );
    }

    private PostVideoSourceResponse toSource(JsonNode node) {
        return new PostVideoSourceResponse(
            node.path("sourceUrl").asText(""),
            node.path("platform").asText(""),
            node.path("title").asText(""),
            node.path("author").asText(""),
            node.path("durationSeconds").isMissingNode() || node.path("durationSeconds").isNull() ? 0 : node.path("durationSeconds").asInt(0),
            node.path("thumbnailUrl").asText(""),
            toChapters(node.path("chapters")),
            toStringList(node.path("availableSubtitles")),
            toStringList(node.path("availableAutoCaptions")),
            node.path("needsCookies").asBoolean(false),
            toMap(node.path("metadata"))
        );
    }

    private List<PostVideoSourceResponse.ChapterItem> toChapters(JsonNode node) {
        List<PostVideoSourceResponse.ChapterItem> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoSourceResponse.ChapterItem(
                item.path("title").asText(""),
                readDouble(item.path("start")),
                readDouble(item.path("end"))
            ));
        }
        return result;
    }

    private List<PostVideoTranscriptResponse.SegmentItem> toSegments(JsonNode node) {
        List<PostVideoTranscriptResponse.SegmentItem> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoTranscriptResponse.SegmentItem(
                readDouble(item.path("start")),
                readDouble(item.path("end")),
                item.path("text").asText("")
            ));
        }
        return result;
    }

    private List<PostVideoSummaryResponse.TimelineItem> toTimeline(JsonNode node) {
        List<PostVideoSummaryResponse.TimelineItem> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoSummaryResponse.TimelineItem(
                readDouble(item.path("start")),
                readDouble(item.path("end")),
                item.path("title").asText(""),
                item.path("summary").asText("")
            ));
        }
        return result;
    }

    private List<PostVideoSummaryResponse.KeyframeItem> toKeyframes(JsonNode node) {
        List<PostVideoSummaryResponse.KeyframeItem> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoSummaryResponse.KeyframeItem(
                item.path("id").asText(""),
                readDouble(item.path("timestamp")),
                item.path("description").asText("")
            ));
        }
        return result;
    }

    private List<PostVideoSummaryResponse.OcrItem> toOcr(JsonNode node) {
        List<PostVideoSummaryResponse.OcrItem> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoSummaryResponse.OcrItem(
                item.path("frameId").asText(""),
                readDouble(item.path("timestamp")),
                toStringList(item.path("texts"))
            ));
        }
        return result;
    }

    private List<PostVideoToolStatus> toToolStatus(JsonNode node) {
        List<PostVideoToolStatus> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            result.add(new PostVideoToolStatus(
                item.path("name").asText(""),
                item.path("available").asBoolean(false),
                item.path("detail").asText("")
            ));
        }
        return result;
    }

    private List<String> toStringList(JsonNode node) {
        List<String> result = new ArrayList<>();
        if (node == null || !node.isArray()) {
            return result;
        }
        for (JsonNode item : node) {
            String value = item.asText("").trim();
            if (StringUtils.hasText(value)) {
                result.add(value);
            }
        }
        return result;
    }

    private Map<String, Object> toMap(JsonNode node) {
        if (node == null || node.isMissingNode() || node.isNull()) {
            return Map.of();
        }
        return objectMapper.convertValue(node, new TypeReference<Map<String, Object>>() {
        });
    }

    private Double readDouble(JsonNode node) {
        if (node == null || node.isMissingNode() || node.isNull()) {
            return 0.0d;
        }
        return node.asDouble(0.0d);
    }

    private String readString(String value, String fallback) {
        return StringUtils.hasText(value) ? value.trim() : fallback;
    }
}
