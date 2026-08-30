package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.model.PublicContentType;
import java.util.Objects;

/** One exact public Album or Moment identifier affected by a content/media mutation. */
public record PublicContentCacheTarget(PublicContentType type, String opaqueIdentifier) {

    public PublicContentCacheTarget {
        Objects.requireNonNull(type, "type");
        opaqueIdentifier = PublicContentCacheKeys.requireOpaqueIdentifier(opaqueIdentifier);
    }
}
