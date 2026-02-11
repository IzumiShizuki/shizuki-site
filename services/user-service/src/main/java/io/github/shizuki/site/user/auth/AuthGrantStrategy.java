package io.github.shizuki.site.user.auth;

public interface AuthGrantStrategy {

    boolean supports(AuthGrantType type);

    AuthGrantResult grant(AuthGrantCommand command);
}

