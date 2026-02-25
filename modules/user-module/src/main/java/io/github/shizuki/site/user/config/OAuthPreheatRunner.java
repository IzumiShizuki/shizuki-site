package io.github.shizuki.site.user.config;

import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.net.InetAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 启动后预热 OAuth 上游连接，降低首次授权码兑换的冷启动抖动。
 */
@Component
public class OAuthPreheatRunner implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OAuthPreheatRunner.class);
    private static final String PREHEAT_USER_AGENT = "shizuki-site-oauth-preheat/1.0";

    private final OAuthProviderProperties oAuthProviderProperties;
    private final HttpClient httpClient;
    private final DnsResolver dnsResolver;

    @Autowired
    public OAuthPreheatRunner(OAuthProviderProperties oAuthProviderProperties) {
        this(
            oAuthProviderProperties,
            HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(oAuthProviderProperties.getConnectTimeoutMs()))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build(),
            host -> InetAddress.getAllByName(host)
        );
    }

    OAuthPreheatRunner(OAuthProviderProperties oAuthProviderProperties,
                       HttpClient httpClient,
                       DnsResolver dnsResolver) {
        this.oAuthProviderProperties = oAuthProviderProperties;
        this.httpClient = httpClient;
        this.dnsResolver = dnsResolver;
    }

    @Override
    public void run(ApplicationArguments args) {
        Map<String, OAuthProviderProperties.ProviderProperties> providers = oAuthProviderProperties.getProviders();
        if (providers == null || providers.isEmpty()) {
            LOGGER.info("OAUTH_PREHEAT_SKIP reason=no_provider_config");
            return;
        }
        LOGGER.info("OAUTH_PREHEAT_START providers={}", providers.keySet());
        providers.forEach((provider, config) -> {
            preheatEndpoint(provider, "token", config.getTokenUrl());
            preheatEndpoint(provider, "user_api", config.getUserApiUrl());
        });
    }

    private void preheatEndpoint(String provider, String endpointType, String url) {
        if (!StringUtils.hasText(url)) {
            return;
        }
        long start = System.currentTimeMillis();
        try {
            URI uri = URI.create(url);
            String host = uri.getHost();
            if (!StringUtils.hasText(host)) {
                throw new IllegalArgumentException("invalid host");
            }
            dnsResolver.resolve(host);
            HttpRequest request = HttpRequest.newBuilder(uri)
                .timeout(Duration.ofMillis(oAuthProviderProperties.getReadTimeoutMs()))
                .header("User-Agent", PREHEAT_USER_AGENT)
                .GET()
                .build();
            HttpResponse<Void> response = httpClient.send(request, HttpResponse.BodyHandlers.discarding());
            LOGGER.info(
                "OAUTH_PREHEAT_OK provider={} endpoint={} status={} cost_ms={}",
                provider,
                endpointType,
                response.statusCode(),
                System.currentTimeMillis() - start
            );
        } catch (Exception ex) {
            LOGGER.warn(
                "OAUTH_PREHEAT_FAIL provider={} endpoint={} error_type={} error_msg={} cost_ms={}",
                provider,
                endpointType,
                ex.getClass().getSimpleName(),
                ex.getMessage(),
                System.currentTimeMillis() - start
            );
        }
    }

    @FunctionalInterface
    interface DnsResolver {
        void resolve(String host) throws Exception;
    }
}
