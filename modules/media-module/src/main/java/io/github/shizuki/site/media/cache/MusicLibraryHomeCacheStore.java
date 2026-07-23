package io.github.shizuki.site.media.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MusicLibraryHomeCacheProperties;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 音乐库首页缓存读写。
 */
@Component
public class MusicLibraryHomeCacheStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicLibraryHomeCacheStore.class);

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final MusicLibraryHomeCacheProperties properties;

    public MusicLibraryHomeCacheStore(StringRedisTemplate redisTemplate,
                                      ObjectMapper objectMapper,
                                      MusicLibraryHomeCacheProperties properties) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.properties = properties;
    }

    public boolean isEnabled() {
        return properties.isEnabled() && StringUtils.hasText(properties.getRedisKey());
    }

    public MusicLibraryHomeResponse read() {
        if (!isEnabled()) {
            return null;
        }
        try {
            String payload = redisTemplate.opsForValue().get(properties.getRedisKey());
            if (!StringUtils.hasText(payload)) {
                return null;
            }
            MusicLibraryHomeResponse cached = objectMapper.readValue(payload, MusicLibraryHomeResponse.class);
            if (hasMissingPositiveTrackDuration(cached)) {
                LOGGER.info("MUSIC_LIBRARY_HOME_CACHE_STALE key={} reason=missing_positive_track_duration",
                    properties.getRedisKey());
                redisTemplate.delete(properties.getRedisKey());
                return null;
            }
            return cached;
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_LIBRARY_HOME_CACHE_READ_FAIL key={} reason={}", properties.getRedisKey(), ex.getMessage());
            return null;
        }
    }

    private boolean hasMissingPositiveTrackDuration(MusicLibraryHomeResponse value) {
        if (value == null || value.featuredTracks() == null) {
            return true;
        }
        List<MusicTrackResponse> tracks = value.featuredTracks();
        if (tracks.isEmpty()) {
            return false;
        }
        return tracks.stream().anyMatch(track -> !hasPositiveDuration(track));
    }

    private boolean hasPositiveDuration(MusicTrackResponse track) {
        if (track == null) {
            return false;
        }
        Map<String, Object> metadata = track.metadata();
        if (metadata == null) {
            return false;
        }
        Object rawDuration = metadata.get("durationSec");
        if (rawDuration instanceof Number number) {
            return number.doubleValue() > 0D;
        }
        if (rawDuration == null) {
            return false;
        }
        try {
            return Double.parseDouble(String.valueOf(rawDuration)) > 0D;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void write(MusicLibraryHomeResponse value) {
        if (!isEnabled() || value == null) {
            return;
        }
        try {
            String payload = objectMapper.writeValueAsString(value);
            long ttlSeconds = properties.getTtlSeconds();
            if (ttlSeconds > 0L) {
                redisTemplate.opsForValue().set(properties.getRedisKey(), payload, Duration.ofSeconds(ttlSeconds));
            } else {
                redisTemplate.opsForValue().set(properties.getRedisKey(), payload);
            }
        } catch (JsonProcessingException ex) {
            LOGGER.warn("MUSIC_LIBRARY_HOME_CACHE_WRITE_FAIL key={} reason={}", properties.getRedisKey(), ex.getMessage());
        }
    }

    public void clear() {
        if (!isEnabled()) {
            return;
        }
        redisTemplate.delete(properties.getRedisKey());
    }
}
