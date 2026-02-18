package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MusicPickUsageEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicPickUsageMapper extends BaseMapper<MusicPickUsageEntity> {

    /**
     * 原子累加选歌次数。
     */
    @Update("UPDATE MDA_MUSIC_PICK_USAGE "
        + "SET used_count = used_count + #{delta}, update_time = NOW() "
        + "WHERE user_id = #{userId} AND quota_code = #{quotaCode}")
    int increaseUsedCount(@Param("userId") Long userId,
                          @Param("quotaCode") String quotaCode,
                          @Param("delta") Long delta);
}
