package io.github.shizuki.site.life.model;

import java.util.Locale;

final class LifeContractEnumParser {

    private LifeContractEnumParser() {
    }

    static <E extends Enum<E>> E parse(Class<E> enumType, String raw) {
        if (raw == null || raw.isBlank()) {
            throw new IllegalArgumentException(enumType.getSimpleName() + " is required");
        }
        return Enum.valueOf(enumType, raw.trim().toUpperCase(Locale.ROOT));
    }
}
