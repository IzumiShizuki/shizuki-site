package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.net.InetAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
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
    private final SecretValueValidator secretValueValidator;

    @Autowired
    public OAuthPreheatRunner(OAuthProviderProperties oAuthProviderProperties,
                              SecretValueValidator secretValueValidator) {
        this(
            oAuthProviderProperties,
            HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(oAuthProviderProperties.getConnectTimeoutMs()))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build(),
            host -> InetAddress.getAllByName(host),
            secretValueValidator
        );
    }

    OAuthPreheatRunner(OAuthProviderProperties oAuthProviderProperties,
                       HttpClient httpClient,
                       DnsResolver dnsResolver,
                       SecretValueValidator secretValueValidator) {
        this.oAuthProviderProperties = oAuthProviderProperties;
        this.httpClient = httpClient;
        this.dnsResolver = dnsResolver;
        this.secretValueValidator = secretValueValidator;
    }

    @Override
    public void run(ApplicationArguments args) {
        Map<String, OAuthProviderProperties.ProviderProperties> providers = oAuthProviderProperties.getProviders();
        if (providers == null || providers.isEmpty()) {
            LOGGER.debug("OAUTH_PREHEAT_SKIP reason=no_provider_config");
            return;
        }
        List<PreheatResult> results = new ArrayList<>();
        List<String> skippedProviders = new ArrayList<>();
        providers.forEach((provider, config) -> {
            if (!hasValidCredentials(config)) {
                skippedProviders.add(provider);
                return;
            }
            results.add(preheatEndpoint(provider, "token", config.getTokenUrl()));
            results.add(preheatEndpoint(provider, "user_api", config.getUserApiUrl()));
        });

        long attemptedEndpoints = results.stream().filter(PreheatResult::attempted).count();
        if (attemptedEndpoints == 0) {
            LOGGER.debug("OAUTH_PREHEAT_SKIP reason=no_valid_provider_credentials providerCount={} skippedProviders={}",
                providers.size(),
                skippedProviders);
            return;
        }

        long successCount = results.stream().filter(result -> result.attempted() && result.success()).count();
        List<String> failedTargets = results.stream()
            .filter(result -> result.attempted() && !result.success())
            .map(PreheatResult::target)
            .toList();
        if (failedTargets.isEmpty()) {
            LOGGER.info("OAUTH_PREHEAT_DONE providerCount={} attemptedProviders={} skippedProviders={} endpointCount={} success={} failed=0",
                providers.size(),
                providers.size() - skippedProviders.size(),
                skippedProviders.size(),
                attemptedEndpoints,
                successCount);
            return;
        }

        LOGGER.warn("OAUTH_PREHEAT_PARTIAL_FAIL providerCount={} attemptedProviders={} skippedProviders={} endpointCount={} success={} failed={} failedTargets={}",
            providers.size(),
            providers.size() - skippedProviders.size(),
            skippedProviders.size(),
            attemptedEndpoints,
            successCount,
            failedTargets.size(),
            failedTargets);
    }

    private boolean hasValidCredentials(OAuthProviderProperties.ProviderProperties config) {
        return config != null
            && !secretValueValidator.isInvalid(config.getClientId())
            && !secretValueValidator.isInvalid(config.getClientSecret());
    }

    private PreheatResult preheatEndpoint(String provider, String endpointType, String url) {
        if (!StringUtils.hasText(url)) {
            return new PreheatResult(provider, endpointType, false, false);
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
            LOGGER.debug(
                "OAUTH_PREHEAT_OK provider={} endpoint={} status={} cost_ms={}",
                provider,
                endpointType,
                response.statusCode(),
                System.currentTimeMillis() - start
            );
            return new PreheatResult(provider, endpointType, true, true);
        } catch (Exception ex) {
            LOGGER.debug(
                "OAUTH_PREHEAT_FAIL provider={} endpoint={} error_type={} error_msg={} cost_ms={}",
                provider,
                endpointType,
                ex.getClass().getSimpleName(),
                ex.getMessage(),
                System.currentTimeMillis() - start
            );
            return new PreheatResult(provider, endpointType, true, false);
        }
    }

    @FunctionalInterface
    interface DnsResolver {
        void resolve(String host) throws Exception;
    }

    private record PreheatResult(String provider,
                                 String endpointType,
                                 boolean attempted,
                                 boolean success) {

        private String target() {
            return provider + ":" + endpointType;
        }
    }
}
