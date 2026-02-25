package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 默认音乐歌单资料实体。
 */
@TableName("MDA_MUSIC_PLAYLIST_PROFILE")
public class MusicPlaylistProfileEntity extends BaseEntity {

    @TableField("playlist_code")
    private String playlistCode;

    @TableField("name_text")
    private String name;

    @TableField("description_text")
    private String description;

    @TableField("cover_url")
    private String coverUrl;

    @TableField("metadata_json")
    private String metadataJson;

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

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }
}
