package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.model.PublicContentType;
import java.util.function.Supplier;
import org.springframework.core.ParameterizedTypeReference;

/**
 * Best-effort visitor cache. Loader failures remain visible; Redis and JSON failures degrade to
 * an ordinary source read and never become the public fact boundary.
 */
public interface PublicContentCacheStore {

    <T> T getOrLoadList(
        PublicContentType type,
        String cursor,
        int limit,
        ParameterizedTypeReference<T> valueType,
        Supplier<T> loader
    );

    <T> T getOrLoadFeatured(
        PublicContentType type,
        int limit,
        ParameterizedTypeReference<T> valueType,
        Supplier<T> loader
    );

    <T> T getOrLoadDetail(
        PublicContentType type,
        String opaqueIdentifier,
        ParameterizedTypeReference<T> valueType,
        Supplier<PublicContentDetail<T>> loader
    );
}
