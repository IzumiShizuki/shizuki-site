package io.github.shizuki.site.media.mapper;

import io.github.shizuki.site.media.service.retention.PhotoRetentionRow;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PhotoRetentionMapper {

    @Select("""
        SELECT id AS photo_id,
               original_asset_id,
               recycle_time,
               purge_after,
               version_num AS version
        FROM CTN_PHOTO
        WHERE id = #{photoId}
          AND deleted_flag = 0
        LIMIT 1
        """)
    PhotoRetentionRow findManagedById(@Param("photoId") Long photoId);

    @Update("""
        UPDATE CTN_PHOTO
        SET recycle_time = #{recycledAt},
            purge_after = #{purgeAfter},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{photoId}
          AND version_num = #{expectedVersion}
          AND recycle_time IS NULL
          AND deleted_flag = 0
        """)
    int recycle(@Param("photoId") Long photoId,
                @Param("expectedVersion") int expectedVersion,
                @Param("recycledAt") LocalDateTime recycledAt,
                @Param("purgeAfter") LocalDateTime purgeAfter);

    @Update("""
        UPDATE CTN_PHOTO
        SET recycle_time = NULL,
            purge_after = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{photoId}
          AND version_num = #{expectedVersion}
          AND recycle_time IS NOT NULL
          AND deleted_flag = 0
        """)
    int restore(@Param("photoId") Long photoId, @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_PHOTO
        SET deleted_flag = 1,
            update_time = #{purgedAt},
            version_num = version_num + 1
        WHERE id = #{photoId}
          AND version_num = #{expectedVersion}
          AND recycle_time IS NOT NULL
          AND purge_after IS NOT NULL
          AND purge_after <= #{purgedAt}
          AND deleted_flag = 0
          AND NOT EXISTS (
            SELECT 1
            FROM CTN_ALBUM_PHOTO ap
            JOIN CTN_ALBUM a ON a.id = ap.album_id AND a.deleted_flag = 0
            WHERE ap.photo_id = CTN_PHOTO.id
              AND ap.deleted_flag = 0
          )
          AND NOT EXISTS (
            SELECT 1
            FROM CTN_MOMENT_PHOTO mp
            JOIN CTN_MOMENT m ON m.id = mp.moment_id AND m.deleted_flag = 0
            WHERE mp.photo_id = CTN_PHOTO.id
              AND mp.deleted_flag = 0
          )
          AND NOT EXISTS (
            SELECT 1
            FROM MDA_ASSET_VARIANT variant
            WHERE variant.source_asset_id = CTN_PHOTO.original_asset_id
              AND variant.process_status IN ('PROCESSING', 'REVOKING')
              AND variant.deleted_flag = 0
          )
        """)
    int tombstonePurged(@Param("photoId") Long photoId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("purgedAt") LocalDateTime purgedAt);

    @Select("""
        SELECT COUNT(1)
        FROM (
            SELECT ap.id
            FROM CTN_ALBUM_PHOTO ap
            JOIN CTN_ALBUM a ON a.id = ap.album_id AND a.deleted_flag = 0
            WHERE ap.photo_id = #{photoId}
              AND ap.deleted_flag = 0
            UNION ALL
            SELECT mp.id
            FROM CTN_MOMENT_PHOTO mp
            JOIN CTN_MOMENT m ON m.id = mp.moment_id AND m.deleted_flag = 0
            WHERE mp.photo_id = #{photoId}
              AND mp.deleted_flag = 0
        ) references_to_non_purged_content
        """)
    long countNonPurgedContentReferences(@Param("photoId") Long photoId);

    @Select("""
        SELECT COUNT(1)
        FROM CTN_PHOTO
        WHERE original_asset_id = #{originalAssetId}
          AND id <> #{photoId}
          AND deleted_flag = 0
        """)
    long countOtherPhotoOwners(@Param("photoId") Long photoId,
                               @Param("originalAssetId") Long originalAssetId);

    @Select("""
        SELECT media_ref_id
        FROM CTN_ALBUM_PHOTO
        WHERE photo_id = #{photoId} AND deleted_flag = 0
        UNION ALL
        SELECT media_ref_id
        FROM CTN_MOMENT_PHOTO
        WHERE photo_id = #{photoId} AND deleted_flag = 0
        """)
    List<String> findAssociatedMediaRefs(@Param("photoId") Long photoId);
}
