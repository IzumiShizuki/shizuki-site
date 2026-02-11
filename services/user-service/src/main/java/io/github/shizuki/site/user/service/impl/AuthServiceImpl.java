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
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.service.AuthService;
import io.github.shizuki.site.user.service.auth.AuthFlowService;
import io.github.shizuki.site.user.service.auth.EmailVerificationService;
import io.github.shizuki.site.user.service.auth.ImageCaptchaService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AuthServiceImpl implements AuthService {

    private final ImageCaptchaService imageCaptchaService;
    private final EmailVerificationService emailVerificationService;
    private final AuthFlowService authFlowService;
    private final AuthGrantStrategyFactory authGrantStrategyFactory;
    private final UserAccountMapper userAccountMapper;
    private final ObjectMapper objectMapper;

    public AuthServiceImpl(ImageCaptchaService imageCaptchaService,
                           EmailVerificationService emailVerificationService,
                           AuthFlowService authFlowService,
                           AuthGrantStrategyFactory authGrantStrategyFactory,
                           UserAccountMapper userAccountMapper,
                           ObjectMapper objectMapper) {
        this.imageCaptchaService = imageCaptchaService;
        this.emailVerificationService = emailVerificationService;
        this.authFlowService = authFlowService;
        this.authGrantStrategyFactory = authGrantStrategyFactory;
        this.userAccountMapper = userAccountMapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public ImageCaptchaResponse createImageCaptcha() {
        return imageCaptchaService.createImageCaptcha();
    }

    @Override
    public EmailVerificationSendResponse sendEmailVerification(EmailVerificationSendRequest request) {
        imageCaptchaService.validateAndConsume(request.getCaptchaId(), request.getCaptchaAnswer());
        return emailVerificationService.sendCode(
            request.getEmail(),
            EmailVerificationPurpose.from(request.getPurpose())
        );
    }

    @Override
    public AuthTokenResponse registerByEmail(EmailRegisterRequest request) {
        return toTokenResponse(authFlowService.registerByEmail(request));
    }

    @Override
    public OAuthAuthorizeResponse createOAuthAuthorization(OAuthAuthorizeRequest request) {
        OAuthLoginScene scene = OAuthLoginScene.from(request.getScene());
        Long initiatorUserId = null;
        if (scene == OAuthLoginScene.BIND) {
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

    @Override
    public AuthTokenResponse issueToken(AuthGrantRequest request) {
        AuthGrantType grantType = AuthGrantType.from(request.getGrantType());
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

    @Override
    public void logout(AuthLogoutRequest request) {
        boolean hasLogin = StpUtil.isLogin();
        String refreshToken = request == null ? null : request.getRefreshToken();
        boolean logoutAll = request != null && Boolean.TRUE.equals(request.getLogoutAll());

        if (!hasLogin && !StringUtils.hasText(refreshToken)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        if (logoutAll) {
            StpUtil.checkLogin();
            Long userId = StpUtil.getLoginIdAsLong();
            authFlowService.revokeAllRefreshTokens(userId);
            StpUtil.logout();
            return;
        }

        if (StringUtils.hasText(refreshToken)) {
            authFlowService.revokeRefreshToken(refreshToken);
        }
        if (hasLogin) {
            StpUtil.logout();
        }
    }

    @Override
    public AuthIntrospectResponse introspect() {
        StpUtil.checkLogin();
        Long userId = StpUtil.getLoginIdAsLong();
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Account not found");
        }
        return new AuthIntrospectResponse(userId, parseStringSet(account.getGroupsJson()), parseStringSet(account.getPermissionsJson()));
    }

    @Override
    public void bindEmail(Long userId, EmailBindRequest request) {
        authFlowService.bindEmail(userId, request);
    }

    @Override
    public void bindOAuth(Long userId, OAuthBindRequest request) {
        authFlowService.bindOAuth(userId, request);
    }

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
            return new LinkedHashSet<>(values);
        } catch (Exception ex) {
            return Set.of();
        }
    }
}

