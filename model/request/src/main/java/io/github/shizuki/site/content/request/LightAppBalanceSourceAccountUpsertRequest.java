package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "轻应用记账数据源账号配置请求")
public class LightAppBalanceSourceAccountUpsertRequest {

    @Schema(description = "绑定到的本地余额账户ID", example = "1")
    private Long targetAccountId;

    @Schema(description = "是否启用夜间自动抓取", example = "true")
    private Boolean nightlyEnabled;

    public Long getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public Boolean getNightlyEnabled() {
        return nightlyEnabled;
    }

    public void setNightlyEnabled(Boolean nightlyEnabled) {
        this.nightlyEnabled = nightlyEnabled;
    }
}
