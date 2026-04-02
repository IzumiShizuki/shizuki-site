package io.github.shizuki.site.ai.service;

import io.github.shizuki.site.ai.response.AiSessionSummary;
import io.github.shizuki.site.ai.response.AiCharacterDetailResponse;
import io.github.shizuki.site.ai.response.AiCharacterCreateResponse;
import io.github.shizuki.site.ai.response.AiCharacterImportResponse;
import io.github.shizuki.site.ai.response.AiCharacterSummaryResponse;
import io.github.shizuki.site.ai.response.AiCompanionConfigResponse;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;
import io.github.shizuki.site.ai.response.AiMemoryScopeResponse;
import io.github.shizuki.site.ai.response.AiQuotaStatusResponse;
import io.github.shizuki.site.ai.response.AiTownPublicMapResponse;
import io.github.shizuki.site.ai.response.AiTownSceneDetailResponse;
import io.github.shizuki.site.ai.response.AiTownSceneSummaryResponse;
import io.github.shizuki.site.ai.request.AiTownAssetPreviewRequest;
import io.github.shizuki.site.ai.response.AiTownAssetPreviewResponse;
import io.github.shizuki.site.ai.response.AiWorldbookDetailResponse;
import io.github.shizuki.site.ai.response.AiWorldbookEntryResponse;
import io.github.shizuki.site.ai.response.AiWorldbookSummaryResponse;
import io.github.shizuki.site.ai.request.CreateSessionRequest;
import io.github.shizuki.site.ai.request.CreateWorldbookRequest;
import io.github.shizuki.site.ai.request.SendMessageRequest;
import io.github.shizuki.site.ai.request.UpdateAiMemoryScopeRequest;
import io.github.shizuki.site.ai.request.UpdateCompanionConfigRequest;
import io.github.shizuki.site.ai.request.UpdateWorldbookRequest;
import io.github.shizuki.site.ai.request.UpsertWorldbookEntryRequest;
import java.util.List;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

public interface AiService {

    /**
     * 创建 AI 会话。
     */
    AiSessionSummary createSession(CreateSessionRequest request);

    /**
     * 查询当前用户会话列表。
     */
    List<AiSessionSummary> listSessions();

    /**
     * 发送消息并返回回复。
     */
    AiMessageSendResponse sendMessage(String sessionId, SendMessageRequest request);

    /**
     * 查询当前用户配额使用情况。
     */
    AiQuotaStatusResponse myQuota();

    /**
     * 创建角色配置。
     */
    AiCharacterCreateResponse createCharacter(Map<String, Object> request);

    /**
     * 导入角色卡配置。
     */
    AiCharacterImportResponse importCharacterCard(Map<String, Object> request);

    /**
     * 查询当前用户角色列表。
     */
    List<AiCharacterSummaryResponse> listCharacters();

    /**
     * 查询角色详情。
     */
    AiCharacterDetailResponse getCharacter(Long characterId);

    /**
     * 创建世界书。
     */
    AiWorldbookDetailResponse createWorldbook(CreateWorldbookRequest request);

    /**
     * 查询当前用户世界书列表。
     */
    List<AiWorldbookSummaryResponse> listWorldbooks();

    /**
     * 查询世界书详情。
     */
    AiWorldbookDetailResponse getWorldbook(Long worldbookId);

    /**
     * 查询 AI 小镇公开场景列表。
     */
    List<AiTownSceneSummaryResponse> listTownScenes();

    /**
     * 查询 AI 小镇公开场景详情。
     */
    AiTownSceneDetailResponse getTownScene(String sceneCode);

    /**
     * 查询 AI 小镇公开地图。
     */
    AiTownPublicMapResponse getTownPublicMap();

    /**
     * 导入 RPGMaker 资产并返回解析预览。
     */
    AiTownAssetPreviewResponse importAdminTownAsset(MultipartFile file, String sceneCode);

    /**
     * 查询 RPGMaker 资产预览。
     */
    AiTownAssetPreviewResponse previewAdminTownAsset(AiTownAssetPreviewRequest request);

    /**
     * 为管理员特殊 NPC 创建会话。
     */
    AiSessionSummary createAdminTownNpcSession(String npcCode);

    /**
     * 查询管理员自宅 companion 配置。
     */
    AiCompanionConfigResponse getAdminCompanionConfig();

    /**
     * 更新管理员自宅 companion 配置。
     */
    AiCompanionConfigResponse updateAdminCompanionConfig(UpdateCompanionConfigRequest request);

    /**
     * 为管理员自宅 companion 创建会话。
     */
    AiSessionSummary createAdminCompanionSession();

    /**
     * 查询管理员记忆 scope。
     */
    AiMemoryScopeResponse getAdminMemoryScope(String scopeId);

    /**
     * 更新管理员记忆 scope。
     */
    AiMemoryScopeResponse updateAdminMemoryScope(String scopeId, UpdateAiMemoryScopeRequest request);

    /**
     * 更新世界书。
     */
    AiWorldbookDetailResponse updateWorldbook(Long worldbookId, UpdateWorldbookRequest request);

    /**
     * 创建世界书条目。
     */
    AiWorldbookEntryResponse createWorldbookEntry(Long worldbookId, UpsertWorldbookEntryRequest request);

    /**
     * 更新世界书条目。
     */
    AiWorldbookEntryResponse updateWorldbookEntry(Long worldbookId, Long entryId, UpsertWorldbookEntryRequest request);
}
