package io.github.shizuki.site.media.integration;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.time.Duration;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * AMLL TTML 逐字歌词库客户端。
 *
 * <p>AMLL（Apple Music-like Lyrics）维护了公开的逐字歌词数据库
 * （https://amll-ttml-db.stevexmh.net），以 TTML 格式提供逐字时间轴歌词。
 * 网易云对第三方 API 的 yrc 逐字歌词已风控，因此本客户端作为逐字歌词数据源，
 * 供前端移植的 amllTtml 解析器消费。
 */
@Component
public class AmllLyricClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AmllLyricClient.class);
    private static final String AMLL_DB_BASE_URL = "https://amll-ttml-db.stevexmh.net";
    private static final Set<String> ALLOWED_PLATFORMS = Set.of("ncm", "qq");

    private final RestClient restClient;

    @Autowired
    public AmllLyricClient(RestClient.Builder restClientBuilder) {
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(Duration.ofSeconds(6));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    /**
     * 拉取指定平台的逐字歌词（TTML 原文）。
     *
     * @param trackId  曲目 ID（网易云或 QQ 音乐）
     * @param platform 平台：ncm / qq
     * @return TTML 原文；未命中返回空字符串
     */
    public String fetchAmllLyric(String trackId, String platform) {
        String normalizedTrackId = readString(trackId, "");
        if (!StringUtils.hasText(normalizedTrackId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "track_id is required");
        }
        String normalizedPlatform = readString(platform, "ncm").toLowerCase(Locale.ROOT);
        if (!ALLOWED_PLATFORMS.contains(normalizedPlatform)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported AMLL platform");
        }
        String url = AMLL_DB_BASE_URL + "/" + normalizedPlatform + "/" + normalizedTrackId + "?format=ttml";
        try {
            String body = restClient.get()
                .uri(url)
                .header("User-Agent", "shizuki-site/0.1 (AMLL lyric proxy)")
                .retrieve()
                .body(String.class);
            if (body != null && body.contains("<tt")) {
                return body;
            }
            return "";
        } catch (Exception ex) {
            LOGGER.warn(
                "MUSIC_AMLL_LYRIC_FETCH_FAIL platform={} trackId={} reason_type={}",
                normalizedPlatform,
                normalizedTrackId,
                ex.getClass().getSimpleName()
            );
            return "";
        }
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }
}
