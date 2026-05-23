package io.github.shizuki.common.integration.user;

import io.github.shizuki.site.user.response.MeAccountResponse;
import io.github.shizuki.site.user.response.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountStatusResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户域跨模块访问端口（boundary port）。
 *
 * <p>本接口位于 {@code libs/common-integration}，作为 ai-module / media-module 等
 * 业务模块访问 user-module 的稳定契约面。模块仅依赖此接口而不直接依赖
 * {@code modules/user-module} 的 {@code UserService}，从而消除 modules → modules
 * 的 compile 时强耦合（评审 finding {@code 2380d72adfeb} / {@code 7315fcf997e4}）。
 *
 * <p>方法集合是 ai/media 当前**实际**调用的子集，不是 UserService 的全部方法。
 * 当未来需要更多用户域能力时，应**显式扩充**本接口而不是绕过它。
 *
 * <p>实现类位于 {@code modules/user-module}，作为 UserService 之上的薄适配器
 * （或由 UserService 实现类直接 {@code implements} 本接口）。
 */
public interface UserServicePort {

    /** 根据用户分组解析配额值；解析失败由调用方提供 fallback。 */
    Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue);

    /** 查询用户账号详情（含 OAuth 绑定列表）。 */
    MeAccountResponse getAccountProfile(Long userId);

    /** 查询用户偏好配置（JSON map）。 */
    Map<String, Object> getPreference(Long userId);

    /** 查询用户音乐 provider API Key 绑定状态（不含明文）。 */
    MusicApiKeyStatusResponse getMusicApiKeyStatus(Long userId, String provider);

    /** 内部调用：读取用户音乐 provider API Key 明文。 */
    String getMusicApiKeyPlaintext(Long userId, String provider);

    /** 列出用户全部音乐源账号 Cookie 绑定状态。 */
    List<MusicSourceAccountStatusResponse> listMusicSourceAccountStatus(Long userId);

    /** 查询单个音乐源账号 Cookie 绑定状态。 */
    MusicSourceAccountStatusResponse getMusicSourceAccountCookieStatus(Long userId, String provider);

    /** 内部调用：读取音乐源账号 Cookie 明文。 */
    String getMusicSourceAccountCookiePlaintext(Long userId, String provider);
}
