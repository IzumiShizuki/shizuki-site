package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.dto.MusicKeyGuideResponse;
import io.github.shizuki.site.media.dto.MusicPickRequest;
import io.github.shizuki.site.media.dto.MusicPickResponse;
import io.github.shizuki.site.media.dto.MusicProviderResponse;
import io.github.shizuki.site.media.dto.MusicQuotaResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 音乐播放器前台接口。
 */
@RestController
@RequestMapping("/api/v1/music")
@Tag(name = "Music", description = "音乐播放器前台接口")
public class MusicController {

    private final MediaService mediaService;

    public MusicController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping("/playlist/default")
    @RateLimit(key = "music.playlist.default", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询默认歌单", description = "游客和登录用户均可访问")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<List<MusicTrackResponse>> defaultPlaylist() {
        return ApiResponse.success(mediaService.listDefaultMusicPlaylist());
    }

    @GetMapping("/quota/me")
    @Operation(summary = "查询我的音乐配额", description = "返回选歌次数与上传容量剩余")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "未登录",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<MusicQuotaResponse> myQuota() {
        return ApiResponse.success(mediaService.myMusicQuota());
    }

    @PostMapping("/picks")
    @RateLimit(key = "music.pick", limit = 30, windowSeconds = 60)
    @AuditLog(action = "music.pick", resource = "music_pick")
    @Operation(summary = "执行选歌", description = "优先扣免费额度，超额后要求绑定 API Key")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "选歌成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "403", description = "配额不足或 provider 无权限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<MusicPickResponse> pick(@RequestBody(required = false) MusicPickRequest request) {
        return ApiResponse.success(mediaService.pickMusic(request == null ? new MusicPickRequest() : request));
    }

    @GetMapping("/providers")
    @Operation(summary = "查询 provider 列表", description = "返回 provider 启用状态与可见性")
    public ApiResponse<List<MusicProviderResponse>> providers() {
        return ApiResponse.success(mediaService.listMusicProviders());
    }

    @GetMapping("/key-guide")
    @Operation(summary = "查询 API Key 获取引导", description = "返回指定 provider 的引导文案和链接")
    public ApiResponse<MusicKeyGuideResponse> keyGuide(@RequestParam("provider") String provider) {
        return ApiResponse.success(mediaService.getMusicKeyGuide(provider));
    }

    @GetMapping("/spotify/search")
    @Operation(summary = "Spotify 搜索", description = "调用 Spotify 搜索 API")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "403", description = "用户级 Spotify token 无效",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Spotify 上游异常",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<List<SpotifyTrackResponse>> spotifySearch(@RequestParam("q") String query,
                                                                 @RequestParam(value = "limit", required = false) Integer limit) {
        return ApiResponse.success(mediaService.searchSpotify(query, limit));
    }

    @GetMapping("/spotify/preview-url")
    @Operation(summary = "Spotify 预览链接", description = "返回曲目预览 URL，可能为空")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "403", description = "用户级 Spotify token 无效",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Spotify 上游异常",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<SpotifyPreviewResponse> spotifyPreview(@RequestParam("track_id") String trackId) {
        return ApiResponse.success(mediaService.getSpotifyPreview(trackId));
    }
}
