package io.github.shizuki.site.media.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.config.WallpaperDiscoveryProperties;
import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import io.github.shizuki.site.media.request.WallhavenImportCreateRequest;
import io.github.shizuki.site.media.response.WallhavenSearchItemResponse;
import io.github.shizuki.site.media.response.WallhavenSearchResponse;
import io.github.shizuki.site.media.response.WallpaperImportJobResponse;
import io.github.shizuki.site.media.response.WorkshopItemDetailResponse;
import io.github.shizuki.site.media.response.WorkshopSearchItemResponse;
import io.github.shizuki.site.media.response.WorkshopSearchResponse;
import io.github.shizuki.site.media.service.WallpaperDiscoveryService;
import io.github.shizuki.site.media.service.WallpaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.ByteArrayOutputStream;
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
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * 「获取壁纸」内嵌浏览数据源实现。
 *
 * <p>Steam 创意工坊页面禁止 iframe 内嵌，因此由服务端代理搜索：
 * 配置了 Steam Web API Key 时走 IPublishedFileService/QueryFiles，
 * 否则回退到 steamcommunity 浏览页 HTML 抓取。</p>
 *
 * <p>Wallhaven 走公开 JSON API，图片由服务端下载后复用本地包导入管线，
 * 保证「选中即可拉取成功」。</p>
 */
@Service
public class WallpaperDiscoveryServiceImpl implements WallpaperDiscoveryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WallpaperDiscoveryServiceImpl.class);

    private static final String WORKSHOP_DETAIL_URL_BASE = "https://steamcommunity.com/sharedfiles/filedetails/?id=";
    private static final Pattern WORKSHOP_ITEM_ID_PATTERN = Pattern.compile("^\\d{3,20}$");
    private static final Pattern WALLHAVEN_ID_PATTERN = Pattern.compile("^[a-zA-Z0-9]{4,20}$");
    private static final Pattern THREE_FLAG_PATTERN = Pattern.compile("^[01]{3}$");
    private static final Pattern ATLEAST_PATTERN = Pattern.compile("^\\d{2,5}x\\d{2,5}$");
    private static final Pattern RATIOS_PATTERN = Pattern.compile("^[0-9a-zA-Z,x]{1,64}$");
    private static final List<String> WALLHAVEN_SORTINGS = List.of(
            "date_added", "relevance", "random", "views", "favorites", "toplist");
    private static final int MAX_QUERY_LENGTH = 120;
    private static final int MAX_PAGE = 200;
    private static final String DESKTOP_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36";

    private final WallpaperDiscoveryProperties discoveryProperties;
    private final WallpaperWorkshopProperties workshopProperties;
    private final MediaStorageProperties mediaStorageProperties;
    private final WallpaperService wallpaperService;
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;

    public WallpaperDiscoveryServiceImpl(WallpaperDiscoveryProperties discoveryProperties,
                                         WallpaperWorkshopProperties workshopProperties,
                                         MediaStorageProperties mediaStorageProperties,
                                         WallpaperService wallpaperService,
                                         ObjectMapper objectMapper) {
        this.discoveryProperties = discoveryProperties;
        this.workshopProperties = workshopProperties;
        this.mediaStorageProperties = mediaStorageProperties;
        this.wallpaperService = wallpaperService;
        this.objectMapper = objectMapper;
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
    }

    @Override
    public WorkshopSearchResponse searchWorkshop(String queryRaw, int pageRaw, String sortRaw) {
        requireDiscoveryEnabled();
        String query = normalizeQuery(queryRaw);
        int page = normalizePage(pageRaw);
        String sort = normalizeWorkshopSort(sortRaw);
        int pageSize = normalizedPageSize();

        if (StringUtils.hasText(discoveryProperties.getSteamApiKey())) {
            try {
                return searchWorkshopByApi(query, page, sort, pageSize);
            } catch (BusinessException exception) {
                LOGGER.warn("Workshop QueryFiles API search failed, fallback to browse scrape. reason={}", exception.getMessage());
            }
        }
        return searchWorkshopByScrape(query, page, sort, pageSize);
    }

    private WorkshopSearchResponse searchWorkshopByApi(String query, int page, String sort, int pageSize) {
        String url = trimTrailingSlash(discoveryProperties.getSteamApiBaseUrl())
                + "/IPublishedFileService/QueryFiles/v1/?format=json"
                + "&key=" + urlEncode(discoveryProperties.getSteamApiKey())
                + "&appid=" + urlEncode(readString(workshopProperties.getWorkshopAppId(), "431960"))
                + "&page=" + page
                + "&numperpage=" + pageSize
                + "&return_previews=true"
                + "&query_type=" + workshopApiQueryType(sort)
                + ("trend".equals(sort) ? "&days=7" : "")
                + (StringUtils.hasText(query) ? "&search_text=" + urlEncode(query) : "");
        JsonNode root = readJson(httpGet(url, "application/json"), "创意工坊搜索结果解析失败");
        JsonNode response = root.path("response");
        long total = response.path("total").asLong(0);
        List<WorkshopSearchItemResponse> items = new ArrayList<>();
        for (JsonNode detail : response.path("publishedfiledetails")) {
            String itemId = detail.path("publishedfileid").asText("");
            if (!WORKSHOP_ITEM_ID_PATTERN.matcher(itemId).matches()) {
                continue;
            }
            items.add(new WorkshopSearchItemResponse(
                    itemId,
                    detail.path("title").asText(""),
                    detail.path("preview_url").asText(""),
                    WORKSHOP_DETAIL_URL_BASE + itemId
            ));
        }
        boolean hasMore = (long) page * pageSize < total;
        return new WorkshopSearchResponse(items, page, pageSize, hasMore, total, "steam_api");
    }

    private WorkshopSearchResponse searchWorkshopByScrape(String query, int page, String sort, int pageSize) {
        String url = trimTrailingSlash(discoveryProperties.getWorkshopBrowseBaseUrl())
                + "/workshop/browse/?appid=" + urlEncode(readString(workshopProperties.getWorkshopAppId(), "431960"))
                + "&section=readytouseitems"
                + "&browsesort=" + urlEncode(workshopScrapeSort(sort))
                + "&actualsort=" + urlEncode(workshopScrapeSort(sort))
                + ("trend".equals(sort) ? "&days=7" : "")
                + "&p=" + page
                + "&numperpage=" + pageSize
                + (StringUtils.hasText(query) ? "&searchtext=" + urlEncode(query) : "");
        String html = httpGet(url, "text/html");
        List<WorkshopSearchItemResponse> items = WorkshopBrowseHtmlParser.parse(html, WORKSHOP_DETAIL_URL_BASE);
        boolean hasMore = items.size() >= pageSize;
        return new WorkshopSearchResponse(items, page, pageSize, hasMore, -1, "browse_scrape");
    }

    @Override
    public WorkshopItemDetailResponse getWorkshopItem(String itemIdRaw) {
        requireDiscoveryEnabled();
        String itemId = readString(itemIdRaw, "").trim();
        if (!WORKSHOP_ITEM_ID_PATTERN.matcher(itemId).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "workshop item id is invalid");
        }
        String url = trimTrailingSlash(discoveryProperties.getSteamApiBaseUrl())
                + "/ISteamRemoteStorage/GetPublishedFileDetails/v1/?format=json";
        String body = "itemcount=1&publishedfileids%5B0%5D=" + urlEncode(itemId);
        JsonNode root = readJson(httpPostForm(url, body), "创意工坊条目信息解析失败");
        JsonNode detail = root.path("response").path("publishedfiledetails").path(0);
        if (detail.isMissingNode() || detail.path("result").asInt(0) != 1) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Workshop item not found");
        }
        String fileUrl = detail.path("file_url").asText("");
        return new WorkshopItemDetailResponse(
                itemId,
                detail.path("title").asText(""),
                detail.path("preview_url").asText(""),
                WORKSHOP_DETAIL_URL_BASE + itemId,
                StringUtils.hasText(fileUrl),
                detail.path("file_size").asLong(0),
                detail.path("time_updated").asLong(0)
        );
    }

    @Override
    public WallhavenSearchResponse searchWallhaven(String queryRaw, int pageRaw, String categoriesRaw,
                                                   String purityRaw, String sortingRaw, String atleastRaw, String ratiosRaw) {
        requireDiscoveryEnabled();
        String query = normalizeQuery(queryRaw);
        int page = normalizePage(pageRaw);
        String categories = matchOrDefault(categoriesRaw, THREE_FLAG_PATTERN, "111");
        String purity = matchOrDefault(purityRaw, THREE_FLAG_PATTERN, "100");
        if (!StringUtils.hasText(discoveryProperties.getWallhavenApiKey())) {
            purity = "100";
        }
        String sorting = WALLHAVEN_SORTINGS.contains(readString(sortingRaw, "").trim())
                ? sortingRaw.trim()
                : (StringUtils.hasText(query) ? "relevance" : "toplist");
        String atleast = matchOrDefault(atleastRaw, ATLEAST_PATTERN, "");
        String ratios = matchOrDefault(ratiosRaw, RATIOS_PATTERN, "");

        StringBuilder url = new StringBuilder(trimTrailingSlash(discoveryProperties.getWallhavenBaseUrl()))
                .append("/api/v1/search?page=").append(page)
                .append("&categories=").append(categories)
                .append("&purity=").append(purity)
                .append("&sorting=").append(urlEncode(sorting))
                .append("&order=desc");
        if (StringUtils.hasText(query)) {
            url.append("&q=").append(urlEncode(query));
        }
        if (StringUtils.hasText(atleast)) {
            url.append("&atleast=").append(urlEncode(atleast));
        }
        if (StringUtils.hasText(ratios)) {
            url.append("&ratios=").append(urlEncode(ratios));
        }
        if (StringUtils.hasText(discoveryProperties.getWallhavenApiKey())) {
            url.append("&apikey=").append(urlEncode(discoveryProperties.getWallhavenApiKey()));
        }

        JsonNode root = readJson(httpGet(url.toString(), "application/json"), "Wallhaven 搜索结果解析失败");
        List<WallhavenSearchItemResponse> items = new ArrayList<>();
        for (JsonNode data : root.path("data")) {
            String id = data.path("id").asText("");
            if (!WALLHAVEN_ID_PATTERN.matcher(id).matches()) {
                continue;
            }
            items.add(new WallhavenSearchItemResponse(
                    id,
                    data.path("thumbs").path("large").asText(data.path("thumbs").path("original").asText("")),
                    data.path("path").asText(""),
                    data.path("url").asText(""),
                    data.path("resolution").asText(""),
                    data.path("ratio").asText(""),
                    data.path("file_size").asLong(0),
                    data.path("file_type").asText(""),
                    data.path("purity").asText(""),
                    data.path("category").asText("")
            ));
        }
        JsonNode meta = root.path("meta");
        return new WallhavenSearchResponse(
                items,
                meta.path("current_page").asInt(page),
                meta.path("last_page").asInt(page),
                meta.path("total").asLong(items.size())
        );
    }

    @Override
    public WallpaperImportJobResponse importWallhaven(WallhavenImportCreateRequest request) {
        requireDiscoveryEnabled();
        String wallhavenId = readString(request == null ? null : request.getWallhavenId(), "").trim();
        if (!WALLHAVEN_ID_PATTERN.matcher(wallhavenId).matches()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "wallhaven_id is invalid");
        }
        String detailUrl = trimTrailingSlash(discoveryProperties.getWallhavenBaseUrl())
                + "/api/v1/w/" + urlEncode(wallhavenId)
                + (StringUtils.hasText(discoveryProperties.getWallhavenApiKey())
                ? "?apikey=" + urlEncode(discoveryProperties.getWallhavenApiKey())
                : "");
        JsonNode root = readJson(httpGet(detailUrl, "application/json"), "Wallhaven 壁纸信息解析失败");
        JsonNode data = root.path("data");
        String path = data.path("path").asText("");
        if (!StringUtils.hasText(path)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallhaven wallpaper not found");
        }
        URI imageUri = parseHttpUri(path);
        requireTrustedWallhavenHost(imageUri);

        long declaredSize = data.path("file_size").asLong(0);
        long maxBytes = mediaStorageProperties.getMaxUploadSize();
        if (declaredSize > maxBytes) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Wallhaven file is too large");
        }
        byte[] bytes = httpGetBytes(imageUri.toString(), maxBytes);
        String fileType = data.path("file_type").asText("");
        String fileName = "wallhaven-" + wallhavenId.toLowerCase(Locale.ROOT) + "." + resolveImageExtension(fileType, path);
        String title = readString(request.getTitle(), "").trim();
        if (!StringUtils.hasText(title)) {
            title = "Wallhaven " + wallhavenId;
        }
        RemoteDownloadedMultipartFile file = new RemoteDownloadedMultipartFile(
                "file", fileName, StringUtils.hasText(fileType) ? fileType : "image/jpeg", bytes);
        return wallpaperService.importPackage(file, request.getVisibility(), title);
    }

    private void requireDiscoveryEnabled() {
        if (!discoveryProperties.isEnabled()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Wallpaper discovery is disabled");
        }
    }

    private String normalizeQuery(String queryRaw) {
        String query = readString(queryRaw, "").trim();
        if (query.length() > MAX_QUERY_LENGTH) {
            query = query.substring(0, MAX_QUERY_LENGTH);
        }
        return query;
    }

    private int normalizePage(int page) {
        if (page < 1) {
            return 1;
        }
        return Math.min(page, MAX_PAGE);
    }

    private int normalizedPageSize() {
        int pageSize = discoveryProperties.getPageSize();
        if (pageSize < 6) {
            return 6;
        }
        return Math.min(pageSize, 50);
    }

    private String normalizeWorkshopSort(String sortRaw) {
        String sort = readString(sortRaw, "").trim().toLowerCase(Locale.ROOT);
        return switch (sort) {
            case "mostrecent", "toprated", "subscribers" -> sort;
            default -> "trend";
        };
    }

    private int workshopApiQueryType(String sort) {
        return switch (sort) {
            case "mostrecent" -> 1;
            case "toprated" -> 0;
            case "subscribers" -> 9;
            default -> 3;
        };
    }

    private String workshopScrapeSort(String sort) {
        return switch (sort) {
            case "mostrecent" -> "mostrecent";
            case "toprated" -> "toprated";
            case "subscribers" -> "totaluniquesubscribers";
            default -> "trend";
        };
    }

    private String matchOrDefault(String value, Pattern pattern, String defaultValue) {
        String normalized = readString(value, "").trim();
        if (StringUtils.hasText(normalized) && pattern.matcher(normalized).matches()) {
            return normalized;
        }
        return defaultValue;
    }

    private String httpGet(String url, String accept) {
        HttpRequest request = baseRequest(url)
                .header("Accept", accept + ",*/*;q=0.8")
                .GET()
                .build();
        HttpResponse<String> response = send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request failed with status " + response.statusCode());
        }
        return response.body();
    }

    private String httpPostForm(String url, String formBody) {
        HttpRequest request = baseRequest(url)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json,*/*;q=0.8")
                .POST(HttpRequest.BodyPublishers.ofString(formBody, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request failed with status " + response.statusCode());
        }
        return response.body();
    }

    private byte[] httpGetBytes(String url, long maxBytes) {
        HttpRequest request = baseRequest(url)
                .header("Accept", "*/*")
                .GET()
                .build();
        HttpResponse<InputStream> response = send(request, HttpResponse.BodyHandlers.ofInputStream());
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Download failed with status " + response.statusCode());
        }
        long contentLength = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
        if (contentLength > maxBytes) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Remote file is too large");
        }
        try (InputStream inputStream = response.body()) {
            return readInputBytes(inputStream, maxBytes);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Download remote file failed");
        }
    }

    private HttpRequest.Builder baseRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(parseHttpUri(url))
                .timeout(Duration.ofSeconds(Math.max(5, discoveryProperties.getRequestTimeoutSeconds())))
                .header("User-Agent", DESKTOP_USER_AGENT)
                .header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
    }

    private <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> handler) {
        try {
            return httpClient.send(request, handler);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request failed: " + readString(exception.getMessage(), "io error"));
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream request interrupted");
        }
    }

    private byte[] readInputBytes(InputStream inputStream, long maxBytes) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] chunk = new byte[8192];
        long totalRead = 0;
        int read;
        while ((read = inputStream.read(chunk)) != -1) {
            totalRead += read;
            if (totalRead > maxBytes) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Remote file is too large");
            }
            buffer.write(chunk, 0, read);
        }
        if (totalRead <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Remote file is empty");
        }
        return buffer.toByteArray();
    }

    private JsonNode readJson(String body, String errorMessage) {
        try {
            return objectMapper.readTree(readString(body, ""));
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, errorMessage);
        }
    }

    private URI parseHttpUri(String url) {
        URI uri;
        try {
            uri = URI.create(readString(url, "").trim());
        } catch (IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream url is invalid");
        }
        String scheme = readString(uri.getScheme(), "").toLowerCase(Locale.ROOT);
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upstream url protocol is unsupported");
        }
        return uri;
    }

    private void requireTrustedWallhavenHost(URI uri) {
        String host = readString(uri.getHost(), "").toLowerCase(Locale.ROOT);
        String configuredHost = readString(parseHttpUri(discoveryProperties.getWallhavenBaseUrl()).getHost(), "")
                .toLowerCase(Locale.ROOT);
        boolean trusted = host.equals(configuredHost)
                || host.endsWith(".wallhaven.cc")
                || host.equals("wallhaven.cc")
                || (StringUtils.hasText(configuredHost) && host.endsWith("." + configuredHost));
        if (!trusted) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Wallhaven file host is not trusted");
        }
    }

    private String resolveImageExtension(String fileType, String path) {
        String normalizedType = readString(fileType, "").toLowerCase(Locale.ROOT);
        if (normalizedType.contains("png")) {
            return "png";
        }
        if (normalizedType.contains("jpeg") || normalizedType.contains("jpg")) {
            return "jpg";
        }
        if (normalizedType.contains("webp")) {
            return "webp";
        }
        if (normalizedType.contains("gif")) {
            return "gif";
        }
        String normalizedPath = readString(path, "").toLowerCase(Locale.ROOT);
        int dotIndex = normalizedPath.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < normalizedPath.length() - 1) {
            String extension = normalizedPath.substring(dotIndex + 1);
            if (extension.length() <= 5 && extension.chars().allMatch(Character::isLetterOrDigit)) {
                return extension;
            }
        }
        return "jpg";
    }

    private String trimTrailingSlash(String value) {
        String normalized = readString(value, "").trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    private String urlEncode(String value) {
        return URLEncoder.encode(readString(value, ""), StandardCharsets.UTF_8);
    }

    private String readString(String value, String defaultValue) {
        return value == null ? defaultValue : value;
    }
}
