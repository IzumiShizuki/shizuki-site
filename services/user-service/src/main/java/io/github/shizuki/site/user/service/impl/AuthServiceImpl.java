package io.github.shizuki.site.user.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.auth.AuthGrantCommand;
import io.github.shizuki.site.user.auth.AuthGrantResult;
import io.github.shizuki.site.user.auth.AuthGrantStrategyFactory;
import io.github.shizuki.site.user.auth.AuthGrantType;
import io.github.shizuki.site.user.auth.EmailVerificationPurpose;
import io.github.shizuki.site.user.auth.OAuthLoginScene;
import io.github.shizuki.site.user.dto.auth.AuthGrantRequest;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLogoutRequest;
import io.github.shizuki.site.user.dto.auth.AuthTokenResponse;
import io.github.shizuki.site.user.dto.auth.EmailBindRequest;
import io.github.shizuki.site.user.dto.auth.EmailRegisterRequest;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendRequest;
import io.github.shizuki.site.user.dto.auth.EmailVerificationSendResponse;
import io.github.shizuki.site.user.dto.auth.ImageCaptchaResponse;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeRequest;
import io.github.shizuki.site.user.dto.auth.OAuthAuthorizeResponse;
import io.github.shizuki.site.user.dto.auth.OAuthBindRequest;
import io.github.shizuki.site.user.dto.auth.OAuthConflictConfirmRequest;
import io.github.shizuki.site.user.entity.GroupPermissionEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.GroupPermissionMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.service.AuthService;
import io.github.shizuki.site.user.service.auth.AuthFlowService;
import io.github.shizuki.site.user.service.auth.EmailVerificationService;
import io.github.shizuki.site.user.service.auth.ImageCaptchaService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * {@link AuthService} 默认实现。
 *
 * <p>职责定位：
 * <ul>
 *     <li>承接 controller 输入，做参数归并与登录态门禁；</li>
 *     <li>把授权请求转换为策略命令并分发；</li>
 *     <li>调用认证流程服务处理注册/绑定/刷新等核心逻辑；</li>
 *     <li>将领域结果转换为对外 DTO。</li>
 * </ul>
 */
@Service
public class AuthServiceImpl implements AuthService {

    /**
     * 图形验证码服务。
     */
    private final ImageCaptchaService imageCaptchaService;
    /**
     * 邮箱验证码服务。
     */
    private final EmailVerificationService emailVerificationService;
    /**
     * 认证流程服务（注册、OAuth 绑定、refresh 轮换等核心流程）。
     */
    private final AuthFlowService authFlowService;
    /**
     * grant 策略工厂。
     */
    private final AuthGrantStrategyFactory authGrantStrategyFactory;
    /**
     * 用户账户数据访问组件。
     */
    private final UserAccountMapper userAccountMapper;
    /**
     * 分组权限映射访问组件。
     */
    private final GroupPermissionMapper groupPermissionMapper;
    /**
     * JSON 序列化组件，用于 groups/permissions 解析。
     */
    private final ObjectMapper objectMapper;

    /**
     * 构造认证应用服务实现。
     *
     * @param imageCaptchaService 图形验证码服务
     * @param emailVerificationService 邮箱验证码服务
     * @param authFlowService 认证核心流程服务
     * @param authGrantStrategyFactory grant 策略工厂
     * @param userAccountMapper 用户账户读写组件
     * @param groupPermissionMapper 分组权限映射读写组件
     * @param objectMapper JSON 序列化组件
     */
    public AuthServiceImpl(ImageCaptchaService imageCaptchaService,
                           EmailVerificationService emailVerificationService,
                           AuthFlowService authFlowService,
                           AuthGrantStrategyFactory authGrantStrategyFactory,
                           UserAccountMapper userAccountMapper,
                           GroupPermissionMapper groupPermissionMapper,
                           ObjectMapper objectMapper) {
        this.imageCaptchaService = imageCaptchaService;
        this.emailVerificationService = emailVerificationService;
        this.authFlowService = authFlowService;
        this.authGrantStrategyFactory = authGrantStrategyFactory;
        this.userAccountMapper = userAccountMapper;
        this.groupPermissionMapper = groupPermissionMapper;
        this.objectMapper = objectMapper;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageCaptchaResponse createImageCaptcha() {
        return imageCaptchaService.createImageCaptcha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVerificationSendResponse sendEmailVerification(EmailVerificationSendRequest request) {
        // 关键逻辑：先消费图形验证码，再允许发送邮箱验证码，防止邮件接口被批量刷调用。
        imageCaptchaService.validateAndConsume(request.getCaptchaId(), request.getCaptchaAnswer());
        return emailVerificationService.sendCode(
            request.getEmail(),
            EmailVerificationPurpose.from(request.getPurpose())
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenResponse registerByEmail(EmailRegisterRequest request) {
        return toTokenResponse(authFlowService.registerByEmail(request));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAuthAuthorizeResponse createOAuthAuthorization(OAuthAuthorizeRequest request) {
        OAuthLoginScene scene = OAuthLoginScene.from(request.getScene());
        Long initiatorUserId = null;
        if (scene == OAuthLoginScene.BIND) {
            // BIND 场景必须有登录主体，避免匿名用户伪造绑定事务。
            StpUtil.checkLogin();
            initiatorUserId = StpUtil.getLoginIdAsLong();
        }
        return authFlowService.createOAuthAuthorization(
            request.getProvider(),
            request.getRedirectUri(),
            scene,
            initiatorUserId
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenResponse issueToken(AuthGrantRequest request) {
        AuthGrantType grantType = AuthGrantType.from(request.getGrantType());
        // 统一把 controller 请求折叠成命令对象，避免策略层依赖 Web DTO。
        AuthGrantCommand command = new AuthGrantCommand();
        command.setGrantType(grantType);
        command.setEmail(request.getEmail());
        command.setPassword(request.getPassword());
        command.setProvider(request.getProvider());
        command.setOauthLoginId(request.getOauthLoginId());
        command.setCode(request.getCode());
        command.setState(request.getState());
        command.setRefreshToken(request.getRefreshToken());
        AuthGrantResult result = authGrantStrategyFactory.get(grantType).grant(command);
        return toTokenResponse(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokenResponse confirmConflictBinding(OAuthConflictConfirmRequest request) {
        return toTokenResponse(authFlowService.confirmConflictBinding(request));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void logout(AuthLogoutRequest request) {
        boolean hasLogin = StpUtil.isLogin();
        String refreshToken = request == null ? null : request.getRefreshToken();
        boolean logoutAll = request != null && Boolean.TRUE.equals(request.getLogoutAll());

        if (!hasLogin && !StringUtils.hasText(refreshToken)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        if (logoutAll) {
            // logout_all=true：按用户维度失效所有 refresh 会话，再退出当前 access 会话。
            StpUtil.checkLogin();
            Long userId = StpUtil.getLoginIdAsLong();
            authFlowService.revokeAllRefreshTokens(userId);
            StpUtil.logout();
            return;
        }

        if (StringUtils.hasText(refreshToken)) {
            // 指定 refresh_token 时，仅失效该 refresh 会话。
            authFlowService.revokeRefreshToken(refreshToken);
        }
        if (hasLogin) {
            StpUtil.logout();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthIntrospectResponse introspect() {
        StpUtil.checkLogin();
        Long userId = StpUtil.getLoginIdAsLong();
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Account not found");
        }
        Set<String> groups = normalizeGroupCodes(parseStringSet(account.getGroupsJson()));
        Set<String> userPermissions = parseStringSet(account.getPermissionsJson());
        Set<String> effectivePermissions = new LinkedHashSet<>(userPermissions);
        effectivePermissions.addAll(resolveGroupPermissions(groups));
        return new AuthIntrospectResponse(userId, groups, effectivePermissions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bindEmail(Long userId, EmailBindRequest request) {
        authFlowService.bindEmail(userId, request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bindOAuth(Long userId, OAuthBindRequest request) {
        authFlowService.bindOAuth(userId, request);
    }

    /**
     * 领域授权结果转对外 token DTO。
     *
     * @param result 授权结果
     * @return token 响应
     */
    private AuthTokenResponse toTokenResponse(AuthGrantResult result) {
        String resultType = result.getResultType() == null ? null : result.getResultType().name();
        return new AuthTokenResponse(
            resultType,
            result.getAccessToken(),
            result.getTokenType(),
            result.getExpiresInSec(),
            result.getRefreshToken(),
            result.getRefreshExpiresInSec(),
            result.getUserId(),
            result.getGroups(),
            result.getBindTicket()
        );
    }

    /**
     * 解析 JSON 字符串集合。
     *
     * @param json 原始 JSON（通常是 groups_json / permissions_json）
     * @return 字符串集合；异常或空值时返回空集合
     */
    private Set<String> parseStringSet(String json) {
        if (!StringUtils.hasText(json)) {
            return Set.of();
        }
        try {
            List<String> values = objectMapper.readValue(json, new TypeReference<List<String>>() {
            });
            if (values == null || values.isEmpty()) {
                return Set.of();
            }
            return values.stream()
                .map(value -> value == null ? null : value.trim())
                .filter(StringUtils::hasText)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        } catch (Exception ex) {
            // introspect 不应因脏数据直接 500，先降级为空集合。
            return Set.of();
        }
    }

    private Set<String> normalizeGroupCodes(Set<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        Set<String> normalized = groups.stream()
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .map(value -> value.toUpperCase())
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private Set<String> resolveGroupPermissions(Set<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        Set<String> resolved = groupPermissionMapper.selectList(
                new LambdaQueryWrapper<GroupPermissionEntity>().in(GroupPermissionEntity::getGroupCode, groups)
            ).stream()
            .map(GroupPermissionEntity::getPermissionCode)
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return resolved.isEmpty() ? Set.of() : resolved;
    }
}
