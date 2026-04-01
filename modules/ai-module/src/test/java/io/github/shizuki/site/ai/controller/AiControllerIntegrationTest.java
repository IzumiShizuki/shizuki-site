package io.github.shizuki.site.ai.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.ai.dto.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.dto.AiMessageSendResponse;
import io.github.shizuki.site.ai.dto.AiQuotaStatusResponse;
import io.github.shizuki.site.ai.dto.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.dto.AiCompanionConfigResponse;
import io.github.shizuki.site.ai.dto.AiMemoryScopeResponse;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.AiTownMapNodeResponse;
import io.github.shizuki.site.ai.dto.AiTownNpcResponse;
import io.github.shizuki.site.ai.dto.AiTownAssetPreviewResponse;
import io.github.shizuki.site.ai.dto.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.service.AiService;
import io.github.shizuki.site.ai.support.ApiErrorAssertions;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(AiController.class)
class AiControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AiService aiService;

    @Test
    void shouldCreateSessionSuccessfully() throws Exception {
        Mockito.when(aiService.createSession(ArgumentMatchers.any(CreateSessionRequest.class)))
            .thenReturn(new AiSessionSummary("session-001", "算法训练", "normal", null, List.of(), null, null, null));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "算法训练"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.session_id").value("session-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("算法训练"));
    }

    @Test
    void shouldListSessionsSuccessfully() throws Exception {
        Mockito.when(aiService.listSessions())
            .thenReturn(List.of(new AiSessionSummary("session-001", "算法训练", "normal", null, List.of(), null, null, null)));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-sessions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].session_id").value("session-001"));
    }

    @Test
    void shouldSendMessageSuccessfully() throws Exception {
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-001"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenReturn(new AiMessageSendResponse(
                "session-001",
                "你好",
                "你好",
                "normal",
                0,
                false,
                null,
                true,
                null,
                List.of(),
                null,
                null,
                null,
                "ai_round_total",
                20L,
                16L,
                4L,
                List.of(),
                List.of()
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "你好"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.assistant_message").value("你好"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.remaining_rounds").value(4));
    }

    @Test
    void shouldGetQuotaSuccessfully() throws Exception {
        Mockito.when(aiService.myQuota())
            .thenReturn(new AiQuotaStatusResponse("ai_round_total", 20L, 3L, 17L));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-quotas/me"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.quota_code").value("ai_round_total"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.remaining").value(17));
    }

    @Test
    void shouldListCharactersSuccessfully() throws Exception {
        Mockito.when(aiService.listCharacters())
            .thenReturn(List.of(new AiCharacterSummaryResponse(1001L, "character", "馆长 Haru", 88L, "PRIVATE", LocalDateTime.now())));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-characters"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].character_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].display_name").value("馆长 Haru"));
    }

    @Test
    void shouldGetCharacterSuccessfully() throws Exception {
        Mockito.when(aiService.getCharacter(1001L))
            .thenReturn(new AiCharacterDetailResponse(
                1001L,
                "character_card_png",
                "馆长 Haru",
                88L,
                "PRIVATE",
                Map.of("persona", "安静而可靠"),
                LocalDateTime.now(),
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-characters/1001"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.character_id").value(1001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.payload.persona").value("安静而可靠"));
    }

    @Test
    void shouldCreateWorldbookSuccessfully() throws Exception {
        Mockito.when(aiService.createWorldbook(ArgumentMatchers.any()))
            .thenReturn(new AiWorldbookDetailResponse(
                2001L,
                "worldbook-001",
                "图书馆设定集",
                "PRIVATE",
                true,
                List.of(),
                LocalDateTime.now(),
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-worldbooks")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": "图书馆设定集",
                      "visibility_type": "PRIVATE",
                      "enabled": true
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.worldbook_id").value(2001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("图书馆设定集"));
    }

    @Test
    void shouldCreateWorldbookEntrySuccessfully() throws Exception {
        Mockito.when(aiService.createWorldbookEntry(ArgumentMatchers.eq(2001L), ArgumentMatchers.any()))
            .thenReturn(new AiWorldbookEntryResponse(
                3001L,
                List.of("图书馆", "夜间"),
                "图书馆夜间会切换到安静模式。",
                10,
                true,
                LocalDateTime.now(),
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-worldbooks/2001/entries")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "keywords": ["图书馆", "夜间"],
                      "content": "图书馆夜间会切换到安静模式。",
                      "priority_num": 10,
                      "enabled": true
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.entry_id").value(3001))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.keywords[0]").value("图书馆"));
    }

    @Test
    void shouldGetAdminCompanionConfigSuccessfully() throws Exception {
        Mockito.when(aiService.getAdminCompanionConfig())
            .thenReturn(new AiCompanionConfigResponse(
                4001L,
                "my_home_ai",
                "小春",
                "温柔、可靠，会记得我的习惯。",
                20001L,
                true,
                List.of(2001L, 2002L),
                "房间里有落地灯和书桌。",
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/admin/ai-companion/config"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.companion_code").value("my_home_ai"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.display_name").value("小春"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.worldbook_ids[0]").value(2001));
    }

    @Test
    void shouldUpdateAdminCompanionConfigSuccessfully() throws Exception {
        Mockito.when(aiService.updateAdminCompanionConfig(ArgumentMatchers.any()))
            .thenReturn(new AiCompanionConfigResponse(
                4001L,
                "my_home_ai",
                "小春",
                "温柔、可靠，会记得我的习惯。",
                20001L,
                true,
                List.of(2001L),
                "房间里有落地灯和书桌。",
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/ai-companion/config")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "companion_code": "my_home_ai",
                      "display_name": "小春",
                      "persona_prompt": "温柔、可靠，会记得我的习惯。",
                      "avatar_asset_id": 20001,
                      "worldbook_ids": [2001],
                      "memory_enabled": true,
                      "scene_prompt": "房间里有落地灯和书桌。"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.display_name").value("小春"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.memory_enabled").value(true));
    }

    @Test
    void shouldCreateAdminCompanionSessionSuccessfully() throws Exception {
        Mockito.when(aiService.createAdminCompanionSession())
            .thenReturn(new AiSessionSummary("session-home-001", "自宅 · 小春", "companion", null, List.of(2001L), "自宅 companion", "home", "my_home_ai"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/ai-companion/sessions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.session_id").value("session-home-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.mode").value("companion"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.actor_code").value("my_home_ai"));
    }

    @Test
    void shouldListTownScenesSuccessfully() throws Exception {
        Mockito.when(aiService.listTownScenes())
            .thenReturn(List.of(
                new AiTownSceneSummaryResponse("library", "图书馆", "knowledge", "资料与设定浏览入口", "木书架与暖灯", 2, true)
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-town/scenes"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].scene_code").value("library"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].title").value("图书馆"));
    }

    @Test
    void shouldGetTownSceneSuccessfully() throws Exception {
        Mockito.when(aiService.getTownScene("library"))
            .thenReturn(new AiTownSceneDetailResponse(
                "library",
                "图书馆",
                "knowledge",
                "资料与设定浏览入口",
                "木书架与暖灯",
                true,
                List.of("资料索引", "夜间氛围"),
                List.of(new AiTownNpcResponse("librarian", "library", "馆长 Haru", "管理员特殊 NPC", "负责资料整理", true, true, null, List.of()))
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-town/scenes/library"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.scene_code").value("library"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.npcs[0].npc_code").value("librarian"));
    }

    @Test
    void shouldGetTownPublicMapSuccessfully() throws Exception {
        Mockito.when(aiService.getTownPublicMap())
            .thenReturn(new AiTownPublicMapResponse(
                List.of(new AiTownMapNodeResponse("library", "图书馆", 18, 26, "amber"))
            ));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/ai-town/public-map"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.scenes[0].scene_code").value("library"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.scenes[0].coord_x").value(18));
    }

    @Test
    void shouldCreateAdminTownNpcSessionSuccessfully() throws Exception {
        Mockito.when(aiService.createAdminTownNpcSession("librarian"))
            .thenReturn(new AiSessionSummary(
                "session-town-001",
                "图书馆 · 馆长 Haru",
                "town_npc",
                null,
                List.of(),
                "资料与设定浏览入口",
                "library",
                "librarian"
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/ai-town/npcs/librarian/sessions"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.session_id").value("session-town-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.mode").value("town_npc"));
    }

    @Test
    void shouldImportAdminTownAssetSuccessfully() throws Exception {
        Mockito.when(aiService.importAdminTownAsset(ArgumentMatchers.any(), ArgumentMatchers.eq("library")))
            .thenReturn(new AiTownAssetPreviewResponse(
                7001L,
                "rpg-import-001",
                "Map001.json",
                "rpg_map",
                "READY",
                128L,
                "library",
                List.of("地图尺寸 20x15", "事件点位 2 个"),
                Map.of("width", 20, "height", 15),
                Map.of("map_like", true),
                LocalDateTime.now()
            ));

        MockMultipartFile file = new MockMultipartFile(
            "file",
            "Map001.json",
            "application/json",
            "{\"width\":20,\"height\":15,\"data\":[1]}".getBytes()
        );

        mockMvc.perform(MockMvcRequestBuilders.multipart("/api/v1/admin/ai-town/assets/import-rpgmaker")
                .file(file)
                .param("scene_code", "library"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_code").value("rpg-import-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_type").value("rpg_map"));
    }

    @Test
    void shouldPreviewAdminTownAssetSuccessfully() throws Exception {
        Mockito.when(aiService.previewAdminTownAsset(ArgumentMatchers.any()))
            .thenReturn(new AiTownAssetPreviewResponse(
                7001L,
                "rpg-import-001",
                "Map001.json",
                "rpg_map",
                "READY",
                128L,
                "library",
                List.of("地图尺寸 20x15"),
                Map.of("width", 20, "height", 15),
                Map.of("map_like", true),
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/admin/ai-town/assets/preview")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "asset_code": "rpg-import-001"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.asset_code").value("rpg-import-001"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.attached_scene_code").value("library"));
    }

    @Test
    void shouldUpdateAdminMemoryScopeSuccessfully() throws Exception {
        Mockito.when(aiService.updateAdminMemoryScope(ArgumentMatchers.eq("66:town_npc:librarian:library"), ArgumentMatchers.any()))
            .thenReturn(new AiMemoryScopeResponse(
                8101L,
                "66:town_npc:librarian:library",
                66L,
                "town_npc",
                "librarian",
                "library",
                false,
                "暂停写回",
                "图书馆偏好",
                "偏好暖光和书架区域。",
                List.of("喜欢暖光"),
                List.of("上次聊到图书馆布局"),
                List.of("最近一次在图书馆问答"),
                LocalDateTime.now(),
                LocalDateTime.now()
            ));

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/admin/ai-memory/scopes/66:town_npc:librarian:library")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "enabled": false,
                      "note": "暂停写回",
                      "query": "图书馆偏好"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.scope_id").value("66:town_npc:librarian:library"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.enabled").value(false))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.summary_highlights[0]").value("喜欢暖光"));
    }

    @Test
    void shouldReturnBadRequestWhenCreateSessionTitleBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "title": ""
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnBadRequestWhenSendMessageBlank() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": ""
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }

    @Test
    void shouldReturnNotFoundWhenSessionMissing() throws Exception {
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-404"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenThrow(new BusinessException(ErrorCode.NOT_FOUND, "Session not found"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-404/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "你好"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(404, "NOT_FOUND"));
    }

    @Test
    void shouldReturnForbiddenWhenQuotaExhausted() throws Exception {
        // Given: 业务层在扣减配额时发现额度已耗尽
        Mockito.when(aiService.sendMessage(
                ArgumentMatchers.eq("session-001"),
                ArgumentMatchers.any(SendMessageRequest.class)
            ))
            .thenThrow(new BusinessException(ErrorCode.FORBIDDEN, "AI quota exhausted"));

        // When / Then: 控制器返回 403 + FORBIDDEN，前端据此提示用户升级配额
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/ai-sessions/session-001/messages")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "message": "继续训练"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(403, "FORBIDDEN"));
    }
}
