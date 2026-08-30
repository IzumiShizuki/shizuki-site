package io.github.shizuki.site.content.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Read-only publication gate over managed photos and the media derivative pipeline.
 */
@Mapper
public interface AlbumPublicationMediaMapper {

    @Select("""
        <script>
        SELECT ap.photo_id,
               required.variant_code,
               p.processing_status AS photo_status,
               v.process_status AS derivative_status,
               va.audit_status AS asset_audit_status
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_PHOTO p
          ON p.id = ap.photo_id
         AND p.deleted_flag = 0
         AND p.recycle_time IS NULL
        CROSS JOIN (
          <foreach collection="requiredVariantCodes" item="variantCode" separator=" UNION ALL ">
            SELECT #{variantCode} AS variant_code
          </foreach>
        ) required
        LEFT JOIN MDA_ASSET_VARIANT v
          ON v.source_asset_id = p.original_asset_id
         AND v.variant_code = required.variant_code
         AND v.delivery_scope = #{deliveryScope}
         AND v.processor_version = #{processorVersion}
         AND v.deleted_flag = 0
        LEFT JOIN MDA_ASSET va
          ON va.id = v.variant_asset_id
         AND va.deleted_flag = 0
        WHERE ap.album_id = #{albumId}
          AND ap.deleted_flag = 0
          AND (
            p.processing_status <> 'READY'
            OR v.id IS NULL
            OR v.process_status <> 'READY'
            OR v.variant_asset_id IS NULL
            OR va.id IS NULL
            OR va.audit_status <> 'APPROVED'
          )
        ORDER BY ap.sort_num ASC, ap.id ASC, required.variant_code ASC
        </script>
        """)
    List<AlbumPublicationMediaRow> selectPublicationBlockers(
        @Param("albumId") Long albumId,
        @Param("deliveryScope") String deliveryScope,
        @Param("processorVersion") String processorVersion,
        @Param("requiredVariantCodes") List<String> requiredVariantCodes
    );
}
