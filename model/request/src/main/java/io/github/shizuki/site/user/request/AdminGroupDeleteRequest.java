package io.github.shizuki.site.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "管理员删除分组请求")
public class AdminGroupDeleteRequest {

    @NotBlank
    @Schema(description = "管理员权限码（每次删除都必须输入）", example = "Izumi2486")
    private String privilegeCode;

    public String getPrivilegeCode() {
        return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode;
    }
}
