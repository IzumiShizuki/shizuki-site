package io.github.shizuki.site.monolith.notification;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.*;
import io.github.shizuki.site.content.mapper.*;
import io.github.shizuki.site.content.response.*;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import java.util.List;
import org.junit.jupiter.api.*;

class WebsiteNotificationIntegrationTest {
    ContentService posts;
    PostMapper postMapper;
    MomentMapper momentMapper;
    PublicMomentQueryService moments;
    WebsiteNotificationIntegration integration;
    @BeforeEach void setup() {
        posts=mock(ContentService.class); postMapper=mock(PostMapper.class);
        momentMapper=mock(MomentMapper.class); moments=mock(PublicMomentQueryService.class);
        integration=new WebsiteNotificationIntegration(posts,postMapper,momentMapper,moments);
    }
    @Test void articlesAlwaysUseAnonymousPublicContract() {
        PostEntity row=new PostEntity(); row.setUserId(9L);
        when(postMapper.selectById(10L)).thenReturn(row);
        when(posts.getDiscoverablePost(10L)).thenReturn(new PublicPostDocument(10L,"标题","摘要",null,"life",null,"私有的存储详情"));
        var content=integration.resolve("POST","10").orElseThrow();
        assertThat(content.authorId()).isEqualTo(9L);
        assertThat(content.readingPath()).isEqualTo("/read/posts/10");
        assertThat(content.summary()).isEqualTo("摘要");
        when(posts.getDiscoverablePost(10L)).thenThrow(new BusinessException(ErrorCode.NOT_FOUND));
        assertThat(integration.resolve("POST","10")).isEmpty();
    }
    @Test void withdrawnOrUnlistedMomentsNeverReachPublicCache() {
        var row=moment(); row.setVisibilityStatus("UNLISTED");
        when(momentMapper.selectById(1L)).thenReturn(row);
        assertThat(integration.resolve("MOMENT","1")).isEmpty();
        row.setVisibilityStatus("PUBLIC"); row.setLifecycleStatus("ARCHIVED");
        assertThat(integration.resolve("MOMENT","1")).isEmpty();
        row.setLifecycleStatus("PUBLISHED"); row.setDeleted(1);
        assertThat(integration.resolve("MOMENT","1")).isEmpty();
        verifyNoInteractions(moments);
    }
    @Test void publicMomentUsesOriginalAuthorAndOpaqueReadingLink() {
        var row=moment(); when(momentMapper.selectById(1L)).thenReturn(row);
        when(moments.detail("mom_example")).thenReturn(new PublicMomentDetailResponse(
            new PublicMomentResponse("mom_example","今天的动态",false,false,null,List.of()),false,false));
        var content=integration.resolve("MOMENT","1").orElseThrow();
        assertThat(content.authorId()).isEqualTo(9L);
        assertThat(content.summary()).isEqualTo("今天的动态");
        assertThat(content.readingPath()).isEqualTo("/read/moments/mom_example");
        row.setAuthorUserId(null);
        assertThat(integration.resolve("MOMENT","1")).isEmpty();
    }
    @Test void unexpectedFailuresAreRetriedRatherThanRecordedAsWithdrawn() {
        var row=new PostEntity(); row.setUserId(9L); when(postMapper.selectById(10L)).thenReturn(row);
        when(posts.getDiscoverablePost(10L)).thenThrow(new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE));
        assertThatThrownBy(()->integration.resolve("POST","10")).isInstanceOf(BusinessException.class);
        assertThat(integration.resolve("POST","garbage")).isEmpty();
    }
    MomentEntity moment() {
        var row=new MomentEntity(); row.setAuthorUserId(9L); row.setPublicId("mom_example");
        row.setLifecycleStatus("PUBLISHED"); row.setVisibilityStatus("PUBLIC"); row.setDeleted(0); return row;
    }
}
