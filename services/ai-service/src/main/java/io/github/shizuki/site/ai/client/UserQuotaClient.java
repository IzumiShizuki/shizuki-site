package io.github.shizuki.site.ai.client;

import io.github.shizuki.site.ai.config.AiUserServiceProperties;
import java.util.Set;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserQuotaClient {

    private final AiUserServiceProperties aiUserServiceProperties;
    private final RestClient restClient;

    public UserQuotaClient(AiUserServiceProperties aiUserServiceProperties) {
        this.aiUserServiceProperties = aiUserServiceProperties;
        this.restClient = RestClient.builder().build();
    }

    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        Long fallback = defaultValue == null ? 5L : defaultValue;
        String groups = groupCodes == null || groupCodes.isEmpty() ? "" : String.join(",", groupCodes);
        try {
            ApiResponse<QuotaResolveResponse> response = restClient.get()
                .uri(aiUserServiceProperties.getServiceUri() + "/api/v1/internal/quotas/resolve?quota_code={quotaCode}&group_codes={groups}&default_value={defaultValue}",
                    quotaCode, groups, fallback)
                .retrieve()
                .body(new ParameterizedTypeReference<ApiResponse<QuotaResolveResponse>>() {
                });

            if (response == null || response.data == null || response.data.value == null) {
                return fallback;
            }
            return response.data.value;
        } catch (Exception ex) {
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
}
