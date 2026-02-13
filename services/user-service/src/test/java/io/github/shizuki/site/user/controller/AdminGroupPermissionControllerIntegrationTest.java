package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.dto.GroupPermissionsResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminGroupPermissionController.class)
class AdminGroupPermissionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldListGroupPermissionsSuccessfully() throws Exception {
        Mockito.when(userService.listGroupPermissions()).thenReturn(
            List.of(new GroupPermissionsResponse("ADMIN", Set.of("quota.policy.read")))
        );

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/groups/permissions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].group_code").value("ADMIN"));
    }

    @Test
    void shouldReplaceGroupPermissionsSuccessfully() throws Exception {
        Mockito.when(userService.replaceGroupPermissions(ArgumentMatchers.eq("family"), ArgumentMatchers.eq(Set.of("content.read"))))
            .thenReturn(new GroupPermissionsResponse("FAMILY", Set.of("content.read")));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/groups/family/permissions")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "permissions": ["content.read"]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.group_code").value("FAMILY"));
    }
}
