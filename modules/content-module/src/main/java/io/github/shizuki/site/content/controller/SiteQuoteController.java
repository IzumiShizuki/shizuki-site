package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.content.service.widget.DailyQuoteQueryService;
import io.github.shizuki.site.content.service.widget.DailyQuoteView;
import java.time.Duration;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/site/quote")
public class SiteQuoteController {

    private static final CacheControl TODAY_CACHE = CacheControl.maxAge(Duration.ofMinutes(5))
        .cachePublic();

    private final DailyQuoteQueryService queryService;

    public SiteQuoteController(DailyQuoteQueryService queryService) {
        this.queryService = queryService;
    }

    @GetMapping("/today")
    public ResponseEntity<ApiResponse<DailyQuoteView>> today() {
        return ResponseEntity.ok()
            .cacheControl(TODAY_CACHE)
            .body(ApiResponse.success(queryService.today()));
    }

    @GetMapping("/alternatives")
    public ResponseEntity<ApiResponse<DailyQuoteView>> alternative(
        @RequestParam(name = "after_quote_id", required = false) Long afterQuoteId
    ) {
        return ResponseEntity.ok()
            .header(HttpHeaders.CACHE_CONTROL, "private, no-store, max-age=0")
            .header(HttpHeaders.PRAGMA, "no-cache")
            .body(ApiResponse.success(queryService.alternative(afterQuoteId)));
    }
}
