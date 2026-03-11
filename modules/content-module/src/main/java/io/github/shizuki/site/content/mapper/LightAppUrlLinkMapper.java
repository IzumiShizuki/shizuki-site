package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.LightAppUrlLinkEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LightAppUrlLinkMapper extends BaseMapper<LightAppUrlLinkEntity> {

    @Select("SELECT MAX(sort_num) FROM CTN_LA_URL_LINK WHERE user_id = #{userId} AND deleted_flag = 0")
    Integer selectMaxSortNumByUserId(@Param("userId") Long userId);
}
