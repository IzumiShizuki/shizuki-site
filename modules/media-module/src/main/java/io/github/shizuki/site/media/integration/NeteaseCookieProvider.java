package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
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
import org.springframework.web.client.RestClient;

/**
 * 网易云 Cookie 模式客户端（V1：读取 + 导入 + 播放兜底）。
 */
@Component
public class NeteaseCookieProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(NeteaseCookieProvider.class);
    private static final int SONG_DETAIL_BATCH_SIZE = 100;

    private final RestClient restClient;

    public NeteaseCookieProvider(RestClient.Builder restClientBuilder) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(java.time.Duration.ofSeconds(10));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    public boolean verifyCookie(String cookie) {
        if (!StringUtils.hasText(cookie)) {
            return false;
        }
        try {
            Long userId = resolveUserId(cookie);
            return userId != null && userId > 0;
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_NETEASE_COOKIE_VERIFY_FAIL reason={}", sanitize(ex.getMessage()));
            return false;
        }
    }

    public List<PlaylistSummary> listUserPlaylists(String cookie, int limit) {
        String normalizedCookie = normalizeCookie(cookie);
        Long userId = resolveUserId(normalizedCookie);
        int safeLimit = Math.max(1, Math.min(500, limit));
        Map<String, Object> payload = requestJson(
            "https://music.163.com/api/user/playlist",
            Map.of(
                "uid", userId,
                "offset", 0,
                "limit", safeLimit
            ),
            normalizedCookie
        );
        List<Map<String, Object>> rows = toObjectMapList(payload.get("playlist"));
        List<PlaylistSummary> result = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            String id = readString(row.get("id"), "");
            if (!StringUtils.hasText(id)) {
                continue;
            }
            result.add(new PlaylistSummary(
                id,
                readString(row.get("name"), "网易云歌单"),
                readString(row.get("description"), ""),
                readString(row.get("coverImgUrl"), ""),
                readInt(row.get("trackCount"), 0)
            ));
        }
        return result;
    }

    public List<TrackSummary> listPlaylistTracks(String playlistId, String cookie, int limit) {
        String normalizedCookie = normalizeCookie(cookie);
        String normalizedPlaylistId = readString(playlistId, "");
        if (!StringUtils.hasText(normalizedPlaylistId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "playlist_id is required");
        }
        int safeLimit = Math.max(1, Math.min(1000, limit));
        Map<String, Object> payload = requestJson(
            "https://music.163.com/api/v6/playlist/detail",
            Map.of("id", normalizedPlaylistId),
            normalizedCookie
        );
        Map<String, Object> playlist = toStringObjectMap(payload.get("playlist"));
        if (playlist.isEmpty()) {
            playlist = toStringObjectMap(payload.get("result"));
        }

        List<Map<String, Object>> tracks = toObjectMapList(playlist.get("tracks"));
        Map<String, Map<String, Object>> songRowsById = new LinkedHashMap<>();
        for (Map<String, Object> row : tracks) {
            String id = readString(row.get("id"), "");
            if (StringUtils.hasText(id)) {
                songRowsById.put(id, row);
            }
        }

        List<String> orderedTrackIds = extractTrackIds(playlist);
        if (!orderedTrackIds.isEmpty()) {
            List<String> missingIds = new ArrayList<>();
            for (String id : orderedTrackIds) {
                if (!songRowsById.containsKey(id)) {
                    missingIds.add(id);
                }
            }
            if (!missingIds.isEmpty()) {
                Map<String, Map<String, Object>> detailMap = loadSongDetails(missingIds, normalizedCookie);
                songRowsById.putAll(detailMap);
            }
        }

        List<TrackSummary> result = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        if (!orderedTrackIds.isEmpty()) {
            for (String id : orderedTrackIds) {
                if (!seen.add(id)) {
                    continue;
                }
                TrackSummary summary = toTrackSummary(songRowsById.get(id));
                if (summary != null) {
                    result.add(summary);
                }
                if (result.size() >= safeLimit) {
                    break;
                }
            }
        }

        if (result.isEmpty()) {
            for (Map<String, Object> row : songRowsById.values()) {
                TrackSummary summary = toTrackSummary(row);
                if (summary == null) {
                    continue;
                }
                result.add(summary);
                if (result.size() >= safeLimit) {
                    break;
                }
            }
        }
        return result;
    }

    public ResolvedTrack resolveTrack(String trackId, String cookie, boolean resolveLyric) {
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        String normalizedCookie = normalizeCookie(cookie);
        Map<String, Map<String, Object>> detailMap = loadSongDetails(List.of(normalizedTrackId), normalizedCookie);
        Map<String, Object> song = detailMap.get(normalizedTrackId);

        String title = readString(song == null ? null : song.get("name"), "");
        String artist = readArtist(song);
        String cover = readCover(song);
        String audioUrl = "https://music.163.com/song/media/outer/url?id="
            + URLEncoder.encode(normalizedTrackId, StandardCharsets.UTF_8)
            + ".mp3";

        String lyricText = "";
        if (resolveLyric) {
            Map<String, Object> lyricPayload = requestJson(
                "https://music.163.com/api/song/lyric",
                Map.of(
                    "id", normalizedTrackId,
                    "lv", -1,
                    "kv", -1,
                    "tv", -1
                ),
                normalizedCookie
            );
            lyricText = readString(toStringObjectMap(lyricPayload.get("lrc")).get("lyric"), "");
        }

        return new ResolvedTrack(
            normalizedTrackId,
            title,
            artist,
            cover,
            audioUrl,
            lyricText
        );
    }

    private Long resolveUserId(String cookie) {
        Map<String, Object> payload = requestJson(
            "https://music.163.com/api/nuser/account/get",
            Map.of(),
            cookie
        );
        Map<String, Object> account = toStringObjectMap(payload.get("account"));
        long userId = readLong(account.get("id"), 0L);
        if (userId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Netease cookie invalid");
        }
        return userId;
    }

    private Map<String, Map<String, Object>> loadSongDetails(List<String> trackIds, String cookie) {
        Map<String, Map<String, Object>> result = new LinkedHashMap<>();
        if (trackIds == null || trackIds.isEmpty()) {
            return result;
        }
        List<String> normalizedIds = trackIds.stream()
            .map(item -> readString(item, ""))
            .filter(StringUtils::hasText)
            .toList();
        for (int offset = 0; offset < normalizedIds.size(); offset += SONG_DETAIL_BATCH_SIZE) {
            int end = Math.min(normalizedIds.size(), offset + SONG_DETAIL_BATCH_SIZE);
            List<String> batch = normalizedIds.subList(offset, end);
            String idsJson = "[" + batch.stream().map(id -> "\"" + id + "\"").reduce((a, b) -> a + "," + b).orElse("") + "]";
            Map<String, Object> payload = requestJson(
                "https://music.163.com/api/song/detail",
                Map.of("ids", idsJson),
                cookie
            );
            List<Map<String, Object>> songs = toObjectMapList(payload.get("songs"));
            for (Map<String, Object> row : songs) {
                String id = readString(row.get("id"), "");
                if (StringUtils.hasText(id)) {
                    result.put(id, row);
                }
            }
        }
        return result;
    }

    private List<String> extractTrackIds(Map<String, Object> playlist) {
        List<String> result = new ArrayList<>();
        List<Map<String, Object>> rows = toObjectMapList(playlist.get("trackIds"));
        for (Map<String, Object> row : rows) {
            String id = readString(row.get("id"), "");
            if (StringUtils.hasText(id)) {
                result.add(id);
            }
        }
        return result;
    }

    private TrackSummary toTrackSummary(Map<String, Object> raw) {
        if (raw == null || raw.isEmpty()) {
            return null;
        }
        String trackId = readString(raw.get("id"), "");
        if (!StringUtils.hasText(trackId)) {
            return null;
        }
        return new TrackSummary(
            trackId,
            readString(raw.get("name"), trackId),
            readArtist(raw),
            readCover(raw),
            readInt(raw.get("dt"), 0) <= 0 ? null : Math.max(1, readInt(raw.get("dt"), 0) / 1000),
            readString(toStringObjectMap(raw.get("al")).get("name"), "")
        );
    }

    private String readArtist(Map<String, Object> raw) {
        List<Map<String, Object>> ar = toObjectMapList(raw == null ? null : raw.get("ar"));
        if (ar.isEmpty()) {
            ar = toObjectMapList(raw == null ? null : raw.get("artists"));
        }
        List<String> names = new ArrayList<>();
        for (Map<String, Object> row : ar) {
            String name = readString(row.get("name"), "");
            if (StringUtils.hasText(name)) {
                names.add(name);
            }
        }
        return names.isEmpty() ? "未知歌手" : String.join(" / ", names);
    }

    private String readCover(Map<String, Object> raw) {
        Map<String, Object> al = toStringObjectMap(raw == null ? null : raw.get("al"));
        return readString(al.get("picUrl"), "");
    }

    private Map<String, Object> requestJson(String url, Map<String, Object> query, String cookie) {
        String finalUrl = appendQuery(url, query);
        String body = restClient.get()
            .uri(finalUrl)
            .header("Referer", "https://music.163.com/")
            .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
            .header("Cookie", normalizeCookie(cookie))
            .retrieve()
            .body(String.class);
        Map<String, Object> json = tryParseJson(body);
        if (json.isEmpty()) {
            return Map.of();
        }
        int code = readInt(json.get("code"), 200);
        if (code != 200 && code != 0) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Netease request failed",
                Map.of("url", url, "code", code)
            );
        }
        return json;
    }

    private Map<String, Object> tryParseJson(String body) {
        if (!StringUtils.hasText(body)) {
            return Map.of();
        }
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().readValue(body, new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {
            });
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_NETEASE_PARSE_FAIL reason={}", sanitize(ex.getMessage()));
            return Map.of();
        }
    }

    private String appendQuery(String url, Map<String, Object> query) {
        if (query == null || query.isEmpty()) {
            return url;
        }
        StringBuilder builder = new StringBuilder(url);
        boolean hasQuestion = url.contains("?");
        for (Map.Entry<String, Object> entry : query.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            String key = readString(entry.getKey(), "");
            if (!StringUtils.hasText(key)) {
                continue;
            }
            builder.append(hasQuestion ? '&' : '?');
            hasQuestion = true;
            builder.append(URLEncoder.encode(key, StandardCharsets.UTF_8));
            builder.append('=');
            builder.append(URLEncoder.encode(String.valueOf(entry.getValue()), StandardCharsets.UTF_8));
        }
        return builder.toString();
    }

    private String normalizeCookie(String cookie) {
        String normalized = readString(cookie, "").trim();
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cookie is required");
        }
        return normalized;
    }

    private Map<String, Object> toStringObjectMap(Object raw) {
        if (!(raw instanceof Map<?, ?> mapRaw)) {
            return Map.of();
        }
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : mapRaw.entrySet()) {
            result.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        return result;
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

    private int readInt(Object raw, int fallback) {
        if (raw == null) {
            return fallback;
        }
        if (raw instanceof Number number) {
            return number.intValue();
        }
        String text = String.valueOf(raw).trim();
        if (!StringUtils.hasText(text)) {
            return fallback;
        }
        try {
            return Integer.parseInt(text);
        } catch (Exception ignored) {
            return fallback;
        }
    }

    private long readLong(Object raw, long fallback) {
        if (raw == null) {
            return fallback;
        }
        if (raw instanceof Number number) {
            return number.longValue();
        }
        String text = String.valueOf(raw).trim();
        if (!StringUtils.hasText(text)) {
            return fallback;
        }
        try {
            return Long.parseLong(text);
        } catch (Exception ignored) {
            return fallback;
        }
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }

    private String sanitize(String raw) {
        String normalized = readString(raw, "unknown_error").replace('\n', ' ').replace('\r', ' ');
        if (normalized.length() > 240) {
            return normalized.substring(0, 240) + "...";
        }
        return normalized;
    }

    public record PlaylistSummary(String sourcePlaylistId,
                                  String name,
                                  String description,
                                  String cover,
                                  Integer trackCount) {
    }

    public record TrackSummary(String trackId,
                               String title,
                               String artist,
                               String cover,
                               Integer durationSec,
                               String album) {
    }

    public record ResolvedTrack(String trackId,
                                String title,
                                String artist,
                                String cover,
                                String audioUrl,
                                String lyricText) {
    }
}
