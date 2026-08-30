package io.github.shizuki.site.content.mapper.admin;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/** Read-only management projection. No asset or object-storage identity is selected. */
@Mapper
public interface AlbumAdminReadMapper {

    String ALBUM_PROJECTION = """
        SELECT a.id,
               a.public_slug,
               a.title_text AS title,
               a.summary_text AS summary,
               a.cover_photo_id,
               a.lifecycle_status,
               a.visibility_status,
               a.featured_flag AS featured,
               a.sort_num,
               (SELECT COUNT(1) FROM CTN_ALBUM_PHOTO ap
                WHERE ap.album_id = a.id AND ap.deleted_flag = 0) AS photo_count,
               a.publish_time,
               a.recycle_time,
               a.purge_after,
               a.create_time AS created_at,
               a.update_time AS updated_at,
               a.version_num AS version
        FROM CTN_ALBUM a
        """;

    @Select(ALBUM_PROJECTION + """
        WHERE a.id = #{albumId}
          AND a.deleted_flag = 0
        LIMIT 1
        """)
    AlbumAdminReadRow selectAlbum(@Param("albumId") long albumId);

    @Select(ALBUM_PROJECTION + """
        WHERE a.deleted_flag = 0
          AND (#{includeRecycled} = 1 OR a.lifecycle_status <> 'RECYCLED')
        ORDER BY a.update_time DESC, a.id DESC
        LIMIT #{limit}
        """)
    List<AlbumAdminReadRow> selectAlbums(@Param("includeRecycled") int includeRecycled,
                                         @Param("limit") int limit);

    @Select("""
        SELECT p.id AS photo_id,
               ap.media_ref_id AS media_ref,
               p.title_text AS title,
               p.alt_text,
               ap.caption_text AS caption,
               p.published_location_label,
               p.processing_status AS photo_processing_status,
               ap.sort_num,
               ap.download_mode,
               ap.version_num AS association_version
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_PHOTO p ON p.id = ap.photo_id AND p.deleted_flag = 0
        WHERE ap.album_id = #{albumId}
          AND ap.deleted_flag = 0
          AND p.recycle_time IS NULL
        ORDER BY ap.sort_num ASC, ap.id ASC
        """)
    List<AlbumAdminPhotoReadRow> selectPhotos(@Param("albumId") long albumId);

    @Select("""
        SELECT p.id AS photo_id,
               v.variant_code,
               v.process_status,
               v.width_value AS width,
               v.height_value AS height,
               v.retry_count,
               v.version_num AS version
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_PHOTO p ON p.id = ap.photo_id AND p.deleted_flag = 0
        JOIN MDA_ASSET_VARIANT v
          ON v.source_asset_id = p.original_asset_id
         AND v.delivery_scope = #{deliveryScope}
         AND v.processor_version = #{processorVersion}
         AND v.deleted_flag = 0
        WHERE ap.album_id = #{albumId}
          AND ap.deleted_flag = 0
          AND p.recycle_time IS NULL
        ORDER BY p.id ASC, v.variant_code ASC
        """)
    List<AlbumAdminVariantReadRow> selectVariants(@Param("albumId") long albumId,
                                                   @Param("deliveryScope") String deliveryScope,
                                                   @Param("processorVersion") String processorVersion);
}
