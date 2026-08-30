package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.AlbumEntity;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AlbumMapper extends BaseMapper<AlbumEntity> {

    /**
     * Claims one album-photo composition command by advancing the aggregate version first.
     * The surrounding transaction rolls this claim back when any later batch operation fails.
     */
    @Update("""
        UPDATE CTN_ALBUM
        SET update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{albumId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status <> 'RECYCLED'
          AND deleted_flag = 0
        """)
    int claimPhotoCompositionMutation(@Param("albumId") Long albumId,
                                      @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_ALBUM
        SET cover_photo_id = NULL,
            featured_flag = 0,
            update_time = CURRENT_TIMESTAMP
        WHERE id = #{albumId}
          AND cover_photo_id IS NOT NULL
          AND deleted_flag = 0
          AND NOT EXISTS (
              SELECT 1
              FROM CTN_ALBUM_PHOTO ap
              WHERE ap.album_id = #{albumId}
                AND ap.photo_id = CTN_ALBUM.cover_photo_id
                AND ap.deleted_flag = 0
          )
        """)
    int clearDetachedCoverAndFeatured(@Param("albumId") Long albumId);

    @Update("""
        UPDATE CTN_ALBUM
        SET title_text = #{title},
            summary_text = #{summary},
            visibility_status = #{visibility},
            featured_flag = #{featured},
            sort_num = #{sortNum},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{albumId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status <> 'RECYCLED'
          AND deleted_flag = 0
        """)
    int updateEditorial(@Param("albumId") Long albumId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("title") String title,
                        @Param("summary") String summary,
                        @Param("visibility") String visibility,
                        @Param("featured") int featured,
                        @Param("sortNum") int sortNum);

    @Update("""
        UPDATE CTN_ALBUM
        SET cover_photo_id = #{photoId},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{albumId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status <> 'RECYCLED'
          AND deleted_flag = 0
          AND EXISTS (
              SELECT 1
              FROM CTN_ALBUM_PHOTO ap
              WHERE ap.album_id = #{albumId}
                AND ap.photo_id = #{photoId}
                AND ap.deleted_flag = 0
          )
        """)
    int updateCover(@Param("albumId") Long albumId,
                    @Param("expectedVersion") int expectedVersion,
                    @Param("photoId") Long photoId);

    @Update("""
        UPDATE CTN_ALBUM
        SET lifecycle_status = #{targetLifecycle},
            publish_time = CASE
                WHEN #{publishTime} IS NULL THEN publish_time
                ELSE #{publishTime}
            END,
            restore_lifecycle_status = #{restoreLifecycle},
            recycle_time = #{recycleTime},
            purge_after = #{purgeAfter},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{albumId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status = #{expectedLifecycle}
          AND deleted_flag = 0
        """)
    int updateLifecycle(@Param("albumId") Long albumId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("expectedLifecycle") String expectedLifecycle,
                        @Param("targetLifecycle") String targetLifecycle,
                        @Param("publishTime") LocalDateTime publishTime,
                        @Param("restoreLifecycle") String restoreLifecycle,
                        @Param("recycleTime") LocalDateTime recycleTime,
                        @Param("purgeAfter") LocalDateTime purgeAfter);

    @Update("""
        UPDATE CTN_ALBUM
        SET deleted_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{albumId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status = 'RECYCLED'
          AND purge_after IS NOT NULL
          AND purge_after <= #{now}
          AND deleted_flag = 0
        """)
    int tombstonePurged(@Param("albumId") Long albumId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("now") LocalDateTime now);

    /** Returns business-recycled rows while excluding permanent-purge tombstones. */
    @Select("""
        SELECT id,
               public_slug,
               title_text AS title,
               summary_text AS summary,
               cover_photo_id,
               lifecycle_status,
               visibility_status,
               featured_flag AS featured,
               sort_num,
               publish_time,
               restore_lifecycle_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_ALBUM
        WHERE lifecycle_status = 'RECYCLED'
          AND deleted_flag = 0
        ORDER BY recycle_time DESC, id DESC
        """)
    List<AlbumEntity> selectRecycled();
}
