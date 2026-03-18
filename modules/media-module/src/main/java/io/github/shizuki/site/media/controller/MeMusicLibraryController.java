package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.media.dto.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.dto.MeMusicPlaylistCreateRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistTrackUpsertRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistUpdateRequest;
import io.github.shizuki.site.media.dto.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.dto.MusicSourcePlaylistImportResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 我的音乐库接口。
 */
@RestController
@RequestMapping("/api/v1/me/music")
@Tag(name = "Me Music Library", description = "我的音乐库与歌单管理接口")
public class MeMusicLibraryController {

    private final MediaService mediaService;

    public MeMusicLibraryController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping("/library/sidebar")
    @Operation(summary = "查询我的音乐库侧栏", description = "返回默认歌单、我喜欢、自建歌单与收藏歌单")
    public ApiResponse<MeMusicLibrarySidebarResponse> sidebar() {
        return ApiResponse.success(mediaService.getMyMusicLibrarySidebar());
    }

    @PostMapping("/playlists")
    @AuditLog(action = "music.me.playlist.create", resource = "user_music_playlist")
    @Operation(summary = "创建我的歌单", description = "创建当前用户的自建歌单")
    public ApiResponse<MusicPlaylistSummaryResponse> createPlaylist(@RequestBody(required = false) MeMusicPlaylistCreateRequest request) {
        return ApiResponse.success(mediaService.createMyMusicPlaylist(
            request == null ? new MeMusicPlaylistCreateRequest() : request
        ));
    }

    @PutMapping("/playlists/{playlistCode}")
    @AuditLog(action = "music.me.playlist.update", resource = "user_music_playlist")
    @Operation(summary = "更新我的歌单", description = "更新当前用户歌单元信息与公开状态")
    public ApiResponse<MusicPlaylistSummaryResponse> updatePlaylist(@PathVariable("playlistCode") String playlistCode,
                                                                    @RequestBody(required = false) MeMusicPlaylistUpdateRequest request) {
        return ApiResponse.success(mediaService.updateMyMusicPlaylist(
            playlistCode,
            request == null ? new MeMusicPlaylistUpdateRequest() : request
        ));
    }

    @DeleteMapping("/playlists/{playlistCode}")
    @AuditLog(action = "music.me.playlist.delete", resource = "user_music_playlist")
    @Operation(summary = "删除我的歌单", description = "删除当前用户自建歌单")
    public ApiResponse<Void> deletePlaylist(@PathVariable("playlistCode") String playlistCode) {
        mediaService.deleteMyMusicPlaylist(playlistCode);
        return ApiResponse.success(null);
    }

    @PostMapping("/playlists/{playlistCode}/tracks")
    @AuditLog(action = "music.me.playlist.track.upsert", resource = "user_music_playlist_track")
    @Operation(summary = "新增或更新我的歌单曲目", description = "按 provider + track_id 幂等写入曲目")
    public ApiResponse<MusicPlaylistBundleResponse> upsertTrack(@PathVariable("playlistCode") String playlistCode,
                                                                @RequestBody(required = false) MeMusicPlaylistTrackUpsertRequest request) {
        return ApiResponse.success(mediaService.upsertMyMusicPlaylistTrack(
            playlistCode,
            request == null ? new MeMusicPlaylistTrackUpsertRequest() : request
        ));
    }

    @DeleteMapping("/playlists/{playlistCode}/tracks")
    @AuditLog(action = "music.me.playlist.track.delete", resource = "user_music_playlist_track")
    @Operation(summary = "删除我的歌单曲目", description = "按 provider + track_id 删除曲目")
    public ApiResponse<MusicPlaylistBundleResponse> deleteTrack(@PathVariable("playlistCode") String playlistCode,
                                                                @RequestParam("provider") String provider,
                                                                @RequestParam("track_id") String trackId) {
        return ApiResponse.success(mediaService.removeMyMusicPlaylistTrack(playlistCode, provider, trackId));
    }

    @PostMapping("/playlists/{playlistCode}/collect")
    @AuditLog(action = "music.me.playlist.collect", resource = "user_music_playlist_collect")
    @Operation(summary = "收藏歌单", description = "收藏公开歌单到当前用户侧栏")
    public ApiResponse<Void> collect(@PathVariable("playlistCode") String playlistCode) {
        mediaService.collectPlaylist(playlistCode);
        return ApiResponse.success(null);
    }

    @DeleteMapping("/playlists/{playlistCode}/collect")
    @AuditLog(action = "music.me.playlist.collect.cancel", resource = "user_music_playlist_collect")
    @Operation(summary = "取消收藏歌单", description = "从当前用户收藏列表移除指定歌单")
    public ApiResponse<Void> uncollect(@PathVariable("playlistCode") String playlistCode) {
        mediaService.uncollectPlaylist(playlistCode);
        return ApiResponse.success(null);
    }

    @PostMapping("/source-accounts/{provider}/import-playlists")
    @AuditLog(action = "music.me.source-account.import", resource = "user_music_playlist")
    @Operation(summary = "导入音乐源账号歌单", description = "从指定音乐源账号导入歌单到当前用户音乐库")
    public ApiResponse<MusicSourcePlaylistImportResponse> importPlaylists(@PathVariable("provider") String provider) {
        return ApiResponse.success(mediaService.importSourceAccountPlaylists(provider));
    }
}
