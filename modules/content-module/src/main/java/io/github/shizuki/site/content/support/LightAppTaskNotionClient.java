package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import java.net.http.HttpClient;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

@Component
public class LightAppTaskNotionClient {

    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS = Set.of(TransientTaskNotionException.class);

    private final LightAppTaskNotionProperties properties;
    private final RestClient restClient;
    private final SpringRetryExecutor retryExecutor;
    private final ObjectMapper objectMapper;
    private final AtomicLong lastRequestAtMs = new AtomicLong(0L);

    public LightAppTaskNotionClient(LightAppTaskNotionProperties properties,
                                    RestClient.Builder restClientBuilder,
                                    SpringRetryExecutor retryExecutor,
                                    ObjectMapper objectMapper) {
        this.properties = properties;
        this.retryExecutor = retryExecutor;
        this.objectMapper = objectMapper;
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(properties.getReadTimeoutMs()));
        this.restClient = restClientBuilder
            .baseUrl(properties.getApiBaseUrl())
            .requestFactory(requestFactory)
            .build();
    }

    public boolean isConfigured() {
        return properties.isConfigured();
    }

    public TaskDataSourceSchema retrieveDataSourceSchema() {
        Map<String, Object> response = exchange("GET", "/data-sources/" + properties.getDataSourceId(), null);
        Map<String, Object> propertiesPayload = castMap(response.get("properties"));
        return new TaskDataSourceSchema(
            asString(response.get("id")),
            requireProperty(propertiesPayload, properties.getProperties().getTitle()),
            requireProperty(propertiesPayload, properties.getProperties().getStatus()),
            requireProperty(propertiesPayload, properties.getProperties().getProjectCode()),
            requireProperty(propertiesPayload, properties.getProperties().getSchedule()),
            requireProperty(propertiesPayload, properties.getProperties().getShowOnCalendar()),
            readStatusOptions(propertiesPayload)
        );
    }

    public PageData createPage(Map<String, Object> propertiesPayload) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("parent", Map.of("data_source_id", properties.getDataSourceId()));
        body.put("properties", propertiesPayload);
        Map<String, Object> response = exchange("POST", "/pages", body);
        return toPageData(response);
    }

    public PageData updatePage(String pageId, Map<String, Object> propertiesPayload, boolean eraseContent) {
        Map<String, Object> body = new LinkedHashMap<>();
        if (propertiesPayload != null && !propertiesPayload.isEmpty()) {
            body.put("properties", propertiesPayload);
        }
        if (eraseContent) {
            body.put("erase_content", true);
        }
        Map<String, Object> response = exchange("PATCH", "/pages/" + pageId, body);
        return toPageData(response);
    }

    public PageData retrievePage(String pageId) {
        Map<String, Object> response = exchange("GET", "/pages/" + pageId, null);
        return toPageData(response);
    }

    public void trashPage(String pageId) {
        exchange("PATCH", "/pages/" + pageId, Map.of("in_trash", true));
    }

    public List<PageData> queryPages() {
        List<PageData> pages = new ArrayList<>();
        String cursor = null;
        do {
            Map<String, Object> body = new LinkedHashMap<>();
            body.put("page_size", 100);
            body.put("result_type", "page");
            if (StringUtils.hasText(cursor)) {
                body.put("start_cursor", cursor);
            }
            Map<String, Object> response = exchange("POST", "/data-sources/" + properties.getDataSourceId() + "/query", body);
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> results = (List<Map<String, Object>>) response.getOrDefault("results", List.of());
            for (Map<String, Object> result : results) {
                pages.add(toPageData(result));
            }
            cursor = asString(response.get("next_cursor"));
        } while (StringUtils.hasText(cursor));
        return pages;
    }

    public List<Map<String, Object>> listBlockChildrenRecursively(String blockId) {
        List<Map<String, Object>> results = new ArrayList<>();
        String cursor = null;
        do {
            StringBuilder path = new StringBuilder("/blocks/").append(blockId).append("/children?page_size=100");
            if (StringUtils.hasText(cursor)) {
                path.append("&start_cursor=").append(cursor);
            }
            Map<String, Object> payload = exchange("GET", path.toString(), null);
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> pageResults = (List<Map<String, Object>>) payload.getOrDefault("results", List.of());
            for (Map<String, Object> child : pageResults) {
                boolean hasChildren = Boolean.TRUE.equals(child.get("has_children"));
                if (hasChildren && isSupportedNestedBlock(asString(child.get("type")))) {
                    String childId = asString(child.get("id"));
                    List<Map<String, Object>> nested = listBlockChildrenRecursively(childId);
                    Map<String, Object> typedPayload = castMap(child.get(child.get("type")));
                    Map<String, Object> mutable = new LinkedHashMap<>(typedPayload);
                    mutable.put("children", nested);
                    child.put(asString(child.get("type")), mutable);
                }
                results.add(child);
            }
            cursor = asString(payload.get("next_cursor"));
        } while (StringUtils.hasText(cursor));
        return results;
    }

    public void replaceBlockChildren(String pageId, List<Map<String, Object>> blocks) {
        updatePage(pageId, Map.of(), true);
        if (blocks == null || blocks.isEmpty()) {
            return;
        }
        int fromIndex = 0;
        while (fromIndex < blocks.size()) {
            int toIndex = Math.min(fromIndex + 100, blocks.size());
            List<Map<String, Object>> batch = blocks.subList(fromIndex, toIndex);
            exchange("PATCH", "/blocks/" + pageId + "/children", Map.of("children", batch));
            fromIndex = toIndex;
        }
    }

    private List<StatusOptionData> readStatusOptions(Map<String, Object> propertiesPayload) {
        Map<String, Object> statusProperty = requireProperty(propertiesPayload, properties.getProperties().getStatus());
        Map<String, Object> statusConfig = castMap(statusProperty.get("status"));
        List<StatusOptionData> options = new ArrayList<>();
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rawOptions = (List<Map<String, Object>>) statusConfig.getOrDefault("options", List.of());
        for (Map<String, Object> option : rawOptions) {
            String optionId = asString(option.get("id"));
            String name = asString(option.get("name"));
            if (!StringUtils.hasText(optionId) || !StringUtils.hasText(name)) {
                continue;
            }
            options.add(new StatusOptionData(optionId, name, asString(option.get("color"))));
        }
        return options;
    }

    private Map<String, Object> requireProperty(Map<String, Object> propertiesPayload, String propertyName) {
        Map<String, Object> property = castMap(propertiesPayload.get(propertyName));
        if (!property.isEmpty()) {
            return property;
        }
        for (Object value : propertiesPayload.values()) {
            Map<String, Object> candidate = castMap(value);
            if (propertyName.equals(asString(candidate.get("name")))) {
                return candidate;
            }
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Notion property not found: " + propertyName);
    }

    private Map<String, Object> exchange(String method, String path, Map<String, Object> body) {
        ensureConfigured();
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            properties.getRetryCount() + 1,
            properties.getRetryBackoffMs(),
            properties.getRetryMaxBackoffMs()
        );
        return retryExecutor.execute(retrySpec, RETRYABLE_EXCEPTIONS, () -> exchangeOnce(method, path, body));
    }

    private Map<String, Object> exchangeOnce(String method, String path, Map<String, Object> body) {
        throttle();
        try {
            if ("GET".equals(method)) {
                RestClient.RequestHeadersSpec<?> request = restClient.get()
                    .uri(path)
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + properties.getToken().trim())
                    .header("Notion-Version", properties.getVersion());
                return request.retrieve().body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            }
            RestClient.RequestBodySpec request = switch (method) {
                case "POST" -> restClient.post().uri(path).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
                case "PATCH" -> restClient.patch().uri(path).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
                default -> throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Unsupported notion http method");
            };
            request.header("Authorization", "Bearer " + properties.getToken().trim());
            request.header("Notion-Version", properties.getVersion());
            if (body != null) {
                return request.body(body).retrieve().body(new ParameterizedTypeReference<Map<String, Object>>() {
                });
            }
            return request.retrieve().body(new ParameterizedTypeReference<Map<String, Object>>() {
            });
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().value() == 429 || ex.getStatusCode().is5xxServerError()) {
                sleepRetryAfter(ex);
                throw new TransientTaskNotionException("task_notion_transient", ex);
            }
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Notion request failed: " + sanitizeUpstreamMessage(ex)
            );
        } catch (ResourceAccessException ex) {
            throw new TransientTaskNotionException("task_notion_network", ex);
        }
    }

    private void throttle() {
        long intervalMs = Math.max(1L, 1000L / Math.max(1, properties.getRateLimitPerSecond()));
        long now = System.currentTimeMillis();
        long previous = lastRequestAtMs.get();
        long delta = now - previous;
        if (delta < intervalMs) {
            try {
                Thread.sleep(intervalMs - delta);
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
        lastRequestAtMs.set(System.currentTimeMillis());
    }

    private void sleepRetryAfter(RestClientResponseException ex) {
        Collection<String> values = ex.getResponseHeaders() == null ? List.of() : ex.getResponseHeaders().get("Retry-After");
        if (values == null || values.isEmpty()) {
            return;
        }
        String raw = values.iterator().next();
        try {
            long seconds = Long.parseLong(raw.trim());
            Thread.sleep(Math.max(0L, seconds) * 1000L);
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        } catch (RuntimeException ignored) {
            // ignore malformed Retry-After
        }
    }

    private String sanitizeUpstreamMessage(RestClientResponseException ex) {
        String body = ex.getResponseBodyAsString();
        if (!StringUtils.hasText(body)) {
            return "status=" + ex.getStatusCode().value();
        }
        try {
            Map<String, Object> payload = objectMapper.readValue(body, new TypeReference<Map<String, Object>>() {
            });
            String code = asString(payload.get("code"));
            String message = asString(payload.get("message"));
            if (StringUtils.hasText(code) || StringUtils.hasText(message)) {
                return (code + " " + message).trim();
            }
        } catch (Exception ignored) {
            // ignore json parsing errors
        }
        return body.length() > 240 ? body.substring(0, 240) + "..." : body;
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> castMap(Object value) {
        if (value instanceof Map<?, ?> map) {
            return (Map<String, Object>) map;
        }
        return Map.of();
    }

    private boolean isSupportedNestedBlock(String type) {
        return "bulleted_list_item".equals(type)
            || "numbered_list_item".equals(type)
            || "to_do".equals(type)
            || "toggle".equals(type)
            || "quote".equals(type);
    }

    private void ensureConfigured() {
        if (!properties.isConfigured()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Task notion integration is not configured");
        }
    }

    private String asString(Object value) {
        return value == null ? "" : String.valueOf(value).trim();
    }

    private PageData toPageData(Map<String, Object> payload) {
        Map<String, Object> propertiesPayload = castMap(payload.get("properties"));
        return new PageData(
            asString(payload.get("id")),
            propertiesPayload,
            parseDateTime(asString(payload.get("last_edited_time"))),
            Boolean.TRUE.equals(payload.get("in_trash"))
        );
    }

    private LocalDateTime parseDateTime(String value) {
        if (!StringUtils.hasText(value)) {
            return null;
        }
        try {
            return OffsetDateTime.parse(value).toLocalDateTime();
        } catch (RuntimeException ignored) {
            return LocalDate.parse(value).atStartOfDay();
        }
    }

    public record StatusOptionData(String optionId, String name, String color) {
    }

    public record TaskDataSourceSchema(String dataSourceId,
                                       Map<String, Object> titleProperty,
                                       Map<String, Object> statusProperty,
                                       Map<String, Object> projectCodeProperty,
                                       Map<String, Object> scheduleProperty,
                                       Map<String, Object> showOnCalendarProperty,
                                       List<StatusOptionData> statusOptions) {
    }

    public record PageData(String pageId, Map<String, Object> properties, LocalDateTime lastEditedTime, boolean inTrash) {
    }

    private static class TransientTaskNotionException extends RuntimeException {
        private TransientTaskNotionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
