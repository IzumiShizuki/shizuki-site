package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MusicPlaylistEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicPlaylistMapper extends BaseMapper<MusicPlaylistEntity> {
}
