package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.LightAppTodoDevEventEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import io.github.shizuki.site.content.tododev.TodoDevContract.StageClock;
import java.util.List;

@Mapper
public interface LightAppTodoDevEventMapper extends BaseMapper<LightAppTodoDevEventEntity> {
    @Select("""
        SELECT stage_code AS stage,
               MIN(CASE WHEN event_type = 'PROGRESS' AND status_code = 'IN_PROGRESS'
                        THEN create_time END) AS started_at,
               MAX(create_time) AS last_event_at
        FROM CTN_LA_TODO_DEV_EVENT WHERE todo_id = #{todoId} GROUP BY stage_code
        """)
    List<StageClock> stageClocks(@Param("todoId") Long todoId);
}
