package io.github.shizuki.common.oauth.model;

/**
 * OAuth 标准化身份模型。
 *
 * @param provider provider 编码
 * @param providerUserId provider 侧用户 ID
 * @param login provider 侧登录名
 * @param email provider 返回邮箱
 * @param nickname 昵称
 * @param avatarUrl 头像 URL
 */
public record OAuthIdentity(String provider,
                            String providerUserId,
                            String login,
                            String email,
                            String nickname,
                            String avatarUrl) {
}
