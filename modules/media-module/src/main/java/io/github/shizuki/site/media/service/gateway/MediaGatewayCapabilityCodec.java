package io.github.shizuki.site.media.service.gateway;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
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
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;

/**
 * 站内媒体短时 capability 编解码器。令牌只认证站内关联事实，不包含存储定位信息。
 */
@Component
public class MediaGatewayCapabilityCodec {

    private static final byte FORMAT_VERSION = 1;
    private static final int NONCE_BYTES = 16;
    private static final int SIGNATURE_BYTES = 32;
    private static final int MAX_TOKEN_LENGTH = 2048;
    private static final int CLOCK_SKEW_SECONDS = 30;

    private final MediaGatewayProperties properties;
    private final SecureRandom secureRandom = new SecureRandom();

    public MediaGatewayCapabilityCodec(MediaGatewayProperties properties) {
        this.properties = properties;
    }

    public String issue(String mediaRef,
                        String associationType,
                        long associationId,
                        ImageVariantTypeEnum variant,
                        MediaGatewayActorScope actorScope,
                        long actorId,
                        int contentVersion,
                        int associationVersion) {
        long expiresAt = Instant.now().getEpochSecond() + properties.getCapabilityTtlSeconds();
        return issue(new MediaGatewayCapabilityClaims(
            mediaRef,
            associationType,
            associationId,
            variant,
            actorScope,
            actorId,
            contentVersion,
            associationVersion,
            expiresAt
        ));
    }

    String issue(MediaGatewayCapabilityClaims claims) {
        validateClaims(claims);
        byte[] nonce = new byte[NONCE_BYTES];
        secureRandom.nextBytes(nonce);
        byte[] payload = encodePayload(claims, nonce);
        byte[] signature = sign(payload);
        byte[] token = new byte[payload.length + signature.length];
        System.arraycopy(payload, 0, token, 0, payload.length);
        System.arraycopy(signature, 0, token, payload.length, signature.length);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(token);
    }

    public Optional<MediaGatewayCapabilityClaims> verify(String token) {
        return verify(token, Instant.now());
    }

    Optional<MediaGatewayCapabilityClaims> verify(String token, Instant now) {
        if (token == null || token.isBlank() || token.length() > MAX_TOKEN_LENGTH || now == null) {
            return Optional.empty();
        }
        try {
            byte[] bytes = Base64.getUrlDecoder().decode(token);
            String canonicalToken = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
            if (!canonicalToken.equals(token)) {
                return Optional.empty();
            }
            if (bytes.length <= SIGNATURE_BYTES) {
                return Optional.empty();
            }
            int payloadLength = bytes.length - SIGNATURE_BYTES;
            byte[] payload = new byte[payloadLength];
            byte[] actualSignature = new byte[SIGNATURE_BYTES];
            System.arraycopy(bytes, 0, payload, 0, payloadLength);
            System.arraycopy(bytes, payloadLength, actualSignature, 0, SIGNATURE_BYTES);
            if (!MessageDigest.isEqual(sign(payload), actualSignature)) {
                return Optional.empty();
            }
            MediaGatewayCapabilityClaims claims = decodePayload(payload);
            validateClaims(claims);
            if (claims.expiresAtEpochSecond() <= now.getEpochSecond()
                || claims.expiresAtEpochSecond()
                    > now.getEpochSecond() + properties.getCapabilityTtlSeconds() + CLOCK_SKEW_SECONDS) {
                return Optional.empty();
            }
            return Optional.of(claims);
        } catch (RuntimeException | java.io.IOException exception) {
            return Optional.empty();
        }
    }

    private byte[] encodePayload(MediaGatewayCapabilityClaims claims, byte[] nonce) {
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream(160);
            try (DataOutputStream output = new DataOutputStream(bytes)) {
                output.writeByte(FORMAT_VERSION);
                writeBoundedString(output, claims.mediaRef());
                writeBoundedString(output, claims.associationType());
                output.writeLong(claims.associationId());
                output.writeByte(claims.variant().ordinal());
                output.writeByte(claims.actorScope().ordinal());
                output.writeLong(claims.actorId());
                output.writeInt(claims.contentVersion());
                output.writeInt(claims.associationVersion());
                output.writeLong(claims.expiresAtEpochSecond());
                output.write(nonce);
            }
            return bytes.toByteArray();
        } catch (java.io.IOException exception) {
            throw new IllegalStateException("cannot encode media capability", exception);
        }
    }

    private MediaGatewayCapabilityClaims decodePayload(byte[] payload) throws java.io.IOException {
        try (DataInputStream input = new DataInputStream(new ByteArrayInputStream(payload))) {
            if (input.readUnsignedByte() != FORMAT_VERSION) {
                throw new IllegalArgumentException("unsupported capability format");
            }
            String mediaRef = readBoundedString(input);
            String associationType = readBoundedString(input);
            long associationId = input.readLong();
            ImageVariantTypeEnum variant = enumAt(ImageVariantTypeEnum.values(), input.readUnsignedByte());
            MediaGatewayActorScope actorScope = enumAt(MediaGatewayActorScope.values(), input.readUnsignedByte());
            long actorId = input.readLong();
            int contentVersion = input.readInt();
            int associationVersion = input.readInt();
            long expiresAt = input.readLong();
            byte[] nonce = input.readNBytes(NONCE_BYTES);
            if (nonce.length != NONCE_BYTES || input.available() != 0) {
                throw new IllegalArgumentException("invalid capability payload length");
            }
            return new MediaGatewayCapabilityClaims(
                mediaRef,
                associationType,
                associationId,
                variant,
                actorScope,
                actorId,
                contentVersion,
                associationVersion,
                expiresAt
            );
        }
    }

    private byte[] sign(byte[] payload) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(properties.capabilitySecretBytes(), "HmacSHA256"));
            return mac.doFinal(payload);
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("media capability signing is unavailable", exception);
        }
    }

    private void writeBoundedString(DataOutputStream output, String value) throws java.io.IOException {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        if (bytes.length == 0 || bytes.length > 255) {
            throw new IllegalArgumentException("capability string is outside its supported length");
        }
        output.writeByte(bytes.length);
        output.write(bytes);
    }

    private String readBoundedString(DataInputStream input) throws java.io.IOException {
        int length = input.readUnsignedByte();
        if (length == 0) {
            throw new IllegalArgumentException("empty capability string");
        }
        byte[] bytes = input.readNBytes(length);
        if (bytes.length != length) {
            throw new IllegalArgumentException("truncated capability string");
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    private <T> T enumAt(T[] values, int ordinal) {
        if (ordinal < 0 || ordinal >= values.length) {
            throw new IllegalArgumentException("unsupported capability enum value");
        }
        return values[ordinal];
    }

    private void validateClaims(MediaGatewayCapabilityClaims claims) {
        if (claims == null || !OpaqueMediaReference.isValid(claims.mediaRef())
            || !("ALBUM".equals(claims.associationType()) || "MOMENT".equals(claims.associationType()))
            || claims.associationId() <= 0 || claims.variant() == null || claims.actorScope() == null
            || claims.contentVersion() < 0 || claims.associationVersion() < 0
            || claims.expiresAtEpochSecond() <= 0
            || (claims.actorScope() == MediaGatewayActorScope.ADMIN_PREVIEW && claims.actorId() <= 0)
            || (claims.actorScope() == MediaGatewayActorScope.UNLISTED_LINK && claims.actorId() != 0)) {
            throw new IllegalArgumentException("invalid media capability claims");
        }
    }
}
