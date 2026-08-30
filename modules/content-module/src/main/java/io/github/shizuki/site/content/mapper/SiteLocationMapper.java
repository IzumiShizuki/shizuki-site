package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SiteLocationMapper extends BaseMapper<SiteLocationEntity> {

    @Update("""
        UPDATE CTN_SITE_LOCATION
        SET enabled_flag = 0,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id <> #{activeLocationId}
          AND enabled_flag <> 0
          AND deleted_flag = 0
        """)
    int disableAllExcept(@Param("activeLocationId") long activeLocationId);

    @Update("""
        UPDATE CTN_SITE_LOCATION
        SET enabled_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{locationId}
          AND enabled_flag = 0
          AND deleted_flag = 0
        """)
    int enableIfDisabled(@Param("locationId") long locationId);
}
