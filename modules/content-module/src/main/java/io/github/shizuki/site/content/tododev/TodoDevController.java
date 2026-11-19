package io.github.shizuki.site.content.tododev;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.mcp.AccountMcpTokenService;
import jakarta.servlet.http.HttpServletRequest;
import io.github.shizuki.site.content.tododev.TodoDevContract.*;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TodoDevController.PREFIX)
public class TodoDevController {
    public static final String PREFIX = "/api/v1/light-apps/todos/dev";
    private final TodoDevCredential credential;
    private final TodoDevService service;

    public TodoDevController(TodoDevCredential credential, TodoDevService service) {
        this.credential = credential;
        this.service = service;
    }

    @GetMapping
    public ApiResponse<List<Summary>> search(
        HttpServletRequest request,
        @RequestParam(value = "q", required = false) String q,
        @RequestParam(value = "project_id", required = false) Long projectId
    ) {
        return ApiResponse.success(service.search(agent(request), q, projectId));
    }

    @GetMapping("/overview")
    public ApiResponse<List<Summary>> overview(
        HttpServletRequest request
    ) {
        return ApiResponse.success(service.search(human(request), null, null));
    }

    @GetMapping("/{id:[0-9]+}")
    public ApiResponse<Context> context(@PathVariable("id") Long id,
        HttpServletRequest request) {
        return ApiResponse.success(service.context(hasMcpHeader(request) ? agent(request) : human(request), id));
    }

    @PostMapping("/{id:[0-9]+}/enable")
    public ApiResponse<Context> enable(@PathVariable("id") Long id, @Valid @RequestBody Enable body,
        HttpServletRequest request) {
        return ApiResponse.success(service.enable(human(request), id, body));
    }

    @PostMapping("/{id:[0-9]+}/progress")
    public ApiResponse<Context> progress(@PathVariable("id") Long id, @Valid @RequestBody Write body,
        HttpServletRequest request) {
        return ApiResponse.success(service.progress(agent(request), id, body));
    }

    @PostMapping("/{id:[0-9]+}/submit")
    public ApiResponse<Context> submit(@PathVariable("id") Long id, @Valid @RequestBody Write body,
        HttpServletRequest request) {
        return ApiResponse.success(service.submit(agent(request), id, body));
    }

    @PostMapping("/{id:[0-9]+}/approve")
    public ApiResponse<Context> approve(@PathVariable("id") Long id, @Valid @RequestBody Approve body,
        HttpServletRequest request) {
        return ApiResponse.success(service.approve(human(request), id, body));
    }

    private TodoDevCredential.Actor agent(HttpServletRequest request) {
        return credential.agent(oneHeader(request, AccountMcpTokenService.HEADER),
            oneHeader(request, TodoDevCredential.RETIRED_HEADER));
    }

    private TodoDevCredential.Actor human(HttpServletRequest request) {
        if (hasMcpHeader(request)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "This action requires a website login");
        }
        return credential.human();
    }

    private static boolean hasMcpHeader(HttpServletRequest request) {
        return request.getHeader(AccountMcpTokenService.HEADER) != null ||
            request.getHeader(TodoDevCredential.RETIRED_HEADER) != null;
    }

    private static String oneHeader(HttpServletRequest request, String name) {
        var values = request.getHeaders(name);
        if (!values.hasMoreElements()) {
            return null;
        }
        String value = values.nextElement();
        if (values.hasMoreElements()) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Use one MCP credential");
        }
        return value;
    }
}
