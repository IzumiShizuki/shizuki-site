package io.github.shizuki.site.content.service.album;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.content.cache.PublicContentCacheInvalidator;
import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.transaction.annotation.Transactional;

/** Transactional commands for reusable, association-scoped album photo composition. */
@Service
public class AlbumPhotoCommandService {

    private static final String MANAGE_PERMISSION = "life.content.manage";
    private static final int MAX_BATCH_SIZE = 200;
    private static final int MAX_CAPTION_LENGTH = 4_000;

    private final AlbumMapper albumMapper;
    private final AlbumPhotoMapper albumPhotoMapper;
    private final PhotoMapper photoMapper;
    private final PublicContentCacheInvalidator cacheInvalidator;
    private final SecureRandom secureRandom;

    @Autowired
    public AlbumPhotoCommandService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        PhotoMapper photoMapper,
        ObjectProvider<PublicContentCacheInvalidator> cacheInvalidatorProvider
    ) {
        this(
            albumMapper,
            albumPhotoMapper,
            photoMapper,
            cacheInvalidatorProvider.getIfAvailable(),
            new SecureRandom()
        );
    }

    AlbumPhotoCommandService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        PhotoMapper photoMapper,
        SecureRandom secureRandom
    ) {
        this(albumMapper, albumPhotoMapper, photoMapper, null, secureRandom);
    }

    AlbumPhotoCommandService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        PhotoMapper photoMapper,
        PublicContentCacheInvalidator cacheInvalidator,
        SecureRandom secureRandom
    ) {
        this.albumMapper = albumMapper;
        this.albumPhotoMapper = albumPhotoMapper;
        this.photoMapper = photoMapper;
        this.cacheInvalidator = cacheInvalidator;
        this.secureRandom = secureRandom;
    }

    /**
     * Attaches already-managed photos. Existing active associations keep their media reference;
     * a previously detached association receives a fresh reference so stale capabilities stay revoked.
     */
    @Transactional(rollbackFor = Exception.class)
    public AlbumPhotoMutationResult attach(
        long albumId,
        int expectedVersion,
        List<AlbumPhotoAttachmentCommand> requestedAttachments
    ) {
        requireAdministrator();
        List<AlbumPhotoAttachmentCommand> attachments = normalizeAttachments(requestedAttachments);
        AlbumEntity album = claimAlbum(albumId, expectedVersion);

        List<Long> photoIds = attachments.stream().map(AlbumPhotoAttachmentCommand::photoId).toList();
        requireReusablePhotos(photoIds);

        Map<Long, AlbumPhotoEntity> existingByPhotoId = new HashMap<>();
        safe(albumPhotoMapper.selectAnyByAlbumAndPhotoIds(albumId, photoIds))
            .forEach(association -> existingByPhotoId.put(association.getPhotoId(), association));

        List<AlbumPhotoEntity> current = safe(albumPhotoMapper.selectByAlbumIdOrdered(albumId));
        int nextSort = current.stream()
            .map(AlbumPhotoEntity::getSortNum)
            .filter(value -> value != null)
            .max(Integer::compareTo)
            .orElse(-1) + 1;

        for (AlbumPhotoAttachmentCommand attachment : attachments) {
            AlbumPhotoEntity existing = existingByPhotoId.get(attachment.photoId());
            if (existing != null && !Integer.valueOf(1).equals(existing.getDeleted())) {
                requireAssociationUpdated(albumPhotoMapper.updateAssociationMetadata(
                    albumId,
                    existing.getId(),
                    attachment.caption(),
                    attachment.downloadMode().name()
                ));
                continue;
            }
            if (existing != null) {
                requireAssociationUpdated(albumPhotoMapper.restoreAssociation(
                    albumId,
                    existing.getId(),
                    nextMediaRef(),
                    nextSort++,
                    attachment.caption(),
                    attachment.downloadMode().name()
                ));
                continue;
            }

            AlbumPhotoEntity association = new AlbumPhotoEntity();
            association.setAlbumId(albumId);
            association.setPhotoId(attachment.photoId());
            association.setMediaRefId(nextMediaRef());
            association.setSortNum(nextSort++);
            association.setCaption(attachment.caption());
            association.setDownloadMode(attachment.downloadMode().name());
            // Newly attached media is fail-closed until the album is explicitly published again.
            association.setDeliveryRevoked(true);
            association.setDeleted(0);
            association.setVersion(0);
            if (albumPhotoMapper.insert(association) != 1) {
                throw new BusinessException(ErrorCode.CONFLICT, "Album photo was not attached");
            }
        }
        invalidate(album);
        return result(expectedVersion, albumId);
    }

    @Transactional(rollbackFor = Exception.class)
    public AlbumPhotoMutationResult detach(long albumId, int expectedVersion, List<Long> requestedPhotoIds) {
        requireAdministrator();
        List<Long> photoIds = normalizePhotoIds(requestedPhotoIds, false);
        AlbumEntity album = claimAlbum(albumId, expectedVersion);
        int detached = albumPhotoMapper.revokeAndDetach(albumId, photoIds);
        if (detached != photoIds.size()) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Album photo set changed",
                Map.of("requestedCount", photoIds.size(), "detachedCount", detached)
            );
        }
        // Detaching the selected cover also removes featured eligibility in the same transaction.
        albumMapper.clearDetachedCoverAndFeatured(albumId);
        invalidate(album);
        return result(expectedVersion, albumId);
    }

    @Transactional(rollbackFor = Exception.class)
    public AlbumPhotoMutationResult reorder(long albumId, int expectedVersion, List<Long> requestedPhotoIds) {
        requireAdministrator();
        List<Long> orderedPhotoIds = normalizePhotoIds(requestedPhotoIds, true);
        AlbumEntity album = claimAlbum(albumId, expectedVersion);

        List<AlbumPhotoEntity> current = safe(albumPhotoMapper.selectByAlbumIdOrdered(albumId));
        Map<Long, AlbumPhotoEntity> currentByPhotoId = new LinkedHashMap<>();
        current.forEach(association -> currentByPhotoId.put(association.getPhotoId(), association));
        if (currentByPhotoId.size() != orderedPhotoIds.size()
            || !currentByPhotoId.keySet().equals(new HashSet<>(orderedPhotoIds))) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "A reorder command must contain the complete current album photo set",
                Map.of("currentPhotoIds", List.copyOf(currentByPhotoId.keySet()))
            );
        }

        for (int index = 0; index < orderedPhotoIds.size(); index++) {
            AlbumPhotoEntity association = currentByPhotoId.get(orderedPhotoIds.get(index));
            requireAssociationUpdated(albumPhotoMapper.updateSort(albumId, association.getId(), index));
        }
        invalidate(album);
        return result(expectedVersion, albumId);
    }

    private void invalidate(AlbumEntity album) {
        if (cacheInvalidator != null && album != null && album.getPublicSlug() != null) {
            cacheInvalidator.invalidateContentAfterCommit(
                io.github.shizuki.site.content.model.PublicContentType.ALBUM,
                album.getPublicSlug()
            );
        }
    }

    private AlbumEntity claimAlbum(long albumId, int expectedVersion) {
        if (albumId <= 0 || expectedVersion < 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        AlbumEntity album = albumMapper.selectById(albumId);
        if (album == null || album.getId() == null || Integer.valueOf(1).equals(album.getDeleted())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        if (LifeContentLifecycleEnum.RECYCLED.name().equals(album.getLifecycleStatus())) {
            throw new BusinessException(ErrorCode.CONFLICT, "Recycled albums must be restored before editing");
        }
        int currentVersion = valueOrZero(album.getVersion());
        if (currentVersion != expectedVersion
            || albumMapper.claimPhotoCompositionMutation(albumId, expectedVersion) != 1) {
            AlbumEntity current = albumMapper.selectById(albumId);
            int latestVersion = current == null ? currentVersion : valueOrZero(current.getVersion());
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Album version changed",
                Map.of("currentVersion", latestVersion)
            );
        }
        return album;
    }

    private void requireReusablePhotos(List<Long> photoIds) {
        List<PhotoEntity> photos = safe(photoMapper.selectReusableByIds(photoIds));
        Set<Long> reusableIds = new HashSet<>();
        photos.forEach(photo -> reusableIds.add(photo.getId()));
        if (reusableIds.size() != photoIds.size() || !reusableIds.containsAll(photoIds)) {
            List<Long> unavailableIds = photoIds.stream().filter(id -> !reusableIds.contains(id)).toList();
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "One or more photos are unavailable for reuse",
                Map.of("unavailablePhotoIds", unavailableIds)
            );
        }
    }

    private List<AlbumPhotoAttachmentCommand> normalizeAttachments(
        List<AlbumPhotoAttachmentCommand> requested
    ) {
        if (requested == null || requested.isEmpty() || requested.size() > MAX_BATCH_SIZE) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Attach batch must contain 1 to 200 photos");
        }
        Set<Long> seen = new HashSet<>();
        List<AlbumPhotoAttachmentCommand> normalized = new ArrayList<>(requested.size());
        for (AlbumPhotoAttachmentCommand attachment : requested) {
            if (attachment == null || attachment.photoId() <= 0 || !seen.add(attachment.photoId())) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Attach batch contains an invalid or duplicate photo");
            }
            String caption = normalizeCaption(attachment.caption());
            PhotoDownloadModeEnum downloadMode = attachment.downloadMode() == null
                ? PhotoDownloadModeEnum.NONE
                : attachment.downloadMode();
            normalized.add(new AlbumPhotoAttachmentCommand(attachment.photoId(), caption, downloadMode));
        }
        return List.copyOf(normalized);
    }

    private List<Long> normalizePhotoIds(List<Long> requested, boolean allowEmpty) {
        if (requested == null || (!allowEmpty && requested.isEmpty()) || requested.size() > MAX_BATCH_SIZE) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Photo batch is invalid");
        }
        Set<Long> seen = new HashSet<>();
        for (Long photoId : requested) {
            if (photoId == null || photoId <= 0 || !seen.add(photoId)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Photo batch contains an invalid or duplicate photo");
            }
        }
        return List.copyOf(requested);
    }

    private String normalizeCaption(String caption) {
        if (caption == null) {
            return null;
        }
        String normalized = caption.trim();
        if (normalized.length() > MAX_CAPTION_LENGTH) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Album caption is too long");
        }
        return normalized.isEmpty() ? null : normalized;
    }

    private String nextMediaRef() {
        return OpaqueMediaReference.generate(secureRandom);
    }

    private AlbumPhotoMutationResult result(int expectedVersion, long albumId) {
        return new AlbumPhotoMutationResult(
            OptimisticVersionResponse.of((long) expectedVersion + 1L),
            safe(albumPhotoMapper.selectByAlbumIdOrdered(albumId))
        );
    }

    private void requireAssociationUpdated(int updated) {
        if (updated != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album photo set changed");
        }
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : values;
    }
}
