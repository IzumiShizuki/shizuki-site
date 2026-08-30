package io.github.shizuki.site.media.request;

import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * 更新相册照片关联级下载策略。原图模式必须携带明确的隐私确认。
 */
public record PhotoDownloadPolicyUpdateRequest(
    @NotNull PhotoDownloadModeEnum mode,
    @Min(0) int expectedVersion,
    boolean originalPrivacyAcknowledged
) {
}
