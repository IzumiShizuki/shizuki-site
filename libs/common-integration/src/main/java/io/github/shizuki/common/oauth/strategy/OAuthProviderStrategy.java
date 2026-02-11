package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.oauth.model.OAuthIdentity;

public interface OAuthProviderStrategy {

    String providerCode();

    String buildAuthorizeUrl(String state, String redirectUri);

    OAuthIdentity exchangeCode(String code, String redirectUri);
}

