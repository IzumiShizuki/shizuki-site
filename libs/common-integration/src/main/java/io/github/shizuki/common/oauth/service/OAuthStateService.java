package io.github.shizuki.common.oauth.service;

/**
 * OAuth state 管理服务接口。
 *
 * <p>用于生成并一次性消费 state，防止 OAuth 回调 CSRF 与重放。
 */
public interface OAuthStateService {

    /**
     * 创建 state 并关联 scopeKey。
     *
     * @param scopeKey 作用域键（通常是 oauth_login_id）
     * @return state
     */
    String createState(String scopeKey);

    /**
     * 校验并消费 state。
     *
     * @param scopeKey 作用域键
     * @param state state 值
     * @return true 表示校验通过且已消费
     */
    boolean validateAndConsume(String scopeKey, String state);
}
