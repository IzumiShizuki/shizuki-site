package io.github.shizuki.site.monolith.meguri;

/**
 * Snapshot returned by {@code GET /api/v1/meguri/bootstrap} so the website
 * client can render gateway state before the first turn.
 */
public record MeguriBootstrapResponse(
        boolean enabled,
        boolean coreOnline,
        String buildId,
        int ragChunks,
        String defaultSprite,
        boolean spriteAvailable) {
}
