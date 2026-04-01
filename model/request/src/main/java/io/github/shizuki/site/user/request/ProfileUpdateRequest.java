package io.github.shizuki.site.user.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "更新个人资料请求")
public class ProfileUpdateRequest {

    @Schema(description = "昵称", example = "Izumi")
    private String nickname;

    @Schema(description = "头像 URL", example = "https://cdn.example.com/avatar/user-1.png")
    private String avatarUrl;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
