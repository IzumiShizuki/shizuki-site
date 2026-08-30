package io.github.shizuki.site.media.mapper.admin;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;

class AdminMediaDerivativeRetryMapperContractTest {

    @Test
    void retryIsVersionedFailedOnlyAndProjectionHasNoStorageDetails() {
        String sql = Arrays.stream(AdminMediaDerivativeRetryMapper.class.getDeclaredMethods())
            .map(this::sql)
            .collect(Collectors.joining("\n"))
            .toLowerCase(Locale.ROOT);

        assertThat(sql)
            .contains("process_status = 'failed'", "version_num = #{expectedversion}")
            .contains("process_status = 'pending'", "last_error = null")
            .doesNotContain("bucket_name")
            .doesNotContain("object_key")
            .doesNotContain("variant_asset_id")
            .doesNotContain("signed_url");
    }

    private String sql(Method method) {
        Select select = method.getAnnotation(Select.class);
        Update update = method.getAnnotation(Update.class);
        if (select != null) {
            return String.join(" ", select.value());
        }
        return update == null ? "" : String.join(" ", update.value());
    }
}
