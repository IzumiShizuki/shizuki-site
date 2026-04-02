package io.github.shizuki.site.user.controller;

import io.github.shizuki.site.user.response.AdminUserPageResponse;
import io.github.shizuki.site.user.response.UserGroupsResponse;
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

@WebMvcTest(AdminUserGroupController.class)
class AdminUserGroupControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void shouldListAdminUsersSuccessfully() throws Exception {
        Mockito.when(userService.listAdminUsers(ArgumentMatchers.eq(1), ArgumentMatchers.eq(20), ArgumentMatchers.eq("alice")))
            .thenReturn(new AdminUserPageResponse(1, 20, 0L, List.of()));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/users")
                .queryParam("page", "1")
                .queryParam("page_size", "20")
                .queryParam("keyword", "alice"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.page_size").value(20))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.total").value(0));
    }

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
