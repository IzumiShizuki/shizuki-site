package io.github.shizuki.site.ai.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("AI_QUOTA_USAGE")
public class AiQuotaUsageEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("quota_code")
    private String quotaCode;

    @TableField("total_value")
    private Long totalRounds;

    @TableField("used_value")
    private Long usedRounds;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getQuotaCode() {
        return quotaCode;
    }

    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    public Long getTotalRounds() {
        return totalRounds;
    }

    public void setTotalRounds(Long totalRounds) {
        this.totalRounds = totalRounds;
    }

    public Long getUsedRounds() {
        return usedRounds;
    }

    public void setUsedRounds(Long usedRounds) {
        this.usedRounds = usedRounds;
    }

}
