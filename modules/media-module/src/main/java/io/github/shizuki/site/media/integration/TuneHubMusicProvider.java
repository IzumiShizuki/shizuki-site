package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.TuneHubMusicProperties;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * TuneHub 客户端：基于 methods 配置拉取榜单，并通过 parse 接口解析可播链接。
 */
@Component
public class TuneHubMusicProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(TuneHubMusicProvider.class);
    private static final Set<String> SUPPORTED_PLATFORMS = Set.of("netease", "kuwo", "qq");
    private static final int MAX_TRACKS = 30;
    private static final int PARSE_BATCH_SIZE = 10;

    private final TuneHubMusicProperties properties;
    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public TuneHubMusicProvider(TuneHubMusicProperties properties,
                                RestClient.Builder restClientBuilder,
                                ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(properties.getReadTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    /**
     * 返回 TuneHub methods 公告的可用平台列表。
     */
    public Set<String> listSupportedPlatforms() {
        Map<String, Object> response = requestJson(
            "GET",
            joinBasePath("/v1/methods"),
            Map.of(),
            Map.of(),
            null
        );
        Object dataObj = response.get("data");
        if (!(dataObj instanceof Map<?, ?> dataMapRaw)) {
            return SUPPORTED_PLATFORMS;
        }
        Set<String> result = new LinkedHashSet<>();
        for (Object key : dataMapRaw.keySet()) {
            String platform = normalizePlatformCode(String.valueOf(key));
            if (SUPPORTED_PLATFORMS.contains(platform)) {
                result.add(platform);
            }
        }
        if (result.isEmpty()) {
            result.addAll(SUPPORTED_PLATFORMS);
        }
        return result;
    }

    /**
     * 按平台顺序构建默认歌单，命中首个可用平台即返回。
     */
    public DynamicPlaylistResult buildDefaultPlaylist(String apiKey,
                                                      List<String> platformOrder,
                                                      String quality) {
        if (!StringUtils.hasText(apiKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "TuneHub API key is required");
        }
        List<String> normalizedOrder = normalizePlatformOrder(platformOrder);
        Exception lastError = null;

        for (String platform : normalizedOrder) {
            long startMs = System.currentTimeMillis();
            try {
                List<TrackSeed> seeds = loadToplistSeeds(platform, apiKey);
                if (seeds.isEmpty()) {
                    throw new BusinessException(ErrorCode.NOT_FOUND, "No tracks in toplist", Map.of("platform", platform));
                }

                List<String> ids = new ArrayList<>();
                for (TrackSeed item : seeds) {
                    if (!StringUtils.hasText(item.id())) {
                        continue;
                    }
                    ids.add(item.id());
                    if (ids.size() >= MAX_TRACKS) {
                        break;
                    }
                }
                if (ids.isEmpty()) {
                    throw new BusinessException(ErrorCode.NOT_FOUND, "No valid ids in toplist", Map.of("platform", platform));
                }

                Map<String, ParseTrack> parsedTracks = parseTracks(platform, ids, apiKey, quality);
                List<MusicTrackResponse> tracks = mergeTracks(platform, seeds, parsedTracks);
                if (tracks.isEmpty()) {
                    throw new BusinessException(ErrorCode.NOT_FOUND, "No playable track from parse", Map.of("platform", platform));
                }

                long durationMs = Math.max(1L, System.currentTimeMillis() - startMs);
                return new DynamicPlaylistResult(platform, tracks, durationMs, LocalDateTime.now());
            } catch (Exception ex) {
                lastError = ex;
                LOGGER.warn("MUSIC_TUNEHUB_PLATFORM_BUILD_FAIL platform={} errorType={} reason={}",
                    platform,
                    ex.getClass().getSimpleName(),
                    sanitizeLogMessage(ex.getMessage()));
            }
        }

        if (lastError instanceof RuntimeException runtimeException) {
            throw runtimeException;
        }
        throw new BusinessException(ErrorCode.INTERNAL_ERROR, "TuneHub dynamic playlist build failed");
    }

    /**
     * 读取 TuneHub 榜单摘要并组装为虚拟歌单列表。
     */
    public List<VirtualPlaylistSummary> listToplistPlaylists(String apiKey,
                                                             List<String> platformOrder,
                                                             int perPlatform) {
        if (!StringUtils.hasText(apiKey)) {
            return List.of();
        }
        int safePerPlatform = Math.max(1, Math.min(8, perPlatform));
        List<String> normalizedOrder = normalizePlatformOrder(platformOrder);
        List<VirtualPlaylistSummary> result = new ArrayList<>();

        for (String platform : normalizedOrder) {
            try {
                List<ToplistSeed> seeds = loadToplists(platform, apiKey);
                int added = 0;
                for (ToplistSeed seed : seeds) {
                    if (!StringUtils.hasText(seed.id())) {
                        continue;
                    }
                    result.add(new VirtualPlaylistSummary(
                        platform,
                        "toplist",
                        seed.id(),
                        readString(seed.name(), platform.toUpperCase(Locale.ROOT) + " 榜单"),
                        "TuneHub " + platform + " 榜单推荐",
                        readString(seed.cover(), ""),
                        "vh_tunehub_" + platform + "_toplist_" + seed.id()
                    ));
                    added += 1;
                    if (added >= safePerPlatform) {
                        break;
                    }
                }
            } catch (Exception ex) {
                LOGGER.warn(
                    "MUSIC_TUNEHUB_LIST_TOPLISTS_FAIL platform={} reason={}",
                    platform,
                    sanitizeLogMessage(ex.getMessage())
                );
            }
        }
        return result;
    }

    /**
     * 读取虚拟歌单基础曲目（不解析音频）。
     */
    public List<MusicTrackResponse> loadVirtualPlaylistTracks(String apiKey,
                                                              String platform,
                                                              String sourceType,
                                                              String sourceId) {
        if (!StringUtils.hasText(apiKey)) {
            return List.of();
        }
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedType = readString(sourceType, "").toLowerCase(Locale.ROOT);
        if (!SUPPORTED_PLATFORMS.contains(normalizedPlatform)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported tunehub platform");
        }
        if (!StringUtils.hasText(sourceId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "source_id is required");
        }
        if ("search".equals(normalizedType)) {
            String keyword = decodeVirtualSearchKeyword(sourceId);
            if (!StringUtils.hasText(keyword)) {
                return List.of();
            }
            List<SearchTrackResult> searchRows = searchTracks(apiKey, normalizedPlatform, keyword, 1, MAX_TRACKS);
            List<MusicTrackResponse> result = new ArrayList<>();
            int sort = 1;
            for (SearchTrackResult item : searchRows) {
                String trackId = readString(item.trackId(), "");
                if (!StringUtils.hasText(trackId)) {
                    continue;
                }
                result.add(new MusicTrackResponse(
                    trackId,
                    normalizedPlatform,
                    readString(item.title(), "Unknown"),
                    readString(item.artist(), "未知歌手"),
                    readString(item.cover(), ""),
                    "",
                    "",
                    sort,
                    true,
                    ""
                ));
                sort += 1;
                if (result.size() >= MAX_TRACKS) {
                    break;
                }
            }
            return result;
        }
        if (!"toplist".equals(normalizedType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported virtual playlist type");
        }

        List<TrackSeed> seeds = loadToplistTracks(normalizedPlatform, sourceId, apiKey);
        List<MusicTrackResponse> result = new ArrayList<>();
        int sort = 1;
        for (TrackSeed seed : seeds) {
            String id = readString(seed.id(), "");
            if (!StringUtils.hasText(id)) {
                continue;
            }
            result.add(new MusicTrackResponse(
                id,
                normalizedPlatform,
                readString(seed.title(), "Unknown"),
                readString(seed.artist(), "未知歌手"),
                readString(seed.cover(), ""),
                "",
                "",
                sort,
                true,
                ""
            ));
            sort += 1;
            if (result.size() >= MAX_TRACKS) {
                break;
            }
        }
        return result;
    }

    private String decodeVirtualSearchKeyword(String sourceId) {
        String raw = readString(sourceId, "").trim();
        if (!StringUtils.hasText(raw)) {
            return "";
        }
        try {
            byte[] decoded = Base64.getUrlDecoder().decode(raw);
            String keyword = new String(decoded, StandardCharsets.UTF_8).trim();
            if (StringUtils.hasText(keyword)) {
                return keyword;
            }
        } catch (IllegalArgumentException ignored) {
            // ignore invalid base64 and fallback to raw source id
        }
        return raw;
    }

    /**
     * 按平台执行 TuneHub 搜索（仅基础信息，不触发 parse）。
     */
    public List<SearchTrackResult> searchTracks(String apiKey,
                                                String platform,
                                                String keyword,
                                                int page,
                                                int limit) {
        if (!StringUtils.hasText(apiKey)) {
            return List.of();
        }
        String normalizedPlatform = normalizePlatformCode(platform);
        if (!SUPPORTED_PLATFORMS.contains(normalizedPlatform)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported tunehub platform");
        }
        String normalizedKeyword = readString(keyword, "");
        if (!StringUtils.hasText(normalizedKeyword)) {
            return List.of();
        }

        int safePage = Math.max(1, page);
        int safeLimit = Math.max(1, Math.min(60, limit));
        Map<String, Object> methodDefinition = readMethodDefinition(normalizedPlatform, "search", apiKey);
        Map<String, Object> searchRaw = invokeMethod(
            methodDefinition,
            Map.of(
                "platform", normalizedPlatform,
                "keyword", normalizedKeyword,
                "page", safePage,
                "limit", safeLimit
            )
        );
        return parseSearchTracks(normalizedPlatform, searchRaw, safeLimit);
    }

    /**
     * 按需解析单曲播放信息。
     */
    public ParseTrackResult parseSingleTrack(String apiKey,
                                             String platform,
                                             String trackId,
                                             String quality) {
        if (!StringUtils.hasText(apiKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "TuneHub API key is required");
        }
        String normalizedPlatform = normalizePlatformCode(platform);
        if (!SUPPORTED_PLATFORMS.contains(normalizedPlatform)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported tunehub platform");
        }
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        Map<String, ParseTrack> parsed = parseTracks(normalizedPlatform, List.of(normalizedTrackId), apiKey, quality);
        ParseTrack row = parsed.get(normalizedTrackId);
        if (row == null && "kuwo".equals(normalizedPlatform)) {
            String altTrackId = normalizedTrackId.startsWith("MUSIC_")
                ? normalizedTrackId.substring("MUSIC_".length())
                : "MUSIC_" + normalizedTrackId;
            Map<String, ParseTrack> altParsed = parseTracks(normalizedPlatform, List.of(altTrackId), apiKey, quality);
            row = altParsed.get(altTrackId);
        }
        if (row == null || !StringUtils.hasText(row.audioUrl())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Track parse failed");
        }
        return new ParseTrackResult(
            normalizedTrackId,
            readString(row.title(), ""),
            readString(row.artist(), ""),
            readString(row.cover(), ""),
            readString(row.audioUrl(), ""),
            readString(row.lyricText(), "")
        );
    }

    private List<String> normalizePlatformOrder(List<String> platformOrder) {
        List<String> source = platformOrder == null ? List.of() : platformOrder;
        List<String> normalized = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (String item : source) {
            String platform = normalizePlatformCode(item);
            if (!SUPPORTED_PLATFORMS.contains(platform) || !seen.add(platform)) {
                continue;
            }
            normalized.add(platform);
        }
        for (String fallback : properties.getDefaultPlatformOrder()) {
            String platform = normalizePlatformCode(fallback);
            if (!SUPPORTED_PLATFORMS.contains(platform) || !seen.add(platform)) {
                continue;
            }
            normalized.add(platform);
        }
        if (normalized.isEmpty()) {
            normalized.addAll(List.of("netease", "kuwo", "qq"));
        }
        return normalized;
    }

    private List<TrackSeed> loadToplistSeeds(String platform, String apiKey) {
        List<ToplistSeed> toplists = loadToplists(platform, apiKey);
        if (toplists.isEmpty()) {
            return List.of();
        }

        String toplistId = toplists.get(0).id();
        return loadToplistTracks(platform, toplistId, apiKey);
    }

    private List<ToplistSeed> loadToplists(String platform, String apiKey) {
        Map<String, Object> toplistsMethod = readMethodDefinition(platform, "toplists", apiKey);
        Map<String, Object> toplistsRaw = invokeMethod(toplistsMethod, Map.of("platform", platform));
        return parseToplists(platform, toplistsRaw);
    }

    private List<TrackSeed> loadToplistTracks(String platform, String toplistId, String apiKey) {
        Map<String, Object> toplistMethod = readMethodDefinition(platform, "toplist", apiKey);
        Map<String, Object> toplistRaw = invokeMethod(toplistMethod, Map.of("platform", platform, "id", toplistId));
        return parseToplistTracks(platform, toplistRaw);
    }

    private Map<String, Object> readMethodDefinition(String platform, String method, String apiKey) {
        String path = joinBasePath("/v1/methods/" + encodePathSegment(platform) + "/" + encodePathSegment(method));
        Map<String, Object> wrapper = requestJson(
            "GET",
            path,
            Map.of(),
            keyHeader(apiKey),
            null
        );
        int code = readInt(wrapper.get("code"), -1);
        if (code != 0) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "TuneHub method definition unavailable",
                Map.of("platform", platform, "method", method, "code", code, "message", readString(wrapper.get("message"), ""))
            );
        }
        Object dataObj = wrapper.get("data");
        if (!(dataObj instanceof Map<?, ?> rawMap)) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "TuneHub method definition payload invalid",
                Map.of("platform", platform, "method", method)
            );
        }
        return toStringObjectMap(rawMap);
    }

    private Map<String, Object> invokeMethod(Map<String, Object> methodDefinition,
                                             Map<String, Object> context) {
        String httpMethod = readString(methodDefinition.get("method"), "GET").toUpperCase(Locale.ROOT);
        String url = readString(methodDefinition.get("url"), "");
        if (!StringUtils.hasText(url)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "TuneHub method url is empty");
        }

        Map<String, Object> headersRaw = toStringObjectMap(methodDefinition.get("headers"));
        Map<String, String> headers = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : headersRaw.entrySet()) {
            Object resolved = resolveTemplateValue(entry.getValue(), context);
            if (resolved == null) {
                continue;
            }
            headers.put(entry.getKey(), String.valueOf(resolved));
        }

        if ("POST".equals(httpMethod)) {
            Map<String, Object> body = resolveTemplateMap(methodDefinition.get("body"), context);
            return requestJson(httpMethod, url, Map.of(), headers, body);
        }

        Map<String, Object> params = resolveTemplateMap(methodDefinition.get("params"), context);
        return requestJson(httpMethod, url, params, headers, null);
    }

    private Map<String, ParseTrack> parseTracks(String platform,
                                                List<String> ids,
                                                String apiKey,
                                                String quality) {
        Map<String, ParseTrack> result = new LinkedHashMap<>();
        if (ids == null || ids.isEmpty()) {
            return result;
        }

        for (int offset = 0; offset < ids.size(); offset += PARSE_BATCH_SIZE) {
            int end = Math.min(ids.size(), offset + PARSE_BATCH_SIZE);
            List<String> batch = ids.subList(offset, end);
            if (batch.isEmpty()) {
                continue;
            }
            Map<String, Object> body = new LinkedHashMap<>();
            body.put("platform", platform);
            body.put("ids", String.join(",", batch));
            if (StringUtils.hasText(quality)) {
                body.put("quality", quality);
            }

            Map<String, Object> wrapper;
            try {
                wrapper = requestJson(
                    "POST",
                    joinBasePath("/v1/parse"),
                    Map.of(),
                    keyHeader(apiKey),
                    body
                );
            } catch (Exception ex) {
                LOGGER.warn("MUSIC_TUNEHUB_PARSE_BATCH_FAIL platform={} batchSize={} reason={}",
                    platform,
                    batch.size(),
                    sanitizeLogMessage(ex.getMessage()));
                continue;
            }

            int code = readInt(wrapper.get("code"), -1);
            if (code != 0) {
                LOGGER.warn("MUSIC_TUNEHUB_PARSE_BATCH_FAIL platform={} batchSize={} code={} message={}",
                    platform,
                    batch.size(),
                    code,
                    sanitizeLogMessage(readString(wrapper.get("message"), "")));
                continue;
            }

            Map<String, Object> data = toStringObjectMap(wrapper.get("data"));
            List<Map<String, Object>> rows = toObjectMapList(data.get("data"));
            for (Map<String, Object> row : rows) {
                String id = readString(row.get("id"), "");
                if (!StringUtils.hasText(id)) {
                    continue;
                }
                boolean success = readBoolean(row.get("success"), false);
                if (!success) {
                    continue;
                }
                String url = readString(row.get("url"), "");
                if (!StringUtils.hasText(url)) {
                    continue;
                }
                Map<String, Object> info = toStringObjectMap(row.get("info"));
                String title = readString(info.get("name"), "");
                String artist = readString(info.get("artist"), "");
                String cover = readParseCover(platform, row, info);
                String lyricText = readParseLyricText(row, info);
                result.put(id, new ParseTrack(id, title, artist, cover, url, lyricText));
            }
        }
        return result;
    }

    private String readParseCover(String platform, Map<String, Object> row, Map<String, Object> info) {
        String cover = readTrackCover(platform, row);
        if (!StringUtils.hasText(cover)) {
            cover = readString(info.get("cover"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(info.get("picUrl"), "");
        }
        if (!StringUtils.hasText(cover)) {
            Map<String, Object> album = toStringObjectMap(info.get("album"));
            cover = readString(album.get("picUrl"), "");
        }
        return normalizeCoverUrl(platform, cover);
    }

    private String readParseLyricText(Map<String, Object> row, Map<String, Object> info) {
        String lyricText = resolveLyricTextCandidate(readString(row.get("lyrics"), ""));
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("lyric"), ""));
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("lrc"), ""));
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("lyricText"), ""));
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("klyric"), ""));
        }
        if (!StringUtils.hasText(lyricText)) {
            Map<String, Object> lyricObj = toStringObjectMap(row.get("lyric"));
            lyricText = resolveLyricTextCandidate(readString(lyricObj.get("lyric"), ""));
            if (!StringUtils.hasText(lyricText)) {
                lyricText = resolveLyricTextCandidate(readString(lyricObj.get("lrc"), ""));
            }
            if (!StringUtils.hasText(lyricText)) {
                lyricText = resolveLyricTextCandidate(readString(lyricObj.get("url"), ""));
            }
        }
        if (!StringUtils.hasText(lyricText)) {
            Map<String, Object> lrcObj = toStringObjectMap(row.get("lrc"));
            lyricText = resolveLyricTextCandidate(readString(lrcObj.get("lyric"), ""));
            if (!StringUtils.hasText(lyricText)) {
                lyricText = resolveLyricTextCandidate(readString(lrcObj.get("content"), ""));
            }
            if (!StringUtils.hasText(lyricText)) {
                lyricText = resolveLyricTextCandidate(readString(lrcObj.get("url"), ""));
            }
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(info.get("lyric"), ""));
            if (!StringUtils.hasText(lyricText)) {
                lyricText = resolveLyricTextCandidate(readString(info.get("lyrics"), ""));
            }
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("lyric_url"), ""));
        }
        if (!StringUtils.hasText(lyricText)) {
            lyricText = resolveLyricTextCandidate(readString(row.get("lyricUrl"), ""));
        }
        return normalizeLyricText(lyricText);
    }

    private String resolveLyricTextCandidate(String raw) {
        String value = readString(raw, "");
        if (!StringUtils.hasText(value)) {
            return "";
        }
        if (value.startsWith("http://") || value.startsWith("https://")) {
            return fetchLyricByUrl(value);
        }
        String decoded = tryDecodeBase64(value);
        if (StringUtils.hasText(decoded)) {
            return decoded;
        }
        return value;
    }

    private String tryDecodeBase64(String raw) {
        String text = readString(raw, "");
        if (!StringUtils.hasText(text) || text.length() < 24) {
            return "";
        }
        String normalized = text.replace('\n', ' ').replace('\r', ' ').trim();
        if (!normalized.matches("^[A-Za-z0-9+/=_-]+$")) {
            return "";
        }
        try {
            byte[] decoded = Base64.getDecoder().decode(normalized);
            String value = new String(decoded, StandardCharsets.UTF_8);
            String lyric = normalizeLyricText(value);
            if (StringUtils.hasText(lyric) && (lyric.contains("[") || lyric.contains("\n") || lyric.contains("："))) {
                return lyric;
            }
        } catch (Exception ignored) {
            // ignore invalid base64 content
        }
        return "";
    }

    private String fetchLyricByUrl(String lyricUrl) {
        try {
            String body = restClient.get()
                .uri(URI.create(lyricUrl))
                .accept(MediaType.TEXT_PLAIN, MediaType.ALL)
                .retrieve()
                .body(String.class);
            return normalizeLyricText(readString(body, ""));
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_TUNEHUB_LYRIC_URL_FETCH_FAIL reason={}", sanitizeLogMessage(ex.getMessage()));
            return "";
        }
    }

    private String normalizeLyricText(String raw) {
        String lyric = readString(raw, "");
        if (!StringUtils.hasText(lyric)) {
            return "";
        }
        if (lyric.startsWith("\uFEFF")) {
            lyric = lyric.substring(1);
        }
        lyric = lyric.replace("\\r\\n", "\n")
            .replace("\\n", "\n")
            .replace("\\r", "\n")
            .replace("\r\n", "\n")
            .replace('\r', '\n')
            .trim();
        return lyric;
    }

    private List<ToplistSeed> parseToplists(String platform, Map<String, Object> raw) {
        List<ToplistSeed> result = new ArrayList<>();
        switch (platform) {
            case "netease" -> {
                List<Map<String, Object>> list = toObjectMapList(raw.get("list"));
                for (Map<String, Object> item : list) {
                    String id = readString(item.get("id"), "");
                    if (!StringUtils.hasText(id)) {
                        continue;
                    }
                    result.add(new ToplistSeed(id, readString(item.get("name"), ""), readString(item.get("coverImgUrl"), "")));
                }
            }
            case "kuwo" -> {
                List<Map<String, Object>> children = toObjectMapList(raw.get("child"));
                for (Map<String, Object> item : children) {
                    if (!"1".equals(readString(item.get("source"), ""))) {
                        continue;
                    }
                    String id = readString(item.get("sourceid"), "");
                    if (!StringUtils.hasText(id)) {
                        continue;
                    }
                    result.add(new ToplistSeed(id, readString(item.get("name"), ""), readString(item.get("pic"), "")));
                }
            }
            case "qq" -> {
                Map<String, Object> toplist = toStringObjectMap(raw.get("toplist"));
                Map<String, Object> data = toStringObjectMap(toplist.get("data"));
                List<Map<String, Object>> groups = toObjectMapList(data.get("group"));
                for (Map<String, Object> group : groups) {
                    List<Map<String, Object>> list = toObjectMapList(group.get("toplist"));
                    for (Map<String, Object> item : list) {
                        String id = readString(item.get("topId"), "");
                        if (!StringUtils.hasText(id)) {
                            continue;
                        }
                        String cover = readString(item.get("headPicUrl"), "");
                        if (!StringUtils.hasText(cover)) {
                            cover = readString(item.get("frontPicUrl"), "");
                        }
                        result.add(new ToplistSeed(id, readString(item.get("title"), ""), cover));
                    }
                }
            }
            default -> {
                // no-op
            }
        }
        return result;
    }

    private List<TrackSeed> parseToplistTracks(String platform, Map<String, Object> raw) {
        List<TrackSeed> result = new ArrayList<>();
        switch (platform) {
            case "netease" -> {
                Map<String, Object> detail = toStringObjectMap(raw.get("result"));
                List<Map<String, Object>> tracks = toObjectMapList(detail.get("tracks"));
                for (Map<String, Object> item : tracks) {
                    String id = readString(item.get("id"), "");
                    if (!StringUtils.hasText(id)) {
                        continue;
                    }
                    String title = readString(item.get("name"), "");
                    Map<String, Object> album = toStringObjectMap(item.get("album"));
                    String cover = readString(album.get("picUrl"), "");
                    List<Map<String, Object>> artists = toObjectMapList(item.get("artists"));
                    String artist = joinNames(artists, "name");
                    result.add(new TrackSeed(id, title, artist, cover));
                }
            }
            case "kuwo" -> {
                List<Map<String, Object>> tracks = toObjectMapList(raw.get("musiclist"));
                for (Map<String, Object> item : tracks) {
                    String id = readString(item.get("id"), "");
                    if (!StringUtils.hasText(id)) {
                        id = readString(item.get("rid"), "");
                    }
                    if (!StringUtils.hasText(id)) {
                        continue;
                    }
                    String title = readString(item.get("name"), "");
                    String artist = readString(item.get("artist"), "").replace("&", ", ");
                    result.add(new TrackSeed(id, title, artist, ""));
                }
            }
            case "qq" -> {
                Map<String, Object> toplist = toStringObjectMap(raw.get("toplist"));
                Map<String, Object> data = toStringObjectMap(toplist.get("data"));
                List<Map<String, Object>> tracks = toObjectMapList(data.get("songInfoList"));
                for (Map<String, Object> item : tracks) {
                    String id = readString(item.get("mid"), "");
                    if (!StringUtils.hasText(id)) {
                        continue;
                    }
                    String title = readString(item.get("title"), "");
                    List<Map<String, Object>> singers = toObjectMapList(item.get("singerList"));
                    String artist = joinNames(singers, "name");
                    result.add(new TrackSeed(id, title, artist, ""));
                }
            }
            default -> {
                // no-op
            }
        }
        return result;
    }

    private List<SearchTrackResult> parseSearchTracks(String platform, Map<String, Object> raw, int limit) {
        List<Map<String, Object>> rows = extractSearchRows(platform, raw);

        List<SearchTrackResult> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (Map<String, Object> row : rows) {
            String trackId = readString(row.get("id"), "");
            if (!StringUtils.hasText(trackId)) {
                trackId = readString(row.get("mid"), "");
            }
            if (!StringUtils.hasText(trackId)) {
                trackId = readString(row.get("songmid"), "");
            }
            if (!StringUtils.hasText(trackId)) {
                trackId = readString(row.get("songMid"), "");
            }
            if (!StringUtils.hasText(trackId)) {
                trackId = readString(row.get("rid"), "");
            }
            if (!StringUtils.hasText(trackId)) {
                trackId = readString(row.get("RID"), "");
            }
            if (!StringUtils.hasText(trackId)) {
                String musicRid = readString(row.get("MUSICRID"), "");
                if (musicRid.startsWith("MUSIC_")) {
                    trackId = musicRid.substring("MUSIC_".length());
                } else {
                    trackId = musicRid;
                }
            }
            if (!StringUtils.hasText(trackId) || !seen.add(trackId)) {
                continue;
            }

            String title = readTrackTitle(row);
            String artist = readTrackArtist(platform, row);
            String album = readTrackAlbum(row);
            String cover = readTrackCover(platform, row);
            Integer durationSec = readDurationSeconds(row);

            result.add(new SearchTrackResult(
                trackId,
                title,
                artist,
                album,
                cover,
                durationSec,
                platform
            ));
            if (result.size() >= limit) {
                break;
            }
        }
        return result;
    }

    private List<Map<String, Object>> extractSearchRows(String platform, Map<String, Object> raw) {
        List<Map<String, Object>> rows = toObjectMapList(raw.get("data"));
        if (rows.isEmpty()) {
            rows = toObjectMapList(raw.get("list"));
        }
        if (rows.isEmpty()) {
            rows = toObjectMapList(raw.get("songs"));
        }
        if (rows.isEmpty() && "netease".equals(platform)) {
            Map<String, Object> result = toStringObjectMap(raw.get("result"));
            rows = toObjectMapList(result.get("songs"));
        }
        if (rows.isEmpty() && "kuwo".equals(platform)) {
            rows = toObjectMapList(raw.get("abslist"));
        }
        if (rows.isEmpty() && "qq".equals(platform)) {
            Map<String, Object> req = toStringObjectMap(raw.get("req"));
            Map<String, Object> reqData = toStringObjectMap(req.get("data"));
            Map<String, Object> body = toStringObjectMap(reqData.get("body"));
            Map<String, Object> song = toStringObjectMap(body.get("song"));
            rows = toObjectMapList(song.get("list"));
        }
        return rows;
    }

    private String readTrackTitle(Map<String, Object> row) {
        String title = readString(row.get("name"), "");
        if (!StringUtils.hasText(title)) {
            title = readString(row.get("title"), "");
        }
        if (!StringUtils.hasText(title)) {
            title = readString(row.get("songname"), "");
        }
        if (!StringUtils.hasText(title)) {
            title = readString(row.get("SONGNAME"), "");
        }
        if (!StringUtils.hasText(title)) {
            title = readString(row.get("NAME"), "");
        }
        return title;
    }

    private String readTrackArtist(String platform, Map<String, Object> row) {
        String artist = readString(row.get("artist"), "");
        if (!StringUtils.hasText(artist) && "netease".equals(platform)) {
            artist = joinNames(toObjectMapList(row.get("artists")), "name");
        }
        if (!StringUtils.hasText(artist) && "qq".equals(platform)) {
            List<Map<String, Object>> singers = toObjectMapList(row.get("singer"));
            if (singers.isEmpty()) {
                singers = toObjectMapList(row.get("singerList"));
            }
            artist = joinNames(singers, "name");
        }
        if (!StringUtils.hasText(artist)) {
            artist = readString(row.get("ARTIST"), "");
        }
        if (!StringUtils.hasText(artist)) {
            artist = readString(row.get("singername"), "");
        }
        if (StringUtils.hasText(artist) && artist.contains("&")) {
            artist = artist.replace("&", ", ");
        }
        return artist;
    }

    private String readTrackAlbum(Map<String, Object> row) {
        String album = readString(row.get("album"), "");
        Map<String, Object> albumObj = toStringObjectMap(row.get("album"));
        if (!albumObj.isEmpty()) {
            album = readString(albumObj.get("name"), album);
        }
        if (!StringUtils.hasText(album)) {
            album = readString(row.get("ALBUM"), "");
        }
        if (!StringUtils.hasText(album)) {
            album = readString(row.get("albumname"), "");
        }
        return album;
    }

    private String readTrackCover(String platform, Map<String, Object> row) {
        String cover = readString(row.get("cover"), "");
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("pic"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("picUrl"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("img"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("image"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("albumpic"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("albumPic"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("web_albumpic_short"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("pic120"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("pic300"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("album_pic"), "");
        }
        if (!StringUtils.hasText(cover)) {
            cover = readString(row.get("hts_MVPIC"), "");
        }
        if (!StringUtils.hasText(cover)) {
            Map<String, Object> albumObj = toStringObjectMap(row.get("album"));
            cover = readString(albumObj.get("picUrl"), "");
            if (!StringUtils.hasText(cover)) {
                String albumMid = readString(albumObj.get("mid"), "");
                if (!StringUtils.hasText(albumMid)) {
                    albumMid = readString(row.get("albummid"), "");
                }
                if (StringUtils.hasText(albumMid)) {
                    cover = "https://y.gtimg.cn/music/photo_new/T002R300x300M000" + albumMid + ".jpg";
                }
            }
        }
        if (!StringUtils.hasText(cover)) {
            String albumMid = readString(row.get("albummid"), "");
            if (StringUtils.hasText(albumMid)) {
                cover = "https://y.gtimg.cn/music/photo_new/T002R300x300M000" + albumMid + ".jpg";
            }
        }
        return normalizeCoverUrl(platform, cover);
    }

    private String normalizeCoverUrl(String platform, String rawCover) {
        String cover = readString(rawCover, "");
        if (!StringUtils.hasText(cover)) {
            return "";
        }
        if (cover.startsWith("http://") || cover.startsWith("https://")) {
            return cover;
        }
        if (cover.startsWith("//")) {
            return "https:" + cover;
        }
        String normalizedPlatform = normalizePlatformCode(platform);
        if ("kuwo".equals(normalizedPlatform)) {
            String normalized = cover.startsWith("/") ? cover.substring(1) : cover;
            if (normalized.startsWith("star/") || normalized.startsWith("starheads/")) {
                return "https://img4.kuwo.cn/" + normalized;
            }
            if (normalized.contains("/") && !normalized.startsWith("http")) {
                return "https://img4.kuwo.cn/star/albumcover/500/" + normalized;
            }
        }
        if (cover.startsWith("/")) {
            return "https://tunehub.sayqz.com" + cover;
        }
        return cover;
    }

    private Integer readDurationSeconds(Map<String, Object> row) {
        int sec = normalizeDurationValue(row.get("duration"), true, -1);
        if (sec < 0) {
            sec = normalizeDurationValue(row.get("interval"), false, -1);
        }
        if (sec < 0) {
            sec = normalizeDurationValue(row.get("DURATION"), false, -1);
        }
        if (sec < 0) {
            sec = normalizeDurationValue(row.get("dt"), true, -1);
        }
        if (sec < 0) {
            sec = parseMinuteSecondLabel(readString(row.get("songTimeMinutes"), ""));
        }
        return sec > 0 ? sec : null;
    }

    private int normalizeDurationValue(Object raw, boolean millisecondLikely, int fallback) {
        int value = readInt(raw, -1);
        if (value <= 0) {
            return fallback;
        }
        if (millisecondLikely && value > 1000) {
            return value / 1000;
        }
        if (!millisecondLikely && value > 1000 && value % 1000 == 0) {
            return value / 1000;
        }
        return value;
    }

    private int parseMinuteSecondLabel(String durationText) {
        String normalized = readString(durationText, "");
        if (!StringUtils.hasText(normalized) || !normalized.contains(":")) {
            return -1;
        }
        String[] chunks = normalized.split(":");
        if (chunks.length != 2) {
            return -1;
        }
        try {
            int minutes = Integer.parseInt(chunks[0].trim());
            int seconds = Integer.parseInt(chunks[1].trim());
            if (minutes < 0 || seconds < 0) {
                return -1;
            }
            return minutes * 60 + seconds;
        } catch (Exception ex) {
            return -1;
        }
    }

    private List<MusicTrackResponse> mergeTracks(String platform,
                                                 List<TrackSeed> seeds,
                                                 Map<String, ParseTrack> parsedTracks) {
        List<MusicTrackResponse> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (TrackSeed seed : seeds) {
            String id = readString(seed.id(), "");
            if (!StringUtils.hasText(id) || !seen.add(id)) {
                continue;
            }
            ParseTrack parsed = parsedTracks.get(id);
            if (parsed == null) {
                continue;
            }
            String title = StringUtils.hasText(parsed.title()) ? parsed.title() : readString(seed.title(), "Unknown");
            String artist = StringUtils.hasText(parsed.artist()) ? parsed.artist() : readString(seed.artist(), "未知歌手");
            String cover = StringUtils.hasText(parsed.cover()) ? parsed.cover() : readString(seed.cover(), "");
            result.add(new MusicTrackResponse(
                id,
                platform,
                title,
                artist,
                cover,
                parsed.audioUrl(),
                "",
                result.size() + 1,
                true,
                readString(parsed.lyricText(), "")
            ));
            if (result.size() >= MAX_TRACKS) {
                break;
            }
        }
        return result;
    }

    private Map<String, Object> requestJson(String method,
                                            String url,
                                            Map<String, Object> query,
                                            Map<String, String> headers,
                                            Map<String, Object> body) {
        long startMs = System.currentTimeMillis();
        String normalizedMethod = StringUtils.hasText(method) ? method.trim().toUpperCase(Locale.ROOT) : "GET";
        String sanitizedUrl = sanitizeRequestUrl(url);
        try {
            if ("POST".equals(normalizedMethod)) {
                Map<String, Object> payload = body == null ? Map.of() : body;
                String responseBody = restClient.post()
                    .uri(URI.create(url))
                    .headers(httpHeaders -> headers.forEach(httpHeaders::set))
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.ALL)
                    .body(payload)
                    .retrieve()
                    .body(String.class);
                Map<String, Object> parsed = parseResponseBody(responseBody, url);
                LOGGER.info(
                    "MUSIC_TUNEHUB_HTTP_DONE method={} url={} status={} bodySize={} durationMs={}",
                    normalizedMethod,
                    sanitizedUrl,
                    200,
                    responseBody == null ? 0 : responseBody.length(),
                    Math.max(1L, System.currentTimeMillis() - startMs)
                );
                return parsed;
            }
            String requestUrl = appendQuery(url, query);
            String responseBody = restClient.get()
                .uri(URI.create(requestUrl))
                .headers(httpHeaders -> headers.forEach(httpHeaders::set))
                .accept(MediaType.ALL)
                .retrieve()
                .body(String.class);
            Map<String, Object> parsed = parseResponseBody(responseBody, requestUrl);
            LOGGER.info(
                "MUSIC_TUNEHUB_HTTP_DONE method={} url={} status={} bodySize={} durationMs={}",
                normalizedMethod,
                sanitizeRequestUrl(requestUrl),
                200,
                responseBody == null ? 0 : responseBody.length(),
                Math.max(1L, System.currentTimeMillis() - startMs)
            );
            return parsed;
        } catch (RestClientResponseException ex) {
            LOGGER.warn(
                "MUSIC_TUNEHUB_HTTP_FAIL method={} url={} status={} durationMs={} reason={}",
                normalizedMethod,
                sanitizedUrl,
                ex.getRawStatusCode(),
                Math.max(1L, System.currentTimeMillis() - startMs),
                sanitizeLogMessage(ex.getMessage())
            );
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "TuneHub upstream request failed",
                Map.of(
                    "status", ex.getRawStatusCode(),
                    "url", url,
                    "body", previewText(ex.getResponseBodyAsString())
                )
            );
        } catch (ResourceAccessException ex) {
            LOGGER.warn(
                "MUSIC_TUNEHUB_HTTP_FAIL method={} url={} status={} durationMs={} reason={}",
                normalizedMethod,
                sanitizedUrl,
                "timeout",
                Math.max(1L, System.currentTimeMillis() - startMs),
                sanitizeLogMessage(ex.getMessage())
            );
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "TuneHub upstream timeout",
                Map.of("url", url)
            );
        } catch (Exception ex) {
            LOGGER.warn(
                "MUSIC_TUNEHUB_HTTP_FAIL method={} url={} status={} durationMs={} reason={}",
                normalizedMethod,
                sanitizedUrl,
                "error",
                Math.max(1L, System.currentTimeMillis() - startMs),
                sanitizeLogMessage(ex.getMessage())
            );
            throw ex;
        }
    }

    private String sanitizeRequestUrl(String rawUrl) {
        String value = readString(rawUrl, "");
        if (!StringUtils.hasText(value)) {
            return "-";
        }
        try {
            URI uri = URI.create(value);
            String host = readString(uri.getHost(), "");
            String path = readString(uri.getPath(), "");
            if (!StringUtils.hasText(host) && !StringUtils.hasText(path)) {
                return previewText(value);
            }
            return host + path;
        } catch (Exception ex) {
            int queryIndex = value.indexOf('?');
            String fallback = queryIndex >= 0 ? value.substring(0, queryIndex) : value;
            return previewText(fallback);
        }
    }

    private Map<String, Object> parseResponseBody(String rawBody, String url) {
        String normalized = normalizeJsonPayload(rawBody);
        if (!StringUtils.hasText(normalized)) {
            return Map.of();
        }
        Object payload = readJsonPayload(normalized);
        if (payload instanceof Map<?, ?> mapRaw) {
            return toStringObjectMap(mapRaw);
        }
        if (payload instanceof List<?> listRaw) {
            Map<String, Object> wrapped = new LinkedHashMap<>();
            wrapped.put("data", listRaw);
            wrapped.put("list", listRaw);
            wrapped.put("child", listRaw);
            return wrapped;
        }
        throw new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "TuneHub response parse failed",
            Map.of("url", url, "body", previewText(normalized))
        );
    }

    private Object readJsonPayload(String payload) {
        try {
            return objectMapper.readValue(payload, new TypeReference<Object>() {
            });
        } catch (JsonProcessingException ex) {
            return null;
        }
    }

    private String normalizeJsonPayload(String rawBody) {
        String text = rawBody == null ? "" : rawBody.trim();
        if (!StringUtils.hasText(text)) {
            return "";
        }
        if (text.startsWith("\uFEFF")) {
            text = text.substring(1).trim();
        }
        if (text.startsWith("{") || text.startsWith("[")) {
            return text;
        }
        int firstBrace = text.indexOf('{');
        int lastBrace = text.lastIndexOf('}');
        if (firstBrace >= 0 && lastBrace > firstBrace) {
            return text.substring(firstBrace, lastBrace + 1).trim();
        }
        int firstBracket = text.indexOf('[');
        int lastBracket = text.lastIndexOf(']');
        if (firstBracket >= 0 && lastBracket > firstBracket) {
            return text.substring(firstBracket, lastBracket + 1).trim();
        }
        return text;
    }

    private String sanitizeLogMessage(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "unknown_error";
        }
        String normalized = raw.replace('\n', ' ').replace('\r', ' ').trim();
        if (normalized.length() > 220) {
            return normalized.substring(0, 220) + "...";
        }
        return normalized;
    }

    private String previewText(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "";
        }
        String normalized = raw.replace('\n', ' ').replace('\r', ' ').trim();
        if (normalized.length() > 240) {
            return normalized.substring(0, 240) + "...";
        }
        return normalized;
    }

    private Object resolveTemplateValue(Object rawValue, Map<String, Object> context) {
        if (rawValue == null) {
            return null;
        }
        if (rawValue instanceof Map<?, ?> mapRaw) {
            return resolveTemplateMap(mapRaw, context);
        }
        if (rawValue instanceof List<?> listRaw) {
            List<Object> next = new ArrayList<>();
            for (Object item : listRaw) {
                next.add(resolveTemplateValue(item, context));
            }
            return next;
        }
        if (!(rawValue instanceof String rawText)) {
            return rawValue;
        }

        String trimmed = rawText.trim();
        if (!trimmed.startsWith("{{") || !trimmed.endsWith("}}")) {
            return rawText;
        }
        String expr = trimmed.substring(2, trimmed.length() - 2).trim();

        if ("id".equals(expr)) {
            return readString(context.get("id"), "");
        }
        if ("platform".equals(expr)) {
            return readString(context.get("platform"), "");
        }
        if ("keyword".equals(expr)) {
            return readString(context.get("keyword"), "");
        }
        if ("page || 1".equals(expr)) {
            return Math.max(1, readInt(context.get("page"), 1));
        }
        if ("limit || 20".equals(expr)) {
            return Math.max(1, readInt(context.get("limit"), 20));
        }
        if ("((page || 1) - 1) * (limit || 20)".equals(expr)) {
            int page = Math.max(1, readInt(context.get("page"), 1));
            int limit = Math.max(1, readInt(context.get("limit"), 20));
            return (page - 1) * limit;
        }
        if (expr.startsWith("parseInt(") && expr.endsWith(")")) {
            String key = expr.substring("parseInt(".length(), expr.length() - 1).trim();
            return readInt(context.get(key), 0);
        }
        if (context.containsKey(expr)) {
            return context.get(expr);
        }
        return "";
    }

    private Map<String, Object> resolveTemplateMap(Object rawMap,
                                                   Map<String, Object> context) {
        if (!(rawMap instanceof Map<?, ?> mapLike)) {
            return Map.of();
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : mapLike.entrySet()) {
            String key = String.valueOf(entry.getKey());
            result.put(key, resolveTemplateValue(entry.getValue(), context));
        }
        return result;
    }

    private String appendQuery(String url, Map<String, Object> query) {
        if (query == null || query.isEmpty()) {
            return url;
        }
        StringBuilder builder = new StringBuilder(url);
        boolean hasQuestion = url.contains("?");
        for (Map.Entry<String, Object> entry : query.entrySet()) {
            String key = readString(entry.getKey(), "");
            if (!StringUtils.hasText(key) || entry.getValue() == null) {
                continue;
            }
            String value = String.valueOf(entry.getValue());
            builder.append(hasQuestion ? '&' : '?');
            hasQuestion = true;
            builder.append(URLEncoder.encode(key, StandardCharsets.UTF_8));
            builder.append('=');
            builder.append(URLEncoder.encode(value, StandardCharsets.UTF_8));
        }
        return builder.toString();
    }

    private Map<String, String> keyHeader(String apiKey) {
        if (!StringUtils.hasText(apiKey)) {
            return Map.of();
        }
        return Map.of("X-API-Key", apiKey.trim());
    }

    private String joinBasePath(String path) {
        String base = readString(properties.getBaseUrl(), "https://tunehub.sayqz.com/api");
        if (base.endsWith("/")) {
            base = base.substring(0, base.length() - 1);
        }
        if (!path.startsWith("/")) {
            return base + "/" + path;
        }
        return base + path;
    }

    private String normalizePlatformCode(String platform) {
        return readString(platform, "").toLowerCase(Locale.ROOT);
    }

    private String encodePathSegment(String input) {
        return URLEncoder.encode(readString(input, ""), StandardCharsets.UTF_8);
    }

    private Map<String, Object> toStringObjectMap(Object raw) {
        if (!(raw instanceof Map<?, ?> mapRaw)) {
            return Map.of();
        }
        Map<String, Object> map = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : mapRaw.entrySet()) {
            map.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return map;
    }

    private List<Map<String, Object>> toObjectMapList(Object raw) {
        if (!(raw instanceof List<?> listRaw)) {
            return List.of();
        }
        List<Map<String, Object>> result = new ArrayList<>();
        for (Object item : listRaw) {
            if (item instanceof Map<?, ?> mapRaw) {
                result.add(toStringObjectMap(mapRaw));
            }
        }
        return result;
    }

    private String joinNames(List<Map<String, Object>> rows, String key) {
        List<String> names = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            String name = readString(row.get(key), "");
            if (StringUtils.hasText(name)) {
                names.add(name);
            }
        }
        return String.join(", ", names);
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }

    private int readInt(Object raw, int fallback) {
        if (raw == null) {
            return fallback;
        }
        try {
            return Integer.parseInt(String.valueOf(raw).trim());
        } catch (Exception ex) {
            return fallback;
        }
    }

    private boolean readBoolean(Object raw, boolean fallback) {
        if (raw instanceof Boolean value) {
            return value;
        }
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim().toLowerCase(Locale.ROOT);
        if ("true".equals(value) || "1".equals(value)) {
            return true;
        }
        if ("false".equals(value) || "0".equals(value)) {
            return false;
        }
        return fallback;
    }

    public record DynamicPlaylistResult(String platform,
                                        List<MusicTrackResponse> tracks,
                                        long durationMs,
                                        LocalDateTime builtAt) {
    }

    public record VirtualPlaylistSummary(String platform,
                                         String sourceType,
                                         String sourceId,
                                         String name,
                                         String description,
                                         String cover,
                                         String playlistCode) {
    }

    public record ParseTrackResult(String trackId,
                                   String title,
                                   String artist,
                                   String cover,
                                   String audioUrl,
                                   String lyricText) {
    }

    public record SearchTrackResult(String trackId,
                                    String title,
                                    String artist,
                                    String album,
                                    String cover,
                                    Integer durationSec,
                                    String provider) {
    }

    private record ToplistSeed(String id, String name, String cover) {
    }

    private record TrackSeed(String id, String title, String artist, String cover) {
    }

    private record ParseTrack(String id, String title, String artist, String cover, String audioUrl, String lyricText) {
    }
}
