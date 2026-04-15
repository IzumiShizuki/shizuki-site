package io.github.shizuki.site.media.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.AsmrMusicProperties;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

/**
 * ASMR（Kikoeru / asmr.one）接口客户端。
 */
@Component
public class AsmrMusicProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsmrMusicProvider.class);

    private final AsmrMusicProperties properties;
    private final RestClient restClient;
    private final HttpClient rawHttpClient;
    private final ObjectMapper objectMapper;
    private volatile String preferredBaseUrl;

    public AsmrMusicProvider(AsmrMusicProperties properties,
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
        this.rawHttpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
            .followRedirects(HttpClient.Redirect.NEVER)
            .build();
        this.preferredBaseUrl = normalizeBaseUrl(properties.getServer());
    }

    /**
     * 搜索作品（works）。
     */
    public SearchResult searchWorks(String keyword, int page, int limit) {
        String normalizedKeyword = normalizeKeyword(keyword);
        int safePage = Math.max(1, page);
        int safeLimit = Math.max(1, Math.min(60, limit));
        String encodedKeyword = encodeQuerySegment(normalizedKeyword);
        String path = "/api/search/" + encodedKeyword;
        Map<String, Object> body = Map.of(
            "page", safePage,
            "order", readString(properties.getDefaultOrder(), "release"),
            "sort", readString(properties.getDefaultSort(), "desc"),
            "seed", 0,
            "subtitle", 0,
            "localSubtitledWorks", List.of(),
            "includeTranslationWorks", true
        );

        Object raw = requestJsonRaw("POST", path, body);
        if (!(raw instanceof Map<?, ?> rawMap)) {
            return new SearchResult(List.of(), safePage, safeLimit, 0);
        }
        Map<String, Object> map = castObjectMap(rawMap);
        List<WorkSummary> works = parseWorks(map.get("works"));
        Pagination pagination = parsePagination(map.get("pagination"), safePage, safeLimit, works.size());
        return new SearchResult(
            works,
            pagination.currentPage(),
            pagination.pageSize(),
            pagination.totalCount()
        );
    }

    /**
     * 查询作品详情。
     */
    public WorkSummary getWork(long workId) {
        if (workId <= 0L) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "work_id is required");
        }
        String path = "/api/work/" + workId;
        Object raw = requestJsonRaw("GET", path, null);
        if (!(raw instanceof Map<?, ?> rawMap)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "ASMR work not found");
        }
        WorkSummary summary = toWorkSummary(castObjectMap(rawMap));
        if (summary.id() <= 0L) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "ASMR work not found");
        }
        return summary;
    }

    /**
     * 查询作品下可播放音轨（扁平化后的 audio 列表）。
     */
    public List<AudioTrack> listAudioTracks(long workId) {
        if (workId <= 0L) {
            return List.of();
        }
        String path = "/api/tracks/" + workId;
        Object raw = requestJsonRaw("GET", path, null);
        if (!(raw instanceof List<?> rootNodes)) {
            return List.of();
        }

        List<AudioTrackDraft> audioDrafts = new ArrayList<>();
        Map<String, String> lyricByTitleKey = new LinkedHashMap<>();
        for (Object node : rootNodes) {
            walkTrackNode(node, "", audioDrafts, lyricByTitleKey);
        }

        List<AudioTrack> result = new ArrayList<>();
        for (AudioTrackDraft item : audioDrafts) {
            String key = normalizeTrackTitleKey(item.title());
            String lyricUrl = readString(lyricByTitleKey.get(key), "");
            String audioUrl = firstNonBlank(item.streamLowQualityUrl(), item.mediaStreamUrl(), item.mediaDownloadUrl());
            if (!StringUtils.hasText(audioUrl) && StringUtils.hasText(item.hash())) {
                audioUrl = resolveStreamUrlByHash(item.hash());
            }
            result.add(new AudioTrack(
                readString(item.hash(), ""),
                readString(item.title(), ""),
                readString(item.mediaStreamUrl(), ""),
                readString(item.streamLowQualityUrl(), ""),
                readString(item.mediaDownloadUrl(), ""),
                readString(audioUrl, ""),
                readString(lyricUrl, ""),
                item.durationSec()
            ));
        }
        return result;
    }

    /**
     * 按作品解析一个可播放音轨（优先 mp3、匹配标题提示）。
     */
    public ResolvedTrack resolvePlayableByWork(long workId, String titleHint) {
        WorkSummary work = getWork(workId);
        List<AudioTrack> tracks = listAudioTracks(workId);
        AudioTrack selected = pickPreferredAudioTrack(tracks, titleHint);
        if (selected == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "ASMR track not found");
        }

        String trackId = readString(selected.hash(), "");
        if (!StringUtils.hasText(trackId)) {
            trackId = String.valueOf(workId);
        }
        String audioUrl = firstNonBlank(selected.playableAudioUrl(), resolveStreamUrlByHash(selected.hash()));
        if (!StringUtils.hasText(audioUrl)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "ASMR track stream unavailable");
        }

        return new ResolvedTrack(
            trackId,
            firstNonBlank(selected.title(), work.title()),
            work.artist(),
            work.cover(),
            audioUrl,
            selected.lyricUrl(),
            selected.durationSec(),
            work.id(),
            work.sourceId(),
            work.sourceUrl(),
            selected.hash()
        );
    }

    /**
     * 仅通过 hash（workId/mediaId）解析流地址。
     */
    public String resolveStreamUrlByHash(String hash) {
        String normalizedHash = normalizeTrackHash(hash);
        if (!StringUtils.hasText(normalizedHash)) {
            return "";
        }
        String path = "/api/media/stream/" + encodePathPreserveSlash(normalizedHash);
        int lastStatus = 0;
        String lastSource = "";
        Exception lastException = null;
        List<String> sourceCandidates = resolveSourceCandidates();
        for (String sourceBase : sourceCandidates) {
            String url = joinBasePath(sourceBase, path);
            HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                .GET()
                .timeout(Duration.ofMillis(properties.getReadTimeoutMs()))
                .header("Accept", "*/*")
                .build();
            try {
                HttpResponse<String> response = rawHttpClient.send(
                    request,
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
                );
                int status = response.statusCode();
                lastStatus = status;
                lastSource = sourceBase;
                if (status >= 300 && status < 400) {
                    Optional<String> location = response.headers().firstValue("location");
                    if (location.isPresent() && StringUtils.hasText(location.get())) {
                        markSourceHealthy(sourceBase);
                        return location.get().trim();
                    }
                }
                if (status >= 200 && status < 300) {
                    String body = response.body() == null ? "" : response.body().trim();
                    if (body.startsWith("http://") || body.startsWith("https://")) {
                        markSourceHealthy(sourceBase);
                        return body;
                    }
                    Optional<String> location = response.headers().firstValue("location");
                    if (location.isPresent() && StringUtils.hasText(location.get())) {
                        markSourceHealthy(sourceBase);
                        return location.get().trim();
                    }
                    markSourceHealthy(sourceBase);
                    return "";
                }
                if (!isRetryableHttpStatus(status) || sourceBase.equals(sourceCandidates.get(sourceCandidates.size() - 1))) {
                    throw new BusinessException(
                        ErrorCode.INTERNAL_ERROR,
                        "ASMR stream resolve failed",
                        Map.of("upstream_status", status, "source", sourceBase)
                    );
                }
                LOGGER.warn(
                    "ASMR_STREAM_SOURCE_RETRY source={} status={} path={}",
                    sourceBase,
                    status,
                    path
                );
            } catch (BusinessException ex) {
                throw ex;
            } catch (Exception ex) {
                lastException = ex;
                lastSource = sourceBase;
                if (sourceBase.equals(sourceCandidates.get(sourceCandidates.size() - 1))) {
                    break;
                }
                LOGGER.warn(
                    "ASMR_STREAM_SOURCE_FAIL source={} path={} reason={}",
                    sourceBase,
                    path,
                    sanitizeReason(ex.getMessage())
                );
            }
        }
        if (lastStatus > 0) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "ASMR stream resolve failed",
                Map.of("upstream_status", lastStatus, "source", lastSource)
            );
        }
        throw new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "ASMR stream resolve failed",
            Map.of("source", lastSource, "reason", sanitizeReason(lastException == null ? "" : lastException.getMessage()))
        );
    }

    /**
     * 拉取歌词文本（lrc）。
     */
    public String loadLyricText(String lyricUrl) {
        String normalizedUrl = readString(lyricUrl, "");
        if (!StringUtils.hasText(normalizedUrl)) {
            return "";
        }
        try {
            return restClient.get()
                .uri(normalizedUrl)
                .accept(MediaType.TEXT_PLAIN, MediaType.APPLICATION_OCTET_STREAM, MediaType.APPLICATION_JSON)
                .retrieve()
                .body(String.class);
        } catch (Exception ex) {
            LOGGER.warn("ASMR lyric fetch failed, url={}, reason={}", normalizedUrl, sanitizeReason(ex.getMessage()));
            return "";
        }
    }

    private Object requestJsonRaw(String method, String path, Map<String, Object> body) {
        HttpMethod httpMethod = "POST".equalsIgnoreCase(method) ? HttpMethod.POST : HttpMethod.GET;
        int lastStatus = 0;
        String lastSource = "";
        ResourceAccessException timeoutError = null;
        Exception parseError = null;
        List<String> sourceCandidates = resolveSourceCandidates();
        String lastCandidate = sourceCandidates.get(sourceCandidates.size() - 1);
        for (String sourceBase : sourceCandidates) {
            String url = joinBasePath(sourceBase, path);
            try {
                String response;
                if (httpMethod == HttpMethod.POST) {
                    response = restClient.post()
                        .uri(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .body(body == null ? Map.of() : body)
                        .retrieve()
                        .body(String.class);
                } else {
                    response = restClient.get()
                        .uri(url)
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .body(String.class);
                }
                markSourceHealthy(sourceBase);
                if (!StringUtils.hasText(response)) {
                    return Map.of();
                }
                return objectMapper.readValue(response, Object.class);
            } catch (RestClientResponseException ex) {
                lastStatus = ex.getRawStatusCode();
                lastSource = sourceBase;
                if (!isRetryableHttpStatus(ex.getRawStatusCode()) || lastCandidate.equals(sourceBase)) {
                    throw new BusinessException(
                        ErrorCode.INTERNAL_ERROR,
                        "ASMR upstream error",
                        Map.of(
                            "music_error_code", "MUSIC_ASMR_UPSTREAM_ERROR",
                            "upstream_status", ex.getRawStatusCode(),
                            "source", sourceBase
                        )
                    );
                }
                LOGGER.warn(
                    "ASMR_UPSTREAM_SOURCE_RETRY source={} method={} status={} path={}",
                    sourceBase,
                    httpMethod.name(),
                    ex.getRawStatusCode(),
                    path
                );
            } catch (ResourceAccessException ex) {
                timeoutError = ex;
                lastSource = sourceBase;
                if (lastCandidate.equals(sourceBase)) {
                    break;
                }
                LOGGER.warn(
                    "ASMR_UPSTREAM_SOURCE_TIMEOUT source={} method={} path={} reason={}",
                    sourceBase,
                    httpMethod.name(),
                    path,
                    sanitizeReason(ex.getMessage())
                );
            } catch (Exception ex) {
                parseError = ex;
                lastSource = sourceBase;
                if (lastCandidate.equals(sourceBase)) {
                    break;
                }
                LOGGER.warn(
                    "ASMR_UPSTREAM_SOURCE_PARSE_FAIL source={} method={} path={} reason={}",
                    sourceBase,
                    httpMethod.name(),
                    path,
                    sanitizeReason(ex.getMessage())
                );
            }
        }
        if (lastStatus > 0) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "ASMR upstream error",
                Map.of(
                    "music_error_code", "MUSIC_ASMR_UPSTREAM_ERROR",
                    "upstream_status", lastStatus,
                    "source", lastSource
                )
            );
        }
        if (timeoutError != null) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "ASMR upstream timeout",
                Map.of(
                    "music_error_code", "MUSIC_ASMR_UPSTREAM_TIMEOUT",
                    "source", lastSource
                )
            );
        }
        throw new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "ASMR upstream parse failed",
            Map.of(
                "music_error_code", "MUSIC_ASMR_UPSTREAM_PARSE_FAILED",
                "source", lastSource,
                "reason", sanitizeReason(parseError == null ? "" : parseError.getMessage())
            )
        );
    }

    private List<WorkSummary> parseWorks(Object worksRaw) {
        if (!(worksRaw instanceof List<?> listRaw)) {
            return List.of();
        }
        List<WorkSummary> result = new ArrayList<>();
        for (Object item : listRaw) {
            if (!(item instanceof Map<?, ?> itemMapRaw)) {
                continue;
            }
            WorkSummary summary = toWorkSummary(castObjectMap(itemMapRaw));
            if (summary.id() <= 0L) {
                continue;
            }
            result.add(summary);
        }
        return result;
    }

    private WorkSummary toWorkSummary(Map<String, Object> raw) {
        long id = readLong(raw.get("id"), 0L);
        String title = readString(raw.get("title"), "");
        String artist = readString(raw.get("name"), "");
        if (!StringUtils.hasText(artist)) {
            artist = readString(asObjectMap(raw.get("circle")).get("name"), "");
        }
        String cover = firstNonBlank(
            readString(raw.get("mainCoverUrl"), ""),
            readString(raw.get("samCoverUrl"), ""),
            readString(raw.get("thumbnailCoverUrl"), ""),
            readString(raw.get("cover"), "")
        );
        Integer durationSec = toInteger(raw.get("duration"));
        String sourceId = readString(raw.get("source_id"), "");
        String sourceUrl = readString(raw.get("source_url"), "");
        return new WorkSummary(
            id,
            title,
            artist,
            cover,
            durationSec,
            sourceId,
            sourceUrl
        );
    }

    private Pagination parsePagination(Object paginationRaw, int fallbackPage, int fallbackSize, int itemCount) {
        Map<String, Object> map = asObjectMap(paginationRaw);
        int currentPage = (int) Math.max(1L, readLong(map.get("currentPage"), fallbackPage));
        int pageSize = (int) Math.max(1L, readLong(map.get("pageSize"), fallbackSize));
        int totalCount = (int) Math.max(0L, readLong(map.get("totalCount"), itemCount));
        return new Pagination(currentPage, pageSize, totalCount);
    }

    private void walkTrackNode(Object rawNode,
                               String parentPath,
                               List<AudioTrackDraft> audioDrafts,
                               Map<String, String> lyricByTitleKey) {
        if (!(rawNode instanceof Map<?, ?> nodeMapRaw)) {
            return;
        }
        Map<String, Object> node = castObjectMap(nodeMapRaw);
        String type = readString(node.get("type"), "").toLowerCase(Locale.ROOT);
        String title = readString(node.get("title"), "");
        String currentPath = StringUtils.hasText(parentPath)
            ? parentPath + "/" + title
            : title;

        if ("folder".equals(type)) {
            Object childrenRaw = node.get("children");
            if (childrenRaw instanceof List<?> children) {
                for (Object child : children) {
                    walkTrackNode(child, currentPath, audioDrafts, lyricByTitleKey);
                }
            }
            return;
        }

        if ("text".equals(type)) {
            String lyricUrl = firstNonBlank(
                readString(node.get("mediaDownloadUrl"), ""),
                readString(node.get("mediaStreamUrl"), "")
            );
            if (StringUtils.hasText(title) && title.toLowerCase(Locale.ROOT).endsWith(".lrc") && StringUtils.hasText(lyricUrl)) {
                lyricByTitleKey.putIfAbsent(normalizeTrackTitleKey(title), lyricUrl);
            }
            return;
        }

        if (!"audio".equals(type)) {
            return;
        }

        audioDrafts.add(new AudioTrackDraft(
            readString(node.get("hash"), ""),
            title,
            readString(node.get("mediaStreamUrl"), ""),
            readString(node.get("streamLowQualityUrl"), ""),
            readString(node.get("mediaDownloadUrl"), ""),
            toInteger(node.get("duration")),
            currentPath
        ));
    }

    private AudioTrack pickPreferredAudioTrack(List<AudioTrack> tracks, String titleHint) {
        if (tracks == null || tracks.isEmpty()) {
            return null;
        }
        String normalizedHint = normalizeTrackTitleKey(titleHint);
        AtomicInteger index = new AtomicInteger(0);
        AudioTrack best = null;
        int bestScore = Integer.MIN_VALUE;
        for (AudioTrack item : tracks) {
            int score = scoreAudioTrack(item, normalizedHint, index.getAndIncrement());
            if (best == null || score > bestScore) {
                best = item;
                bestScore = score;
            }
        }
        return best;
    }

    private int scoreAudioTrack(AudioTrack item, String normalizedHint, int index) {
        int score = -index;
        String title = readString(item == null ? null : item.title(), "").toLowerCase(Locale.ROOT);
        String stream = readString(item == null ? null : item.playableAudioUrl(), "").toLowerCase(Locale.ROOT);
        if (title.endsWith(".mp3") || stream.contains("/mp3/")) {
            score += 24;
        } else if (title.endsWith(".m4a") || title.endsWith(".aac")) {
            score += 18;
        } else if (title.endsWith(".wav")) {
            score += 12;
        }
        if (StringUtils.hasText(normalizedHint) && normalizeTrackTitleKey(title).contains(normalizedHint)) {
            score += 36;
        }
        if (StringUtils.hasText(stream)) {
            score += 8;
        }
        if (StringUtils.hasText(readString(item == null ? null : item.lyricUrl(), ""))) {
            score += 2;
        }
        return score;
    }

    private String normalizeKeyword(String keyword) {
        String normalized = readString(keyword, "");
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is required");
        }
        if (normalized.length() < 2) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is too short");
        }
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "search query is too long");
        }
        return normalized;
    }

    private String normalizeTrackHash(String hash) {
        String normalized = readString(hash, "");
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        if (!normalized.matches("^[0-9]+/[0-9]+$")) {
            return "";
        }
        return normalized;
    }

    private String normalizeTrackTitleKey(String input) {
        String text = readString(input, "").trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(text)) {
            return "";
        }
        int dot = text.lastIndexOf('.');
        if (dot > 0) {
            text = text.substring(0, dot);
        }
        return text.replaceAll("\\s+", "");
    }

    private String encodeQuerySegment(String raw) {
        String encoded = URLEncoder.encode(readString(raw, ""), StandardCharsets.UTF_8);
        return encoded
            .replace("+", "%20")
            .replace("%7E", "~")
            .replace("%24", "$")
            .replace("%3A", ":");
    }

    private String encodePathPreserveSlash(String raw) {
        String normalized = readString(raw, "");
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        String[] segments = normalized.split("/");
        List<String> encoded = new ArrayList<>();
        for (String segment : segments) {
            if (!StringUtils.hasText(segment)) {
                continue;
            }
            encoded.add(
                URLEncoder.encode(segment, StandardCharsets.UTF_8)
                    .replace("+", "%20")
                    .replace("%7E", "~")
            );
        }
        return String.join("/", encoded);
    }

    private List<String> resolveSourceCandidates() {
        LinkedHashSet<String> ordered = new LinkedHashSet<>();
        appendSourceCandidate(ordered, preferredBaseUrl, true);
        appendSourceCandidate(ordered, properties.getServer(), true);
        appendSourceCandidate(ordered, properties.getBaseUrl(), false);
        for (String item : properties.getBaseUrls()) {
            appendSourceCandidate(ordered, item, false);
        }
        if (ordered.isEmpty()) {
            for (String item : properties.defaultBaseUrls()) {
                appendSourceCandidate(ordered, item, false);
            }
        }
        if (ordered.isEmpty()) {
            ordered.add("https://api.asmr.one");
        }
        return new ArrayList<>(ordered);
    }

    private void appendSourceCandidate(LinkedHashSet<String> collector, String source, boolean shouldValidateInPool) {
        String normalized = normalizeBaseUrl(source);
        if (!StringUtils.hasText(normalized)) {
            return;
        }
        if (shouldValidateInPool && !isKnownSource(normalized)) {
            return;
        }
        collector.add(normalized);
    }

    private boolean isKnownSource(String source) {
        String normalized = normalizeBaseUrl(source);
        if (!StringUtils.hasText(normalized)) {
            return false;
        }
        for (String item : properties.getBaseUrls()) {
            if (normalized.equalsIgnoreCase(normalizeBaseUrl(item))) {
                return true;
            }
        }
        return false;
    }

    private boolean isRetryableHttpStatus(int status) {
        return status >= 500 || status == 429 || status == 408 || status == 403 || status == 404;
    }

    private void markSourceHealthy(String sourceBase) {
        String normalized = normalizeBaseUrl(sourceBase);
        if (StringUtils.hasText(normalized)) {
            preferredBaseUrl = normalized;
        }
    }

    private String joinBasePath(String sourceBase, String path) {
        String normalizedBase = normalizeBaseUrl(sourceBase);
        String normalizedPath = readString(path, "");
        if (!normalizedPath.startsWith("/")) {
            normalizedPath = "/" + normalizedPath;
        }
        return normalizedBase + normalizedPath;
    }

    private String normalizeBaseUrl(String sourceBase) {
        String base = readString(sourceBase, "");
        if (!StringUtils.hasText(base)) {
            return "";
        }
        String normalized = base;
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        return normalized;
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> asObjectMap(Object raw) {
        if (raw instanceof Map<?, ?> rawMap) {
            return castObjectMap(rawMap);
        }
        return Map.of();
    }

    private Map<String, Object> castObjectMap(Map<?, ?> rawMap) {
        if (rawMap == null || rawMap.isEmpty()) {
            return Map.of();
        }
        return objectMapper.convertValue(rawMap, new TypeReference<Map<String, Object>>() {
        });
    }

    private String sanitizeReason(String raw) {
        String normalized = readString(raw, "unknown_error")
            .replace('\n', ' ')
            .replace('\r', ' ')
            .trim();
        if (normalized.length() > 200) {
            return normalized.substring(0, 200) + "...";
        }
        return normalized;
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }

    private long readLong(Object raw, long fallback) {
        if (raw == null) {
            return fallback;
        }
        try {
            if (raw instanceof Number number) {
                return number.longValue();
            }
            return Long.parseLong(String.valueOf(raw));
        } catch (Exception ex) {
            return fallback;
        }
    }

    private Integer toInteger(Object raw) {
        if (raw == null) {
            return null;
        }
        try {
            if (raw instanceof Number number) {
                return Math.max(0, (int) Math.round(number.doubleValue()));
            }
            return Math.max(0, (int) Math.round(Double.parseDouble(String.valueOf(raw))));
        } catch (Exception ex) {
            return null;
        }
    }

    private String firstNonBlank(String... values) {
        if (values == null || values.length == 0) {
            return "";
        }
        for (String item : values) {
            String value = readString(item, "");
            if (StringUtils.hasText(value)) {
                return value;
            }
        }
        return "";
    }

    public record Pagination(int currentPage, int pageSize, int totalCount) {
    }

    public record SearchResult(List<WorkSummary> works, int currentPage, int pageSize, int totalCount) {
    }

    public record WorkSummary(long id,
                              String title,
                              String artist,
                              String cover,
                              Integer durationSec,
                              String sourceId,
                              String sourceUrl) {
    }

    public record AudioTrack(String hash,
                             String title,
                             String mediaStreamUrl,
                             String streamLowQualityUrl,
                             String mediaDownloadUrl,
                             String playableAudioUrl,
                             String lyricUrl,
                             Integer durationSec) {
    }

    public record ResolvedTrack(String trackId,
                                String title,
                                String artist,
                                String cover,
                                String audioUrl,
                                String lyricUrl,
                                Integer durationSec,
                                long workId,
                                String sourceId,
                                String sourceUrl,
                                String hash) {
    }

    private record AudioTrackDraft(String hash,
                                   String title,
                                   String mediaStreamUrl,
                                   String streamLowQualityUrl,
                                   String mediaDownloadUrl,
                                   Integer durationSec,
                                   String path) {
    }
}
