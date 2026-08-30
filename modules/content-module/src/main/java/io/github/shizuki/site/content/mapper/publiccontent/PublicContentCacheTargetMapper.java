package io.github.shizuki.site.content.mapper.publiccontent;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/** Resolves only opaque aggregate identifiers; media/storage identities never enter cache keys. */
@Mapper
public interface PublicContentCacheTargetMapper {

    @Select("""
        SELECT DISTINCT 'ALBUM' AS content_type,
                        a.public_slug AS public_identifier
        FROM CTN_ALBUM_PHOTO ap
        JOIN CTN_ALBUM a ON a.id = ap.album_id
        WHERE ap.photo_id = #{photoId}
          AND a.public_slug IS NOT NULL
        UNION
        SELECT DISTINCT 'MOMENT' AS content_type,
                        m.public_id AS public_identifier
        FROM CTN_MOMENT_PHOTO mp
        JOIN CTN_MOMENT m ON m.id = mp.moment_id
        WHERE mp.photo_id = #{photoId}
          AND m.public_id IS NOT NULL
        """)
    List<PublicContentCacheTargetRow> selectByPhotoId(@Param("photoId") long photoId);

    @Select("""
        SELECT DISTINCT 'ALBUM' AS content_type,
                        a.public_slug AS public_identifier
        FROM CTN_PHOTO p
        JOIN CTN_ALBUM_PHOTO ap ON ap.photo_id = p.id
        JOIN CTN_ALBUM a ON a.id = ap.album_id
        WHERE p.original_asset_id = #{sourceAssetId}
          AND a.public_slug IS NOT NULL
        UNION
        SELECT DISTINCT 'MOMENT' AS content_type,
                        m.public_id AS public_identifier
        FROM CTN_PHOTO p
        JOIN CTN_MOMENT_PHOTO mp ON mp.photo_id = p.id
        JOIN CTN_MOMENT m ON m.id = mp.moment_id
        WHERE p.original_asset_id = #{sourceAssetId}
          AND m.public_id IS NOT NULL
        """)
    List<PublicContentCacheTargetRow> selectBySourceAssetId(@Param("sourceAssetId") long sourceAssetId);
}
