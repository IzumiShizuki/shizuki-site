package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.PhotoEntity;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PhotoMapper extends BaseMapper<PhotoEntity> {

    @Select("""
        <script>
        SELECT id,
               original_asset_id,
               title_text AS title,
               alt_text,
               captured_at_draft,
               published_location_label,
               processing_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_PHOTO
        WHERE deleted_flag = 0
          <if test="includeRecycled == 0">
            AND recycle_time IS NULL
          </if>
        ORDER BY create_time DESC, id DESC
        LIMIT #{limit}
        </script>
        """)
    List<PhotoEntity> selectManaged(@Param("includeRecycled") int includeRecycled,
                                    @Param("limit") int limit);

    @Select("""
        SELECT id,
               original_asset_id,
               title_text AS title,
               alt_text,
               captured_at_draft,
               published_location_label,
               processing_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_PHOTO
        WHERE id = #{photoId}
          AND deleted_flag = 0
        """)
    PhotoEntity selectManagedById(@Param("photoId") Long photoId);

    @Select("""
        SELECT id,
               original_asset_id,
               title_text AS title,
               alt_text,
               captured_at_draft,
               published_location_label,
               processing_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_PHOTO
        WHERE original_asset_id = #{assetId}
          AND deleted_flag = 0
        """)
    PhotoEntity selectActiveByOriginalAssetId(@Param("assetId") Long assetId);

    @Update("""
        UPDATE CTN_PHOTO
        SET title_text = #{title},
            alt_text = #{altText},
            captured_at_draft = #{capturedAtDraft},
            published_location_label = #{publishedLocationLabel},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{photoId}
          AND version_num = #{expectedVersion}
          AND recycle_time IS NULL
          AND deleted_flag = 0
        """)
    int updateEditorial(@Param("photoId") Long photoId,
                        @Param("expectedVersion") int expectedVersion,
                        @Param("title") String title,
                        @Param("altText") String altText,
                        @Param("capturedAtDraft") LocalDateTime capturedAtDraft,
                        @Param("publishedLocationLabel") String publishedLocationLabel);

    @Select("""
        <script>
        SELECT id,
               original_asset_id,
               title_text AS title,
               alt_text,
               captured_at_draft,
               published_location_label,
               processing_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_PHOTO
        WHERE id IN
        <foreach collection="photoIds" item="photoId" open="(" separator="," close=")">
            #{photoId}
        </foreach>
          AND recycle_time IS NULL
          AND deleted_flag = 0
        ORDER BY id ASC
        </script>
        """)
    List<PhotoEntity> selectReusableByIds(@Param("photoIds") List<Long> photoIds);

    @Select("""
        SELECT id,
               original_asset_id,
               title_text AS title,
               alt_text,
               captured_at_draft,
               published_location_label,
               processing_status,
               recycle_time,
               purge_after,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_PHOTO
        WHERE deleted_flag = 0
          AND recycle_time IS NOT NULL
          AND purge_after IS NOT NULL
          AND purge_after <= #{cutoff}
        ORDER BY purge_after ASC, id ASC
        """)
    List<PhotoEntity> selectRecycledEligibleForPurge(@Param("cutoff") LocalDateTime cutoff);
}
