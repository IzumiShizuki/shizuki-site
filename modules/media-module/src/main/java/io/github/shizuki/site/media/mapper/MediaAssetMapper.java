package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.time.LocalDateTime;

@Mapper
public interface MediaAssetMapper extends BaseMapper<MediaAssetEntity> {

    /**
     * 检查同一用户下是否已存在相同 object_hash 的资产。
     *
     * <p>使用独立列 object_hash 检索，避免 JSON_EXTRACT 全表扫描。
     */
    @Select("""
        SELECT CASE WHEN COUNT(1) > 0 THEN TRUE ELSE FALSE END
        FROM MDA_ASSET
        WHERE user_id = #{userId}
          AND deleted_flag = 0
          AND object_hash = #{objectHash}
        """)
    Boolean existsByUserIdAndObjectHash(@Param("userId") Long userId, @Param("objectHash") String objectHash);

    @Select("""
        SELECT *
        FROM MDA_ASSET
        WHERE bucket_code = #{bucket}
          AND object_code = #{objectKey}
          AND deleted_flag = 0
        LIMIT 1
        """)
    MediaAssetEntity findByStorageIdentity(@Param("bucket") String bucket,
                                           @Param("objectKey") String objectKey);

    @Update("""
        UPDATE MDA_ASSET
        SET deleted_flag = 1,
            update_time = #{purgedAt},
            version_num = version_num + 1
        WHERE id = #{assetId}
          AND deleted_flag = 0
        """)
    int tombstonePurgedAsset(@Param("assetId") Long assetId,
                             @Param("purgedAt") LocalDateTime purgedAt);
}
