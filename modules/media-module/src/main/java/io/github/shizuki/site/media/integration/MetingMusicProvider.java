package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MetingMusicProperties;
import io.github.shizuki.site.media.response.MusicTrackResponse;
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
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * Meting sidecar 客户端。
 */
@Component
public class MetingMusicProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(MetingMusicProvider.class);
    private static final Set<String> SUPPORTED_PLATFORMS = Set.of("netease", "kuwo", "qq");

    private final MetingMusicProperties properties;
    private final RestClient restClient;
    private final ObjectMapper objectMapper;

    public MetingMusicProvider(MetingMusicProperties properties,
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

    public Set<String> listSupportedPlatforms() {
        Map<String, Object> payload = requestJson("/health", Map.of());
        Set<String> result = new LinkedHashSet<>();
        for (Object item : asObjectList(payload.get("providers"))) {
            String provider = normalizePlatformCode(String.valueOf(item));
            if (StringUtils.hasText(provider)) {
                result.add(provider);
            }
        }
        if (result.isEmpty()) {
            result.addAll(SUPPORTED_PLATFORMS);
        }
        return result;
    }

    public DynamicPlaylistResult buildDefaultPlaylist(String apiKey,
                                                      List<String> platformOrder,
                                                      String quality) {
        List<VirtualPlaylistSummary> playlists = listToplistPlaylists(apiKey, platformOrder, 1);
        if (playlists.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "No meting playlist available");
        }
        VirtualPlaylistSummary selected = playlists.get(0);
        List<MusicTrackResponse> tracks = loadVirtualPlaylistTracks(
            apiKey,
            selected.platform(),
            selected.sourceType(),
            selected.sourceId()
        );
        return new DynamicPlaylistResult(
            selected.platform(),
            tracks,
            1L,
            LocalDateTime.now()
        );
    }

    public List<VirtualPlaylistSummary> listToplistPlaylists(String apiKey,
                                                             List<String> platformOrder,
                                                             int perPlatform) {
        int safeLimit = Math.max(1, Math.min(4, perPlatform));
        List<String> normalizedOrder = normalizePlatformOrder(platformOrder);
        List<VirtualPlaylistSummary> result = new ArrayList<>();

        for (String platform : normalizedOrder) {
            String configuredPlaylistId = readString(properties.findDefaultPlaylistId(platform), "");
            if (StringUtils.hasText(configuredPlaylistId)) {
                result.add(new VirtualPlaylistSummary(
                    platform,
                    "playlist",
                    configuredPlaylistId,
                    resolveProviderDisplayName(platform) + " 推荐歌单",
                    "Meting 推荐歌单",
                    "",
                    buildVirtualPlaylistCode(platform, "playlist", configuredPlaylistId),
                    null
                ));
                if (safeLimit <= 1) {
                    continue;
                }
            }

            String keyword = "热歌";
            result.add(new VirtualPlaylistSummary(
                platform,
                "search",
                encodeVirtualSearchKeyword(keyword),
                resolveProviderDisplayName(platform) + " 热歌",
                "Meting 搜索虚拟歌单",
                "",
                buildVirtualPlaylistCode(platform, "search", encodeVirtualSearchKeyword(keyword)),
                null
            ));
        }
        return result;
    }

    public List<MusicTrackResponse> loadVirtualPlaylistTracks(String apiKey,
                                                              String platform,
                                                              String sourceType,
                                                              String sourceId) {
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedType = readString(sourceType, "").toLowerCase(Locale.ROOT);
        String normalizedSourceId = readString(sourceId, "");
        if (!StringUtils.hasText(normalizedPlatform)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported meting platform");
        }
        if (!StringUtils.hasText(normalizedType) || !StringUtils.hasText(normalizedSourceId)) {
            return List.of();
        }

        if ("search".equals(normalizedType)) {
            String keyword = decodeVirtualSearchKeyword(normalizedSourceId);
            if (!StringUtils.hasText(keyword)) {
                return List.of();
            }
            List<SearchTrackResult> rows = searchTracks(apiKey, normalizedPlatform, keyword, 1, 60);
            List<MusicTrackResponse> tracks = new ArrayList<>();
            int sort = 1;
            for (SearchTrackResult row : rows) {
                tracks.add(new MusicTrackResponse(
                    row.trackId(),
                    row.provider(),
                    row.title(),
                    row.artist(),
                    row.cover(),
                    "",
                    "",
                    sort,
                    true,
                    "",
                    buildTrackMetadata(row.durationSec(), row.album())
                ));
                sort += 1;
            }
            return tracks;
        }

        if (!"playlist".equals(normalizedType)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported virtual playlist type");
        }

        Map<String, Object> payload = requestJson("/v1/playlist", Map.of(
            "provider", mapProviderToSidecar(normalizedPlatform),
            "playlist_id", normalizedSourceId
        ));
        List<MusicTrackResponse> tracks = new ArrayList<>();
        for (Object item : asObjectList(payload.get("tracks"))) {
            Map<String, Object> row = asObjectMap(item);
            String trackId = readString(row.get("trackId"), "");
            if (!StringUtils.hasText(trackId)) {
                continue;
            }
            tracks.add(new MusicTrackResponse(
                trackId,
                normalizePlatformCode(readString(row.get("provider"), normalizedPlatform)),
                readString(row.get("title"), trackId),
                readString(row.get("artist"), ""),
                readString(row.get("cover"), ""),
                readString(row.get("audio"), ""),
                "",
                readInt(row.get("sort"), tracks.size() + 1),
                true,
                readString(row.get("lyricText"), ""),
                buildTrackMetadata(readNullableInt(row.get("durationSec")), readString(row.get("album"), ""))
            ));
        }
        return tracks;
    }

    public List<SearchTrackResult> searchTracks(String apiKey,
                                                String platform,
                                                String keyword,
                                                int page,
                                                int limit) {
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedKeyword = readString(keyword, "");
        if (!StringUtils.hasText(normalizedPlatform) || !StringUtils.hasText(normalizedKeyword)) {
            return List.of();
        }

        Map<String, Object> payload = requestJson("/v1/search", Map.of(
            "provider", mapProviderToSidecar(normalizedPlatform),
            "q", normalizedKeyword,
            "page", String.valueOf(Math.max(1, page)),
            "limit", String.valueOf(Math.max(1, Math.min(60, limit)))
        ));

        List<SearchTrackResult> result = new ArrayList<>();
        for (Object item : asObjectList(payload.get("tracks"))) {
            Map<String, Object> row = asObjectMap(item);
            String trackId = readString(row.get("trackId"), "");
            if (!StringUtils.hasText(trackId)) {
                continue;
            }
            result.add(new SearchTrackResult(
                trackId,
                normalizePlatformCode(readString(row.get("provider"), normalizedPlatform)),
                readString(row.get("title"), trackId),
                readString(row.get("artist"), ""),
                readString(row.get("album"), ""),
                readString(row.get("cover"), ""),
                readNullableInt(row.get("durationSec"))
            ));
        }
        return result;
    }

    public List<VirtualPlaylistSummary> searchPlaylists(String apiKey,
                                                        String platform,
                                                        String keyword,
                                                        int page,
                                                        int limit) {
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedKeyword = readString(keyword, "");
        if (!StringUtils.hasText(normalizedPlatform) || !StringUtils.hasText(normalizedKeyword)) {
            return List.of();
        }
        String encodedKeyword = encodeVirtualSearchKeyword(normalizedKeyword);
        return List.of(
            new VirtualPlaylistSummary(
                normalizedPlatform,
                "search",
                encodedKeyword,
                resolveProviderDisplayName(normalizedPlatform) + " 搜索: " + normalizedKeyword,
                "Meting 搜索虚拟歌单",
                "",
                buildVirtualPlaylistCode(normalizedPlatform, "search", encodedKeyword),
                null
            )
        );
    }

    public VirtualPlaylistSummary loadPlaylistSummary(String apiKey,
                                                      String platform,
                                                      String sourceType,
                                                      String sourceId) {
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedType = readString(sourceType, "").toLowerCase(Locale.ROOT);
        String normalizedSourceId = readString(sourceId, "");
        if (!"playlist".equals(normalizedType) || !StringUtils.hasText(normalizedSourceId)) {
            return null;
        }

        try {
            Map<String, Object> payload = requestJson("/v1/playlist", Map.of(
                "provider", mapProviderToSidecar(normalizedPlatform),
                "playlist_id", normalizedSourceId
            ));
            return new VirtualPlaylistSummary(
                normalizedPlatform,
                "playlist",
                normalizedSourceId,
                readString(payload.get("name"), resolveProviderDisplayName(normalizedPlatform) + " 歌单"),
                readString(payload.get("description"), ""),
                readString(payload.get("cover"), ""),
                buildVirtualPlaylistCode(normalizedPlatform, "playlist", normalizedSourceId),
                readNullableInt(payload.get("trackCount"))
            );
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_METING_LOAD_PLAYLIST_SUMMARY_FAIL provider={} playlistId={} reason={}",
                normalizedPlatform,
                normalizedSourceId,
                sanitizeLogMessage(ex.getMessage()));
            return null;
        }
    }

    public ParseTrackResult parseSingleTrack(String apiKey,
                                             String platform,
                                             String trackId,
                                             String quality) {
        String normalizedPlatform = normalizePlatformCode(platform);
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedPlatform) || !StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "provider and track_id are required");
        }

        int bitrate = properties.getDefaultBitrateKbps();
        Map<String, Object> payload = requestJson("/v1/track/resolve", Map.of(
            "provider", mapProviderToSidecar(normalizedPlatform),
            "track_id", normalizedTrackId,
            "bitrate", String.valueOf(bitrate)
        ));

        return new ParseTrackResult(
            readString(payload.get("trackId"), normalizedTrackId),
            readString(payload.get("title"), normalizedTrackId),
            readString(payload.get("artist"), ""),
            readString(payload.get("album"), ""),
            readString(payload.get("audio"), ""),
            readString(payload.get("cover"), ""),
            readString(payload.get("lyricText"), ""),
            readString(payload.get("translationLyricText"), ""),
            readString(payload.get("furiganaLyricText"), "")
        );
    }

    private String buildVirtualPlaylistCode(String platform, String sourceType, String sourceId) {
        return "vh_meting_" + platform + "_" + sourceType + "_" + sourceId;
    }

    private String encodeVirtualSearchKeyword(String keyword) {
        return Base64.getUrlEncoder().withoutPadding().encodeToString(keyword.getBytes(StandardCharsets.UTF_8));
    }

    private String decodeVirtualSearchKeyword(String encoded) {
        try {
            return new String(Base64.getUrlDecoder().decode(encoded), StandardCharsets.UTF_8).trim();
        } catch (Exception ex) {
            return "";
        }
    }

    private Map<String, Object> requestJson(String path, Map<String, String> query) {
        String url = buildUrl(path, query);
        String body;
        try {
            body = restClient.get().uri(URI.create(url)).retrieve().body(String.class);
        } catch (RestClientResponseException ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Meting upstream request failed",
                Map.of("upstream_status", ex.getStatusCode().value(), "reason", sanitizeLogMessage(ex.getMessage()))
            );
        } catch (ResourceAccessException ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Meting upstream timeout",
                Map.of("reason", sanitizeLogMessage(ex.getMessage()))
            );
        }

        try {
            Map<String, Object> payload = objectMapper.readValue(readString(body, "{}"), new TypeReference<>() {
            });
            if (payload == null) {
                return Map.of();
            }
            return payload;
        } catch (Exception ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Meting response parse failed",
                Map.of("reason", sanitizeLogMessage(ex.getMessage()))
            );
        }
    }

    private String buildUrl(String path, Map<String, String> query) {
        StringBuilder builder = new StringBuilder();
        builder.append(readString(properties.getBaseUrl(), "http://meting-api"));
        if (!path.startsWith("/")) {
            builder.append('/');
        }
        builder.append(path);
        if (query != null && !query.isEmpty()) {
            boolean first = true;
            for (Map.Entry<String, String> entry : query.entrySet()) {
                String key = readString(entry.getKey(), "");
                String value = readString(entry.getValue(), "");
                if (!StringUtils.hasText(key) || !StringUtils.hasText(value)) {
                    continue;
                }
                builder.append(first ? '?' : '&');
                first = false;
                builder.append(URLEncoder.encode(key, StandardCharsets.UTF_8));
                builder.append('=');
                builder.append(URLEncoder.encode(value, StandardCharsets.UTF_8));
            }
        }
        return builder.toString();
    }

    private String mapProviderToSidecar(String platform) {
        String normalized = normalizePlatformCode(platform);
        if ("qq".equals(normalized)) {
            return "qq";
        }
        return normalized;
    }

    private String normalizePlatformCode(String value) {
        String normalized = readString(value, "").toLowerCase(Locale.ROOT);
        if ("tencent".equals(normalized) || "qqmusic".equals(normalized)) {
            return "qq";
        }
        if (SUPPORTED_PLATFORMS.contains(normalized)) {
            return normalized;
        }
        return "";
    }

    private List<String> normalizePlatformOrder(List<String> platformOrder) {
        List<String> source = platformOrder == null || platformOrder.isEmpty()
            ? properties.getDefaultPlatformOrder()
            : platformOrder;
        List<String> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        for (String item : source) {
            String normalized = normalizePlatformCode(item);
            if (!StringUtils.hasText(normalized) || !seen.add(normalized)) {
                continue;
            }
            result.add(normalized);
        }
        if (result.isEmpty()) {
            return List.of("netease", "kuwo", "qq");
        }
        return result;
    }

    private String resolveProviderDisplayName(String provider) {
        return switch (normalizePlatformCode(provider)) {
            case "netease" -> "网易云";
            case "kuwo" -> "酷我";
            case "qq" -> "QQ 音乐";
            default -> "Meting";
        };
    }

    private Map<String, Object> asObjectMap(Object value) {
        if (!(value instanceof Map<?, ?> rawMap)) {
            return Map.of();
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : rawMap.entrySet()) {
            result.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return result;
    }

    private List<Object> asObjectList(Object value) {
        if (!(value instanceof List<?> rawList)) {
            return List.of();
        }
        return new ArrayList<>(rawList);
    }

    private String readString(Object value, String fallback) {
        String text = value == null ? "" : String.valueOf(value).trim();
        return StringUtils.hasText(text) ? text : fallback;
    }

    private int readInt(Object value, int fallback) {
        try {
            return Integer.parseInt(String.valueOf(value));
        } catch (Exception ex) {
            return fallback;
        }
    }

    private Integer readNullableInt(Object value) {
        if (value == null) {
            return null;
        }
        try {
            return Integer.parseInt(String.valueOf(value));
        } catch (Exception ex) {
            return null;
        }
    }

    private Map<String, Object> buildTrackMetadata(Integer durationSec, String album) {
        Map<String, Object> metadata = new LinkedHashMap<>();
        if (durationSec != null && durationSec > 0) {
            metadata.put("durationSec", durationSec);
        }
        if (StringUtils.hasText(album)) {
            metadata.put("album", album);
        }
        return metadata;
    }

    private String sanitizeLogMessage(String raw) {
        String normalized = readString(raw, "unknown_error").replace('\n', ' ').replace('\r', ' ').trim();
        if (normalized.length() > 240) {
            return normalized.substring(0, 240) + "...";
        }
        return normalized;
    }

    public record DynamicPlaylistResult(String platform,
                                        List<MusicTrackResponse> tracks,
                                        long durationMs,
                                        LocalDateTime fetchedAt) {
    }

    public record ParseTrackResult(String trackId,
                                   String title,
                                   String artist,
                                   String album,
                                   String audioUrl,
                                   String cover,
                                   String lyricText,
                                   String translationLyricText,
                                   String furiganaLyricText) {
    }

    public record SearchTrackResult(String trackId,
                                    String provider,
                                    String title,
                                    String artist,
                                    String album,
                                    String cover,
                                    Integer durationSec) {
    }

    public record VirtualPlaylistSummary(String platform,
                                         String sourceType,
                                         String sourceId,
                                         String name,
                                         String description,
                                         String cover,
                                         String playlistCode,
                                         Integer trackCount) {
    }
}
