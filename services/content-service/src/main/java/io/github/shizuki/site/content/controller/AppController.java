package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.service.ContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/apps")
public class AppController {

    private final ContentService contentFacade;

    public AppController(ContentService contentFacade) {
        this.contentFacade = contentFacade;
    }

    @GetMapping
    public ApiResponse<PageResponse<AppSummary>> list(@RequestParam(defaultValue = "1") long pageNo,
                                                      @RequestParam(defaultValue = "10") long pageSize) {
        return ApiResponse.success(contentFacade.listApps(pageNo, pageSize));
    }
}
