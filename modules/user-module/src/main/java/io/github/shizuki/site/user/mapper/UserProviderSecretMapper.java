package io.github.shizuki.site.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.user.entity.UserProviderSecretEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 provider 密钥数据访问器。
 */
@Mapper
public interface UserProviderSecretMapper extends BaseMapper<UserProviderSecretEntity> {
}
