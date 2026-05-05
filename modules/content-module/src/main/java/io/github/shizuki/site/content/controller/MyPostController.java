package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.response.AuthorPostItemResponse;
import io.github.shizuki.site.content.request.PostNotionSyncJobCreateRequest;
import io.github.shizuki.site.content.request.AuthorPostUpsertRequest;
import io.github.shizuki.site.content.response.PostDetailResponse;
import io.github.shizuki.site.content.response.PostNotionSyncJobResponse;
import io.github.shizuki.site.content.response.PostPresentationDownloadResponse;
import io.github.shizuki.site.content.response.PostEditorPolicyResponse;
import io.github.shizuki.site.content.response.PostPresentationResponse;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/me/posts")
@Tag(name = "My Post", description = "作者文章管理接口")
public class MyPostController {

    private final ContentService contentService;

    public MyPostController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    @Operation(summary = "分页查询我的文章")
    public ApiResponse<PageResponse<AuthorPostItemResponse>> listMine(
        @RequestParam(name = "page_no", defaultValue = "1") long pageNo,
        @RequestParam(name = "page_size", defaultValue = "10") long pageSize,
        @RequestParam(name = "keyword", required = false) String keyword,
        @RequestParam(name = "status", required = false) String status
    ) {
        return ApiResponse.success(contentService.listMyPosts(pageNo, pageSize, keyword, status));
    }

    @GetMapping("/{post_id}")
    @Operation(summary = "查询我的文章详情")
    public ApiResponse<PostDetailResponse> detailMine(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getMyPostDetail(postId));
    }

    @GetMapping("/category-policies")
    @Operation(summary = "查询作者可读分类默认分组策略")
    public ApiResponse<PostEditorPolicyResponse> categoryPolicies() {
        return ApiResponse.success(contentService.getMyPostCategoryPolicies());
    }

    @PostMapping
    @AuditLog(action = "post.create", resource = "post")
    @Operation(summary = "创建文章草稿")
    public ApiResponse<AuthorPostItemResponse> create(@Valid @RequestBody AuthorPostUpsertRequest request) {
        return ApiResponse.success(contentService.createMyPost(request));
    }

    @PutMapping("/{post_id}")
    @AuditLog(action = "post.update", resource = "post")
    @Operation(summary = "更新文章草稿")
    public ApiResponse<AuthorPostItemResponse> update(@PathVariable("post_id") Long postId,
                                                      @Valid @RequestBody AuthorPostUpsertRequest request) {
        return ApiResponse.success(contentService.updateMyPost(postId, request));
    }

    @DeleteMapping("/{post_id}")
    @AuditLog(action = "post.delete", resource = "post")
    @Operation(summary = "删除文章")
    public ApiResponse<Void> delete(@PathVariable("post_id") Long postId) {
        contentService.deleteMyPost(postId);
        return ApiResponse.success(null);
    }

    @PostMapping("/{post_id}/publish")
    @AuditLog(action = "post.publish", resource = "post")
    @Operation(summary = "发布文章")
    public ApiResponse<AuthorPostItemResponse> publish(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.publishMyPost(postId));
    }

    @PostMapping("/{post_id}/unpublish")
    @AuditLog(action = "post.unpublish", resource = "post")
    @Operation(summary = "下线文章")
    public ApiResponse<AuthorPostItemResponse> unpublish(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.unpublishMyPost(postId));
    }

    @PostMapping("/notion/sync-jobs")
    @AuditLog(action = "post.notion.sync-job.create", resource = "post")
    @Operation(summary = "创建 Notion 手动同步任务")
    public ApiResponse<PostNotionSyncJobResponse> createNotionSyncJob(
        @Valid @RequestBody PostNotionSyncJobCreateRequest request
    ) {
        return ApiResponse.success(contentService.createMyPostNotionSyncJob(request));
    }

    @GetMapping("/notion/sync-jobs/{job_id}")
    @Operation(summary = "查询 Notion 同步任务详情")
    public ApiResponse<PostNotionSyncJobResponse> notionSyncJob(@PathVariable("job_id") Long jobId) {
        return ApiResponse.success(contentService.getMyPostNotionSyncJob(jobId));
    }

    @PostMapping("/{post_id}/presentation/generate")
    @AuditLog(action = "post.presentation.generate", resource = "post")
    @Operation(summary = "生成文章演示文稿")
    public ApiResponse<PostPresentationResponse> generatePresentation(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.generateMyPostPresentation(postId));
    }

    @GetMapping("/{post_id}/presentation")
    @Operation(summary = "查询我的文章演示文稿")
    public ApiResponse<PostPresentationResponse> presentation(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getMyPostPresentation(postId));
    }

    @GetMapping("/{post_id}/presentation/ppt-download-url")
    @Operation(summary = "查询我的文章演示文稿 PPT 下载地址")
    public ApiResponse<PostPresentationDownloadResponse> presentationDownload(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getMyPostPresentationDownload(postId));
    }
}
