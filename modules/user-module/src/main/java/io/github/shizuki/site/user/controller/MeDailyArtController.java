package io.github.shizuki.site.user.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.service.DailyArtService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/me/daily-art")
public class MeDailyArtController {
    private final DailyArtService service;
    public MeDailyArtController(DailyArtService service) { this.service = service; }

    @GetMapping("/settings")
    public ApiResponse<ObjectNode> settings() { return ApiResponse.success(service.settings(userId())); }

    @GetMapping("/today")
    @RateLimit(key = "daily-art.today", limit = 12, windowSeconds = 60)
    public ApiResponse<ObjectNode> today() { return ApiResponse.success(service.today(userId())); }

    // No argument logging/audit annotation: the request contains a login credential.
    @PutMapping("/pixiv")
    @RateLimit(key = "daily-art.connect", limit = 6, windowSeconds = 60)
    public ApiResponse<ObjectNode> connect(@Valid @RequestBody Connection request) {
        return ApiResponse.success(service.connect(userId(), request.accountId(), request.session()));
    }

    @DeleteMapping("/pixiv")
    public ApiResponse<ObjectNode> disconnect() { return ApiResponse.success(service.disconnect(userId())); }

    @PostMapping("/pixiv/sync")
    @RateLimit(key = "daily-art.sync", limit = 3, windowSeconds = 60)
    public ApiResponse<ObjectNode> sync(@RequestParam(value = "include_private", defaultValue = "false") boolean includePrivate) {
        return ApiResponse.success(service.sync(userId(), includePrivate));
    }

    @PutMapping("/artists")
    @RateLimit(key = "daily-art.artists", limit = 12, windowSeconds = 60)
    public ApiResponse<ObjectNode> artists(@Valid @RequestBody Artists request) {
        return ApiResponse.success(service.saveArtists(userId(), request.artistIds()));
    }

    @GetMapping("/search")
    @RateLimit(key = "daily-art.search", limit = 20, windowSeconds = 60)
    public ApiResponse<ObjectNode> search(@RequestParam("q") String query) {
        userId();
        return ApiResponse.success(service.search(query));
    }

    private Long userId() {
        return LoginUserContext.get().map(user -> user.getUserId()).filter(id -> id != null && id > 0)
                .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "请登录后查看每日内容"));
    }

    public record Connection(@NotBlank @Size(max = 256) String accountId,
                             @NotBlank @Size(max = 4096) String session) { }
    public record Artists(@NotNull @Size(max = 32) List<@NotBlank @Size(max = 256) String> artistIds) { }
}
