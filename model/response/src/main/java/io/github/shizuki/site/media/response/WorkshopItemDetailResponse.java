package io.github.shizuki.site.media.response;

public record WorkshopItemDetailResponse(
        String itemId,
        String title,
        String previewUrl,
        String detailUrl,
        boolean hasDirectDownload,
        long fileSizeBytes,
        long timeUpdated,
        String downloadChannel,
        boolean downloadAvailable,
        String channelMessage,
        String resolution
) {
    public WorkshopItemDetailResponse(String itemId, String title, String previewUrl, String detailUrl,
                                     boolean hasDirectDownload, long fileSizeBytes, long timeUpdated,
                                     String downloadChannel, boolean downloadAvailable, String channelMessage) {
        this(itemId, title, previewUrl, detailUrl, hasDirectDownload, fileSizeBytes, timeUpdated,
                downloadChannel, downloadAvailable, channelMessage, "");
    }
}
