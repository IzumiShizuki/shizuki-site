package io.github.shizuki.site.content.service.moment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.cache.PublicContentCacheInvalidator;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.life.LifeContentLifecycleService;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaRow;
import io.github.shizuki.site.content.mapper.MomentMapper;
import io.github.shizuki.site.content.mapper.MomentPhotoMapper;
import io.github.shizuki.site.content.mapper.MomentPublicationMediaMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MomentServiceTest {

    private static final Instant NOW = Instant.parse("2026-08-28T05:00:00Z");

    @Mock
    private MomentMapper momentMapper;
    @Mock
    private MomentPhotoMapper momentPhotoMapper;
    @Mock
    private MomentPublicationMediaMapper publicationMediaMapper;
    @Mock
    private PhotoMapper photoMapper;
    @Mock
    private OpaquePublicIdentifierGenerator identifierGenerator;
    @Mock
    private PublicContentCacheInvalidator cacheInvalidator;

    private MomentService service;

    @BeforeEach
    void setUp() {
        service = new MomentService(
            momentMapper,
            momentPhotoMapper,
            publicationMediaMapper,
            photoMapper,
            identifierGenerator,
            new LifeContentLifecycleService(),
            cacheInvalidator,
            Duration.ofDays(30),
            "v1",
            Clock.fixed(NOW, ZoneOffset.UTC),
            new SecureRandom()
        );
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void createsPrivateDraftWithOpaqueMomentIdentity() {
        when(identifierGenerator.generate(PublicContentType.MOMENT)).thenReturn("mom_opaque");
        when(momentMapper.insert(any(MomentEntity.class))).thenAnswer(invocation -> {
            MomentEntity entity = invocation.getArgument(0);
            entity.setId(41L);
            return 1;
        });

        MomentEntity result = service.createDraft("  今晚的风很轻。  ", null);

        assertThat(result.getId()).isEqualTo(41L);
        assertThat(result.getBody()).isEqualTo("今晚的风很轻。");
        assertThat(result.getLifecycleStatus()).isEqualTo("DRAFT");
        assertThat(result.getVisibilityStatus()).isEqualTo("PRIVATE");
    }

    @Test
    void editsPublishedVisibilityAndRevokesPrivateDelivery() {
        MomentEntity moment = moment(LifeContentLifecycleEnum.PUBLISHED, LifeContentVisibilityEnum.PUBLIC, 2);
        when(momentMapper.selectById(1L)).thenReturn(moment);
        when(momentMapper.updateEditorial(1L, 2, "新的正文", "PRIVATE", 1, 0)).thenReturn(1);

        var result = service.edit(1L, 2, " 新的正文 ", LifeContentVisibilityEnum.PRIVATE, true, false);

        assertThat(result.version()).isEqualTo(3L);
        verify(momentPhotoMapper).updateDeliveryRevoked(1L, 1);
    }

    @Test
    void attachesManagedPhotosWithoutDuplicatingOriginals() {
        preparePhotoClaim(3);
        PhotoEntity firstPhoto = photo(10L);
        PhotoEntity secondPhoto = photo(11L);
        when(photoMapper.selectReusableByIds(List.of(10L, 11L))).thenReturn(List.of(firstPhoto, secondPhoto));
        MomentPhotoEntity existing = association(101L, 10L, 0);
        existing.setMediaRefId(validMediaRef());
        when(momentPhotoMapper.selectAnyByMomentAndPhotoIds(1L, List.of(10L, 11L)))
            .thenReturn(List.of(existing));
        when(momentPhotoMapper.selectByMomentIdOrdered(1L)).thenReturn(List.of(existing), List.of(existing));
        when(momentPhotoMapper.insert(any(MomentPhotoEntity.class))).thenReturn(1);

        MomentPhotoMutationResult result = service.attachPhotos(1L, 3, List.of(10L, 11L));

        assertThat(result.version().version()).isEqualTo(4L);
        ArgumentCaptor<MomentPhotoEntity> inserted = ArgumentCaptor.forClass(MomentPhotoEntity.class);
        verify(momentPhotoMapper).insert(inserted.capture());
        assertThat(inserted.getValue().getPhotoId()).isEqualTo(11L);
        assertThat(inserted.getValue().getSortNum()).isEqualTo(1);
        assertThat(inserted.getValue().getDeliveryRevoked()).isTrue();
        assertThat(OpaqueMediaReference.isValid(inserted.getValue().getMediaRefId())).isTrue();
        verify(photoMapper, never()).insert(any(PhotoEntity.class));
    }

    @Test
    void detachesOnlyTheCompleteRequestedPhotoSetAndRevokesDelivery() {
        preparePhotoClaim(4);
        when(momentPhotoMapper.revokeAndDetach(1L, List.of(10L, 11L))).thenReturn(2);
        when(momentPhotoMapper.selectByMomentIdOrdered(1L)).thenReturn(List.of());

        MomentPhotoMutationResult result = service.detachPhotos(1L, 4, List.of(10L, 11L));

        assertThat(result.version().etag()).isEqualTo("\"v5\"");
        verify(momentPhotoMapper).revokeAndDetach(1L, List.of(10L, 11L));
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.MOMENT, "mom_test");
    }

    @Test
    void rejectsIncompleteReorderWithoutWritingAPartialOrder() {
        preparePhotoClaim(4);
        MomentPhotoEntity first = association(101L, 10L, 0);
        MomentPhotoEntity second = association(102L, 11L, 1);
        when(momentPhotoMapper.selectByMomentIdOrdered(1L)).thenReturn(List.of(first, second));

        assertThatThrownBy(() -> service.reorderPhotos(1L, 4, List.of(11L)))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT));
        verify(momentPhotoMapper, never()).updateSort(anyLong(), anyLong(), anyInt());
    }

    @Test
    void staleReorderReturnsCurrentVersionWithoutWritingAnyPosition() {
        when(momentMapper.selectById(1L)).thenReturn(moment(
            LifeContentLifecycleEnum.DRAFT,
            LifeContentVisibilityEnum.PRIVATE,
            9
        ));

        assertThatThrownBy(() -> service.reorderPhotos(1L, 4, List.of(11L, 10L)))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails()).containsEntry("currentVersion", 9);
            });
        verify(momentMapper, never()).claimPhotoCompositionMutation(anyLong(), anyInt());
        verify(momentPhotoMapper, never()).updateSort(anyLong(), anyLong(), anyInt());
    }

    @Test
    void atomicallyAssignsEverySubmittedMomentPhotoPosition() {
        preparePhotoClaim(4);
        MomentPhotoEntity first = association(101L, 10L, 0);
        MomentPhotoEntity second = association(102L, 11L, 1);
        when(momentPhotoMapper.selectByMomentIdOrdered(1L))
            .thenReturn(List.of(first, second), List.of(second, first));
        when(momentPhotoMapper.updateSort(anyLong(), anyLong(), anyInt())).thenReturn(1);

        MomentPhotoMutationResult result = service.reorderPhotos(1L, 4, List.of(11L, 10L));

        verify(momentPhotoMapper).updateSort(1L, 102L, 0);
        verify(momentPhotoMapper).updateSort(1L, 101L, 1);
        assertThat(result.photos()).containsExactly(second, first);
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.MOMENT, "mom_test");
    }

    @Test
    void identifiesTheFirstBlockingPhotoBeforePublication() {
        MomentEntity moment = moment(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.PUBLIC, 5);
        when(momentMapper.selectById(1L)).thenReturn(moment);
        AlbumPublicationMediaRow blocker = new AlbumPublicationMediaRow();
        blocker.setPhotoId(22L);
        blocker.setVariantCode("DISPLAY_WEBP");
        when(publicationMediaMapper.selectPublicationBlockers(anyLong(), anyString(), anyString(), anyList()))
            .thenReturn(List.of(blocker));

        assertThatThrownBy(() -> service.publish(1L, 5))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.MEDIA_NOT_READY);
                assertThat(exception.getDetails()).containsEntry("photoId", 22L);
            });
        verify(momentMapper, never()).updateLifecycle(
            anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()
        );
    }

    @Test
    void publishesTextOnlyOrReadyMomentAndEnablesPublicDelivery() {
        MomentEntity moment = moment(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.PUBLIC, 6);
        when(momentMapper.selectById(1L)).thenReturn(moment);
        when(publicationMediaMapper.selectPublicationBlockers(
            eq(1L), eq("PUBLIC_MATERIALIZED"), eq("v1"), anyList()
        )).thenReturn(List.of());
        when(momentMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        var result = service.publish(1L, 6);

        assertThat(result.version()).isEqualTo(7L);
        verify(momentMapper).updateLifecycle(
            1L,
            6,
            "DRAFT",
            "PUBLISHED",
            LocalDateTime.ofInstant(NOW, ZoneOffset.UTC),
            null,
            null,
            null
        );
        verify(momentPhotoMapper).updateDeliveryRevoked(1L, 0);
    }

    @Test
    void archiveWithdrawsPublishedMomentRevokesDeliveryAndInvalidatesCaches() {
        MomentEntity published = moment(LifeContentLifecycleEnum.PUBLISHED, LifeContentVisibilityEnum.PUBLIC, 7);
        when(momentMapper.selectById(1L)).thenReturn(published);
        when(momentMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        var result = service.archive(1L, 7);

        assertThat(result.version()).isEqualTo(8L);
        verify(momentMapper).updateLifecycle(1L, 7, "PUBLISHED", "ARCHIVED", null, null, null, null);
        verify(momentPhotoMapper).updateDeliveryRevoked(1L, 1);
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.MOMENT, "mom_test");
    }

    @Test
    void recycledPublishedMomentRestoresArchivedWithoutVisitorDelivery() {
        MomentEntity published = moment(LifeContentLifecycleEnum.PUBLISHED, LifeContentVisibilityEnum.PUBLIC, 7);
        when(momentMapper.selectById(1L)).thenReturn(published);
        when(momentMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        service.recycle(1L, 7);

        verify(momentMapper).updateLifecycle(
            1L,
            7,
            "PUBLISHED",
            "RECYCLED",
            null,
            "ARCHIVED",
            LocalDateTime.ofInstant(NOW, ZoneOffset.UTC),
            LocalDateTime.ofInstant(NOW.plus(Duration.ofDays(30)), ZoneOffset.UTC)
        );

        MomentEntity recycled = moment(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PUBLIC, 8);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW, ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.plus(Duration.ofDays(30)), ZoneOffset.UTC));
        when(momentMapper.selectById(1L)).thenReturn(recycled);

        service.restore(1L, 8);

        verify(momentMapper).updateLifecycle(1L, 8, "RECYCLED", "ARCHIVED", null, null, null, null);
        verify(momentPhotoMapper, times(2)).updateDeliveryRevoked(1L, 1);
    }

    @Test
    void requiresAdminGroupAndScopedPermissionForDestructiveCommands() {
        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("life.content.manage")));

        assertThatThrownBy(() -> service.recycle(1L, 0))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
        verify(momentMapper, never()).selectById(anyLong());
    }

    @Test
    void purgesOnlyAfterRetentionAndTombstonesCompositionAtomically() {
        MomentEntity recycled = moment(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PRIVATE, 9);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(31)), ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(1)), ZoneOffset.UTC));
        when(momentMapper.selectById(1L)).thenReturn(recycled);
        when(momentMapper.tombstonePurged(1L, 9, LocalDateTime.ofInstant(NOW, ZoneOffset.UTC))).thenReturn(1);

        var result = service.purge(1L, 9);

        assertThat(result.version()).isEqualTo(10L);
        verify(momentPhotoMapper).tombstoneByMomentId(1L);
        verify(momentMapper).tombstonePurged(1L, 9, LocalDateTime.ofInstant(NOW, ZoneOffset.UTC));
    }

    @Test
    void dryRunReportsActiveRetentionWithoutMutatingTheMoment() {
        MomentEntity recycled = moment(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PRIVATE, 9);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(1)), ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.plus(Duration.ofDays(29)), ZoneOffset.UTC));
        when(momentMapper.selectById(1L)).thenReturn(recycled);

        var readiness = service.dryRunPurge(1L, 9);

        assertThat(readiness.eligible()).isFalse();
        assertThat(readiness.blockers()).singleElement().satisfies(blocker ->
            assertThat(blocker.code()).isEqualTo("RETENTION_ACTIVE")
        );
        verify(momentMapper, never()).tombstonePurged(anyLong(), anyInt(), any());
    }

    private void preparePhotoClaim(int version) {
        when(momentMapper.selectById(1L)).thenReturn(moment(
            LifeContentLifecycleEnum.DRAFT,
            LifeContentVisibilityEnum.PRIVATE,
            version
        ));
        when(momentMapper.claimPhotoCompositionMutation(1L, version)).thenReturn(1);
    }

    private MomentEntity moment(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility,
        int version
    ) {
        MomentEntity moment = new MomentEntity();
        moment.setId(1L);
        moment.setPublicId("mom_test");
        moment.setBody("正文");
        moment.setLifecycleStatus(lifecycle.name());
        moment.setVisibilityStatus(visibility.name());
        moment.setDeleted(0);
        moment.setVersion(version);
        return moment;
    }

    private PhotoEntity photo(long id) {
        PhotoEntity photo = new PhotoEntity();
        photo.setId(id);
        photo.setDeleted(0);
        return photo;
    }

    private MomentPhotoEntity association(long id, long photoId, int sortNum) {
        MomentPhotoEntity association = new MomentPhotoEntity();
        association.setId(id);
        association.setMomentId(1L);
        association.setPhotoId(photoId);
        association.setSortNum(sortNum);
        association.setDeleted(0);
        return association;
    }

    private String validMediaRef() {
        return OpaqueMediaReference.generate(new SecureRandom());
    }
}
