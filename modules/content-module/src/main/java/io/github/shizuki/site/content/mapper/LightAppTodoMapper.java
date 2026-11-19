package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LightAppTodoMapper extends BaseMapper<LightAppTodoEntity> {

    @Select("SELECT MAX(sort_num) FROM CTN_LA_TODO WHERE user_id = #{userId} AND deleted_flag = 0")
    Integer selectMaxSortNumByUserId(@Param("userId") Long userId);

    /** Must be invoked within the same transaction as the related workflow mutation. */
    default LightAppTodoEntity selectOwnedByIdForUpdate(Long todoId, Long userId) {
        return selectOne(new LambdaQueryWrapper<LightAppTodoEntity>()
            .eq(LightAppTodoEntity::getId, todoId)
            .eq(LightAppTodoEntity::getUserId, userId)
            .eq(LightAppTodoEntity::getDeleted, 0)
            .last("FOR UPDATE"));
    }
}
