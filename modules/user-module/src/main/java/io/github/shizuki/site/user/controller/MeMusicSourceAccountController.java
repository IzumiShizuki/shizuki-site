package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.MusicSourceAccountCookieUpsertRequest;
import io.github.shizuki.site.user.dto.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 当前用户音乐源账号（Cookie）管理接口。
 */
@RestController
@RequestMapping("/api/v1/me/music/source-accounts")
@Tag(name = "Me Music Source Account", description = "当前用户音乐源账号绑定管理")
public class MeMusicSourceAccountController {

    private final UserService userService;

    public MeMusicSourceAccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/status")
    @Operation(summary = "查询音乐源账号状态", description = "返回各音乐源账号的绑定状态")
    public ApiResponse<List<MusicSourceAccountStatusResponse>> status() {
        Long userId = currentUserId();
        return ApiResponse.success(userService.listMusicSourceAccountStatus(userId));
    }

    @PutMapping("/{provider}/cookie")
    @AuditLog(action = "music.source-account.cookie.upsert", resource = "user_provider_secret")
    @Operation(summary = "绑定/更新音乐源 Cookie", description = "保存当前用户指定平台 Cookie（密文）")
    public ApiResponse<MusicSourceAccountStatusResponse> upsertCookie(@PathVariable("provider") String provider,
                                                                      @Valid @RequestBody MusicSourceAccountCookieUpsertRequest request) {
        Long userId = currentUserId();
        return ApiResponse.success(userService.upsertMusicSourceAccountCookie(userId, provider, request.getCookie()));
    }

    @DeleteMapping("/{provider}")
    @AuditLog(action = "music.source-account.cookie.delete", resource = "user_provider_secret")
    @Operation(summary = "解绑音乐源账号", description = "删除当前用户指定平台 Cookie")
    public ApiResponse<Void> delete(@PathVariable("provider") String provider) {
        Long userId = currentUserId();
        userService.deleteMusicSourceAccount(userId, provider);
        return ApiResponse.success(null);
    }

    private Long currentUserId() {
        return LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
    }
}
