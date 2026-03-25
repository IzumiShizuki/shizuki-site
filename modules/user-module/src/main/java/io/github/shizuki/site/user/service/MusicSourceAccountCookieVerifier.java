package io.github.shizuki.site.user.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * 音乐源账号 Cookie 验证器。
 */
@Component
public class MusicSourceAccountCookieVerifier {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicSourceAccountCookieVerifier.class);

    private static final Set<String> SUPPORTED_PROVIDERS = Set.of("netease", "qqmusic", "kugou");
    private static final Set<String> QQ_MUSIC_REQUIRED_KEYS = Set.of("qqmusic_key", "qm_keyst", "p_skey", "pt4_token");
    private static final Set<String> KUGOU_REQUIRED_KEYS = Set.of("userid", "token", "kg_mid", "kugoo", "mid");

    private final RestClient restClient;

    public MusicSourceAccountCookieVerifier(RestClient.Builder restClientBuilder) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(Duration.ofSeconds(8));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    public String normalizeProvider(String provider) {
        if (!StringUtils.hasText(provider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider is required");
        }
        String normalized = provider.trim().toLowerCase(Locale.ROOT);
        if (!SUPPORTED_PROVIDERS.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        }
        return normalized;
    }

    public VerificationResult verify(String provider, String cookieBundle) {
        String normalizedProvider = normalizeProvider(provider);
        String normalizedCookie = normalizeCookie(cookieBundle);
        return switch (normalizedProvider) {
            case "netease" -> verifyNetease(normalizedCookie);
            case "qqmusic" -> verifyQqMusic(normalizedCookie);
            case "kugou" -> verifyKugou(normalizedCookie);
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        };
    }

    public void assertValid(String provider, String cookieBundle) {
        VerificationResult result = verify(provider, cookieBundle);
        if (!result.valid()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, result.reason());
        }
    }

    private VerificationResult verifyNetease(String cookieBundle) {
        try {
            Map<?, ?> payload = restClient.post()
                .uri("https://music.163.com/api/nuser/account/get")
                .header("Cookie", cookieBundle)
                .header("Referer", "https://music.163.com/")
                .header("User-Agent", "Mozilla/5.0 ShizukiMusicHelper/1.0")
                .retrieve()
                .body(Map.class);
            Map<?, ?> account = payload == null ? Map.of() : toMap(payload.get("account"));
            Object id = account.get("id");
            long userId = id instanceof Number number ? number.longValue() : parseLong(String.valueOf(id));
            if (userId <= 0) {
                return VerificationResult.invalid("网易云登录态无效或已过期");
            }
            return VerificationResult.valid(null);
        } catch (BusinessException exception) {
            throw exception;
        } catch (Exception exception) {
            LOGGER.warn("MUSIC_SOURCE_COOKIE_VERIFY_FAIL provider=netease reason={}", sanitize(exception.getMessage()));
            return VerificationResult.invalid("网易云登录态校验失败，请重新登录后重试");
        }
    }

    private VerificationResult verifyQqMusic(String cookieBundle) {
        Map<String, String> cookieMap = parseCookieMap(cookieBundle);
        boolean hasUser = StringUtils.hasText(cookieMap.get("uin")) || StringUtils.hasText(cookieMap.get("p_uin"));
        boolean hasKey = QQ_MUSIC_REQUIRED_KEYS.stream().anyMatch(name -> StringUtils.hasText(cookieMap.get(name)));
        if (!hasUser || !hasKey) {
            return VerificationResult.invalid("QQ 音乐登录态无效，请确认已在官网登录并保持会话有效");
        }
        return VerificationResult.valid(null);
    }

    private VerificationResult verifyKugou(String cookieBundle) {
        Map<String, String> cookieMap = parseCookieMap(cookieBundle);
        boolean hasKey = KUGOU_REQUIRED_KEYS.stream().anyMatch(name -> StringUtils.hasText(cookieMap.get(name)));
        if (!hasKey) {
            return VerificationResult.invalid("酷狗登录态无效，请确认已在官网登录并保持会话有效");
        }
        return VerificationResult.valid(null);
    }

    private String normalizeCookie(String cookieBundle) {
        if (!StringUtils.hasText(cookieBundle)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cookie is required");
        }
        String normalized = Arrays.stream(cookieBundle.split(";"))
            .map(String::trim)
            .filter(StringUtils::hasText)
            .collect(Collectors.joining("; "));
        if (normalized.length() < 8) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cookie is invalid");
        }
        return normalized;
    }

    private Map<String, String> parseCookieMap(String cookieBundle) {
        Map<String, String> result = new LinkedHashMap<>();
        for (String segment : cookieBundle.split(";")) {
            String item = segment == null ? "" : segment.trim();
            if (!StringUtils.hasText(item)) {
                continue;
            }
            int index = item.indexOf('=');
            if (index <= 0) {
                continue;
            }
            String name = item.substring(0, index).trim().toLowerCase(Locale.ROOT);
            String value = item.substring(index + 1).trim();
            if (StringUtils.hasText(name) && StringUtils.hasText(value)) {
                result.put(name, value);
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> toMap(Object raw) {
        if (raw instanceof Map<?, ?> source) {
            return source.entrySet().stream()
                .filter(entry -> entry.getKey() != null)
                .collect(Collectors.toMap(
                    entry -> String.valueOf(entry.getKey()),
                    Map.Entry::getValue,
                    (left, right) -> right,
                    LinkedHashMap::new
                ));
        }
        return Map.of();
    }

    private long parseLong(String raw) {
        try {
            return Long.parseLong(Objects.toString(raw, "0"));
        } catch (Exception exception) {
            return 0L;
        }
    }

    private String sanitize(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "";
        }
        return URLEncoder.encode(raw, StandardCharsets.UTF_8);
    }

    public record VerificationResult(boolean valid, LocalDateTime expireAt, String reason) {

        public static VerificationResult valid(LocalDateTime expireAt) {
            return new VerificationResult(true, expireAt, "");
        }

        public static VerificationResult invalid(String reason) {
            return new VerificationResult(false, null, reason);
        }
    }
}
