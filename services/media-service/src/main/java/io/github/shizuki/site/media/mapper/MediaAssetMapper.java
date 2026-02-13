package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
