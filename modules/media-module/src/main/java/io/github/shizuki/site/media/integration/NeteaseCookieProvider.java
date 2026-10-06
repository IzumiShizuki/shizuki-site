package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.response.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * 网易云账号客户端：实时音乐库、声音/FM、喜欢状态与播放兜底。
 */
@Component
public class NeteaseCookieProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(NeteaseCookieProvider.class);
    private static final int SONG_DETAIL_BATCH_SIZE = 100;
    private static final int SONG_DETAIL_RETRY_ATTEMPTS = 3;
    private static final long SONG_DETAIL_RETRY_DELAY_MILLIS = 350L;
    private static final int AUTHORIZED_AUDIO_RETRY_ATTEMPTS = 3;
    private static final long TRIAL_DURATION_TOLERANCE_MILLIS = 3_000L;

    private final RestClient restClient;
    private final String ncmBaseUrl;

    @Autowired
    public NeteaseCookieProvider(RestClient.Builder restClientBuilder,
                                 @org.springframework.beans.factory.annotation.Value("${music.ncm.base-url:http://music-ncm-api:3000}") String ncmBaseUrl) {
        this(buildRestClient(restClientBuilder), ncmBaseUrl);
    }

    NeteaseCookieProvider(RestClient restClient) {
        this(restClient, "");
    }

    NeteaseCookieProvider(RestClient restClient, String ncmBaseUrl) {
        this.restClient = restClient;
        this.ncmBaseUrl = normalizeNcmBaseUrl(ncmBaseUrl);
    }

    private static RestClient buildRestClient(RestClient.Builder restClientBuilder) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(java.time.Duration.ofSeconds(10));
        return restClientBuilder.requestFactory(requestFactory).build();
    }

    public MeMusicLibrarySidebarResponse accountLibrary(String cookie, Long siteUserId) {
        String normalizedCookie = normalizeCookie(cookie);
        Map<String, Object> account = ncmRequest("/user/account", Map.of(), normalizedCookie);
        long uid = readLong(toStringObjectMap(account.get("profile")).get("userId"), 0L);
        if (uid <= 0L) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "网易云登录已失效，请重新绑定账号");
        }
        List<MusicPlaylistSummaryResponse> created = new ArrayList<>();
        List<MusicPlaylistSummaryResponse> subscribed = new ArrayList<>();
        MusicPlaylistSummaryResponse liked = null;
        int offset = 0;
        boolean more;
        do {
            Map<String, Object> payload = ncmRequest("/user/playlist", Map.of("uid", uid, "limit", 100, "offset", offset), normalizedCookie);
            List<Map<String, Object>> rows = requireRows(payload, "playlist");
            for (Map<String, Object> row : rows) {
                String id = numericId(row.get("id"));
                boolean owned = readLong(toStringObjectMap(row.get("creator")).get("userId"), 0L) == uid;
                boolean isLiked = owned && readInt(row.get("specialType"), 0) == 5;
                MusicPlaylistSummaryResponse summary = new MusicPlaylistSummaryResponse(
                    "account_netease_" + id, readString(row.get("name"), "网易云歌单"),
                    readString(row.get("description"), ""), readString(row.get("coverImgUrl"), ""),
                    isLiked ? "LIKED" : "CUSTOM", siteUserId, false, Math.max(0, readInt(row.get("trackCount"), 0)), "netease");
                if (isLiked) liked = summary;
                else if (owned) created.add(summary);
                else subscribed.add(summary);
            }
            offset += rows.size();
            more = Boolean.TRUE.equals(payload.get("more")) && !rows.isEmpty();
        } while (more);
        return new MeMusicLibrarySidebarResponse(null, liked, created, subscribed);
    }

    public List<String> likedTrackIds(String cookie) {
        Map<String, Object> account = ncmRequest("/user/account", Map.of(), normalizeCookie(cookie));
        long uid = readLong(toStringObjectMap(account.get("profile")).get("userId"), 0L);
        if (uid <= 0L) throw new BusinessException(ErrorCode.BAD_REQUEST, "网易云登录已失效，请重新绑定账号");
        Map<String, Object> payload = ncmRequest("/likelist", Map.of("uid", uid), cookie);
        if (!(payload.get("ids") instanceof List<?> ids)) throw invalidNcmResponse();
        return ids.stream().map(this::numericId).distinct().toList();
    }

    public void setTrackLiked(String trackId, boolean liked, String cookie) {
        // API Enhanced converts the literal string "false"; a JSON boolean would be treated as true.
        ncmRequest("/like", Map.of("id", numericId(trackId), "like", Boolean.toString(liked)), normalizeCookie(cookie));
    }

    public List<MusicPlaylistSummaryResponse> recommendedPodcasts(String cookie, String query) {
        if (StringUtils.hasText(query)) {
            if (query.trim().length() > 200) throw new BusinessException(ErrorCode.BAD_REQUEST, "搜索关键词过长");
            Map<String, Object> payload = ncmRequest("/search", Map.of("keywords", query.trim(), "type", 1009, "limit", 50), readString(cookie, ""));
            Map<String, Object> result = toStringObjectMap(payload.get("result"));
            if (!result.containsKey("djRadios") && readInt(result.get("djRadiosCount"), -1) == 0) return List.of();
            return requireRows(result, "djRadios").stream().map(row -> podcastSummary(row, "")).toList();
        }
        Map<String, Object> payload = ncmRequest("/dj/recommend", Map.of(), readString(cookie, ""));
        return requireRows(payload, "djRadios").stream().map(row -> podcastSummary(row, "")).toList();
    }

    public MusicPlaylistBundleResponse podcastBundle(String radioId, String cookie) {
        String id = numericId(radioId);
        Map<String, Object> detail = ncmRequest("/dj/detail", Map.of("rid", id), readString(cookie, ""));
        Map<String, Object> radio = toStringObjectMap(detail.get("data"));
        if (radio.isEmpty()) throw invalidNcmResponse();
        Set<String> favouriteIds = StringUtils.hasText(cookie)
            ? likedPrograms(cookie).stream().map(track -> String.valueOf(track.metadata().get("programId")))
                .collect(java.util.stream.Collectors.toSet()) : Set.of();
        List<MusicTrackResponse> tracks = new ArrayList<>();
        boolean more;
        do {
            Map<String, Object> payload = ncmRequest("/dj/program", Map.of("rid", id, "limit", 100, "offset", tracks.size(), "asc", "false"), readString(cookie, ""));
            List<Map<String, Object>> programs = requireRows(payload, "programs");
            for (Map<String, Object> program : programs) {
                Map<String, Object> song = toStringObjectMap(program.get("mainSong"));
                if (song.isEmpty()) throw invalidNcmResponse();
                Map<String, Object> identity = new LinkedHashMap<>(program);
                if (StringUtils.hasText(cookie)) identity.put("voiceFavourite", favouriteIds.contains(numericId(program.get("id"))));
                tracks.add(toPlatformTrack(song, tracks.size(), identity));
            }
            more = Boolean.TRUE.equals(payload.get("more")) && !programs.isEmpty();
        } while (more);
        return new MusicPlaylistBundleResponse(podcastSummary(radio, id), tracks);
    }

    public List<MusicPlaylistSummaryResponse> personalPodcasts(String source, String cookie) {
        String normalizedCookie = normalizeCookie(cookie);
        if ("created".equals(source)) {
            Map<String, Object> account = ncmRequest("/user/account", Map.of(), normalizedCookie);
            String uid = numericId(toStringObjectMap(account.get("profile")).get("userId"));
            Map<String, Object> payload = ncmRequest("/user/audio", Map.of("uid", uid), normalizedCookie);
            List<Map<String, Object>> rows = requireRows(payload, "djRadios");
            // This installed endpoint has no offset parameter. Never present a truncated response as complete.
            if (Boolean.TRUE.equals(payload.get("hasMore")) || readInt(payload.get("count"), rows.size()) > rows.size()) {
                throw invalidNcmResponse();
            }
            return rows.stream().map(row -> podcastSummary(row, "")).toList();
        }
        if (!"subscribed".equals(source)) throw new BusinessException(ErrorCode.BAD_REQUEST, "播客来源无效");
        Map<String, MusicPlaylistSummaryResponse> result = new LinkedHashMap<>();
        int offset = 0;
        boolean more;
        do {
            Map<String, Object> payload = ncmRequest("/dj/sublist", Map.of("limit", 100, "offset", offset), normalizedCookie);
            List<Map<String, Object>> rows = requireRows(payload, "djRadios");
            for (Map<String, Object> row : rows) {
                MusicPlaylistSummaryResponse summary = podcastSummary(row, "");
                result.put(summary.playlistCode(), summary);
            }
            offset += rows.size();
            more = Boolean.TRUE.equals(payload.get("hasMore"));
            if (more && rows.isEmpty()) throw invalidNcmResponse();
        } while (more);
        return List.copyOf(result.values());
    }

    public void setProgramLiked(String programId, boolean liked, String cookie) {
        // The selectable voice library uses program favourites, distinct from a public thumbs-up count.
        ncmRequest("/api", Map.of("uri", liked ? "/api/djprogram/subscribe" : "/api/djprogram/unsubscribe",
            "data", Map.of("id", numericId(programId)), "crypto", "weapi"), normalizeCookie(cookie));
    }

    public boolean programLiked(String programId, String cookie) {
        String id = numericId(programId);
        // Detail's subscribed flag can disagree with the selectable voice favourites. Read the actual library.
        return likedPrograms(cookie).stream().anyMatch(track -> id.equals(track.metadata().get("programId")));
    }

    public List<MusicTrackResponse> likedPrograms(String cookie) {
        String normalizedCookie = normalizeCookie(cookie);
        Map<String, Object> account = ncmRequest("/user/account", Map.of(), normalizedCookie);
        String uid = numericId(toStringObjectMap(account.get("profile")).get("userId"));
        Map<String, MusicTrackResponse> tracks = new LinkedHashMap<>();
        int offset = 0;
        boolean more;
        do {
            Map<String, Object> payload = ncmRequest("/api", Map.of("uri", "/api/djprogram/subscribed/paged",
                "data", Map.of("uid", uid, "limit", 100, "offset", offset), "crypto", "weapi"), normalizedCookie);
            List<Map<String, Object>> rows = requireRows(payload, "programs");
            for (Map<String, Object> program : rows) {
                Map<String, Object> song = toStringObjectMap(program.get("mainSong"));
                if (song.isEmpty()) throw invalidNcmResponse();
                Map<String, Object> identity = new LinkedHashMap<>(program);
                identity.put("voiceFavourite", true);
                MusicTrackResponse track = toPlatformTrack(song, tracks.size(), identity);
                tracks.put(numericId(program.get("id")), track);
            }
            offset += rows.size();
            more = Boolean.TRUE.equals(payload.get("more"));
            if (more && rows.isEmpty()) throw invalidNcmResponse();
        } while (more);
        return List.copyOf(tracks.values());
    }

    public MusicPlaylistBundleResponse accountPlaylistBundle(String playlistId, String cookie, Long siteUserId) {
        String id = numericId(playlistId);
        Map<String, Object> detail = ncmRequest("/playlist/detail", Map.of("id", id), normalizeCookie(cookie));
        Map<String, Object> playlist = toStringObjectMap(detail.get("playlist"));
        if (playlist.isEmpty()) throw invalidNcmResponse();
        int total = readInt(playlist.get("trackCount"), 0);
        List<MusicTrackResponse> tracks = new ArrayList<>();
        do {
            Map<String, Object> payload = ncmRequest("/playlist/track/all", Map.of("id", id, "limit", 500, "offset", tracks.size()), cookie);
            List<Map<String, Object>> songs = requireRows(payload, "songs");
            if (songs.isEmpty()) {
                if (tracks.size() < total) throw invalidNcmResponse();
                break;
            }
            for (Map<String, Object> song : songs) tracks.add(toPlatformTrack(song, tracks.size(), Map.of()));
        } while (tracks.size() < total);
        return new MusicPlaylistBundleResponse(new MusicPlaylistSummaryResponse(
            "account_netease_" + id, readString(playlist.get("name"), "网易云歌单"), readString(playlist.get("description"), ""),
            readString(playlist.get("coverImgUrl"), ""), readInt(playlist.get("specialType"), 0) == 5 ? "LIKED" : "CUSTOM",
            siteUserId, false, tracks.size(), "netease"), tracks);
    }

    public List<MusicTrackResponse> personalFmTracks(String cookie) {
        List<MusicTrackResponse> result = new ArrayList<>();
        for (Map<String, Object> song : requireRows(ncmRequest("/personal_fm", Map.of(), normalizeCookie(cookie)), "data")) {
            result.add(toPlatformTrack(song, result.size(), Map.of()));
        }
        return result;
    }

    private MusicPlaylistSummaryResponse podcastSummary(Map<String, Object> row, String fallbackId) {
        String id = numericId(row.getOrDefault("id", fallbackId));
        return new MusicPlaylistSummaryResponse("podcast_netease_" + id, readString(row.get("name"), "网易云声音"),
            readString(row.get("desc"), ""), readString(row.get("picUrl"), ""), "PODCAST", 0L, true,
            Math.max(0, readInt(row.get("programCount"), 0)), "netease");
    }

    private MusicTrackResponse toPlatformTrack(Map<String, Object> song, int sort, Map<String, Object> program) {
        String id = numericId(song.get("id"));
        Map<String, Object> album = toStringObjectMap(song.getOrDefault("al", song.get("album")));
        String artist = toObjectMapList(song.getOrDefault("ar", song.get("artists"))).stream()
            .map(row -> readString(row.get("name"), "")).filter(StringUtils::hasText).collect(java.util.stream.Collectors.joining(" / "));
        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("album", readString(album.get("name"), ""));
        metadata.put("durationSec", Math.max(0, readLong(song.getOrDefault("dt", song.get("duration")), 0L) / 1000L));
        if (!program.isEmpty()) {
            metadata.put("programId", numericId(program.get("id")));
            metadata.put("resourceType", "program");
            if (program.get("voiceFavourite") instanceof Boolean liked) metadata.put("liked", liked);
        }
        return new MusicTrackResponse(id, "netease", readString(program.get("name"), readString(song.get("name"), id)),
            artist, readString(program.get("coverUrl"), readString(album.get("picUrl"), "")), "", "", sort, true, "", metadata);
    }

    private List<Map<String, Object>> requireRows(Map<String, Object> payload, String key) {
        if (!(payload.get(key) instanceof List<?>)) throw invalidNcmResponse();
        return toObjectMapList(payload.get(key));
    }

    private String numericId(Object raw) {
        String id = readString(raw, "");
        if (!id.matches("[1-9][0-9]{0,18}")) throw new BusinessException(ErrorCode.BAD_REQUEST, "网易云资源 ID 无效");
        return id;
    }

    private BusinessException invalidNcmResponse() {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "网易云返回数据异常，请稍后重试");
    }

    private Map<String, Object> ncmRequest(String path, Map<String, Object> parameters, String cookie) {
        if (!StringUtils.hasText(ncmBaseUrl)) throw new BusinessException(ErrorCode.FEATURE_DISABLED, "网易云账号服务尚未配置");
        Map<String, Object> body = new LinkedHashMap<>(parameters);
        body.put("cookie", readString(cookie, ""));
        body.put("timestamp", System.currentTimeMillis());
        try {
            // Keep credentials out of URLs, proxy access logs and exception messages.
            String response = restClient.post().uri(URI.create(ncmBaseUrl + path))
                // NCM's URL/cookie cache ignores JSON bodies, including body-only credentials and desired state.
                .header("X-APICACHE-FORCE-FETCH", "true")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON).body(body).retrieve().body(String.class);
            Map<String, Object> payload = new com.fasterxml.jackson.databind.ObjectMapper().readValue(response,
                new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {});
            if (!(payload.get("code") instanceof Number)) throw invalidNcmResponse();
            int code = readInt(payload.get("code"), -1);
            if (code == 301 || code == 302 || code == 401) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "网易云登录已失效，请重新绑定账号");
            }
            if (code != 200) throw invalidNcmResponse();
            return payload;
        } catch (BusinessException exception) {
            throw exception;
        } catch (Exception exception) {
            LOGGER.warn("MUSIC_NETEASE_PLATFORM_FAIL path={} reason_type={}", path, exception.getClass().getSimpleName());
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "网易云暂时无法连接，请稍后重试");
        }
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
            Map.of(
                "id", normalizedPlaylistId,
                "n", safeLimit,
                "s", 0
            ),
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

        List<String> orderedTrackIds = new ArrayList<>(new LinkedHashSet<>(extractTrackIds(playlist)));
        if (orderedTrackIds.size() > safeLimit) {
            orderedTrackIds = new ArrayList<>(orderedTrackIds.subList(0, safeLimit));
        }
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
        long expectedDurationMillis = readDurationMillis(song);
        String audioUrl = resolveAuthorizedAudioUrl(normalizedTrackId, normalizedCookie, expectedDurationMillis);
        if (!StringUtils.hasText(audioUrl)) {
            // The public outer URL silently downgrades member tracks to a
            // preview. Let the caller use its explicit fallback instead of
            // returning that trial stream as an account-authorized result.
            throw new BusinessException(
                ErrorCode.NOT_FOUND,
                "Netease account did not return an authorized audio URL"
            );
        }

        String lyricText = "";
        String translationLyricText = "";
        String furiganaLyricText = "";
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
            translationLyricText = readString(toStringObjectMap(lyricPayload.get("tlyric")).get("lyric"), "");
            furiganaLyricText = readString(toStringObjectMap(lyricPayload.get("romalrc")).get("lyric"), "");
        }

        return new ResolvedTrack(
            normalizedTrackId,
            title,
            artist,
            cover,
            audioUrl,
            expectedDurationMillis,
            lyricText,
            translationLyricText,
            furiganaLyricText
        );
    }

    private String resolveAuthorizedAudioUrl(String trackId, String cookie, long expectedDurationMillis) {
        String ncmAudioUrl = resolveAuthorizedAudioUrlViaNcm(trackId, cookie, expectedDurationMillis);
        if (StringUtils.hasText(ncmAudioUrl)) {
            return ncmAudioUrl;
        }
        try {
            Map<String, Object> payload = requestJson(
                "https://music.163.com/api/song/url/v1",
                Map.of("id", trackId, "level", "exhigh"),
                cookie
            );
            String url = readAuthorizedAudioUrl(payload, trackId, expectedDurationMillis, "music_163_v1");
            if (StringUtils.hasText(url)) {
                return url;
            }

            payload = requestJson(
                "https://music.163.com/api/song/url",
                Map.of("id", trackId, "br", 320000),
                cookie
            );
            return readAuthorizedAudioUrl(payload, trackId, expectedDurationMillis, "music_163_legacy");
        } catch (Exception ex) {
            LOGGER.warn(
                "MUSIC_NETEASE_AUTH_AUDIO_RESOLVE_FAIL trackId={} reason_type={}",
                trackId,
                ex.getClass().getSimpleName()
            );
            return "";
        }
    }

    /**
     * Folia resolves member streams through the site's NCM sidecar. Reuse that
     * path here so the normal player sees the same Cookie-aware result instead
     * of depending on a browser-unfriendly direct request to music.163.com.
     */
    private String resolveAuthorizedAudioUrlViaNcm(String trackId, String cookie, long expectedDurationMillis) {
        if (!StringUtils.hasText(ncmBaseUrl)) {
            return "";
        }
        Exception lastFailure = null;
        for (int attempt = 1; attempt <= AUTHORIZED_AUDIO_RETRY_ATTEMPTS; attempt++) {
            try {
                Map<String, Object> query = new LinkedHashMap<>();
                query.put("id", trackId);
                query.put("level", "exhigh");
                query.put("randomCNIP", true);
                query.put("https", true);
                if (attempt > 1) {
                    query.put("timestamp", System.currentTimeMillis() + attempt);
                }
                Map<String, Object> payload = requestNcmJson(
                    "/song/url/v1",
                    query,
                    cookie
                );
                String url = readAuthorizedAudioUrl(payload, trackId, expectedDurationMillis, "ncm_v1");
                if (StringUtils.hasText(url)) {
                    return url;
                }
            } catch (Exception ex) {
                lastFailure = ex;
            }
        }
        try {
            Map<String, Object> payload = requestNcmJson(
                "/song/url",
                Map.of("id", trackId, "br", 320000, "timestamp", System.currentTimeMillis()),
                cookie
            );
            String url = readAuthorizedAudioUrl(payload, trackId, expectedDurationMillis, "ncm_legacy");
            if (StringUtils.hasText(url)) {
                return url;
            }
        } catch (Exception ex) {
            lastFailure = ex;
        }
        if (lastFailure != null) {
            LOGGER.warn(
                "MUSIC_NETEASE_NCM_AUTH_AUDIO_RESOLVE_FAIL trackId={} reason_type={}",
                trackId,
                lastFailure.getClass().getSimpleName()
            );
        }
        return "";
    }

    /**
     * A valid account cookie can still receive the provider's 30-second trial
     * response when it expires or lacks the required entitlement. Never pass
     * that URL to the normal player as an account-authorized stream.
     */
    private String readAuthorizedAudioUrl(Map<String, Object> payload,
                                          String trackId,
                                          long expectedDurationMillis,
                                          String source) {
        for (Map<String, Object> item : toObjectMapList(payload.get("data"))) {
            String url = readString(item.get("url"), "");
            if (StringUtils.hasText(url) && !isTrialAudioResponse(item, expectedDurationMillis)) {
                return url;
            }
            if (StringUtils.hasText(url)) {
                long responseDurationMillis = readLong(item.get("time"), 0L);
                long sizeBytes = readLong(item.get("size"), 0L);
                LOGGER.warn(
                    "MUSIC_NETEASE_ACCOUNT_TRIAL_AUDIO_REJECTED trackId={} source={} hasFreeTrialInfo={} hasFreeTimeTrialPrivilege={} responseDurationMs={} expectedDurationMs={} hasSize={}",
                    trackId,
                    source,
                    hasValue(item.get("freeTrialInfo")),
                    hasValue(item.get("freeTimeTrialPrivilege")),
                    responseDurationMillis,
                    expectedDurationMillis,
                    sizeBytes > 0L
                );
            }
        }
        return "";
    }

    private boolean isTrialAudioResponse(Map<String, Object> item, long expectedDurationMillis) {
        // NCM returns freeTimeTrialPrivilege for some fully authorized member
        // streams as well. Its consumable flags describe account capability,
        // not the duration of this response, so treating them as a standalone
        // trial marker rejects valid full-length playback.
        if (hasValue(item.get("freeTrialInfo"))) {
            return true;
        }
        long responseDurationMillis = readLong(item.get("time"), 0L);
        return expectedDurationMillis > 0L
            && responseDurationMillis > 0L
            && responseDurationMillis + TRIAL_DURATION_TOLERANCE_MILLIS < expectedDurationMillis;
    }

    private boolean hasValue(Object raw) {
        if (raw == null) {
            return false;
        }
        if (raw instanceof Map<?, ?> map) {
            return !map.isEmpty();
        }
        if (raw instanceof List<?> list) {
            return !list.isEmpty();
        }
        return StringUtils.hasText(String.valueOf(raw));
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
            .distinct()
            .toList();
        for (int offset = 0; offset < normalizedIds.size(); offset += SONG_DETAIL_BATCH_SIZE) {
            int end = Math.min(normalizedIds.size(), offset + SONG_DETAIL_BATCH_SIZE);
            List<String> batch = normalizedIds.subList(offset, end);
            Map<String, Map<String, Object>> batchDetails = new LinkedHashMap<>();
            try {
                batchDetails.putAll(requestSongDetailsWithRetry(batch, null));
            } catch (Exception ex) {
                LOGGER.warn(
                    "MUSIC_NETEASE_SONG_DETAIL_FAIL stage=anonymous batch_size={} reason_type={}",
                    batch.size(),
                    ex.getClass().getSimpleName()
                );
            }

            List<String> missingIds = batch.stream()
                .filter(id -> !batchDetails.containsKey(id))
                .toList();
            if (!missingIds.isEmpty() && StringUtils.hasText(cookie)) {
                try {
                    batchDetails.putAll(requestSongDetailsWithRetry(missingIds, cookie));
                } catch (Exception ex) {
                    LOGGER.warn(
                        "MUSIC_NETEASE_SONG_DETAIL_FAIL stage=account_fallback batch_size={} reason_type={}",
                        missingIds.size(),
                        ex.getClass().getSimpleName()
                    );
                }
            }
            result.putAll(batchDetails);
        }
        return result;
    }

    private Map<String, Map<String, Object>> requestSongDetailsWithRetry(List<String> trackIds, String cookie) {
        BusinessException lastFailure = null;
        for (int attempt = 1; attempt <= SONG_DETAIL_RETRY_ATTEMPTS; attempt++) {
            try {
                return requestSongDetails(trackIds, cookie);
            } catch (BusinessException ex) {
                lastFailure = ex;
                if (attempt < SONG_DETAIL_RETRY_ATTEMPTS) {
                    waitForSongDetailRetry(attempt);
                }
            }
        }
        throw lastFailure == null
            ? new BusinessException(ErrorCode.BAD_REQUEST, "Netease song detail request failed")
            : lastFailure;
    }

    private void waitForSongDetailRetry(int completedAttempt) {
        try {
            Thread.sleep(SONG_DETAIL_RETRY_DELAY_MILLIS * Math.max(1, completedAttempt));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Netease song detail request interrupted");
        }
    }

    private Map<String, Map<String, Object>> requestSongDetails(List<String> trackIds, String cookie) {
        String idsJson = "[" + trackIds.stream()
            .map(id -> "\"" + id + "\"")
            .reduce((a, b) -> a + "," + b)
            .orElse("") + "]";
        Map<String, Object> payload = requestJson(
            "https://music.163.com/api/song/detail",
            Map.of("ids", idsJson),
            cookie
        );
        Map<String, Map<String, Object>> result = new LinkedHashMap<>();
        for (Map<String, Object> row : toObjectMapList(payload.get("songs"))) {
            String id = readString(row.get("id"), "");
            if (StringUtils.hasText(id)) {
                result.put(id, row);
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
        long durationMillis = readDurationMillis(raw);
        Map<String, Object> album = readAlbum(raw);
        return new TrackSummary(
            trackId,
            readString(raw.get("name"), trackId),
            readArtist(raw),
            readCover(raw),
            durationMillis <= 0L ? null : Math.max(1, (int) (durationMillis / 1000L)),
            readString(album.get("name"), "")
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
        return readString(readAlbum(raw).get("picUrl"), "");
    }

    private Map<String, Object> readAlbum(Map<String, Object> raw) {
        Map<String, Object> album = toStringObjectMap(raw == null ? null : raw.get("al"));
        if (album.isEmpty()) {
            album = toStringObjectMap(raw == null ? null : raw.get("album"));
        }
        return album;
    }

    private long readDurationMillis(Map<String, Object> raw) {
        long durationMillis = readLong(raw == null ? null : raw.get("dt"), 0L);
        if (durationMillis <= 0L) {
            durationMillis = readLong(raw == null ? null : raw.get("duration"), 0L);
        }
        return Math.max(0L, durationMillis);
    }

    private Map<String, Object> requestJson(String url, Map<String, Object> query, String cookie) {
        String finalUrl = appendQuery(url, query);
        String body = restClient.get()
            .uri(URI.create(finalUrl))
            .headers(headers -> {
                headers.set("Referer", "https://music.163.com/");
                headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                if (StringUtils.hasText(cookie)) {
                    headers.set("Cookie", cookie.trim());
                }
            })
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

    private Map<String, Object> requestNcmJson(String path, Map<String, Object> query, String cookie) {
        Map<String, Object> ncmQuery = new LinkedHashMap<>();
        if (query != null) {
            ncmQuery.putAll(query);
        }
        ncmQuery.put("cookie", cookie);
        String finalUrl = appendQuery(ncmBaseUrl + path, ncmQuery);
        String body = restClient.get()
            .uri(URI.create(finalUrl))
            .headers(headers -> headers.set("User-Agent", "ShizukiMusicNcmClient/1.0"))
            .retrieve()
            .body(String.class);
        Map<String, Object> json = tryParseJson(body);
        int code = readInt(json.get("code"), 200);
        if (code != 200 && code != 0) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Netease NCM request failed",
                Map.of("code", code)
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

    private static String normalizeNcmBaseUrl(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "";
        }
        String normalized = raw.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
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
                                long durationMs,
                                String lyricText,
                                String translationLyricText,
                                String furiganaLyricText) {
    }
}
