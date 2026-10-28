package io.github.shizuki.site.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "注销当前账号请求")
public record AccountClosureRequest(
    @NotBlank @Pattern(regexp = "注销账号", message = "请输入“注销账号”确认")
    @Schema(description = "输入注销账号以确认不可恢复的注销操作") String confirmation
) {
}
