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
import io.github.shizuki.site.user.dto.auth.OAuthConflictConfirmRequest;
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
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 认证核心流程服务。
 *
 * <p>封装认证域主流程：邮箱登录/注册、OAuth 登录/绑定、refresh token 轮换、
 * 冲突绑定确认与绑定票据管理。
 */
@Component
public class AuthFlowService {

    /**
     * OAuth 登录事务状态：待处理。
     */
    private static final String OAUTH_STATUS_PENDING = "PENDING";
    /**
     * OAuth 登录事务状态：成功。
     */
    private static final String OAUTH_STATUS_SUCCESS = "SUCCESS";
    /**
     * OAuth 登录事务状态：失败。
     */
    private static final String OAUTH_STATUS_FAILED = "FAILED";

    /**
     * 用户账户读写。
     */
    private final UserAccountMapper userAccountMapper;
    /**
     * OAuth 绑定关系读写。
     */
    private final OAuthBindingMapper oAuthBindingMapper;
    /**
     * OAuth 登录事务读写。
     */
    private final OAuthLoginMapper oAuthLoginMapper;
    /**
     * OAuth state 管理服务。
     */
    private final OAuthStateService oAuthStateService;
    /**
     * OAuth provider 工厂。
     */
    private final OAuthProviderStrategyFactory oAuthProviderStrategyFactory;
    /**
     * 邮箱验证码服务。
     */
    private final EmailVerificationService emailVerificationService;
    /**
     * refresh token 会话服务。
     */
    private final RefreshTokenService refreshTokenService;
    /**
     * access/refresh token 签发器。
     */
    private final AuthTokenIssuer authTokenIssuer;
    /**
     * Redis 客户端，用于 bind_ticket 等短期态存储。
     */
    private final StringRedisTemplate redisTemplate;
    /**
     * JSON 序列化组件。
     */
    private final ObjectMapper objectMapper;
    /**
     * 认证配置属性。
     */
    private final AuthProperties authProperties;

    /**
     * 构造认证核心流程服务。
     *
     * @param userAccountMapper 用户账户读写组件
     * @param oAuthBindingMapper OAuth 绑定关系读写组件
     * @param oAuthLoginMapper OAuth 登录事务读写组件
     * @param oAuthStateService OAuth state 管理服务
     * @param oAuthProviderStrategyFactory OAuth provider 工厂
     * @param emailVerificationService 邮箱验证码服务
     * @param refreshTokenService refresh token 会话服务
     * @param authTokenIssuer token 签发器
     * @param redisTemplate Redis 客户端
     * @param objectMapper JSON 序列化组件
     * @param authProperties 认证配置
     */
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

    /**
     * 邮箱密码授权。
     *
     * @param command 授权命令
     * @return 已签发 token 的授权结果
     */
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
        // 密码通过后直接签发 token，对外隐藏账户存在性细节。
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    /**
     * OAuth 授权码授权。
     *
     * @param command 授权命令
     * @return 授权结果（可能为 TOKEN_ISSUED 或 BIND_REQUIRED）
     */
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
            // 关键流程：优先查现有绑定，其次按邮箱冲突策略决定“显式绑定”还是“自动创建”。
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

    /**
     * refresh token 授权。
     *
     * @param command 授权命令
     * @return 授权结果
     */
    public AuthGrantResult grantByRefreshToken(AuthGrantCommand command) {
        if (!StringUtils.hasText(command.getRefreshToken())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "refresh_token is required");
        }
        if (authProperties.getJwt().isRefreshRotate()) {
            // 开启轮换：旧 refresh 失效并发放新 refresh。
            RefreshTokenService.IssueResult rotated = refreshTokenService.rotate(command.getRefreshToken());
            return authTokenIssuer.issueWithExistingRefresh(
                rotated.userId(),
                rotated.token(),
                rotated.expiresInSec()
            );
        }

        // 关闭轮换：沿用传入 refresh，只重新签发 access。
        Long userId = refreshTokenService.resolveUserId(command.getRefreshToken());
        return authTokenIssuer.issueWithExistingRefresh(
            userId,
            command.getRefreshToken(),
            authProperties.getJwt().getRefreshTtlSeconds()
        );
    }

    /**
     * 邮箱注册。
     *
     * @param request 注册请求
     * @return 注册后签发的 token
     */
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
        // 首次注册默认 USER 分组，权限列表留空由后续策略扩展。
        account.setGroupsJson(writeJson(List.of("USER")));
        account.setPermissionsJson(writeJson(List.of()));
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        try {
            userAccountMapper.insert(account);
        } catch (DuplicateKeyException ex) {
            // 并发注册场景下交由数据库唯一键收敛，避免 500 暴露到客户端。
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email already registered");
        }
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    /**
     * 创建 OAuth 授权事务。
     *
     * @param provider OAuth provider
     * @param redirectUri 回调地址
     * @param scene 登录场景
     * @param initiatorUserId 发起人用户 ID（bind 场景必填）
     * @return 授权事务响应
     */
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

        // 落库存档用于后续 code 换取、scene 校验和审计追踪。
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

    /**
     * 绑定邮箱凭据到当前账号。
     *
     * @param userId 当前用户 ID
     * @param request 绑定请求
     */
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
        // 绑定邮箱时同步设置本地密码，后续支持邮箱密码登录。
        current.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt(10)));
        current.setEmailVerified(1);
        current.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.updateById(current);
    }

    /**
     * 绑定 OAuth 凭据到当前账号。
     *
     * @param userId 当前用户 ID
     * @param request 绑定请求
     */
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
                // 幂等语义：已绑定则直接成功；未绑定才创建新记录。
                OAuthBindingEntity newBinding = new OAuthBindingEntity();
                newBinding.setUserId(userId);
                newBinding.setProvider(provider);
                newBinding.setProviderUserId(identity.providerUserId());
                newBinding.setProviderLogin(identity.login());
                newBinding.setProviderEmail(identity.email());
                newBinding.setCreatedAt(LocalDateTime.now());
                newBinding.setUpdatedAt(LocalDateTime.now());
                try {
                    oAuthBindingMapper.insert(newBinding);
                } catch (DuplicateKeyException ex) {
                    OAuthBindingEntity conflictedBinding = queryBinding(provider, identity.providerUserId());
                    if (conflictedBinding == null) {
                        throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound");
                    }
                    if (!conflictedBinding.getUserId().equals(userId)) {
                        throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound by another user");
                    }
                }
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

    /**
     * 显式确认 OAuth 冲突绑定并完成登录。
     *
     * @param request 冲突确认请求
     * @return 绑定完成后的 token
     */
    public AuthGrantResult confirmConflictBinding(OAuthConflictConfirmRequest request) {
        if (request == null || !StringUtils.hasText(request.getBindTicket())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "bind_ticket is required");
        }

        // bind_ticket 对应“待确认绑定”上下文，来源于 OAuth 登录冲突分支。
        BindTicketPayload payload = readBindTicket(request.getBindTicket());
        OAuthLoginEntity oauthLogin = queryOauthLogin(payload.oauthLoginId());
        if (OAuthLoginScene.from(oauthLogin.getLoginScene()) != OAuthLoginScene.LOGIN) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth login scene mismatch");
        }
        String provider = chooseProvider(payload.provider(), oauthLogin.getProvider());

        UserAccountEntity targetAccount = requireAccount(payload.targetUserId());
        String normalizedEmail = normalizeEmail(request.getEmail());
        if (!normalizedEmail.equalsIgnoreCase(targetAccount.getEmail())) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Email or password invalid");
        }
        if (!StringUtils.hasText(targetAccount.getPassword()) || !BCrypt.checkpw(request.getPassword(), targetAccount.getPassword())) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Email or password invalid");
        }

        OAuthBindingEntity existingBinding = queryBinding(provider, payload.providerUserId());
        if (existingBinding != null && !existingBinding.getUserId().equals(targetAccount.getId())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound by another user");
        }
        if (existingBinding == null) {
            // 将当前 OAuth 身份补绑到冲突邮箱对应账号，完成账号归并闭环。
            OAuthBindingEntity newBinding = new OAuthBindingEntity();
            newBinding.setUserId(targetAccount.getId());
            newBinding.setProvider(provider);
            newBinding.setProviderUserId(payload.providerUserId());
            newBinding.setProviderLogin(payload.providerLogin());
            newBinding.setProviderEmail(payload.providerEmail());
            newBinding.setCreatedAt(LocalDateTime.now());
            newBinding.setUpdatedAt(LocalDateTime.now());
            try {
                oAuthBindingMapper.insert(newBinding);
            } catch (DuplicateKeyException ex) {
                OAuthBindingEntity conflictedBinding = queryBinding(provider, payload.providerUserId());
                if (conflictedBinding == null) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound");
                }
                if (!conflictedBinding.getUserId().equals(targetAccount.getId())) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound by another user");
                }
            }
        }

        markOauthLoginSuccess(oauthLogin, payload.providerUserId(), targetAccount.getId());
        // 票据单次消费，防止重复提交。
        redisTemplate.delete(bindTicketKey(request.getBindTicket()));
        return authTokenIssuer.issueTokenPair(targetAccount.getId());
    }

    /**
     * 失效单个 refresh token。
     *
     * @param refreshToken refresh token
     */
    public void revokeRefreshToken(String refreshToken) {
        refreshTokenService.revoke(refreshToken);
    }

    /**
     * 失效用户全部 refresh token。
     *
     * @param userId 用户 ID
     */
    public void revokeAllRefreshTokens(Long userId) {
        refreshTokenService.revokeAll(userId);
    }

    /**
     * OAuth 登录后的绑定/建号收口逻辑。
     *
     * @param provider provider 编码
     * @param identity 第三方身份信息
     * @param oauthLogin OAuth 登录事务
     * @return 授权结果
     */
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
                String ticket = createBindTicket(
                    provider,
                    oauthLogin.getOauthLoginId(),
                    existingEmailUser.getId(),
                    identity.providerUserId(),
                    identity.login(),
                    normalizedEmail
                );
                // 邮箱冲突：不做隐式合并，返回一次性票据要求用户显式确认。
                return AuthGrantResult.bindRequired(ticket);
            }
        }

        UserAccountEntity account = createOAuthAccount(provider, identity, normalizedEmail, false);
        try {
            userAccountMapper.insert(account);
        } catch (DuplicateKeyException ex) {
            // 高频并发下用户名可能瞬时冲突，仅再试一次短后缀版本，避免复杂锁。
            UserAccountEntity fallbackAccount = createOAuthAccount(provider, identity, normalizedEmail, true);
            try {
                userAccountMapper.insert(fallbackAccount);
                account = fallbackAccount;
            } catch (DuplicateKeyException secondEx) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth account creation conflict");
            }
        }

        OAuthBindingEntity newBinding = new OAuthBindingEntity();
        newBinding.setUserId(account.getId());
        newBinding.setProvider(provider);
        newBinding.setProviderUserId(identity.providerUserId());
        newBinding.setProviderLogin(identity.login());
        newBinding.setProviderEmail(normalizedEmail);
        newBinding.setCreatedAt(LocalDateTime.now());
        newBinding.setUpdatedAt(LocalDateTime.now());
        try {
            oAuthBindingMapper.insert(newBinding);
        } catch (DuplicateKeyException ex) {
            OAuthBindingEntity conflictedBinding = queryBinding(provider, identity.providerUserId());
            if (conflictedBinding == null) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider account already bound");
            }
            return authTokenIssuer.issueTokenPair(conflictedBinding.getUserId());
        }
        return authTokenIssuer.issueTokenPair(account.getId());
    }

    /**
     * 校验 OAuth 授权码换 token 必需参数。
     *
     * @param oauthLoginId OAuth 登录事务 ID
     * @param code OAuth 授权码
     * @param state OAuth 状态值
     */
    private void requireOauthExchangePayload(String oauthLoginId, String code, String state) {
        if (!StringUtils.hasText(oauthLoginId) || !StringUtils.hasText(code) || !StringUtils.hasText(state)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "oauth_login_id, code and state are required");
        }
    }

    /**
     * 加载并校验账号存在性。
     *
     * @param userId 用户 ID
     * @return 账号实体
     */
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

    /**
     * 根据 oauth_login_id 查询 OAuth 事务。
     *
     * @param oauthLoginId OAuth 登录事务 ID
     * @return OAuth 登录实体
     */
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

    /**
     * 查询 OAuth 身份绑定关系。
     *
     * @param provider provider 编码
     * @param providerUserId provider 用户 ID
     * @return 绑定实体，不存在时返回 null
     */
    private OAuthBindingEntity queryBinding(String provider, String providerUserId) {
        return oAuthBindingMapper.selectOne(
            new LambdaQueryWrapper<OAuthBindingEntity>()
                .eq(OAuthBindingEntity::getProvider, provider)
                .eq(OAuthBindingEntity::getProviderUserId, providerUserId)
        );
    }

    /**
     * 标记 OAuth 事务成功。
     *
     * @param oauthLogin OAuth 登录实体
     * @param providerUserId 第三方用户 ID
     * @param userId 归属平台用户 ID
     */
    private void markOauthLoginSuccess(OAuthLoginEntity oauthLogin, String providerUserId, Long userId) {
        oauthLogin.setStatus(OAUTH_STATUS_SUCCESS);
        oauthLogin.setProviderUserId(providerUserId);
        oauthLogin.setUserId(userId);
        oauthLogin.setErrorMessage(null);
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.updateById(oauthLogin);
    }

    /**
     * 标记 OAuth 事务失败。
     *
     * @param oauthLogin OAuth 登录实体
     * @param errorMessage 错误信息
     */
    private void markOauthLoginFailure(OAuthLoginEntity oauthLogin, String errorMessage) {
        oauthLogin.setStatus(OAUTH_STATUS_FAILED);
        oauthLogin.setErrorMessage(errorMessage);
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.updateById(oauthLogin);
    }

    /**
     * 创建冲突绑定票据并写入 Redis。
     *
     * @param provider provider 编码
     * @param oauthLoginId OAuth 登录事务 ID
     * @param targetUserId 目标用户 ID
     * @param providerUserId provider 用户 ID
     * @param providerLogin provider 登录名
     * @param providerEmail provider 邮箱
     * @return bind_ticket
     */
    private String createBindTicket(String provider,
                                    String oauthLoginId,
                                    Long targetUserId,
                                    String providerUserId,
                                    String providerLogin,
                                    String providerEmail) {
        String ticket = UUID.randomUUID().toString();
        BindTicketPayload payload = new BindTicketPayload(
            provider,
            oauthLoginId,
            targetUserId,
            providerUserId,
            providerLogin,
            providerEmail
        );
        redisTemplate.opsForValue().set(
            bindTicketKey(ticket),
            writeJson(payload),
            // ticket 使用短 TTL，限制暴露窗口和重放风险。
            Duration.ofSeconds(authProperties.getBind().getTicketTtlSeconds())
        );
        return ticket;
    }

    /**
     * 读取并校验绑定票据。
     *
     * @param bindTicket 票据值
     * @return 票据载荷
     */
    private BindTicketPayload readBindTicket(String bindTicket) {
        String rawPayload = redisTemplate.opsForValue().get(bindTicketKey(bindTicket));
        if (!StringUtils.hasText(rawPayload)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "bind_ticket invalid or expired");
        }
        try {
            BindTicketPayload payload = objectMapper.readValue(rawPayload, BindTicketPayload.class);
            if (payload.targetUserId() == null || payload.targetUserId() <= 0 || !StringUtils.hasText(payload.providerUserId())) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "bind_ticket payload invalid");
            }
            return payload;
        } catch (BusinessException ex) {
            throw ex;
        } catch (Exception ex) {
            // 任意反序列化异常统一归并为 BAD_REQUEST，避免泄露内部结构。
            throw new BusinessException(ErrorCode.BAD_REQUEST, "bind_ticket payload invalid");
        }
    }

    /**
     * 计算 bind_ticket 对应 Redis key。
     *
     * @param ticket 票据值
     * @return Redis key
     */
    private String bindTicketKey(String ticket) {
        return "auth:bind-ticket:" + ticket;
    }

    /**
     * 检查邮箱是否已存在账号。
     *
     * @param email 规范化后的邮箱
     * @return true 表示已存在
     */
    private boolean existsEmailUser(String email) {
        return userAccountMapper.selectCount(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getEmail, email)
        ) > 0;
    }

    /**
     * 选择最终 provider，并校验请求与事务记录是否一致。
     *
     * @param inputProvider 请求中的 provider
     * @param persistedProvider OAuth 事务中的 provider
     * @return 归一化后的 provider
     */
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

    /**
     * 邮箱规范化。
     *
     * @param rawEmail 原始邮箱
     * @return 规范化后的邮箱（trim + lower-case）
     */
    private String normalizeEmail(String rawEmail) {
        if (!StringUtils.hasText(rawEmail)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email is required");
        }
        return rawEmail.trim().toLowerCase(Locale.ROOT);
    }

    /**
     * 构造 OAuth 注册用户名。
     *
     * @param provider provider 编码
     * @param identity OAuth 身份
     * @return 平台用户名
     */
    private String buildOAuthUsername(String provider, OAuthIdentity identity) {
        String login = StringUtils.hasText(identity.login())
            ? identity.login().trim().toLowerCase(Locale.ROOT)
            : provider + "_" + identity.providerUserId();
        String prefix = "github".equalsIgnoreCase(provider) ? "gh_" : "ld_";
        String base = prefix + login;
        if (!existsUsername(base)) {
            return base;
        }
        // 冲突时拼接 providerUserId 尾段，降低碰撞概率。
        String suffix = identity.providerUserId();
        if (suffix.length() > 8) {
            suffix = suffix.substring(suffix.length() - 8);
        }
        return base + "_" + suffix;
    }

    private UserAccountEntity createOAuthAccount(String provider,
                                                 OAuthIdentity identity,
                                                 String normalizedEmail,
                                                 boolean withRandomSuffix) {
        UserAccountEntity account = new UserAccountEntity();
        String username = buildOAuthUsername(provider, identity);
        if (withRandomSuffix) {
            String suffix = UUID.randomUUID().toString().substring(0, 6);
            username = username + "_" + suffix;
        }
        account.setUsername(username);
        account.setPassword(null);
        account.setNickname(resolveOAuthNickname(identity));
        account.setEmail(normalizedEmail);
        account.setEmailVerified(StringUtils.hasText(normalizedEmail) ? 1 : 0);
        account.setGroupsJson(writeJson(List.of("USER")));
        account.setPermissionsJson(writeJson(List.of()));
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        return account;
    }

    /**
     * 解析 OAuth 昵称展示值。
     *
     * @param identity OAuth 身份
     * @return 昵称
     */
    private String resolveOAuthNickname(OAuthIdentity identity) {
        if (StringUtils.hasText(identity.nickname())) {
            return identity.nickname().trim();
        }
        if (StringUtils.hasText(identity.login())) {
            return identity.login().trim();
        }
        return "user-" + identity.providerUserId();
    }

    /**
     * 解析邮箱注册昵称。
     *
     * @param normalizedEmail 规范化邮箱
     * @param inputNickname 前端输入昵称
     * @return 昵称
     */
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

    /**
     * 对象序列化为 JSON。
     *
     * @param value 待序列化对象
     * @return JSON 字符串
     */
    private String writeJson(Object value) {
        try {
            return objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "JSON serialization failed");
        }
    }

    /**
     * 检查用户名是否已存在。
     *
     * @param username 用户名
     * @return true 表示已存在
     */
    private boolean existsUsername(String username) {
        return userAccountMapper.selectCount(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getUsername, username)
        ) > 0;
    }

    /**
     * bind_ticket 载荷结构。
     */
    private record BindTicketPayload(String provider,
                                     String oauthLoginId,
                                     Long targetUserId,
                                     String providerUserId,
                                     String providerLogin,
                                     String providerEmail) {
    }
}
