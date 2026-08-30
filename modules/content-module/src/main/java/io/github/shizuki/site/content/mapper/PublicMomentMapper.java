package io.github.shizuki.site.content.mapper;

import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PublicMomentMapper {

    @Select("""
        <script>
        SELECT id,
               public_id,
               body_text AS body,
               visibility_status,
               featured_flag AS featured,
               pinned_flag AS pinned,
               publish_time AS published_at
        FROM CTN_MOMENT
        WHERE lifecycle_status = 'PUBLISHED'
          AND visibility_status = 'PUBLIC'
          AND publish_time IS NOT NULL
          AND deleted_flag = 0
        <if test="cursorPublishedAt != null">
          AND (
            publish_time &lt; #{cursorPublishedAt}
            OR (publish_time = #{cursorPublishedAt} AND id &lt; #{cursorId})
            OR (publish_time = #{cursorPublishedAt} AND id = #{cursorId} AND public_id &lt; #{cursorPublicId})
          )
        </if>
        ORDER BY publish_time DESC, id DESC, public_id DESC
        LIMIT #{limit}
        </script>
        """)
    List<PublicMomentReadRow> selectPublicFeed(
        @Param("cursorPublishedAt") LocalDateTime cursorPublishedAt,
        @Param("cursorId") Long cursorId,
        @Param("cursorPublicId") String cursorPublicId,
        @Param("limit") int limit
    );

    @Select("""
        SELECT id,
               public_id,
               body_text AS body,
               visibility_status,
               featured_flag AS featured,
               pinned_flag AS pinned,
               publish_time AS published_at
        FROM CTN_MOMENT
        WHERE lifecycle_status = 'PUBLISHED'
          AND visibility_status = 'PUBLIC'
          AND featured_flag = 1
          AND publish_time IS NOT NULL
          AND deleted_flag = 0
        ORDER BY pinned_flag DESC, publish_time DESC, id DESC
        LIMIT #{limit}
        """)
    List<PublicMomentReadRow> selectFeatured(@Param("limit") int limit);

    @Select("""
        SELECT id,
               public_id,
               body_text AS body,
               visibility_status,
               featured_flag AS featured,
               pinned_flag AS pinned,
               publish_time AS published_at
        FROM CTN_MOMENT
        WHERE public_id = #{publicId}
          AND lifecycle_status = 'PUBLISHED'
          AND visibility_status IN ('PUBLIC', 'UNLISTED')
          AND publish_time IS NOT NULL
          AND deleted_flag = 0
        """)
    PublicMomentReadRow selectDirectDetail(@Param("publicId") String publicId);

    @Select("""
        <script>
        SELECT mp.moment_id,
               mp.media_ref_id AS media_ref,
               p.published_location_label,
               mp.sort_num
        FROM CTN_MOMENT_PHOTO mp
        JOIN CTN_PHOTO p
          ON p.id = mp.photo_id
         AND p.processing_status = 'READY'
         AND p.recycle_time IS NULL
         AND p.deleted_flag = 0
        WHERE mp.moment_id IN
        <foreach collection="momentIds" item="momentId" open="(" separator="," close=")">
            #{momentId}
        </foreach>
          AND mp.delivery_revoked_flag = 0
          AND mp.deleted_flag = 0
        ORDER BY mp.moment_id ASC, mp.sort_num ASC, mp.id ASC
        </script>
        """)
    List<PublicMomentPhotoReadRow> selectPhotos(@Param("momentIds") List<Long> momentIds);
}
