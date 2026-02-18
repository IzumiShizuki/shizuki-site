package io.github.shizuki.site.media.dto;

/**
 * 举报资源响应。
 *
 * @param assetId 被举报资源 ID
 * @param reportId 举报单 ID
 * @param reportStatus 举报单状态
 */
public record AssetReportResponse(Long assetId,
                                  Long reportId,
                                  String reportStatus) {
}
