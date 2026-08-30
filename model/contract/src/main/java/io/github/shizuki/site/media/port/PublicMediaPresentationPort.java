package io.github.shizuki.site.media.port;

import io.github.shizuki.site.media.response.ProtectedMediaPresentationResponse;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import java.util.Optional;

/**
 * Cross-module port for resolving association-scoped visitor media without exposing storage
 * identity. Content services consume this contract while the media module owns authorization.
 */
public interface PublicMediaPresentationPort {

    Optional<PublicMediaPresentationResponse> resolvePublicPresentation(String mediaRef);

    Optional<ProtectedMediaPresentationResponse> resolveUnlistedPresentation(String mediaRef);
}
