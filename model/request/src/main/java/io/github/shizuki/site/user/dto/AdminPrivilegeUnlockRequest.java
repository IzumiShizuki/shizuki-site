package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "管理员二次权限码验证请求")
public class AdminPrivilegeUnlockRequest {

    @NotBlank
    @Schema(description = "管理员权限码", example = "Izumi2486")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
