package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "轻应用网址元信息解析请求")
public class LightAppUrlLinkResolveRequest {

    @NotBlank
    @Size(max = 2048)
    @Schema(description = "URL")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
