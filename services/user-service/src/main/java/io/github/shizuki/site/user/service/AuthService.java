package io.github.shizuki.site.user.service;

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

public interface AuthService {

    ImageCaptchaResponse createImageCaptcha();

    EmailVerificationSendResponse sendEmailVerification(EmailVerificationSendRequest request);

    AuthTokenResponse registerByEmail(EmailRegisterRequest request);

    OAuthAuthorizeResponse createOAuthAuthorization(OAuthAuthorizeRequest request);

    AuthTokenResponse issueToken(AuthGrantRequest request);

    void logout(AuthLogoutRequest request);

    AuthIntrospectResponse introspect();

    void bindEmail(Long userId, EmailBindRequest request);

    void bindOAuth(Long userId, OAuthBindRequest request);
}

