package io.github.shizuki.site.media.request;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐播放按需解析请求。
 */
@Schema(description = "音乐播放按需解析请求")
public class MusicResolvePlaybackRequest {

    @Schema(description = "Provider 编码（netease/kuwo/qq 等）", example = "netease")
    private String provider;

    @Schema(description = "曲目 ID", example = "123456")
    private String trackId;

    @Schema(description = "曲目标题（可选）", example = "晴天")
    private String title;

    @Schema(description = "歌手（可选）", example = "周杰伦")
    private String artist;

    @Schema(description = "封面 URL（可选）", example = "https://example.com/cover.jpg")
    private String cover;

    @Schema(description = "来源歌单编码（可选）", example = "vh_tunehub_netease_toplist_3778678")
    private String playlistCode;

    @Schema(description = "是否仅补拉歌词（可选）", example = "true")
    private Boolean resolveLyric;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPlaylistCode() {
        return playlistCode;
    }

    public void setPlaylistCode(String playlistCode) {
        this.playlistCode = playlistCode;
    }

    public Boolean getResolveLyric() {
        return resolveLyric;
    }

    public void setResolveLyric(Boolean resolveLyric) {
        this.resolveLyric = resolveLyric;
    }
}
