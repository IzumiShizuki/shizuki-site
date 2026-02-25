package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 管理员默认歌单聚合替换请求。
 */
@Schema(description = "管理员默认歌单聚合替换请求")
public class AdminMusicDefaultPlaylistBundleReplaceRequest {

    @Schema(description = "歌单资料")
    private AdminMusicPlaylistProfileUpsertRequest profile;

    @Schema(description = "待覆盖歌单曲目")
    private List<AdminMusicTrackUpsertRequest> tracks;

    public AdminMusicPlaylistProfileUpsertRequest getProfile() {
        return profile;
    }

    public void setProfile(AdminMusicPlaylistProfileUpsertRequest profile) {
        this.profile = profile;
    }

    public List<AdminMusicTrackUpsertRequest> getTracks() {
        return tracks;
    }

    public void setTracks(List<AdminMusicTrackUpsertRequest> tracks) {
        this.tracks = tracks;
    }
}
