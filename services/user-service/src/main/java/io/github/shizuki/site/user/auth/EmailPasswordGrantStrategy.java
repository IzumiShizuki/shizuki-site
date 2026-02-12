package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

/**
 * 邮箱密码授权策略。
 */
@Component
public class EmailPasswordGrantStrategy implements AuthGrantStrategy {

    /**
     * 认证流程服务，封装邮箱密码登录业务。
     */
    private final AuthFlowService authFlowService;

    /**
     * 构造邮箱密码授权策略。
     *
     * @param authFlowService 认证流程服务
     */
    public EmailPasswordGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    /**
     * 仅处理 {@link AuthGrantType#EMAIL_PASSWORD}。
     */
    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.EMAIL_PASSWORD;
    }

    /**
     * 执行邮箱密码授权。
     *
     * @param command 授权命令
     * @return 授权结果
     */
    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByEmailPassword(command);
    }
}
