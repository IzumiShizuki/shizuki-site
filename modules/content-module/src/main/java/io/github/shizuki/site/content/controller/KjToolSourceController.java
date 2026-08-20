package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.support.KjToolSourceService;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** Guest-accessible read-only endpoints for the KJ light-app source. */
@RestController
@RequestMapping("/api/v1/tools/kj-source")
public class KjToolSourceController {

    private final KjToolSourceService kjToolSourceService;

    public KjToolSourceController(KjToolSourceService kjToolSourceService) {
        this.kjToolSourceService = kjToolSourceService;
    }

    @GetMapping("/catalog")
    public Map<String, Object> catalog(@RequestParam(name = "refresh", defaultValue = "false") boolean refresh) {
        return Map.of("data", kjToolSourceService.catalog(refresh));
    }

    @GetMapping("/tools/{tool_id}")
    public Map<String, Object> toolDetail(@PathVariable("tool_id") String toolId) {
        return Map.of("data", kjToolSourceService.toolDetail(toolId));
    }

    @ExceptionHandler(KjToolSourceService.KjToolSourceException.class)
    public ResponseEntity<Map<String, Object>> handleSourceException(
        KjToolSourceService.KjToolSourceException exception) {
        return ResponseEntity.status(exception.getStatus())
            .contentType(MediaType.APPLICATION_PROBLEM_JSON)
            .body(Map.of(
                "status", exception.getStatus(),
                "code", exception.getCode(),
                "detail", exception.getMessage()));
    }
}
