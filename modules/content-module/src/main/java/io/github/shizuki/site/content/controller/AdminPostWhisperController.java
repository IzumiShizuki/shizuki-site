package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.content.dto.AuthorWhisperItemResponse;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequireGroup("ADMIN")
@RequestMapping("/api/v1/admin/posts/whispers")
@Tag(name = "Admin Post Whisper", description = "管理员作者悄悄话查询接口")
public class AdminPostWhisperController {

    private final ContentService contentService;

    public AdminPostWhisperController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "分页查询作者悄悄话")
    public ApiResponse<PageResponse<AuthorWhisperItemResponse>> list(
        @RequestParam(name = "page_no", defaultValue = "1") long pageNo,
        @RequestParam(name = "page_size", defaultValue = "20") long pageSize
    ) {
        return ApiResponse.success(contentService.listAuthorWhispers(pageNo, pageSize));
    }
}
