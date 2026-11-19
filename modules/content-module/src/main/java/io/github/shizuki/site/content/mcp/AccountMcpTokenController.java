package io.github.shizuki.site.content.mcp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.content.tododev.TodoDevCredential;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AccountMcpTokenController.PREFIX)
public class AccountMcpTokenController {
    public static final String PREFIX = "/api/v1/mcp/account-token";
    private final AccountMcpTokenService service;

    public AccountMcpTokenController(AccountMcpTokenService service) {
        this.service = service;
    }

    @GetMapping
    public ApiResponse<Status> status(HttpServletRequest request) {
        return ApiResponse.success(Status.from(service.status(webUser(request))));
    }

    @GetMapping("/scopes/todo-dev/projects")
    public ApiResponse<List<Project>> projects(HttpServletRequest request) {
        return ApiResponse.success(service.projects(webUser(request)).stream()
            .map(p -> new Project(p.projectId(), p.name())).toList());
    }

    @PostMapping("/rotate")
    public ResponseEntity<ApiResponse<Issued>> rotate(HttpServletRequest request) {
        var issued = service.rotate(webUser(request));
        var status = issued.status();
        return ResponseEntity.ok().cacheControl(CacheControl.noStore()).body(ApiResponse.success(
            new Issued(status.active(), status.createdAt(), status.lastRotatedAt(), status.scopes(),
                status.todoProjectId(), issued.token())));
    }

    @DeleteMapping
    public ApiResponse<Status> revoke(HttpServletRequest request) {
        return ApiResponse.success(Status.from(service.revoke(webUser(request))));
    }

    @PutMapping("/scopes/todo-dev")
    public ApiResponse<Status> bindTodoProject(HttpServletRequest request, @RequestBody JsonNode body) {
        long userId = webUser(request);
        JsonNode projectId = body.isObject() ? body.get("projectId") : null;
        if (projectId == null || body.size() != 1) {
            throw invalidProjectId();
        }
        Long parsed = null;
        if (!projectId.isNull()) {
            if (!projectId.isTextual() || !projectId.textValue().matches("[1-9][0-9]{0,18}")) {
                throw invalidProjectId();
            }
            try {
                parsed = Long.parseLong(projectId.textValue());
            } catch (NumberFormatException ex) {
                throw invalidProjectId();
            }
        }
        return ApiResponse.success(Status.from(service.bindTodoProject(userId, parsed)));
    }

    private static long webUser(HttpServletRequest request) {
        if (request.getHeader(AccountMcpTokenService.HEADER) != null ||
            request.getHeader(TodoDevCredential.RETIRED_HEADER) != null) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "This action requires a website login");
        }
        return LoginUserContext.get().filter(user -> !user.inGroup("GUEST") && !user.inGroup("GUEST_AUTHOR"))
            .map(user -> user.getUserId()).filter(id -> id > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
    }

    private static BusinessException invalidProjectId() {
        return new BusinessException(ErrorCode.BAD_REQUEST, "projectId must be a positive decimal string or null");
    }

    public record Status(boolean active, @JsonProperty("createdAt") String createdAt,
                         @JsonProperty("lastRotatedAt") String lastRotatedAt,
                         List<String> scopes, @JsonProperty("todoProjectId") String todoProjectId) {
        static Status from(AccountMcpTokenService.Status value) {
            return new Status(value.active(), value.createdAt(), value.lastRotatedAt(), value.scopes(), value.todoProjectId());
        }
    }

    public record Issued(boolean active, @JsonProperty("createdAt") String createdAt,
                         @JsonProperty("lastRotatedAt") String lastRotatedAt, List<String> scopes,
                         @JsonProperty("todoProjectId") String todoProjectId, String token) {
        @Override public String toString() { return "Issued[token=<redacted>]"; }
    }

    public record Project(@JsonProperty("projectId") String projectId, String name) { }
}
