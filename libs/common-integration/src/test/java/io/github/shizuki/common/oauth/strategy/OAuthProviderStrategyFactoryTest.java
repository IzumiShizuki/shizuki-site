package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OAuthProviderStrategyFactoryTest {

    @Test
    void shouldRouteGithubStrategy() {
        OAuthProviderStrategy github = new StubProviderStrategy("github");
        OAuthProviderStrategy linuxdo = new StubProviderStrategy("linuxdo");
        OAuthProviderStrategyFactory factory = new OAuthProviderStrategyFactory(List.of(github, linuxdo));

        OAuthProviderStrategy chosen = factory.get("github");

        Assertions.assertSame(github, chosen);
    }

    @Test
    void shouldRouteLinuxDoStrategy() {
        OAuthProviderStrategy github = new StubProviderStrategy("github");
        OAuthProviderStrategy linuxdo = new StubProviderStrategy("linuxdo");
        OAuthProviderStrategyFactory factory = new OAuthProviderStrategyFactory(List.of(github, linuxdo));

        OAuthProviderStrategy chosen = factory.get("linuxdo");

        Assertions.assertSame(linuxdo, chosen);
    }

    @Test
    void shouldThrowWhenProviderUnsupported() {
        OAuthProviderStrategyFactory factory = new OAuthProviderStrategyFactory(List.of(new StubProviderStrategy("github")));
        Assertions.assertThrows(BusinessException.class, () -> factory.get("unknown"));
    }

    private static class StubProviderStrategy implements OAuthProviderStrategy {

        private final String code;

        private StubProviderStrategy(String code) {
            this.code = code;
        }

        @Override
        public String providerCode() {
            return code;
        }

        @Override
        public String buildAuthorizeUrl(String state, String redirectUri) {
            return "https://example.com/" + code;
        }

        @Override
        public OAuthIdentity exchangeCode(String code, String redirectUri) {
            return new OAuthIdentity(this.code, "1", "user", "user@example.com", "User", null);
        }
    }
}

