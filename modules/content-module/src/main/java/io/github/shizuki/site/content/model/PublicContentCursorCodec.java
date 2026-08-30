package io.github.shizuki.site.content.model;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 使用 AES-GCM 编解码公开内容的类型化不透明游标。
 *
 * <p>加密同时隐藏内部稳定排序键并认证完整载荷。调用方必须从稳定的服务器密钥构造本类，不能在
 * 每次请求或进程启动时随机生成密钥，否则已签发游标会失效。
 */
public class PublicContentCursorCodec {

    private static final String TOKEN_PREFIX = "pc1.";
    private static final byte PAYLOAD_VERSION = 1;
    private static final int KEY_BYTES = 32;
    private static final int NONCE_BYTES = 12;
    private static final int GCM_TAG_BITS = 128;
    private static final int MAX_TOKEN_LENGTH = 512;
    private static final int MAX_PUBLIC_ID_BYTES = 96;
    private static final int FIXED_PAYLOAD_BYTES = 1 + 1 + Long.BYTES + Integer.BYTES + Long.BYTES + Short.BYTES;
    private static final byte[] ASSOCIATED_DATA = TOKEN_PREFIX.getBytes(StandardCharsets.US_ASCII);
    private static final Base64.Encoder ENCODER = Base64.getUrlEncoder().withoutPadding();
    private static final Base64.Decoder DECODER = Base64.getUrlDecoder();

    private final SecretKeySpec encryptionKey;
    private final SecureRandom secureRandom;

    /**
     * 构造游标编解码器。
     *
     * @param encryptionKey 32 字节服务器密钥
     */
    public PublicContentCursorCodec(byte[] encryptionKey) {
        this(encryptionKey, new SecureRandom());
    }

    PublicContentCursorCodec(byte[] encryptionKey, SecureRandom secureRandom) {
        if (encryptionKey == null || encryptionKey.length != KEY_BYTES) {
            throw new IllegalArgumentException("Public content cursor key must contain exactly 32 bytes");
        }
        this.encryptionKey = new SecretKeySpec(Arrays.copyOf(encryptionKey, encryptionKey.length), "AES");
        this.secureRandom = Objects.requireNonNull(secureRandom, "secureRandom");
    }

    /**
     * 将内部查询边界编码为不透明游标。
     *
     * @param contentType 查询内容类型
     * @param cursorKey 当前页最后一条记录的稳定键
     * @return 可放入 URL 查询参数的游标
     */
    public String encode(PublicContentType contentType, PublicContentCursorKey cursorKey) {
        Objects.requireNonNull(contentType, "contentType");
        Objects.requireNonNull(cursorKey, "cursorKey");
        if (!OpaquePublicIdentifierGenerator.isValidFor(contentType, cursorKey.publicId())) {
            throw invalidCursor();
        }

        byte[] publicIdBytes = cursorKey.publicId().getBytes(StandardCharsets.US_ASCII);
        ByteBuffer payload = ByteBuffer.allocate(FIXED_PAYLOAD_BYTES + publicIdBytes.length);
        payload.put(PAYLOAD_VERSION);
        payload.put((byte) contentType.wireCode());
        payload.putLong(cursorKey.publishedAt().getEpochSecond());
        payload.putInt(cursorKey.publishedAt().getNano());
        payload.putLong(cursorKey.stableSortKey());
        payload.putShort((short) publicIdBytes.length);
        payload.put(publicIdBytes);

        byte[] nonce = new byte[NONCE_BYTES];
        secureRandom.nextBytes(nonce);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, encryptionKey, new GCMParameterSpec(GCM_TAG_BITS, nonce));
            cipher.updateAAD(ASSOCIATED_DATA);
            byte[] encrypted = cipher.doFinal(payload.array());
            ByteBuffer tokenPayload = ByteBuffer.allocate(nonce.length + encrypted.length);
            tokenPayload.put(nonce);
            tokenPayload.put(encrypted);
            return TOKEN_PREFIX + ENCODER.encodeToString(tokenPayload.array());
        } catch (GeneralSecurityException exception) {
            throw new IllegalStateException("Public content cursor encryption is unavailable", exception);
        }
    }

    /**
     * 解码并验证游标属于预期的内容类型。
     *
     * @param expectedType 当前查询类型
     * @param token 游标令牌
     * @return 稳定查询边界
     * @throws BusinessException 令牌格式、认证或类型不正确时抛出 INVALID_CURSOR
     */
    public PublicContentCursorKey decode(PublicContentType expectedType, String token) {
        Objects.requireNonNull(expectedType, "expectedType");
        if (token == null || token.isBlank() || token.length() > MAX_TOKEN_LENGTH || !token.startsWith(TOKEN_PREFIX)) {
            throw invalidCursor();
        }

        try {
            byte[] tokenPayload = DECODER.decode(token.substring(TOKEN_PREFIX.length()));
            if (tokenPayload.length < NONCE_BYTES + 16 + FIXED_PAYLOAD_BYTES) {
                throw invalidCursor();
            }
            byte[] nonce = Arrays.copyOfRange(tokenPayload, 0, NONCE_BYTES);
            byte[] encrypted = Arrays.copyOfRange(tokenPayload, NONCE_BYTES, tokenPayload.length);

            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, encryptionKey, new GCMParameterSpec(GCM_TAG_BITS, nonce));
            cipher.updateAAD(ASSOCIATED_DATA);
            ByteBuffer payload = ByteBuffer.wrap(cipher.doFinal(encrypted));

            if (payload.get() != PAYLOAD_VERSION) {
                throw invalidCursor();
            }
            PublicContentType actualType = PublicContentType.fromWireCode(Byte.toUnsignedInt(payload.get()));
            if (actualType != expectedType) {
                throw invalidCursor();
            }
            long epochSecond = payload.getLong();
            int nano = payload.getInt();
            long stableSortKey = payload.getLong();
            int publicIdLength = Short.toUnsignedInt(payload.getShort());
            if (publicIdLength < 1 || publicIdLength > MAX_PUBLIC_ID_BYTES || payload.remaining() != publicIdLength) {
                throw invalidCursor();
            }
            byte[] publicIdBytes = new byte[publicIdLength];
            payload.get(publicIdBytes);
            String publicId = new String(publicIdBytes, StandardCharsets.US_ASCII);
            if (!OpaquePublicIdentifierGenerator.isValidFor(actualType, publicId)) {
                throw invalidCursor();
            }
            return new PublicContentCursorKey(
                java.time.Instant.ofEpochSecond(epochSecond, nano),
                stableSortKey,
                publicId
            );
        } catch (BusinessException exception) {
            throw exception;
        } catch (GeneralSecurityException | RuntimeException exception) {
            throw invalidCursor();
        }
    }

    private static BusinessException invalidCursor() {
        return new BusinessException(ErrorCode.INVALID_CURSOR);
    }
}
