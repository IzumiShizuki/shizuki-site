package io.github.shizuki.site.media.response;

public record WorkshopSearchItemResponse(
        String itemId,
        String title,
        String previewUrl,
        String detailUrl,
        String resolution
) {
    public WorkshopSearchItemResponse(String itemId, String title, String previewUrl, String detailUrl) {
        this(itemId, title, previewUrl, detailUrl, "");
    }
}
