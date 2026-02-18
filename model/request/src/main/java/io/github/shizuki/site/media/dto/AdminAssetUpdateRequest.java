package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Set;

@Schema(description = "管理员更新资产审核与首页展示状态请求")
public class AdminAssetUpdateRequest {

    /**
     * 目标审核状态（如 APPROVED/REJECTED）。
     */
    @Schema(description = "审核状态", example = "APPROVED")
    private String auditStatus;

    /**
     * 是否启用首页轮换展示。
     */
    @Schema(description = "是否加入首页轮换池", example = "true")
    private Boolean homeEnabled;

    /**
     * 首页展示排序号（越小越靠前）。
     */
    @Schema(description = "首页排序", example = "10")
    private Integer homeSortNum;

    /**
     * 资源可见性（PRIVATE/PUBLIC）。
     */
    @Schema(description = "可见性", example = "PUBLIC")
    private String visibility;

    /**
     * 当可见性为 GROUP 时生效的授权分组编码集合。
     */
    @Schema(description = "分组可见授权列表（visibility=GROUP 时必填）", example = "[\"FAMILY\", \"FRIEND\"]")
    private Set<String> allowedGroupCodes;

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Boolean getHomeEnabled() {
        return homeEnabled;
    }

    public void setHomeEnabled(Boolean homeEnabled) {
        this.homeEnabled = homeEnabled;
    }

    public Integer getHomeSortNum() {
        return homeSortNum;
    }

    public void setHomeSortNum(Integer homeSortNum) {
        this.homeSortNum = homeSortNum;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Set<String> getAllowedGroupCodes() {
        return allowedGroupCodes;
    }

    public void setAllowedGroupCodes(Set<String> allowedGroupCodes) {
        this.allowedGroupCodes = allowedGroupCodes;
    }
}
