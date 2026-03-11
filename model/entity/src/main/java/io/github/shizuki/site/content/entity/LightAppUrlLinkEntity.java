package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_LA_URL_LINK")
public class LightAppUrlLinkEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("url_text")
    private String url;

    @TableField("icon_mode_code")
    private String iconMode;

    @TableField("icon_asset_id")
    private Long iconAssetId;

    @TableField("favicon_url")
    private String faviconUrl;

    @TableField("sort_num")
    private Integer sortNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconMode() {
        return iconMode;
    }

    public void setIconMode(String iconMode) {
        this.iconMode = iconMode;
    }

    public Long getIconAssetId() {
        return iconAssetId;
    }

    public void setIconAssetId(Long iconAssetId) {
        this.iconAssetId = iconAssetId;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
