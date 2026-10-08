package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import io.github.shizuki.site.media.response.WorkshopSearchItemResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Resolves Workshop metadata through Steam API first and the public detail page second. */
@Component
public class WorkshopMetadataProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkshopMetadataProvider.class);
    private static final String WORKSHOP_DETAIL_URL_BASE =
            "https://steamcommunity.com/sharedfiles/filedetails/?id=";
    private static final Pattern WORKSHOP_ITEM_ID_PATTERN = Pattern.compile("^\\d{3,20}$");
    private static final Pattern OG_IMAGE_PATTERN = Pattern.compile(
            "<meta[^>]+property=[\\\"']og:image[\\\"'][^>]+content=[\\\"']([^\\\"']+)[\\\"']|"
                    + "<meta[^>]+content=[\\\"']([^\\\"']+)[\\\"'][^>]+property=[\\\"']og:image[\\\"']",
            Pattern.CASE_INSENSITIVE);
    private static final Pattern OG_TITLE_PATTERN = Pattern.compile(
            "<meta[^>]+property=[\\\"']og:title[\\\"'][^>]+content=[\\\"']([^\\\"']+)[\\\"']|"
                    + "<meta[^>]+content=[\\\"']([^\\\"']+)[\\\"'][^>]+property=[\\\"']og:title[\\\"']",
            Pattern.CASE_INSENSITIVE);

    private final WallpaperDiscoveryProperties properties;
    private final ObjectMapper objectMapper;
    private final WallpaperOutboundClient outboundClient;
    private final Map<String, CachedMetadata> cache = new LinkedHashMap<>(16, 0.75f, true);

    public WorkshopMetadataProvider(WallpaperDiscoveryProperties properties,
                                    ObjectMapper objectMapper,
                                    WallpaperOutboundClient outboundClient) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        this.outboundClient = outboundClient;
    }

    WorkshopMetadata resolve(String itemIdRaw) {
        String itemId = readString(itemIdRaw).trim();
        if (!WORKSHOP_ITEM_ID_PATTERN.matcher(itemId).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "workshop item id is invalid");
        }
        WorkshopMetadata cached = cached(itemId);
        if (cached != null) return cached;
        try {
            WorkshopMetadata result = resolveByApi(itemId);
            remember(result);
            return result;
        } catch (BusinessException exception) {
            LOGGER.warn("Steam Workshop metadata API unavailable; trying the public detail page");
        }
        try {
            WorkshopMetadata result = resolveByPage(itemId);
            remember(result);
            return result;
        } catch (BusinessException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop metadata is temporarily unavailable");
        }
    }

    List<WorkshopSearchItemResponse> enrichResolutions(List<WorkshopSearchItemResponse> items) {
        if (items.isEmpty()) return items;
        StringBuilder body = new StringBuilder("itemcount=").append(items.size());
        for (int i = 0; i < items.size(); i++) {
            body.append("&publishedfileids%5B").append(i).append("%5D=").append(items.get(i).itemId());
        }
        try {
            String url = trimTrailingSlash(properties.getSteamApiBaseUrl())
                    + "/ISteamRemoteStorage/GetPublishedFileDetails/v1/?format=json";
            HttpResponse<String> response = outboundClient.send(outboundClient.request(url)
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(body.toString(), StandardCharsets.UTF_8)).build(),
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            requireSuccess(response.statusCode());
            Map<String, String> resolutions = new LinkedHashMap<>();
            for (JsonNode detail : readJson(response.body()).path("response").path("publishedfiledetails")) {
                if (detail.path("result").asInt(0) != 1) continue;
                String id = detail.path("publishedfileid").asText("");
                String resolution = WorkshopResolution.fromTags(detail.path("tags"));
                resolutions.put(id, resolution);
                if (WORKSHOP_ITEM_ID_PATTERN.matcher(id).matches()
                        && !detail.path("title").asText("").isBlank()
                        && !detail.path("preview_url").asText("").isBlank()) {
                    remember(new WorkshopMetadata(id, detail.path("title").asText(),
                            detail.path("preview_url").asText(), WORKSHOP_DETAIL_URL_BASE + id,
                            detail.path("file_url").asText(""), detail.path("file_size").asLong(0),
                            detail.path("time_updated").asLong(0), "api", resolution));
                }
            }
            return items.stream().map(item -> new WorkshopSearchItemResponse(item.itemId(), item.title(),
                    item.previewUrl(), item.detailUrl(), resolutions.getOrDefault(item.itemId(), item.resolution())))
                    .toList();
        } catch (BusinessException exception) {
            LOGGER.debug("Workshop batch resolution metadata is temporarily unavailable");
            return items;
        }
    }

    private synchronized WorkshopMetadata cached(String id) {
        CachedMetadata entry = cache.get(id);
        if (entry == null) return null;
        if (System.nanoTime() - entry.expiresAt() >= 0) { cache.remove(id); return null; }
        return entry.metadata();
    }

    private synchronized void remember(WorkshopMetadata metadata) {
        cache.put(metadata.itemId(), new CachedMetadata(metadata,
                System.nanoTime() + java.time.Duration.ofMinutes(10).toNanos()));
        while (cache.size() > 256) cache.remove(cache.keySet().iterator().next());
    }

    private record CachedMetadata(WorkshopMetadata metadata, long expiresAt) { }

    private WorkshopMetadata resolveByApi(String itemId) {
        String url = trimTrailingSlash(properties.getSteamApiBaseUrl())
                + "/ISteamRemoteStorage/GetPublishedFileDetails/v1/?format=json";
        String body = "itemcount=1&publishedfileids%5B0%5D="
                + URLEncoder.encode(itemId, StandardCharsets.UTF_8);
        HttpRequest request = outboundClient.request(url)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json,*/*;q=0.8")
                .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = outboundClient.send(
                request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        requireSuccess(response.statusCode());
        JsonNode root = readJson(response.body());
        JsonNode detail = root.path("response").path("publishedfiledetails").path(0);
        if (detail.isMissingNode() || detail.path("result").asInt(0) != 1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop API item result is unavailable");
        }
        String title = detail.path("title").asText("").trim();
        String previewUrl = detail.path("preview_url").asText("").trim();
        if (!StringUtils.hasText(title) || !StringUtils.hasText(previewUrl)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop API metadata is incomplete");
        }
        return new WorkshopMetadata(
                itemId,
                title,
                previewUrl,
                WORKSHOP_DETAIL_URL_BASE + itemId,
                detail.path("file_url").asText("").trim(),
                detail.path("file_size").asLong(0),
                detail.path("time_updated").asLong(0),
                "api", WorkshopResolution.fromTags(detail.path("tags")));
    }

    private WorkshopMetadata resolveByPage(String itemId) {
        String url = trimTrailingSlash(properties.getWorkshopBrowseBaseUrl())
                + "/sharedfiles/filedetails/?id=" + URLEncoder.encode(itemId, StandardCharsets.UTF_8);
        HttpRequest request = outboundClient.request(url)
                .header("Accept", "text/html,*/*;q=0.8")
                .GET()
                .build();
        HttpResponse<String> response = outboundClient.send(
                request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        requireSuccess(response.statusCode());
        String html = readString(response.body());
        List<WorkshopSearchItemResponse> parsedItems = WorkshopBrowseHtmlParser.parse(
                html, WORKSHOP_DETAIL_URL_BASE);
        WorkshopSearchItemResponse parsed = parsedItems.stream()
                .filter(item -> itemId.equals(item.itemId()))
                .findFirst()
                .orElse(null);
        String previewUrl = parsed == null ? "" : readString(parsed.previewUrl()).trim();
        if (!StringUtils.hasText(previewUrl)) {
            previewUrl = firstNonBlankGroup(OG_IMAGE_PATTERN.matcher(html));
        }
        if (!StringUtils.hasText(previewUrl)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop page preview is unavailable");
        }
        String title = parsed == null ? "" : readString(parsed.title()).trim();
        if (!StringUtils.hasText(title) || title.equals("Workshop #" + itemId)) {
            title = firstNonBlankGroup(OG_TITLE_PATTERN.matcher(html));
        }
        title = WorkshopBrowseHtmlParser.unescapeHtml(readString(title)).trim();
        if (!StringUtils.hasText(title)) {
            title = "Workshop #" + itemId;
        }
        return new WorkshopMetadata(
                itemId,
                title,
                WorkshopBrowseHtmlParser.unescapeHtml(previewUrl),
                WORKSHOP_DETAIL_URL_BASE + itemId,
                "",
                0,
                0,
                "page", WorkshopResolution.fromPage(html));
    }

    private void requireSuccess(int statusCode) {
        if (statusCode < 200 || statusCode >= 300) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop upstream request failed");
        }
    }

    private JsonNode readJson(String body) {
        try {
            return objectMapper.readTree(readString(body));
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop metadata response is invalid");
        }
    }

    private static String firstNonBlankGroup(Matcher matcher) {
        if (!matcher.find()) {
            return "";
        }
        for (int group = 1; group <= matcher.groupCount(); group++) {
            String value = matcher.group(group);
            if (StringUtils.hasText(value)) {
                return value.trim();
            }
        }
        return "";
    }

    private static String trimTrailingSlash(String value) {
        String normalized = readString(value).trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private static String readString(String value) {
        return value == null ? "" : value;
    }

    record WorkshopMetadata(String itemId,
                            String title,
                            String previewUrl,
                            String detailUrl,
                            String fileUrl,
                            long fileSizeBytes,
                            long timeUpdated,
                            String source,
                            String resolution) {

        WorkshopMetadata(String itemId, String title, String previewUrl, String detailUrl, String fileUrl,
                         long fileSizeBytes, long timeUpdated, String source) {
            this(itemId, title, previewUrl, detailUrl, fileUrl, fileSizeBytes, timeUpdated, source, "");
        }

        boolean hasDirectDownload() {
            if (!StringUtils.hasText(fileUrl)) {
                return false;
            }
            try {
                String scheme = readString(URI.create(fileUrl).getScheme()).toLowerCase(Locale.ROOT);
                return "http".equals(scheme) || "https".equals(scheme);
            } catch (IllegalArgumentException exception) {
                return false;
            }
        }
    }
}
