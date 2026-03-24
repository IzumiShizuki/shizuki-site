package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.MusicSourceAccountBindSessionCompleteRequest;
import io.github.shizuki.site.user.dto.MusicSourceAccountBindSessionCreateResponse;
import io.github.shizuki.site.user.dto.MusicSourceAccountBindSessionStatusResponse;
import io.github.shizuki.site.user.dto.MusicSourceAccountCookieUpsertRequest;
import io.github.shizuki.site.user.dto.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.service.MusicSourceAccountBindSessionService;
import io.github.shizuki.site.user.service.MusicSourceAccountCookieVerifier;
import io.github.shizuki.site.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
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
    private final MusicSourceAccountCookieVerifier cookieVerifier;
    private final MusicSourceAccountBindSessionService bindSessionService;

    public MeMusicSourceAccountController(UserService userService,
                                          MusicSourceAccountCookieVerifier cookieVerifier,
                                          MusicSourceAccountBindSessionService bindSessionService) {
        this.userService = userService;
        this.cookieVerifier = cookieVerifier;
        this.bindSessionService = bindSessionService;
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
        cookieVerifier.assertValid(provider, request.getCookie());
        return ApiResponse.success(userService.upsertMusicSourceAccountCookie(userId, provider, request.getCookie()));
    }

    @PostMapping("/{provider}/bind-sessions")
    @Operation(summary = "创建音乐源一键绑定会话", description = "创建一次性音乐源账号绑定会话并返回登录地址")
    public ApiResponse<MusicSourceAccountBindSessionCreateResponse> createBindSession(@PathVariable("provider") String provider) {
        Long userId = currentUserId();
        return ApiResponse.success(bindSessionService.createSession(userId, provider));
    }

    @GetMapping("/{provider}/bind-sessions/{sessionId}")
    @Operation(summary = "查询音乐源绑定会话状态", description = "查询当前用户指定平台绑定会话状态")
    public ApiResponse<MusicSourceAccountBindSessionStatusResponse> getBindSessionStatus(@PathVariable("provider") String provider,
                                                                                         @PathVariable("sessionId") String sessionId) {
        Long userId = currentUserId();
        return ApiResponse.success(bindSessionService.getSessionStatus(userId, provider, sessionId));
    }

    @PostMapping("/{provider}/bind-sessions/{sessionId}/complete")
    @AuditLog(action = "music.source-account.bind.complete", resource = "user_provider_secret")
    @Operation(summary = "完成音乐源一键绑定", description = "提交浏览器助手采集的 Cookie 并完成账号绑定")
    public ApiResponse<MusicSourceAccountStatusResponse> completeBindSession(@PathVariable("provider") String provider,
                                                                             @PathVariable("sessionId") String sessionId,
                                                                             @Valid @RequestBody MusicSourceAccountBindSessionCompleteRequest request) {
        Long userId = currentUserId();
        return ApiResponse.success(bindSessionService.completeSession(userId, provider, sessionId, request));
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
