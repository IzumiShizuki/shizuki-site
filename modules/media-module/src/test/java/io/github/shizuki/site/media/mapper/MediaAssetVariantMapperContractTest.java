package io.github.shizuki.site.media.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;

class MediaAssetVariantMapperContractTest {

    @Test
    void claimUsesVersionCompareAndSwapAndBoundsRetries() throws Exception {
        Method method = MediaAssetVariantMapper.class.getMethod(
            "claim",
            Long.class,
            int.class,
            java.time.LocalDateTime.class,
            int.class
        );
        String sql = String.join(" ", method.getAnnotation(Update.class).value());

        assertThat(sql)
            .contains("version_num = #{expectedVersion}")
            .contains("version_num = version_num + 1")
            .contains("retry_count < #{maxRetries}")
            .contains("update_time < #{staleBefore}");
    }

    @Test
    void identityLookupUsesTheCompleteIdempotencyTuple() throws Exception {
        Method method = MediaAssetVariantMapper.class.getMethod(
            "findByIdentity",
            Long.class,
            String.class,
            String.class,
            String.class
        );
        String sql = String.join(" ", method.getAnnotation(Select.class).value());

        assertThat(java.util.List.of(
            "source_asset_id = #{sourceAssetId}",
            "variant_code = #{variantCode}",
            "delivery_scope = #{deliveryScope}",
            "processor_version = #{processorVersion}"
        )).allSatisfy(fragment -> assertThat(sql).contains(fragment));
    }
}
