package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 站点级登录页外观配置（主题预设 + 二次元背景/看板娘图片）。
 *
 * <p>单例行由管理员维护，公开接口只读，供登录页对所有访客生效。
 */
@TableName("CTN_LOGIN_APPEARANCE")
public class LoginAppearanceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "singleton_key", type = IdType.INPUT)
    private String singletonKey;

    @TableField("theme_preset")
    private String themePreset;

    @TableField("bg_image_url")
    private String bgImageUrl;

    @TableField("mascot_image_url")
    private String mascotImageUrl;

    @TableField("create_time")
    private LocalDateTime createdAt;

    @TableField("update_time")
    private LocalDateTime updatedAt;

    @TableField("deleted_flag")
    private Integer deleted;

    @TableField("version_num")
    private Integer version;

    public String getSingletonKey() {
        return singletonKey;
    }

    public void setSingletonKey(String singletonKey) {
        this.singletonKey = singletonKey;
    }

    public String getThemePreset() {
        return themePreset;
    }

    public void setThemePreset(String themePreset) {
        this.themePreset = themePreset;
    }

    public String getBgImageUrl() {
        return bgImageUrl;
    }

    public void setBgImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

    public String getMascotImageUrl() {
        return mascotImageUrl;
    }

    public void setMascotImageUrl(String mascotImageUrl) {
        this.mascotImageUrl = mascotImageUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
