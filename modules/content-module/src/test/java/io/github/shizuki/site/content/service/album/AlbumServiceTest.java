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
import io.github.shizuki.site.content.life.LifeContentLifecycleService;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaMapper;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AlbumServiceTest {

    private static final Instant NOW = Instant.parse("2026-08-28T03:00:00Z");

    @Mock
    private AlbumMapper albumMapper;
    @Mock
    private AlbumPhotoMapper albumPhotoMapper;
    @Mock
    private AlbumPublicationMediaMapper publicationMediaMapper;
    @Mock
    private OpaquePublicIdentifierGenerator identifierGenerator;
    @Mock
    private PublicContentCacheInvalidator cacheInvalidator;

    private AlbumService service;

    @BeforeEach
    void setUp() {
        service = new AlbumService(
            albumMapper,
            albumPhotoMapper,
            publicationMediaMapper,
            identifierGenerator,
            new LifeContentLifecycleService(),
            cacheInvalidator,
            Duration.ofDays(30),
            "v1",
            Clock.fixed(NOW, ZoneOffset.UTC)
        );
        LoginUserContext.set(new LoginUser(
            7L,
            Set.of("ADMIN"),
            Set.of("life.content.manage")
        ));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void createsPrivateDraftWithOpaqueIdentifier() {
        when(identifierGenerator.generate(PublicContentType.ALBUM)).thenReturn("alb_opaque");
        when(albumMapper.insert(any(AlbumEntity.class))).thenAnswer(invocation -> {
            AlbumEntity entity = invocation.getArgument(0);
            entity.setId(41L);
            return 1;
        });

        AlbumEntity created = service.createDraft("  夏日记忆  ", "  海边  ", null);

        assertThat(created.getId()).isEqualTo(41L);
        assertThat(created.getTitle()).isEqualTo("夏日记忆");
        assertThat(created.getSummary()).isEqualTo("海边");
        assertThat(created.getLifecycleStatus()).isEqualTo("DRAFT");
        assertThat(created.getVisibilityStatus()).isEqualTo("PRIVATE");
        assertThat(created.getVersion()).isZero();
    }

    @Test
    void requiresAdminGroupAndScopedPermissionBeforeMutation() {
        LoginUserContext.set(new LoginUser(8L, Set.of("USER"), Set.of("life.content.manage")));

        assertThatThrownBy(() -> service.createDraft("title", null, LifeContentVisibilityEnum.PUBLIC))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
        verify(albumMapper, never()).insert(any(AlbumEntity.class));
    }

    @Test
    void selectsOnlyAnAttachedPhotoAsCover() {
        AlbumEntity album = album(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.PRIVATE, 2);
        when(albumMapper.selectById(1L)).thenReturn(album);
        when(albumPhotoMapper.existsActiveAssociation(1L, 99L)).thenReturn(false);

        assertThatThrownBy(() -> service.selectCover(1L, 2, 99L))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        verify(albumMapper, never()).updateCover(anyLong(), anyInt(), anyLong());
    }

    @Test
    void blocksPublicationUntilCoverAndRequiredApprovedVariantsAreReady() {
        AlbumEntity album = album(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.PUBLIC, 3);
        album.setCoverPhotoId(91L);
        when(albumMapper.selectById(1L)).thenReturn(album);
        when(albumPhotoMapper.existsActiveAssociation(1L, 91L)).thenReturn(true);
        AlbumPublicationMediaRow blocker = new AlbumPublicationMediaRow();
        blocker.setPhotoId(92L);
        blocker.setVariantCode("DISPLAY_WEBP");
        when(publicationMediaMapper.selectPublicationBlockers(anyLong(), anyString(), anyString(), anyList()))
            .thenReturn(List.of(blocker));

        assertThatThrownBy(() -> service.publish(1L, 3))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.MEDIA_NOT_READY);
                assertThat(exception.getDetails()).containsEntry("photoId", 92L);
            });
        verify(albumMapper, never()).updateLifecycle(
            anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()
        );
    }

    @Test
    void publishesOnlyAfterMediaGateAndEnablesPublicAssociationDelivery() {
        AlbumEntity album = album(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.PUBLIC, 4);
        album.setCoverPhotoId(91L);
        when(albumMapper.selectById(1L)).thenReturn(album);
        when(albumPhotoMapper.existsActiveAssociation(1L, 91L)).thenReturn(true);
        when(publicationMediaMapper.selectPublicationBlockers(anyLong(), anyString(), anyString(), anyList()))
            .thenReturn(List.of());
        when(albumMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        var result = service.publish(1L, 4);

        assertThat(result.version()).isEqualTo(5L);
        verify(albumMapper).updateLifecycle(
            1L,
            4,
            "DRAFT",
            "PUBLISHED",
            LocalDateTime.ofInstant(NOW, ZoneOffset.UTC),
            null,
            null,
            null
        );
        verify(albumPhotoMapper).updateDeliveryRevoked(1L, 0);
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.ALBUM, "alb_test");
    }

    @Test
    void unlistedPublicationUsesPrivateDerivativesButKeepsCapabilityDeliveryEnabled() {
        AlbumEntity album = album(LifeContentLifecycleEnum.DRAFT, LifeContentVisibilityEnum.UNLISTED, 4);
        album.setCoverPhotoId(91L);
        when(albumMapper.selectById(1L)).thenReturn(album);
        when(albumPhotoMapper.existsActiveAssociation(1L, 91L)).thenReturn(true);
        when(publicationMediaMapper.selectPublicationBlockers(
            eq(1L), eq("PRIVATE_WORKING"), eq("v1"), anyList()
        )).thenReturn(List.of());
        when(albumMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        service.publish(1L, 4);

        verify(publicationMediaMapper).selectPublicationBlockers(
            eq(1L), eq("PRIVATE_WORKING"), eq("v1"), anyList()
        );
        verify(albumPhotoMapper).updateDeliveryRevoked(1L, 0);
    }

    @Test
    void archiveWithdrawsPublishedAlbumRevokesDeliveryAndInvalidatesCaches() {
        AlbumEntity published = album(LifeContentLifecycleEnum.PUBLISHED, LifeContentVisibilityEnum.PUBLIC, 5);
        when(albumMapper.selectById(1L)).thenReturn(published);
        when(albumMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        var result = service.archive(1L, 5);

        assertThat(result.version()).isEqualTo(6L);
        verify(albumMapper).updateLifecycle(1L, 5, "PUBLISHED", "ARCHIVED", null, null, null, null);
        verify(albumPhotoMapper).updateDeliveryRevoked(1L, 1);
        verify(cacheInvalidator).invalidateContentAfterCommit(PublicContentType.ALBUM, "alb_test");
    }

    @Test
    void recycleAndRestoreKeepPublishedAlbumArchivedAndDeliveryRevoked() {
        AlbumEntity published = album(LifeContentLifecycleEnum.PUBLISHED, LifeContentVisibilityEnum.PUBLIC, 5);
        when(albumMapper.selectById(1L)).thenReturn(published);
        when(albumMapper.updateLifecycle(anyLong(), anyInt(), anyString(), anyString(), any(), any(), any(), any()))
            .thenReturn(1);

        service.recycle(1L, 5);

        verify(albumMapper).updateLifecycle(
            1L,
            5,
            "PUBLISHED",
            "RECYCLED",
            null,
            "ARCHIVED",
            LocalDateTime.ofInstant(NOW, ZoneOffset.UTC),
            LocalDateTime.ofInstant(NOW.plus(Duration.ofDays(30)), ZoneOffset.UTC)
        );
        verify(albumPhotoMapper).updateDeliveryRevoked(1L, 1);

        AlbumEntity recycled = album(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PUBLIC, 6);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW, ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.plus(Duration.ofDays(30)), ZoneOffset.UTC));
        when(albumMapper.selectById(1L)).thenReturn(recycled);

        service.restore(1L, 6);

        verify(albumMapper).updateLifecycle(1L, 6, "RECYCLED", "ARCHIVED", null, null, null, null);
    }

    @Test
    void purgeRequiresExpiredRetentionAndTombstonesAssociationsAtomically() {
        AlbumEntity recycled = album(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PRIVATE, 7);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(31)), ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(1)), ZoneOffset.UTC));
        when(albumMapper.selectById(1L)).thenReturn(recycled);
        when(albumMapper.tombstonePurged(1L, 7, LocalDateTime.ofInstant(NOW, ZoneOffset.UTC))).thenReturn(1);

        var result = service.purge(1L, 7);

        assertThat(result.version()).isEqualTo(8L);
        verify(albumPhotoMapper).tombstoneByAlbumId(1L);
        verify(albumMapper).tombstonePurged(1L, 7, LocalDateTime.ofInstant(NOW, ZoneOffset.UTC));
    }

    @Test
    void dryRunIssuesEligibilityFactsWithoutMutatingTheAlbum() {
        AlbumEntity recycled = album(LifeContentLifecycleEnum.RECYCLED, LifeContentVisibilityEnum.PRIVATE, 7);
        recycled.setRestoreLifecycleStatus("ARCHIVED");
        recycled.setRecycleTime(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(31)), ZoneOffset.UTC));
        recycled.setPurgeAfter(LocalDateTime.ofInstant(NOW.minus(Duration.ofDays(1)), ZoneOffset.UTC));
        when(albumMapper.selectById(1L)).thenReturn(recycled);

        var readiness = service.dryRunPurge(1L, 7);

        assertThat(readiness.eligible()).isTrue();
        assertThat(readiness.blockers()).isEmpty();
        verify(albumMapper, never()).tombstonePurged(anyLong(), anyInt(), any());
    }

    private AlbumEntity album(
        LifeContentLifecycleEnum lifecycle,
        LifeContentVisibilityEnum visibility,
        int version
    ) {
        AlbumEntity album = new AlbumEntity();
        album.setId(1L);
        album.setPublicSlug("alb_test");
        album.setTitle("album");
        album.setLifecycleStatus(lifecycle.name());
        album.setVisibilityStatus(visibility.name());
        album.setDeleted(0);
        album.setVersion(version);
        return album;
    }
}
