package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

@Schema(description = "管理员更新用户分组请求")
public class UserGroupsUpdateRequest {

    @NotNull
    @Schema(description = "用户分组编码集合（全量覆盖）", example = "[\"USER\", \"FAMILY\"]")
    private Set<String> groups;

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }
}
