package io.github.shizuki.site.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.user.entity.GroupPermissionEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupPermissionMapper extends BaseMapper<GroupPermissionEntity> {
}
