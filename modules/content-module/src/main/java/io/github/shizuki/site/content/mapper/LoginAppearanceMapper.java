package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.LoginAppearanceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginAppearanceMapper extends BaseMapper<LoginAppearanceEntity> {

    @Update("""
        UPDATE CTN_LOGIN_APPEARANCE
        SET theme_preset = #{themePreset},
            bg_image_url = #{bgImageUrl},
            mascot_image_url = #{mascotImageUrl},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE singleton_key = #{singletonKey}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int updateVersioned(
        @Param("singletonKey") String singletonKey,
        @Param("expectedVersion") int expectedVersion,
        @Param("themePreset") String themePreset,
        @Param("bgImageUrl") String bgImageUrl,
        @Param("mascotImageUrl") String mascotImageUrl
    );
}
