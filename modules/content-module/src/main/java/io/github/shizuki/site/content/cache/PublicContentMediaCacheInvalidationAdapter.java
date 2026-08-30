package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.content.mapper.publiccontent.PublicContentCacheTargetMapper;
import io.github.shizuki.site.content.mapper.publiccontent.PublicContentCacheTargetRow;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.content.port.PublicContentCacheInvalidationPort;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/** Maps a media state transition to the exact opaque Album/Moment cache identities it affects. */
@Component
public class PublicContentMediaCacheInvalidationAdapter implements PublicContentCacheInvalidationPort {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(PublicContentMediaCacheInvalidationAdapter.class);

    private final PublicContentCacheTargetMapper targetMapper;
    private final PublicContentCacheInvalidator cacheInvalidator;

    public PublicContentMediaCacheInvalidationAdapter(
        PublicContentCacheTargetMapper targetMapper,
        PublicContentCacheInvalidator cacheInvalidator
    ) {
        this.targetMapper = targetMapper;
        this.cacheInvalidator = cacheInvalidator;
    }

    @Override
    public void invalidateByPhotoId(long photoId) {
        if (photoId <= 0) {
            return;
        }
        invalidate(safeTargets(() -> targetMapper.selectByPhotoId(photoId)));
    }

    @Override
    public void invalidateBySourceAssetId(long sourceAssetId) {
        if (sourceAssetId <= 0) {
            return;
        }
        invalidate(safeTargets(() -> targetMapper.selectBySourceAssetId(sourceAssetId)));
    }

    private void invalidate(List<PublicContentCacheTargetRow> rows) {
        List<PublicContentCacheTarget> targets = rows.stream()
            .filter(Objects::nonNull)
            .map(this::toTarget)
            .filter(Objects::nonNull)
            .distinct()
            .toList();
        cacheInvalidator.invalidateContentsAfterCommit(targets);
    }

    private PublicContentCacheTarget toTarget(PublicContentCacheTargetRow row) {
        try {
            PublicContentType type = PublicContentType.valueOf(
                String.valueOf(row.getContentType()).trim().toUpperCase(Locale.ROOT)
            );
            return new PublicContentCacheTarget(type, row.getPublicIdentifier());
        } catch (RuntimeException invalidProjection) {
            LOGGER.warn("PUBLIC_CONTENT_CACHE_TARGET_INVALID reason={}",
                invalidProjection.getClass().getSimpleName());
            return null;
        }
    }

    private List<PublicContentCacheTargetRow> safeTargets(TargetLoader loader) {
        try {
            List<PublicContentCacheTargetRow> rows = loader.load();
            return rows == null ? List.of() : List.copyOf(rows);
        } catch (RuntimeException queryFailure) {
            // A cache hook must never turn an already committed media state into a worker failure.
            LOGGER.warn("PUBLIC_CONTENT_CACHE_TARGET_LOOKUP_SKIP reason={}",
                queryFailure.getClass().getSimpleName());
            return List.of();
        }
    }

    @FunctionalInterface
    private interface TargetLoader {
        List<PublicContentCacheTargetRow> load();
    }
}
