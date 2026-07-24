package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.UserMusicPlaylistTrackEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMusicPlaylistTrackMapper extends BaseMapper<UserMusicPlaylistTrackEntity> {

    /**
     * Source-account synchronization replaces a complete playlist snapshot.  This must be a
     * physical delete: the table's natural key intentionally does not include the logic-delete
     * flag, so a logical delete would leave old rows occupying the key during reinsertion.
     */
    @Delete("DELETE FROM mda_user_music_playlist_track WHERE playlist_code = #{playlistCode}")
    int deleteAllByPlaylistCode(@Param("playlistCode") String playlistCode);
}
