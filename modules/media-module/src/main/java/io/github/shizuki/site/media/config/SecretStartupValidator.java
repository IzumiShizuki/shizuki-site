package io.github.shizuki.site.media.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.storage.config.OssProperties;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component("mediaSecretStartupValidator")
public class SecretStartupValidator implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecretStartupValidator.class);

    private final SecretValueValidator secretValueValidator;
    private final OssProperties ossProperties;
    private final SpotifyMusicProperties spotifyMusicProperties;
    private final boolean enforce;

    public SecretStartupValidator(SecretValueValidator secretValueValidator,
                                  OssProperties ossProperties,
                                  SpotifyMusicProperties spotifyMusicProperties,
                                  @Value("${shizuki.security.secret.enforce:false}") boolean enforce) {
        this.secretValueValidator = secretValueValidator;
        this.ossProperties = ossProperties;
        this.spotifyMusicProperties = spotifyMusicProperties;
        this.enforce = enforce;
    }

    @Override
    public void run(ApplicationArguments args) {
        List<String> invalidKeys = collectInvalidKeys();

        if (!invalidKeys.isEmpty()) {
            String summary = summarizeInvalidKeys(invalidKeys);
            if (!enforce) {
                LOGGER.warn("媒体模块存在 {} 项未就绪安全配置：{}。当前 SECRET_ENFORCE=false，仅告警不阻断。",
                    invalidKeys.size(),
                    summary);
                LOGGER.debug("MEDIA_INVALID_SECRET_KEYS {}", invalidKeys);
                return;
            }
            throw new IllegalStateException(
                "Startup blocked by " + invalidKeys.size() + " invalid media secret configs: " + summary
                    + ". Please set secure values."
            );
        }
    }

    List<String> collectInvalidKeys() {
        List<String> invalidKeys = new ArrayList<>();
        if (secretValueValidator.isInvalid(ossProperties.getAccessKeyId())) {
            invalidKeys.add("shizuki.oss.access-key-id");
        }
        if (secretValueValidator.isInvalid(ossProperties.getAccessKeySecret())) {
            invalidKeys.add("shizuki.oss.access-key-secret");
        }
        if (secretValueValidator.isInvalid(spotifyMusicProperties.getClientId())) {
            invalidKeys.add("shizuki.music.spotify.client-id");
        }
        if (secretValueValidator.isInvalid(spotifyMusicProperties.getClientSecret())) {
            invalidKeys.add("shizuki.music.spotify.client-secret");
        }
        return new ArrayList<>(new LinkedHashSet<>(invalidKeys));
    }

    static String summarizeInvalidKeys(List<String> invalidKeys) {
        if (invalidKeys == null || invalidKeys.isEmpty()) {
            return "";
        }
        boolean missingOssCredentials = invalidKeys.contains("shizuki.oss.access-key-id")
            && invalidKeys.contains("shizuki.oss.access-key-secret");
        boolean missingSpotifyCredentials = invalidKeys.contains("shizuki.music.spotify.client-id")
            && invalidKeys.contains("shizuki.music.spotify.client-secret");

        List<String> sections = new ArrayList<>();
        if (missingOssCredentials) {
            sections.add("OSS access credentials (shizuki.oss.access-key-id/access-key-secret)");
        }
        if (missingSpotifyCredentials) {
            sections.add("Spotify music credentials (shizuki.music.spotify.client-id/client-secret)");
        }
        for (String key : invalidKeys) {
            if (missingOssCredentials
                && ("shizuki.oss.access-key-id".equals(key) || "shizuki.oss.access-key-secret".equals(key))) {
                continue;
            }
            if (missingSpotifyCredentials
                && ("shizuki.music.spotify.client-id".equals(key) || "shizuki.music.spotify.client-secret".equals(key))) {
                continue;
            }
            sections.add(key);
        }
        return String.join("; ", sections);
    }
}
