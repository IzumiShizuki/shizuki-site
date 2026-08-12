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
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLEncoder;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
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
    private static final Pattern OG_IMAGE_PATTERN = Pattern.compile(
            "<meta[^>]+property=[\\\"']og:image[\\\"'][^>]+content=[\\\"']([^\\\"']+)[\\\"']|"
                    + "<meta[^>]+content=[\\\"']([^\\\"']+)[\\\"'][^>]+property=[\\\"']og:image[\\\"']",
            Pattern.CASE_INSENSITIVE);
    private static final List<String> WALLHAVEN_SORTINGS = List.of(
            "date_added", "relevance", "random", "views", "favorites", "toplist");
    private static final int MAX_QUERY_LENGTH = 120;
    private static final int MAX_PAGE = 200;
    private static final long MAX_PREVIEW_BYTES = 16L * 1024L * 1024L;
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
        this.httpClient = createHttpClient();
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
        if (!StringUtils.hasText(discoveryProperties.getSteamApiKey())) {
            return getWorkshopItemByScrape(itemId);
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

    private WorkshopItemDetailResponse getWorkshopItemByScrape(String itemId) {
        String detailUrl = WORKSHOP_DETAIL_URL_BASE + itemId;
        String browseBase = trimTrailingSlash(discoveryProperties.getWorkshopBrowseBaseUrl());
        String html = httpGet(browseBase + "/sharedfiles/filedetails/?id=" + urlEncode(itemId), "text/html");
        List<WorkshopSearchItemResponse> parsedItems = WorkshopBrowseHtmlParser.parse(html, detailUrl);
        WorkshopSearchItemResponse parsed = parsedItems.stream()
                .filter(item -> itemId.equals(item.itemId()))
                .findFirst()
                .orElse(null);
        String previewUrl = parsed == null ? "" : parsed.previewUrl();
        if (!StringUtils.hasText(previewUrl)) {
            previewUrl = firstNonBlankHtmlGroup(OG_IMAGE_PATTERN.matcher(html));
        }
        if (!StringUtils.hasText(previewUrl)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Workshop preview not found");
        }
        return new WorkshopItemDetailResponse(
                itemId,
                parsed == null ? "" : parsed.title(),
                previewUrl,
                detailUrl,
                false,
                0,
                0
        );
    }

    @Override
    public WallpaperPreview fetchPreview(String sourceRaw, String itemIdRaw) {
        requireDiscoveryEnabled();
        String source = readString(sourceRaw, "").trim().toLowerCase(Locale.ROOT);
        String itemId = readString(itemIdRaw, "").trim();
        String previewUrl;

        if ("workshop".equals(source)) {
            if (!WORKSHOP_ITEM_ID_PATTERN.matcher(itemId).matches()) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "workshop item id is invalid");
            }
            previewUrl = getWorkshopItem(itemId).previewUrl();
            requireTrustedWorkshopPreviewHost(parseHttpUri(previewUrl));
        } else if ("wallhaven".equals(source)) {
            if (!WALLHAVEN_ID_PATTERN.matcher(itemId).matches()) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "wallhaven id is invalid");
            }
            previewUrl = fetchWallhavenPreviewUrl(itemId);
            requireTrustedWallhavenHost(parseHttpUri(previewUrl));
        } else {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "preview source is unsupported");
        }

        return httpGetPreview(previewUrl, source);
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

    private String fetchWallhavenPreviewUrl(String wallhavenId) {
        String detailUrl = trimTrailingSlash(discoveryProperties.getWallhavenBaseUrl())
                + "/api/v1/w/" + urlEncode(wallhavenId)
                + (StringUtils.hasText(discoveryProperties.getWallhavenApiKey())
                ? "?apikey=" + urlEncode(discoveryProperties.getWallhavenApiKey())
                : "");
        JsonNode data = readJson(httpGet(detailUrl, "application/json"), "Wallhaven 壁纸信息解析失败").path("data");
        String previewUrl = firstNonBlank(
                data.path("thumbs").path("large").asText(""),
                data.path("thumbs").path("original").asText(""),
                data.path("path").asText("")
        );
        if (!StringUtils.hasText(previewUrl)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Wallhaven preview not found");
        }
        return previewUrl;
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

    private WallpaperPreview httpGetPreview(String url, String source) {
        HttpRequest request = baseRequest(url)
                .header("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
                .GET()
                .build();
        HttpResponse<InputStream> response = send(request, HttpResponse.BodyHandlers.ofInputStream());
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            closeQuietly(response.body());
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Preview request failed with status " + response.statusCode());
        }
        long contentLength = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
        if (contentLength > MAX_PREVIEW_BYTES) {
            closeQuietly(response.body());
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Preview file is too large");
        }
        if ("workshop".equals(source)) {
            requireTrustedWorkshopPreviewHost(response.uri());
        } else {
            requireTrustedWallhavenHost(response.uri());
        }
        try (InputStream inputStream = response.body()) {
            byte[] bytes = readInputBytes(inputStream, MAX_PREVIEW_BYTES);
            String rawContentType = response.headers().firstValue("Content-Type").orElse("");
            String contentType = resolvePreviewContentType(
                    rawContentType, firstNonBlank(response.uri().toString(), url));
            boolean declaredImage = readStaticString(rawContentType).trim().toLowerCase(Locale.ROOT)
                    .startsWith("image/");
            if (!StringUtils.hasText(contentType)
                    || (!declaredImage && !isLikelyImagePayload(bytes))) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Preview response is not an image");
            }
            return new WallpaperPreview(bytes, contentType);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Download preview failed");
        }
    }

    private HttpRequest.Builder baseRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(parseHttpUri(url))
                .timeout(Duration.ofSeconds(Math.max(5, discoveryProperties.getRequestTimeoutSeconds())))
                .header("User-Agent", DESKTOP_USER_AGENT)
                .header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
    }

    private HttpClient createHttpClient() {
        HttpClient.Builder builder = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(Math.max(5, discoveryProperties.getRequestTimeoutSeconds())))
                .followRedirects(HttpClient.Redirect.NORMAL);
        ProxyEndpoint proxy = parseProxyEndpoint(discoveryProperties.getProxyUrl());
        if (proxy == null) {
            return builder.build();
        }
        builder.proxy(ProxySelector.of(proxy.address()));
        if (proxy.hasCredentials()) {
            builder.authenticator(new ProxyAuthenticator(proxy));
        }
        return builder.build();
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

    static byte[] readInputBytes(InputStream inputStream, long maxBytes) throws IOException {
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

    private String firstNonBlank(String... values) {
        for (String value : values) {
            if (StringUtils.hasText(value)) {
                return value.trim();
            }
        }
        return "";
    }

    private String firstNonBlankHtmlGroup(Matcher matcher) {
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

    static String resolvePreviewContentType(String rawContentType, String url) {
        String contentType = readStaticString(rawContentType).split(";", 2)[0].trim().toLowerCase(Locale.ROOT);
        if (contentType.startsWith("image/")) {
            return contentType;
        }
        String normalizedUrl = readStaticString(url).toLowerCase(Locale.ROOT);
        if (normalizedUrl.contains(".png")) return "image/png";
        if (normalizedUrl.contains(".webp")) return "image/webp";
        if (normalizedUrl.contains(".gif")) return "image/gif";
        if (normalizedUrl.contains(".avif")) return "image/avif";
        if (normalizedUrl.contains(".svg")) return "image/svg+xml";
        if (normalizedUrl.contains(".jpg") || normalizedUrl.contains(".jpeg")) return "image/jpeg";
        return "";
    }

    static boolean isLikelyImagePayload(byte[] bytes) {
        if (bytes == null || bytes.length < 4) {
            return false;
        }
        if ((bytes[0] & 0xff) == 0xff && (bytes[1] & 0xff) == 0xd8 && (bytes[2] & 0xff) == 0xff) {
            return true;
        }
        if ((bytes[0] & 0xff) == 0x89 && bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
            return true;
        }
        if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F' && bytes[3] == '8') {
            return true;
        }
        if (bytes.length >= 12 && bytes[0] == 'R' && bytes[1] == 'I' && bytes[2] == 'F' && bytes[3] == 'F'
                && bytes[8] == 'W' && bytes[9] == 'E' && bytes[10] == 'B' && bytes[11] == 'P') {
            return true;
        }
        if (bytes.length >= 12 && bytes[4] == 'f' && bytes[5] == 't' && bytes[6] == 'y' && bytes[7] == 'p') {
            String brand = new String(bytes, 8, Math.min(4, bytes.length - 8), StandardCharsets.US_ASCII)
                    .toLowerCase(Locale.ROOT);
            return "avif".equals(brand) || "avis".equals(brand);
        }
        String prefix = new String(bytes, 0, Math.min(bytes.length, 256), StandardCharsets.UTF_8)
                .trim().toLowerCase(Locale.ROOT);
        return prefix.startsWith("<svg") || prefix.startsWith("<?xml") && prefix.contains("<svg");
    }

    private void requireTrustedWorkshopPreviewHost(URI uri) {
        String host = readString(uri.getHost(), "").toLowerCase(Locale.ROOT);
        String configuredHost = readString(parseHttpUri(discoveryProperties.getWorkshopBrowseBaseUrl()).getHost(), "")
                .toLowerCase(Locale.ROOT);
        boolean trusted = (StringUtils.hasText(configuredHost)
                && (host.equals(configuredHost) || host.endsWith("." + configuredHost)))
                || host.equals("steamuserimages-a.akamaihd.net")
                || host.endsWith(".steamstatic.com")
                || host.endsWith(".steamusercontent.com");
        if (!trusted) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Workshop preview host is not trusted");
        }
    }

    private void closeQuietly(InputStream inputStream) {
        if (inputStream == null) return;
        try {
            inputStream.close();
        } catch (IOException ignored) {
            // ignore cleanup failure
        }
    }

    static ProxyEndpoint parseProxyEndpoint(String value) {
        String rawValue = readStaticString(value).trim();
        if (!StringUtils.hasText(rawValue)) {
            return null;
        }
        URI uri;
        try {
            uri = URI.create(rawValue);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Wallpaper discovery proxy URL is invalid", exception);
        }
        if (!"http".equalsIgnoreCase(uri.getScheme()) || !StringUtils.hasText(uri.getHost())
                || StringUtils.hasText(uri.getRawQuery()) || StringUtils.hasText(uri.getRawFragment())) {
            throw new IllegalArgumentException("Wallpaper discovery proxy URL must be an HTTP URL without query or fragment");
        }
        String path = readStaticString(uri.getPath());
        if (StringUtils.hasText(path) && !"/".equals(path)) {
            throw new IllegalArgumentException("Wallpaper discovery proxy URL must not contain a path");
        }
        int port = uri.getPort() == -1 ? 80 : uri.getPort();
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Wallpaper discovery proxy port is invalid");
        }
        String userInfo = uri.getUserInfo();
        if (!StringUtils.hasText(userInfo)) {
            return new ProxyEndpoint(InetSocketAddress.createUnresolved(uri.getHost(), port), "", new char[0]);
        }
        int delimiter = userInfo.indexOf(':');
        if (delimiter <= 0 || delimiter == userInfo.length() - 1) {
            throw new IllegalArgumentException("Wallpaper discovery proxy credentials must use username:password");
        }
        return new ProxyEndpoint(
                InetSocketAddress.createUnresolved(uri.getHost(), port),
                userInfo.substring(0, delimiter),
                userInfo.substring(delimiter + 1).toCharArray());
    }

    private static String readStaticString(String value) {
        return value == null ? "" : value;
    }

    static final class ProxyEndpoint {

        private final InetSocketAddress address;
        private final String username;
        private final char[] password;

        private ProxyEndpoint(InetSocketAddress address, String username, char[] password) {
            this.address = address;
            this.username = username;
            this.password = password.clone();
        }

        InetSocketAddress address() {
            return address;
        }

        String username() {
            return username;
        }

        char[] password() {
            return password.clone();
        }

        boolean hasCredentials() {
            return StringUtils.hasText(username) && password.length > 0;
        }
    }

    private static final class ProxyAuthenticator extends Authenticator {

        private final ProxyEndpoint proxy;

        private ProxyAuthenticator(ProxyEndpoint proxy) {
            this.proxy = proxy;
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            if (RequestorType.PROXY.equals(getRequestorType())) {
                return new PasswordAuthentication(proxy.username(), proxy.password());
            }
            return null;
        }
    }
}
