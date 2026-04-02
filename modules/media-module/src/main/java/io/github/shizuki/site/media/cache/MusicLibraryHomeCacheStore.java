package io.github.shizuki.site.media.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MusicLibraryHomeCacheProperties;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import java.time.Duration;
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
            return objectMapper.readValue(payload, MusicLibraryHomeResponse.class);
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_LIBRARY_HOME_CACHE_READ_FAIL key={} reason={}", properties.getRedisKey(), ex.getMessage());
            return null;
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
