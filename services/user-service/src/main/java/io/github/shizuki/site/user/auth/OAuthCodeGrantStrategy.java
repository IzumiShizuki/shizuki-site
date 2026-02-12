package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

/**
 * OAuth 授权码策略。
 */
@Component
public class OAuthCodeGrantStrategy implements AuthGrantStrategy {

    /**
     * 认证流程服务，封装 OAuth 登录/绑定流转。
     */
    private final AuthFlowService authFlowService;

    /**
     * 构造 OAuth 授权码策略。
     *
     * @param authFlowService 认证流程服务
     */
    public OAuthCodeGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    /**
     * 仅处理 {@link AuthGrantType#OAUTH_CODE}。
     */
    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.OAUTH_CODE;
    }

    /**
     * 执行 OAuth 授权码换 token 流程。
     *
     * @param command 授权命令
     * @return 授权结果
     */
    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByOAuthCode(command);
    }
}
