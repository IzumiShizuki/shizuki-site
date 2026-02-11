package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "退出登录请求")
public class AuthLogoutRequest {

    @Schema(description = "refresh token（可选）")
    private String refreshToken;

    @Schema(description = "是否退出全部设备", example = "false")
    private Boolean logoutAll = Boolean.FALSE;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Boolean getLogoutAll() {
        return logoutAll;
    }

    public void setLogoutAll(Boolean logoutAll) {
        this.logoutAll = logoutAll;
    }
}

