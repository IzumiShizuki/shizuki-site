package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Locale;

/** Wallpaper-only outbound transport with optional authenticated HTTP proxy support. */
@Component
public class WallpaperOutboundClient {

    private static final String DESKTOP_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
                    + "(KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36";

    private final WallpaperDiscoveryProperties properties;
    private final HttpClient httpClient;
    private final ProxyEndpoint configuredProxy;

    @Autowired
    public WallpaperOutboundClient(WallpaperDiscoveryProperties properties) {
        this.properties = properties;
        this.configuredProxy = parseProxyEndpoint(properties.getProxyUrl());
        this.httpClient = createHttpClient(properties, configuredProxy);
    }

    WallpaperOutboundClient(WallpaperDiscoveryProperties properties, HttpClient httpClient) {
        this.properties = properties;
        this.configuredProxy = parseProxyEndpoint(properties.getProxyUrl());
        this.httpClient = httpClient;
    }

    HttpRequest.Builder request(String url) {
        return request(url, Duration.ofSeconds(Math.max(5, properties.getRequestTimeoutSeconds())));
    }

    HttpRequest.Builder request(String url, Duration timeout) {
        Duration boundedTimeout = timeout == null || timeout.isNegative() || timeout.isZero()
                ? Duration.ofSeconds(Math.max(5, properties.getRequestTimeoutSeconds()))
                : timeout;
        return HttpRequest.newBuilder()
                .uri(parseHttpUri(url))
                .timeout(boundedTimeout)
                .header("User-Agent", DESKTOP_USER_AGENT)
                .header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
    }

    <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> handler) {
        try {
            return httpClient.send(request, handler);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request failed");
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request interrupted");
        }
    }

    InetSocketAddress proxyAddress() {
        return configuredProxy == null ? null : configuredProxy.address();
    }

    boolean hasProxyAuthentication() {
        return configuredProxy != null && configuredProxy.hasCredentials();
    }

    URI parseHttpUri(String url) {
        URI uri;
        try {
            uri = URI.create(readString(url).trim());
        } catch (IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream url is invalid");
        }
        String scheme = readString(uri.getScheme()).toLowerCase(Locale.ROOT);
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream url protocol is unsupported");
        }
        return uri;
    }

    private static HttpClient createHttpClient(
            WallpaperDiscoveryProperties properties, ProxyEndpoint proxy) {
        HttpClient.Builder builder = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(Math.max(5, properties.getRequestTimeoutSeconds())))
                .followRedirects(HttpClient.Redirect.NORMAL);
        if (proxy == null) {
            return builder.build();
        }
        builder.proxy(ProxySelector.of(proxy.address()));
        if (proxy.hasCredentials()) {
            builder.authenticator(new ProxyAuthenticator(proxy));
        }
        return builder.build();
    }

    static ProxyEndpoint parseProxyEndpoint(String value) {
        String rawValue = readString(value).trim();
        if (!StringUtils.hasText(rawValue)) {
            return null;
        }
        URI uri;
        try {
            uri = URI.create(rawValue);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Wallpaper discovery proxy URL is invalid", exception);
        }
        if (!"http".equalsIgnoreCase(uri.getScheme()) || !StringUtils.hasText(uri.getHost())
                || StringUtils.hasText(uri.getRawQuery()) || StringUtils.hasText(uri.getRawFragment())) {
            throw new IllegalArgumentException(
                    "Wallpaper discovery proxy URL must be an HTTP URL without query or fragment");
        }
        String path = readString(uri.getPath());
        if (StringUtils.hasText(path) && !"/".equals(path)) {
            throw new IllegalArgumentException("Wallpaper discovery proxy URL must not contain a path");
        }
        int port = uri.getPort() == -1 ? 80 : uri.getPort();
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Wallpaper discovery proxy port is invalid");
        }
        String userInfo = uri.getUserInfo();
        if (!StringUtils.hasText(userInfo)) {
            return new ProxyEndpoint(InetSocketAddress.createUnresolved(uri.getHost(), port), "", new char[0]);
        }
        int delimiter = userInfo.indexOf(':');
        if (delimiter <= 0 || delimiter == userInfo.length() - 1) {
            throw new IllegalArgumentException(
                    "Wallpaper discovery proxy credentials must use username:password");
        }
        return new ProxyEndpoint(
                InetSocketAddress.createUnresolved(uri.getHost(), port),
                userInfo.substring(0, delimiter),
                userInfo.substring(delimiter + 1).toCharArray());
    }

    private static String readString(String value) {
        return value == null ? "" : value;
    }

    static final class ProxyEndpoint {

        private final InetSocketAddress address;
        private final String username;
        private final char[] password;

        private ProxyEndpoint(InetSocketAddress address, String username, char[] password) {
            this.address = address;
            this.username = username;
            this.password = password.clone();
        }

        InetSocketAddress address() {
            return address;
        }

        String username() {
            return username;
        }

        char[] password() {
            return password.clone();
        }

        boolean hasCredentials() {
            return StringUtils.hasText(username) && password.length > 0;
        }
    }

    private static final class ProxyAuthenticator extends Authenticator {

        private final ProxyEndpoint proxy;

        private ProxyAuthenticator(ProxyEndpoint proxy) {
            this.proxy = proxy;
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            if (RequestorType.PROXY.equals(getRequestorType())) {
                return new PasswordAuthentication(proxy.username(), proxy.password());
            }
            return null;
        }
    }
}
