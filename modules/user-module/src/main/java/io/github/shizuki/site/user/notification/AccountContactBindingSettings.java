package io.github.shizuki.site.user.notification;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccountContactBindingSettings {
    private final boolean enabled;
    private final String secret;
    private final Set<String> platforms;
    private final String origin;

    public AccountContactBindingSettings(
        @Value("${shizuki.account.contacts.enabled:false}") boolean enabled,
        @Value("${shizuki.account.contacts.bridge-secret:}") String secret,
        @Value("${shizuki.account.contacts.platform-ids:}") String platformIds,
        @Value("${shizuki.account.contacts.site-origin:https://site.shizuki.online}") String origin) {
        this.enabled = enabled;
        this.secret = secret == null ? "" : secret;
        this.platforms = Arrays.stream(platformIds.split(",")).map(String::trim)
            .filter(s -> !s.isEmpty()).collect(Collectors.toUnmodifiableSet());
        this.origin = origin.replaceAll("/+$", "");
    }

    public boolean available() {
        try {
            URI uri = URI.create(origin);
            return enabled && secret.length() >= 32 && !platforms.isEmpty() && platforms.size() <= 16
                && platforms.stream().allMatch(p -> p.length() <= 128 && !p.contains(":")
                    && p.chars().noneMatch(Character::isISOControl))
                && "https".equals(uri.getScheme()) && uri.getHost() != null
                && uri.getUserInfo() == null && uri.getQuery() == null && uri.getFragment() == null
                && (uri.getPath().isEmpty() || "/".equals(uri.getPath()));
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean allows(String platform) { return platforms.contains(platform); }
    public void requireAvailable() {
        if (!available()) throw new BusinessException(ErrorCode.FEATURE_DISABLED, "账号消息绑定尚未启用");
    }
    public void authenticate(String authorization) {
        requireAvailable();
        byte[] expected = ("Bearer " + secret).getBytes(StandardCharsets.UTF_8);
        byte[] actual = (authorization == null ? "" : authorization).getBytes(StandardCharsets.UTF_8);
        if (!MessageDigest.isEqual(expected, actual))
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid bridge credentials");
    }
}
