package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

@Schema(description = "管理员更新分组权限请求")
public class GroupPermissionsUpdateRequest {

    @NotNull
    @Schema(description = "权限编码集合（全量覆盖）", example = "[\"quota.policy.read\", \"user.group.write\"]")
    private Set<String> permissions;

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }
}
