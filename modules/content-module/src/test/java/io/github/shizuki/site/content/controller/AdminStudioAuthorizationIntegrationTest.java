package io.github.shizuki.site.content.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.github.shizuki.common.security.aspect.PermissionAspect;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AclChecker;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import io.github.shizuki.site.content.controller.album.AdminAlbumController;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.config.PersonalContentStudioFeatureAspect;
import io.github.shizuki.site.content.service.album.AlbumPhotoCommandService;
import io.github.shizuki.site.content.service.album.AlbumService;
import io.github.shizuki.site.content.service.album.admin.AlbumAdminQueryService;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/** Exercises a real studio URL through MVC and the production permission aspect. */
class AdminStudioAuthorizationIntegrationTest {

    private AnnotationConfigWebApplicationContext context;
    private MockMvc mockMvc;
    private AlbumAdminQueryService queryService;
    private PersonalContentFeatureProperties featureProperties;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigWebApplicationContext();
        context.setServletContext(new MockServletContext());
        context.register(TestConfiguration.class);
        context.refresh();
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        queryService = context.getBean(AlbumAdminQueryService.class);
        featureProperties = context.getBean(PersonalContentFeatureProperties.class);
        when(queryService.list(false, 1)).thenReturn(List.of());
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
        context.close();
    }

    @Test
    void directStudioUrlRejectsAnonymousAndNonAdminBeforeReadingProtectedData() throws Exception {
        mockMvc.perform(get("/api/v1/admin/life/albums").param("limit", "1"))
            .andExpect(status().isUnauthorized())
            .andExpect(jsonPath("$.code").value("UNAUTHORIZED"));

        LoginUserContext.set(new LoginUser(
            8L,
            Set.of("USER"),
            Set.of("life.content.manage")
        ));
        mockMvc.perform(get("/api/v1/admin/life/albums").param("limit", "1"))
            .andExpect(status().isForbidden())
            .andExpect(jsonPath("$.code").value("FORBIDDEN"));

        verify(queryService, never()).list(false, 1);

        LoginUserContext.set(new LoginUser(
            7L,
            Set.of("ADMIN"),
            Set.of("life.content.manage")
        ));
        mockMvc.perform(get("/api/v1/admin/life/albums").param("limit", "1"))
            .andExpect(status().isOk());

        verify(queryService).list(false, 1);
        assertThat(context.getBean(AdminAlbumController.class)).isNotNull();
    }

    @Test
    void closesStudioEndpointsBeforeTheirManagementServicesRun() throws Exception {
        featureProperties.setStudioEnabled(false);
        LoginUserContext.set(new LoginUser(
            7L,
            Set.of("ADMIN"),
            Set.of("life.content.manage")
        ));

        mockMvc.perform(get("/api/v1/admin/life/albums").param("limit", "1"))
            .andExpect(status().isNotFound())
            .andExpect(jsonPath("$.code").value("FEATURE_DISABLED"));

        verify(queryService, never()).list(false, 1);
    }

    @Configuration(proxyBeanMethods = false)
    @EnableWebMvc
    @EnableAspectJAutoProxy(proxyTargetClass = true)
    static class TestConfiguration {

        @Bean
        PermissionAspect permissionAspect(ObjectProvider<AclChecker> aclCheckerProvider) {
            return new PermissionAspect(aclCheckerProvider);
        }

        @Bean
        GlobalExceptionHandler globalExceptionHandler() {
            return new GlobalExceptionHandler();
        }

        @Bean
        PersonalContentFeatureProperties personalContentFeatureProperties() {
            PersonalContentFeatureProperties properties = new PersonalContentFeatureProperties();
            properties.setEnabled(true);
            properties.setStudioEnabled(true);
            return properties;
        }

        @Bean
        PersonalContentStudioFeatureAspect personalContentStudioFeatureAspect(
            PersonalContentFeatureProperties properties
        ) {
            return new PersonalContentStudioFeatureAspect(properties);
        }

        @Bean
        AlbumService albumService() {
            return mock(AlbumService.class);
        }

        @Bean
        AlbumPhotoCommandService albumPhotoCommandService() {
            return mock(AlbumPhotoCommandService.class);
        }

        @Bean
        AlbumAdminQueryService albumAdminQueryService() {
            return mock(AlbumAdminQueryService.class);
        }

        @Bean
        AdminAlbumController adminAlbumController(
            AlbumService albumService,
            AlbumPhotoCommandService photoCommandService,
            AlbumAdminQueryService queryService
        ) {
            return new AdminAlbumController(albumService, photoCommandService, queryService);
        }
    }
}
