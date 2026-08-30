package io.github.shizuki.site.media.service.download;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;

/**
 * 原图下载专用 capability。独立签名域防止令牌被误用于展示派生路由。
 */
@Component
public class OriginalDownloadCapabilityCodec {

    private static final String FORMAT = "od1";
    private static final byte[] SIGNING_DOMAIN = "shizuki:original-download:v1\0"
        .getBytes(StandardCharsets.UTF_8);
    private static final int MAX_TOKEN_LENGTH = 2048;
    private static final int CLOCK_SKEW_SECONDS = 30;

    private final MediaGatewayProperties properties;
    private final SecureRandom secureRandom = new SecureRandom();

    public OriginalDownloadCapabilityCodec(MediaGatewayProperties properties) {
        this.properties = properties;
    }

    public IssuedOriginalDownloadCapability issue(String mediaRef,
                                                   String associationType,
                                                   long associationId,
                                                   int contentVersion,
                                                   int associationVersion) {
        long expiresAt = Instant.now().getEpochSecond() + properties.getCapabilityTtlSeconds();
        OriginalDownloadCapabilityClaims claims = new OriginalDownloadCapabilityClaims(
            mediaRef,
            associationType,
            associationId,
            contentVersion,
            associationVersion,
            expiresAt
        );
        validate(claims);
        byte[] nonce = new byte[16];
        secureRandom.nextBytes(nonce);
        String payloadText = String.join("|",
            FORMAT,
            claims.mediaRef(),
            claims.associationType(),
            Long.toString(claims.associationId()),
            Integer.toString(claims.contentVersion()),
            Integer.toString(claims.associationVersion()),
            Long.toString(claims.expiresAtEpochSecond()),
            Base64.getUrlEncoder().withoutPadding().encodeToString(nonce)
        );
        byte[] payload = payloadText.getBytes(StandardCharsets.UTF_8);
        String token = Base64.getUrlEncoder().withoutPadding().encodeToString(payload)
            + "."
            + Base64.getUrlEncoder().withoutPadding().encodeToString(sign(payload));
        return new IssuedOriginalDownloadCapability(token, Instant.ofEpochSecond(expiresAt));
    }

    public Optional<OriginalDownloadCapabilityClaims> verify(String token) {
        return verify(token, Instant.now());
    }

    Optional<OriginalDownloadCapabilityClaims> verify(String token, Instant now) {
        if (token == null || token.isBlank() || token.length() > MAX_TOKEN_LENGTH || now == null) {
            return Optional.empty();
        }
        try {
            String[] tokenParts = token.split("\\.", -1);
            if (tokenParts.length != 2) {
                return Optional.empty();
            }
            byte[] payload = Base64.getUrlDecoder().decode(tokenParts[0]);
            byte[] signature = Base64.getUrlDecoder().decode(tokenParts[1]);
            if (!MessageDigest.isEqual(sign(payload), signature)) {
                return Optional.empty();
            }
            String[] fields = new String(payload, StandardCharsets.UTF_8).split("\\|", -1);
            if (fields.length != 8 || !FORMAT.equals(fields[0])) {
                return Optional.empty();
            }
            OriginalDownloadCapabilityClaims claims = new OriginalDownloadCapabilityClaims(
                fields[1],
                fields[2],
                Long.parseLong(fields[3]),
                Integer.parseInt(fields[4]),
                Integer.parseInt(fields[5]),
                Long.parseLong(fields[6])
            );
            if (Base64.getUrlDecoder().decode(fields[7]).length != 16) {
                return Optional.empty();
            }
            validate(claims);
            long current = now.getEpochSecond();
            if (claims.expiresAtEpochSecond() <= current
                || claims.expiresAtEpochSecond()
                    > current + properties.getCapabilityTtlSeconds() + CLOCK_SKEW_SECONDS) {
                return Optional.empty();
            }
            return Optional.of(claims);
        } catch (RuntimeException exception) {
            return Optional.empty();
        }
    }

    private byte[] sign(byte[] payload) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(properties.capabilitySecretBytes(), "HmacSHA256"));
            mac.update(SIGNING_DOMAIN);
            return mac.doFinal(payload);
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("original download capability signing is unavailable", exception);
        }
    }

    private void validate(OriginalDownloadCapabilityClaims claims) {
        if (claims == null || !OpaqueMediaReference.isValid(claims.mediaRef())
            || !"ALBUM".equals(claims.associationType())
            || claims.associationId() <= 0
            || claims.contentVersion() < 0
            || claims.associationVersion() < 0
            || claims.expiresAtEpochSecond() <= 0) {
            throw new IllegalArgumentException("invalid original download capability claims");
        }
    }
}
