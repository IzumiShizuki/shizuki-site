package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.AmbientSourceAssetEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AmbientSourceAssetMapper extends BaseMapper<AmbientSourceAssetEntity> {

    @Select("""
        SELECT *
        FROM MDA_AMBIENT_SOURCE_ASSET
        WHERE user_id = #{userId}
          AND provider_code = #{providerCode}
          AND source_sound_id = #{sourceSoundId}
          AND deleted_flag = 0
        LIMIT 1
        """)
    AmbientSourceAssetEntity findActive(@Param("userId") Long userId,
                                         @Param("providerCode") String providerCode,
                                         @Param("sourceSoundId") String sourceSoundId);

    @Update("""
        UPDATE MDA_AMBIENT_SOURCE_ASSET
        SET asset_id = #{assetId}, import_status = 'READY', update_time = CURRENT_TIMESTAMP
        WHERE id = #{id} AND import_status = 'IMPORTING' AND deleted_flag = 0
        """)
    int markReady(@Param("id") Long id, @Param("assetId") Long assetId);

    @Delete("""
        DELETE FROM MDA_AMBIENT_SOURCE_ASSET
        WHERE id = #{id} AND import_status = 'IMPORTING'
        """)
    int deleteImportReservation(@Param("id") Long id);
}
