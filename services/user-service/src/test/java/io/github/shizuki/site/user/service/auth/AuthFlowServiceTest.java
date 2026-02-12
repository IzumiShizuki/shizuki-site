package io.github.shizuki.site.user.service.auth;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import io.github.shizuki.common.oauth.service.OAuthStateService;
import io.github.shizuki.common.oauth.strategy.OAuthProviderStrategy;
import io.github.shizuki.common.oauth.strategy.OAuthProviderStrategyFactory;
import io.github.shizuki.site.user.auth.AuthGrantResult;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.dto.auth.EmailRegisterRequest;
import io.github.shizuki.site.user.dto.auth.OAuthBindRequest;
import io.github.shizuki.site.user.dto.auth.OAuthConflictConfirmRequest;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import io.github.shizuki.site.user.entity.OAuthLoginEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * {@link AuthFlowService} 单元测试。
 *
 * <p>重点覆盖并发冲突收敛策略：
 * 注册冲突映射、OAuth 绑定幂等分流、冲突确认绑定分流。
 */
@ExtendWith(MockitoExtension.class)
class AuthFlowServiceTest {

    @Mock
    private UserAccountMapper userAccountMapper;
    @Mock
    private OAuthBindingMapper oAuthBindingMapper;
    @Mock
    private OAuthLoginMapper oAuthLoginMapper;
    @Mock
    private OAuthStateService oAuthStateService;
    @Mock
    private OAuthProviderStrategyFactory oAuthProviderStrategyFactory;
    @Mock
    private OAuthProviderStrategy oAuthProviderStrategy;
    @Mock
    private EmailVerificationService emailVerificationService;
    @Mock
    private RefreshTokenService refreshTokenService;
    @Mock
    private AuthTokenIssuer authTokenIssuer;
    @Mock
    private StringRedisTemplate redisTemplate;
    @Mock
    private ValueOperations<String, String> valueOperations;

    private AuthFlowService authFlowService;
    private ObjectMapper objectMapper;

    /**
     * 初始化被测服务与基础依赖。
     */
    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
        AuthProperties authProperties = new AuthProperties();
        authFlowService = new AuthFlowService(
            userAccountMapper,
            oAuthBindingMapper,
            oAuthLoginMapper,
            oAuthStateService,
            oAuthProviderStrategyFactory,
            emailVerificationService,
            refreshTokenService,
            authTokenIssuer,
            redisTemplate,
            objectMapper,
            authProperties
        );
    }

    /**
     * 场景：邮箱注册在最终插入时命中唯一键冲突。
     * 期望：统一映射为 BAD_REQUEST，避免透出 500。
     */
    @Test
    void shouldReturnBadRequestWhenRegisterInsertConflicted() {
        EmailRegisterRequest request = new EmailRegisterRequest();
        request.setEmail("demo@example.com");
        request.setPassword("P@ssw0rd");
        request.setEmailCode("123456");

        Mockito.when(userAccountMapper.selectCount(ArgumentMatchers.any())).thenReturn(0L);
        Mockito.doThrow(new DuplicateKeyException("duplicate email"))
            .when(userAccountMapper).insert(ArgumentMatchers.any(UserAccountEntity.class));

        assertThatThrownBy(() -> authFlowService.registerByEmail(request))
            .isInstanceOf(BusinessException.class)
            .matches(ex -> ((BusinessException) ex).getErrorCode() == ErrorCode.BAD_REQUEST)
            .hasMessageContaining("Email already registered");
    }

    /**
     * 场景：OAuth 绑定插入冲突，但冲突记录归属当前用户。
     * 期望：按幂等成功处理，不抛异常。
     */
    @Test
    void shouldTreatBindOAuthDuplicateInsertAsIdempotentWhenOwnedBySameUser() {
        long userId = 100L;
        OAuthBindRequest request = buildBindRequest();
        OAuthLoginEntity oauthLogin = buildBindSceneOauthLogin(userId);
        OAuthIdentity identity = new OAuthIdentity("github", "provider-user-1", "demo", "demo@example.com", "demo", null);
        OAuthBindingEntity sameUserBinding = new OAuthBindingEntity();
        sameUserBinding.setUserId(userId);

        Mockito.when(userAccountMapper.selectById(userId)).thenReturn(buildAccount(userId, "demo@example.com"));
        Mockito.when(oAuthStateService.validateAndConsume("oauth-login-1", "state-1")).thenReturn(true);
        Mockito.when(oAuthLoginMapper.selectOne(ArgumentMatchers.any())).thenReturn(oauthLogin);
        Mockito.when(oAuthProviderStrategyFactory.get("github")).thenReturn(oAuthProviderStrategy);
        Mockito.when(oAuthProviderStrategy.exchangeCode("code-1", "https://example.com/callback")).thenReturn(identity);
        Mockito.when(oAuthBindingMapper.selectOne(ArgumentMatchers.any()))
            .thenReturn(null)
            .thenReturn(sameUserBinding);
        Mockito.doThrow(new DuplicateKeyException("duplicate binding"))
            .when(oAuthBindingMapper).insert(ArgumentMatchers.any(OAuthBindingEntity.class));

        assertThatCode(() -> authFlowService.bindOAuth(userId, request)).doesNotThrowAnyException();
        Mockito.verify(oAuthLoginMapper).updateById(ArgumentMatchers.any(OAuthLoginEntity.class));
    }

    /**
     * 场景：OAuth 绑定插入冲突，冲突记录归属其他用户。
     * 期望：返回 BAD_REQUEST，阻止账号串绑。
     */
    @Test
    void shouldRejectBindOAuthDuplicateInsertWhenOwnedByOtherUser() {
        long userId = 100L;
        OAuthBindRequest request = buildBindRequest();
        OAuthLoginEntity oauthLogin = buildBindSceneOauthLogin(userId);
        OAuthIdentity identity = new OAuthIdentity("github", "provider-user-1", "demo", "demo@example.com", "demo", null);
        OAuthBindingEntity anotherUserBinding = new OAuthBindingEntity();
        anotherUserBinding.setUserId(999L);

        Mockito.when(userAccountMapper.selectById(userId)).thenReturn(buildAccount(userId, "demo@example.com"));
        Mockito.when(oAuthStateService.validateAndConsume("oauth-login-1", "state-1")).thenReturn(true);
        Mockito.when(oAuthLoginMapper.selectOne(ArgumentMatchers.any())).thenReturn(oauthLogin);
        Mockito.when(oAuthProviderStrategyFactory.get("github")).thenReturn(oAuthProviderStrategy);
        Mockito.when(oAuthProviderStrategy.exchangeCode("code-1", "https://example.com/callback")).thenReturn(identity);
        Mockito.when(oAuthBindingMapper.selectOne(ArgumentMatchers.any()))
            .thenReturn(null)
            .thenReturn(anotherUserBinding);
        Mockito.doThrow(new DuplicateKeyException("duplicate binding"))
            .when(oAuthBindingMapper).insert(ArgumentMatchers.any(OAuthBindingEntity.class));

        assertThatThrownBy(() -> authFlowService.bindOAuth(userId, request))
            .isInstanceOf(BusinessException.class)
            .matches(ex -> ((BusinessException) ex).getErrorCode() == ErrorCode.BAD_REQUEST)
            .hasMessageContaining("already bound by another user");
    }

    /**
     * 场景：冲突绑定确认时发生唯一键冲突，但绑定已归属目标账号。
     * 期望：视为幂等成功并继续发放 token。
     */
    @Test
    void shouldTreatConfirmConflictBindingDuplicateInsertAsSuccessWhenOwnedBySameUser() throws Exception {
        OAuthConflictConfirmRequest request = new OAuthConflictConfirmRequest();
        request.setBindTicket("ticket-1");
        request.setEmail("demo@example.com");
        request.setPassword("P@ssw0rd");

        long targetUserId = 88L;
        OAuthBindingEntity sameUserBinding = new OAuthBindingEntity();
        sameUserBinding.setUserId(targetUserId);
        UserAccountEntity account = buildAccount(targetUserId, "demo@example.com");
        account.setPassword(BCrypt.hashpw("P@ssw0rd", BCrypt.gensalt(10)));
        OAuthLoginEntity oauthLogin = buildLoginSceneOauthLogin();
        AuthGrantResult tokenResult = new AuthGrantResult();
        tokenResult.setResultType(AuthGrantResult.ResultType.TOKEN_ISSUED);
        tokenResult.setUserId(targetUserId);

        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:bind-ticket:ticket-1"))
            .thenReturn(bindTicketPayloadJson("github", "oauth-login-login", targetUserId, "provider-user-1"));
        Mockito.when(oAuthLoginMapper.selectOne(ArgumentMatchers.any())).thenReturn(oauthLogin);
        Mockito.when(userAccountMapper.selectById(targetUserId)).thenReturn(account);
        Mockito.when(oAuthBindingMapper.selectOne(ArgumentMatchers.any()))
            .thenReturn(null)
            .thenReturn(sameUserBinding);
        Mockito.doThrow(new DuplicateKeyException("duplicate binding"))
            .when(oAuthBindingMapper).insert(ArgumentMatchers.any(OAuthBindingEntity.class));
        Mockito.when(authTokenIssuer.issueTokenPair(targetUserId)).thenReturn(tokenResult);

        AuthGrantResult result = authFlowService.confirmConflictBinding(request);

        assertThat(result.getResultType()).isEqualTo(AuthGrantResult.ResultType.TOKEN_ISSUED);
        assertThat(result.getUserId()).isEqualTo(targetUserId);
    }

    /**
     * 场景：冲突绑定确认时发生唯一键冲突，且绑定归属其他账号。
     * 期望：返回 BAD_REQUEST，禁止误绑。
     */
    @Test
    void shouldRejectConfirmConflictBindingDuplicateInsertWhenOwnedByOtherUser() throws Exception {
        OAuthConflictConfirmRequest request = new OAuthConflictConfirmRequest();
        request.setBindTicket("ticket-1");
        request.setEmail("demo@example.com");
        request.setPassword("P@ssw0rd");

        long targetUserId = 88L;
        OAuthBindingEntity anotherUserBinding = new OAuthBindingEntity();
        anotherUserBinding.setUserId(999L);
        UserAccountEntity account = buildAccount(targetUserId, "demo@example.com");
        account.setPassword(BCrypt.hashpw("P@ssw0rd", BCrypt.gensalt(10)));
        OAuthLoginEntity oauthLogin = buildLoginSceneOauthLogin();

        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        Mockito.when(valueOperations.get("auth:bind-ticket:ticket-1"))
            .thenReturn(bindTicketPayloadJson("github", "oauth-login-login", targetUserId, "provider-user-1"));
        Mockito.when(oAuthLoginMapper.selectOne(ArgumentMatchers.any())).thenReturn(oauthLogin);
        Mockito.when(userAccountMapper.selectById(targetUserId)).thenReturn(account);
        Mockito.when(oAuthBindingMapper.selectOne(ArgumentMatchers.any()))
            .thenReturn(null)
            .thenReturn(anotherUserBinding);
        Mockito.doThrow(new DuplicateKeyException("duplicate binding"))
            .when(oAuthBindingMapper).insert(ArgumentMatchers.any(OAuthBindingEntity.class));

        assertThatThrownBy(() -> authFlowService.confirmConflictBinding(request))
            .isInstanceOf(BusinessException.class)
            .matches(ex -> ((BusinessException) ex).getErrorCode() == ErrorCode.BAD_REQUEST)
            .hasMessageContaining("already bound by another user");
    }

    /**
     * 测试辅助：构造标准 OAuth 绑定请求。
     */
    private OAuthBindRequest buildBindRequest() {
        OAuthBindRequest request = new OAuthBindRequest();
        request.setProvider("github");
        request.setOauthLoginId("oauth-login-1");
        request.setCode("code-1");
        request.setState("state-1");
        return request;
    }

    /**
     * 测试辅助：构造 BIND 场景 OAuth 登录事务。
     *
     * @param initiatorUserId 发起绑定的用户 ID
     * @return OAuth 登录事务实体
     */
    private OAuthLoginEntity buildBindSceneOauthLogin(long initiatorUserId) {
        OAuthLoginEntity entity = new OAuthLoginEntity();
        entity.setOauthLoginId("oauth-login-1");
        entity.setProvider("github");
        entity.setRedirectUri("https://example.com/callback");
        entity.setLoginScene("BIND");
        entity.setInitiatorUserId(initiatorUserId);
        entity.setStatus("PENDING");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        return entity;
    }

    /**
     * 测试辅助：构造 LOGIN 场景 OAuth 登录事务。
     */
    private OAuthLoginEntity buildLoginSceneOauthLogin() {
        OAuthLoginEntity entity = new OAuthLoginEntity();
        entity.setOauthLoginId("oauth-login-login");
        entity.setProvider("github");
        entity.setRedirectUri("https://example.com/callback");
        entity.setLoginScene("LOGIN");
        entity.setStatus("PENDING");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        return entity;
    }

    /**
     * 测试辅助：构造用户账号实体。
     *
     * @param userId 用户 ID
     * @param email 邮箱
     * @return 账号实体
     */
    private UserAccountEntity buildAccount(long userId, String email) {
        UserAccountEntity account = new UserAccountEntity();
        account.setId(userId);
        account.setEmail(email);
        return account;
    }

    /**
     * 测试辅助：构造 bind_ticket Redis 载荷 JSON。
     *
     * @param provider OAuth 提供方
     * @param oauthLoginId OAuth 登录事务 ID
     * @param targetUserId 目标用户 ID
     * @param providerUserId 提供方用户 ID
     * @return bind_ticket 对应 JSON 内容
     * @throws Exception 序列化异常
     */
    private String bindTicketPayloadJson(String provider,
                                         String oauthLoginId,
                                         long targetUserId,
                                         String providerUserId) throws Exception {
        return objectMapper.writeValueAsString(new BindTicketPayloadFixture(
            provider,
            oauthLoginId,
            targetUserId,
            providerUserId,
            "demo",
            "demo@example.com"
        ));
    }

    /**
     * bind_ticket 载荷测试桩。
     */
    private record BindTicketPayloadFixture(String provider,
                                            String oauthLoginId,
                                            Long targetUserId,
                                            String providerUserId,
                                            String providerLogin,
                                            String providerEmail) {
    }
}
