package io.github.shizuki.site.media.cache;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MusicLibraryHomeCacheProperties;
import io.github.shizuki.site.media.response.MusicLibraryHomeResponse;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

class MusicLibraryHomeCacheStoreTest {

    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> valueOperations;
    private MusicLibraryHomeCacheProperties properties;
    private MusicLibraryHomeCacheStore cacheStore;

    @BeforeEach
    void setUp() {
        redisTemplate = Mockito.mock(StringRedisTemplate.class);
        valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);

        properties = new MusicLibraryHomeCacheProperties();
        properties.setEnabled(true);
        properties.setRedisKey("music:library:home:test");
        properties.setTtlSeconds(3600L);

        cacheStore = new MusicLibraryHomeCacheStore(redisTemplate, new ObjectMapper(), properties);
    }

    @Test
    void shouldReadCachedHomeWhenPayloadExists() throws Exception {
        MusicLibraryHomeResponse expected = new MusicLibraryHomeResponse(List.of(), List.of());
        String payload = new ObjectMapper().writeValueAsString(expected);
        Mockito.when(valueOperations.get("music:library:home:test")).thenReturn(payload);

        MusicLibraryHomeResponse actual = cacheStore.read();

        Assertions.assertNotNull(actual);
        Assertions.assertNotNull(actual.featuredPlaylists());
        Assertions.assertNotNull(actual.featuredTracks());
    }

    @Test
    void shouldWriteCacheWithTtl() {
        MusicLibraryHomeResponse value = new MusicLibraryHomeResponse(List.of(), List.of());

        cacheStore.write(value);

        Mockito.verify(valueOperations).set(
            Mockito.eq("music:library:home:test"),
            Mockito.anyString(),
            Mockito.eq(Duration.ofSeconds(3600L))
        );
    }
}
