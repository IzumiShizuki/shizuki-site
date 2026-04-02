package io.github.shizuki.site.content.controller;

import io.github.shizuki.site.content.response.PostCategoryPolicyResponse;
import io.github.shizuki.site.content.service.ContentService;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AdminPostCategoryPolicyController.class)
class AdminPostCategoryPolicyControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContentService contentService;

    @Test
    void shouldListCategoryPoliciesSuccessfully() throws Exception {
        Mockito.when(contentService.listPostCategoryPolicies())
            .thenReturn(List.of(new PostCategoryPolicyResponse("game", true, Set.of("USER", "FRIEND", "ADMIN"))));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/posts/category-policies"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].category_code").value("game"));
    }

    @Test
    void shouldUpdateCategoryPolicySuccessfully() throws Exception {
        Mockito.when(contentService.updatePostCategoryPolicy(Mockito.eq("game"), Mockito.any()))
            .thenReturn(new PostCategoryPolicyResponse("game", true, Set.of("USER", "FRIEND", "ADMIN")));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/posts/category-policies/game")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "enabled": true,
                      "allowed_group_codes": ["USER", "FRIEND", "ADMIN"]
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.category_code").value("game"));
    }
}
