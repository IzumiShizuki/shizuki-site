package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.response.FreesoundTrackResponse;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * Freesound 在线环境音库客户端（API Token 始终保存在服务端）。
 */
@Component
public class FreesoundProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(FreesoundProvider.class);
    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientFreesoundException.class);
    private static final String RESPONSE_FIELDS = "id,name,username,license,duration,url,previews";
    private static final String LICENSE_CC0 = "Creative Commons 0";
    private static final String LICENSE_BY = "Attribution";

    private final FreesoundProperties freesoundProperties;
    private final RestClient restClient;
    private final SpringRetryExecutor retryExecutor;

    @Autowired
    public FreesoundProvider(FreesoundProperties freesoundProperties,
                             RestClient.Builder restClientBuilder,
                             SpringRetryExecutor retryExecutor) {
        this(freesoundProperties, buildRestClient(freesoundProperties, restClientBuilder), retryExecutor);
    }

    FreesoundProvider(FreesoundProperties freesoundProperties,
                      RestClient restClient,
                      SpringRetryExecutor retryExecutor) {
        this.freesoundProperties = freesoundProperties;
        this.restClient = restClient;
        this.retryExecutor = retryExecutor;
    }

    private static RestClient buildRestClient(FreesoundProperties freesoundProperties,
                                              RestClient.Builder restClientBuilder) {
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(freesoundProperties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(freesoundProperties.getReadTimeoutMs()));
        return restClientBuilder.requestFactory(requestFactory).build();
    }

    /**
     * 搜索环境音。
     *
     * @param query 关键词
     * @param licenseScope cc0 表示仅无需署名的音频，free 表示 CC0 + 署名许可
     * @param pageNo 页码，从 1 开始
     * @param pageSize 每页条数
     * @return 分页结果
     */
    public PageResponse<FreesoundTrackResponse> searchAmbient(String query,
                                                              String licenseScope,
                                                              int pageNo,
                                                              int pageSize) {
        if (!freesoundProperties.isEnabled()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound library not configured",
                Map.of("ambient_error_code", "AMBIENT_LIBRARY_DISABLED"));
        }

        String normalizedQuery = query == null ? "" : query.trim();
        if (normalizedQuery.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "query is required");
        }

        int safePageNo = Math.max(1, pageNo);
        int safePageSize = Math.max(1, Math.min(freesoundProperties.getMaxPageSize(), pageSize));
        String url = buildSearchUrl(normalizedQuery, licenseScope, safePageNo, safePageSize);

        Map<String, Object> payload = executeWithRetry("freesound_search", () -> getJsonOnce(url));
        List<FreesoundTrackResponse> items = parseResults(payload);
        long total = toLong(payload.get("count"));
        return PageResponse.of(items, total, safePageNo, safePageSize);
    }

    /**
     * 按 Freesound ID 重新解析可信的音频元数据。导入接口只接收 ID，不能复用前端传来的 URL。
     *
     * @param soundId Freesound 数字 ID
     * @return 当前音频元数据
     */
    public FreesoundTrackResponse resolveAmbient(String soundId) {
        requireEnabled();
        String normalizedSoundId = soundId == null ? "" : soundId.trim();
        if (!normalizedSoundId.matches("[1-9]\\d{0,19}")) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid Freesound sound id");
        }
        String baseUrl = freesoundProperties.getSoundsUrl().endsWith("/")
            ? freesoundProperties.getSoundsUrl()
            : freesoundProperties.getSoundsUrl() + "/";
        String url = baseUrl + normalizedSoundId
            + "/?fields=" + URLEncoder.encode(RESPONSE_FIELDS, StandardCharsets.UTF_8);
        Map<String, Object> payload = executeWithRetry("freesound_resolve", () -> getJsonOnce(url));
        FreesoundTrackResponse track = parseTrack(payload, true);
        if (track == null || track.previewUrl().isBlank()) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Freesound preview is unavailable",
                Map.of("ambient_error_code", "AMBIENT_SOUND_PREVIEW_UNAVAILABLE"));
        }
        if (!Set.of("cc0", "by").contains(track.license())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Freesound license is not supported",
                Map.of("ambient_error_code", "AMBIENT_SOUND_LICENSE_UNSUPPORTED"));
        }
        if (!normalizedSoundId.equals(track.soundId())) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound returned a mismatched sound id",
                Map.of("ambient_error_code", "AMBIENT_SOUND_ID_MISMATCH"));
        }
        return track;
    }

    private String buildSearchUrl(String query, String licenseScope, int pageNo, int pageSize) {
        String licenseFilter = "free".equalsIgnoreCase(licenseScope)
            ? "(license:\"" + LICENSE_CC0 + "\" OR license:\"" + LICENSE_BY + "\")"
            : "license:\"" + LICENSE_CC0 + "\"";
        String durationFilter = "duration:["
            + freesoundProperties.getMinDurationSeconds() + " TO "
            + freesoundProperties.getMaxDurationSeconds() + "]";

        return freesoundProperties.getSearchUrl()
            + "?query=" + URLEncoder.encode(query, StandardCharsets.UTF_8)
            + "&filter=" + URLEncoder.encode(licenseFilter + " " + durationFilter, StandardCharsets.UTF_8)
            + "&fields=" + URLEncoder.encode(RESPONSE_FIELDS, StandardCharsets.UTF_8)
            + "&page=" + pageNo
            + "&page_size=" + pageSize;
    }

    private Map<String, Object> getJsonOnce(String url) {
        try {
            Map<String, Object> response = restClient.get()
                .uri(url)
                .header("Authorization", "Token " + freesoundProperties.getApiKey())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {});
            return response == null ? Map.of() : response;
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientFreesoundException("upstream_5xx", ex);
            }
            if (ex.getStatusCode().value() == 429) {
                throw new BusinessException(ErrorCode.TOO_MANY_REQUESTS, "Freesound rate limit reached",
                    Map.of("ambient_error_code", "AMBIENT_LIBRARY_RATE_LIMITED"));
            }
            if (ex.getStatusCode().value() == 401 || ex.getStatusCode().value() == 403) {
                LOGGER.warn("Freesound rejected the configured API token, status={}", ex.getStatusCode().value());
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound token rejected",
                    Map.of("ambient_error_code", "AMBIENT_LIBRARY_TOKEN_INVALID"));
            }
            if (ex.getStatusCode().value() == 404) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Freesound sound not found",
                    Map.of("ambient_error_code", "AMBIENT_SOUND_NOT_FOUND"));
            }
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound upstream error",
                Map.of("ambient_error_code", "AMBIENT_LIBRARY_UPSTREAM_ERROR",
                    "status", ex.getStatusCode().value()));
        } catch (ResourceAccessException ex) {
            throw new TransientFreesoundException("network", ex);
        }
    }

    @SuppressWarnings("unchecked")
    private List<FreesoundTrackResponse> parseResults(Map<String, Object> payload) {
        Object rawResults = payload.get("results");
        if (!(rawResults instanceof List<?> resultList)) {
            return List.of();
        }

        List<FreesoundTrackResponse> items = new ArrayList<>();
        for (Object rawItem : resultList) {
            if (!(rawItem instanceof Map<?, ?> item)) {
                continue;
            }
            FreesoundTrackResponse track = parseTrack((Map<String, Object>) item, false);
            if (track != null && Set.of("cc0", "by").contains(track.license())) {
                items.add(track);
            }
        }
        return items;
    }

    private FreesoundTrackResponse parseTrack(Map<String, Object> sound, boolean requireHighQualityPreview) {
        String previewUrl = resolvePreviewUrl(sound.get("previews"), requireHighQualityPreview);
        if (previewUrl.isEmpty()) {
            return null;
        }
        String soundId = toStringValue(sound.get("id"));
        if (!soundId.matches("[1-9]\\d{0,19}")) {
            return null;
        }
        String licenseUrl = toStringValue(sound.get("license"));
        String licenseCode = resolveLicenseCode(licenseUrl);
        return new FreesoundTrackResponse(
            soundId,
            toStringValue(sound.get("name")),
            toStringValue(sound.get("username")),
            previewUrl,
            licenseCode,
            resolveLicenseName(licenseCode),
            !"cc0".equals(licenseCode),
            "https://freesound.org/s/" + soundId + "/",
            toDouble(sound.get("duration"))
        );
    }

    @SuppressWarnings("unchecked")
    private String resolvePreviewUrl(Object rawPreviews, boolean requireHighQualityPreview) {
        if (!(rawPreviews instanceof Map<?, ?> previewMap)) {
            return "";
        }
        Map<String, Object> previews = (Map<String, Object>) previewMap;
        String hq = toStringValue(previews.get("preview-hq-mp3"));
        if (!hq.isEmpty()) {
            return hq;
        }
        if (requireHighQualityPreview) {
            return "";
        }
        return toStringValue(previews.get("preview-lq-mp3"));
    }

    private String resolveLicenseCode(String licenseUrl) {
        String normalized = licenseUrl.toLowerCase();
        if (normalized.contains("publicdomain/zero") || normalized.contains("/zero/")) {
            return "cc0";
        }
        if (normalized.contains("by-nc")) {
            return "by-nc";
        }
        if (normalized.contains("/by/")) {
            return "by";
        }
        return "unknown";
    }

    private String resolveLicenseName(String licenseCode) {
        return switch (licenseCode) {
            case "cc0" -> "CC0 公有领域";
            case "by" -> "CC-BY 需署名";
            case "by-nc" -> "CC-BY-NC 需署名·非商用";
            default -> "未知许可";
        };
    }

    private <T> T executeWithRetry(String operation, Supplier<T> action) {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            freesoundProperties.getRetryCount() + 1,
            freesoundProperties.getRetryBackoffMs(),
            freesoundProperties.getRetryMaxBackoffMs()
        );
        try {
            return retryExecutor.execute(retrySpec, RETRYABLE_EXCEPTIONS, action);
        } catch (TransientFreesoundException ex) {
            LOGGER.warn("Freesound transient failure, operation={}, reason={}", operation, ex.reason());
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound upstream error",
                Map.of("ambient_error_code", "AMBIENT_LIBRARY_UPSTREAM_ERROR", "reason", ex.reason()));
        }
    }

    private void requireEnabled() {
        if (!freesoundProperties.isEnabled()) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Freesound library not configured",
                Map.of("ambient_error_code", "AMBIENT_LIBRARY_DISABLED"));
        }
    }

    private static String toStringValue(Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof Number number) {
            return number.longValue() == number.doubleValue()
                ? String.valueOf(number.longValue())
                : String.valueOf(number);
        }
        return String.valueOf(value).trim();
    }

    private static long toLong(Object value) {
        return value instanceof Number number ? number.longValue() : 0L;
    }

    private static double toDouble(Object value) {
        return value instanceof Number number ? number.doubleValue() : 0d;
    }

    private static final class TransientFreesoundException extends RuntimeException {

        private final String reason;

        private TransientFreesoundException(String reason, Throwable cause) {
            super(cause);
            this.reason = reason;
        }

        public String reason() {
            return reason;
        }
    }
}
