package io.github.shizuki.common.storage.util;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Set;

public final class UploadValidator {

    private UploadValidator() {
    }

    public static void validate(String fileName, String contentType, long size, long maxSize,
                                Set<String> allowedContentTypes) {
        if (fileName == null || fileName.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "File name is required");
        }
        if (size <= 0 || size > maxSize) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid file size");
        }
        if (contentType == null || !allowedContentTypes.contains(contentType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported content type: " + contentType);
        }
    }
}
