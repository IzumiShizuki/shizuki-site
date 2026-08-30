package io.github.shizuki.site.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MediaAssetVariantMapper extends BaseMapper<MediaAssetVariantEntity> {

    @Select("""
        SELECT *
        FROM MDA_ASSET_VARIANT
        WHERE source_asset_id = #{sourceAssetId}
          AND variant_code = #{variantCode}
          AND delivery_scope = #{deliveryScope}
          AND processor_version = #{processorVersion}
          AND deleted_flag = 0
        LIMIT 1
        """)
    MediaAssetVariantEntity findByIdentity(@Param("sourceAssetId") Long sourceAssetId,
                                           @Param("variantCode") String variantCode,
                                           @Param("deliveryScope") String deliveryScope,
                                           @Param("processorVersion") String processorVersion);

    @Select("""
        SELECT *
        FROM MDA_ASSET_VARIANT
        WHERE source_asset_id = #{sourceAssetId}
          AND delivery_scope = 'PUBLIC_MATERIALIZED'
          AND processor_version = #{processorVersion}
          AND process_status IN ('READY', 'REVOKING')
          AND deleted_flag = 0
        ORDER BY id ASC
        """)
    List<MediaAssetVariantEntity> findRevocablePublicBySource(
        @Param("sourceAssetId") Long sourceAssetId,
        @Param("processorVersion") String processorVersion
    );

    @Select("""
        SELECT *
        FROM MDA_ASSET_VARIANT
        WHERE source_asset_id = #{sourceAssetId}
          AND deleted_flag = 0
        ORDER BY id ASC
        """)
    List<MediaAssetVariantEntity> findAllBySource(@Param("sourceAssetId") Long sourceAssetId);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET deleted_flag = 1,
            update_time = #{purgedAt},
            version_num = version_num + 1
        WHERE source_asset_id = #{sourceAssetId}
          AND deleted_flag = 0
        """)
    int tombstoneBySource(@Param("sourceAssetId") Long sourceAssetId,
                          @Param("purgedAt") LocalDateTime purgedAt);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'REVOKING',
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND process_status = 'READY'
          AND delivery_scope = 'PUBLIC_MATERIALIZED'
          AND deleted_flag = 0
        """)
    int markRevoking(@Param("id") Long id, @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'REVOKED',
            last_error = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND process_status = 'REVOKING'
          AND delivery_scope = 'PUBLIC_MATERIALIZED'
          AND deleted_flag = 0
        """)
    int markRevoked(@Param("id") Long id, @Param("expectedVersion") int expectedVersion);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'PENDING',
            retry_count = 0,
            last_error = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND process_status = 'REVOKED'
          AND deleted_flag = 0
        """)
    int reactivateRevoked(@Param("id") Long id, @Param("expectedVersion") int expectedVersion);

    @Select("""
        SELECT *
        FROM MDA_ASSET_VARIANT
        WHERE deleted_flag = 0
          AND (
            process_status = 'PENDING'
            OR (process_status = 'FAILED' AND retry_count < #{maxRetries})
            OR (
              process_status = 'PROCESSING'
              AND update_time < #{staleBefore}
              AND retry_count < #{maxRetries}
            )
          )
        ORDER BY update_time ASC, id ASC
        LIMIT 1
        """)
    MediaAssetVariantEntity findNextClaimCandidate(@Param("staleBefore") LocalDateTime staleBefore,
                                                    @Param("maxRetries") int maxRetries);

    /**
     * 通过版本号比较并交换领取任务。初次领取不计为重试；FAILED 或过期 PROCESSING
     * 被再次领取时才递增 retry_count。
     */
    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'PROCESSING',
            retry_count = CASE
              WHEN process_status = 'PENDING' THEN retry_count
              ELSE retry_count + 1
            END,
            last_error = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
          AND (
            process_status = 'PENDING'
            OR (process_status = 'FAILED' AND retry_count < #{maxRetries})
            OR (
              process_status = 'PROCESSING'
              AND update_time < #{staleBefore}
              AND retry_count < #{maxRetries}
            )
          )
        """)
    int claim(@Param("id") Long id,
              @Param("expectedVersion") int expectedVersion,
              @Param("staleBefore") LocalDateTime staleBefore,
              @Param("maxRetries") int maxRetries);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET variant_asset_id = #{variantAssetId},
            width_value = #{width},
            height_value = #{height},
            process_status = 'READY',
            last_error = NULL,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND process_status = 'PROCESSING'
          AND deleted_flag = 0
        """)
    int markReady(@Param("id") Long id,
                  @Param("expectedVersion") int expectedVersion,
                  @Param("variantAssetId") Long variantAssetId,
                  @Param("width") Integer width,
                  @Param("height") Integer height);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'FAILED',
            last_error = #{lastError},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND process_status = 'PROCESSING'
          AND deleted_flag = 0
        """)
    int markFailed(@Param("id") Long id,
                   @Param("expectedVersion") int expectedVersion,
                   @Param("lastError") String lastError);

    @Update("""
        UPDATE MDA_ASSET_VARIANT
        SET process_status = 'FAILED',
            last_error = 'processing lease expired after retry limit',
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE process_status = 'PROCESSING'
          AND update_time < #{staleBefore}
          AND retry_count >= #{maxRetries}
          AND deleted_flag = 0
        """)
    int failExhaustedStaleClaims(@Param("staleBefore") LocalDateTime staleBefore,
                                 @Param("maxRetries") int maxRetries);
}
