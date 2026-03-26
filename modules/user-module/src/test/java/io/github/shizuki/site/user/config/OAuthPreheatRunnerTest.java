package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.WebSocket;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.DefaultApplicationArguments;

class OAuthPreheatRunnerTest {

    @Test
    void shouldPreheatConfiguredProviderEndpoints() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties github = new OAuthProviderProperties.ProviderProperties();
        github.setClientId("github-client-id");
        github.setClientSecret("github-client-secret");
        github.setTokenUrl("https://github.com/login/oauth/access_token");
        github.setUserApiUrl("https://api.github.com/user");
        properties.setProviders(Map.of("github", github));

        RecordingHttpClient httpClient = new RecordingHttpClient(401);
        RecordingDnsResolver dnsResolver = new RecordingDnsResolver();
        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver, new SecretValueValidator());

        runner.run(new DefaultApplicationArguments(new String[0]));

        Assertions.assertEquals(List.of("github.com", "api.github.com"), dnsResolver.resolvedHosts());
        Assertions.assertEquals(
            List.of(
                URI.create("https://github.com/login/oauth/access_token"),
                URI.create("https://api.github.com/user")
            ),
            httpClient.requestUris()
        );
    }

    @Test
    void shouldContinueWhenDnsResolveFails() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties github = new OAuthProviderProperties.ProviderProperties();
        github.setClientId("github-client-id");
        github.setClientSecret("github-client-secret");
        github.setTokenUrl("https://github.com/login/oauth/access_token");
        github.setUserApiUrl("https://api.github.com/user");
        properties.setProviders(Map.of("github", github));

        RecordingHttpClient httpClient = new RecordingHttpClient(200);
        RecordingDnsResolver dnsResolver = new RecordingDnsResolver();
        dnsResolver.setFailure(new RuntimeException("dns timeout"));

        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver, new SecretValueValidator());

        Assertions.assertDoesNotThrow(() -> runner.run(new DefaultApplicationArguments(new String[0])));
        Assertions.assertTrue(httpClient.requestUris().isEmpty());
    }

    @Test
    void shouldSkipWhenNoProvidersConfigured() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        properties.setProviders(Map.of());
        RecordingHttpClient httpClient = new RecordingHttpClient(200);
        RecordingDnsResolver dnsResolver = new RecordingDnsResolver();

        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver, new SecretValueValidator());

        Assertions.assertDoesNotThrow(() -> runner.run(new DefaultApplicationArguments(new String[0])));
        Assertions.assertTrue(dnsResolver.resolvedHosts().isEmpty());
        Assertions.assertTrue(httpClient.requestUris().isEmpty());
    }

    @Test
    void shouldSkipProvidersWithoutValidCredentials() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties spotify = new OAuthProviderProperties.ProviderProperties();
        spotify.setClientId("<SPOTIFY_CLIENT_ID>");
        spotify.setClientSecret("<SPOTIFY_CLIENT_SECRET>");
        spotify.setTokenUrl("https://accounts.spotify.com/api/token");
        spotify.setUserApiUrl("https://api.spotify.com/v1/me");
        properties.setProviders(Map.of("spotify", spotify));
        RecordingHttpClient httpClient = new RecordingHttpClient(200);
        RecordingDnsResolver dnsResolver = new RecordingDnsResolver();

        OAuthPreheatRunner runner = new OAuthPreheatRunner(properties, httpClient, dnsResolver, new SecretValueValidator());

        Assertions.assertDoesNotThrow(() -> runner.run(new DefaultApplicationArguments(new String[0])));
        Assertions.assertTrue(dnsResolver.resolvedHosts().isEmpty());
        Assertions.assertTrue(httpClient.requestUris().isEmpty());
    }

    private static final class RecordingDnsResolver implements OAuthPreheatRunner.DnsResolver {

        private final List<String> resolvedHosts = new ArrayList<>();
        private RuntimeException failure;

        @Override
        public void resolve(String host) {
            resolvedHosts.add(host);
            if (failure != null) {
                throw failure;
            }
        }

        List<String> resolvedHosts() {
            return resolvedHosts;
        }

        void setFailure(RuntimeException failure) {
            this.failure = failure;
        }
    }

    private static final class RecordingHttpClient extends HttpClient {

        private final int statusCode;
        private final List<URI> requestUris = new ArrayList<>();

        private RecordingHttpClient(int statusCode) {
            this.statusCode = statusCode;
        }

        List<URI> requestUris() {
            return requestUris;
        }

        @Override
        public Optional<CookieHandler> cookieHandler() {
            return Optional.empty();
        }

        @Override
        public Optional<Duration> connectTimeout() {
            return Optional.empty();
        }

        @Override
        public Redirect followRedirects() {
            return Redirect.NORMAL;
        }

        @Override
        public Optional<ProxySelector> proxy() {
            return Optional.of(ProxySelector.of(new InetSocketAddress("127.0.0.1", 8080)));
        }

        @Override
        public SSLContext sslContext() {
            try {
                return SSLContext.getDefault();
            } catch (NoSuchAlgorithmException exception) {
                throw new IllegalStateException(exception);
            }
        }

        @Override
        public SSLParameters sslParameters() {
            return new SSLParameters();
        }

        @Override
        public Optional<Authenticator> authenticator() {
            return Optional.empty();
        }

        @Override
        public Version version() {
            return HttpClient.Version.HTTP_1_1;
        }

        @Override
        public Optional<Executor> executor() {
            return Optional.empty();
        }

        @Override
        public <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
            requestUris.add(request.uri());
            return new StubHttpResponse<>(request, request.uri(), statusCode);
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request,
                                                                HttpResponse.BodyHandler<T> responseBodyHandler) {
            return CompletableFuture.completedFuture(send(request, responseBodyHandler));
        }

        @Override
        public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request,
                                                                HttpResponse.BodyHandler<T> responseBodyHandler,
                                                                HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
            return CompletableFuture.completedFuture(send(request, responseBodyHandler));
        }

        @Override
        public WebSocket.Builder newWebSocketBuilder() {
            throw new UnsupportedOperationException("WebSocket is not used in this test");
        }
    }

    private static final class StubHttpResponse<T> implements HttpResponse<T> {

        private final HttpRequest request;
        private final URI uri;
        private final int statusCode;

        private StubHttpResponse(HttpRequest request, URI uri, int statusCode) {
            this.request = request;
            this.uri = uri;
            this.statusCode = statusCode;
        }

        @Override
        public int statusCode() {
            return statusCode;
        }

        @Override
        public HttpRequest request() {
            return request;
        }

        @Override
        public Optional<HttpResponse<T>> previousResponse() {
            return Optional.empty();
        }

        @Override
        public HttpHeaders headers() {
            return HttpHeaders.of(Map.of(), (name, value) -> true);
        }

        @Override
        public T body() {
            return null;
        }

        @Override
        public Optional<SSLSession> sslSession() {
            return Optional.empty();
        }

        @Override
        public URI uri() {
            return uri;
        }

        @Override
        public HttpClient.Version version() {
            return HttpClient.Version.HTTP_1_1;
        }
    }
}
