package io.github.shizuki.site.content.mapper.admin;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;

class AlbumAdminReadMapperContractTest {

    @Test
    void projectionsNeverSelectStorageOrSignedDeliveryDetails() {
        String sql = Arrays.stream(AlbumAdminReadMapper.class.getDeclaredMethods())
            .map(this::selectSql)
            .collect(Collectors.joining("\n"))
            .toLowerCase(Locale.ROOT);

        assertThat(sql)
            .contains("media_ref_id", "variant_code", "process_status")
            .doesNotContain("bucket_name")
            .doesNotContain("object_key")
            .doesNotContain("variant_asset_id")
            .doesNotContain("last_error")
            .doesNotContain("signature");
    }

    private String selectSql(Method method) {
        Select select = method.getAnnotation(Select.class);
        return select == null ? "" : String.join(" ", select.value());
    }
}
