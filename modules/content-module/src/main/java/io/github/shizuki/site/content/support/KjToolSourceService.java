package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.LongSupplier;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

/**
 * Read-only integration with the public KJ application community.
 *
 * <p>The browser never supplies an upstream URL or action. Only the fixed
 * {@code apps} and {@code app_detail} actions are reachable through this service.</p>
 */
@Service
public class KjToolSourceService {

    private static final String SOURCE_NAME = "KJ 应用社区";
    private static final Pattern TOOL_ID_PATTERN = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]{0,127}");
    private static final Set<String> DOCUMENT_TYPES = Set.of("code", "plugin-code", "widget-custom");
    private static final Set<String> WEBSITE_TYPES = Set.of("website", "widget-url");

    private final KjToolSourceProperties properties;
    private final ObjectMapper objectMapper;
    private final UpstreamGateway upstreamGateway;
    private final LongSupplier nowSupplier;
    private final Object catalogLock = new Object();
    private final Object detailLock = new Object();
    private final ConcurrentHashMap<String, CacheEntry<ToolDetailView>> detailCache = new ConcurrentHashMap<>();
    private volatile CacheEntry<CatalogView> catalogCache;

    public KjToolSourceService(KjToolSourceProperties properties, ObjectMapper objectMapper) {
        this(properties, objectMapper, new HttpUpstreamGateway(properties), System::currentTimeMillis);
    }

    KjToolSourceService(KjToolSourceProperties properties,
                        ObjectMapper objectMapper,
                        UpstreamGateway upstreamGateway,
                        LongSupplier nowSupplier) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        this.upstreamGateway = upstreamGateway;
        this.nowSupplier = nowSupplier;
    }

    public CatalogView catalog(boolean refresh) {
        if (!properties.isEnabled()) {
            return new CatalogView(false, SOURCE_NAME, sourceHomeUrl(), List.of(), List.of());
        }

        long now = nowSupplier.getAsLong();
        CacheEntry<CatalogView> cached = catalogCache;
        if (!refresh && cached != null && cached.expiresAtMs() > now) {
            return cached.value();
        }

        synchronized (catalogLock) {
            now = nowSupplier.getAsLong();
            cached = catalogCache;
            if (!refresh && cached != null && cached.expiresAtMs() > now) {
                return cached.value();
            }
            JsonNode root = readUpstream("apps", null, "KJ 工具目录");
            JsonNode apps = root.path("apps");
            if (!apps.isArray()) {
                throw upstreamFormat("KJ 工具目录缺少 apps 数组");
            }

            int limit = Math.max(1, properties.getMaxCatalogItems());
            List<ToolSummaryView> tools = new ArrayList<>();
            for (JsonNode app : apps) {
                if (tools.size() >= limit) {
                    break;
                }
                ToolSummaryView tool = normalizeSummary(app);
                if (tool != null) {
                    tools.add(tool);
                }
            }

            List<CategoryView> categories = new ArrayList<>();
            JsonNode categoryNodes = root.path("categories");
            if (categoryNodes.isArray()) {
                for (JsonNode category : categoryNodes) {
                    String id = text(category, "id", 64);
                    if (!id.isEmpty()) {
                        categories.add(new CategoryView(
                            id,
                            fallback(text(category, "name", 80), id),
                            text(category, "icon", 120)));
                    }
                }
            }

            CatalogView result = new CatalogView(true, SOURCE_NAME, sourceHomeUrl(), categories, tools);
            catalogCache = new CacheEntry<>(result, now + cacheTtlMs());
            return result;
        }
    }

    public ToolDetailView toolDetail(String toolId) {
        String normalizedId = requireToolId(toolId);
        if (!properties.isEnabled()) {
            throw new KjToolSourceException(503, "KJ_SOURCE_DISABLED", "KJ 工具源当前未启用");
        }

        long now = nowSupplier.getAsLong();
        CacheEntry<ToolDetailView> cached = detailCache.get(normalizedId);
        if (cached != null && cached.expiresAtMs() > now) {
            return cached.value();
        }

        synchronized (detailLock) {
            now = nowSupplier.getAsLong();
            cached = detailCache.get(normalizedId);
            if (cached != null && cached.expiresAtMs() > now) {
                return cached.value();
            }

            JsonNode root = readUpstream("app_detail", normalizedId, "KJ 工具详情");
            JsonNode app = root.path("app");
            if (!app.isObject()) {
                throw new KjToolSourceException(404, "KJ_TOOL_NOT_FOUND", "该 KJ 工具不存在或已下架");
            }
            ToolSummaryView summary = normalizeSummary(app);
            if (summary == null || !normalizedId.equals(summary.id())) {
                throw upstreamFormat("KJ 工具详情返回了无效标识");
            }

            ToolDetailView result = normalizeDetail(app, summary);
            pruneDetailCache(now);
            detailCache.put(normalizedId, new CacheEntry<>(result, now + cacheTtlMs()));
            return result;
        }
    }

    private ToolDetailView normalizeDetail(JsonNode app, ToolSummaryView summary) {
        JsonNode config = app.path("config");
        if (config.isTextual()) {
            try {
                config = objectMapper.readTree(config.asText("{}"));
            } catch (JsonProcessingException exception) {
                throw upstreamFormat("KJ 工具配置不是有效 JSON");
            }
        }
        if (!config.isObject()) {
            config = objectMapper.createObjectNode();
        }

        String launchMode = summary.launchMode();
        boolean compatible = summary.compatible();
        String reason = summary.incompatibleReason();
        String html = "";
        String css = "";
        String script = "";
        String url = "";

        if ("document".equals(launchMode)) {
            html = text(config, "html", properties.getMaxResponseBytes());
            css = text(config, "css", properties.getMaxResponseBytes());
            script = text(config, "js", properties.getMaxResponseBytes());
            long payloadBytes = utf8Size(html) + utf8Size(css) + utf8Size(script);
            if (payloadBytes > maxResponseBytes()) {
                throw new KjToolSourceException(413, "KJ_TOOL_TOO_LARGE", "该 KJ 工具内容过大，无法安全打开");
            }
            if (html.isBlank()) {
                compatible = false;
                launchMode = "";
                reason = "该工具没有可运行的 HTML 内容";
            }
        } else if ("website".equals(launchMode)) {
            url = safeHttpUrl(text(config, "url", 2048));
            if (url.isEmpty()) {
                compatible = false;
                launchMode = "";
                reason = "该工具没有有效的 HTTP(S) 地址";
            }
        }

        return new ToolDetailView(
            summary.id(), summary.name(), summary.description(), summary.author(), summary.category(), summary.type(),
            summary.icon(), summary.color(), summary.version(), summary.downloads(), summary.createdAt(), compatible,
            launchMode, reason, html, css, script, url, sourceHomeUrl());
    }

    private ToolSummaryView normalizeSummary(JsonNode app) {
        if (!app.isObject()) {
            return null;
        }
        String id = text(app, "id", 128);
        if (!TOOL_ID_PATTERN.matcher(id).matches()) {
            return null;
        }
        String type = text(app, "type", 64).toLowerCase(Locale.ROOT);
        String launchMode = launchMode(type);
        boolean compatible = !launchMode.isEmpty();
        String reason = compatible ? "" : "KJ 类型 " + fallback(type, "unknown") + " 暂不支持";
        return new ToolSummaryView(
            id,
            fallback(text(app, "name", 160), "未命名工具"),
            text(app, "description", 1000),
            fallback(text(app, "author", 120), "KJ 社区作者"),
            text(app, "category", 64),
            type,
            text(app, "icon", 160),
            fallback(text(app, "color", 32), "#187aff"),
            text(app, "version", 80),
            Math.max(0L, app.path("downloads").asLong(0L)),
            text(app, "createdAt", 40),
            compatible,
            launchMode,
            reason);
    }

    private JsonNode readUpstream(String action, String toolId, String label) {
        String body = upstreamGateway.get(action, toolId, maxResponseBytes());
        if (body == null || body.isBlank()) {
            throw upstreamFormat(label + "返回空响应");
        }
        if (utf8Size(body) > maxResponseBytes()) {
            throw new KjToolSourceException(502, "KJ_SOURCE_RESPONSE_TOO_LARGE", label + "响应超过大小限制");
        }
        try {
            JsonNode root = objectMapper.readTree(body);
            if (root == null || !root.isObject()) {
                throw upstreamFormat(label + "响应不是 JSON 对象");
            }
            return root;
        } catch (JsonProcessingException exception) {
            throw upstreamFormat(label + "响应不是有效 JSON");
        }
    }

    private void pruneDetailCache(long now) {
        detailCache.entrySet().removeIf(entry -> entry.getValue().expiresAtMs() <= now);
        int maxEntries = Math.max(1, properties.getMaxDetailCacheEntries());
        while (detailCache.size() >= maxEntries) {
            detailCache.entrySet().stream()
                .min(Comparator.comparingLong(entry -> entry.getValue().expiresAtMs()))
                .ifPresent(entry -> detailCache.remove(entry.getKey(), entry.getValue()));
        }
    }

    static String requireToolId(String toolId) {
        String normalized = toolId == null ? "" : toolId.trim();
        if (!TOOL_ID_PATTERN.matcher(normalized).matches()) {
            throw new KjToolSourceException(400, "KJ_TOOL_INVALID_ID", "KJ 工具标识格式无效");
        }
        return normalized;
    }

    static String launchMode(String type) {
        if (DOCUMENT_TYPES.contains(type)) {
            return "document";
        }
        if (WEBSITE_TYPES.contains(type)) {
            return "website";
        }
        return "";
    }

    static String safeHttpUrl(String value) {
        try {
            URI uri = URI.create(value == null ? "" : value.trim());
            String scheme = uri.getScheme();
            if (uri.getHost() == null || scheme == null
                || !("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
                return "";
            }
            return uri.toASCIIString();
        } catch (IllegalArgumentException exception) {
            return "";
        }
    }

    private String sourceHomeUrl() {
        return safeHttpUrl(properties.getSourceHomeUrl());
    }

    private long cacheTtlMs() {
        return Math.max(1L, properties.getCacheTtlSeconds()) * 1000L;
    }

    private int maxResponseBytes() {
        return Math.max(1024, properties.getMaxResponseBytes());
    }

    private static long utf8Size(String value) {
        return value == null ? 0L : value.getBytes(StandardCharsets.UTF_8).length;
    }

    private static String text(JsonNode node, String field, int maxLength) {
        String value = node == null ? "" : node.path(field).asText("").trim();
        int limit = Math.max(0, maxLength);
        return value.length() <= limit ? value : value.substring(0, limit);
    }

    private static String fallback(String value, String fallback) {
        return value == null || value.isBlank() ? fallback : value;
    }

    private static KjToolSourceException upstreamFormat(String message) {
        return new KjToolSourceException(502, "KJ_SOURCE_INVALID_RESPONSE", message);
    }

    interface UpstreamGateway {
        String get(String action, String toolId, int maxBytes);
    }

    private static final class HttpUpstreamGateway implements UpstreamGateway {
        private final KjToolSourceProperties properties;
        private final HttpClient httpClient;
        private final URI endpoint;

        private HttpUpstreamGateway(KjToolSourceProperties properties) {
            this.properties = properties;
            this.endpoint = requireEndpoint(properties.getEndpoint());
            this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(Math.max(500, properties.getConnectTimeoutMs())))
                .followRedirects(HttpClient.Redirect.NEVER)
                .build();
        }

        @Override
        public String get(String action, String toolId, int maxBytes) {
            URI requestUri = buildRequestUri(endpoint, action, toolId);
            HttpRequest request = HttpRequest.newBuilder(requestUri)
                .timeout(Duration.ofMillis(Math.max(1000, properties.getReadTimeoutMs())))
                .header("Accept", "application/json")
                .GET()
                .build();
            try {
                HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
                if (response.statusCode() < 200 || response.statusCode() >= 300) {
                    response.body().close();
                    throw new KjToolSourceException(502, "KJ_SOURCE_UPSTREAM_ERROR",
                        "KJ 工具源返回 HTTP " + response.statusCode());
                }
                try (InputStream input = response.body()) {
                    byte[] bytes = input.readNBytes(Math.max(1024, maxBytes) + 1);
                    if (bytes.length > Math.max(1024, maxBytes)) {
                        throw new KjToolSourceException(502, "KJ_SOURCE_RESPONSE_TOO_LARGE", "KJ 工具源响应超过大小限制");
                    }
                    return new String(bytes, StandardCharsets.UTF_8);
                }
            } catch (IOException exception) {
                throw new KjToolSourceException(502, "KJ_SOURCE_UPSTREAM_ERROR", "KJ 工具源连接失败或超时");
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                throw new KjToolSourceException(502, "KJ_SOURCE_UPSTREAM_ERROR", "KJ 工具源请求被中断");
            }
        }

        private static URI requireEndpoint(String value) {
            try {
                URI uri = URI.create(value == null ? "" : value.trim());
                String scheme = uri.getScheme();
                if (uri.getHost() == null || scheme == null
                    || !("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))
                    || uri.getUserInfo() != null) {
                    throw new IllegalArgumentException("invalid endpoint");
                }
                return uri;
            } catch (IllegalArgumentException exception) {
                throw new IllegalStateException("shizuki.tools.kj-source.endpoint 必须是有效的 HTTP(S) 地址", exception);
            }
        }

        private static URI buildRequestUri(URI endpoint, String action, String toolId) {
            String base = endpoint.toASCIIString();
            String separator = base.contains("?") ? "&" : "?";
            StringBuilder url = new StringBuilder(base)
                .append(separator)
                .append("plugin=kj_appstore&action=")
                .append(URLEncoder.encode(action, StandardCharsets.UTF_8));
            if (toolId != null && !toolId.isBlank()) {
                url.append("&id=").append(URLEncoder.encode(toolId, StandardCharsets.UTF_8));
            }
            return URI.create(url.toString());
        }
    }

    private record CacheEntry<T>(T value, long expiresAtMs) {
    }

    public record CategoryView(String id, String name, String icon) {
    }

    public record ToolSummaryView(
        String id,
        String name,
        String description,
        String author,
        String category,
        String type,
        String icon,
        String color,
        String version,
        long downloads,
        String createdAt,
        boolean compatible,
        String launchMode,
        String incompatibleReason
    ) {
    }

    public record CatalogView(
        boolean enabled,
        String sourceName,
        String sourceHomeUrl,
        List<CategoryView> categories,
        List<ToolSummaryView> tools
    ) {
    }

    public record ToolDetailView(
        String id,
        String name,
        String description,
        String author,
        String category,
        String type,
        String icon,
        String color,
        String version,
        long downloads,
        String createdAt,
        boolean compatible,
        String launchMode,
        String incompatibleReason,
        String html,
        String css,
        String script,
        String url,
        String sourceHomeUrl
    ) {
    }

    public static class KjToolSourceException extends RuntimeException {
        private final int status;
        private final String code;

        public KjToolSourceException(int status, String code, String message) {
            super(message);
            this.status = status;
            this.code = code;
        }

        public int getStatus() {
            return status;
        }

        public String getCode() {
            return code;
        }
    }
}
