package io.github.shizuki.site.user.auth;

import java.util.Set;

public class AuthGrantResult {

    public enum ResultType {
        TOKEN_ISSUED,
        BIND_REQUIRED
    }

    private ResultType resultType;
    private String accessToken;
    private String tokenType;
    private Long expiresInSec;
    private String refreshToken;
    private Long refreshExpiresInSec;
    private Long userId;
    private Set<String> groups;
    private String bindTicket;

    public static AuthGrantResult bindRequired(String bindTicket) {
        AuthGrantResult result = new AuthGrantResult();
        result.setResultType(ResultType.BIND_REQUIRED);
        result.setBindTicket(bindTicket);
        return result;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresInSec() {
        return expiresInSec;
    }

    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Long getRefreshExpiresInSec() {
        return refreshExpiresInSec;
    }

    public void setRefreshExpiresInSec(Long refreshExpiresInSec) {
        this.refreshExpiresInSec = refreshExpiresInSec;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    public String getBindTicket() {
        return bindTicket;
    }

    public void setBindTicket(String bindTicket) {
        this.bindTicket = bindTicket;
    }
}

