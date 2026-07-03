package io.github.shizuki.site.content.support;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
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

@Component
public class LightAppBalanceBillSyncCryptoService {

    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final int GCM_IV_BYTES = 12;

    private final SecureRandom secureRandom = new SecureRandom();
    private final LightAppBalanceBillSyncProperties properties;

    public LightAppBalanceBillSyncCryptoService(LightAppBalanceBillSyncProperties properties) {
        this.properties = properties;
    }

    public String encrypt(String plainText) {
        if (!StringUtils.hasText(plainText)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "storage state is required");
        }
        byte[] key = parseKey();
        byte[] iv = new byte[GCM_IV_BYTES];
        secureRandom.nextBytes(iv);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
            byte[] encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            ByteBuffer payload = ByteBuffer.allocate(4 + iv.length + encrypted.length);
            payload.putInt(iv.length);
            payload.put(iv);
            payload.put(encrypted);
            return Base64.getEncoder().encodeToString(payload.array());
        } catch (GeneralSecurityException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Bill sync storage state encryption failed");
        }
    }

    public String decrypt(String cipherText) {
        if (!StringUtils.hasText(cipherText)) {
            return "";
        }
        byte[] key = parseKey();
        try {
            byte[] payload = Base64.getDecoder().decode(cipherText);
            ByteBuffer buffer = ByteBuffer.wrap(payload);
            int ivLength = buffer.getInt();
            if (ivLength <= 0 || ivLength > 32 || buffer.remaining() <= ivLength) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid bill sync storage state");
            }
            byte[] iv = new byte[ivLength];
            buffer.get(iv);
            byte[] encrypted = new byte[buffer.remaining()];
            buffer.get(encrypted);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
            return new String(cipher.doFinal(encrypted), StandardCharsets.UTF_8);
        } catch (GeneralSecurityException | IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid bill sync storage state");
        }
    }

    private byte[] parseKey() {
        String base64Key = properties.getStorageStateEncryptionKey();
        if (!StringUtils.hasText(base64Key)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Bill sync storage state encryption key is required");
        }
        byte[] key;
        try {
            key = Base64.getDecoder().decode(base64Key.trim());
        } catch (IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Bill sync storage state encryption key is not valid base64");
        }
        if (key.length != 32) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Bill sync storage state encryption key must be 32 bytes");
        }
        return key;
    }
}
