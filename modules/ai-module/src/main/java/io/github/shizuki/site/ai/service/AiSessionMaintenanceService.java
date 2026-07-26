package io.github.shizuki.site.ai.service;

import io.github.shizuki.site.ai.request.UpdateAiSessionRequest;
import io.github.shizuki.site.ai.response.AiSessionListItemResponse;
import io.github.shizuki.site.ai.response.AiSessionMessagesResponse;
import io.github.shizuki.site.ai.response.AiSessionSummary;
import java.util.List;

/**
 * Owner-scoped session maintenance: list-with-timestamp, history readback, rename and soft delete.
 * Split from {@link AiService} so the frozen phase-1 contract stays untouched.
 */
public interface AiSessionMaintenanceService {

    /** Lists the current user's sessions with an updatedAt timestamp, newest first. */
    List<AiSessionListItemResponse> listSessionSummaries();

    /** Returns the owned session plus its persisted message history (oldest first). */
    AiSessionMessagesResponse listSessionMessages(String sessionId, Integer limit);

    /** Renames an owned session and returns the updated summary. */
    AiSessionSummary updateSession(String sessionId, UpdateAiSessionRequest request);

    /** Soft-deletes an owned session (history rows are kept but the session disappears from lists). */
    void deleteSession(String sessionId);
}
