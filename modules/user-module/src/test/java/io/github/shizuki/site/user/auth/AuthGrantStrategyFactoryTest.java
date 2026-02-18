package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthGrantStrategyFactoryTest {

    @Test
    void shouldRouteToEmailPasswordStrategy() {
        AuthGrantStrategy email = new StubStrategy(AuthGrantType.EMAIL_PASSWORD);
        AuthGrantStrategy oauth = new StubStrategy(AuthGrantType.OAUTH_CODE);
        AuthGrantStrategy refresh = new StubStrategy(AuthGrantType.REFRESH_TOKEN);
        AuthGrantStrategyFactory factory = new AuthGrantStrategyFactory(List.of(email, oauth, refresh));

        AuthGrantStrategy chosen = factory.get(AuthGrantType.EMAIL_PASSWORD);

        Assertions.assertSame(email, chosen);
    }

    @Test
    void shouldRouteToOauthCodeStrategy() {
        AuthGrantStrategy email = new StubStrategy(AuthGrantType.EMAIL_PASSWORD);
        AuthGrantStrategy oauth = new StubStrategy(AuthGrantType.OAUTH_CODE);
        AuthGrantStrategy refresh = new StubStrategy(AuthGrantType.REFRESH_TOKEN);
        AuthGrantStrategyFactory factory = new AuthGrantStrategyFactory(List.of(email, oauth, refresh));

        AuthGrantStrategy chosen = factory.get(AuthGrantType.OAUTH_CODE);

        Assertions.assertSame(oauth, chosen);
    }

    @Test
    void shouldThrowWhenGrantStrategyMissing() {
        AuthGrantStrategy email = new StubStrategy(AuthGrantType.EMAIL_PASSWORD);
        AuthGrantStrategyFactory factory = new AuthGrantStrategyFactory(List.of(email));

        Assertions.assertThrows(BusinessException.class, () -> factory.get(AuthGrantType.REFRESH_TOKEN));
    }

    private static class StubStrategy implements AuthGrantStrategy {

        private final AuthGrantType supportedType;

        private StubStrategy(AuthGrantType supportedType) {
            this.supportedType = supportedType;
        }

        @Override
        public boolean supports(AuthGrantType type) {
            return type == supportedType;
        }

        @Override
        public AuthGrantResult grant(AuthGrantCommand command) {
            return new AuthGrantResult();
        }
    }
}

