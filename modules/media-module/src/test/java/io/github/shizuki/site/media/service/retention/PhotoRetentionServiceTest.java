package io.github.shizuki.site.media.service.retention;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.config.PhotoRetentionProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.mapper.PhotoRetentionMapper;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.service.revocation.MediaRouteCacheInvalidator;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PhotoRetentionServiceTest {

    private static final LocalDateTime NOW = LocalDateTime.parse("2026-08-28T12:00:00");

    private PhotoRetentionMapper retentionMapper;
    private MediaAssetVariantMapper variantMapper;
    private MediaAssetMapper assetMapper;
    private MediaRouteCacheInvalidator invalidator;
    private PhotoRetentionProperties properties;
    private ObjectStorageClient storageClient;
    private PhotoRetentionRow photo;
    private PhotoRetentionService service;

    @BeforeEach
    void setUp() {
        retentionMapper = Mockito.mock(PhotoRetentionMapper.class);
        variantMapper = Mockito.mock(MediaAssetVariantMapper.class);
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        invalidator = Mockito.mock(MediaRouteCacheInvalidator.class);
        properties = new PhotoRetentionProperties();
        storageClient = Mockito.mock(ObjectStorageClient.class);
        properties.setRetentionDays(30);
        Clock clock = Clock.fixed(Instant.parse("2026-08-28T12:00:00Z"), ZoneOffset.UTC);
        service = new PhotoRetentionService(
            retentionMapper,
            variantMapper,
            assetMapper,
            invalidator,
            properties,
            storageClient,
            clock
        );
        photo = photo(null, null, 2);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        LoginUserContext.set(new LoginUser(9L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void recycleRecordsRetentionWithoutDeletingAssetsAndInvalidatesAssociationRoutes() {
        String albumRef = OpaqueMediaReference.generate(new SecureRandom());
        String momentRef = OpaqueMediaReference.generate(new SecureRandom());
        when(retentionMapper.recycle(7L, 2, NOW, NOW.plusDays(30))).thenReturn(1);
        when(retentionMapper.findAssociatedMediaRefs(7L)).thenReturn(List.of(albumRef, momentRef));

        var result = service.recycle(7L, 2);

        assertThat(result.version()).isEqualTo(3);
        assertThat(result.recycledAt()).isEqualTo(NOW);
        assertThat(result.purgeAfter()).isEqualTo(NOW.plusDays(30));
        verify(invalidator).invalidate(Mockito.argThat(paths -> paths.size() == 8));
        verify(assetMapper, never()).selectById(Mockito.anyLong());
    }

    @Test
    void restoreClearsRetentionWithoutReuploadingOrTouchingStorage() {
        photo = photo(NOW.minusDays(5), NOW.plusDays(25), 3);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.restore(7L, 3)).thenReturn(1);

        var result = service.restore(7L, 3);

        assertThat(result.version()).isEqualTo(4);
        verify(assetMapper, never()).selectById(Mockito.anyLong());
        verifyNoInteractions(variantMapper, invalidator);
    }

    @Test
    void dryRunReportsEveryRetentionReferenceAndWorkerBlockerWithoutDeleting() {
        photo = photo(NOW.minusDays(5), NOW.plusDays(25), 3);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.countNonPurgedContentReferences(7L)).thenReturn(2L);
        when(retentionMapper.countOtherPhotoOwners(7L, 42L)).thenReturn(1L);
        when(assetMapper.selectById(42L)).thenReturn(asset());
        when(variantMapper.findAllBySource(42L)).thenReturn(List.of(variant("PROCESSING"), variant("READY")));

        var result = service.dryRunPurge(7L, 3);

        assertThat(result.eligible()).isFalse();
        assertThat(result.blockers()).extracting(blocker -> blocker.code())
            .containsExactly("RETENTION_ACTIVE", "CONTENT_REFERENCES", "SHARED_ORIGINAL", "DERIVATIVE_ACTIVITY");
        assertThat(result.derivativeCount()).isEqualTo(2);
    }

    @Test
    void dryRunIsEligibleOnlyAfterRetentionAndWithNoNonPurgedReferences() {
        photo = photo(NOW.minusDays(40), NOW.minusDays(10), 4);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.countNonPurgedContentReferences(7L)).thenReturn(0L);
        when(retentionMapper.countOtherPhotoOwners(7L, 42L)).thenReturn(0L);
        when(assetMapper.selectById(42L)).thenReturn(asset());
        when(variantMapper.findAllBySource(42L)).thenReturn(List.of(variant("READY"), variant("REVOKED")));

        var result = service.dryRunPurge(7L, 4);

        assertThat(result.eligible()).isTrue();
        assertThat(result.blockers()).isEmpty();
        assertThat(result.derivativeCount()).isEqualTo(2);
    }

    @Test
    void dryRunStillBlocksNonPurgedContentReferencesAfterRetentionExpires() {
        photo = photo(NOW.minusDays(40), NOW.minusDays(10), 4);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.countNonPurgedContentReferences(7L)).thenReturn(1L);
        when(retentionMapper.countOtherPhotoOwners(7L, 42L)).thenReturn(0L);
        when(assetMapper.selectById(42L)).thenReturn(asset());
        when(variantMapper.findAllBySource(42L)).thenReturn(List.of(variant("READY")));

        var result = service.dryRunPurge(7L, 4);

        assertThat(result.eligible()).isFalse();
        assertThat(result.blockers()).singleElement().satisfies(blocker -> {
            assertThat(blocker.code()).isEqualTo("CONTENT_REFERENCES");
            assertThat(blocker.count()).isEqualTo(1L);
        });
    }

    @Test
    void purgeRechecksEligibilityAndNeverTouchesStorageWhenReferencesRemain() {
        photo = photo(NOW.minusDays(40), NOW.minusDays(10), 4);
        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.countNonPurgedContentReferences(7L)).thenReturn(1L);
        when(retentionMapper.countOtherPhotoOwners(7L, 42L)).thenReturn(0L);
        when(assetMapper.selectById(42L)).thenReturn(asset());
        when(variantMapper.findAllBySource(42L)).thenReturn(List.of());

        org.assertj.core.api.Assertions.assertThatThrownBy(() -> service.purge(7L, 4))
            .isInstanceOf(io.github.shizuki.common.core.error.BusinessException.class);

        verify(retentionMapper, never()).tombstonePurged(
            Mockito.anyLong(), Mockito.anyInt(), Mockito.any(LocalDateTime.class)
        );
        verifyNoInteractions(storageClient);
    }

    @Test
    void purgeTombstonesPhotoVariantsAndAssetsBeforeDeletingObjects() {
        photo = photo(NOW.minusDays(40), NOW.minusDays(10), 4);
        MediaAssetEntity original = asset();
        original.setBucketName("private-media");
        original.setObjectKey("photos/original.webp");
        MediaAssetEntity derivative = new MediaAssetEntity();
        derivative.setId(43L);
        derivative.setDeleted(0);
        derivative.setBucketName("private-media");
        derivative.setObjectKey("photos/display.webp");
        MediaAssetVariantEntity variant = variant("READY");
        variant.setId(100L);
        variant.setSourceAssetId(42L);
        variant.setVariantAssetId(43L);

        when(retentionMapper.findManagedById(7L)).thenReturn(photo);
        when(retentionMapper.countNonPurgedContentReferences(7L)).thenReturn(0L);
        when(retentionMapper.countOtherPhotoOwners(7L, 42L)).thenReturn(0L);
        when(assetMapper.selectById(42L)).thenReturn(original);
        when(assetMapper.selectById(43L)).thenReturn(derivative);
        when(variantMapper.findAllBySource(42L)).thenReturn(List.of(variant));
        when(retentionMapper.tombstonePurged(7L, 4, NOW)).thenReturn(1);
        when(assetMapper.tombstonePurgedAsset(42L, NOW)).thenReturn(1);
        when(assetMapper.tombstonePurgedAsset(43L, NOW)).thenReturn(1);

        var result = service.purge(7L, 4);

        assertThat(result.version()).isEqualTo(5L);
        verify(variantMapper).tombstoneBySource(42L, NOW);
        verify(storageClient).deleteObject("private-media", "photos/original.webp");
        verify(storageClient).deleteObject("private-media", "photos/display.webp");
    }

    private PhotoRetentionRow photo(LocalDateTime recycledAt, LocalDateTime purgeAfter, int version) {
        PhotoRetentionRow row = new PhotoRetentionRow();
        row.setPhotoId(7L);
        row.setOriginalAssetId(42L);
        row.setRecycleTime(recycledAt);
        row.setPurgeAfter(purgeAfter);
        row.setVersion(version);
        return row;
    }

    private MediaAssetEntity asset() {
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setId(42L);
        asset.setDeleted(0);
        return asset;
    }

    private MediaAssetVariantEntity variant(String status) {
        MediaAssetVariantEntity variant = new MediaAssetVariantEntity();
        variant.setProcessStatus(status);
        return variant;
    }
}
