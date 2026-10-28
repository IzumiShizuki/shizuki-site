package io.github.shizuki.common.oauth.service;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

/**
 * Process-local OAuth state fallback used when external messaging/storage is disabled.
 */
@Component
@ConditionalOnMissingBean(OAuthStateService.class)
public class InMemoryOAuthStateService implements OAuthStateService {

    private static final Duration DEFAULT_EXPIRE = Duration.ofMinutes(10);

    private final Map<String, Instant> states = new ConcurrentHashMap<>();

    @Override
    public String createState(String scopeKey) {
        String state = UUID.randomUUID().toString();
        states.put(buildKey(scopeKey, state), Instant.now().plus(DEFAULT_EXPIRE));
        return state;
    }

    @Override
    public boolean validateAndConsume(String scopeKey, String state) {
        String key = buildKey(scopeKey, state);
        Instant expiresAt = states.remove(key);
        return expiresAt != null && expiresAt.isAfter(Instant.now());
    }

    private String buildKey(String scopeKey, String state) {
        return "oauth:state:" + scopeKey + ":" + state;
    }
}
