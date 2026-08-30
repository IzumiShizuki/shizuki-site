package io.github.shizuki.site.content.mapper;

import io.github.shizuki.site.content.entity.MomentEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MomentAdminReadMapper {

    @Select("""
        <script>
        SELECT m.id,
               m.body_text AS body,
               m.lifecycle_status AS lifecycle,
               m.visibility_status AS visibility,
               m.featured_flag AS featured,
               m.pinned_flag AS pinned,
               (SELECT COUNT(*) FROM CTN_MOMENT_PHOTO mp
                WHERE mp.moment_id = m.id AND mp.deleted_flag = 0) AS photo_count,
               m.version_num AS version,
               m.update_time AS updated_at
        FROM CTN_MOMENT m
        WHERE m.deleted_flag = 0
          <if test="includeRecycled == 0">
            AND m.lifecycle_status &lt;&gt; 'RECYCLED'
          </if>
        ORDER BY m.pinned_flag DESC, m.update_time DESC, m.id DESC
        LIMIT #{limit}
        </script>
        """)
    List<AdminMomentSummaryRow> selectAdminList(@Param("includeRecycled") int includeRecycled,
                                                @Param("limit") int limit);

    @Select("""
        SELECT id,
               public_id,
               body_text AS body,
               lifecycle_status,
               visibility_status,
               featured_flag AS featured,
               pinned_flag AS pinned,
               publish_time,
               restore_lifecycle_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_MOMENT
        WHERE id = #{momentId}
          AND deleted_flag = 0
        """)
    MomentEntity selectAdminDetail(@Param("momentId") Long momentId);

    @Select("""
        SELECT mp.photo_id,
               mp.media_ref_id AS media_ref,
               mp.sort_num,
               p.title_text AS title,
               p.alt_text,
               p.published_location_label,
               p.processing_status AS photo_status,
               v.variant_code,
               v.delivery_scope,
               v.process_status AS derivative_status,
               v.version_num AS derivative_version,
               va.audit_status AS asset_audit_status
        FROM CTN_MOMENT_PHOTO mp
        JOIN CTN_PHOTO p
          ON p.id = mp.photo_id
         AND p.deleted_flag = 0
        LEFT JOIN MDA_ASSET_VARIANT v
          ON v.source_asset_id = p.original_asset_id
         AND v.deleted_flag = 0
        LEFT JOIN MDA_ASSET va
          ON va.id = v.variant_asset_id
         AND va.deleted_flag = 0
        WHERE mp.moment_id = #{momentId}
          AND mp.deleted_flag = 0
        ORDER BY mp.sort_num ASC, mp.id ASC, v.variant_code ASC, v.delivery_scope ASC
        """)
    List<MomentAdminPhotoProcessingRow> selectPhotoProcessing(@Param("momentId") Long momentId);
}
