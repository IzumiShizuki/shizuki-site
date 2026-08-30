package io.github.shizuki.site.content.service.photo;

import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.MomentMapper;
import io.github.shizuki.site.content.mapper.MomentPhotoMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.media.port.ManagedPhotoMediaPort;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Materializes sanitized public derivatives only after content explicitly targets PUBLIC
 * visibility. Private originals remain private and are never exposed through this boundary.
 */
@Service
public class ManagedPhotoPublicationPreparationService {

    private final AlbumMapper albumMapper;
    private final AlbumPhotoMapper albumPhotoMapper;
    private final MomentMapper momentMapper;
    private final MomentPhotoMapper momentPhotoMapper;
    private final PhotoMapper photoMapper;
    private final ManagedPhotoMediaPort mediaPort;

    public ManagedPhotoPublicationPreparationService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        MomentMapper momentMapper,
        MomentPhotoMapper momentPhotoMapper,
        PhotoMapper photoMapper,
        ManagedPhotoMediaPort mediaPort
    ) {
        this.albumMapper = albumMapper;
        this.albumPhotoMapper = albumPhotoMapper;
        this.momentMapper = momentMapper;
        this.momentPhotoMapper = momentPhotoMapper;
        this.photoMapper = photoMapper;
        this.mediaPort = mediaPort;
    }

    public void prepareAlbumIfPublic(long albumId) {
        AlbumEntity album = albumMapper.selectById(albumId);
        if (album == null || !"PUBLIC".equalsIgnoreCase(album.getVisibilityStatus())) return;
        var associations = albumPhotoMapper.selectByAlbumIdOrdered(albumId);
        prepare((associations == null ? List.<AlbumPhotoEntity>of() : associations)
            .stream().map(item -> item.getPhotoId()).toList());
    }

    public void prepareMomentIfPublic(long momentId) {
        MomentEntity moment = momentMapper.selectById(momentId);
        if (moment == null || !"PUBLIC".equalsIgnoreCase(moment.getVisibilityStatus())) return;
        var associations = momentPhotoMapper.selectByMomentIdOrdered(momentId);
        prepare((associations == null ? List.<MomentPhotoEntity>of() : associations)
            .stream().map(item -> item.getPhotoId()).toList());
    }

    private void prepare(List<Long> photoIds) {
        if (photoIds == null || photoIds.isEmpty()) return;
        List<PhotoEntity> photos = photoMapper.selectReusableByIds(photoIds);
        for (PhotoEntity photo : photos == null ? List.<PhotoEntity>of() : photos) {
            if (photo.getOriginalAssetId() != null && photo.getOriginalAssetId() > 0) {
                mediaPort.enqueuePublicMaterializedDerivatives(photo.getOriginalAssetId());
            }
        }
    }
}
