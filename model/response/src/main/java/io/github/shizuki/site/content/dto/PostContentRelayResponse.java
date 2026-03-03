package io.github.shizuki.site.content.dto;

public record PostContentRelayResponse(
    String bucket,
    String key,
    String contentType,
    long sizeBytes
) {
}
