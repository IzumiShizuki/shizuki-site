package io.github.shizuki.site.user.service.security;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.MusicSecurityProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 音乐 provider API Key 加解密服务。
 *
 * <p>算法固定为 AES-256-GCM，密钥来源于配置中心/环境变量；密文采用 Base64 编码用于数据库持久化。
 */
@Component
public class MusicApiKeyCryptoService {

    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final int GCM_IV_BYTES = 12;
    private final SecureRandom secureRandom = new SecureRandom();
    private final SecretKeySpec secretKeySpec;

    /**
     * 初始化并校验主密钥配置。
     */
    public MusicApiKeyCryptoService(MusicSecurityProperties musicSecurityProperties) {
        byte[] key = parseKey(musicSecurityProperties.getKeyEncryptionMasterKey());
        this.secretKeySpec = new SecretKeySpec(key, "AES");
    }

    /**
     * 加密明文 API Key，返回可存储的 Base64 密文。
     */
    public String encrypt(String plainText) {
        if (!StringUtils.hasText(plainText)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "API key is required");
        }
        byte[] iv = new byte[GCM_IV_BYTES];
        secureRandom.nextBytes(iv);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
            byte[] encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            ByteBuffer payload = ByteBuffer.allocate(4 + iv.length + encrypted.length);
            payload.putInt(iv.length);
            payload.put(iv);
            payload.put(encrypted);
            return Base64.getEncoder().encodeToString(payload.array());
        } catch (GeneralSecurityException ex) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "API key encryption failed");
        }
    }

    /**
     * 解密数据库中的密文，返回明文 API Key。
     */
    public String decrypt(String cipherText) {
        if (!StringUtils.hasText(cipherText)) {
            return "";
        }
        try {
            byte[] payload = Base64.getDecoder().decode(cipherText);
            ByteBuffer buffer = ByteBuffer.wrap(payload);
            int ivLength = buffer.getInt();
            if (ivLength <= 0 || ivLength > 32 || buffer.remaining() <= ivLength) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid encrypted API key");
            }
            byte[] iv = new byte[ivLength];
            buffer.get(iv);
            byte[] encrypted = new byte[buffer.remaining()];
            buffer.get(encrypted);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
            return new String(cipher.doFinal(encrypted), StandardCharsets.UTF_8);
        } catch (GeneralSecurityException | IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid encrypted API key");
        }
    }

    /**
     * 解析并校验 Base64 主密钥。
     */
    private byte[] parseKey(String base64Key) {
        if (!StringUtils.hasText(base64Key)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Music API key encryption key is required");
        }
        byte[] key;
        try {
            key = Base64.getDecoder().decode(base64Key.trim());
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Music API key encryption key is not valid base64");
        }
        if (key.length != 32) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Music API key encryption key must be 32 bytes");
        }
        return key;
    }
}
