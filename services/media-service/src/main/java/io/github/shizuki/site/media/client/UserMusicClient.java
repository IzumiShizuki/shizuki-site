package io.github.shizuki.site.media.client;

import io.github.shizuki.site.media.config.MediaUserServiceProperties;
import io.github.shizuki.site.media.security.InternalRequestSigner;
import java.net.http.HttpClient;
import java.net.URLEncoder;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * 媒体服务调用用户服务内部接口客户端。
 */
@Component
public class UserMusicClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMusicClient.class);
    private final MediaUserServiceProperties mediaUserServiceProperties;
    private final InternalRequestSigner internalRequestSigner;
    private final RestClient restClient;

    public UserMusicClient(MediaUserServiceProperties mediaUserServiceProperties,
                           InternalRequestSigner internalRequestSigner,
                           RestClient.Builder restClientBuilder) {
        this.mediaUserServiceProperties = mediaUserServiceProperties;
        this.internalRequestSigner = internalRequestSigner;
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(mediaUserServiceProperties.getTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(mediaUserServiceProperties.getTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long fallback) {
        String groups = groupCodes == null || groupCodes.isEmpty() ? "" : String.join(",", groupCodes);
        try {
            ApiResponse<QuotaResolveResponse> response = restClient.get()
                .uri(mediaUserServiceProperties.getServiceUri()
                        + "/api/v1/internal/quotas/resolve?quota_code={quotaCode}&group_codes={groups}&default_value={defaultValue}",
                    quotaCode, groups, fallback)
                .retrieve()
                .body(new ParameterizedTypeReference<ApiResponse<QuotaResolveResponse>>() {
                });
            if (response == null || response.data == null || response.data.value == null) {
                return fallback;
            }
            return response.data.value;
        } catch (Exception ex) {
            LOGGER.warn("Resolve quota failed, quotaCode={}, groups={}, fallback={}", quotaCode, groups, fallback, ex);
            return fallback;
        }
    }

    public ApiKeyStatus getApiKeyStatus(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        String path = "/api/v1/internal/music/api-keys/" + userId + "/status";
        String query = "provider=" + urlEncode(normalizedProvider);
        try {
            SignedHeaders signedHeaders = sign("GET", path, query);
            ApiResponse<ApiKeyStatus> response = restClient.get()
                .uri(mediaUserServiceProperties.getServiceUri() + path + "?" + query)
                .header("X-Internal-Service", signedHeaders.service())
                .header("X-Internal-Timestamp", signedHeaders.timestamp())
                .header("X-Internal-Nonce", signedHeaders.nonce())
                .header("X-Internal-Signature", signedHeaders.signature())
                .retrieve()
                .body(new ParameterizedTypeReference<ApiResponse<ApiKeyStatus>>() {
                });
            if (response == null || response.data == null) {
                return new ApiKeyStatus(normalizedProvider, false, null);
            }
            return response.data;
        } catch (Exception ex) {
            LOGGER.warn("Get API key status failed, userId={}, provider={}", userId, normalizedProvider, ex);
            return new ApiKeyStatus(normalizedProvider, false, null);
        }
    }

    public String getApiKeyPlaintext(Long userId, String provider) {
        String normalizedProvider = provider == null ? "" : provider.trim().toLowerCase();
        String path = "/api/v1/internal/music/api-keys/" + userId + "/plaintext";
        String query = "provider=" + urlEncode(normalizedProvider);
        try {
            SignedHeaders signedHeaders = sign("GET", path, query);
            ApiResponse<String> response = restClient.get()
                .uri(mediaUserServiceProperties.getServiceUri() + path + "?" + query)
                .header("X-Internal-Service", signedHeaders.service())
                .header("X-Internal-Timestamp", signedHeaders.timestamp())
                .header("X-Internal-Nonce", signedHeaders.nonce())
                .header("X-Internal-Signature", signedHeaders.signature())
                .retrieve()
                .body(new ParameterizedTypeReference<ApiResponse<String>>() {
                });
            if (response == null || response.data == null) {
                return "";
            }
            return response.data;
        } catch (RestClientResponseException ex) {
            LOGGER.warn("Get API key plaintext failed with upstream status, userId={}, provider={}, status={}",
                userId, normalizedProvider, ex.getRawStatusCode(), ex);
            return "";
        } catch (Exception ex) {
            LOGGER.warn("Get API key plaintext failed, userId={}, provider={}", userId, normalizedProvider, ex);
            return "";
        }
    }

    private SignedHeaders sign(String method, String path, String query) {
        String timestamp = String.valueOf(Instant.now().getEpochSecond());
        String nonce = UUID.randomUUID().toString();
        String signature = internalRequestSigner.sign(method, path, query, timestamp, nonce);
        return new SignedHeaders("media-service", timestamp, nonce, signature);
    }

    private String urlEncode(String value) {
        return URLEncoder.encode(value == null ? "" : value, java.nio.charset.StandardCharsets.UTF_8);
    }

    private static class ApiResponse<T> {

        public String code;
        public String message;
        public T data;
    }

    private static class QuotaResolveResponse {

        public String quotaCode;
        public Long value;
    }

    public record ApiKeyStatus(String provider, boolean keyBound, String keyMask) {
    }

    private record SignedHeaders(String service, String timestamp, String nonce, String signature) {
    }
}
