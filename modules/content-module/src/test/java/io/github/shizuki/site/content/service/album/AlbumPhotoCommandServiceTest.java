package io.github.shizuki.site.content.service.album;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.cache.PublicContentCacheInvalidator;
import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(MockitoExtension.class)
class AlbumPhotoCommandServiceTest {

    @Mock
    private AlbumMapper albumMapper;
    @Mock
    private AlbumPhotoMapper albumPhotoMapper;
    @Mock
    private PhotoMapper photoMapper;
    @Mock
    private PublicContentCacheInvalidator cacheInvalidator;

    private AlbumPhotoCommandService service;

    @BeforeEach
    void setUp() {
        service = new AlbumPhotoCommandService(
            albumMapper,
            albumPhotoMapper,
            photoMapper,
            cacheInvalidator,
            new SecureRandom()
        );
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void reusesManagedPhotosAndRotatesOnlyARevivedAssociationReference() {
        prepareClaim(2);
        PhotoEntity firstPhoto = photo(10L);
        PhotoEntity secondPhoto = photo(11L);
        when(photoMapper.selectReusableByIds(List.of(10L, 11L))).thenReturn(List.of(firstPhoto, secondPhoto));

        AlbumPhotoEntity active = association(101L, 10L, 0, 0);
        active.setMediaRefId(validMediaRef());
        AlbumPhotoEntity detached = association(102L, 11L, 1, 1);
        detached.setMediaRefId(validMediaRef());
        when(albumPhotoMapper.selectAnyByAlbumAndPhotoIds(1L, List.of(10L, 11L)))
            .thenReturn(List.of(active, detached));
        when(albumPhotoMapper.selectByAlbumIdOrdered(1L))
            .thenReturn(List.of(active), List.of(active, detached));
        when(albumPhotoMapper.updateAssociationMetadata(1L, 101L, "旧照片", "NONE")).thenReturn(1);
        when(albumPhotoMapper.restoreAssociation(
            anyLong(), anyLong(), anyString(), anyInt(), any(), anyString()
        )).thenReturn(1);

        AlbumPhotoMutationResult result = service.attach(1L, 2, List.of(
            new AlbumPhotoAttachmentCommand(10L, " 旧照片 ", null),
            new AlbumPhotoAttachmentCommand(11L, null, PhotoDownloadModeEnum.SANITIZED)
        ));

        assertThat(result.version().version()).isEqualTo(3L);
        assertThat(result.version().etag()).isEqualTo("\"v3\"");
        verify(albumPhotoMapper).updateAssociationMetadata(1L, 101L, "旧照片", "NONE");
        ArgumentCaptor<String> ref = ArgumentCaptor.forClass(String.class);
        verify(albumPhotoMapper).restoreAssociation(
            eq(1L), eq(102L), ref.capture(), eq(1), eq(null), eq("SANITIZED")
        );
        assertThat(OpaqueMediaReference.isValid(ref.getValue())).isTrue();
        assertThat(ref.getValue()).isNotEqualTo(detached.getMediaRefId());
        verify(albumPhotoMapper, never()).insert(any(AlbumPhotoEntity.class));
    }

    @Test
    void attachesAReusablePhotoFailClosedWithoutDuplicatingThePhotoRecord() {
        prepareClaim(4);
        when(photoMapper.selectReusableByIds(List.of(12L))).thenReturn(List.of(photo(12L)));
        when(albumPhotoMapper.selectAnyByAlbumAndPhotoIds(1L, List.of(12L))).thenReturn(List.of());
        when(albumPhotoMapper.selectByAlbumIdOrdered(1L)).thenReturn(List.of(), List.of());
        when(albumPhotoMapper.insert(any(AlbumPhotoEntity.class))).thenReturn(1);

        service.attach(1L, 4, List.of(
            new AlbumPhotoAttachmentCommand(12L, null, PhotoDownloadModeEnum.NONE)
        ));

        ArgumentCaptor<AlbumPhotoEntity> association = ArgumentCaptor.forClass(AlbumPhotoEntity.class);
        verify(albumPhotoMapper).insert(association.capture());
        assertThat(association.getValue().getPhotoId()).isEqualTo(12L);
        assertThat(association.getValue().getDeliveryRevoked()).isTrue();
        assertThat(OpaqueMediaReference.isValid(association.getValue().getMediaRefId())).isTrue();
        verify(photoMapper, never()).insert(any(PhotoEntity.class));
    }

    @Test
    void rejectsUnavailablePhotoReuseAsOneAtomicBatch() {
        prepareClaim(1);
        when(photoMapper.selectReusableByIds(List.of(10L, 99L))).thenReturn(List.of(photo(10L)));

        assertThatThrownBy(() -> service.attach(1L, 1, List.of(
            new AlbumPhotoAttachmentCommand(10L, null, null),
            new AlbumPhotoAttachmentCommand(99L, null, null)
        ))).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST);
            assertThat(exception.getDetails()).containsEntry("unavailablePhotoIds", List.of(99L));
        });
        verify(albumPhotoMapper, never()).insert(any(AlbumPhotoEntity.class));
    }

    @Test
    void detachesACompleteBatchAndInvalidatesCoverEligibility() {
        prepareClaim(5);
        when(albumPhotoMapper.revokeAndDetach(1L, List.of(10L, 11L))).thenReturn(2);
        when(albumPhotoMapper.selectByAlbumIdOrdered(1L)).thenReturn(List.of());

        AlbumPhotoMutationResult result = service.detach(1L, 5, List.of(10L, 11L));

        assertThat(result.version().version()).isEqualTo(6L);
        verify(albumMapper).clearDetachedCoverAndFeatured(1L);
    }

    @Test
    void rejectsPartialDetachSoTheTransactionCanRollBack() {
        prepareClaim(5);
        when(albumPhotoMapper.revokeAndDetach(1L, List.of(10L, 11L))).thenReturn(1);

        assertThatThrownBy(() -> service.detach(1L, 5, List.of(10L, 11L)))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT));
        verify(albumMapper, never()).clearDetachedCoverAndFeatured(anyLong());
    }

    @Test
    void persistsOnlyACompleteOrderAndAssignsEveryPosition() {
        prepareClaim(7);
        AlbumPhotoEntity first = association(101L, 10L, 0, 0);
        AlbumPhotoEntity second = association(102L, 11L, 1, 0);
        when(albumPhotoMapper.selectByAlbumIdOrdered(1L))
            .thenReturn(List.of(first, second), List.of(second, first));
        when(albumPhotoMapper.updateSort(anyLong(), anyLong(), anyInt())).thenReturn(1);

        AlbumPhotoMutationResult result = service.reorder(1L, 7, List.of(11L, 10L));

        assertThat(result.version().version()).isEqualTo(8L);
        verify(albumPhotoMapper).updateSort(1L, 102L, 0);
        verify(albumPhotoMapper).updateSort(1L, 101L, 1);
        assertThat(result.photos()).containsExactly(second, first);
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.ALBUM, "alb_test");
    }

    @Test
    void rejectsAnIncompleteOrderWithoutWritingAnyPosition() {
        prepareClaim(7);
        AlbumPhotoEntity first = association(101L, 10L, 0, 0);
        AlbumPhotoEntity second = association(102L, 11L, 1, 0);
        when(albumPhotoMapper.selectByAlbumIdOrdered(1L)).thenReturn(List.of(first, second));

        assertThatThrownBy(() -> service.reorder(1L, 7, List.of(11L)))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT));
        verify(albumPhotoMapper, never()).updateSort(anyLong(), anyLong(), anyInt());
    }

    @Test
    void staleVersionReportsTheCurrentEtagSourceAndDoesNotTouchAssociations() {
        AlbumEntity stale = album(8);
        AlbumEntity current = album(9);
        when(albumMapper.selectById(1L)).thenReturn(stale, current);

        assertThatThrownBy(() -> service.reorder(1L, 7, List.of()))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails()).containsEntry("currentVersion", 9);
            });
        verify(albumMapper, never()).claimPhotoCompositionMutation(anyLong(), anyInt());
        verify(albumPhotoMapper, never()).selectByAlbumIdOrdered(anyLong());
    }

    @Test
    void everyCompositionCommandDeclaresRollbackForAtomicity() throws Exception {
        for (String method : List.of("attach", "detach", "reorder")) {
            Class<?> listElement = method.equals("attach") ? AlbumPhotoAttachmentCommand.class : Long.class;
            assertThat(listElement).isNotNull();
            Transactional annotation = AlbumPhotoCommandService.class
                .getMethod(method, long.class, int.class, List.class)
                .getAnnotation(Transactional.class);
            assertThat(annotation).isNotNull();
            assertThat(annotation.rollbackFor()).contains(Exception.class);
        }
    }

    private void prepareClaim(int version) {
        when(albumMapper.selectById(1L)).thenReturn(album(version));
        when(albumMapper.claimPhotoCompositionMutation(1L, version)).thenReturn(1);
    }

    private AlbumEntity album(int version) {
        AlbumEntity album = new AlbumEntity();
        album.setId(1L);
        album.setPublicSlug("alb_test");
        album.setLifecycleStatus("DRAFT");
        album.setDeleted(0);
        album.setVersion(version);
        return album;
    }

    private PhotoEntity photo(long id) {
        PhotoEntity photo = new PhotoEntity();
        photo.setId(id);
        photo.setDeleted(0);
        return photo;
    }

    private AlbumPhotoEntity association(long id, long photoId, int sortNum, int deleted) {
        AlbumPhotoEntity association = new AlbumPhotoEntity();
        association.setId(id);
        association.setAlbumId(1L);
        association.setPhotoId(photoId);
        association.setSortNum(sortNum);
        association.setDeleted(deleted);
        return association;
    }

    private String validMediaRef() {
        return OpaqueMediaReference.generate(new SecureRandom());
    }
}
