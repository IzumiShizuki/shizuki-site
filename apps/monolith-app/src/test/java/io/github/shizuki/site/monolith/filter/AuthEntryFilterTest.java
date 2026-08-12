package io.github.shizuki.site.monolith.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.auth.GuestAuthorTokenService;
import io.github.shizuki.site.monolith.config.GatewayAuthProperties;
import io.github.shizuki.site.user.service.AuthService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.assertj.core.api.Assertions.assertThat;

class AuthEntryFilterTest {

    private static final String RESOLVE_PLAYBACK_PATH = "/api/v1/music/tracks/resolve-playback";
    private static final String TOWN_SCENES_PATH = "/api/v1/ai-town/scenes";
    private static final String TOWN_SCENE_DETAIL_PATH = "/api/v1/ai-town/scenes/library";
    private static final String TOWN_PUBLIC_MAP_PATH = "/api/v1/ai-town/public-map";
    private static final String ADMIN_TOWN_NPC_SESSION_PATH = "/api/v1/admin/ai-town/npcs/librarian/sessions";
    private static final String GUEST_AUTHOR_POSTS_PATH = "/api/v1/me/posts";
    private static final String GUEST_AUTHOR_CATEGORY_POLICIES_PATH = "/api/v1/me/posts/category-policies";
    private static final String AMBIENT_STATUS_PATH = "/api/v1/ambient-library/status";
    private static final String AMBIENT_SEARCH_PATH = "/api/v1/ambient-library/search";
    private static final String AMBIENT_IMPORT_PATH = "/api/v1/ambient-library/import";
    private static final String WALLPAPER_WORKSHOP_SEARCH_PATH = "/api/v1/home-wallpapers/discovery/workshop/search";
    private static final String WALLPAPER_WORKSHOP_ITEM_PATH = "/api/v1/home-wallpapers/discovery/workshop/items/2141505896";
    private static final String WALLPAPER_WALLHAVEN_SEARCH_PATH = "/api/v1/home-wallpapers/discovery/wallhaven/search";

    @Test
    void shouldAllowGuestResolvePlaybackWithoutToken() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(authService, List.of(RESOLVE_PLAYBACK_PATH));
        MockHttpServletRequest request = new MockHttpServletRequest("POST", RESOLVE_PLAYBACK_PATH);
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, captureGuestChain(invoked));

        assertThat(invoked).isTrue();
        assertThat(response.getStatus()).isEqualTo(200);
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldMatchGuestPathWhenApplicationHasContextPath() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(authService, List.of(RESOLVE_PLAYBACK_PATH));
        MockHttpServletRequest request = new MockHttpServletRequest("POST", "/shizuki" + RESOLVE_PLAYBACK_PATH);
        request.setContextPath("/shizuki");
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, captureGuestChain(invoked));

        assertThat(invoked).isTrue();
        assertThat(response.getStatus()).isEqualTo(200);
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldDowngradeInvalidTokenOnGuestResolvePlaybackPath() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        Mockito.when(authService.introspectByAccessToken("expired-token"))
            .thenThrow(new BusinessException(ErrorCode.UNAUTHORIZED, "expired"));
        AuthEntryFilter filter = newFilter(authService, List.of(RESOLVE_PLAYBACK_PATH));
        MockHttpServletRequest request = new MockHttpServletRequest("POST", RESOLVE_PLAYBACK_PATH);
        request.addHeader("Authorization", "Bearer expired-token");
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, captureGuestChain(invoked));

        assertThat(invoked).isTrue();
        assertThat(response.getStatus()).isEqualTo(200);
        Mockito.verify(authService).introspectByAccessToken("expired-token");
    }

    @Test
    void shouldAllowConfiguredAiTownPublicReadPathsWithoutToken() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(authService, configuredGuestPaths());

        for (String path : List.of(TOWN_SCENES_PATH, TOWN_SCENE_DETAIL_PATH, TOWN_PUBLIC_MAP_PATH)) {
            MockHttpServletRequest request = new MockHttpServletRequest("GET", path);
            MockHttpServletResponse response = new MockHttpServletResponse();
            AtomicBoolean invoked = new AtomicBoolean(false);

            filter.doFilter(request, response, captureGuestChain(invoked));

            assertThat(invoked).as(path).isTrue();
            assertThat(response.getStatus()).as(path).isEqualTo(200);
        }
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldAllowConfiguredWallpaperDiscoveryReadsWithoutToken() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(authService, configuredGuestPaths());

        for (String path : List.of(
            WALLPAPER_WORKSHOP_SEARCH_PATH,
            WALLPAPER_WORKSHOP_ITEM_PATH,
            WALLPAPER_WALLHAVEN_SEARCH_PATH
        )) {
            MockHttpServletRequest request = new MockHttpServletRequest("GET", path);
            MockHttpServletResponse response = new MockHttpServletResponse();
            AtomicBoolean invoked = new AtomicBoolean(false);

            filter.doFilter(request, response, captureGuestChain(invoked));

            assertThat(invoked).as(path).isTrue();
            assertThat(response.getStatus()).as(path).isEqualTo(200);
        }
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldRequireTokenForAdminTownNpcSessionPath() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(authService, configuredGuestPaths());
        MockHttpServletRequest request = new MockHttpServletRequest("POST", ADMIN_TOWN_NPC_SESSION_PATH);
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, (chainRequest, chainResponse) -> invoked.set(true));

        assertThat(invoked).isFalse();
        assertThat(response.getStatus()).isEqualTo(401);
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldResolveSignedGuestAuthorOnPostManagementPath() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        GuestAuthorTokenService tokenService = new GuestAuthorTokenService("test-guest-author-secret", 3600L);
        AuthEntryFilter filter = newFilter(authService, List.of(GUEST_AUTHOR_POSTS_PATH + "/**"), tokenService);
        GuestAuthorTokenService.GuestAuthorSession session = tokenService.issue();
        MockHttpServletRequest request = new MockHttpServletRequest("POST", GUEST_AUTHOR_POSTS_PATH);
        request.addHeader("X-Guest-Author-Token", session.token());
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, (chainRequest, chainResponse) -> {
            invoked.set(true);
            HttpServletRequest resolved = (HttpServletRequest) chainRequest;
            assertThat(resolved.getHeader("X-User-Id")).isEqualTo(String.valueOf(session.authorId()));
            assertThat(resolved.getHeader("X-User-Groups")).isEqualTo("GUEST_AUTHOR");
        });

        assertThat(invoked).isTrue();
        assertThat(response.getStatus()).isEqualTo(200);
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldNotGrantGuestAuthorAccessToAccountEditorFeatures() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        GuestAuthorTokenService tokenService = new GuestAuthorTokenService("test-guest-author-secret", 3600L);
        AuthEntryFilter filter = newFilter(authService, configuredGuestPaths(), tokenService);
        MockHttpServletRequest request = new MockHttpServletRequest("GET", GUEST_AUTHOR_CATEGORY_POLICIES_PATH);
        request.addHeader("X-Guest-Author-Token", tokenService.issue().token());
        MockHttpServletResponse response = new MockHttpServletResponse();
        AtomicBoolean invoked = new AtomicBoolean(false);

        filter.doFilter(request, response, (chainRequest, chainResponse) -> invoked.set(true));

        assertThat(invoked).isFalse();
        assertThat(response.getStatus()).isEqualTo(401);
        Mockito.verifyNoInteractions(authService);
    }

    @Test
    void shouldKeepAmbientDiscoveryPublicButRequireLoginForImport() throws Exception {
        AuthService authService = Mockito.mock(AuthService.class);
        AuthEntryFilter filter = newFilter(
            authService,
            configuredGuestPaths(),
            configuredPublicPaths(),
            new GuestAuthorTokenService("test-guest-author-secret", 3600L)
        );

        for (String path : List.of(AMBIENT_STATUS_PATH, AMBIENT_SEARCH_PATH)) {
            MockHttpServletRequest request = new MockHttpServletRequest("GET", path);
            MockHttpServletResponse response = new MockHttpServletResponse();
            AtomicBoolean invoked = new AtomicBoolean(false);
            filter.doFilter(request, response, (chainRequest, chainResponse) -> invoked.set(true));
            assertThat(invoked).as(path).isTrue();
            assertThat(response.getStatus()).as(path).isEqualTo(200);
        }

        MockHttpServletRequest importRequest = new MockHttpServletRequest("POST", AMBIENT_IMPORT_PATH);
        MockHttpServletResponse importResponse = new MockHttpServletResponse();
        AtomicBoolean importInvoked = new AtomicBoolean(false);
        filter.doFilter(importRequest, importResponse, (chainRequest, chainResponse) -> importInvoked.set(true));

        assertThat(importInvoked).isFalse();
        assertThat(importResponse.getStatus()).isEqualTo(401);
        Mockito.verifyNoInteractions(authService);
    }

    private static AuthEntryFilter newFilter(AuthService authService, List<String> guestPaths) {
        return newFilter(authService, guestPaths, new GuestAuthorTokenService("test-guest-author-secret", 3600L));
    }

    private static AuthEntryFilter newFilter(AuthService authService,
                                             List<String> guestPaths,
                                             GuestAuthorTokenService tokenService) {
        return newFilter(authService, guestPaths, List.of(), tokenService);
    }

    private static AuthEntryFilter newFilter(AuthService authService,
                                             List<String> guestPaths,
                                             List<String> publicPaths,
                                             GuestAuthorTokenService tokenService) {
        GatewayAuthProperties properties = new GatewayAuthProperties();
        properties.setGuestPaths(guestPaths);
        properties.setPublicPaths(publicPaths);
        properties.setGuestInvalidTokenPolicy("downgrade");
        return new AuthEntryFilter(properties, authService, tokenService, new ObjectMapper());
    }

    private static List<String> configuredGuestPaths() {
        return configuredPaths("guest-paths");
    }

    private static List<String> configuredPublicPaths() {
        return configuredPaths("public-paths");
    }

    private static List<String> configuredPaths(String propertyName) {
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        yaml.setResources(new ClassPathResource("application.yml"));
        Properties properties = yaml.getObject();
        assertThat(properties).isNotNull();

        List<String> paths = new ArrayList<>();
        for (int index = 0; ; index++) {
            String value = properties.getProperty(
                "shizuki.gateway.auth." + propertyName + "[" + index + "]");
            if (value == null) {
                return paths;
            }
            paths.add(value);
        }
    }

    private static FilterChain captureGuestChain(AtomicBoolean invoked) {
        return (request, response) -> {
            invoked.set(true);
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            assertThat(httpRequest.getHeader("X-User-Id")).isEqualTo("0");
            assertThat(httpRequest.getHeader("X-User-Groups")).isEqualTo("GUEST");
        };
    }
}
