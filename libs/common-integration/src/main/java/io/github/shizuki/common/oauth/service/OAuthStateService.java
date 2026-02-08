package io.github.shizuki.common.oauth.service;

public interface OAuthStateService {

    String createState(String scopeKey);

    boolean validateAndConsume(String scopeKey, String state);
}
