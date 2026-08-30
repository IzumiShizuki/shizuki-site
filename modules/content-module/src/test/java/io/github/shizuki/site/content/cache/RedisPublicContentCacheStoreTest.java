package io.github.shizuki.site.content.cache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

class RedisPublicContentCacheStoreTest {

    private static final ParameterizedTypeReference<List<String>> STRING_LIST =
        new ParameterizedTypeReference<>() {
        };

    private final Map<String, String> redis = new HashMap<>();
    private final Map<String, Duration> ttls = new HashMap<>();
    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> values;
    private PublicContentCacheProperties properties;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redisTemplate = mock(StringRedisTemplate.class);
        values = mock(ValueOperations.class);
        when(redisTemplate.opsForValue()).thenReturn(values);
        when(values.get(anyString())).thenAnswer(invocation -> redis.get(invocation.getArgument(0)));
        doAnswer(invocation -> {
            String key = invocation.getArgument(0);
            redis.put(key, invocation.getArgument(1));
            ttls.put(key, invocation.getArgument(2));
            return null;
        }).when(values).set(anyString(), anyString(), any(Duration.class));
        properties = new PublicContentCacheProperties();
    }

    @Test
    void listMissLoadsOnceAndCachesByOpaqueQueryDigest() {
        RedisPublicContentCacheStore store = store(new ObjectMapper());
        AtomicInteger loads = new AtomicInteger();
        String cursor = "cursor-containing-internal-sort-material";

        List<String> first = store.getOrLoadList(
            PublicContentType.ALBUM,
            cursor,
            12,
            STRING_LIST,
            () -> {
                loads.incrementAndGet();
                return List.of("private-card-body");
            }
        );
        List<String> second = store.getOrLoadList(
            PublicContentType.ALBUM,
            cursor,
            12,
            STRING_LIST,
            () -> {
                loads.incrementAndGet();
                return List.of("unexpected");
            }
        );

        assertThat(first).containsExactly("private-card-body");
        assertThat(second).containsExactly("private-card-body");
        assertThat(loads).hasValue(1);
        String cachedKey = redis.keySet().stream().filter(key -> key.contains(":list:g0:")).findFirst().orElseThrow();
        assertThat(cachedKey).doesNotContain(cursor).doesNotContain("private-card-body");
        assertThat(ttls.get(cachedKey)).isEqualTo(Duration.ofSeconds(30));
    }

    @Test
    void aNewTypeGenerationMakesEveryOldListAndFeaturedEntryUnreachable() {
        RedisPublicContentCacheStore store = store(new ObjectMapper());
        store.getOrLoadFeatured(
            PublicContentType.MOMENT,
            4,
            STRING_LIST,
            () -> List.of("old")
        );
        redis.put(PublicContentCacheKeys.listGeneration(PublicContentType.MOMENT), "1");

        List<String> refreshed = store.getOrLoadFeatured(
            PublicContentType.MOMENT,
            4,
            STRING_LIST,
            () -> List.of("new")
        );

        assertThat(refreshed).containsExactly("new");
        assertThat(redis.keySet()).anyMatch(key -> key.contains(":featured:g0:"));
        assertThat(redis.keySet()).anyMatch(key -> key.contains(":featured:g1:"));
    }

    @Test
    void generationChangeDuringSourceLoadPreventsStaleWriteBack() {
        RedisPublicContentCacheStore store = store(new ObjectMapper());
        String generationKey = PublicContentCacheKeys.listGeneration(PublicContentType.ALBUM);

        List<String> loaded = store.getOrLoadList(
            PublicContentType.ALBUM,
            null,
            10,
            STRING_LIST,
            () -> {
                redis.put(generationKey, "1");
                return List.of("stale-source-result");
            }
        );

        assertThat(loaded).containsExactly("stale-source-result");
        assertThat(redis.keySet()).noneMatch(key -> key.contains(":list:g0:"));
    }

    @Test
    void publicDetailIsCachedButUnlistedDetailNeverIs() {
        RedisPublicContentCacheStore store = store(new ObjectMapper());
        AtomicInteger publicLoads = new AtomicInteger();
        String publicId = "alb_123456789012345678901234567";
        String unlistedId = "alb_abcdefghijklmnopqrstuvwxyz0";

        String first = store.getOrLoadDetail(
            PublicContentType.ALBUM,
            publicId,
            ParameterizedTypeReference.forType(String.class),
            () -> PublicContentDetail.of(LifeContentVisibilityEnum.PUBLIC, "public-detail")
        );
        String second = store.getOrLoadDetail(
            PublicContentType.ALBUM,
            publicId,
            ParameterizedTypeReference.forType(String.class),
            () -> {
                publicLoads.incrementAndGet();
                return PublicContentDetail.of(LifeContentVisibilityEnum.PUBLIC, "unexpected");
            }
        );
        String unlisted = store.getOrLoadDetail(
            PublicContentType.ALBUM,
            unlistedId,
            ParameterizedTypeReference.forType(String.class),
            () -> PublicContentDetail.of(LifeContentVisibilityEnum.UNLISTED, "private-capability")
        );

        assertThat(first).isEqualTo("public-detail");
        assertThat(second).isEqualTo("public-detail");
        assertThat(publicLoads).hasValue(0);
        assertThat(unlisted).isEqualTo("private-capability");
        assertThat(redis).containsKey(PublicContentCacheKeys.detail(PublicContentType.ALBUM, publicId));
        assertThat(redis).doesNotContainKey(PublicContentCacheKeys.detail(PublicContentType.ALBUM, unlistedId));
        assertThat(redis.values()).noneMatch(value -> value.contains("private-capability"));
    }

    @Test
    void redisFailureBecomesMissAndSkipsWriteWithoutHidingSourceResult() {
        when(values.get(anyString())).thenThrow(new IllegalStateException("redis unavailable"));
        RedisPublicContentCacheStore store = store(new ObjectMapper());

        List<String> result = store.getOrLoadList(
            PublicContentType.MOMENT,
            null,
            10,
            STRING_LIST,
            () -> List.of("database-fact")
        );

        assertThat(result).containsExactly("database-fact");
        assertThat(redis).isEmpty();
    }

    @Test
    void serializationFailureSkipsWriteWithoutHidingSourceResult() throws Exception {
        ObjectMapper mapper = spy(new ObjectMapper());
        doThrow(new JsonProcessingException("cannot serialize") {
        }).when(mapper).writeValueAsString(any());
        RedisPublicContentCacheStore store = store(mapper);

        List<String> result = store.getOrLoadFeatured(
            PublicContentType.ALBUM,
            3,
            STRING_LIST,
            () -> List.of("database-fact")
        );

        assertThat(result).containsExactly("database-fact");
        assertThat(redis.keySet()).noneMatch(key -> key.contains(":featured:"));
    }

    @Test
    void configuredTtlsMustRemainShort() {
        assertThatThrownBy(() -> properties.setDetailTtl(Duration.ofMinutes(6)))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("5 minutes");
        assertThatThrownBy(() -> properties.setListTtl(Duration.ZERO))
            .isInstanceOf(IllegalArgumentException.class);
    }

    private RedisPublicContentCacheStore store(ObjectMapper objectMapper) {
        return new RedisPublicContentCacheStore(redisTemplate, objectMapper, properties);
    }
}
