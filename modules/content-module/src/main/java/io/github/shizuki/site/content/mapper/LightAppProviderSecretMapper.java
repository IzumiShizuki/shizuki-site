package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.user.entity.UserProviderSecretEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LightAppProviderSecretMapper extends BaseMapper<UserProviderSecretEntity> {
}
