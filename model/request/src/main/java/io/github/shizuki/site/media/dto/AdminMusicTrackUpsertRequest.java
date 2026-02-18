package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

/**
 * 管理员歌单曲目写入请求。
 */
@Schema(description = "管理员歌单曲目写入请求")
public class AdminMusicTrackUpsertRequest {

    @Schema(description = "曲目 ID")
    private String trackId;

    @Schema(description = "Provider 编码")
    private String provider;

    @Schema(description = "标题")
    private String title;

    @Schema(description = "歌手")
    private String artist;

    @Schema(description = "封面 URL")
    private String cover;

    @Schema(description = "音频 URL")
    private String audio;

    @Schema(description = "歌词 URL")
    private String lyric;

    @Schema(description = "排序值")
    private Integer sort;

    @Schema(description = "是否启用")
    private Boolean enabled;

    @Schema(description = "扩展元数据")
    private Map<String, Object> metadata;

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
