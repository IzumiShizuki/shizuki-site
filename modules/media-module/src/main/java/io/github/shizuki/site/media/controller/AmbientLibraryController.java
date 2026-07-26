package io.github.shizuki.site.media.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.integration.FreesoundProvider;
import io.github.shizuki.site.media.response.FreesoundTrackResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Map;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 氛围面板在线环境音库接口（Freesound 代理，API Token 不下发到前端）。
 */
@RestController
@RequestMapping("/api/v1/ambient-library")
@Tag(name = "Ambient Library", description = "氛围面板在线环境音库检索接口")
public class AmbientLibraryController {

    private final FreesoundProvider freesoundProvider;
    private final FreesoundProperties freesoundProperties;

    public AmbientLibraryController(FreesoundProvider freesoundProvider,
                                    FreesoundProperties freesoundProperties) {
        this.freesoundProvider = freesoundProvider;
        this.freesoundProperties = freesoundProperties;
    }

    @GetMapping("/status")
    @RateLimit(key = "ambient-library.status", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询在线音源库可用状态", description = "未配置 Freesound Token 时前端隐藏在线音源库入口")
    public ApiResponse<Map<String, Object>> status() {
        return ApiResponse.success(Map.of(
            "enabled", freesoundProperties.isEnabled(),
            "provider", "freesound",
            "maxPageSize", freesoundProperties.getMaxPageSize()
        ));
    }

    @GetMapping("/search")
    @RateLimit(key = "ambient-library.search", limit = 30, windowSeconds = 60)
    @Operation(summary = "搜索在线环境音", description = "代理 Freesound 搜索，默认只返回 CC0 无需署名的音频")
    @ApiResponses({
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "搜索成功"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "请求参数错误",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class))),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "429", description = "请求频率超限",
            content = @Content(schema = @Schema(implementation = ProblemDetail.class)))
    })
    public ApiResponse<PageResponse<FreesoundTrackResponse>> search(
        @RequestParam("query") String query,
        @RequestParam(value = "license", required = false, defaultValue = "cc0") String license,
        @RequestParam(value = "page_no", required = false, defaultValue = "1") int pageNo,
        @RequestParam(value = "page_size", required = false, defaultValue = "24") int pageSize) {
        return ApiResponse.success(freesoundProvider.searchAmbient(query, license, pageNo, pageSize));
    }
}
