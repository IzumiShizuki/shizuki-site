package io.github.shizuki.site.user.service.auth;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.user.auth.AuthGrantResult;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    public AuthGrantResult issueTokenPair(Long userId) {
        UserAccountEntity account = requireActiveAccount(userId);
        StpUtil.login(userId);
        String accessToken = StpUtil.getTokenValue();
        RefreshTokenService.IssueResult refresh = refreshTokenService.issue(userId);
        return tokenIssuedResult(account, accessToken, refresh.token(), refresh.expiresInSec());
    }

    @Transactional
    public AuthGrantResult issueWithExistingRefresh(Long userId, String refreshToken, Long refreshExpiresInSec) {
        UserAccountEntity account = requireActiveAccount(userId);
        StpUtil.login(userId);
        String accessToken = StpUtil.getTokenValue();
        return tokenIssuedResult(account, accessToken, refreshToken, refreshExpiresInSec);
    }

    private UserAccountEntity requireActiveAccount(Long userId) {
        // Serialize issuance with account closure, so no new session can survive a closure.
        UserAccountEntity account = userAccountMapper.selectOne(new LambdaQueryWrapper<UserAccountEntity>()
            .eq(UserAccountEntity::getId, userId).eq(UserAccountEntity::getDeleted, 0).last("FOR UPDATE"));
        if (account == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "账号已注销或不存在");
        }
        return account;
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

