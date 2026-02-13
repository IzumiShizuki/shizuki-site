package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.dto.UserGroupsResponse;
import io.github.shizuki.site.user.service.UserService;
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

@WebMvcTest(AdminUserGroupController.class)
class AdminUserGroupControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldGetUserGroupsSuccessfully() throws Exception {
        Mockito.when(userService.getUserGroups(ArgumentMatchers.eq(7L)))
            .thenReturn(new UserGroupsResponse(7L, Set.of("USER", "FAMILY")));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/users/7/groups"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(7));
    }

    @Test
    void shouldReplaceUserGroupsSuccessfully() throws Exception {
        Mockito.when(userService.replaceUserGroups(ArgumentMatchers.eq(7L), ArgumentMatchers.eq(Set.of("USER", "FRIEND"))))
            .thenReturn(new UserGroupsResponse(7L, Set.of("USER", "FRIEND")));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/users/7/groups")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "groups": ["USER", "FRIEND"]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.user_id").value(7));
    }
}
