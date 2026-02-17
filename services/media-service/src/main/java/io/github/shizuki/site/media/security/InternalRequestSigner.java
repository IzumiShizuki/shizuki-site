package io.github.shizuki.site.media.security;

import io.github.shizuki.site.media.config.InternalAuthProperties;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 内部请求签名器。
 */
@Component
public class InternalRequestSigner {

    private final InternalAuthProperties internalAuthProperties;

    public InternalRequestSigner(InternalAuthProperties internalAuthProperties) {
        this.internalAuthProperties = internalAuthProperties;
    }

    /**
     * 计算内部请求签名。
     */
    public String sign(String method, String path, String query, String timestamp, String nonce) {
        String canonical = canonicalString(method, path, query, timestamp, nonce);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] secret = StringUtils.hasText(internalAuthProperties.getSharedSecret())
                ? internalAuthProperties.getSharedSecret().getBytes(StandardCharsets.UTF_8)
                : new byte[0];
            mac.init(new SecretKeySpec(secret, "HmacSHA256"));
            byte[] digest = mac.doFinal(canonical.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(digest);
        } catch (Exception ex) {
            throw new IllegalStateException("Internal signature generation failed", ex);
        }
    }

    private String canonicalString(String method, String path, String query, String timestamp, String nonce) {
        String normalizedMethod = method == null ? "" : method.trim().toUpperCase();
        String normalizedPath = path == null ? "" : path;
        String normalizedQuery = query == null ? "" : query;
        String normalizedTimestamp = timestamp == null ? "" : timestamp;
        String normalizedNonce = nonce == null ? "" : nonce;
        return normalizedMethod + "\n" + normalizedPath + "\n" + normalizedQuery + "\n" + normalizedTimestamp + "\n" + normalizedNonce;
    }
}
