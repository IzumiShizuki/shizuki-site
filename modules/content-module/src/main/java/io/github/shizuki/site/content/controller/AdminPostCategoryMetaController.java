package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.content.response.PostCategoryMetaDeleteResponse;
import io.github.shizuki.site.content.response.PostCategoryMetaResponse;
import io.github.shizuki.site.content.request.PostCategoryMetaUpsertRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequireGroup("ADMIN")
@RequestMapping("/api/v1/admin/posts/categories")
@Tag(name = "Admin Post Category Meta", description = "管理员博客分类展示元数据接口")
public class AdminPostCategoryMetaController {

    private final ContentService contentService;

    public AdminPostCategoryMetaController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "查询博客分类展示元数据")
    public ApiResponse<List<PostCategoryMetaResponse>> list() {
        return ApiResponse.success(contentService.listPostCategoryMetas());
    }

    @PutMapping("/{category_code}")
    @AuditLog(action = "post.category.meta.update", resource = "post_category_meta")
    @Operation(summary = "更新博客分类展示元数据")
    public ApiResponse<PostCategoryMetaResponse> update(@PathVariable("category_code") String categoryCode,
                                                        @RequestBody PostCategoryMetaUpsertRequest request) {
        return ApiResponse.success(contentService.upsertPostCategoryMeta(categoryCode, request));
    }

    @DeleteMapping("/{category_code}")
    @AuditLog(action = "post.category.meta.delete", resource = "post_category_meta")
    @Operation(summary = "删除博客分类展示元数据")
    public ApiResponse<PostCategoryMetaDeleteResponse> delete(@PathVariable("category_code") String categoryCode) {
        contentService.deletePostCategoryMeta(categoryCode);
        return ApiResponse.success(new PostCategoryMetaDeleteResponse(true, categoryCode));
    }
}
