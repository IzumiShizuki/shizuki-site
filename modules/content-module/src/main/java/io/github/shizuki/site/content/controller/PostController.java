package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.content.response.AuthorWhisperSubmitResponse;
import io.github.shizuki.site.content.request.AuthorWhisperRequest;
import io.github.shizuki.site.content.response.PostDetailResponse;
import io.github.shizuki.site.content.response.PostPresentationDownloadResponse;
import io.github.shizuki.site.content.response.PostPresentationResponse;
import io.github.shizuki.site.content.response.PostSidebarResponse;
import io.github.shizuki.site.content.response.PostSummary;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.nio.charset.StandardCharsets;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 帖子查询控制器。
 *
 * <p>提供帖子分页查询与内部连通性探测接口。
 */
@RestController
@RequestMapping("/api/v1/posts")
@Tag(name = "Post", description = "帖子查询与内部诊断接口")
public class PostController {

    /**
     * 内容领域服务，承载帖子查询业务逻辑。
     */
    private final ContentService contentService;

    /**
     * 构造帖子控制器。
     *
     * @param contentService 内容领域服务
     */
    public PostController(ContentService contentService) {
        this.contentService = contentService;
    }

    /**
     * 分页查询帖子列表。
     *
     * @param pageNo 页码（从 1 开始）
     * @param pageSize 分页大小
     * @return 帖子分页结果
     */
    @GetMapping
    @RateLimit(key = "posts.list", limit = 60, windowSeconds = 60)
    @Operation(summary = "分页查询帖子", description = "按 pageNo/pageSize 分页返回帖子列表")
    public ApiResponse<PageResponse<PostSummary>> list(@RequestParam(name = "page_no", defaultValue = "1") long pageNo,
                                                       @RequestParam(name = "page_size", defaultValue = "10") long pageSize,
                                                       @RequestParam(name = "keyword", required = false) String keyword,
                                                       @RequestParam(name = "category", required = false) String category,
                                                       @RequestParam(name = "tag", required = false) String tag,
                                                       @RequestParam(name = "published_from", required = false) String publishedFrom,
                                                       @RequestParam(name = "published_to", required = false) String publishedTo) {
        return ApiResponse.success(contentService.listPosts(pageNo, pageSize, keyword, category, tag, publishedFrom, publishedTo));
    }

    @GetMapping("/sidebar")
    @RateLimit(key = "posts.sidebar", limit = 60, windowSeconds = 60)
    @Operation(summary = "查询博客侧栏聚合信息", description = "返回最新文章、分类统计、标签统计和归档统计")
    public ApiResponse<PostSidebarResponse> sidebar() {
        return ApiResponse.success(contentService.getPostSidebar());
    }

    @PostMapping("/whispers")
    @RateLimit(key = "posts.whispers", limit = 20, windowSeconds = 60)
    @Operation(summary = "提交作者悄悄话", description = "支持游客匿名向作者发送悄悄话")
    public ApiResponse<AuthorWhisperSubmitResponse> whisper(@Valid @RequestBody AuthorWhisperRequest request) {
        return ApiResponse.success(contentService.submitAuthorWhisper(request));
    }

    /**
     * 查询已发布帖子详情。
     *
     * @param postId 帖子 ID
     * @return 帖子详情（含 markdown 正文）
     */
    @GetMapping("/{post_id}")
    @RateLimit(key = "posts.detail", limit = 120, windowSeconds = 60)
    @Operation(summary = "查询帖子详情", description = "返回已发布且当前用户可访问的帖子详情")
    public ApiResponse<PostDetailResponse> detail(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getPublishedPostDetail(postId));
    }

    /**
     * 下载已发布帖子 markdown 内容。
     *
     * @param postId 帖子 ID
     * @return markdown 文本下载响应
     */
    @GetMapping("/{post_id}/markdown")
    @RateLimit(key = "posts.markdown.download", limit = 120, windowSeconds = 60)
    @Operation(summary = "下载帖子 markdown", description = "返回 text/markdown 内容并携带附件文件名")
    public ResponseEntity<byte[]> downloadMarkdown(@PathVariable("post_id") Long postId) {
        String markdown = contentService.downloadPublishedPostMarkdown(postId);
        String fileName = "post-" + postId + ".md";
        byte[] payload = markdown.getBytes(StandardCharsets.UTF_8);
        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType("text/markdown; charset=utf-8"))
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
            .body(payload);
    }

    @GetMapping("/{post_id}/presentation")
    @RateLimit(key = "posts.presentation.detail", limit = 120, windowSeconds = 60)
    @Operation(summary = "查询帖子演示文稿", description = "返回已发布且当前用户可访问的帖子演示文稿信息")
    public ApiResponse<PostPresentationResponse> presentation(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getPublishedPostPresentation(postId));
    }

    @GetMapping("/{post_id}/presentation/ppt-download-url")
    @RateLimit(key = "posts.presentation.download", limit = 120, windowSeconds = 60)
    @Operation(summary = "查询帖子演示文稿 PPT 下载地址", description = "返回已发布且当前用户可访问的演示文稿 PPT 下载地址")
    public ApiResponse<PostPresentationDownloadResponse> presentationDownloadUrl(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.getPublishedPostPresentationDownload(postId));
    }

    /**
     * 内容服务存活探测。
     *
     * @return 固定字符串 {@code pong}
     */
    @GetMapping("/internal/ping")
    @AuditLog(action = "content.ping", resource = "posts")
    @Operation(summary = "内容服务连通性探测", description = "用于快速确认服务链路可用")
    public ApiResponse<String> ping() {
        return ApiResponse.success("pong");
    }
}
