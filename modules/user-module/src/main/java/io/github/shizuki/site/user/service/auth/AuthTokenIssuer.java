package io.github.shizuki.site.user.service.auth;

import cn.dev33.satoken.stp.StpUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.user.auth.AuthGrantResult;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AuthTokenIssuer {

    private final UserAccountMapper userAccountMapper;
    private final ObjectMapper objectMapper;
    private final RefreshTokenService refreshTokenService;

    public AuthTokenIssuer(UserAccountMapper userAccountMapper,
                           ObjectMapper objectMapper,
                           RefreshTokenService refreshTokenService) {
        this.userAccountMapper = userAccountMapper;
        this.objectMapper = objectMapper;
        this.refreshTokenService = refreshTokenService;
    }

    public AuthGrantResult issueTokenPair(Long userId) {
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new IllegalStateException("User not found for token issue: " + userId);
        }
        StpUtil.login(userId);
        String accessToken = StpUtil.getTokenValue();
        RefreshTokenService.IssueResult refresh = refreshTokenService.issue(userId);
        return tokenIssuedResult(account, accessToken, refresh.token(), refresh.expiresInSec());
    }

    public AuthGrantResult issueWithExistingRefresh(Long userId, String refreshToken, Long refreshExpiresInSec) {
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new IllegalStateException("User not found for token issue: " + userId);
        }
        StpUtil.login(userId);
        String accessToken = StpUtil.getTokenValue();
        return tokenIssuedResult(account, accessToken, refreshToken, refreshExpiresInSec);
    }

    private AuthGrantResult tokenIssuedResult(UserAccountEntity account,
                                              String accessToken,
                                              String refreshToken,
                                              Long refreshExpiresInSec) {
        AuthGrantResult result = new AuthGrantResult();
        result.setResultType(AuthGrantResult.ResultType.TOKEN_ISSUED);
        result.setAccessToken(accessToken);
        result.setTokenType("Bearer");
        result.setExpiresInSec(StpUtil.getTokenTimeout());
        result.setRefreshToken(refreshToken);
        result.setRefreshExpiresInSec(refreshExpiresInSec);
        result.setUserId(account.getId());
        result.setGroups(parseGroups(account.getGroupsJson()));
        return result;
    }

    private Set<String> parseGroups(String groupsJson) {
        if (!StringUtils.hasText(groupsJson)) {
            return Set.of("USER");
        }
        try {
            List<String> values = objectMapper.readValue(groupsJson, new TypeReference<List<String>>() {
            });
            if (values == null || values.isEmpty()) {
                return Set.of("USER");
            }
            return new LinkedHashSet<>(values);
        } catch (Exception ex) {
            return Set.of("USER");
        }
    }
}

