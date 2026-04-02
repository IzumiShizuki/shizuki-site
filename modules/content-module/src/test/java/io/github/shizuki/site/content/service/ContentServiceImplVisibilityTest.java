package io.github.shizuki.site.content.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.content.response.PostSidebarResponse;
import io.github.shizuki.site.content.response.PostSummary;
import io.github.shizuki.site.content.entity.PostCategoryPolicyEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyGroupEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.mapper.AppGroupAclMapper;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.AuthorProfileMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.PostCategoryMetaMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyGroupMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.PostPresentationMapper;
import io.github.shizuki.site.content.mapper.PostTagMapper;
import io.github.shizuki.site.content.service.impl.ContentServiceImpl;
import io.github.shizuki.site.content.support.PostPresentationGeneratorClient;
import io.github.shizuki.site.content.support.PostPresentationTemplateService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    private PostPresentationMapper postPresentationMapper;

    @Mock
    private AuthorProfileMapper authorProfileMapper;

    @Mock
    private ObjectStorageClient objectStorageClient;

    @Mock
    private PostPresentationGeneratorClient postPresentationGeneratorClient;

    @Mock
    private Executor postPresentationExecutor;

    private ContentServiceImpl contentService;

    @BeforeEach
    void setUp() {
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
            postPresentationMapper,
            authorProfileMapper,
            objectStorageClient,
            new ObjectMapper(),
            new PostPresentationTemplateService(),
            postPresentationGeneratorClient,
            postPresentationExecutor
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
