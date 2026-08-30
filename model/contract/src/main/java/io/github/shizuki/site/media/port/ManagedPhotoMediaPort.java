package io.github.shizuki.site.media.port;

/**
 * Cross-module boundary used when an administrator promotes a private upload into the managed
 * personal photo library. The media module remains responsible for asset ownership/privacy
 * validation and derivative scheduling.
 */
public interface ManagedPhotoMediaPort {

    void requireOwnedPrivateImage(long assetId, long actorUserId);

    void enqueuePrivateWorkingDerivatives(long assetId);

    void enqueuePublicMaterializedDerivatives(long assetId);
}
