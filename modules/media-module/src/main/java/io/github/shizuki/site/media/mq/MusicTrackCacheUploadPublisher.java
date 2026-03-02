package io.github.shizuki.site.media.mq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MusicCacheUploadKafkaProperties;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 音乐缓存上传事件发布器。
 */
@Component
public class MusicTrackCacheUploadPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicTrackCacheUploadPublisher.class);

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private final MusicCacheUploadKafkaProperties properties;

    public MusicTrackCacheUploadPublisher(KafkaTemplate<String, String> kafkaTemplate,
                                          ObjectMapper objectMapper,
                                          MusicCacheUploadKafkaProperties properties) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
        this.properties = properties;
    }

    /**
     * 发布上传缓存事件（失败仅记录日志，不阻塞主流程）。
     */
    public boolean publish(String provider, String trackId, String sourceAudioUrl) {
        if (!properties.isEnabled()) {
            return false;
        }
        String normalizedProvider = readString(provider, "").toLowerCase(Locale.ROOT);
        String normalizedTrackId = readString(trackId, "");
        String normalizedAudioUrl = readString(sourceAudioUrl, "");
        if (!StringUtils.hasText(normalizedProvider) || !StringUtils.hasText(normalizedTrackId) || !StringUtils.hasText(normalizedAudioUrl)) {
            return false;
        }

        MusicTrackCacheUploadEvent event = new MusicTrackCacheUploadEvent(
            normalizedProvider,
            normalizedTrackId,
            normalizedAudioUrl
        );
        try {
            String payload = objectMapper.writeValueAsString(event);
            String key = normalizedProvider + ":" + normalizedTrackId;
            kafkaTemplate.send(properties.getTopic(), key, payload);
            LOGGER.info("MUSIC_CACHE_UPLOAD_ENQUEUE provider={} trackId={}", normalizedProvider, normalizedTrackId);
            return true;
        } catch (JsonProcessingException ex) {
            LOGGER.warn("MUSIC_CACHE_UPLOAD_ENQUEUE_FAIL provider={} trackId={} reason={}",
                normalizedProvider,
                normalizedTrackId,
                sanitizeLogMessage(ex.getMessage()));
            return false;
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_CACHE_UPLOAD_ENQUEUE_FAIL provider={} trackId={} reason={}",
                normalizedProvider,
                normalizedTrackId,
                sanitizeLogMessage(ex.getMessage()));
            return false;
        }
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
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
}
