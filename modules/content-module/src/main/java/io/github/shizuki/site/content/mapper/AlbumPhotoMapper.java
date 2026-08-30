package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AlbumPhotoMapper extends BaseMapper<AlbumPhotoEntity> {

    @Select("""
        <script>
        SELECT id,
               album_id,
               photo_id,
               media_ref_id,
               sort_num,
               caption_text AS caption,
               download_mode,
               delivery_revoked_flag AS delivery_revoked,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_ALBUM_PHOTO
        WHERE album_id = #{albumId}
          AND photo_id IN
        <foreach collection="photoIds" item="photoId" open="(" separator="," close=")">
            #{photoId}
        </foreach>
        ORDER BY id ASC
        </script>
        """)
    List<AlbumPhotoEntity> selectAnyByAlbumAndPhotoIds(@Param("albumId") Long albumId,
                                                       @Param("photoIds") List<Long> photoIds);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET caption_text = #{caption},
            download_mode = #{downloadMode},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND album_id = #{albumId}
          AND deleted_flag = 0
        """)
    int updateAssociationMetadata(@Param("albumId") Long albumId,
                                  @Param("associationId") Long associationId,
                                  @Param("caption") String caption,
                                  @Param("downloadMode") String downloadMode);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET media_ref_id = #{mediaRef},
            sort_num = #{sortNum},
            caption_text = #{caption},
            download_mode = #{downloadMode},
            delivery_revoked_flag = 1,
            deleted_flag = 0,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND album_id = #{albumId}
          AND deleted_flag = 1
        """)
    int restoreAssociation(@Param("albumId") Long albumId,
                           @Param("associationId") Long associationId,
                           @Param("mediaRef") String mediaRef,
                           @Param("sortNum") int sortNum,
                           @Param("caption") String caption,
                           @Param("downloadMode") String downloadMode);

    @Update("""
        <script>
        UPDATE CTN_ALBUM_PHOTO
        SET deleted_flag = 1,
            delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE album_id = #{albumId}
          AND photo_id IN
        <foreach collection="photoIds" item="photoId" open="(" separator="," close=")">
            #{photoId}
        </foreach>
          AND deleted_flag = 0
        </script>
        """)
    int revokeAndDetach(@Param("albumId") Long albumId,
                        @Param("photoIds") List<Long> photoIds);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET sort_num = #{sortNum},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{associationId}
          AND album_id = #{albumId}
          AND deleted_flag = 0
        """)
    int updateSort(@Param("albumId") Long albumId,
                   @Param("associationId") Long associationId,
                   @Param("sortNum") int sortNum);

    @Select("""
        SELECT CASE WHEN COUNT(1) > 0 THEN TRUE ELSE FALSE END
        FROM CTN_ALBUM_PHOTO
        WHERE album_id = #{albumId}
          AND photo_id = #{photoId}
          AND deleted_flag = 0
        """)
    boolean existsActiveAssociation(@Param("albumId") Long albumId,
                                    @Param("photoId") Long photoId);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET delivery_revoked_flag = #{revoked},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE album_id = #{albumId}
          AND delivery_revoked_flag <> #{revoked}
          AND deleted_flag = 0
        """)
    int updateDeliveryRevoked(@Param("albumId") Long albumId,
                              @Param("revoked") int revoked);

    @Update("""
        UPDATE CTN_ALBUM_PHOTO
        SET deleted_flag = 1,
            delivery_revoked_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE album_id = #{albumId}
          AND deleted_flag = 0
        """)
    int tombstoneByAlbumId(@Param("albumId") Long albumId);

    @Select("""
        SELECT id,
               album_id,
               photo_id,
               media_ref_id,
               sort_num,
               caption_text AS caption,
               download_mode,
               delivery_revoked_flag AS delivery_revoked,
               create_time AS created_at,
               update_time AS updated_at,
               deleted_flag AS deleted,
               version_num AS version
        FROM CTN_ALBUM_PHOTO
        WHERE album_id = #{albumId}
          AND deleted_flag = 0
        ORDER BY sort_num ASC, id ASC
        """)
    List<AlbumPhotoEntity> selectByAlbumIdOrdered(@Param("albumId") Long albumId);
}
