package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.LightAppTodoDevEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LightAppTodoDevMapper extends BaseMapper<LightAppTodoDevEntity> {

    /**
     * Only opted-in Todos. Filter authorization before ordering/limiting the index.
     * Escape the query itself so percent, underscore and exclamation mark stay literal.
     */
    @Select("""
        <script>
        SELECT t.id
        FROM CTN_LA_TODO_DEV d
        JOIN CTN_LA_TODO t ON t.id = d.todo_id
        WHERE t.user_id = #{userId} AND t.deleted_flag = 0
        <if test="projectId != null">
            AND t.project_id = #{projectId}
        </if>
        <if test="q != null and q != ''">
            AND LOWER(t.title_text) LIKE CONCAT(
                '%', REPLACE(REPLACE(REPLACE(LOWER(#{q,jdbcType=VARCHAR}), '!', '!!'), '%', '!%'), '_', '!_'), '%'
            ) ESCAPE '!'
        </if>
        ORDER BY d.update_time DESC, d.todo_id DESC
        <if test="bounded">LIMIT 50</if>
        </script>
        """)
    List<Long> searchIds(@Param("userId") Long userId, @Param("projectId") Long projectId, @Param("q") String q,
                         @Param("bounded") boolean bounded);

    /** The caller must hold an authorized lock on the source Todo in this transaction. */
    @Update("""
        UPDATE CTN_LA_TODO_DEV
        SET stage_code = #{stageCode}, status_code = #{statusCode}, next_step_text = #{nextStep,jdbcType=VARCHAR},
            version_num = version_num + 1, update_time = CURRENT_TIMESTAMP
        WHERE todo_id = #{todoId} AND version_num = #{expectedVersion}
        """)
    int compareAndSet(
        @Param("todoId") Long todoId,
        @Param("expectedVersion") Integer expectedVersion,
        @Param("stageCode") String stageCode,
        @Param("statusCode") String statusCode,
        @Param("nextStep") String nextStep
    );
}
