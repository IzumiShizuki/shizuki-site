package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

@Schema(description = "内容可见性更新请求")
public class ContentVisibilityUpdateRequest {

    @NotBlank
    @Schema(description = "可见性：PUBLIC|PRIVATE|GROUP", example = "GROUP")
    private String visibility;

    @Schema(description = "分组可见授权列表（visibility=GROUP 时必填）", example = "[\"FAMILY\", \"FRIEND\"]")
    private Set<String> allowedGroupCodes;

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
