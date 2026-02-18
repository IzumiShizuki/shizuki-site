package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 交互行为控制器。
 *
 * <p>负责点赞与举报等用户互动接口。
 */
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Interaction", description = "点赞与举报交互接口")
public class InteractionController {

    /**
     * 内容领域服务，承载点赞与举报业务逻辑。
     */
    private final ContentService contentService;

    /**
     * 构造交互行为控制器。
     *
     * @param contentService 内容领域服务
     */
    public InteractionController(ContentService contentService) {
        this.contentService = contentService;
    }

    /**
     * 点赞帖子。
     *
     * @param postId 帖子 ID
     * @return 点赞结果（目标 ID、点赞状态等）
     */
    @PostMapping("/posts/{post_id}/likes")
    @AuditLog(action = "post.like", resource = "post")
    @Operation(summary = "点赞帖子")
    public ApiResponse<Map<String, Object>> likePost(@PathVariable("post_id") Long postId) {
        return ApiResponse.success(contentService.likePost(postId));
    }

    /**
     * 点赞应用。
     *
     * @param appId 应用 ID
     * @return 点赞结果（目标 ID、点赞状态等）
     */
    @PostMapping("/apps/{app_id}/likes")
    @AuditLog(action = "app.like", resource = "app")
    @Operation(summary = "点赞应用")
    public ApiResponse<Map<String, Object>> likeApp(@PathVariable("app_id") Long appId) {
        return ApiResponse.success(contentService.likeApp(appId));
    }

    /**
     * 提交举报。
     *
     * @param request 举报请求，包含举报目标类型、目标 ID 与举报原因
     * @return 举报创建结果
     */
    @PostMapping("/reports")
    @AuditLog(action = "report.create", resource = "report")
    @Operation(summary = "提交举报", description = "支持举报帖子或应用")
    public ApiResponse<Map<String, Object>> report(@Valid @RequestBody ReportRequest request) {
        return ApiResponse.success(contentService.report(request));
    }
}
