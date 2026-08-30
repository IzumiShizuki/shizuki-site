package io.github.shizuki.site.content.cache;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/** Redis-backed public cache with generation checks that prevent stale post-invalidation writes. */
@Component
public class RedisPublicContentCacheStore implements PublicContentCacheStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisPublicContentCacheStore.class);
    private static final String GENERATION_FIELD = "generation";
    private static final String VALUE_FIELD = "value";

    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final PublicContentCacheProperties properties;

    public RedisPublicContentCacheStore(
        StringRedisTemplate redisTemplate,
        ObjectMapper objectMapper,
        PublicContentCacheProperties properties
    ) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.properties = properties;
    }

    @Override
    public <T> T getOrLoadList(
        PublicContentType type,
        String cursor,
        int limit,
        ParameterizedTypeReference<T> valueType,
        Supplier<T> loader
    ) {
        return getOrLoadGenerated(
            PublicContentCacheKeys.listGeneration(type),
            generation -> PublicContentCacheKeys.list(type, generation, cursor, limit),
            properties.getListTtl(),
            valueType,
            loader
        );
    }

    @Override
    public <T> T getOrLoadFeatured(
        PublicContentType type,
        int limit,
        ParameterizedTypeReference<T> valueType,
        Supplier<T> loader
    ) {
        return getOrLoadGenerated(
            PublicContentCacheKeys.listGeneration(type),
            generation -> PublicContentCacheKeys.featured(type, generation, limit),
            properties.getFeaturedTtl(),
            valueType,
            loader
        );
    }

    @Override
    public <T> T getOrLoadDetail(
        PublicContentType type,
        String opaqueIdentifier,
        ParameterizedTypeReference<T> valueType,
        Supplier<PublicContentDetail<T>> loader
    ) {
        String normalizedIdentifier = PublicContentCacheKeys.requireOpaqueIdentifier(opaqueIdentifier);
        String generationKey = PublicContentCacheKeys.detailGeneration(type, normalizedIdentifier);
        String valueKey = PublicContentCacheKeys.detail(type, normalizedIdentifier);
        OptionalLong generation = readGeneration(generationKey);
        if (generation.isPresent()) {
            Optional<T> cached = read(valueKey, generation.getAsLong(), valueType);
            if (cached.isPresent()) {
                return cached.get();
            }
        }

        PublicContentDetail<T> loaded = loader.get();
        if (loaded.visibility() != LifeContentVisibilityEnum.PUBLIC || generation.isEmpty()) {
            return loaded.value();
        }
        writeIfGenerationUnchanged(
            generationKey,
            generation.getAsLong(),
            valueKey,
            loaded.value(),
            properties.getDetailTtl()
        );
        return loaded.value();
    }

    private <T> T getOrLoadGenerated(
        String generationKey,
        GenerationKeyFactory keyFactory,
        Duration ttl,
        ParameterizedTypeReference<T> valueType,
        Supplier<T> loader
    ) {
        OptionalLong generation = readGeneration(generationKey);
        String valueKey = generation.isPresent() ? keyFactory.create(generation.getAsLong()) : null;
        if (valueKey != null) {
            Optional<T> cached = read(valueKey, generation.getAsLong(), valueType);
            if (cached.isPresent()) {
                return cached.get();
            }
        }

        T loaded = loader.get();
        if (loaded != null && generation.isPresent()) {
            writeIfGenerationUnchanged(generationKey, generation.getAsLong(), valueKey, loaded, ttl);
        }
        return loaded;
    }

    private OptionalLong readGeneration(String key) {
        try {
            String raw = redisTemplate.opsForValue().get(key);
            if (raw == null) {
                return OptionalLong.of(0L);
            }
            long generation = Long.parseLong(raw);
            return generation < 0 ? OptionalLong.empty() : OptionalLong.of(generation);
        } catch (RuntimeException exception) {
            logSkip("generation-read", exception);
            return OptionalLong.empty();
        }
    }

    private <T> Optional<T> read(
        String key,
        long expectedGeneration,
        ParameterizedTypeReference<T> valueType
    ) {
        try {
            String raw = redisTemplate.opsForValue().get(key);
            if (raw == null) {
                return Optional.empty();
            }
            JsonNode envelope = objectMapper.readTree(raw);
            if (envelope == null
                || envelope.path(GENERATION_FIELD).asLong(-1L) != expectedGeneration
                || !envelope.hasNonNull(VALUE_FIELD)) {
                return Optional.empty();
            }
            JavaType javaType = objectMapper.getTypeFactory().constructType(valueType.getType());
            return Optional.ofNullable(objectMapper.readerFor(javaType).readValue(envelope.get(VALUE_FIELD)));
        } catch (Exception exception) {
            logSkip("read", exception);
            return Optional.empty();
        }
    }

    private void writeIfGenerationUnchanged(
        String generationKey,
        long expectedGeneration,
        String valueKey,
        Object value,
        Duration ttl
    ) {
        OptionalLong currentGeneration = readGeneration(generationKey);
        if (currentGeneration.isEmpty() || currentGeneration.getAsLong() != expectedGeneration) {
            return;
        }
        try {
            ObjectNode envelope = objectMapper.createObjectNode();
            envelope.put(GENERATION_FIELD, expectedGeneration);
            envelope.set(VALUE_FIELD, objectMapper.valueToTree(value));
            redisTemplate.opsForValue().set(valueKey, objectMapper.writeValueAsString(envelope), ttl);
        } catch (Exception exception) {
            logSkip("write", exception);
        }
    }

    private static void logSkip(String operation, Exception exception) {
        LOGGER.debug(
            "PUBLIC_CONTENT_CACHE_SKIP operation={} reason={}",
            operation,
            exception.getClass().getSimpleName()
        );
    }

    @FunctionalInterface
    private interface GenerationKeyFactory {
        String create(long generation);
    }
}
