package io.github.shizuki.site.ai.client;

import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.site.ai.config.AiUserServiceProperties;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

@Component
public class UserQuotaClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserQuotaClient.class);
    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientQuotaResolveException.class);

    private final AiUserServiceProperties aiUserServiceProperties;
    private final RestClient restClient;
    private final SpringRetryExecutor retryExecutor;

    public UserQuotaClient(AiUserServiceProperties aiUserServiceProperties,
                           RestClient.Builder restClientBuilder,
                           SpringRetryExecutor retryExecutor) {
        this.aiUserServiceProperties = aiUserServiceProperties;
        this.retryExecutor = retryExecutor;

        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(aiUserServiceProperties.getQuotaResolveConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(aiUserServiceProperties.getQuotaResolveTimeoutMs()));

        this.restClient = restClientBuilder
            .requestFactory(requestFactory)
            .build();
    }

    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        Long fallback = defaultValue == null ? 5L : defaultValue;
        String groups = groupCodes == null || groupCodes.isEmpty() ? "" : String.join(",", groupCodes);

        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            aiUserServiceProperties.getQuotaResolveRetryCount() + 1,
            aiUserServiceProperties.getQuotaResolveRetryBackoffMs(),
            aiUserServiceProperties.getQuotaResolveRetryMaxBackoffMs()
        );

        try {
            return retryExecutor.execute(
                retrySpec,
                RETRYABLE_EXCEPTIONS,
                () -> resolveQuotaOnce(quotaCode, groups, fallback)
            );
        } catch (TransientQuotaResolveException ex) {
            LOGGER.warn("Resolve quota transient failure exhausted retries. reason={} quotaCode={} groups={}",
                ex.reason(), quotaCode, groups);
            return fallback;
        } catch (Exception ex) {
            LOGGER.warn("Resolve quota unexpected retry failure. quotaCode={} groups={} error={}",
                quotaCode, groups, ex.getClass().getSimpleName());
            return fallback;
        }
    }

    private Long resolveQuotaOnce(String quotaCode, String groups, Long fallback) {
        try {
            ApiResponse<QuotaResolveResponse> response = restClient.get()
                .uri(aiUserServiceProperties.getServiceUri()
                        + "/api/v1/internal/quotas/resolve?quota_code={quotaCode}&group_codes={groups}&default_value={defaultValue}",
                    quotaCode, groups, fallback)
                .retrieve()
                .body(new ParameterizedTypeReference<ApiResponse<QuotaResolveResponse>>() {
                });

            if (response == null || response.data == null || response.data.value == null) {
                return fallback;
            }
            return response.data.value;
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().is4xxClientError()) {
                // 4xx 属于业务或鉴权问题，不做重试，直接降级。
                LOGGER.warn("Resolve quota got non-retriable 4xx. status={} quotaCode={} groups={}",
                    ex.getRawStatusCode(), quotaCode, groups);
                return fallback;
            }
            if (ex.getStatusCode().is5xxServerError()) {
                throw new TransientQuotaResolveException("upstream_5xx", ex);
            }
            LOGGER.warn("Resolve quota got non-retriable http status. status={} quotaCode={} groups={}",
                ex.getRawStatusCode(), quotaCode, groups);
            return fallback;
        } catch (ResourceAccessException ex) {
            throw new TransientQuotaResolveException("network", ex);
        } catch (Exception ex) {
            LOGGER.warn("Resolve quota got non-retriable error. quotaCode={} groups={} error={}",
                quotaCode, groups, ex.getClass().getSimpleName());
            return fallback;
        }
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

    private static final class TransientQuotaResolveException extends RuntimeException {

        private final String reason;

        private TransientQuotaResolveException(String reason, Throwable cause) {
            super(cause);
            this.reason = reason;
        }

        public String reason() {
            return reason;
        }
    }
}
