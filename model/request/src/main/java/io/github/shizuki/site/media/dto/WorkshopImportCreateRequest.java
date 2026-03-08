package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "创建 Workshop 导入任务请求")
public class WorkshopImportCreateRequest {

    @NotBlank
    @Schema(description = "Workshop 页面链接", example = "https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896")
    private String workshopUrl;

    @Schema(description = "导入后可见性，默认 PRIVATE", example = "PRIVATE")
    private String visibility;

    @Schema(description = "可选标题覆盖")
    private String title;

    public String getWorkshopUrl() {
        return workshopUrl;
    }

    public void setWorkshopUrl(String workshopUrl) {
        this.workshopUrl = workshopUrl;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
