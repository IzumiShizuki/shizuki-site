package io.github.shizuki.site.user.auth;

/**
 * 统一授权策略接口。
 *
 * <p>不同 grant_type 实现各自授权逻辑，由工厂在运行时按类型分发。
 */
public interface AuthGrantStrategy {

    /**
     * 判断当前策略是否支持指定授权类型。
     *
     * @param type 授权类型
     * @return true 表示支持并可处理
     */
    boolean supports(AuthGrantType type);

    /**
     * 执行授权并产出统一结果。
     *
     * @param command 授权命令，包含当前 grant 所需参数
     * @return 授权结果（发 token 或要求绑定确认）
     */
    AuthGrantResult grant(AuthGrantCommand command);
}
