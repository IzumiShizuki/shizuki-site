package io.github.shizuki.site.content.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.content.response.PostSidebarResponse;
import io.github.shizuki.site.content.response.PostPublicationCalendarResponse;
import io.github.shizuki.site.content.response.PostSummary;
import io.github.shizuki.site.content.entity.PostCategoryPolicyEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyGroupEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.entity.PostContentEntity;
import io.github.shizuki.site.content.mapper.AppGroupAclMapper;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.AuthorProfileMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.NotionSyncJobMapper;
import io.github.shizuki.site.content.mapper.PostCategoryMetaMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyGroupMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyMapper;
import io.github.shizuki.site.content.mapper.PostContentMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.PostPresentationMapper;
import io.github.shizuki.site.content.mapper.PostTagMapper;
import io.github.shizuki.site.content.service.impl.ContentServiceImpl;
import io.github.shizuki.site.content.support.NotionBlockCodec;
import io.github.shizuki.site.content.support.NotionProperties;
import io.github.shizuki.site.content.support.PostNotionSyncService;
import io.github.shizuki.site.content.support.PostPresentationGeneratorClient;
import io.github.shizuki.site.content.support.PostPresentationTemplateService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContentServiceImplVisibilityTest {

    @Mock
    private PostMapper postMapper;

    @Mock
    private AppMapper appMapper;

    @Mock
    private ContentReportMapper contentReportMapper;

    @Mock
    private PostGroupAclMapper postGroupAclMapper;

    @Mock
    private AppGroupAclMapper appGroupAclMapper;

    @Mock
    private PostTagMapper postTagMapper;

    @Mock
    private PostCategoryPolicyMapper postCategoryPolicyMapper;

    @Mock
    private PostCategoryPolicyGroupMapper postCategoryPolicyGroupMapper;

    @Mock
    private PostCategoryMetaMapper postCategoryMetaMapper;

    @Mock
    private PostContentMapper postContentMapper;

    @Mock
    private PostPresentationMapper postPresentationMapper;

    @Mock
    private NotionSyncJobMapper notionSyncJobMapper;

    @Mock
    private AuthorProfileMapper authorProfileMapper;

    @Mock
    private ObjectStorageClient objectStorageClient;

    @Mock
    private PostPresentationGeneratorClient postPresentationGeneratorClient;

    @Mock
    private Executor postPresentationExecutor;

    @Mock
    private PostNotionSyncService postNotionSyncService;

    @Mock
    private Executor notionSyncExecutor;

    private ContentServiceImpl contentService;

    @BeforeAll
    static void initializeProjectionMetadata() {
        TableInfoHelper.initTableInfo(new MapperBuilderAssistant(new MybatisConfiguration(), ""), PostContentEntity.class);
    }

    @BeforeEach
    void setUp() {
        ObjectMapper objectMapper = new ObjectMapper();
        contentService = new ContentServiceImpl(
            postMapper,
            appMapper,
            contentReportMapper,
            postGroupAclMapper,
            appGroupAclMapper,
            postTagMapper,
            postCategoryPolicyMapper,
            postCategoryPolicyGroupMapper,
            postCategoryMetaMapper,
            postContentMapper,
            postPresentationMapper,
            notionSyncJobMapper,
            authorProfileMapper,
            objectStorageClient,
            objectMapper,
            new NotionProperties(),
            new NotionBlockCodec(objectMapper),
            postNotionSyncService,
            new PostPresentationTemplateService(),
            postPresentationGeneratorClient,
            postPresentationExecutor,
            notionSyncExecutor
        );

        Mockito.lenient().when(postTagMapper.selectList(Mockito.any())).thenReturn(List.of());
        Mockito.lenient().when(postCategoryPolicyMapper.selectList(Mockito.any())).thenReturn(List.of());
        Mockito.lenient().when(postCategoryMetaMapper.selectList(Mockito.any())).thenReturn(List.of());
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldHidePrivateAndRestrictedPostsFromGuestList() {
        PostEntity publicPost = publishedPost(1L, 11L, "Public", "life", "PUBLIC", LocalDateTime.of(2026, 3, 28, 8, 0));
        PostEntity privatePost = publishedPost(2L, 12L, "Private", "secret", "PRIVATE", LocalDateTime.of(2026, 3, 28, 9, 0));
        PostEntity restrictedPost = publishedPost(3L, 13L, "Restricted", "game", "PUBLIC", LocalDateTime.of(2026, 3, 28, 10, 0));
        PostCategoryPolicyEntity restrictedPolicy = enabledPolicy("game");

        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(publicPost, privatePost, restrictedPost));
        Mockito.when(postCategoryPolicyMapper.selectOne(Mockito.any())).thenReturn(null, restrictedPolicy);
        Mockito.when(postCategoryPolicyGroupMapper.selectList(Mockito.any())).thenReturn(List.of(group("game", "USER")));

        PageResponse<PostSummary> response = contentService.listPosts(1, 10, null, null, null, null, null);

        Assertions.assertEquals(1L, response.total());
        Assertions.assertEquals(1, response.items().size());
        Assertions.assertEquals(1L, response.items().get(0).postId());
        Assertions.assertEquals("Public", response.items().get(0).title());
    }

    @Test
    void shouldKeepSidebarLatestPostsLimitedToVisiblePosts() {
        PostEntity publicPost = publishedPost(1L, 11L, "Public", "life", "PUBLIC", LocalDateTime.of(2026, 3, 28, 8, 0));
        PostEntity privatePost = publishedPost(2L, 12L, "Private", "secret", "PRIVATE", LocalDateTime.of(2026, 3, 28, 9, 0));
        PostEntity restrictedPost = publishedPost(3L, 13L, "Restricted", "game", "PUBLIC", LocalDateTime.of(2026, 3, 28, 10, 0));
        PostCategoryPolicyEntity restrictedPolicy = enabledPolicy("game");

        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(publicPost, privatePost, restrictedPost));
        Mockito.when(postCategoryPolicyMapper.selectOne(Mockito.any())).thenReturn(null, restrictedPolicy);
        Mockito.when(postCategoryPolicyGroupMapper.selectList(Mockito.any())).thenReturn(List.of(group("game", "USER")));

        PostSidebarResponse response = contentService.getPostSidebar();

        Assertions.assertEquals(1, response.latestPosts().size());
        Assertions.assertEquals(1L, response.latestPosts().get(0).postId());
        long visibleCategoryTotal = response.categories().stream().mapToLong(PostSidebarResponse.CategoryStatItem::count).sum();
        Assertions.assertEquals(1L, visibleCategoryTotal);
    }

    @Test
    void shouldCountEveryPublicPostButHidePrivatePostsFromCalendarForAdmin() {
        LoginUserContext.set(new LoginUser(12L, Set.of("ADMIN"), Set.of()));
        PostEntity first = publishedPost(1L, 11L, "First", "life", "PUBLIC", LocalDateTime.of(2026, 3, 28, 8, 0));
        PostEntity second = publishedPost(2L, 11L, "Second", "life", "PUBLIC", LocalDateTime.of(2026, 3, 28, 10, 0));
        PostEntity privatePost = publishedPost(3L, 12L, "Private", "life", "PRIVATE", LocalDateTime.of(2026, 3, 28, 12, 0));
        PostEntity outsideMonth = publishedPost(4L, 11L, "Older", "life", "PUBLIC", LocalDateTime.of(2026, 2, 28, 8, 0));
        PostEntity restrictedPost = publishedPost(5L, 11L, "Restricted", "secret", "PUBLIC", LocalDateTime.of(2026, 3, 28, 14, 0));
        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(restrictedPost, first, second, privatePost, outsideMonth));
        Mockito.when(postCategoryPolicyMapper.selectOne(Mockito.any())).thenReturn(enabledPolicy("secret"), null, null, null);
        Mockito.when(postCategoryPolicyGroupMapper.selectList(Mockito.any())).thenReturn(List.of(group("secret", "ADMIN")));

        PostPublicationCalendarResponse response = contentService.getPublishedPostCalendar("2026-03");

        Assertions.assertEquals("2026-03", response.month());
        Assertions.assertEquals(List.of(new PostPublicationCalendarResponse.DayCount("2026-03-28", 2L)), response.days());
    }

    @Test
    void shouldAllowOwnerToSeeOwnPrivatePostInPublishedList() {
        LoginUserContext.set(new LoginUser(12L, Set.of("USER"), Set.of()));

        PostEntity publicPost = publishedPost(1L, 11L, "Public", "life", "PUBLIC", LocalDateTime.of(2026, 3, 28, 8, 0));
        PostEntity ownPrivatePost = publishedPost(2L, 12L, "Mine", "secret", "PRIVATE", LocalDateTime.of(2026, 3, 28, 9, 0));

        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(publicPost, ownPrivatePost));
        Mockito.when(postCategoryPolicyMapper.selectOne(Mockito.any())).thenReturn(null);

        PageResponse<PostSummary> response = contentService.listPosts(1, 10, null, null, null, null, null);

        Assertions.assertEquals(2L, response.total());
        Assertions.assertEquals(List.of(2L, 1L), response.items().stream().map(PostSummary::postId).toList());
    }

    @Test
    void shouldListPostsOwnedBySignedGuestAuthorIdentity() {
        LoginUserContext.set(new LoginUser(-42L, Set.of("GUEST_AUTHOR"), Set.of()));
        PostEntity draft = publishedPost(9L, -42L, "Guest draft", "life", "PUBLIC", LocalDateTime.of(2026, 7, 24, 9, 0));
        draft.setStatusCode("DRAFT");
        Mockito.when(postMapper.selectAuthorPosts(-42L)).thenReturn(List.of(draft));

        PageResponse<?> response = contentService.listMyPosts(1, 10, null, null);

        Assertions.assertEquals(1L, response.total());
        Mockito.verify(postMapper).selectAuthorPosts(-42L);
    }

    @Test
    void bodySearchMatchesTermsAcrossFieldsAndReturnsAnEscapedTextContext() {
        PostEntity article = publishedPost(1L, 11L, "相机旅行", "life", "PUBLIC", LocalDateTime.of(2026, 10, 16, 8, 0));
        PostEntity other = publishedPost(2L, 12L, "相机散记", "life", "PUBLIC", article.getPublishedAt());
        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(article, other));
        PostContentEntity body = new PostContentEntity();
        body.setPostId(1L);
        body.setMarkdownCache("# 记录\n" + "前文 ".repeat(150) + "星空曝光 <img src=x onerror=alert(1)> 后文");
        Mockito.when(postContentMapper.selectList(Mockito.any())).thenReturn(List.of(body));

        var response = contentService.listPosts(1, 10, "相机 星空曝光", null, null);

        org.assertj.core.api.Assertions.assertThat(response.items()).extracting(PostSummary::postId).containsExactly(1L);
        org.assertj.core.api.Assertions.assertThat(response.items().get(0).searchExcerpt())
            .contains("星空曝光").doesNotContain("<img").hasSizeLessThanOrEqualTo(222);
        Mockito.verifyNoInteractions(objectStorageClient);
    }

    @Test
    void bodySearchReflectsTextUpdatesAndDoesNotIncludePrivateOrDraftArticles() {
        PostEntity article = publishedPost(1L, 11L, "记录", "life", "PUBLIC", LocalDateTime.of(2026, 10, 16, 8, 0));
        PostEntity hidden = publishedPost(2L, 12L, "隐藏", "life", "PRIVATE", article.getPublishedAt());
        PostEntity draft = publishedPost(3L, 13L, "草稿", "life", "PUBLIC", article.getPublishedAt());
        draft.setStatusCode("DRAFT");
        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(article, hidden, draft));
        PostContentEntity before = new PostContentEntity();
        before.setPostId(1L);
        before.setMarkdownCache("只在正文里的月光倒影");
        PostContentEntity after = new PostContentEntity();
        after.setPostId(1L);
        after.setMarkdownCache("正文已经更新");
        Mockito.when(postContentMapper.selectList(Mockito.any())).thenReturn(List.of(before), List.of(after));

        org.assertj.core.api.Assertions.assertThat(contentService.listPosts(1, 10, "月光倒影", null, null).items())
            .extracting(PostSummary::postId).containsExactly(1L);
        org.assertj.core.api.Assertions.assertThat(contentService.listPosts(1, 10, "月光倒影", null, null).items()).isEmpty();
    }

    @Test
    void discoverableCatalogUsesGuestPoliciesEvenForAdministratorRequests() {
        LoginUserContext.set(new LoginUser(12L, Set.of("ADMIN"), Set.of()));
        PostEntity publicPost = publishedPost(1L, 11L, "公开", "life", "PUBLIC", LocalDateTime.of(2026, 10, 16, 8, 0));
        PostEntity privatePost = publishedPost(2L, 12L, "私密", "life", "PRIVATE", publicPost.getPublishedAt());
        PostEntity restricted = publishedPost(3L, 12L, "受限", "secret", "PUBLIC", publicPost.getPublishedAt());
        Mockito.when(postMapper.selectList(Mockito.any())).thenReturn(List.of(publicPost, privatePost, restricted));
        Mockito.when(postCategoryPolicyMapper.selectOne(Mockito.any())).thenReturn(null, enabledPolicy("secret"));
        Mockito.when(postCategoryPolicyGroupMapper.selectList(Mockito.any())).thenReturn(List.of(group("secret", "ADMIN")));

        org.assertj.core.api.Assertions.assertThat(contentService.listDiscoverablePosts())
            .extracting(io.github.shizuki.site.content.response.PublicPostDocument::postId).containsExactly(1L);
        Mockito.when(postMapper.selectById(2L)).thenReturn(privatePost);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> contentService.getDiscoverablePost(2L))
            .isInstanceOf(io.github.shizuki.common.core.error.BusinessException.class);
    }

    @Test
    void publishesNotificationIdentityOnlyOnTransition() {
        LoginUserContext.set(new LoginUser(11L, Set.of("ADMIN"), Set.of("blog.post.publish")));
        PostEntity post = publishedPost(1L, 11L, "新文章", "life", "PUBLIC", LocalDateTime.now());
        post.setStatusCode("DRAFT");
        PostContentEntity body = new PostContentEntity();
        body.setPostId(1L);
        body.setMarkdownCache("正文内容");
        Mockito.when(postMapper.selectById(1L)).thenReturn(post);
        Mockito.when(postContentMapper.selectOne(Mockito.any())).thenReturn(body);
        var events = Mockito.mock(org.springframework.context.ApplicationEventPublisher.class);
        contentService.setPublicationEvents(events);

        contentService.publishMyPost(1L);
        contentService.publishMyPost(1L);

        Mockito.verify(events, Mockito.times(1)).publishEvent((Object)
            new io.github.shizuki.site.notification.WebsiteContentPublishedEvent("POST", "1", 11L));
    }

    private PostEntity publishedPost(
        Long id,
        Long userId,
        String title,
        String categoryCode,
        String visibility,
        LocalDateTime publishedAt
    ) {
        PostEntity entity = new PostEntity();
        entity.setId(id);
        entity.setUserId(userId);
        entity.setTitle(title);
        entity.setSummary(title + " summary");
        entity.setCategoryCode(categoryCode);
        entity.setVisibility(visibility);
        entity.setStatusCode("PUBLISHED");
        entity.setWordCount(120L);
        entity.setReadingMinutes(1);
        entity.setLikeCount(0L);
        entity.setCreatedAt(publishedAt.minusHours(1));
        entity.setUpdatedAt(publishedAt.minusMinutes(10));
        entity.setPublishedAt(publishedAt);
        return entity;
    }

    private PostCategoryPolicyEntity enabledPolicy(String categoryCode) {
        PostCategoryPolicyEntity entity = new PostCategoryPolicyEntity();
        entity.setCategoryCode(categoryCode);
        entity.setEnabledFlag(1);
        return entity;
    }

    private PostCategoryPolicyGroupEntity group(String categoryCode, String groupCode) {
        PostCategoryPolicyGroupEntity entity = new PostCategoryPolicyGroupEntity();
        entity.setCategoryCode(categoryCode);
        entity.setGroupCode(groupCode);
        return entity;
    }
}
