package io.github.shizuki.site.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.shizuki.site.content.entity.QuoteEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface QuoteMapper extends BaseMapper<QuoteEntity> {

    @Select("""
        SELECT id, quote_text, author_text, source_title, category_code, provider_code,
               provider_uuid, source_url, approval_status, enabled_flag,
               create_time, update_time, deleted_flag, version_num
        FROM CTN_QUOTE
        WHERE deleted_flag = 0
        ORDER BY id DESC
        LIMIT #{limit}
        """)
    List<QuoteEntity> selectAdminList(@Param("limit") int limit);

    @Select("""
        SELECT id, quote_text, author_text, source_title, category_code, provider_code,
               provider_uuid, source_url, approval_status, enabled_flag,
               create_time, update_time, deleted_flag, version_num
        FROM CTN_QUOTE
        WHERE approval_status = 'APPROVED'
          AND enabled_flag = 1
          AND deleted_flag = 0
        ORDER BY id ASC
        LIMIT #{limit}
        """)
    List<QuoteEntity> selectApprovedEnabled(@Param("limit") int limit);

    @Update("""
        UPDATE CTN_QUOTE
        SET quote_text = #{text},
            author_text = #{author},
            source_title = #{sourceTitle},
            category_code = #{categoryCode},
            provider_code = #{providerCode},
            provider_uuid = #{providerUuid},
            source_url = #{sourceUrl},
            approval_status = 'DRAFT',
            enabled_flag = 0,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int updateContentVersioned(
        @Param("id") long id,
        @Param("expectedVersion") int expectedVersion,
        @Param("text") String text,
        @Param("author") String author,
        @Param("sourceTitle") String sourceTitle,
        @Param("categoryCode") String categoryCode,
        @Param("providerCode") String providerCode,
        @Param("providerUuid") String providerUuid,
        @Param("sourceUrl") String sourceUrl
    );

    @Update("""
        UPDATE CTN_QUOTE
        SET approval_status = #{approvalStatus},
            enabled_flag = #{enabled},
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int reviewVersioned(
        @Param("id") long id,
        @Param("expectedVersion") int expectedVersion,
        @Param("approvalStatus") String approvalStatus,
        @Param("enabled") int enabled
    );

    @Update("""
        UPDATE CTN_QUOTE
        SET enabled_flag = 0,
            deleted_flag = 1,
            update_time = CURRENT_TIMESTAMP,
            version_num = version_num + 1
        WHERE id = #{id}
          AND version_num = #{expectedVersion}
          AND deleted_flag = 0
        """)
    int softDeleteVersioned(
        @Param("id") long id,
        @Param("expectedVersion") int expectedVersion
    );
}
