package io.github.shizuki.site.ai.service;

import io.github.shizuki.site.ai.request.SendMessageRequest;
import io.github.shizuki.site.ai.response.AiMessageSendResponse;

/**
 * Streaming variant of the AI chat send flow. Kept as a dedicated interface so the frozen
 * {@link AiService} contract stays untouched while streaming-capable callers can depend on it.
 */
public interface AiStreamChatService {

    /**
     * Sends a message on an owned session and streams assistant deltas through {@code onDelta}
     * while they arrive. Quota, memory scope handling and message persistence follow the exact
     * same rules as the non-streaming send flow; the returned response carries the final
     * accumulated assistant message plus quota/memory metadata.
     */
    AiMessageSendResponse streamMessage(String sessionId, SendMessageRequest request, DeltaListener onDelta);

    @FunctionalInterface
    interface DeltaListener {
        void onDelta(String delta);
    }
}
