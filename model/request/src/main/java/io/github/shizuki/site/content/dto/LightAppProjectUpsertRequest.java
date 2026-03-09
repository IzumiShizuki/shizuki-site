package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "轻应用项目创建/更新请求")
public class LightAppProjectUpsertRequest {

    @NotBlank
    @Size(max = 120)
    @Schema(description = "项目名称", example = "学习规划")
    private String name;

    @Size(max = 1024)
    @Schema(description = "项目描述", example = "整理课程、考试与复盘")
    private String description;

    @Size(max = 32)
    @Schema(description = "项目颜色", example = "#6aa9ff")
    private String color;

    @Schema(description = "是否归档")
    private Boolean archived;

    @Schema(description = "排序值", example = "10")
    private Integer sortNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
