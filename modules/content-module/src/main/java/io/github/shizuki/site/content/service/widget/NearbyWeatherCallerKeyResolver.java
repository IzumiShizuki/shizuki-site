package io.github.shizuki.site.content.service.widget;

import jakarta.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HexFormat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;

/** Produces a short-lived pseudonymous limiter key without retaining the caller address. */
@Component
public class NearbyWeatherCallerKeyResolver {

    private static final int MAX_SOURCE_LENGTH = 128;

    private final byte[] secret;
    private final java.util.Set<String> trustedProxyAddresses;

    public NearbyWeatherCallerKeyResolver(NearbyWeatherProperties properties) {
        this.secret = properties.getCallerKeySecret().getBytes(StandardCharsets.UTF_8);
        this.trustedProxyAddresses = properties.getTrustedProxyAddresses();
    }

    public String resolve(HttpServletRequest request) {
        String source = resolveSource(request);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret, "HmacSHA256"));
            return HexFormat.of().formatHex(mac.doFinal(source.getBytes(StandardCharsets.UTF_8)));
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("nearby weather caller-key hashing is unavailable", exception);
        }
    }

    private String resolveSource(HttpServletRequest request) {
        if (request == null) {
            return "anonymous";
        }
        if (isTrustedProxy(request.getRemoteAddr())) {
            String forwarded = request.getHeader("X-Forwarded-For");
            if (forwarded != null && !forwarded.isBlank()) {
                return bound(forwarded.split(",", 2)[0].trim());
            }
            String realIp = request.getHeader("X-Real-IP");
            if (realIp != null && !realIp.isBlank()) {
                return bound(realIp.trim());
            }
        }
        String remote = request.getRemoteAddr();
        return remote == null || remote.isBlank() ? "anonymous" : bound(remote.trim());
    }

    private boolean isTrustedProxy(String remoteAddress) {
        return remoteAddress != null && trustedProxyAddresses.contains(remoteAddress.trim());
    }

    private String bound(String value) {
        if (value.isEmpty()) {
            return "anonymous";
        }
        return value.length() <= MAX_SOURCE_LENGTH ? value : value.substring(0, MAX_SOURCE_LENGTH);
    }
}
