package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 音乐选歌次数累计实体。
 */
@TableName("MDA_MUSIC_PICK_USAGE")
public class MusicPickUsageEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("quota_code")
    private String quotaCode;

    @TableField("used_count")
    private Long usedCount;

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

    public Long getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
    }
}
