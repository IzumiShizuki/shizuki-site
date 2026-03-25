package io.github.shizuki.site.content.dto;

public record PostPresentationDownloadResponse(
    String downloadUrl,
    String fileName
) {
}
