package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.content.annotation.RequirePersonalContentStudio;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.request.LocalQuoteRequest;
import io.github.shizuki.site.content.request.QuoteReviewRequest;
import io.github.shizuki.site.content.request.SiteWidgetConfigurationRequest;
import io.github.shizuki.site.content.service.widget.DailyQuoteAdminService;
import io.github.shizuki.site.content.service.widget.LocalQuoteCommand;
import io.github.shizuki.site.content.service.widget.LocalQuoteCurationService;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationCommand;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationService;
import io.github.shizuki.site.content.service.widget.SiteWidgetConfigurationSnapshot;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/site-widgets")
@RequirePersonalContentStudio
@RequireGroup("ADMIN")
@RequirePermission("site.widgets.manage")
public class AdminSiteWidgetController {

    private final SiteWidgetConfigurationService configurationService;
    private final LocalQuoteCurationService quoteService;
    private final DailyQuoteAdminService dailyQuoteAdminService;

    public AdminSiteWidgetController(
        SiteWidgetConfigurationService configurationService,
        LocalQuoteCurationService quoteService,
        DailyQuoteAdminService dailyQuoteAdminService
    ) {
        this.configurationService = configurationService;
        this.quoteService = quoteService;
        this.dailyQuoteAdminService = dailyQuoteAdminService;
    }

    @GetMapping("/configuration")
    public ResponseEntity<ApiResponse<SiteWidgetConfigurationSnapshot>> configuration() {
        return noStore(configurationService.getConfiguration());
    }

    @PutMapping("/configuration")
    @RateLimit(key = "admin.site-widgets.configuration", limit = 20, windowSeconds = 60)
    @AuditLog(action = "site.widgets.configuration.update", resource = "site_widget_configuration")
    public ResponseEntity<ApiResponse<SiteWidgetConfigurationSnapshot>> saveConfiguration(
        @Valid @RequestBody SiteWidgetConfigurationRequest request
    ) {
        return noStore(configurationService.save(new SiteWidgetConfigurationCommand(
            request.expectedVersion(),
            request.displayName(),
            request.latitude(),
            request.longitude(),
            request.timezone(),
            request.weatherEnabled(),
            request.weatherMaxStaleMinutes(),
            request.quoteSourceMode(),
            request.hitokotoEnabled()
        )));
    }

    @GetMapping("/quotes")
    public ResponseEntity<ApiResponse<List<QuoteEntity>>> quotes(
        @RequestParam(name = "limit", defaultValue = "100") int limit
    ) {
        return noStore(quoteService.list(limit));
    }

    @GetMapping("/quotes/{quote_id}")
    public ResponseEntity<ApiResponse<QuoteEntity>> quote(
        @PathVariable("quote_id") long quoteId
    ) {
        return noStore(quoteService.get(quoteId));
    }

    @PostMapping("/quotes")
    @RateLimit(key = "admin.site-widgets.quotes.create", limit = 30, windowSeconds = 60)
    @AuditLog(action = "site.widgets.quote.create", resource = "quote")
    public ResponseEntity<ApiResponse<QuoteEntity>> createQuote(
        @Valid @RequestBody LocalQuoteRequest request
    ) {
        return noStore(quoteService.create(command(request)));
    }

    @PutMapping("/quotes/{quote_id}")
    @RateLimit(key = "admin.site-widgets.quotes.edit", limit = 30, windowSeconds = 60)
    @AuditLog(action = "site.widgets.quote.edit", resource = "quote")
    public ResponseEntity<ApiResponse<QuoteEntity>> editQuote(
        @PathVariable("quote_id") long quoteId,
        @RequestParam("expected_version") int expectedVersion,
        @Valid @RequestBody LocalQuoteRequest request
    ) {
        return noStore(quoteService.edit(quoteId, expectedVersion, command(request)));
    }

    @PutMapping("/quotes/{quote_id}/review")
    @RateLimit(key = "admin.site-widgets.quotes.review", limit = 30, windowSeconds = 60)
    @AuditLog(action = "site.widgets.quote.review", resource = "quote")
    public ResponseEntity<ApiResponse<QuoteEntity>> reviewQuote(
        @PathVariable("quote_id") long quoteId,
        @Valid @RequestBody QuoteReviewRequest request
    ) {
        return noStore(quoteService.review(
            quoteId,
            request.expectedVersion(),
            request.approvalStatus(),
            request.enabled()
        ));
    }

    @DeleteMapping("/quotes/{quote_id}")
    @RateLimit(key = "admin.site-widgets.quotes.delete", limit = 20, windowSeconds = 60)
    @AuditLog(action = "site.widgets.quote.delete", resource = "quote")
    public ResponseEntity<ApiResponse<Boolean>> deleteQuote(
        @PathVariable("quote_id") long quoteId,
        @RequestParam("expected_version") int expectedVersion
    ) {
        quoteService.delete(quoteId, expectedVersion);
        return noStore(true);
    }

    @PostMapping("/quote/refresh")
    @RateLimit(key = "admin.site-widgets.quote.refresh", limit = 10, windowSeconds = 60)
    @AuditLog(action = "site.widgets.quote.refresh", resource = "daily_quote_snapshot")
    public ResponseEntity<ApiResponse<DailyQuoteSnapshotEntity>> refreshQuote() {
        return noStore(dailyQuoteAdminService.refreshMissingToday());
    }

    private LocalQuoteCommand command(LocalQuoteRequest request) {
        return new LocalQuoteCommand(
            request.text(),
            request.author(),
            request.sourceTitle(),
            request.categoryCode(),
            request.providerCode(),
            request.providerUuid(),
            request.sourceUrl()
        );
    }

    private <T> ResponseEntity<ApiResponse<T>> noStore(T value) {
        return ResponseEntity.ok()
            .cacheControl(CacheControl.noStore())
            .body(ApiResponse.success(value));
    }
}
