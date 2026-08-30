package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SiteWidgetConfigMapper extends BaseMapper<SiteWidgetConfigEntity> {

    @Update("""
        UPDATE CTN_SITE_WIDGET_CONFIG
        SET active_location_id = #{activeLocationId},
            weather_enabled_flag = #{weatherEnabled},
            weather_max_stale_minutes = #{weatherMaxStaleMinutes},
            quote_source_mode = #{quoteSourceMode},
            hitokoto_enabled_flag = #{hitokotoEnabled},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE singleton_key = #{singletonKey}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int updateVersioned(
        @Param("singletonKey") String singletonKey,
        @Param("expectedVersion") int expectedVersion,
        @Param("activeLocationId") long activeLocationId,
        @Param("weatherEnabled") int weatherEnabled,
        @Param("weatherMaxStaleMinutes") int weatherMaxStaleMinutes,
        @Param("quoteSourceMode") String quoteSourceMode,
        @Param("hitokotoEnabled") int hitokotoEnabled
    );
}
