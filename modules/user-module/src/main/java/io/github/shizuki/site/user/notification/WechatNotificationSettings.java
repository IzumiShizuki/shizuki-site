package io.github.shizuki.site.user.notification;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WechatNotificationSettings {
    private final boolean enabled;
    private final String secret;
    private final Set<String> platforms;
    private final String origin;

    public WechatNotificationSettings(
        @Value("${shizuki.notifications.wechat.enabled:false}") boolean enabled,
        @Value("${shizuki.notifications.wechat.bridge-secret:}") String secret,
        @Value("${shizuki.notifications.wechat.platform-ids:}") String platformIds,
        @Value("${shizuki.notifications.wechat.site-origin:https://site.shizuki.online}") String origin) {
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
        } catch (IllegalArgumentException e) { return false; }
    }
    public String origin() { return origin; }
    public boolean allows(String platform) { return platforms.contains(platform); }
    public void requireAvailable() {
        if (!available()) throw new BusinessException(ErrorCode.FEATURE_DISABLED, "微信提醒尚未启用");
    }
    public void authenticate(String authorization) {
        requireAvailable();
        byte[] expected = ("Bearer " + secret).getBytes(StandardCharsets.UTF_8);
        byte[] actual = (authorization == null ? "" : authorization).getBytes(StandardCharsets.UTF_8);
        if (!MessageDigest.isEqual(expected, actual))
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid bridge credentials");
    }
}
