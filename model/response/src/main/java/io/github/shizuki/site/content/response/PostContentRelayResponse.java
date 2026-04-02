package io.github.shizuki.site.content.response;

public record PostContentRelayResponse(
    String bucket,
    String key,
    String contentType,
    long sizeBytes
) {
}
