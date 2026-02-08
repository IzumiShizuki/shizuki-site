package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "OAuth code 交换 token 请求")
public class OAuthTokenExchangeRequest {

    @NotBlank
    @Schema(description = "GitHub 回调返回的授权码")
    private String code;

    @NotBlank
    @Schema(description = "与创建登录时一致的 state 值")
    private String state;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
