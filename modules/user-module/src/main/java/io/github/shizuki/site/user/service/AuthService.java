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
import io.github.shizuki.site.user.dto.auth.OAuthConflictConfirmRequest;

/**
 * 认证应用服务接口。
 *
 * <p>对外统一暴露认证域能力：验证码、注册、登录、绑定、登出与 introspect。
 */
public interface AuthService {

    /**
     * 生成图形验证码。
     *
     * @return 验证码 ID、SVG 内容与过期时间
     */
    ImageCaptchaResponse createImageCaptcha();

    /**
     * 发送邮箱验证码（发送前要求图形验证码通过）。
     *
     * @param request 发送请求
     * @return 发送状态与冷却时间
     */
    EmailVerificationSendResponse sendEmailVerification(EmailVerificationSendRequest request);

    /**
     * 邮箱注册并直接签发 token。
     *
     * @param request 邮箱注册请求
     * @return token 响应
     */
    AuthTokenResponse registerByEmail(EmailRegisterRequest request);

    /**
     * 创建 OAuth 授权事务。
     *
     * @param request OAuth 授权请求
     * @return 授权事务 ID、state 与跳转 URL
     */
    OAuthAuthorizeResponse createOAuthAuthorization(OAuthAuthorizeRequest request);

    /**
     * 按 grant_type 发放 token。
     *
     * @param request 统一授权请求
     * @return token 响应或绑定确认信号
     */
    AuthTokenResponse issueToken(AuthGrantRequest request);

    /**
     * 显式确认 OAuth 冲突绑定。
     *
     * @param request 冲突确认请求
     * @return 确认后签发的 token
     */
    AuthTokenResponse confirmConflictBinding(OAuthConflictConfirmRequest request);

    /**
     * 退出登录并按需失效 refresh token。
     *
     * @param request 登出请求
     */
    void logout(AuthLogoutRequest request);

    /**
     * 解析当前 access token 对应身份。
     *
     * @return userId/groups/permissions
     */
    AuthIntrospectResponse introspect();

    /**
     * 给当前登录用户绑定邮箱凭据。
     *
     * @param userId 当前登录用户 ID
     * @param request 邮箱绑定请求
     */
    void bindEmail(Long userId, EmailBindRequest request);

    /**
     * 给当前登录用户绑定 OAuth 凭据。
     *
     * @param userId 当前登录用户 ID
     * @param request OAuth 绑定请求
     */
    void bindOAuth(Long userId, OAuthBindRequest request);
}
