package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.AppEntity;
import java.util.List;
import java.util.Set;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppMapper extends BaseMapper<AppEntity> {

    @Select("""
        <script>
        SELECT COUNT(1)
        FROM CTN_APP a
        WHERE a.deleted_flag = 0
        AND (
          a.visibility_status = 'PUBLIC'
          <if test="userId != null and userId > 0">
            OR (a.visibility_status = 'PRIVATE' AND a.user_id = #{userId})
            OR (a.visibility_status = 'GROUP' AND (a.user_id = #{userId}
              <if test="groupCodes != null and groupCodes.size() > 0">
                OR EXISTS (
                  SELECT 1 FROM CTN_APP_GROUP_ACL acl
                  WHERE acl.app_id = a.id
                    AND acl.deleted_flag = 0
                    AND acl.group_code IN
                    <foreach collection="groupCodes" item="groupCode" open="(" separator="," close=")">
                      #{groupCode}
                    </foreach>
                )
              </if>
            ))
          </if>
          <if test="(userId == null or userId &lt;= 0) and groupCodes != null and groupCodes.size() > 0">
            OR (a.visibility_status = 'GROUP' AND EXISTS (
                SELECT 1 FROM CTN_APP_GROUP_ACL acl
                WHERE acl.app_id = a.id
                  AND acl.deleted_flag = 0
                  AND acl.group_code IN
                  <foreach collection="groupCodes" item="groupCode" open="(" separator="," close=")">
                    #{groupCode}
                  </foreach>
            ))
          </if>
        )
        </script>
        """)
    Long countVisibleApps(@Param("userId") Long userId, @Param("groupCodes") Set<String> groupCodes);

    @Select("""
        <script>
        SELECT a.*
        FROM CTN_APP a
        WHERE a.deleted_flag = 0
        AND (
          a.visibility_status = 'PUBLIC'
          <if test="userId != null and userId > 0">
            OR (a.visibility_status = 'PRIVATE' AND a.user_id = #{userId})
            OR (a.visibility_status = 'GROUP' AND (a.user_id = #{userId}
              <if test="groupCodes != null and groupCodes.size() > 0">
                OR EXISTS (
                  SELECT 1 FROM CTN_APP_GROUP_ACL acl
                  WHERE acl.app_id = a.id
                    AND acl.deleted_flag = 0
                    AND acl.group_code IN
                    <foreach collection="groupCodes" item="groupCode" open="(" separator="," close=")">
                      #{groupCode}
                    </foreach>
                )
              </if>
            ))
          </if>
          <if test="(userId == null or userId &lt;= 0) and groupCodes != null and groupCodes.size() > 0">
            OR (a.visibility_status = 'GROUP' AND EXISTS (
                SELECT 1 FROM CTN_APP_GROUP_ACL acl
                WHERE acl.app_id = a.id
                  AND acl.deleted_flag = 0
                  AND acl.group_code IN
                  <foreach collection="groupCodes" item="groupCode" open="(" separator="," close=")">
                    #{groupCode}
                  </foreach>
            ))
          </if>
        )
        ORDER BY a.id DESC
        LIMIT #{limit} OFFSET #{offset}
        </script>
        """)
    List<AppEntity> selectVisibleApps(@Param("userId") Long userId,
                                      @Param("groupCodes") Set<String> groupCodes,
                                      @Param("offset") long offset,
                                      @Param("limit") long limit);
}
