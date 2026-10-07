package io.github.shizuki.site.user.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDailyArtMapper {
    @Select("SELECT config_json::text FROM USR_DAILY_ART WHERE user_id = #{userId}")
    String config(@Param("userId") Long userId);

    @Select("SELECT daily_json::text FROM USR_DAILY_ART WHERE user_id = #{userId}")
    String daily(@Param("userId") Long userId);

    // Patch individual configuration fields atomically, preserving concurrent manual/follow changes.
    @Insert("""
        INSERT INTO USR_DAILY_ART (user_id, config_json) VALUES (#{userId}, CAST(#{json} AS jsonb))
        ON CONFLICT (user_id) DO UPDATE
        SET config_json = USR_DAILY_ART.config_json || EXCLUDED.config_json, updated_at = CURRENT_TIMESTAMP
        """)
    void patchConfig(@Param("userId") Long userId, @Param("json") String json);

    @Update("""
        UPDATE USR_DAILY_ART SET config_json = config_json || CAST(#{json} AS jsonb), updated_at = CURRENT_TIMESTAMP
        WHERE user_id = #{userId} AND config_json->>'session_cipher' = #{expectedCipher}
        """)
    int patchConnectedConfig(@Param("userId") Long userId, @Param("json") String json,
                             @Param("expectedCipher") String expectedCipher);

    // First successful selection wins per section/date, including concurrent requests and restarts.
    @Insert("""
        INSERT INTO USR_DAILY_ART (user_id, daily_json) VALUES (#{userId}, CAST(#{json} AS jsonb))
        ON CONFLICT (user_id) DO UPDATE SET daily_json = CASE
          WHEN USR_DAILY_ART.daily_json->>'date' = EXCLUDED.daily_json->>'date'
          THEN EXCLUDED.daily_json || USR_DAILY_ART.daily_json
          WHEN USR_DAILY_ART.daily_json->>'date' > EXCLUDED.daily_json->>'date'
          THEN USR_DAILY_ART.daily_json
          ELSE EXCLUDED.daily_json END, updated_at = CURRENT_TIMESTAMP
        """)
    void saveDaily(@Param("userId") Long userId, @Param("json") String json);
}
