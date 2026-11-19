package io.github.shizuki.site.content.tododev;

import io.github.shizuki.common.core.response.ApiResponse;
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
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token,
        @RequestParam(value = "q", required = false) String q,
        @RequestParam(value = "project_id", required = false) Long projectId
    ) {
        return ApiResponse.success(service.search(credential.agent(token), q, projectId));
    }

    @GetMapping("/overview")
    public ApiResponse<List<Summary>> overview(
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token
    ) {
        return ApiResponse.success(service.search(credential.human(token), null, null));
    }

    @GetMapping("/{id:[0-9]+}")
    public ApiResponse<Context> context(@PathVariable("id") Long id,
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token) {
        return ApiResponse.success(service.context(token == null ? credential.human(null) : credential.agent(token), id));
    }

    @PostMapping("/{id:[0-9]+}/enable")
    public ApiResponse<Context> enable(@PathVariable("id") Long id, @Valid @RequestBody Enable body,
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token) {
        return ApiResponse.success(service.enable(credential.human(token), id, body));
    }

    @PostMapping("/{id:[0-9]+}/progress")
    public ApiResponse<Context> progress(@PathVariable("id") Long id, @Valid @RequestBody Write body,
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token) {
        return ApiResponse.success(service.progress(credential.agent(token), id, body));
    }

    @PostMapping("/{id:[0-9]+}/submit")
    public ApiResponse<Context> submit(@PathVariable("id") Long id, @Valid @RequestBody Write body,
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token) {
        return ApiResponse.success(service.submit(credential.agent(token), id, body));
    }

    @PostMapping("/{id:[0-9]+}/approve")
    public ApiResponse<Context> approve(@PathVariable("id") Long id, @Valid @RequestBody Approve body,
        @RequestHeader(value = TodoDevCredential.HEADER, required = false) String token) {
        return ApiResponse.success(service.approve(credential.human(token), id, body));
    }
}
