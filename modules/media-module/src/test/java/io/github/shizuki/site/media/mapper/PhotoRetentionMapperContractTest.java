package io.github.shizuki.site.media.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;

class PhotoRetentionMapperContractTest {

    @Test
    void recycleAndRestoreUseOptimisticVersionAndNeverTombstone() throws Exception {
        Method recycle = PhotoRetentionMapper.class.getMethod(
            "recycle",
            Long.class,
            int.class,
            LocalDateTime.class,
            LocalDateTime.class
        );
        Method restore = PhotoRetentionMapper.class.getMethod("restore", Long.class, int.class);
        String recycleSql = String.join(" ", recycle.getAnnotation(Update.class).value());
        String restoreSql = String.join(" ", restore.getAnnotation(Update.class).value());

        assertThat(recycleSql)
            .contains("recycle_time = #{recycledAt}", "purge_after = #{purgeAfter}")
            .contains("version_num = #{expectedVersion}", "recycle_time IS NULL")
            .doesNotContain("deleted_flag = 1");
        assertThat(restoreSql)
            .contains("recycle_time = NULL", "purge_after = NULL")
            .contains("version_num = #{expectedVersion}", "recycle_time IS NOT NULL")
            .doesNotContain("deleted_flag = 1");
    }

    @Test
    void purgeReferenceCountIncludesRecycledButNonPurgedParentContent() throws Exception {
        Method method = PhotoRetentionMapper.class.getMethod("countNonPurgedContentReferences", Long.class);
        String sql = String.join(" ", method.getAnnotation(Select.class).value());

        assertThat(sql)
            .contains("CTN_ALBUM_PHOTO", "CTN_MOMENT_PHOTO")
            .contains("a.deleted_flag = 0", "m.deleted_flag = 0")
            .contains("ap.deleted_flag = 0", "mp.deleted_flag = 0")
            .doesNotContain("lifecycle_status = 'PUBLISHED'");
    }

    @Test
    void sharedOriginalOwnerCountTreatsEveryNonPurgedPhotoAsABlocker() throws Exception {
        Method method = PhotoRetentionMapper.class.getMethod(
            "countOtherPhotoOwners",
            Long.class,
            Long.class
        );
        String sql = String.join(" ", method.getAnnotation(Select.class).value());

        assertThat(sql)
            .contains("original_asset_id = #{originalAssetId}")
            .contains("id <> #{photoId}")
            .contains("deleted_flag = 0")
            .doesNotContain("recycle_time IS NULL");
    }

    @Test
    void finalTombstoneRechecksRetentionReferencesAndDerivativeActivityAtomically() throws Exception {
        Method method = PhotoRetentionMapper.class.getMethod(
            "tombstonePurged",
            Long.class,
            int.class,
            LocalDateTime.class
        );
        String sql = String.join(" ", method.getAnnotation(Update.class).value());

        assertThat(sql)
            .contains("version_num = #{expectedVersion}")
            .contains("purge_after <= #{purgedAt}")
            .contains("NOT EXISTS")
            .contains("CTN_ALBUM_PHOTO", "CTN_MOMENT_PHOTO", "MDA_ASSET_VARIANT")
            .contains("'PROCESSING'", "'REVOKING'")
            .contains("deleted_flag = 1");
    }
}
