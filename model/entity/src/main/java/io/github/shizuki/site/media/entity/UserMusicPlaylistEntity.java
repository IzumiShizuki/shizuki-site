package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 用户音乐歌单实体。
 */
@TableName("MDA_USER_MUSIC_PLAYLIST")
public class UserMusicPlaylistEntity extends BaseEntity {

    @TableField("playlist_code")
    private String playlistCode;

    @TableField("user_id")
    private Long userId;

    @TableField("playlist_type")
    private String playlistType;

    @TableField("name_text")
    private String name;

    @TableField("description_text")
    private String description;

    @TableField("cover_url")
    private String coverUrl;

    @TableField("public_flag")
    private Boolean publicFlag;

    @TableField("system_reserved_flag")
    private Boolean systemReservedFlag;

    @TableField("sort_num")
    private Integer sortNum;

    @TableField("metadata_json")
    private String metadataJson;

    public String getPlaylistCode() {
        return playlistCode;
    }

    public void setPlaylistCode(String playlistCode) {
        this.playlistCode = playlistCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPlaylistType() {
        return playlistType;
    }

    public void setPlaylistType(String playlistType) {
        this.playlistType = playlistType;
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

    public Boolean getPublicFlag() {
        return publicFlag;
    }

    public void setPublicFlag(Boolean publicFlag) {
        this.publicFlag = publicFlag;
    }

    public Boolean getSystemReservedFlag() {
        return systemReservedFlag;
    }

    public void setSystemReservedFlag(Boolean systemReservedFlag) {
        this.systemReservedFlag = systemReservedFlag;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }
}
