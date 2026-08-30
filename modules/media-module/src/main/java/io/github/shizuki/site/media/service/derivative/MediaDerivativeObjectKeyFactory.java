package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.util.Locale;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 生成稳定且版本化的内部派生对象键。该键只能在服务端使用，不进入访客响应。
 */
@Component
public class MediaDerivativeObjectKeyFactory {

    private static final String ROOT = "personal-content/derivatives";

    public String create(MediaAssetVariantEntity task) {
        if (task == null || task.getSourceAssetId() == null || task.getSourceAssetId() <= 0) {
            throw new IllegalArgumentException("derivative task requires a positive source asset id");
        }
        ImageVariantTypeEnum variant = parseVariant(task.getVariantCode());
        MediaDerivativeDeliveryScope scope = parseScope(task.getDeliveryScope());
        String processorVersion = normalizeProcessorVersion(task.getProcessorVersion());
        return ROOT
            + "/" + task.getSourceAssetId()
            + "/" + processorVersion
            + "/" + slug(scope.name())
            + "/" + slug(variant.name())
            + extension(variant);
    }

    private ImageVariantTypeEnum parseVariant(String raw) {
        try {
            return ImageVariantTypeEnum.valueOf(raw);
        } catch (RuntimeException exception) {
            throw new IllegalArgumentException("unsupported derivative variant", exception);
        }
    }

    private MediaDerivativeDeliveryScope parseScope(String raw) {
        try {
            return MediaDerivativeDeliveryScope.valueOf(raw);
        } catch (RuntimeException exception) {
            throw new IllegalArgumentException("unsupported derivative delivery scope", exception);
        }
    }

    private String normalizeProcessorVersion(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new IllegalArgumentException("derivative task requires a processor version");
        }
        String normalized = raw.trim();
        if (!normalized.matches("[A-Za-z0-9._-]{1,40}")) {
            throw new IllegalArgumentException("unsupported derivative processor version");
        }
        return normalized;
    }

    private String slug(String value) {
        return value.toLowerCase(Locale.ROOT).replace('_', '-');
    }

    private String extension(ImageVariantTypeEnum variant) {
        return switch (variant) {
            case DISPLAY_AVIF -> ".avif";
            case THUMB_WEBP, DISPLAY_WEBP, FULL_SANITIZED -> ".webp";
        };
    }
}
