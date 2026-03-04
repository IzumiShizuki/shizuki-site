package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.AuthorProfileEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorProfileMapper extends BaseMapper<AuthorProfileEntity> {
}
