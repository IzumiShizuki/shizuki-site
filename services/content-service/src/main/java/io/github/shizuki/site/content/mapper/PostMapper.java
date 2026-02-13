package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.PostEntity;
import java.util.List;
import java.util.Set;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostMapper extends BaseMapper<PostEntity> {

    @Select("""
        <script>
        SELECT COUNT(1)
        FROM CTN_POST p
        WHERE p.deleted_flag = 0
        AND (
          p.visibility_status = 'PUBLIC'
          <if test="userId != null and userId > 0">
            OR (p.visibility_status = 'PRIVATE' AND p.user_id = #{userId})
            OR (p.visibility_status = 'GROUP' AND (p.user_id = #{userId}
              <if test="groupCodes != null and groupCodes.size() > 0">
                OR EXISTS (
                  SELECT 1 FROM CTN_POST_GROUP_ACL acl
                  WHERE acl.post_id = p.id
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
            OR (p.visibility_status = 'GROUP' AND EXISTS (
                SELECT 1 FROM CTN_POST_GROUP_ACL acl
                WHERE acl.post_id = p.id
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
    Long countVisiblePosts(@Param("userId") Long userId, @Param("groupCodes") Set<String> groupCodes);

    @Select("""
        <script>
        SELECT p.*
        FROM CTN_POST p
        WHERE p.deleted_flag = 0
        AND (
          p.visibility_status = 'PUBLIC'
          <if test="userId != null and userId > 0">
            OR (p.visibility_status = 'PRIVATE' AND p.user_id = #{userId})
            OR (p.visibility_status = 'GROUP' AND (p.user_id = #{userId}
              <if test="groupCodes != null and groupCodes.size() > 0">
                OR EXISTS (
                  SELECT 1 FROM CTN_POST_GROUP_ACL acl
                  WHERE acl.post_id = p.id
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
            OR (p.visibility_status = 'GROUP' AND EXISTS (
                SELECT 1 FROM CTN_POST_GROUP_ACL acl
                WHERE acl.post_id = p.id
                  AND acl.deleted_flag = 0
                  AND acl.group_code IN
                  <foreach collection="groupCodes" item="groupCode" open="(" separator="," close=")">
                    #{groupCode}
                  </foreach>
            ))
          </if>
        )
        ORDER BY p.id DESC
        LIMIT #{limit} OFFSET #{offset}
        </script>
        """)
    List<PostEntity> selectVisiblePosts(@Param("userId") Long userId,
                                        @Param("groupCodes") Set<String> groupCodes,
                                        @Param("offset") long offset,
                                        @Param("limit") long limit);
}
