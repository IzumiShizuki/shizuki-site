<?php

declare(strict_types=1);

/**
 * Browser playback originates from an HTTPS page, so an HTTP media URL is
 * unusable even when the upstream host still serves it. Music providers used
 * by this sidecar expose the same media resource over HTTPS; upgrade only the
 * scheme and preserve the host, path, query, and fragment byte-for-byte.
 */
function normalizePlaybackUrl(string $url): string
{
    $normalized = trim($url);
    if ($normalized === '') {
        return '';
    }
    if (str_starts_with($normalized, '//')) {
        return 'https:' . $normalized;
    }
    if (strncasecmp($normalized, 'http://', 7) === 0) {
        return 'https://' . substr($normalized, 7);
    }
    return $normalized;
}
