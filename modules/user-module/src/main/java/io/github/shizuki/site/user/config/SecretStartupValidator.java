package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component("userSecretStartupValidator")
public class SecretStartupValidator implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecretStartupValidator.class);

    private final SecretValueValidator secretValueValidator;
    private final OAuthProviderProperties oAuthProviderProperties;
    private final AuthProperties authProperties;
    private final MusicSecurityProperties musicSecurityProperties;
    private final boolean enforce;

    public SecretStartupValidator(SecretValueValidator secretValueValidator,
                                  OAuthProviderProperties oAuthProviderProperties,
                                  AuthProperties authProperties,
                                  MusicSecurityProperties musicSecurityProperties,
                                  @Value("${shizuki.security.secret.enforce:false}") boolean enforce) {
        this.secretValueValidator = secretValueValidator;
        this.oAuthProviderProperties = oAuthProviderProperties;
        this.authProperties = authProperties;
        this.musicSecurityProperties = musicSecurityProperties;
        this.enforce = enforce;
    }

    @Override
    public void run(ApplicationArguments args) {
        List<String> invalidKeys = collectInvalidKeys();

        if (!invalidKeys.isEmpty()) {
            String summary = summarizeInvalidKeys(invalidKeys);
            if (!enforce) {
                LOGGER.warn("启动存在 {} 项无效安全配置：{}。当前 SECRET_ENFORCE=false，仅告警不阻断；"
                        + "请在生产前通过配置中心或 common-config.yaml 下发真实值。",
                    invalidKeys.size(),
                    summary);
                LOGGER.debug("INVALID_SECRET_KEYS {}", invalidKeys);
                return;
            }
            throw new IllegalStateException(
                "启动已被 " + invalidKeys.size() + " 项无效安全配置阻断：" + summary + "。请下发真实值。"
            );
        }
    }

    List<String> collectInvalidKeys() {
        List<String> invalidKeys = new ArrayList<>();
        if (secretValueValidator.isInvalid(authProperties.getJwt().getSecret())) {
            invalidKeys.add("shizuki.auth.jwt.secret");
        }
        if (secretValueValidator.isInvalid(musicSecurityProperties.getKeyEncryptionMasterKey())) {
            invalidKeys.add("shizuki.music.security.key-encryption-master-key");
        }

        Map<String, OAuthProviderProperties.ProviderProperties> providers = oAuthProviderProperties.getProviders();
        if (providers != null) {
            for (Map.Entry<String, OAuthProviderProperties.ProviderProperties> entry : providers.entrySet()) {
                String provider = entry.getKey();
                OAuthProviderProperties.ProviderProperties config = entry.getValue();
                if (config == null || secretValueValidator.isInvalid(config.getClientId())) {
                    invalidKeys.add("shizuki.oauth.providers." + provider + ".client-id");
                }
                if (config == null || secretValueValidator.isInvalid(config.getClientSecret())) {
                    invalidKeys.add("shizuki.oauth.providers." + provider + ".client-secret");
                }
            }
        }

        return new ArrayList<>(new LinkedHashSet<>(invalidKeys));
    }

    static String summarizeInvalidKeys(List<String> invalidKeys) {
        if (invalidKeys == null || invalidKeys.isEmpty()) {
            return "";
        }

        List<String> sections = new ArrayList<>();
        Map<String, Set<String>> oauthFieldsByProvider = new LinkedHashMap<>();
        for (String key : invalidKeys) {
            if (!StringUtils.hasText(key)) {
                continue;
            }
            String trimmed = key.trim();
            if (trimmed.startsWith("shizuki.oauth.providers.")) {
                addOauthField(trimmed, oauthFieldsByProvider);
                continue;
            }
            sections.add(describeKnownKey(trimmed));
        }

        for (Map.Entry<String, Set<String>> entry : oauthFieldsByProvider.entrySet()) {
            sections.add(describeOauthProvider(entry.getKey(), entry.getValue()));
        }
        return String.join("; ", sections);
    }

    private static void addOauthField(String key, Map<String, Set<String>> oauthFieldsByProvider) {
        String remainder = key.substring("shizuki.oauth.providers.".length());
        int fieldIndex = remainder.lastIndexOf('.');
        if (fieldIndex <= 0 || fieldIndex >= remainder.length() - 1) {
            oauthFieldsByProvider.computeIfAbsent(key, ignored -> new LinkedHashSet<>());
            return;
        }
        String provider = remainder.substring(0, fieldIndex);
        String field = remainder.substring(fieldIndex + 1);
        oauthFieldsByProvider.computeIfAbsent(provider, ignored -> new LinkedHashSet<>()).add(field);
    }

    private static String describeKnownKey(String key) {
        return switch (key) {
            case "shizuki.auth.jwt.secret" ->
                "JWT secret (AUTH_JWT_SECRET or shizuki.auth.jwt.secret)";
            case "shizuki.music.security.key-encryption-master-key" ->
                "music key encryption master key (SHIZUKI_MUSIC_SECURITY_KEY_ENCRYPTION_MASTER_KEY or shizuki.music.security.key-encryption-master-key)";
            default -> key;
        };
    }

    private static String describeOauthProvider(String provider, Set<String> fields) {
        String displayName = switch (provider.toLowerCase(Locale.ROOT)) {
            case "github" -> "GitHub";
            case "linuxdo" -> "LinuxDo";
            case "spotify" -> "Spotify";
            default -> provider;
        };
        String envPrefix = provider.replace('-', '_').toUpperCase(Locale.ROOT);
        if (fields.contains("client-id") && fields.contains("client-secret") && fields.size() == 2) {
            return displayName + " OAuth credentials (" + envPrefix + "_CLIENT_ID/" + envPrefix + "_CLIENT_SECRET)";
        }
        return displayName + " OAuth fields " + fields;
    }
}
