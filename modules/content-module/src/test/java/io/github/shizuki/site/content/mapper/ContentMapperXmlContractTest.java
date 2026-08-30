package io.github.shizuki.site.content.mapper;

import static org.assertj.core.api.Assertions.assertThatCode;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import org.junit.jupiter.api.Test;

class ContentMapperXmlContractTest {

    @Test
    void allAnnotatedMapperStatementsAreValidMybatisXml() {
        MybatisConfiguration configuration = new MybatisConfiguration();

        assertThatCode(() -> configuration.addMappers("io.github.shizuki.site.content.mapper"))
            .doesNotThrowAnyException();
    }
}
