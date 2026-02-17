package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.user.dto.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 音乐服务内部调用的用户 API Key 查询接口。
 */
@RestController
@RequestMapping("/api/v1/internal/music/api-keys")
@Tag(name = "Internal Music API Key", description = "服务间查询用户音乐 API Key")
public class InternalMusicApiKeyController {

    private final UserService userService;

    public InternalMusicApiKeyController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 查询用户 API Key 绑定状态（掩码）。
     */
    @GetMapping("/{user_id}/status")
    @Operation(summary = "内部查询 API Key 状态", description = "返回 keyBound 与 keyMask，不返回明文")
    public ApiResponse<MusicApiKeyStatusResponse> status(@PathVariable("user_id") Long userId,
                                                         @RequestParam("provider") String provider) {
        return ApiResponse.success(userService.getMusicApiKeyStatus(userId, provider));
    }

    /**
     * 查询用户 API Key 明文（仅内部服务调用）。
     */
    @GetMapping("/{user_id}/plaintext")
    @Operation(summary = "内部查询 API Key 明文", description = "仅服务间调用，严禁对前端暴露")
    public ApiResponse<String> plaintext(@PathVariable("user_id") Long userId,
                                         @RequestParam("provider") String provider) {
        return ApiResponse.success(userService.getMusicApiKeyPlaintext(userId, provider));
    }
}
