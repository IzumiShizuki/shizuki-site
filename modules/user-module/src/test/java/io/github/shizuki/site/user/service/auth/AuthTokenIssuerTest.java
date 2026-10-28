package io.github.shizuki.site.user.service.auth;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import org.junit.jupiter.api.Test;

class AuthTokenIssuerTest {
    @Test
    void rejectsTokenIssueAndRefreshForClosedAccountsWithoutCreatingSessions() {
        var accounts = mock(UserAccountMapper.class);
        var refresh = mock(RefreshTokenService.class);
        var issuer = new AuthTokenIssuer(accounts, new ObjectMapper(), refresh);
        try (var sessions = mockStatic(StpUtil.class)) {
            assertThatThrownBy(() -> issuer.issueTokenPair(20L)).isInstanceOf(BusinessException.class);
            assertThatThrownBy(() -> issuer.issueWithExistingRefresh(20L, "old-refresh", 100L))
                .isInstanceOf(BusinessException.class);
            sessions.verifyNoInteractions();
        }
        verifyNoInteractions(refresh);
    }

    @Test
    void issuesSessionForAnActiveAccountAfterLockingIt() {
        var accounts = mock(UserAccountMapper.class);
        var refresh = mock(RefreshTokenService.class);
        var issuer = new AuthTokenIssuer(accounts, new ObjectMapper(), refresh);
        var account = new UserAccountEntity();
        account.setId(7L);
        account.setGroupsJson("[\"USER\"]");
        when(accounts.selectOne(any(LambdaQueryWrapper.class))).thenReturn(account);
        when(refresh.issue(7L)).thenReturn(new RefreshTokenService.IssueResult("refresh", 100L, "jti", 7L));
        try (var sessions = mockStatic(StpUtil.class)) {
            sessions.when(StpUtil::getTokenValue).thenReturn("access");
            var issued = issuer.issueTokenPair(7L);
            assertThat(issued.getUserId()).isEqualTo(7L);
            assertThat(issued.getAccessToken()).isEqualTo("access");
            assertThat(issued.getRefreshToken()).isEqualTo("refresh");
            sessions.verify(() -> StpUtil.login(7L));
        }
    }
}
