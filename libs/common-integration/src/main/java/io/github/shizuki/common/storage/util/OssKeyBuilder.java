package io.github.shizuki.common.storage.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public final class OssKeyBuilder {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private OssKeyBuilder() {
    }

    public static String build(String module, String ownerType, Long ownerId, String extension) {
        String safeExtension = extension.startsWith(".") ? extension : "." + extension;
        return module + "/" + ownerType + "/" + ownerId + "/" + LocalDate.now().format(FORMATTER)
            + "/" + UUID.randomUUID() + safeExtension;
    }
}
