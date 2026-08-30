package io.github.shizuki.site.content.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
import io.github.shizuki.site.content.mapper.publiccontent.PublicContentCacheTargetMapper;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import org.apache.ibatis.mapping.MappedStatement;
import org.junit.jupiter.api.Test;

class PersonalContentMapperContractTest {

    @Test
    void everyFoundationTableHasATypedBaseMapper() {
        assertMapper(PhotoMapper.class, PhotoEntity.class);
        assertMapper(AlbumMapper.class, AlbumEntity.class);
        assertMapper(AlbumPhotoMapper.class, AlbumPhotoEntity.class);
        assertMapper(MomentMapper.class, MomentEntity.class);
        assertMapper(MomentPhotoMapper.class, MomentPhotoEntity.class);
        assertMapper(SiteLocationMapper.class, SiteLocationEntity.class);
        assertMapper(SiteWidgetConfigMapper.class, SiteWidgetConfigEntity.class);
        assertMapper(QuoteMapper.class, QuoteEntity.class);
        assertMapper(DailyQuoteSnapshotMapper.class, DailyQuoteSnapshotEntity.class);
        assertMapper(WeatherSnapshotMapper.class, WeatherSnapshotEntity.class);
    }

    @Test
    void associationQueriesUseStableAdministratorDefinedOrder() {
        assertThat(sql(AlbumPhotoMapper.class, "selectByAlbumIdOrdered", Map.of("albumId", 7L)))
            .contains("FROM CTN_ALBUM_PHOTO")
            .contains("WHERE album_id = ?")
            .contains("AND deleted_flag = 0")
            .endsWith("ORDER BY sort_num ASC, id ASC");
        assertThat(sql(MomentPhotoMapper.class, "selectByMomentIdOrdered", Map.of("momentId", 9L)))
            .contains("FROM CTN_MOMENT_PHOTO")
            .contains("WHERE moment_id = ?")
            .contains("AND deleted_flag = 0")
            .endsWith("ORDER BY sort_num ASC, id ASC");
    }

    @Test
    void recycledRowsRemainQueryableUntilPermanentPurgeTombstonesThem() {
        assertThat(sql(AlbumMapper.class, "selectRecycled", Map.of()))
            .contains("lifecycle_status = 'RECYCLED'")
            .contains("deleted_flag = 0")
            .endsWith("ORDER BY recycle_time DESC, id DESC");
        assertThat(sql(MomentMapper.class, "selectRecycled", Map.of()))
            .contains("lifecycle_status = 'RECYCLED'")
            .contains("deleted_flag = 0")
            .endsWith("ORDER BY recycle_time DESC, id DESC");
    }

    @Test
    void mediaStateInvalidationResolvesOnlyOpaqueContentIdentifiers() {
        String byPhoto = sql(PublicContentCacheTargetMapper.class, "selectByPhotoId", Map.of("photoId", 17L));
        assertThat(byPhoto)
            .contains("'ALBUM' AS content_type")
            .contains("a.public_slug AS public_identifier")
            .contains("'MOMENT' AS content_type")
            .contains("m.public_id AS public_identifier")
            .doesNotContain("object_key")
            .doesNotContain("bucket");

        String byAsset = sql(
            PublicContentCacheTargetMapper.class,
            "selectBySourceAssetId",
            Map.of("sourceAssetId", 29L)
        );
        assertThat(byAsset)
            .contains("p.original_asset_id = ?")
            .doesNotContain("object_key")
            .doesNotContain("bucket");
    }

    private static void assertMapper(Class<?> mapperType, Class<?> entityType) {
        ParameterizedType baseMapper = (ParameterizedType) mapperType.getGenericInterfaces()[0];
        assertThat(baseMapper.getRawType()).isEqualTo(BaseMapper.class);
        assertThat(baseMapper.getActualTypeArguments()).containsExactly(entityType);
    }

    private static String sql(Class<?> mapperType, String statementName, Object parameter) {
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.addMapper(mapperType);
        MappedStatement statement = configuration.getMappedStatement(mapperType.getName() + "." + statementName);
        return statement.getBoundSql(parameter).getSql().replaceAll("\\s+", " ").trim();
    }
}
