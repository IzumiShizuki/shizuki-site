package io.github.shizuki.site.monolith.auth;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Issues short, server-signed identities for authors who choose not to create an account.
 *
 * <p>The token is a bearer credential for one browser profile. It deliberately represents a
 * negative user id so it cannot be confused with a real account id.
 */
@Component
public class GuestAuthorTokenService {

    private static final String VERSION = "v1";
    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final SecureRandom RANDOM = new SecureRandom();

    private final byte[] signingSecret;
    private final long ttlSeconds;

    public GuestAuthorTokenService(
        @Value("${shizuki.guest-author.signing-secret}") String signingSecret,
        @Value("${shizuki.guest-author.ttl-seconds:2592000}") long ttlSeconds
    ) {
        if (!StringUtils.hasText(signingSecret)) {
            throw new IllegalStateException("Guest author signing secret must be configured");
        }
        this.signingSecret = signingSecret.getBytes(StandardCharsets.UTF_8);
        this.ttlSeconds = Math.max(300L, ttlSeconds);
    }

    public GuestAuthorSession issue() {
        long authorId = nextAnonymousAuthorId();
        long expiresAtEpochSecond = Instant.now().getEpochSecond() + ttlSeconds;
        String payload = String.join(".", VERSION, Long.toString(authorId), Long.toString(expiresAtEpochSecond));
        String token = payload + "." + sign(payload);
        return new GuestAuthorSession(authorId, token, expiresAtEpochSecond);
    }

    public GuestAuthorSession verify(String token) {
        if (!StringUtils.hasText(token)) {
            return null;
        }
        String[] parts = token.trim().split("\\.");
        if (parts.length != 4 || !VERSION.equals(parts[0])) {
            return null;
        }

        long authorId;
        long expiresAtEpochSecond;
        try {
            authorId = Long.parseLong(parts[1]);
            expiresAtEpochSecond = Long.parseLong(parts[2]);
        } catch (NumberFormatException exception) {
            return null;
        }
        if (authorId >= 0 || expiresAtEpochSecond <= Instant.now().getEpochSecond()) {
            return null;
        }

        String payload = String.join(".", parts[0], parts[1], parts[2]);
        byte[] expected = sign(payload).getBytes(StandardCharsets.US_ASCII);
        byte[] actual = parts[3].getBytes(StandardCharsets.US_ASCII);
        if (!MessageDigest.isEqual(expected, actual)) {
            return null;
        }
        return new GuestAuthorSession(authorId, token.trim(), expiresAtEpochSecond);
    }

    private long nextAnonymousAuthorId() {
        long value = RANDOM.nextLong() & Long.MAX_VALUE;
        return -(value == 0L ? 1L : value);
    }

    private String sign(String payload) {
        try {
            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            mac.init(new SecretKeySpec(signingSecret, HMAC_ALGORITHM));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(mac.doFinal(payload.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException exception) {
            throw new IllegalStateException("Guest author token signer unavailable", exception);
        }
    }

    public record GuestAuthorSession(long authorId, String token, long expiresAtEpochSecond) {
    }
}
