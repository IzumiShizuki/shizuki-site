package io.github.shizuki.site.monolith.meguri;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * Website request for one Meguri turn. The frontend http client serializes
 * camelCase keys to snake_case, so both spellings are accepted here.
 */
public record MeguriTurnCreateRequest(
        String message,
        @JsonAlias({"session_id"}) String sessionId,
        @JsonAlias({"idempotency_key"}) String idempotencyKey) {
}
