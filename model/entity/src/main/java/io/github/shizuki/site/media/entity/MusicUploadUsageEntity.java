package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 用户音乐上传容量累计实体。
 */
@TableName("MDA_MUSIC_UPLOAD_USAGE")
public class MusicUploadUsageEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("used_bytes")
    private Long usedBytes;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }
}
