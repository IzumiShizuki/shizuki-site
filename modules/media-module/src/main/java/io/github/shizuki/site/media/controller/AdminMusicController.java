package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.MusicKeyGuideResponse;
import io.github.shizuki.site.media.dto.MusicProviderResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 音乐模块管理员接口。
 */
@RestController
@RequestMapping("/api/v1/admin/music")
@RequireGroup("ADMIN")
@Tag(name = "Admin Music", description = "音乐模块管理员配置接口")
public class AdminMusicController {

    private final MediaService mediaService;

    public AdminMusicController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping("/default-playlist")
    @Operation(summary = "查询默认歌单", description = "管理员查看默认歌单配置")
    public ApiResponse<List<MusicTrackResponse>> listDefaultPlaylist() {
        return ApiResponse.success(mediaService.listAdminDefaultPlaylist());
    }

    @PutMapping("/default-playlist")
    @AuditLog(action = "music.admin.default-playlist.replace", resource = "music_playlist")
    @Operation(summary = "替换默认歌单", description = "管理员一次性覆盖默认歌单")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "替换成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<List<MusicTrackResponse>> replaceDefaultPlaylist(@RequestBody(required = false) AdminMusicPlaylistReplaceRequest request) {
        return ApiResponse.success(mediaService.replaceAdminDefaultPlaylist(
            request == null ? new AdminMusicPlaylistReplaceRequest() : request
        ));
    }

    @GetMapping("/providers")
    @Operation(summary = "查询 provider 配置", description = "管理员查看 provider 开关与显隐状态")
    public ApiResponse<List<MusicProviderResponse>> listProviders() {
        return ApiResponse.success(mediaService.listAdminProviders());
    }

    @PutMapping("/providers/{provider}/visibility")
    @AuditLog(action = "music.admin.provider.visibility.update", resource = "music_provider")
    @Operation(summary = "更新 provider 显隐", description = "管理员更新 provider enabled/visible")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "更新成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<MusicProviderResponse> updateProviderVisibility(@PathVariable("provider") String provider,
                                                                       @RequestBody(required = false) AdminMusicProviderVisibilityUpdateRequest request) {
        return ApiResponse.success(mediaService.updateAdminProviderVisibility(
            provider,
            request == null ? new AdminMusicProviderVisibilityUpdateRequest() : request
        ));
    }

    @GetMapping("/provider-guides")
    @Operation(summary = "查询 provider 引导", description = "管理员查看 API Key 获取引导文案")
    public ApiResponse<List<MusicKeyGuideResponse>> listProviderGuides() {
        return ApiResponse.success(mediaService.listAdminProviderGuides());
    }

    @PutMapping("/provider-guides/{provider}")
    @AuditLog(action = "music.admin.provider-guide.upsert", resource = "music_provider_guide")
    @Operation(summary = "更新 provider 引导", description = "管理员更新指定 provider 的引导文案")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "更新成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<MusicKeyGuideResponse> upsertProviderGuide(@PathVariable("provider") String provider,
                                                                  @RequestBody(required = false) AdminMusicProviderGuideUpsertRequest request) {
        return ApiResponse.success(mediaService.upsertAdminProviderGuide(
            provider,
            request == null ? new AdminMusicProviderGuideUpsertRequest() : request
        ));
    }
}
