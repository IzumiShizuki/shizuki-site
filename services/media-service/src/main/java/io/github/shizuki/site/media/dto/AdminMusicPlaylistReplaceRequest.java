package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 管理员默认歌单替换请求。
 */
@Schema(description = "管理员默认歌单替换请求")
public class AdminMusicPlaylistReplaceRequest {

    @Schema(description = "待覆盖歌单")
    private List<AdminMusicTrackUpsertRequest> tracks;

    public List<AdminMusicTrackUpsertRequest> getTracks() {
        return tracks;
    }

    public void setTracks(List<AdminMusicTrackUpsertRequest> tracks) {
        this.tracks = tracks;
    }
}
