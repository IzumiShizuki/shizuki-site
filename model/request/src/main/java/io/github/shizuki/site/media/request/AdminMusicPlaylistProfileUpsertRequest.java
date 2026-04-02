package io.github.shizuki.site.media.request;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 管理员默认歌单资料写入请求。
 */
@Schema(description = "管理员默认歌单资料写入请求")
public class AdminMusicPlaylistProfileUpsertRequest {

    @Schema(description = "歌单业务编码，固定 default_public")
    private String playlistCode;

    @Schema(description = "歌单名称")
    private String name;

    @Schema(description = "歌单简介")
    private String description;

    @Schema(description = "歌单封面 URL")
    private String cover;

    public String getPlaylistCode() {
        return playlistCode;
    }

    public void setPlaylistCode(String playlistCode) {
        this.playlistCode = playlistCode;
    }

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
}
