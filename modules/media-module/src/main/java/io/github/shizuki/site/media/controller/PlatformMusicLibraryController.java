package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.response.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.response.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import io.github.shizuki.site.media.service.PlatformMusicLibraryService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PlatformMusicLibraryController {
    private final PlatformMusicLibraryService platforms;

    public PlatformMusicLibraryController(PlatformMusicLibraryService platforms) {
        this.platforms = platforms;
    }

    @GetMapping("/me/music/source-accounts/{provider}/library")
    @RateLimit(key = "music.platform.library", limit = 30, windowSeconds = 60)
    @Operation(summary = "读取平台账号当前歌单")
    public ApiResponse<MeMusicLibrarySidebarResponse> library(@PathVariable("provider") String provider) {
        return ApiResponse.success(platforms.accountLibrary(provider));
    }

    @GetMapping("/me/music/source-accounts/{provider}/likes")
    @RateLimit(key = "music.platform.likes", limit = 60, windowSeconds = 60)
    @Operation(summary = "读取平台账号喜欢的曲目")
    public ApiResponse<List<String>> likes(@PathVariable("provider") String provider) {
        return ApiResponse.success(platforms.likedTrackIds(provider));
    }

    @PutMapping("/me/music/source-accounts/{provider}/likes/{trackId}")
    @RateLimit(key = "music.platform.like", limit = 60, windowSeconds = 60)
    @AuditLog(action = "music.platform.track.like", resource = "music_source_account")
    @Operation(summary = "设置平台账号曲目喜欢状态")
    public ApiResponse<Map<String, Object>> setLike(@PathVariable("provider") String provider,
                                                   @PathVariable("trackId") String trackId,
                                                   @Valid @RequestBody TrackLikeRequest request) {
        return ApiResponse.success(platforms.setTrackLiked(provider, trackId, request.liked()));
    }

    @GetMapping("/music/discovery/podcasts")
    @RateLimit(key = "music.platform.podcasts", limit = 60, windowSeconds = 60)
    @Operation(summary = "网易云声音与播客推荐")
    public ApiResponse<List<MusicPlaylistSummaryResponse>> podcasts(@RequestParam(value = "q", required = false) String query) {
        return ApiResponse.success(platforms.podcasts(query));
    }

    @GetMapping("/me/music/discovery/personal-fm")
    @RateLimit(key = "music.platform.fm", limit = 30, windowSeconds = 60)
    @Operation(summary = "网易云私人 FM")
    public ApiResponse<List<MusicTrackResponse>> personalFm() {
        return ApiResponse.success(platforms.personalFm());
    }

    public record TrackLikeRequest(@NotNull Boolean liked) {}
}
