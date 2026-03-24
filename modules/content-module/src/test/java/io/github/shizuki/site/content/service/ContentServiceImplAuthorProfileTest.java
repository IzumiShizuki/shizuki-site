package io.github.shizuki.site.content.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.dto.AuthorProfileUpsertRequest;
import io.github.shizuki.site.content.entity.AuthorProfileEntity;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ContentServiceImplAuthorProfileTest {

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
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void shouldPreserveImageFieldsWhenSavingAuthorProfile() {
        AuthorProfileEntity existing = new AuthorProfileEntity();
        existing.setId(100L);
        existing.setAuthorCode("shizuki");
        existing.setEnabledFlag(1);
        existing.setProfileJson("{}");
        existing.setCreatedAt(LocalDateTime.of(2026, 3, 13, 18, 0));

        Mockito.when(authorProfileMapper.selectOne(Mockito.any())).thenReturn(existing);

        AuthorProfileUpsertRequest request = new AuthorProfileUpsertRequest();
        request.setEnabled(true);
        request.setProfileJson(buildProfileJson());

        AuthorProfileResponse response = contentService.upsertAdminAuthorProfile(request);

        ArgumentCaptor<AuthorProfileEntity> entityCaptor = ArgumentCaptor.forClass(AuthorProfileEntity.class);
        Mockito.verify(authorProfileMapper).updateById(entityCaptor.capture());

        String savedJson = entityCaptor.getValue().getProfileJson();
        Assertions.assertTrue(savedJson.contains("cover_image_url"));
        Assertions.assertTrue(savedJson.contains("journey-image.webp"));
        Assertions.assertTrue(savedJson.contains("intro-image.webp"));
        Assertions.assertTrue(savedJson.contains("browser_title"));
        Assertions.assertTrue(savedJson.contains("favicon_url"));

        Map<String, Object> hero = castMap(response.profileJson().get("hero"));
        Assertions.assertEquals("https://cdn.example.com/author-cover.webp", hero.get("cover_image_url"));

        List<?> journey = (List<?>) response.profileJson().get("journey");
        Map<String, Object> firstJourney = castMap(journey.get(0));
        Assertions.assertEquals("https://cdn.example.com/journey-image.webp", firstJourney.get("image_url"));

        Map<String, Object> about = castMap(response.profileJson().get("about"));
        Assertions.assertEquals("https://cdn.example.com/intro-image.webp", about.get("intro_image_url"));
        Assertions.assertEquals("https://cdn.example.com/mission-image.webp", about.get("mission_image_url"));
        Assertions.assertEquals("https://cdn.example.com/links-image.webp", about.get("links_image_url"));

        Map<String, Object> site = castMap(response.profileJson().get("site"));
        Assertions.assertEquals("Shizuki Site", site.get("browser_title"));
        Assertions.assertEquals("https://cdn.example.com/favicon.webp", site.get("favicon_url"));
    }

    private Map<String, Object> buildProfileJson() {
        Map<String, Object> hero = new LinkedHashMap<>();
        hero.put("greeting", "你好");
        hero.put("name", "Shizuki");
        hero.put("quote", "testing");
        hero.put("avatar_url", "https://cdn.example.com/avatar.webp");
        hero.put("cover_image_url", "https://cdn.example.com/author-cover.webp");

        Map<String, Object> identity = new LinkedHashMap<>();
        identity.put("birth_year", "2006");
        identity.put("school", "CJU");
        identity.put("major", "CS");
        identity.put("role", "Developer");
        identity.put("labels", List.of("A", "B"));

        Map<String, Object> journeyItem = new LinkedHashMap<>();
        journeyItem.put("year", "2026-03-13");
        journeyItem.put("title", "Profile images");
        journeyItem.put("description", "Ensure image fields survive normalization.");
        journeyItem.put("image_url", "https://cdn.example.com/journey-image.webp");
        journeyItem.put("stack", List.of("Vue3", "Spring Boot"));

        Map<String, Object> about = new LinkedHashMap<>();
        about.put("intro", List.of("intro"));
        about.put("mission", "mission");
        about.put("focus", List.of("focus"));
        about.put("music", List.of("music"));
        about.put("intro_image_url", "https://cdn.example.com/intro-image.webp");
        about.put("mission_image_url", "https://cdn.example.com/mission-image.webp");
        about.put("links_image_url", "https://cdn.example.com/links-image.webp");
        about.put("links", List.of(Map.of("label", "Blog", "url", "/#/blog")));

        Map<String, Object> profileJson = new LinkedHashMap<>();
        profileJson.put("hero", hero);
        profileJson.put("identity", identity);
        profileJson.put("skills", List.of("Java", "Vue3"));
        profileJson.put("journey", List.of(journeyItem));
        profileJson.put("about", about);
        profileJson.put("site", Map.of(
            "browser_title", "Shizuki Site",
            "favicon_url", "https://cdn.example.com/favicon.webp"
        ));
        return profileJson;
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> castMap(Object value) {
        return (Map<String, Object>) value;
    }
}
