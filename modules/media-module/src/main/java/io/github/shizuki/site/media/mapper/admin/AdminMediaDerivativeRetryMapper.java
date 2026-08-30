package io.github.shizuki.site.media.mapper.admin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/** Admin retry projection. It never selects variant asset or storage identity. */
@Mapper
public interface AdminMediaDerivativeRetryMapper {

    @Select("""
        SELECT v.id AS variant_id,
               p.id AS photo_id,
               ap.media_ref_id AS media_ref,
               v.variant_code,
               v.process_status,
               v.version_num AS version
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_ALBUM a ON a.id = ap.album_id AND a.deleted_flag = 0
        JOIN CTN_PHOTO p ON p.id = ap.photo_id AND p.deleted_flag = 0
        JOIN MDA_ASSET_VARIANT v
          ON v.source_asset_id = p.original_asset_id
         AND v.variant_code = #{variantCode}
         AND v.delivery_scope = CASE
               WHEN a.visibility_status = 'PUBLIC' THEN 'PUBLIC_MATERIALIZED'
               ELSE 'PRIVATE_WORKING'
             END
         AND v.processor_version = #{processorVersion}
         AND v.deleted_flag = 0
        WHERE ap.media_ref_id = #{mediaRef}
          AND ap.deleted_flag = 0
          AND p.recycle_time IS NULL
          AND a.lifecycle_status <> 'RECYCLED'
        LIMIT 1
        """)
    AdminMediaDerivativeRetryRow selectRetryTarget(@Param("mediaRef") String mediaRef,
                                                    @Param("variantCode") String variantCode,
                                                    @Param("processorVersion") String processorVersion);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'PENDING',
            retry_count = 0,
            last_error = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{variantId}
          AND version_num = #{expectedVersion}
          AND process_status = 'FAILED'
          AND deleted_flag = 0
        """)
    int retryFailed(@Param("variantId") long variantId,
                    @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_PHOTO
        SET processing_status = 'PROCESSING',
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{photoId}
          AND deleted_flag = 0
          AND recycle_time IS NULL
        """)
    int markPhotoProcessing(@Param("photoId") long photoId);
}
