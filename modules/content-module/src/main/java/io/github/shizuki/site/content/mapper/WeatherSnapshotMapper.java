package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.WeatherSnapshotEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface WeatherSnapshotMapper extends BaseMapper<WeatherSnapshotEntity> {

    @Select("""
        SELECT id, site_location_id, provider_code, payload_json, observed_at, fetched_at,
               create_time, update_time, deleted_flag, version_num
        FROM CTN_WEATHER_SNAPSHOT
        WHERE site_location_id = #{locationId}
          AND deleted_flag = 0
        ORDER BY fetched_at DESC, id DESC
        LIMIT #{limit}
        """)
    List<WeatherSnapshotEntity> selectRecentByLocationId(
        @Param("locationId") long locationId,
        @Param("limit") int limit
    );
}
