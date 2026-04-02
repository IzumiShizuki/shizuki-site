package io.github.shizuki.site.content.response;

public record PostPresentationDownloadResponse(
    String downloadUrl,
    String fileName
) {
}
