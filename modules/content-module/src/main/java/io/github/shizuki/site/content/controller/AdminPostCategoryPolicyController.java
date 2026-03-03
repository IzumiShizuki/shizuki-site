package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.site.content.dto.PostCategoryPolicyResponse;
import io.github.shizuki.site.content.dto.PostCategoryPolicyUpdateRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequireGroup("ADMIN")
@RequestMapping("/api/v1/admin/posts/category-policies")
@Tag(name = "Admin Post Category Policy", description = "管理员帖子分类访问策略接口")
public class AdminPostCategoryPolicyController {

    private final ContentService contentService;

    public AdminPostCategoryPolicyController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "查询帖子分类访问策略")
    public ApiResponse<List<PostCategoryPolicyResponse>> list() {
        return ApiResponse.success(contentService.listPostCategoryPolicies());
    }

    @PutMapping("/{category_code}")
    @AuditLog(action = "post.category.policy.update", resource = "post_category_policy")
    @Operation(summary = "更新帖子分类访问策略")
    public ApiResponse<PostCategoryPolicyResponse> update(@PathVariable("category_code") String categoryCode,
                                                          @RequestBody PostCategoryPolicyUpdateRequest request) {
        return ApiResponse.success(contentService.updatePostCategoryPolicy(categoryCode, request));
    }
}
