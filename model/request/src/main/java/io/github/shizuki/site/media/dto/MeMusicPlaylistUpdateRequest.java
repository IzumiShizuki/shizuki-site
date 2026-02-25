package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 更新我的歌单请求。
 */
@Schema(description = "更新我的歌单请求")
public class MeMusicPlaylistUpdateRequest {

    @Schema(description = "歌单名称")
    private String name;

    @Schema(description = "歌单简介")
    private String description;

    @Schema(description = "歌单封面 URL")
    private String cover;

    @Schema(description = "是否公开")
    private Boolean isPublic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean aPublic) {
        isPublic = aPublic;
    }
}
