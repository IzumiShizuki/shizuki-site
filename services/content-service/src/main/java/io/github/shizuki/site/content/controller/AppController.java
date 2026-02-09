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

@RestController
@RequestMapping("/api/v1/apps")
@Tag(name = "App", description = "应用中心查询接口")
public class AppController {

    private final ContentService contentFacade;

    public AppController(ContentService contentFacade) {
        this.contentFacade = contentFacade;
    }

    @GetMapping
    @Operation(summary = "分页查询应用", description = "按 pageNo/pageSize 分页返回应用卡片列表")
    public ApiResponse<PageResponse<AppSummary>> list(@RequestParam(name = "page_no", defaultValue = "1") long pageNo,
                                                      @RequestParam(name = "page_size", defaultValue = "10") long pageSize) {
        return ApiResponse.success(contentFacade.listApps(pageNo, pageSize));
    }
}
