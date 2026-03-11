package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "轻应用自定义网址创建/更新请求")
public class LightAppUrlLinkUpsertRequest {

    @NotBlank
    @Size(max = 160)
    @Schema(description = "标题")
    private String title;

    @NotBlank
    @Size(max = 2048)
    @Schema(description = "URL")
    private String url;

    @Size(max = 16)
    @Schema(description = "图标模式 AUTO/UPLOAD")
    private String iconMode;

    @Schema(description = "上传图标资产ID")
    private Long iconAssetId;

    @Size(max = 2048)
    @Schema(description = "favicon URL")
    private String faviconUrl;

    @Schema(description = "排序值")
    private Integer sortNum;

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
