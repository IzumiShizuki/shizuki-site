package io.github.shizuki.site.ai.service;

import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import java.util.List;
import java.util.Map;

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
    Map<String, Object> sendMessage(String sessionId, SendMessageRequest request);

    /**
     * 查询当前用户配额使用情况。
     */
    Map<String, Object> myQuota();

    /**
     * 创建角色配置。
     */
    Map<String, Object> createCharacter(Map<String, Object> request);

    /**
     * 导入角色卡配置。
     */
    Map<String, Object> importCharacterCard(Map<String, Object> request);
}
