package io.github.shizuki.site.ai.service;

import io.github.shizuki.site.ai.dto.AiSessionSummary;
import io.github.shizuki.site.ai.dto.CreateSessionRequest;
import io.github.shizuki.site.ai.dto.SendMessageRequest;
import java.util.List;
import java.util.Map;

public interface AiService {

    AiSessionSummary createSession(CreateSessionRequest request);

    List<AiSessionSummary> listSessions();

    Map<String, Object> sendMessage(String sessionId, SendMessageRequest request);

    Map<String, Object> myQuota();

    Map<String, Object> createCharacter(Map<String, Object> request);

    Map<String, Object> importCharacterCard(Map<String, Object> request);
}
