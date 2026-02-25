package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 用户收藏歌单关系实体。
 */
@TableName("MDA_USER_MUSIC_PLAYLIST_COLLECT")
public class UserMusicPlaylistCollectEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("playlist_code")
    private String playlistCode;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPlaylistCode() {
        return playlistCode;
    }

    public void setPlaylistCode(String playlistCode) {
        this.playlistCode = playlistCode;
    }
}
