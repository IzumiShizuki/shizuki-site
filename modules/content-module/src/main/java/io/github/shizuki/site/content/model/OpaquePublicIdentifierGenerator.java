package io.github.shizuki.site.content.model;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 为公开相册和动态生成不可枚举的 URL 安全标识。
 *
 * <p>每个标识包含 160 位密码学随机量。数据库唯一约束仍是最终的碰撞保护边界，调用方在极低概率
 * 冲突时应重新生成，而不能回退为顺序主键。
 */
@Component
public class OpaquePublicIdentifierGenerator {

    static final int RANDOM_BYTES = 20;
    private static final int ENCODED_RANDOM_LENGTH = 27;
    private static final Base64.Encoder ENCODER = Base64.getUrlEncoder().withoutPadding();
    private static final Base64.Decoder DECODER = Base64.getUrlDecoder();

    private final SecureRandom secureRandom;

    @Autowired
    public OpaquePublicIdentifierGenerator() {
        this(new SecureRandom());
    }

    OpaquePublicIdentifierGenerator(SecureRandom secureRandom) {
        this.secureRandom = Objects.requireNonNull(secureRandom, "secureRandom");
    }

    /**
     * 生成带类型域的高熵公开标识。
     *
     * @param contentType 内容类型
     * @return 公开标识
     */
    public String generate(PublicContentType contentType) {
        Objects.requireNonNull(contentType, "contentType");
        byte[] randomBytes = new byte[RANDOM_BYTES];
        secureRandom.nextBytes(randomBytes);
        return contentType.identifierPrefix() + "_" + ENCODER.encodeToString(randomBytes);
    }

    /**
     * 校验标识是否属于预期类型并使用规范 URL-safe Base64 表达。
     *
     * @param contentType 预期类型
     * @param publicId 待校验标识
     * @return 是否有效
     */
    public static boolean isValidFor(PublicContentType contentType, String publicId) {
        if (contentType == null || publicId == null) {
            return false;
        }
        String prefix = contentType.identifierPrefix() + "_";
        if (!publicId.startsWith(prefix) || publicId.length() != prefix.length() + ENCODED_RANDOM_LENGTH) {
            return false;
        }
        String encodedRandom = publicId.substring(prefix.length());
        try {
            byte[] decoded = DECODER.decode(encodedRandom);
            return decoded.length == RANDOM_BYTES && ENCODER.encodeToString(decoded).equals(encodedRandom);
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    /**
     * 返回公开标识中的随机熵位数。
     *
     * @return 随机熵位数
     */
    public static int entropyBits() {
        return RANDOM_BYTES * Byte.SIZE;
    }
}
