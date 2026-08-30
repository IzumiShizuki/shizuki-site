package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MomentPhotoMapper extends BaseMapper<MomentPhotoEntity> {

    @Select("""
        <script>
        SELECT id,
               moment_id,
               photo_id,
               media_ref_id,
               sort_num,
               delivery_revoked_flag AS delivery_revoked,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_MOMENT_PHOTO
        WHERE moment_id = #{momentId}
          AND photo_id IN
        <foreach collection="photoIds" item="photoId" open="(" separator="," close=")">
            #{photoId}
        </foreach>
        ORDER BY id ASC
        </script>
        """)
    List<MomentPhotoEntity> selectAnyByMomentAndPhotoIds(@Param("momentId") Long momentId,
                                                         @Param("photoIds") List<Long> photoIds);

    @Update("""
        UPDATE CTN_MOMENT_PHOTO
        SET media_ref_id = #{mediaRef},
            sort_num = #{sortNum},
            delivery_revoked_flag = 1,
            deleted_flag = 0,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND moment_id = #{momentId}
          AND deleted_flag = 1
        """)
    int restoreAssociation(@Param("momentId") Long momentId,
                           @Param("associationId") Long associationId,
                           @Param("mediaRef") String mediaRef,
                           @Param("sortNum") int sortNum);

    @Update("""
        UPDATE CTN_MOMENT_PHOTO
        SET sort_num = #{sortNum},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND moment_id = #{momentId}
          AND deleted_flag = 0
        """)
    int updateSort(@Param("momentId") Long momentId,
                   @Param("associationId") Long associationId,
                   @Param("sortNum") int sortNum);

    @Update("""
        <script>
        UPDATE CTN_MOMENT_PHOTO
        SET deleted_flag = 1,
            delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE moment_id = #{momentId}
          AND photo_id IN
        <foreach collection="photoIds" item="photoId" open="(" separator="," close=")">
            #{photoId}
        </foreach>
          AND deleted_flag = 0
        </script>
        """)
    int revokeAndDetach(@Param("momentId") Long momentId,
                        @Param("photoIds") List<Long> photoIds);

    @Update("""
        UPDATE CTN_MOMENT_PHOTO
        SET delivery_revoked_flag = #{revoked},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE moment_id = #{momentId}
          AND delivery_revoked_flag <> #{revoked}
          AND deleted_flag = 0
        """)
    int updateDeliveryRevoked(@Param("momentId") Long momentId,
                              @Param("revoked") int revoked);

    @Update("""
        UPDATE CTN_MOMENT_PHOTO
        SET deleted_flag = 1,
            delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE moment_id = #{momentId}
          AND deleted_flag = 0
        """)
    int tombstoneByMomentId(@Param("momentId") Long momentId);

    @Select("""
        SELECT id,
               moment_id,
               photo_id,
               media_ref_id,
               sort_num,
               delivery_revoked_flag AS delivery_revoked,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_MOMENT_PHOTO
        WHERE moment_id = #{momentId}
          AND deleted_flag = 0
        ORDER BY sort_num ASC, id ASC
        """)
    List<MomentPhotoEntity> selectByMomentIdOrdered(@Param("momentId") Long momentId);
}
