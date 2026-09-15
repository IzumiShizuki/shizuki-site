package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.response.MusicKeyGuideResponse;
import io.github.shizuki.site.media.response.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.response.MusicMetingStatusResponse;
import io.github.shizuki.site.media.request.MusicPickRequest;
import io.github.shizuki.site.media.response.MusicPickResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicProviderResponse;
import io.github.shizuki.site.media.response.MusicQuotaResponse;
import io.github.shizuki.site.media.request.MusicResolvePlaybackRequest;
import io.github.shizuki.site.media.response.MusicSearchResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorkBundleResponse;
import io.github.shizuki.site.media.response.MusicVoiceWorksResponse;
import io.github.shizuki.site.media.response.SpotifyPreviewResponse;
import io.github.shizuki.site.media.response.SpotifyTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.media.service.playback.MusicPlaybackGatewayService;
import io.github.shizuki.site.media.service.playback.MusicPlaybackStream;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import org.springframework.util.StringUtils;

/**
 * 音乐播放器前台接口。
 */
@RestController
@RequestMapping("/api/v1/music")
@Tag(name = "Music", description = "音乐播放器前台接口")
public class MusicController {

    private final MediaService mediaService;
    private final MusicPlaybackGatewayService playbackGatewayService;

    public MusicController(MediaService mediaService,
                           MusicPlaybackGatewayService playbackGatewayService) {
        this.mediaService = mediaService;
        this.playbackGatewayService = playbackGatewayService;
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

    @GetMapping("/playlist/default/bundle")
    @RateLimit(key = "music.playlist.default.bundle", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询默认歌单聚合", description = "游客和登录用户均可访问，返回歌单资料与曲目")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<MusicDefaultPlaylistBundleResponse> defaultPlaylistBundle() {
        return ApiResponse.success(mediaService.getDefaultPlaylistBundle());
    }

    @GetMapping("/library/home")
    @RateLimit(key = "music.library.home", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询音乐库主列表聚合", description = "游客和登录用户均可访问")
    public ApiResponse<MusicLibraryHomeResponse> libraryHome() {
        return ApiResponse.success(mediaService.getMusicLibraryHome());
    }

    @GetMapping("/playlists/{playlistCode}/bundle")
    @RateLimit(key = "music.playlist.bundle", limit = 60, windowSeconds = 60)
    @Operation(summary = "按歌单编码查询歌单聚合", description = "公开歌单可游客访问，私有歌单仅所有者可访问")
    public ApiResponse<MusicPlaylistBundleResponse> playlistBundle(@PathVariable("playlistCode") String playlistCode) {
        return ApiResponse.success(mediaService.getMusicPlaylistBundle(playlistCode));
    }

    @GetMapping("/search")
    @RateLimit(key = "music.search", limit = 80, windowSeconds = 60)
    @Operation(summary = "音乐聚合搜索", description = "支持全库检索歌单/歌曲/歌手，按 provider 过滤")
    public ApiResponse<MusicSearchResponse> search(@RequestParam("q") String query,
                                                   @RequestParam(value = "type", required = false) String type,
                                                   @RequestParam(value = "providers", required = false) String providers,
                                                   @RequestParam(value = "page", required = false) Integer page,
                                                   @RequestParam(value = "limit", required = false) Integer limit) {
        return ApiResponse.success(mediaService.searchMusic(query, type, providers, page, limit));
    }

    @GetMapping("/voice/works")
    @RateLimit(key = "music.voice.works", limit = 80, windowSeconds = 60)
    @Operation(summary = "音声作品搜索", description = "ASMR 专用搜索，支持默认榜单、排序、标签与年龄分级筛选")
    public ApiResponse<MusicVoiceWorksResponse> voiceWorks(@RequestParam(value = "q", required = false) String query,
                                                           @RequestParam(value = "page", required = false) Integer page,
                                                           @RequestParam(value = "limit", required = false) Integer limit,
                                                           @RequestParam(value = "order", required = false) String order,
                                                           @RequestParam(value = "sort", required = false) String sort,
                                                           @RequestParam(value = "tag_ids", required = false) String tagIds,
                                                           @RequestParam(value = "age_categories", required = false) String ageCategories) {
        return ApiResponse.success(mediaService.searchVoiceWorks(
            query,
            page,
            limit,
            order,
            sort,
            tagIds,
            ageCategories
        ));
    }

    @GetMapping("/voice/works/{workId}/bundle")
    @RateLimit(key = "music.voice.work.bundle", limit = 80, windowSeconds = 60)
    @Operation(summary = "音声作品聚合详情", description = "返回作品结构化信息、音轨树和可播放音轨")
    public ApiResponse<MusicVoiceWorkBundleResponse> voiceWorkBundle(@PathVariable("workId") Long workId) {
        return ApiResponse.success(mediaService.getVoiceWorkBundle(workId));
    }

    @PostMapping("/tracks/resolve-playback")
    @RateLimit(key = "music.track.resolve", limit = 120, windowSeconds = 60)
    @Operation(summary = "按需解析播放曲目", description = "仅在真实播放时触发解析，返回可播放链接与歌词信息")
    public ApiResponse<MusicTrackResponse> resolvePlayback(@RequestBody(required = false) MusicResolvePlaybackRequest request) {
        MusicTrackResponse track = mediaService.resolvePlaybackTrack(
            request == null ? new MusicResolvePlaybackRequest() : request
        );
        return ApiResponse.success(playbackGatewayService.rewriteDeliveryUrl(track));
    }

    @GetMapping("/tracks/stream/{capability}")
    @RateLimit(key = "music.track.stream", limit = 600, windowSeconds = 60)
    @Operation(summary = "流式读取已解析音乐", description = "校验短时 capability，并以站内同源地址代理第三方音频")
    public ResponseEntity<StreamingResponseBody> streamPlayback(
        @PathVariable("capability") String capability,
        @RequestHeader(value = HttpHeaders.RANGE, required = false) String range
    ) {
        MusicPlaybackStream stream = playbackGatewayService.open(capability, range);
        StreamingResponseBody body = output -> {
            try (InputStream input = stream.inputStream()) {
                input.transferTo(output);
            } catch (IOException | RuntimeException exception) {
                throw new IOException("music playback stream interrupted", exception);
            }
        };
        ResponseEntity.BodyBuilder response = ResponseEntity.status(stream.statusCode())
            .contentType(MediaType.parseMediaType(stream.contentType()))
            .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
            .header(HttpHeaders.PRAGMA, "no-cache")
            .header(HttpHeaders.ACCEPT_RANGES, stream.acceptRanges())
            .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
            .header(HttpHeaders.VARY, HttpHeaders.RANGE)
            .header("X-Content-Type-Options", "nosniff")
            .header("X-Accel-Buffering", "no")
            .header("Cross-Origin-Resource-Policy", "same-site");
        if (stream.contentLength() >= 0L) {
            response.contentLength(stream.contentLength());
        }
        if (StringUtils.hasText(stream.contentRange())) {
            response.header(HttpHeaders.CONTENT_RANGE, stream.contentRange());
        }
        return response.body(body);
    }

    @GetMapping("/tracks/{trackId}/amll-lyric")
    @RateLimit(key = "music.track.amll-lyric", limit = 60, windowSeconds = 60)
    @Operation(summary = "拉取 AMLL 逐字歌词", description = "从 AMLL TTML 逐字歌词库拉取 TTML 原文（网易云 yrc 逐字歌词已被平台风控，此为替代数据源）")
    public ApiResponse<String> amllLyric(@PathVariable("trackId") String trackId,
                                         @RequestParam(value = "platform", required = false, defaultValue = "ncm") String platform) {
        return ApiResponse.success(mediaService.fetchAmllLyric(trackId, platform));
    }

    @GetMapping("/discovery/daily-songs")
    @Operation(summary = "网易云每日推荐歌曲", description = "需绑定网易云账号；未绑定时返回空列表")
    public ApiResponse<List<Map<String, Object>>> dailySongs() {
        return ApiResponse.success(mediaService.dailyRecommendSongs());
    }

    @GetMapping("/discovery/recommend-playlists")
    @Operation(summary = "网易云推荐歌单", description = "需绑定网易云账号；未绑定时返回空列表")
    public ApiResponse<List<Map<String, Object>>> recommendPlaylists() {
        return ApiResponse.success(mediaService.recommendPlaylists());
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

    @GetMapping("/meting/status")
    public ApiResponse<MusicMetingStatusResponse> metingStatus() {
        return ApiResponse.success(mediaService.getMetingStatus());
    }

    @GetMapping("/key-guide")
    @Operation(summary = "查询 API Key 获取引导", description = "返回指定 provider 的引导文案和链接")
    public ApiResponse<MusicKeyGuideResponse> keyGuide(@RequestParam("provider") String provider) {
        return ApiResponse.success(mediaService.getMusicKeyGuide(provider));
    }

    @GetMapping("/spotify/search")
    @Operation(summary = "Spotify 搜索", description = "最小授权模式：游客可搜索；已绑定用户自动使用个人 token 提升可用性")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Spotify 上游异常",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<List<SpotifyTrackResponse>> spotifySearch(@RequestParam("q") String query,
                                                                 @RequestParam(value = "limit", required = false) Integer limit) {
        return ApiResponse.success(mediaService.searchSpotify(query, limit));
    }

    @GetMapping("/spotify/preview-url")
    @Operation(summary = "Spotify 预览链接", description = "最小授权模式：游客可查询预览链接；已绑定用户自动使用个人 token")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "查询成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Spotify 上游异常",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<SpotifyPreviewResponse> spotifyPreview(@RequestParam("track_id") String trackId) {
        return ApiResponse.success(mediaService.getSpotifyPreview(trackId));
    }
}
