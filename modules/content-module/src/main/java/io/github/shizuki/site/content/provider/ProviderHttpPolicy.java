package io.github.shizuki.site.content.provider;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 外部站点组件 provider 的固定网络边界。
 *
 * <p>Provider 只能访问构造时登记的 HTTPS 主机。调用方不得用请求参数、后台输入或上游响应
 * 改写 scheme、host 或 port；重定向也应由实际 transport 禁用。
 */
public record ProviderHttpPolicy(
    String providerCode,
    URI baseUri,
    Set<String> allowedHosts,
    Duration connectTimeout,
    Duration readTimeout,
    int maxResponseBytes
) {

    private static final int MAX_ALLOWED_RESPONSE_BYTES = 1024 * 1024;

    public ProviderHttpPolicy {
        providerCode = requireText(providerCode, "providerCode").toUpperCase(Locale.ROOT);
        Objects.requireNonNull(baseUri, "baseUri");
        Objects.requireNonNull(allowedHosts, "allowedHosts");
        allowedHosts = allowedHosts.stream()
            .map(host -> requireText(host, "allowedHost").toLowerCase(Locale.ROOT))
            .collect(Collectors.toUnmodifiableSet());
        if (allowedHosts.isEmpty()) {
            throw new IllegalArgumentException("at least one provider host is required");
        }
        requirePositive(connectTimeout, "connectTimeout");
        requirePositive(readTimeout, "readTimeout");
        if (maxResponseBytes < 256 || maxResponseBytes > MAX_ALLOWED_RESPONSE_BYTES) {
            throw new IllegalArgumentException("maxResponseBytes must be between 256 bytes and 1 MiB");
        }
        validateEndpoint(baseUri, allowedHosts);
    }

    /** 验证 provider 请求仍处于固定 HTTPS 主机边界。 */
    public URI requireAllowedEndpoint(URI endpoint) {
        validateEndpoint(endpoint, allowedHosts);
        return endpoint;
    }

    /** 创建带统一响应等待超时的请求构造器；连接超时由 transport 使用本策略创建客户端时应用。 */
    public HttpRequest.Builder requestBuilder(URI endpoint) {
        return HttpRequest.newBuilder(requireAllowedEndpoint(endpoint))
            .timeout(readTimeout)
            .header("Accept", "application/json");
    }

    private static void validateEndpoint(URI endpoint, Set<String> hosts) {
        if (endpoint == null
            || !"https".equalsIgnoreCase(endpoint.getScheme())
            || endpoint.getHost() == null
            || !hosts.contains(endpoint.getHost().toLowerCase(Locale.ROOT))
            || (endpoint.getPort() != -1 && endpoint.getPort() != 443)
            || endpoint.getUserInfo() != null
            || endpoint.getFragment() != null) {
            throw new IllegalArgumentException("provider endpoint must use an allowed HTTPS host and port");
        }
    }

    private static void requirePositive(Duration duration, String field) {
        if (duration == null || duration.isZero() || duration.isNegative()) {
            throw new IllegalArgumentException(field + " must be positive");
        }
    }

    private static String requireText(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " is required");
        }
        return value.trim();
    }
}
