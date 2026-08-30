package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.model.PublicContentType;
import java.util.Collection;

/** Transaction-aware, targeted invalidation for public Album and Moment presentations. */
public interface PublicContentCacheInvalidator {

    void invalidateListsAfterCommit(PublicContentType type);

    void invalidateDetailAfterCommit(PublicContentType type, String opaqueIdentifier);

    void invalidateContentAfterCommit(PublicContentType type, String opaqueIdentifier);

    void invalidateContentsAfterCommit(Collection<PublicContentCacheTarget> targets);
}
