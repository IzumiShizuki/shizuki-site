package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.service.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用中心查询控制器。
 *
 * <p>提供应用卡片分页查询能力。
 */
@RestController
@RequestMapping("/api/v1/apps")
@Tag(name = "App", description = "应用中心查询接口")
public class AppController {

    /**
     * 内容领域服务，承载应用列表查询逻辑。
     */
    private final ContentService contentService;

    /**
     * 构造应用中心控制器。
     *
     * @param contentService 内容领域服务
     */
    public AppController(ContentService contentService) {
        this.contentService = contentService;
    }

    /**
     * 分页查询应用列表。
     *
     * @param pageNo 页码（从 1 开始）
     * @param pageSize 分页大小
     * @return 应用卡片分页结果
     */
    @GetMapping
    @Operation(summary = "分页查询应用", description = "按 pageNo/pageSize 分页返回应用卡片列表")
    public ApiResponse<PageResponse<AppSummary>> list(@RequestParam(name = "page_no", defaultValue = "1") long pageNo,
                                                      @RequestParam(name = "page_size", defaultValue = "10") long pageSize) {
        return ApiResponse.success(contentService.listApps(pageNo, pageSize));
    }
}
