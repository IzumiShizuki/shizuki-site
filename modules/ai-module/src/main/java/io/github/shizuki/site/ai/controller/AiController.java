package io.github.shizuki.site.ai.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.ratelimit.annotation.RateLimit;
import io.github.shizuki.site.ai.dto.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.dto.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.dto.AiCompanionConfigResponse;
import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.dto.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.dto.AiWorldbookSummaryResponse;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.CreateWorldbookRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import io.github.shizuki.site.ai.dto.UpdateCompanionConfigRequest;
import io.github.shizuki.site.ai.dto.UpdateWorldbookRequest;
import io.github.shizuki.site.ai.dto.UpsertWorldbookEntryRequest;
import io.github.shizuki.site.ai.service.AiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "AI", description = "AI 会话、消息与角色配置接口")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ai-sessions")
    @Operation(summary = "创建 AI 会话")
    public ApiResponse<AiSessionSummary> createSession(@Valid @RequestBody CreateSessionRequest request) {
        return ApiResponse.success(aiService.createSession(request));
    }

    @GetMapping("/ai-sessions")
    @Operation(summary = "查询我的会话列表")
    public ApiResponse<List<AiSessionSummary>> listSessions() {
        return ApiResponse.success(aiService.listSessions());
    }

    @PostMapping("/ai-sessions/{session_id}/messages")
    @RateLimit(key = "ai.messages", limit = 30, windowSeconds = 60)
    @AuditLog(action = "ai.message.send", resource = "ai_session")
    @Operation(summary = "发送消息", description = "发送用户消息并返回助手回复，同时扣减配额")
    public ApiResponse<Map<String, Object>> sendMessage(@PathVariable("session_id") String sessionId,
                                                        @Valid @RequestBody SendMessageRequest request) {
        return ApiResponse.success(aiService.sendMessage(sessionId, request));
    }

    @GetMapping("/ai-quotas/me")
    @Operation(summary = "查询我的 AI 配额")
    public ApiResponse<Map<String, Object>> myQuota() {
        return ApiResponse.success(aiService.myQuota());
    }

    @PostMapping("/ai-characters")
    @Operation(summary = "创建角色配置", description = "保存结构化角色配置 JSON")
    public ApiResponse<Map<String, Object>> createCharacter(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiService.createCharacter(request));
    }

    @PostMapping("/ai-character-cards/import")
    @Operation(summary = "导入角色卡", description = "导入角色卡内容并落库")
    public ApiResponse<Map<String, Object>> importCharacterCard(@RequestBody Map<String, Object> request) {
        return ApiResponse.success(aiService.importCharacterCard(request));
    }

    @GetMapping("/ai-characters")
    @Operation(summary = "查询我的角色列表")
    public ApiResponse<List<AiCharacterSummaryResponse>> listCharacters() {
        return ApiResponse.success(aiService.listCharacters());
    }

    @GetMapping("/ai-characters/{character_id}")
    @Operation(summary = "查询角色详情")
    public ApiResponse<AiCharacterDetailResponse> getCharacter(@PathVariable("character_id") Long characterId) {
        return ApiResponse.success(aiService.getCharacter(characterId));
    }

    @GetMapping("/ai-town/scenes")
    @Operation(summary = "查询 AI 小镇公开场景列表")
    public ApiResponse<List<AiTownSceneSummaryResponse>> listTownScenes() {
        return ApiResponse.success(aiService.listTownScenes());
    }

    @GetMapping("/ai-town/scenes/{scene_code}")
    @Operation(summary = "查询 AI 小镇公开场景详情")
    public ApiResponse<AiTownSceneDetailResponse> getTownScene(@PathVariable("scene_code") String sceneCode) {
        return ApiResponse.success(aiService.getTownScene(sceneCode));
    }

    @GetMapping("/ai-town/public-map")
    @Operation(summary = "查询 AI 小镇公开地图")
    public ApiResponse<AiTownPublicMapResponse> getTownPublicMap() {
        return ApiResponse.success(aiService.getTownPublicMap());
    }

    @PostMapping("/ai-worldbooks")
    @Operation(summary = "创建世界书")
    public ApiResponse<AiWorldbookDetailResponse> createWorldbook(@Valid @RequestBody CreateWorldbookRequest request) {
        return ApiResponse.success(aiService.createWorldbook(request));
    }

    @GetMapping("/ai-worldbooks")
    @Operation(summary = "查询我的世界书列表")
    public ApiResponse<List<AiWorldbookSummaryResponse>> listWorldbooks() {
        return ApiResponse.success(aiService.listWorldbooks());
    }

    @GetMapping("/ai-worldbooks/{worldbook_id}")
    @Operation(summary = "查询世界书详情")
    public ApiResponse<AiWorldbookDetailResponse> getWorldbook(@PathVariable("worldbook_id") Long worldbookId) {
        return ApiResponse.success(aiService.getWorldbook(worldbookId));
    }

    @PutMapping("/ai-worldbooks/{worldbook_id}")
    @Operation(summary = "更新世界书")
    public ApiResponse<AiWorldbookDetailResponse> updateWorldbook(@PathVariable("worldbook_id") Long worldbookId,
                                                                  @Valid @RequestBody UpdateWorldbookRequest request) {
        return ApiResponse.success(aiService.updateWorldbook(worldbookId, request));
    }

    @PostMapping("/ai-worldbooks/{worldbook_id}/entries")
    @Operation(summary = "新增世界书条目")
    public ApiResponse<AiWorldbookEntryResponse> createWorldbookEntry(@PathVariable("worldbook_id") Long worldbookId,
                                                                      @Valid @RequestBody UpsertWorldbookEntryRequest request) {
        return ApiResponse.success(aiService.createWorldbookEntry(worldbookId, request));
    }

    @PutMapping("/ai-worldbooks/{worldbook_id}/entries/{entry_id}")
    @Operation(summary = "更新世界书条目")
    public ApiResponse<AiWorldbookEntryResponse> updateWorldbookEntry(@PathVariable("worldbook_id") Long worldbookId,
                                                                      @PathVariable("entry_id") Long entryId,
                                                                      @Valid @RequestBody UpsertWorldbookEntryRequest request) {
        return ApiResponse.success(aiService.updateWorldbookEntry(worldbookId, entryId, request));
    }

    @PostMapping("/admin/ai-town/npcs/{npc_code}/sessions")
    @Operation(summary = "创建管理员特殊 NPC 会话")
    public ApiResponse<AiSessionSummary> createAdminTownNpcSession(@PathVariable("npc_code") String npcCode) {
        return ApiResponse.success(aiService.createAdminTownNpcSession(npcCode));
    }

    @PostMapping("/admin/ai-companion/sessions")
    @Operation(summary = "创建管理员自宅 companion 会话")
    public ApiResponse<AiSessionSummary> createAdminCompanionSession() {
        return ApiResponse.success(aiService.createAdminCompanionSession());
    }

    @GetMapping("/admin/ai-companion/config")
    @Operation(summary = "查询管理员自宅 companion 配置")
    public ApiResponse<AiCompanionConfigResponse> getAdminCompanionConfig() {
        return ApiResponse.success(aiService.getAdminCompanionConfig());
    }

    @PutMapping("/admin/ai-companion/config")
    @Operation(summary = "更新管理员自宅 companion 配置")
    public ApiResponse<AiCompanionConfigResponse> updateAdminCompanionConfig(@Valid @RequestBody UpdateCompanionConfigRequest request) {
        return ApiResponse.success(aiService.updateAdminCompanionConfig(request));
    }
}
