package io.github.shizuki.site.content.mapper.publiccontent;

import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Visitor-only Album queries. Eligibility is repeated at the persistence boundary so editorial
 * or media races cannot accidentally turn a draft, private, revoked, or incomplete item into a
 * discovery result.
 */
@Mapper
public interface PublicAlbumReadMapper {

    String PROJECTION = """
        SELECT a.id,
               a.public_slug,
               a.title_text AS title,
               a.summary_text AS summary,
               a.visibility_status,
               (SELECT COUNT(1)
                  FROM CTN_ALBUM_PHOTO count_ap
                 WHERE count_ap.album_id = a.id
                   AND count_ap.deleted_flag = 0) AS photo_count,
               a.publish_time,
               cover_ap.media_ref_id AS cover_media_ref
          FROM CTN_ALBUM a
          JOIN CTN_ALBUM_PHOTO cover_ap
            ON cover_ap.album_id = a.id
           AND cover_ap.photo_id = a.cover_photo_id
           AND cover_ap.deleted_flag = 0
           AND cover_ap.delivery_revoked_flag = 0
        """;

    String BASE_ELIGIBILITY = """
         WHERE a.deleted_flag = 0
           AND a.lifecycle_status = 'PUBLISHED'
           AND a.publish_time IS NOT NULL
           AND a.cover_photo_id IS NOT NULL
           AND NOT EXISTS (
               SELECT 1
                 FROM CTN_ALBUM_PHOTO verify_ap
                 LEFT JOIN CTN_PHOTO verify_p
                   ON verify_p.id = verify_ap.photo_id
                  AND verify_p.deleted_flag = 0
                  AND verify_p.recycle_time IS NULL
                WHERE verify_ap.album_id = a.id
                  AND verify_ap.deleted_flag = 0
                  AND (
                      verify_ap.delivery_revoked_flag != 0
                      OR verify_p.id IS NULL
                      OR verify_p.processing_status != 'READY'
                      OR (
                          SELECT COUNT(DISTINCT verify_v.variant_code)
                            FROM MDA_ASSET_VARIANT verify_v
                            JOIN MDA_ASSET verify_va
                              ON verify_va.id = verify_v.variant_asset_id
                             AND verify_va.deleted_flag = 0
                             AND verify_va.audit_status = 'APPROVED'
                           WHERE verify_v.source_asset_id = verify_p.original_asset_id
                             AND verify_v.delivery_scope =
                                 CASE WHEN a.visibility_status = 'PUBLIC'
                                      THEN 'PUBLIC_MATERIALIZED'
                                      ELSE 'PRIVATE_WORKING' END
                             AND verify_v.processor_version = #{processorVersion}
                             AND verify_v.variant_code IN ('THUMB_WEBP', 'DISPLAY_WEBP', 'FULL_SANITIZED')
                             AND verify_v.process_status = 'READY'
                             AND verify_v.deleted_flag = 0
                      ) != 3
                  )
           )
        """;

    @Select({
        "<script>",
        PROJECTION,
        BASE_ELIGIBILITY,
        " AND a.visibility_status = 'PUBLIC' ",
        "<if test='cursorPublishedAt != null'>",
        " AND (a.publish_time &lt; #{cursorPublishedAt}",
        "      OR (a.publish_time = #{cursorPublishedAt} AND a.id &lt; #{cursorStableSortKey})",
        "      OR (a.publish_time = #{cursorPublishedAt} AND a.id = #{cursorStableSortKey}",
        "          AND a.public_slug &lt; #{cursorPublicId}))",
        "</if>",
        " ORDER BY a.publish_time DESC, a.id DESC, a.public_slug DESC ",
        " LIMIT #{fetchLimit}",
        "</script>"
    })
    List<PublicAlbumReadRow> selectPublicPage(
        @Param("cursorPublishedAt") LocalDateTime cursorPublishedAt,
        @Param("cursorStableSortKey") Long cursorStableSortKey,
        @Param("cursorPublicId") String cursorPublicId,
        @Param("fetchLimit") int fetchLimit,
        @Param("processorVersion") String processorVersion
    );

    @Select({
        PROJECTION,
        BASE_ELIGIBILITY,
        " AND a.visibility_status = 'PUBLIC' ",
        " AND a.featured_flag = 1 ",
        " ORDER BY a.sort_num ASC, a.publish_time DESC, a.id DESC, a.public_slug DESC ",
        " LIMIT #{limit}"
    })
    List<PublicAlbumReadRow> selectFeatured(
        @Param("limit") int limit,
        @Param("processorVersion") String processorVersion
    );

    @Select({
        PROJECTION,
        BASE_ELIGIBILITY,
        " AND a.visibility_status IN ('PUBLIC', 'UNLISTED') ",
        " AND a.public_slug = #{publicSlug} ",
        " LIMIT 1"
    })
    PublicAlbumReadRow selectVisitorDetail(
        @Param("publicSlug") String publicSlug,
        @Param("processorVersion") String processorVersion
    );

    @Select("""
        SELECT ap.media_ref_id AS media_ref,
               p.title_text AS title,
               p.alt_text,
               ap.caption_text AS caption,
               p.published_location_label,
               ap.sort_num
          FROM CTN_ALBUM_PHOTO ap
          JOIN CTN_PHOTO p
            ON p.id = ap.photo_id
           AND p.deleted_flag = 0
           AND p.recycle_time IS NULL
           AND p.processing_status = 'READY'
         WHERE ap.album_id = #{albumId}
           AND ap.deleted_flag = 0
           AND ap.delivery_revoked_flag = 0
         ORDER BY ap.sort_num ASC, ap.id ASC
        """)
    List<PublicAlbumPhotoReadRow> selectVisitorPhotos(@Param("albumId") long albumId);
}
