package io.github.shizuki.site.user.auth;

import io.github.shizuki.site.user.service.auth.AuthFlowService;
import org.springframework.stereotype.Component;

/**
 * refresh token 授权策略。
 */
@Component
public class RefreshTokenGrantStrategy implements AuthGrantStrategy {

    /**
     * 认证流程服务，封装 refresh token 轮换逻辑。
     */
    private final AuthFlowService authFlowService;

    /**
     * 构造 refresh token 授权策略。
     *
     * @param authFlowService 认证流程服务
     */
    public RefreshTokenGrantStrategy(AuthFlowService authFlowService) {
        this.authFlowService = authFlowService;
    }

    /**
     * 仅处理 {@link AuthGrantType#REFRESH_TOKEN}。
     */
    @Override
    public boolean supports(AuthGrantType type) {
        return type == AuthGrantType.REFRESH_TOKEN;
    }

    /**
     * 执行 refresh token 授权。
     *
     * @param command 授权命令
     * @return 授权结果
     */
    @Override
    public AuthGrantResult grant(AuthGrantCommand command) {
        return authFlowService.grantByRefreshToken(command);
    }
}
