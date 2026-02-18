package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.site.media.config.SpotifyMusicProperties;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * Spotify 音乐接口客户端（仅用于搜索与预览）。
 */
@Component
public class SpotifyMusicProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpotifyMusicProvider.class);
    private static final int DEFAULT_EXPIRE_SECONDS = 3600;
    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientSpotifyException.class);

    private final SpotifyMusicProperties spotifyMusicProperties;
    private final RestClient restClient;
    private final SpringRetryExecutor retryExecutor;

    private volatile String cachedAppToken = "";
    private volatile Instant cachedAppTokenExpireAt = Instant.EPOCH;
    private final AtomicInteger transientFailureCount = new AtomicInteger(0);
    private volatile Instant circuitOpenUntil = Instant.EPOCH;

    public SpotifyMusicProvider(SpotifyMusicProperties spotifyMusicProperties,
                              RestClient.Builder restClientBuilder,
                              SpringRetryExecutor retryExecutor) {
        this.spotifyMusicProperties = spotifyMusicProperties;
        this.retryExecutor = retryExecutor;
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(spotifyMusicProperties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(spotifyMusicProperties.getReadTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    /**
     * 获取应用级访问令牌。
     */
    public synchronized String getAppAccessToken() {
        if (StringUtils.hasText(cachedAppToken) && Instant.now().isBefore(cachedAppTokenExpireAt.minusSeconds(30))) {
            return cachedAppToken;
        }
        if (!StringUtils.hasText(spotifyMusicProperties.getClientId()) || !StringUtils.hasText(spotifyMusicProperties.getClientSecret())) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify client credential is missing",
                Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR"));
        }

        TokenResponsePayload tokenPayload = executeWithRetry("spotify_app_token", this::requestAppAccessTokenOnce);
        cachedAppToken = tokenPayload.accessToken();
        cachedAppTokenExpireAt = Instant.now().plusSeconds(Math.max(60L, tokenPayload.expiresIn()));
        return cachedAppToken;
    }

    /**
     * 搜索 Spotify 曲目。
     */
    public List<SpotifyTrackResponse> searchTracks(String query, int limit, String userTokenOptional) {
        String token = resolveBearerToken(userTokenOptional);
        String encodedQ = URLEncoder.encode(query, StandardCharsets.UTF_8);
        String url = spotifyMusicProperties.getSearchUrl() + "?q=" + encodedQ + "&type=track&limit=" + limit;
        return executeWithRetry("spotify_search", () -> searchTracksOnce(url, token, userTokenOptional));
    }

    /**
     * 查询 Spotify 曲目预览链接。
     */
    public SpotifyPreviewResponse getTrackPreview(String trackId, String userTokenOptional) {
        String token = resolveBearerToken(userTokenOptional);
        String url = spotifyMusicProperties.getTrackUrl().endsWith("/")
            ? spotifyMusicProperties.getTrackUrl() + URLEncoder.encode(trackId, StandardCharsets.UTF_8)
            : spotifyMusicProperties.getTrackUrl() + "/" + URLEncoder.encode(trackId, StandardCharsets.UTF_8);
        return executeWithRetry("spotify_preview", () -> getTrackPreviewOnce(url, trackId, token, userTokenOptional));
    }

    private TokenResponsePayload requestAppAccessTokenOnce() {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("grant_type", "client_credentials");
        String basicToken = Base64.getEncoder().encodeToString(
            (spotifyMusicProperties.getClientId() + ":" + spotifyMusicProperties.getClientSecret()).getBytes(StandardCharsets.UTF_8)
        );

        try {
            Map<String, Object> tokenResponse = restClient.post()
                .uri(spotifyMusicProperties.getTokenUrl())
                .header("Authorization", "Basic " + basicToken)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .accept(MediaType.APPLICATION_JSON)
                .body(form)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            String accessToken = readString(tokenResponse, "access_token");
            long expiresIn = readLong(tokenResponse, "expires_in", DEFAULT_EXPIRE_SECONDS);
            if (!StringUtils.hasText(accessToken)) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify token response missing access_token",
                    Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR"));
            }
            return new TokenResponsePayload(accessToken, expiresIn);
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientSpotifyException("upstream_5xx", ex);
            }
            LOGGER.warn("Spotify app token request failed, status={}", ex.getRawStatusCode());
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify upstream error",
                Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR", "upstream_status", ex.getRawStatusCode()));
        } catch (ResourceAccessException ex) {
            throw new TransientSpotifyException("network", ex);
        }
    }

    private List<SpotifyTrackResponse> searchTracksOnce(String url, String token, String userTokenOptional) {
        try {
            Map<String, Object> response = restClient.get()
                .uri(url)
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            return parseSearchResponse(response);
        } catch (RestClientResponseException ex) {
            if (StringUtils.hasText(userTokenOptional) && (ex.getRawStatusCode() == 401 || ex.getRawStatusCode() == 403)) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Spotify user token invalid",
                    Map.of("music_error_code", "MUSIC_SPOTIFY_TOKEN_INVALID", "upstream_status", ex.getRawStatusCode()));
            }
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientSpotifyException("upstream_5xx", ex);
            }
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify upstream error",
                Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR", "upstream_status", ex.getRawStatusCode()));
        } catch (ResourceAccessException ex) {
            throw new TransientSpotifyException("network", ex);
        }
    }

    private SpotifyPreviewResponse getTrackPreviewOnce(String url, String trackId, String token, String userTokenOptional) {
        try {
            Map<String, Object> response = restClient.get()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            String previewUrl = readString(response, "preview_url");
            if (!StringUtils.hasText(previewUrl)) {
                return new SpotifyPreviewResponse(trackId, "", "spotify", "MUSIC_SPOTIFY_PREVIEW_NOT_AVAILABLE");
            }
            return new SpotifyPreviewResponse(trackId, previewUrl, "spotify", "");
        } catch (RestClientResponseException ex) {
            if (StringUtils.hasText(userTokenOptional) && (ex.getRawStatusCode() == 401 || ex.getRawStatusCode() == 403)) {
                throw new BusinessException(ErrorCode.FORBIDDEN, "Spotify user token invalid",
                    Map.of("music_error_code", "MUSIC_SPOTIFY_TOKEN_INVALID", "upstream_status", ex.getRawStatusCode()));
            }
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientSpotifyException("upstream_5xx", ex);
            }
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify upstream error",
                Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR", "upstream_status", ex.getRawStatusCode()));
        } catch (ResourceAccessException ex) {
            throw new TransientSpotifyException("network", ex);
        }
    }

    private String resolveBearerToken(String userTokenOptional) {
        if (StringUtils.hasText(userTokenOptional)) {
            return userTokenOptional.trim();
        }
        return getAppAccessToken();
    }

    private <T> T executeWithRetry(String operation, Supplier<T> action) {
        assertCircuitClosed(operation);
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            spotifyMusicProperties.getRetryCount() + 1,
            spotifyMusicProperties.getRetryBackoffMs(),
            spotifyMusicProperties.getRetryMaxBackoffMs()
        );
        try {
            T result = retryExecutor.execute(retrySpec, RETRYABLE_EXCEPTIONS, action);
            resetTransientFailureState();
            return result;
        } catch (TransientSpotifyException ex) {
            markTransientFailure(operation, ex.reason());
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify upstream error",
                Map.of("music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR", "reason", ex.reason()));
        }
    }

    private void assertCircuitClosed(String operation) {
        Instant openUntil = circuitOpenUntil;
        Instant now = Instant.now();
        if (now.isBefore(openUntil)) {
            long retryAfterSeconds = Math.max(1L, Duration.between(now, openUntil).toSeconds());
            LOGGER.warn("Spotify circuit open, operation={}, retryAfterSeconds={}", operation, retryAfterSeconds);
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Spotify upstream circuit open",
                Map.of(
                    "music_error_code", "MUSIC_SPOTIFY_UPSTREAM_ERROR",
                    "circuit_state", "OPEN",
                    "retry_after_seconds", retryAfterSeconds
                ));
        }
    }

    private void markTransientFailure(String operation, String reason) {
        int current = transientFailureCount.incrementAndGet();
        int threshold = spotifyMusicProperties.getCircuitBreakerFailureThreshold();
        if (current < threshold) {
            LOGGER.warn("Spotify transient failure, operation={}, reason={}, failureCount={}, threshold={}",
                operation, reason, current, threshold);
            return;
        }
        long openSeconds = spotifyMusicProperties.getCircuitBreakerOpenSeconds();
        circuitOpenUntil = Instant.now().plusSeconds(openSeconds);
        transientFailureCount.set(0);
        LOGGER.warn("Spotify circuit opened, operation={}, reason={}, openSeconds={}",
            operation, reason, openSeconds);
    }

    private void resetTransientFailureState() {
        transientFailureCount.set(0);
        circuitOpenUntil = Instant.EPOCH;
    }

    @SuppressWarnings("unchecked")
    private List<SpotifyTrackResponse> parseSearchResponse(Map<String, Object> response) {
        Object tracksObj = response == null ? null : response.get("tracks");
        if (!(tracksObj instanceof Map<?, ?> tracksMapRaw)) {
            return List.of();
        }
        Object itemsObj = ((Map<String, Object>) tracksMapRaw).get("items");
        if (!(itemsObj instanceof List<?> itemsRaw)) {
            return List.of();
        }
        List<SpotifyTrackResponse> result = new ArrayList<>();
        for (Object itemObj : itemsRaw) {
            if (!(itemObj instanceof Map<?, ?> mapRaw)) {
                continue;
            }
            Map<String, Object> item = (Map<String, Object>) mapRaw;
            String id = readString(item, "id");
            String title = readString(item, "name");
            String previewUrl = readString(item, "preview_url");
            String artist = joinArtists(item.get("artists"));
            result.add(new SpotifyTrackResponse(
                id == null ? "" : id,
                title == null ? "" : title,
                artist,
                previewUrl == null ? "" : previewUrl,
                "spotify"
            ));
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private String joinArtists(Object artistsObj) {
        if (!(artistsObj instanceof List<?> artistsRaw) || artistsRaw.isEmpty()) {
            return "";
        }
        List<String> names = new ArrayList<>();
        for (Object artistObj : artistsRaw) {
            if (!(artistObj instanceof Map<?, ?> mapRaw)) {
                continue;
            }
            String name = readString((Map<String, Object>) mapRaw, "name");
            if (StringUtils.hasText(name)) {
                names.add(name);
            }
        }
        return String.join(", ", names);
    }

    private String readString(Map<String, Object> map, String key) {
        if (map == null || map.get(key) == null) {
            return null;
        }
        String value = String.valueOf(map.get(key));
        return StringUtils.hasText(value) ? value : null;
    }

    private long readLong(Map<String, Object> map, String key, long fallback) {
        if (map == null || map.get(key) == null) {
            return fallback;
        }
        try {
            return Long.parseLong(String.valueOf(map.get(key)));
        } catch (Exception ex) {
            return fallback;
        }
    }

    private record TokenResponsePayload(String accessToken, long expiresIn) {
    }

    private static final class TransientSpotifyException extends RuntimeException {

        private final String reason;

        private TransientSpotifyException(String reason, Throwable cause) {
            super(cause);
            this.reason = reason;
        }

        public String reason() {
            return reason;
        }
    }
}
