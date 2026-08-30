package io.github.shizuki.site.content.mapper;

import static org.assertj.core.api.Assertions.assertThatCode;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import org.junit.jupiter.api.Test;

class MomentPublicationMediaMapperContractTest {

    @Test
    void annotatedPublicationQueryIsValidMybatisXml() {
        MybatisConfiguration configuration = new MybatisConfiguration();

        assertThatCode(() -> configuration.addMapper(MomentPublicationMediaMapper.class))
            .doesNotThrowAnyException();
    }
}
