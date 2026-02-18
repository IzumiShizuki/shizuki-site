package io.github.shizuki.site.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OAuthBindingMapper extends BaseMapper<OAuthBindingEntity> {
}
