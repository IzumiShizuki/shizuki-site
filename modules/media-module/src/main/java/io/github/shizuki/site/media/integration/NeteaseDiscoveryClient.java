package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * 网易云在线发现客户端（每日推荐 / 推荐歌单 / 私人 FM）。
 *
 * <p>代理站点 music-ncm-api 容器（NeteaseCloudMusicApiEnhanced），使用用户已绑定的
 * 网易云 cookie 透传登录态。发现类端点均需登录。
 */
@Component
public class NeteaseDiscoveryClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(NeteaseDiscoveryClient.class);

    private final String baseUrl;
    private final RestClient restClient;

    @Autowired
    public NeteaseDiscoveryClient(RestClient.Builder restClientBuilder,
                                  @org.springframework.beans.factory.annotation.Value("${music.ncm.base-url:http://music-ncm-api:3000}") String ncmBaseUrl) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(Duration.ofSeconds(10));
        this.baseUrl = ncmBaseUrl;
        this.restClient = restClientBuilder
            .baseUrl(this.baseUrl)
            .requestFactory(requestFactory)
            .build();
    }

    /**
     * 每日推荐歌曲（需登录 cookie）。
     */
    public List<Map<String, Object>> dailyRecommendSongs(String cookie) {
        Map<String, Object> payload = requestMap("/recommend/songs?cookie=" + encode(cookie));
        Map<String, Object> data = toStringObjectMap(payload.get("data"));
        List<Map<String, Object>> songs = toObjectMapList(data.get("dailySongs"));
        if (songs.isEmpty()) {
            // 兼容直接返回数组的形态
            songs = toObjectMapList(payload.get("data"));
        }
        return songs;
    }

    /**
     * 推荐歌单（需登录 cookie）。
     */
    public List<Map<String, Object>> recommendPlaylists(String cookie) {
        Map<String, Object> payload = requestMap("/recommend/resource?cookie=" + encode(cookie));
        return toObjectMapList(payload.get("recommend"));
    }

    /**
     * 私人 FM（需登录 cookie）。
     */
    public List<Map<String, Object>> personalFm(String cookie) {
        Map<String, Object> payload = requestMap("/personal_fm?cookie=" + encode(cookie));
        return toObjectMapList(payload.get("data"));
    }

    private Map<String, Object> requestMap(String pathAndQuery) {
        try {
            String body = restClient.get()
                .uri(pathAndQuery)
                .retrieve()
                .body(String.class);
            return tryParseJson(body);
        } catch (BusinessException ex) {
            throw ex;
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_NETEASE_DISCOVERY_FAIL reason_type={}", ex.getClass().getSimpleName());
            return Map.of();
        }
    }

    private String encode(String raw) {
        String normalized = readString(raw, "");
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        return URLEncoder.encode(normalized, StandardCharsets.UTF_8);
    }

    private Map<String, Object> tryParseJson(String body) {
        if (!StringUtils.hasText(body)) {
            return Map.of();
        }
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().readValue(
                body,
                new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {
                }
            );
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_NETEASE_DISCOVERY_PARSE_FAIL reason={}", ex.getMessage());
            return Map.of();
        }
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

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }
}
