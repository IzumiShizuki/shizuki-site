package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MusicUploadUsageEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicUploadUsageMapper extends BaseMapper<MusicUploadUsageEntity> {

    /**
     * 原子累加上传字节。
     */
    @Update("UPDATE MDA_MUSIC_UPLOAD_USAGE "
        + "SET used_bytes = used_bytes + #{delta}, update_time = NOW() "
        + "WHERE user_id = #{userId}")
    int increaseUsedBytes(@Param("userId") Long userId, @Param("delta") Long delta);
}
