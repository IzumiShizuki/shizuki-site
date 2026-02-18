package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.dto.MusicApiKeyUpsertRequest;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 当前用户音乐 Provider API Key 管理接口。
 */
@RestController
@RequestMapping("/api/v1/me/music/api-keys")
@Tag(name = "Me Music API Key", description = "当前用户音乐 Provider API Key 管理")
public class MeMusicApiKeyController {

    private final UserService userService;

    public MeMusicApiKeyController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 绑定或更新当前用户的 provider API Key。
     */
    @PutMapping("/{provider}")
    @AuditLog(action = "music.api-key.upsert", resource = "user_provider_secret")
    @Operation(summary = "绑定/更新音乐 API Key", description = "仅后端保存密文，响应不返回明文 key")
    public ApiResponse<MusicApiKeyStatusResponse> upsert(@PathVariable("provider") String provider,
                                                         @Valid @RequestBody MusicApiKeyUpsertRequest request) {
        Long userId = currentUserId();
        return ApiResponse.success(userService.upsertMusicApiKey(userId, provider, request.getApiKey()));
    }

    /**
     * 删除当前用户的 provider API Key。
     */
    @DeleteMapping("/{provider}")
    @AuditLog(action = "music.api-key.delete", resource = "user_provider_secret")
    @Operation(summary = "删除音乐 API Key", description = "解绑当前用户指定 provider 的 API Key")
    public ApiResponse<Void> delete(@PathVariable("provider") String provider) {
        Long userId = currentUserId();
        userService.deleteMusicApiKey(userId, provider);
        return ApiResponse.success(null);
    }

    /**
     * 查询当前用户的 provider API Key 绑定状态。
     */
    @GetMapping("/{provider}/status")
    @Operation(summary = "查询音乐 API Key 状态", description = "返回 keyBound、mask、updatedAt，不返回明文")
    public ApiResponse<MusicApiKeyStatusResponse> status(@PathVariable("provider") String provider) {
        Long userId = currentUserId();
        return ApiResponse.success(userService.getMusicApiKeyStatus(userId, provider));
    }

    private Long currentUserId() {
        return LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
    }
}
