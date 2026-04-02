package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.security.service.AdminPrivilegeService;
import io.github.shizuki.site.user.request.AdminGroupCreateRequest;
import io.github.shizuki.site.user.response.AdminGroupItemResponse;
import io.github.shizuki.site.user.response.AdminGroupPageResponse;
import io.github.shizuki.site.user.request.AdminGroupUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import java.time.LocalDateTime;
import java.util.List;
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

@WebMvcTest(AdminGroupCatalogController.class)
class AdminGroupCatalogControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;
    @MockBean
    private AdminPrivilegeService adminPrivilegeService;

    @Test
    void shouldListAdminGroupsSuccessfully() throws Exception {
        AdminGroupItemResponse item = new AdminGroupItemResponse(
            "USER",
            "用户",
            "系统用户组",
            "ACTIVE",
            1,
            20,
            5L,
            1L,
            3L,
            LocalDateTime.now(),
            LocalDateTime.now()
        );
        Mockito.when(userService.listAdminGroups(ArgumentMatchers.eq(1), ArgumentMatchers.eq(20), ArgumentMatchers.eq("us"), ArgumentMatchers.eq("ACTIVE")))
            .thenReturn(new AdminGroupPageResponse(1, 20, 1L, List.of(item)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/groups")
                .queryParam("page", "1")
                .queryParam("page_size", "20")
                .queryParam("keyword", "us")
                .queryParam("status", "ACTIVE"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.items[0].group_code").value("USER"));
    }

    @Test
    void shouldCreateAdminGroupSuccessfully() throws Exception {
        AdminGroupItemResponse item = new AdminGroupItemResponse(
            "CONTENT_OPS",
            "内容运营",
            "运营分组",
            "ACTIVE",
            0,
            1000,
            0L,
            0L,
            0L,
            LocalDateTime.now(),
            LocalDateTime.now()
        );
        Mockito.when(userService.createAdminGroup(ArgumentMatchers.any(AdminGroupCreateRequest.class))).thenReturn(item);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/groups")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "display_name": "内容运营",
                      "description": "运营分组"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.group_code").value("CONTENT_OPS"));
    }

    @Test
    void shouldUpdateAdminGroupSuccessfully() throws Exception {
        AdminGroupItemResponse item = new AdminGroupItemResponse(
            "CONTENT_OPS",
            "内容运营2",
            "运营分组2",
            "ACTIVE",
            0,
            1000,
            0L,
            0L,
            0L,
            LocalDateTime.now(),
            LocalDateTime.now()
        );
        Mockito.when(userService.updateAdminGroup(ArgumentMatchers.eq("content_ops"), ArgumentMatchers.any(AdminGroupUpdateRequest.class)))
            .thenReturn(item);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/groups/content_ops")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "display_name": "内容运营2",
                      "description": "运营分组2",
                      "status": "ACTIVE"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.display_name").value("内容运营2"));
    }

    @Test
    void shouldDeleteAdminGroupSuccessfully() throws Exception {
        Mockito.doNothing().when(adminPrivilegeService).verifyCode(ArgumentMatchers.eq("Izumi2486"));
        Mockito.doNothing().when(userService).deleteAdminGroup(ArgumentMatchers.eq("content_ops"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/groups/content_ops/delete")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "privilege_code": "Izumi2486"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.status").value("DELETED"));

        Mockito.verify(adminPrivilegeService).verifyCode("Izumi2486");
        Mockito.verify(userService).deleteAdminGroup("content_ops");
    }
}
