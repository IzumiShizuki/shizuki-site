package io.github.shizuki.site.content.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Locale;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;

class DailyQuoteSnapshotMapperSqlMappingTest {

    @Test
    void explicitSnapshotQueriesAliasStorageColumnsToEntityProperties() throws Exception {
        assertEntityProjection("selectByQuoteDate");
        assertEntityProjection("selectLatestBefore");
    }

    private void assertEntityProjection(String methodName) throws Exception {
        Method method = DailyQuoteSnapshotMapper.class.getDeclaredMethod(methodName, LocalDate.class);
        Select select = method.getAnnotation(Select.class);

        assertThat(select).isNotNull();
        String sql = String.join(" ", select.value())
            .replaceAll("\\s+", " ")
            .toLowerCase(Locale.ROOT);

        assertThat(sql).contains(
            "quote_text as text",
            "author_text as author",
            "stale_flag as stale",
            "create_time as created_at",
            "update_time as updated_at",
            "deleted_flag as deleted",
            "version_num as version"
        );
    }
}
