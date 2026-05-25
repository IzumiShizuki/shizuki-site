package io.github.shizuki.site.admin.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Admin ops container action request")
public class AdminOpsContainerActionRequest {

    @NotBlank
    @Schema(description = "Container action: start | stop | restart", example = "restart")
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
