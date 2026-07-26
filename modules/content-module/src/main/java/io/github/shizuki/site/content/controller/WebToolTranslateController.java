package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.support.TranslateToolService;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web Toolbox「文本翻译」代理接口。
 *
 * <p>路径挂在 {@code /api/v1/tools/**} 下并加入 gateway 的 guest-paths，
 * 访客无需登录即可使用；API Key 始终只存在于服务端。</p>
 */
@RestController
@RequestMapping("/api/v1/tools/translate")
public class WebToolTranslateController {

    private final TranslateToolService translateToolService;

    public WebToolTranslateController(TranslateToolService translateToolService) {
        this.translateToolService = translateToolService;
    }

    /** 查询翻译引擎的启用与配置状态，供前端展示可用引擎。 */
    @GetMapping("/providers")
    public Map<String, Object> providers() {
        return Map.of("data", translateToolService.providers());
    }

    /** 执行翻译。请求体：{@code {text, from, to, provider}}，语言使用统一代码。 */
    @PostMapping
    public Map<String, Object> translate(@RequestBody TranslateRequest request, HttpServletRequest httpRequest) {
        TranslateToolService.TranslationResult result = translateToolService.translate(
            request == null ? null : request.provider(),
            request == null ? null : request.text(),
            request == null ? null : request.from(),
            request == null ? null : request.to(),
            resolveClientKey(httpRequest));
        return Map.of("data", result);
    }

    @ExceptionHandler(TranslateToolService.TranslateToolException.class)
    public ResponseEntity<Map<String, Object>> handleTranslateException(
        TranslateToolService.TranslateToolException exception) {
        Map<String, Object> body = Map.of(
            "status", exception.getStatus(),
            "code", exception.getCode(),
            "detail", exception.getMessage());
        return ResponseEntity.status(exception.getStatus())
            .contentType(MediaType.APPLICATION_PROBLEM_JSON)
            .body(body);
    }

    static String resolveClientKey(HttpServletRequest request) {
        if (request == null) {
            return "anonymous";
        }
        String forwarded = request.getHeader("X-Forwarded-For");
        if (forwarded != null && !forwarded.isBlank()) {
            String first = forwarded.split(",", 2)[0].trim();
            if (!first.isEmpty()) {
                return first;
            }
        }
        String realIp = request.getHeader("X-Real-IP");
        if (realIp != null && !realIp.isBlank()) {
            return realIp.trim();
        }
        String remote = request.getRemoteAddr();
        return remote == null || remote.isBlank() ? "anonymous" : remote;
    }

    /** 前端请求体；字段均为单个单词，兼容 snake_case 序列化约定。 */
    public record TranslateRequest(String text, String from, String to, String provider) {
    }
}
