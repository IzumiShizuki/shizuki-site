package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.DailyQuoteSnapshotEntity;
import java.time.LocalDate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DailyQuoteSnapshotMapper extends BaseMapper<DailyQuoteSnapshotEntity> {

    @Select("""
        SELECT id, quote_date, quote_id, quote_text AS text, author_text AS author, source_title,
               category_code, provider_code, provider_uuid, source_url, stale_flag AS stale,
               fetched_at, create_time AS created_at, update_time AS updated_at,
               deleted_flag AS deleted, version_num AS version
        FROM CTN_DAILY_QUOTE_SNAPSHOT
        WHERE quote_date = #{quoteDate}
          AND deleted_flag = 0
        LIMIT 1
        """)
    DailyQuoteSnapshotEntity selectByQuoteDate(@Param("quoteDate") LocalDate quoteDate);

    @Select("""
        SELECT id, quote_date, quote_id, quote_text AS text, author_text AS author, source_title,
               category_code, provider_code, provider_uuid, source_url, stale_flag AS stale,
               fetched_at, create_time AS created_at, update_time AS updated_at,
               deleted_flag AS deleted, version_num AS version
        FROM CTN_DAILY_QUOTE_SNAPSHOT
        WHERE quote_date < #{quoteDate}
          AND deleted_flag = 0
        ORDER BY quote_date DESC, id DESC
        LIMIT 1
        """)
    DailyQuoteSnapshotEntity selectLatestBefore(@Param("quoteDate") LocalDate quoteDate);
}
