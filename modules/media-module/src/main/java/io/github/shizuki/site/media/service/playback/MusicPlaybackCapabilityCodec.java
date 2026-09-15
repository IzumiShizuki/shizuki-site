package io.github.shizuki.site.media.service.playback;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.config.MusicPlaybackGatewayProperties;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;

/**
 * 加密第三方音频地址，签发仅可用于站内播放流路由的短时 capability。
 */
@Component
public class MusicPlaybackCapabilityCodec {

    private static final byte FORMAT_VERSION = 1;
    private static final int IV_BYTES = 12;
    private static final int GCM_TAG_BITS = 128;
    private static final int MAX_SOURCE_URL_BYTES = 4_096;
    private static final int MAX_TOKEN_LENGTH = 8_192;
    private static final int CLOCK_SKEW_SECONDS = 30;
    private static final byte[] KEY_DOMAIN = "shizuki.music.playback.gateway.v1"
        .getBytes(StandardCharsets.UTF_8);

    private final MusicPlaybackGatewayProperties properties;
    private final SecretKeySpec encryptionKey;
    private final SecureRandom secureRandom = new SecureRandom();

    public MusicPlaybackCapabilityCodec(MediaGatewayProperties mediaGatewayProperties,
                                        MusicPlaybackGatewayProperties properties) {
        this.properties = properties;
        this.encryptionKey = new SecretKeySpec(deriveKey(mediaGatewayProperties.capabilitySecretBytes()), "AES");
    }

    public String issue(String sourceUrl) {
        return issue(sourceUrl, Instant.now());
    }

    String issue(String sourceUrl, Instant now) {
        if (now == null) {
            throw new IllegalArgumentException("music playback capability issue time is required");
        }
        byte[] plainText = encodeClaims(new Claims(
            sourceUrl,
            now.getEpochSecond() + properties.getTokenTtlSeconds()
        ));
        byte[] iv = new byte[IV_BYTES];
        secureRandom.nextBytes(iv);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, encryptionKey, new GCMParameterSpec(GCM_TAG_BITS, iv));
            cipher.updateAAD(KEY_DOMAIN);
            byte[] cipherText = cipher.doFinal(plainText);
            byte[] token = new byte[iv.length + cipherText.length];
            System.arraycopy(iv, 0, token, 0, iv.length);
            System.arraycopy(cipherText, 0, token, iv.length, cipherText.length);
            return Base64.getUrlEncoder().withoutPadding().encodeToString(token);
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("music playback capability encryption is unavailable", exception);
        }
    }

    public Optional<Claims> verify(String token) {
        return verify(token, Instant.now());
    }

    Optional<Claims> verify(String token, Instant now) {
        if (token == null || token.isBlank() || token.length() > MAX_TOKEN_LENGTH || now == null) {
            return Optional.empty();
        }
        try {
            byte[] encoded = Base64.getUrlDecoder().decode(token);
            if (!Base64.getUrlEncoder().withoutPadding().encodeToString(encoded).equals(token)
                || encoded.length <= IV_BYTES + 16) {
                return Optional.empty();
            }
            byte[] iv = new byte[IV_BYTES];
            byte[] cipherText = new byte[encoded.length - IV_BYTES];
            System.arraycopy(encoded, 0, iv, 0, iv.length);
            System.arraycopy(encoded, iv.length, cipherText, 0, cipherText.length);

            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, encryptionKey, new GCMParameterSpec(GCM_TAG_BITS, iv));
            cipher.updateAAD(KEY_DOMAIN);
            Claims claims = decodeClaims(cipher.doFinal(cipherText));
            long current = now.getEpochSecond();
            if (claims.expiresAtEpochSecond() <= current
                || claims.expiresAtEpochSecond()
                    > current + properties.getTokenTtlSeconds() + CLOCK_SKEW_SECONDS) {
                return Optional.empty();
            }
            return Optional.of(claims);
        } catch (GeneralSecurityException | RuntimeException | java.io.IOException exception) {
            return Optional.empty();
        }
    }

    private byte[] encodeClaims(Claims claims) {
        validateClaims(claims);
        byte[] sourceUrl = claims.sourceUrl().getBytes(StandardCharsets.UTF_8);
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream(sourceUrl.length + 16);
            try (DataOutputStream output = new DataOutputStream(bytes)) {
                output.writeByte(FORMAT_VERSION);
                output.writeLong(claims.expiresAtEpochSecond());
                output.writeInt(sourceUrl.length);
                output.write(sourceUrl);
            }
            return bytes.toByteArray();
        } catch (java.io.IOException exception) {
            throw new IllegalStateException("cannot encode music playback capability", exception);
        }
    }

    private Claims decodeClaims(byte[] plainText) throws java.io.IOException {
        try (DataInputStream input = new DataInputStream(new ByteArrayInputStream(plainText))) {
            if (input.readUnsignedByte() != FORMAT_VERSION) {
                throw new IllegalArgumentException("unsupported music playback capability format");
            }
            long expiresAt = input.readLong();
            int sourceUrlLength = input.readInt();
            if (sourceUrlLength <= 0 || sourceUrlLength > MAX_SOURCE_URL_BYTES) {
                throw new IllegalArgumentException("invalid music playback capability URL length");
            }
            byte[] sourceUrl = input.readNBytes(sourceUrlLength);
            if (sourceUrl.length != sourceUrlLength || input.available() != 0) {
                throw new IllegalArgumentException("truncated music playback capability");
            }
            Claims claims = new Claims(new String(sourceUrl, StandardCharsets.UTF_8), expiresAt);
            validateClaims(claims);
            return claims;
        }
    }

    private void validateClaims(Claims claims) {
        if (claims == null || claims.sourceUrl() == null || claims.sourceUrl().isBlank()
            || claims.sourceUrl().getBytes(StandardCharsets.UTF_8).length > MAX_SOURCE_URL_BYTES
            || claims.expiresAtEpochSecond() <= 0L) {
            throw new IllegalArgumentException("invalid music playback capability claims");
        }
    }

    private byte[] deriveKey(byte[] secret) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(secret);
            digest.update((byte) 0);
            digest.update(KEY_DOMAIN);
            return digest.digest();
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("music playback capability key derivation is unavailable", exception);
        }
    }

    public record Claims(String sourceUrl, long expiresAtEpochSecond) {
    }
}
