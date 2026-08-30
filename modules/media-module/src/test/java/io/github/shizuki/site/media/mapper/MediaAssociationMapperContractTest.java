package io.github.shizuki.site.media.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;

class MediaAssociationMapperContractTest {

    @Test
    void resolvesTheAssociationRatherThanAuthorizingBySharedAssetAlone() throws Exception {
        Method method = MediaAssociationMapper.class.getMethod("findByMediaRef", String.class);
        String sql = String.join(" ", method.getAnnotation(Select.class).value());

        assertThat(sql)
            .contains("CTN_ALBUM_PHOTO", "CTN_MOMENT_PHOTO")
            .contains("ap.media_ref_id = #{mediaRef}", "mp.media_ref_id = #{mediaRef}")
            .contains("ap.delivery_revoked_flag AS delivery_revoked")
            .contains("mp.delivery_revoked_flag AS delivery_revoked")
            .contains("JOIN CTN_ALBUM", "JOIN CTN_MOMENT", "JOIN CTN_PHOTO")
            .contains("a.deleted_flag = 0", "m.deleted_flag = 0", "p.deleted_flag = 0")
            .contains("p.recycle_time IS NULL")
            .contains("LIMIT 2");
    }

    @Test
    void countsOnlyOtherCurrentlyEligiblePublicAssociations() throws Exception {
        Method method = MediaAssociationMapper.class.getMethod(
            "countOtherEligiblePublicAssociations",
            Long.class,
            String.class,
            Long.class
        );
        String sql = String.join(" ", method.getAnnotation(Select.class).value());

        assertThat(sql)
            .contains("ap.delivery_revoked_flag = 0", "mp.delivery_revoked_flag = 0")
            .contains("lifecycle_status = 'PUBLISHED'", "visibility_status = 'PUBLIC'")
            .contains("processing_status = 'READY'")
            .contains("NOT (association_type = #{excludedType} AND association_id = #{excludedId})");
    }

    @Test
    void downloadPolicyUpdateIsAssociationAndVersionScoped() throws Exception {
        Method method = MediaAssociationMapper.class.getMethod(
            "updateAlbumDownloadMode",
            Long.class,
            int.class,
            String.class
        );
        String sql = String.join(" ", method.getAnnotation(Update.class).value());

        assertThat(sql)
            .contains("UPDATE CTN_ALBUM_PHOTO")
            .contains("download_mode = #{downloadMode}")
            .contains("id = #{associationId}")
            .contains("version_num = #{expectedVersion}")
            .contains("version_num = version_num + 1")
            .doesNotContain("photo_id = #{associationId}");
    }
}
