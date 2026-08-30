package io.github.shizuki.site.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.baomidou.mybatisplus.core.toolkit.GlobalConfigUtils;
import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.entity.AlbumPhotoEntity;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.entity.WeatherSnapshotEntity;
import io.github.shizuki.site.common.mybatis.JsonStringTypeHandler;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonalContentEntityMappingTest {

    private static final MybatisConfiguration CONFIGURATION = new MybatisConfiguration();

    @BeforeAll
    static void configureLogicDeleteContract() {
        GlobalConfigUtils.getGlobalConfig(CONFIGURATION).getDbConfig().setLogicDeleteField("deleted");
    }

    @Test
    void contentEntitiesMapEveryFoundationColumn() {
        assertMapping(PhotoEntity.class, "CTN_PHOTO", "id", fields(
            "originalAssetId", "original_asset_id",
            "title", "title_text",
            "altText", "alt_text",
            "capturedAtDraft", "captured_at_draft",
            "publishedLocationLabel", "published_location_label",
            "processingStatus", "processing_status",
            "recycleTime", "recycle_time",
            "purgeAfter", "purge_after"
        ));
        assertMapping(AlbumEntity.class, "CTN_ALBUM", "id", fields(
            "publicSlug", "public_slug",
            "title", "title_text",
            "summary", "summary_text",
            "coverPhotoId", "cover_photo_id",
            "lifecycleStatus", "lifecycle_status",
            "visibilityStatus", "visibility_status",
            "featured", "featured_flag",
            "sortNum", "sort_num",
            "publishTime", "publish_time",
            "restoreLifecycleStatus", "restore_lifecycle_status",
            "recycleTime", "recycle_time",
            "purgeAfter", "purge_after"
        ));
        assertMapping(AlbumPhotoEntity.class, "CTN_ALBUM_PHOTO", "id", fields(
            "albumId", "album_id",
            "photoId", "photo_id",
            "mediaRefId", "media_ref_id",
            "sortNum", "sort_num",
            "caption", "caption_text",
            "downloadMode", "download_mode",
            "deliveryRevoked", "delivery_revoked_flag"
        ));
        assertMapping(MomentEntity.class, "CTN_MOMENT", "id", fields(
            "publicId", "public_id",
            "body", "body_text",
            "lifecycleStatus", "lifecycle_status",
            "visibilityStatus", "visibility_status",
            "featured", "featured_flag",
            "pinned", "pinned_flag",
            "publishTime", "publish_time",
            "restoreLifecycleStatus", "restore_lifecycle_status",
            "recycleTime", "recycle_time",
            "purgeAfter", "purge_after"
        ));
        assertMapping(MomentPhotoEntity.class, "CTN_MOMENT_PHOTO", "id", fields(
            "momentId", "moment_id",
            "photoId", "photo_id",
            "mediaRefId", "media_ref_id",
            "sortNum", "sort_num",
            "deliveryRevoked", "delivery_revoked_flag"
        ));
        assertMapping(SiteLocationEntity.class, "CTN_SITE_LOCATION", "id", fields(
            "displayName", "display_name",
            "latitude", "latitude_value",
            "longitude", "longitude_value",
            "timezone", "timezone_code",
            "enabled", "enabled_flag"
        ));
        assertMapping(SiteWidgetConfigEntity.class, "CTN_SITE_WIDGET_CONFIG", "singleton_key", fields(
            "activeLocationId", "active_location_id",
            "weatherEnabled", "weather_enabled_flag",
            "weatherMaxStaleMinutes", "weather_max_stale_minutes",
            "quoteSourceMode", "quote_source_mode",
            "hitokotoEnabled", "hitokoto_enabled_flag"
        ));
        assertMapping(QuoteEntity.class, "CTN_QUOTE", "id", fields(
            "text", "quote_text",
            "author", "author_text",
            "sourceTitle", "source_title",
            "categoryCode", "category_code",
            "providerCode", "provider_code",
            "providerUuid", "provider_uuid",
            "sourceUrl", "source_url",
            "approvalStatus", "approval_status",
            "enabled", "enabled_flag"
        ));
        assertMapping(DailyQuoteSnapshotEntity.class, "CTN_DAILY_QUOTE_SNAPSHOT", "id", fields(
            "quoteDate", "quote_date",
            "quoteId", "quote_id",
            "text", "quote_text",
            "author", "author_text",
            "sourceTitle", "source_title",
            "categoryCode", "category_code",
            "providerCode", "provider_code",
            "providerUuid", "provider_uuid",
            "sourceUrl", "source_url",
            "stale", "stale_flag",
            "fetchedAt", "fetched_at"
        ));
        assertMapping(WeatherSnapshotEntity.class, "CTN_WEATHER_SNAPSHOT", "id", fields(
            "siteLocationId", "site_location_id",
            "providerCode", "provider_code",
            "payloadJson", "payload_json",
            "observedAt", "observed_at",
            "fetchedAt", "fetched_at"
        ));
    }

    @Test
    void mediaVariantMapsItsIdempotencyAndProcessingColumns() {
        assertMapping(MediaAssetVariantEntity.class, "MDA_ASSET_VARIANT", "id", fields(
            "sourceAssetId", "source_asset_id",
            "variantAssetId", "variant_asset_id",
            "variantCode", "variant_code",
            "deliveryScope", "delivery_scope",
            "width", "width_value",
            "height", "height_value",
            "processorVersion", "processor_version",
            "processStatus", "process_status",
            "retryCount", "retry_count",
            "lastError", "last_error"
        ));
    }

    @Test
    void weatherPayloadUsesTheCrossDialectJsonHandler() {
        assertThat(tableInfo(WeatherSnapshotEntity.class).getFieldList())
            .filteredOn(field -> field.getProperty().equals("payloadJson"))
            .extracting(TableFieldInfo::getTypeHandler)
            .containsExactly(JsonStringTypeHandler.class);
    }

    @Test
    void recycleLifecycleIsSeparateFromPermanentPurgeTombstone() {
        for (Class<?> entityType : new Class<?>[] {AlbumEntity.class, MomentEntity.class}) {
            TableInfo tableInfo = tableInfo(entityType);
            assertThat(tableInfo.getFieldList())
                .filteredOn(field -> field.getProperty().equals("lifecycleStatus"))
                .extracting(TableFieldInfo::isLogicDelete)
                .containsExactly(false);
            assertThat(tableInfo.getLogicDeleteFieldInfo())
                .extracting(TableFieldInfo::getProperty, TableFieldInfo::getColumn)
                .containsExactly("deleted", "deleted_flag");
        }
    }

    private static void assertMapping(
        Class<?> entityType,
        String tableName,
        String keyColumn,
        Map<String, String> entityFields
    ) {
        TableInfo tableInfo = tableInfo(entityType);
        assertThat(tableInfo.getTableName()).isEqualTo(tableName);
        assertThat(tableInfo.getKeyColumn()).isEqualTo(keyColumn);

        Map<String, String> expected = new LinkedHashMap<>(entityFields);
        expected.put("createdAt", "create_time");
        expected.put("updatedAt", "update_time");
        expected.put("deleted", "deleted_flag");
        expected.put("version", "version_num");

        Map<String, String> actual = tableInfo.getFieldList().stream()
            .collect(Collectors.toMap(
                TableFieldInfo::getProperty,
                TableFieldInfo::getColumn,
                (left, right) -> right,
                LinkedHashMap::new
            ));
        assertThat(actual).containsExactlyInAnyOrderEntriesOf(expected);
    }

    private static TableInfo tableInfo(Class<?> entityType) {
        TableInfo existing = TableInfoHelper.getTableInfo(entityType);
        if (existing != null) {
            return existing;
        }
        MapperBuilderAssistant assistant = new MapperBuilderAssistant(CONFIGURATION, entityType.getName());
        assistant.setCurrentNamespace(entityType.getName());
        return TableInfoHelper.initTableInfo(assistant, entityType);
    }

    private static Map<String, String> fields(String... values) {
        Map<String, String> result = new LinkedHashMap<>();
        for (int index = 0; index < values.length; index += 2) {
            result.put(values[index], values[index + 1]);
        }
        return result;
    }
}
