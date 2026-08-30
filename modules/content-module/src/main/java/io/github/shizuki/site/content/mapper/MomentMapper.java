package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.MomentEntity;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MomentMapper extends BaseMapper<MomentEntity> {

    @Update("""
        UPDATE CTN_MOMENT
        SET body_text = #{body},
            visibility_status = #{visibility},
            featured_flag = #{featured},
            pinned_flag = #{pinned},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{momentId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status <> 'RECYCLED'
          AND deleted_flag = 0
        """)
    int updateEditorial(@Param("momentId") Long momentId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("body") String body,
                        @Param("visibility") String visibility,
                        @Param("featured") int featured,
                        @Param("pinned") int pinned);

    @Update("""
        UPDATE CTN_MOMENT
        SET update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{momentId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status <> 'RECYCLED'
          AND deleted_flag = 0
        """)
    int claimPhotoCompositionMutation(@Param("momentId") Long momentId,
                                      @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE CTN_MOMENT
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
        WHERE id = #{momentId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status = #{expectedLifecycle}
          AND deleted_flag = 0
        """)
    int updateLifecycle(@Param("momentId") Long momentId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("expectedLifecycle") String expectedLifecycle,
                        @Param("targetLifecycle") String targetLifecycle,
                        @Param("publishTime") LocalDateTime publishTime,
                        @Param("restoreLifecycle") String restoreLifecycle,
                        @Param("recycleTime") LocalDateTime recycleTime,
                        @Param("purgeAfter") LocalDateTime purgeAfter);

    @Update("""
        UPDATE CTN_MOMENT
        SET deleted_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{momentId}
          AND version_num = #{expectedVersion}
          AND lifecycle_status = 'RECYCLED'
          AND purge_after IS NOT NULL
          AND purge_after <= #{now}
          AND deleted_flag = 0
        """)
    int tombstonePurged(@Param("momentId") Long momentId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("now") LocalDateTime now);

    /** Returns business-recycled rows while excluding permanent-purge tombstones. */
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
        WHERE lifecycle_status = 'RECYCLED'
          AND deleted_flag = 0
        ORDER BY recycle_time DESC, id DESC
        """)
    List<MomentEntity> selectRecycled();
}
