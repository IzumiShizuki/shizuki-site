package io.github.shizuki.site.content.service.photo;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.MomentMapper;
import io.github.shizuki.site.content.mapper.MomentPhotoMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.media.port.ManagedPhotoMediaPort;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ManagedPhotoPublicationPreparationServiceTest {

    @Mock private AlbumMapper albumMapper;
    @Mock private AlbumPhotoMapper albumPhotoMapper;
    @Mock private MomentMapper momentMapper;
    @Mock private MomentPhotoMapper momentPhotoMapper;
    @Mock private PhotoMapper photoMapper;
    @Mock private ManagedPhotoMediaPort mediaPort;

    private ManagedPhotoPublicationPreparationService service;

    @BeforeEach
    void setUp() {
        service = new ManagedPhotoPublicationPreparationService(
            albumMapper, albumPhotoMapper, momentMapper, momentPhotoMapper, photoMapper, mediaPort
        );
    }

    @Test
    void materializesOnlySanitizedPublicDerivativesForExplicitlyPublicContent() {
        AlbumEntity album = new AlbumEntity();
        album.setVisibilityStatus("PUBLIC");
        when(albumMapper.selectById(3L)).thenReturn(album);
        AlbumPhotoEntity association = new AlbumPhotoEntity();
        association.setPhotoId(7L);
        when(albumPhotoMapper.selectByAlbumIdOrdered(3L)).thenReturn(List.of(association));
        PhotoEntity photo = new PhotoEntity();
        photo.setId(7L);
        photo.setOriginalAssetId(99L);
        when(photoMapper.selectReusableByIds(List.of(7L))).thenReturn(List.of(photo));

        service.prepareAlbumIfPublic(3L);

        verify(mediaPort).enqueuePublicMaterializedDerivatives(99L);
        verify(mediaPort, never()).enqueuePrivateWorkingDerivatives(99L);
    }

    @Test
    void leavesPrivateContentWithoutPublicMaterialization() {
        AlbumEntity album = new AlbumEntity();
        album.setVisibilityStatus("PRIVATE");
        when(albumMapper.selectById(3L)).thenReturn(album);

        service.prepareAlbumIfPublic(3L);

        verify(mediaPort, never()).enqueuePublicMaterializedDerivatives(99L);
        verify(albumPhotoMapper, never()).selectByAlbumIdOrdered(3L);
    }
}
