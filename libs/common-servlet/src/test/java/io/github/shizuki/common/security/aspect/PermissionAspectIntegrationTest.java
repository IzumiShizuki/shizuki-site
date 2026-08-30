package io.github.shizuki.common.security.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AclChecker;
import io.github.shizuki.common.web.exception.GlobalExceptionHandler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.assertj.core.api.Assertions.assertThat;

class PermissionAspectIntegrationTest {

    private AnnotationConfigWebApplicationContext applicationContext;
    private MockMvc mockMvc;
    private ProtectedResourceProbe resourceProbe;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setServletContext(new MockServletContext());
        applicationContext.register(SecurityTestConfiguration.class);
        applicationContext.refresh();
        mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
        resourceProbe = applicationContext.getBean(ProtectedResourceProbe.class);
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
        applicationContext.close();
    }

    @Test
    void shouldEnforceClassLevelGroupBeforeControllerExecution() throws Exception {
        LoginUserContext.set(user("USER"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/resources/existing"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));

        assertThat(resourceProbe.invocationCount()).isZero();
    }

    @Test
    void shouldEnforceMethodLevelPermissionBeforeControllerExecution() throws Exception {
        LoginUserContext.set(user("USER"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/method/resources/existing"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));

        assertThat(resourceProbe.invocationCount()).isZero();

        LoginUserContext.set(userWithPermissions("USER", "resource.read"));
        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/method/resources/existing"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.value").value("protected-secret"));

        assertThat(resourceProbe.invocationCount()).isEqualTo(1);
    }

    @Test
    void shouldCombineClassGroupAndMethodPermissionConjunctively() throws Exception {
        LoginUserContext.set(userWithPermissions("USER", "resource.read"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/scoped/existing"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));

        assertThat(resourceProbe.invocationCount()).isZero();

        LoginUserContext.set(user("ADMIN"));
        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/scoped/existing"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.value").value("protected-secret"));

        assertThat(resourceProbe.invocationCount()).isEqualTo(1);
    }

    @Test
    void shouldLetMethodGroupOverrideClassGroupOnlyWithinGroupDimension() throws Exception {
        LoginUserContext.set(user("EDITOR"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/editor-only/existing"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.value").value("protected-secret"));

        LoginUserContext.set(user("ADMIN"));
        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/editor-only/existing"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));
    }

    @Test
    void shouldLetMethodPermissionOverrideClassPermissionOnlyWithinPermissionDimension() throws Exception {
        LoginUserContext.set(userWithPermissions("USER", "resource.write"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/permission-override/existing"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.value").value("protected-secret"));

        LoginUserContext.set(userWithPermissions("USER", "resource.read"));
        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/permission-override/existing"))
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"));
    }

    @Test
    void shouldReturn401WithoutRevealingWhetherProtectedResourceExists() throws Exception {
        MvcResult existing = mockMvc.perform(
                MockMvcRequestBuilders.get("/test/security/class/resources/existing")
            )
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"))
            .andReturn();
        MvcResult missing = mockMvc.perform(
                MockMvcRequestBuilders.get("/test/security/class/resources/missing")
            )
            .andExpect(MockMvcResultMatchers.status().isUnauthorized())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("UNAUTHORIZED"))
            .andReturn();

        assertSameAuthorizationFailure(existing, missing);
        assertThat(resourceProbe.invocationCount()).isZero();
    }

    @Test
    void shouldReturn403WithoutRevealingWhetherProtectedResourceExists() throws Exception {
        LoginUserContext.set(user("USER"));

        MvcResult existing = mockMvc.perform(
                MockMvcRequestBuilders.get("/test/security/class/resources/existing")
            )
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"))
            .andReturn();
        MvcResult missing = mockMvc.perform(
                MockMvcRequestBuilders.get("/test/security/class/resources/missing")
            )
            .andExpect(MockMvcResultMatchers.status().isForbidden())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("FORBIDDEN"))
            .andReturn();

        assertSameAuthorizationFailure(existing, missing);
        assertThat(resourceProbe.invocationCount()).isZero();
    }

    @Test
    void shouldReturnProtectedResourceForAuthorizedAdmin() throws Exception {
        LoginUserContext.set(user("ADMIN"));

        mockMvc.perform(MockMvcRequestBuilders.get("/test/security/class/resources/existing"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.value").value("protected-secret"));

        assertThat(resourceProbe.invocationCount()).isEqualTo(1);
    }

    private void assertSameAuthorizationFailure(MvcResult existing, MvcResult missing) throws Exception {
        String existingCode = JsonTestSupport.read(existing, "code");
        String missingCode = JsonTestSupport.read(missing, "code");
        String existingDetail = JsonTestSupport.read(existing, "detail");
        String missingDetail = JsonTestSupport.read(missing, "detail");

        assertThat(missingCode).isEqualTo(existingCode);
        assertThat(missingDetail).isEqualTo(existingDetail);
        assertThat(existing.getResponse().getContentAsString()).doesNotContain("protected-secret");
        assertThat(missing.getResponse().getContentAsString()).doesNotContain("protected-secret");
    }

    private LoginUser user(String group) {
        return new LoginUser(7L, Set.of(group), Set.of());
    }

    private LoginUser userWithPermissions(String group, String... permissions) {
        return new LoginUser(7L, Set.of(group), Set.of(permissions));
    }

    @Configuration(proxyBeanMethods = false)
    @EnableWebMvc
    @EnableAspectJAutoProxy(proxyTargetClass = true)
    static class SecurityTestConfiguration {

        @Bean
        PermissionAspect permissionAspect(ObjectProvider<AclChecker> aclCheckerProvider) {
            return new PermissionAspect(aclCheckerProvider);
        }

        @Bean
        GlobalExceptionHandler globalExceptionHandler() {
            return new GlobalExceptionHandler();
        }

        @Bean
        ProtectedResourceProbe protectedResourceProbe() {
            return new ProtectedResourceProbe();
        }

        @Bean
        ClassGroupController classGroupController(ProtectedResourceProbe resourceProbe) {
            return new ClassGroupController(resourceProbe);
        }

        @Bean
        MethodPermissionController methodPermissionController(ProtectedResourceProbe resourceProbe) {
            return new MethodPermissionController(resourceProbe);
        }

        @Bean
        PermissionOverrideController permissionOverrideController(ProtectedResourceProbe resourceProbe) {
            return new PermissionOverrideController(resourceProbe);
        }
    }

    @RestController
    @RequestMapping("/test/security/class")
    @RequireGroup("ADMIN")
    static class ClassGroupController {

        private final ProtectedResourceProbe resourceProbe;

        ClassGroupController(ProtectedResourceProbe resourceProbe) {
            this.resourceProbe = resourceProbe;
        }

        @GetMapping("/resources/{resourceId}")
        Map<String, String> getClassProtectedResource(@PathVariable("resourceId") String resourceId) {
            return resourceProbe.read(resourceId);
        }

        @GetMapping("/scoped/{resourceId}")
        @RequirePermission("resource.read")
        Map<String, String> getScopedResource(@PathVariable("resourceId") String resourceId) {
            return resourceProbe.read(resourceId);
        }

        @GetMapping("/editor-only/{resourceId}")
        @RequireGroup("EDITOR")
        Map<String, String> getEditorResource(@PathVariable("resourceId") String resourceId) {
            return resourceProbe.read(resourceId);
        }
    }

    @RestController
    @RequestMapping("/test/security/method")
    static class MethodPermissionController {

        private final ProtectedResourceProbe resourceProbe;

        MethodPermissionController(ProtectedResourceProbe resourceProbe) {
            this.resourceProbe = resourceProbe;
        }

        @GetMapping("/resources/{resourceId}")
        @RequirePermission("resource.read")
        Map<String, String> getMethodProtectedResource(@PathVariable("resourceId") String resourceId) {
            return resourceProbe.read(resourceId);
        }
    }

    @RestController
    @RequestMapping("/test/security/permission-override")
    @RequirePermission("resource.read")
    static class PermissionOverrideController {

        private final ProtectedResourceProbe resourceProbe;

        PermissionOverrideController(ProtectedResourceProbe resourceProbe) {
            this.resourceProbe = resourceProbe;
        }

        @GetMapping("/{resourceId}")
        @RequirePermission("resource.write")
        Map<String, String> getWriteProtectedResource(@PathVariable("resourceId") String resourceId) {
            return resourceProbe.read(resourceId);
        }
    }

    static class ProtectedResourceProbe {

        private final AtomicInteger invocations = new AtomicInteger();

        Map<String, String> read(String resourceId) {
            invocations.incrementAndGet();
            if (!"existing".equals(resourceId)) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Protected resource not found");
            }
            return Map.of("value", "protected-secret");
        }

        int invocationCount() {
            return invocations.get();
        }
    }

    static final class JsonTestSupport {

        private JsonTestSupport() {
        }

        static String read(MvcResult result, String field) throws Exception {
            return new com.fasterxml.jackson.databind.ObjectMapper()
                .readTree(result.getResponse().getContentAsByteArray())
                .path(field)
                .asText();
        }
    }
}
