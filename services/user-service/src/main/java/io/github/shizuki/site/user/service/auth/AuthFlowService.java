package io.github.shizuki.site.user.service.auth;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import io.github.shizuki.common.oauth.service.OAuthStateService;
import io.github.shizuki.common.oauth.strategy.OAuthProviderStrategy;
import io.github.shizuki.common.oauth.strategy.OAuthProviderStrategyFactory;
import io.github.shizuki.site.user.auth.AuthGrantCommand;
import io.github.shizuki.site.user.auth.AuthGrantResult;
import io.github.shizuki.site.user.auth.EmailVerificationPurpose;
import io.github.shizuki.site.user.auth.OAuthLoginScene;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.dto.auth.EmailBindRequest;
import io.github.shizuki.site.user.dto.auth.EmailRegisterRequest;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeResponse;
import io.github.shizuki.site.user.dto.auth.OAuthBindRequest;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import io.github.shizuki.site.user.entity.OAuthLoginEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AuthFlowService {

    private static final String OAUTH_STATUS_PENDING = "PENDING";
    private static final String OAUTH_STATUS_SUCCESS = "SUCCESS";
    private static final String OAUTH_STATUS_FAILED = "FAILED";

    private final UserAccountMapper userAccountMapper;
    private final OAuthBindingMapper oAuthBindingMapper;
    private final OAuthLoginMapper oAuthLoginMapper;
    private final OAuthStateService oAuthStateService;
    private final OAuthProviderStrategyFactory oAuthProviderStrategyFactory;
    private final EmailVerificationService emailVerificationService;
    private final RefreshTokenService refreshTokenService;
    private final AuthTokenIssuer authTokenIssuer;
    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;
    private final AuthProperties authProperties;

    public AuthFlowService(UserAccountMapper userAccountMapper,
                           OAuthBindingMapper oAuthBindingMapper,
                           OAuthLoginMapper oAuthLoginMapper,
                           OAuthStateService oAuthStateService,
                           OAuthProviderStrategyFactory oAuthProviderStrategyFactory,
                           EmailVerificationService emailVerificationService,
                           RefreshTokenService refreshTokenService,
                           AuthTokenIssuer authTokenIssuer,
                           StringRedisTemplate redisTemplate,
                           ObjectMapper objectMapper,
                           AuthProperties authProperties) {
        this.userAccountMapper = userAccountMapper;
        this.oAuthBindingMapper = oAuthBindingMapper;
        this.oAuthLoginMapper = oAuthLoginMapper;
        this.oAuthStateService = oAuthStateService;
        this.oAuthProviderStrategyFactory = oAuthProviderStrategyFactory;
        this.emailVerificationService = emailVerificationService;
        this.refreshTokenService = refreshTokenService;
        this.authTokenIssuer = authTokenIssuer;
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.authProperties = authProperties;
    }

    public AuthGrantResult grantByEmailPassword(AuthGrantCommand command) {
        String normalizedEmail = normalizeEmail(command.getEmail());
        if (!StringUtils.hasText(command.getPassword())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Password is required");
        }

        UserAccountEntity account = userAccountMapper.selectOne(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getEmail, normalizedEmail)
        );
        if (account == null || !StringUtils.hasText(account.getPassword())) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid email or password");
        }
        if (!BCrypt.checkpw(command.getPassword(), account.getPassword())) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid email or password");
        }
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    public AuthGrantResult grantByOAuthCode(AuthGrantCommand command) {
        requireOauthExchangePayload(command.getOauthLoginId(), command.getCode(), command.getState());
        if (!oAuthStateService.validateAndConsume(command.getOauthLoginId(), command.getState())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid oauth state");
        }

        OAuthLoginEntity oauthLogin = queryOauthLogin(command.getOauthLoginId());
        if (OAuthLoginScene.from(oauthLogin.getLoginScene()) != OAuthLoginScene.LOGIN) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth login scene mismatch");
        }

        String provider = chooseProvider(command.getProvider(), oauthLogin.getProvider());
        OAuthProviderStrategy providerStrategy = oAuthProviderStrategyFactory.get(provider);
        try {
            OAuthIdentity identity = providerStrategy.exchangeCode(command.getCode(), oauthLogin.getRedirectUri());
            AuthGrantResult result = bindOrCreateForOAuthLogin(provider, identity, oauthLogin);
            if (result.getResultType() == AuthGrantResult.ResultType.TOKEN_ISSUED) {
                markOauthLoginSuccess(oauthLogin, identity.providerUserId(), result.getUserId());
            } else {
                markOauthLoginFailure(oauthLogin, "BIND_REQUIRED");
            }
            return result;
        } catch (BusinessException ex) {
            markOauthLoginFailure(oauthLogin, ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            markOauthLoginFailure(oauthLogin, ex.getMessage());
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth exchange failed");
        }
    }

    public AuthGrantResult grantByRefreshToken(AuthGrantCommand command) {
        if (!StringUtils.hasText(command.getRefreshToken())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "refresh_token is required");
        }
        if (authProperties.getJwt().isRefreshRotate()) {
            RefreshTokenService.IssueResult rotated = refreshTokenService.rotate(command.getRefreshToken());
            return authTokenIssuer.issueWithExistingRefresh(
                rotated.userId(),
                rotated.token(),
                rotated.expiresInSec()
            );
        }

        Long userId = refreshTokenService.resolveUserId(command.getRefreshToken());
        return authTokenIssuer.issueWithExistingRefresh(
            userId,
            command.getRefreshToken(),
            authProperties.getJwt().getRefreshTtlSeconds()
        );
    }

    public AuthGrantResult registerByEmail(EmailRegisterRequest request) {
        String normalizedEmail = normalizeEmail(request.getEmail());
        if (existsEmailUser(normalizedEmail)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email already registered");
        }

        emailVerificationService.validateAndConsume(
            normalizedEmail,
            EmailVerificationPurpose.REGISTER,
            request.getEmailCode()
        );

        if (!StringUtils.hasText(request.getPassword())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Password is required");
        }
        UserAccountEntity account = new UserAccountEntity();
        account.setUsername(normalizedEmail);
        account.setEmail(normalizedEmail);
        account.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt(10)));
        account.setNickname(resolveRegisterNickname(normalizedEmail, request.getNickname()));
        account.setEmailVerified(1);
        account.setGroupsJson(writeJson(List.of("USER")));
        account.setPermissionsJson(writeJson(List.of()));
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.insert(account);
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    public OAuthAuthorizeResponse createOAuthAuthorization(String provider,
                                                           String redirectUri,
                                                           OAuthLoginScene scene,
                                                           Long initiatorUserId) {
        OAuthProviderStrategy strategy = oAuthProviderStrategyFactory.get(provider);
        if (scene == OAuthLoginScene.BIND && (initiatorUserId == null || initiatorUserId <= 0)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required for oauth bind");
        }

        String loginId = UUID.randomUUID().toString();
        String state = oAuthStateService.createState(loginId);
        String authorizeUrl = strategy.buildAuthorizeUrl(state, redirectUri);

        OAuthLoginEntity oauthLogin = new OAuthLoginEntity();
        oauthLogin.setOauthLoginId(loginId);
        oauthLogin.setProvider(provider.toLowerCase(Locale.ROOT));
        oauthLogin.setRedirectUri(redirectUri);
        oauthLogin.setState(state);
        oauthLogin.setStatus(OAUTH_STATUS_PENDING);
        oauthLogin.setLoginScene(scene.name());
        oauthLogin.setInitiatorUserId(initiatorUserId);
        oauthLogin.setCreatedAt(LocalDateTime.now());
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.insert(oauthLogin);
        return new OAuthAuthorizeResponse(loginId, authorizeUrl, state);
    }

    public void bindEmail(Long userId, EmailBindRequest request) {
        UserAccountEntity current = requireAccount(userId);
        String normalizedEmail = normalizeEmail(request.getEmail());
        UserAccountEntity existing = userAccountMapper.selectOne(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getEmail, normalizedEmail)
        );
        if (existing != null && !existing.getId().equals(userId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email already bound by another account");
        }
        emailVerificationService.validateAndConsume(
            normalizedEmail,
            EmailVerificationPurpose.BIND,
            request.getEmailCode()
        );

        current.setEmail(normalizedEmail);
        current.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt(10)));
        current.setEmailVerified(1);
        current.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.updateById(current);
    }

    public void bindOAuth(Long userId, OAuthBindRequest request) {
        requireAccount(userId);
        if (!oAuthStateService.validateAndConsume(request.getOauthLoginId(), request.getState())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid oauth state");
        }
        OAuthLoginEntity oauthLogin = queryOauthLogin(request.getOauthLoginId());
        OAuthLoginScene scene = OAuthLoginScene.from(oauthLogin.getLoginScene());
        if (scene != OAuthLoginScene.BIND) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth scene mismatch for binding");
        }
        if (oauthLogin.getInitiatorUserId() == null || !oauthLogin.getInitiatorUserId().equals(userId)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "OAuth bind initiator mismatch");
        }

        String provider = chooseProvider(request.getProvider(), oauthLogin.getProvider());
        OAuthProviderStrategy strategy = oAuthProviderStrategyFactory.get(provider);
        try {
            OAuthIdentity identity = strategy.exchangeCode(request.getCode(), oauthLogin.getRedirectUri());
            OAuthBindingEntity existingBinding = queryBinding(provider, identity.providerUserId());
            if (existingBinding != null && !existingBinding.getUserId().equals(userId)) {
                markOauthLoginFailure(oauthLogin, "provider already bound");
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound by another user");
            }

            if (existingBinding == null) {
                OAuthBindingEntity newBinding = new OAuthBindingEntity();
                newBinding.setUserId(userId);
                newBinding.setProvider(provider);
                newBinding.setProviderUserId(identity.providerUserId());
                newBinding.setProviderLogin(identity.login());
                newBinding.setProviderEmail(identity.email());
                newBinding.setCreatedAt(LocalDateTime.now());
                newBinding.setUpdatedAt(LocalDateTime.now());
                oAuthBindingMapper.insert(newBinding);
            }

            markOauthLoginSuccess(oauthLogin, identity.providerUserId(), userId);
        } catch (BusinessException ex) {
            markOauthLoginFailure(oauthLogin, ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            markOauthLoginFailure(oauthLogin, ex.getMessage());
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth bind failed");
        }
    }

    public void revokeRefreshToken(String refreshToken) {
        refreshTokenService.revoke(refreshToken);
    }

    public void revokeAllRefreshTokens(Long userId) {
        refreshTokenService.revokeAll(userId);
    }

    private AuthGrantResult bindOrCreateForOAuthLogin(String provider,
                                                      OAuthIdentity identity,
                                                      OAuthLoginEntity oauthLogin) {
        OAuthBindingEntity binding = queryBinding(provider, identity.providerUserId());
        if (binding != null) {
            return authTokenIssuer.issueTokenPair(binding.getUserId());
        }

        String normalizedEmail = StringUtils.hasText(identity.email()) ? normalizeEmail(identity.email()) : null;
        if (StringUtils.hasText(normalizedEmail)) {
            UserAccountEntity existingEmailUser = userAccountMapper.selectOne(
                new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getEmail, normalizedEmail)
            );
            if (existingEmailUser != null) {
                String ticket = createBindTicket(provider, oauthLogin.getOauthLoginId(), existingEmailUser.getId(), identity.providerUserId());
                return AuthGrantResult.bindRequired(ticket);
            }
        }

        UserAccountEntity account = new UserAccountEntity();
        account.setUsername(buildOAuthUsername(provider, identity));
        account.setPassword(null);
        account.setNickname(resolveOAuthNickname(identity));
        account.setEmail(normalizedEmail);
        account.setEmailVerified(StringUtils.hasText(normalizedEmail) ? 1 : 0);
        account.setGroupsJson(writeJson(List.of("USER")));
        account.setPermissionsJson(writeJson(List.of()));
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.insert(account);

        OAuthBindingEntity newBinding = new OAuthBindingEntity();
        newBinding.setUserId(account.getId());
        newBinding.setProvider(provider);
        newBinding.setProviderUserId(identity.providerUserId());
        newBinding.setProviderLogin(identity.login());
        newBinding.setProviderEmail(normalizedEmail);
        newBinding.setCreatedAt(LocalDateTime.now());
        newBinding.setUpdatedAt(LocalDateTime.now());
        oAuthBindingMapper.insert(newBinding);
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    private void requireOauthExchangePayload(String oauthLoginId, String code, String state) {
        if (!StringUtils.hasText(oauthLoginId) || !StringUtils.hasText(code) || !StringUtils.hasText(state)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "oauth_login_id, code and state are required");
        }
    }

    private UserAccountEntity requireAccount(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Account not found");
        }
        return account;
    }

    private OAuthLoginEntity queryOauthLogin(String oauthLoginId) {
        OAuthLoginEntity oauthLogin = oAuthLoginMapper.selectOne(
            new LambdaQueryWrapper<OAuthLoginEntity>()
                .eq(OAuthLoginEntity::getOauthLoginId, oauthLoginId)
        );
        if (oauthLogin == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "OAuth login not found");
        }
        return oauthLogin;
    }

    private OAuthBindingEntity queryBinding(String provider, String providerUserId) {
        return oAuthBindingMapper.selectOne(
            new LambdaQueryWrapper<OAuthBindingEntity>()
                .eq(OAuthBindingEntity::getProvider, provider)
                .eq(OAuthBindingEntity::getProviderUserId, providerUserId)
        );
    }

    private void markOauthLoginSuccess(OAuthLoginEntity oauthLogin, String providerUserId, Long userId) {
        oauthLogin.setStatus(OAUTH_STATUS_SUCCESS);
        oauthLogin.setProviderUserId(providerUserId);
        oauthLogin.setUserId(userId);
        oauthLogin.setErrorMessage(null);
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.updateById(oauthLogin);
    }

    private void markOauthLoginFailure(OAuthLoginEntity oauthLogin, String errorMessage) {
        oauthLogin.setStatus(OAUTH_STATUS_FAILED);
        oauthLogin.setErrorMessage(errorMessage);
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.updateById(oauthLogin);
    }

    private String createBindTicket(String provider, String oauthLoginId, Long targetUserId, String providerUserId) {
        String ticket = UUID.randomUUID().toString();
        BindTicketPayload payload = new BindTicketPayload(provider, oauthLoginId, targetUserId, providerUserId);
        String key = "auth:bind-ticket:" + ticket;
        redisTemplate.opsForValue().set(
            key,
            writeJson(payload),
            Duration.ofSeconds(authProperties.getBind().getTicketTtlSeconds())
        );
        return ticket;
    }

    private boolean existsEmailUser(String email) {
        return userAccountMapper.selectCount(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getEmail, email)
        ) > 0;
    }

    private String chooseProvider(String inputProvider, String persistedProvider) {
        String normalizedInput = StringUtils.hasText(inputProvider)
            ? inputProvider.trim().toLowerCase(Locale.ROOT)
            : null;
        String normalizedPersisted = StringUtils.hasText(persistedProvider)
            ? persistedProvider.trim().toLowerCase(Locale.ROOT)
            : null;
        if (!StringUtils.hasText(normalizedInput)) {
            if (!StringUtils.hasText(normalizedPersisted)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth provider is required");
            }
            return normalizedPersisted;
        }
        if (!StringUtils.hasText(normalizedPersisted)) {
            return normalizedInput;
        }
        if (!normalizedInput.equals(normalizedPersisted)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth provider mismatch");
        }
        return normalizedInput;
    }

    private String normalizeEmail(String rawEmail) {
        if (!StringUtils.hasText(rawEmail)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email is required");
        }
        return rawEmail.trim().toLowerCase(Locale.ROOT);
    }

    private String buildOAuthUsername(String provider, OAuthIdentity identity) {
        String login = StringUtils.hasText(identity.login())
            ? identity.login().trim().toLowerCase(Locale.ROOT)
            : provider + "_" + identity.providerUserId();
        String prefix = "github".equalsIgnoreCase(provider) ? "gh_" : "ld_";
        String base = prefix + login;
        if (!existsUsername(base)) {
            return base;
        }
        String suffix = identity.providerUserId();
        if (suffix.length() > 8) {
            suffix = suffix.substring(suffix.length() - 8);
        }
        return base + "_" + suffix;
    }

    private String resolveOAuthNickname(OAuthIdentity identity) {
        if (StringUtils.hasText(identity.nickname())) {
            return identity.nickname().trim();
        }
        if (StringUtils.hasText(identity.login())) {
            return identity.login().trim();
        }
        return "user-" + identity.providerUserId();
    }

    private String resolveRegisterNickname(String normalizedEmail, String inputNickname) {
        if (StringUtils.hasText(inputNickname)) {
            return inputNickname.trim();
        }
        int idx = normalizedEmail.indexOf('@');
        if (idx > 0) {
            return normalizedEmail.substring(0, idx);
        }
        return normalizedEmail;
    }

    private String writeJson(Object value) {
        try {
            return objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "JSON serialization failed");
        }
    }

    private boolean existsUsername(String username) {
        return userAccountMapper.selectCount(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getUsername, username)
        ) > 0;
    }

    private record BindTicketPayload(String provider, String oauthLoginId, Long targetUserId, String providerUserId) {
    }
}
