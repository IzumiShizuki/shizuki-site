package io.github.shizuki.site.content.port;

/**
 * Cross-module hook for media state changes that can alter a public Album or Moment projection.
 * Implementations must invalidate only content associated with the supplied internal identity.
 */
public interface PublicContentCacheInvalidationPort {

    void invalidateByPhotoId(long photoId);

    void invalidateBySourceAssetId(long sourceAssetId);
}
