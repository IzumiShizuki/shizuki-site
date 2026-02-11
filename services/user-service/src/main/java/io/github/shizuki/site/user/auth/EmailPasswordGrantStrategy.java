package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

@Component
public class EmailPasswordGrantStrategy implements AuthGrantStrategy {

    private final AuthFlowService authFlowService;

    public EmailPasswordGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.EMAIL_PASSWORD;
    }

    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByEmailPassword(command);
    }
}

