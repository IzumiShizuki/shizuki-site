package io.github.shizuki.site.media.mapper;

import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 按 opaque mediaRef 读取具体内容关联，避免把共享资产 ID 当作授权边界。
 */
@Mapper
public interface MediaAssociationMapper {

    @Select("""
        SELECT 'ALBUM' AS association_type,
               ap.id AS association_id,
               ap.media_ref_id AS media_ref,
               ap.photo_id,
               p.original_asset_id AS source_asset_id,
               p.alt_text,
               p.processing_status,
               a.lifecycle_status,
               a.visibility_status,
               a.version_num AS content_version,
               ap.version_num AS association_version,
               ap.download_mode,
               ap.delivery_revoked_flag AS delivery_revoked
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_ALBUM a ON a.id = ap.album_id AND a.deleted_flag = 0
        JOIN CTN_PHOTO p ON p.id = ap.photo_id AND p.deleted_flag = 0
        WHERE ap.media_ref_id = #{mediaRef}
          AND ap.deleted_flag = 0
          AND p.recycle_time IS NULL
        UNION ALL
        SELECT 'MOMENT' AS association_type,
               mp.id AS association_id,
               mp.media_ref_id AS media_ref,
               mp.photo_id,
               p.original_asset_id AS source_asset_id,
               p.alt_text,
               p.processing_status,
               m.lifecycle_status,
               m.visibility_status,
               m.version_num AS content_version,
               mp.version_num AS association_version,
               'NONE' AS download_mode,
               mp.delivery_revoked_flag AS delivery_revoked
        FROM CTN_MOMENT_PHOTO mp
        JOIN CTN_MOMENT m ON m.id = mp.moment_id AND m.deleted_flag = 0
        JOIN CTN_PHOTO p ON p.id = mp.photo_id AND p.deleted_flag = 0
        WHERE mp.media_ref_id = #{mediaRef}
          AND mp.deleted_flag = 0
          AND p.recycle_time IS NULL
        LIMIT 2
        """)
    List<MediaAssociationRow> findByMediaRef(@Param("mediaRef") String mediaRef);

    @Select("""
        SELECT COUNT(1)
        FROM (
            SELECT 'ALBUM' AS association_type, ap.id AS association_id
            FROM CTN_ALBUM_PHOTO ap
            JOIN CTN_ALBUM a ON a.id = ap.album_id AND a.deleted_flag = 0
            JOIN CTN_PHOTO p ON p.id = ap.photo_id AND p.deleted_flag = 0
            WHERE p.original_asset_id = #{sourceAssetId}
              AND ap.deleted_flag = 0
              AND ap.delivery_revoked_flag = 0
              AND a.lifecycle_status = 'PUBLISHED'
              AND a.visibility_status = 'PUBLIC'
              AND p.processing_status = 'READY'
              AND p.recycle_time IS NULL
            UNION ALL
            SELECT 'MOMENT' AS association_type, mp.id AS association_id
            FROM CTN_MOMENT_PHOTO mp
            JOIN CTN_MOMENT m ON m.id = mp.moment_id AND m.deleted_flag = 0
            JOIN CTN_PHOTO p ON p.id = mp.photo_id AND p.deleted_flag = 0
            WHERE p.original_asset_id = #{sourceAssetId}
              AND mp.deleted_flag = 0
              AND mp.delivery_revoked_flag = 0
              AND m.lifecycle_status = 'PUBLISHED'
              AND m.visibility_status = 'PUBLIC'
              AND p.processing_status = 'READY'
              AND p.recycle_time IS NULL
        ) eligible
        WHERE NOT (association_type = #{excludedType} AND association_id = #{excludedId})
        """)
    long countOtherEligiblePublicAssociations(@Param("sourceAssetId") Long sourceAssetId,
                                               @Param("excludedType") String excludedType,
                                               @Param("excludedId") Long excludedId);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND version_num = #{expectedVersion}
          AND delivery_revoked_flag = 0
          AND deleted_flag = 0
        """)
    int revokeAlbumDelivery(@Param("associationId") Long associationId,
                            @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_MOMENT_PHOTO
        SET delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND version_num = #{expectedVersion}
          AND delivery_revoked_flag = 0
          AND deleted_flag = 0
        """)
    int revokeMomentDelivery(@Param("associationId") Long associationId,
                             @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET download_mode = #{downloadMode},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int updateAlbumDownloadMode(@Param("associationId") Long associationId,
                                @Param("expectedVersion") int expectedVersion,
                                @Param("downloadMode") String downloadMode);
}
