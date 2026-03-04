package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/author/profile")
@Tag(name = "Author Profile", description = "作者主页公开资料接口")
public class AuthorProfileController {

    private final ContentService contentService;

    public AuthorProfileController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "获取作者主页资料", description = "返回作者主页展示所需资料")
    public ApiResponse<AuthorProfileResponse> getProfile() {
        return ApiResponse.success(contentService.getAuthorProfile());
    }
}
