package io.github.shizuki.site.monolith.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.monolith.auth.GuestAuthorTokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/guest-author/sessions")
@Tag(name = "Guest Author", description = "无需账号的本地作者身份接口")
public class GuestAuthorSessionController {

    private final GuestAuthorTokenService guestAuthorTokenService;

    public GuestAuthorSessionController(GuestAuthorTokenService guestAuthorTokenService) {
        this.guestAuthorTokenService = guestAuthorTokenService;
    }

    @PostMapping
    @Operation(summary = "创建匿名作者身份")
    public ApiResponse<GuestAuthorSessionResponse> create() {
        GuestAuthorTokenService.GuestAuthorSession session = guestAuthorTokenService.issue();
        return ApiResponse.success(new GuestAuthorSessionResponse(session.token(), session.expiresAtEpochSecond()));
    }

    public record GuestAuthorSessionResponse(String token, long expiresAtEpochSecond) {
    }
}
