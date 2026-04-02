package io.github.shizuki.site.user.service;

import io.github.shizuki.site.user.response.MeResponse;
import io.github.shizuki.site.user.response.MeAccountResponse;
import io.github.shizuki.site.user.response.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.request.AdminGroupCreateRequest;
import io.github.shizuki.site.user.response.AdminGroupItemResponse;
import io.github.shizuki.site.user.response.AdminGroupPageResponse;
import io.github.shizuki.site.user.request.AdminGroupUpdateRequest;
import io.github.shizuki.site.user.response.AdminOptionsResponse;
import io.github.shizuki.site.user.response.AdminUserPageResponse;
import io.github.shizuki.site.user.response.GroupPermissionsResponse;
import io.github.shizuki.site.user.request.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.response.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.request.ProfileUpdateRequest;
import io.github.shizuki.site.user.request.QuotaPolicyRequest;
import io.github.shizuki.site.user.response.QuotaPolicyResponse;
import io.github.shizuki.site.user.response.UserGroupsResponse;
import io.github.shizuki.site.user.response.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.response.auth.AuthLoginResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {

    /**
     * 获取当前登录用户信息。
     */
    MeResponse currentUser();

    /**
     * 获取当前登录用户账号详情。
     */
    MeAccountResponse getAccountProfile(Long userId);

    /**
     * 更新当前登录用户昵称与头像。
     */
    MeAccountResponse updateProfile(Long userId, ProfileUpdateRequest request);

    /**
     * 保存当前用户偏好配置。
     */
    void savePreference(Long userId, Map<String, Object> preferenceJson);

    /**
     * 查询当前用户偏好配置。
     */
    Map<String, Object> getPreference(Long userId);

    /**
     * 发起 OAuth 登录，返回授权地址与 state。
     */
    OAuthLoginCreateResponse createOAuthLogin(OAuthLoginCreateRequest request);

    /**
     * 完成 OAuth 回调换取本地登录 token。
     */
    String exchangeOAuthToken(String oauthLoginId, String code, String state);

    /**
     * 查询所有分组配额策略。
     */
    List<QuotaPolicyResponse> listQuotaPolicies();

    /**
     * 更新指定策略。
     */
    QuotaPolicyResponse updateQuotaPolicy(String policyId, QuotaPolicyRequest request);

    /**
     * 批量创建/更新分组配额策略。
     */
    List<QuotaPolicyResponse> batchUpsertQuotaPolicies(List<QuotaPolicyRequest> requests);

    /**
     * 查询指定用户分组。
     */
    UserGroupsResponse getUserGroups(Long userId);

    /**
     * 全量覆盖指定用户分组。
     */
    UserGroupsResponse replaceUserGroups(Long userId, Set<String> groups);

    /**
     * 查询指定分组权限。
     */
    GroupPermissionsResponse getGroupPermissions(String groupCode);

    /**
     * 全量覆盖指定分组权限。
     */
    GroupPermissionsResponse replaceGroupPermissions(String groupCode, Set<String> permissions);

    /**
     * 查询全部分组权限映射。
     */
    List<GroupPermissionsResponse> listGroupPermissions();

    /**
     * 管理员查询用户列表（分页 + 关键字）。
     */
    AdminUserPageResponse listAdminUsers(Integer page, Integer pageSize, String keyword);

    /**
     * 管理员查询分组目录（分页 + 关键字 + 状态）。
     */
    AdminGroupPageResponse listAdminGroups(Integer page, Integer pageSize, String keyword, String status);

    /**
     * 管理员创建分组目录项。
     */
    AdminGroupItemResponse createAdminGroup(AdminGroupCreateRequest request);

    /**
     * 管理员更新分组目录项（仅名称/描述/状态）。
     */
    AdminGroupItemResponse updateAdminGroup(String groupCode, AdminGroupUpdateRequest request);

    /**
     * 管理员删除分组目录项并级联清理关联配置。
     */
    void deleteAdminGroup(String groupCode);

    /**
     * 管理员获取后台配置选项目录。
     */
    AdminOptionsResponse getAdminOptions();

    /**
     * 用户名密码登录。
     */
    AuthLoginResponse login(String username, String password);

    /**
     * 退出当前登录态。
     */
    void logout();

    /**
     * 解析 token 对应用户上下文。
     */
    AuthIntrospectResponse introspect();

    /**
     * 根据分组解析生效配额。
     */
    Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue);

    /**
     * 绑定或更新用户音乐 provider API Key。
     */
    MusicApiKeyStatusResponse upsertMusicApiKey(Long userId, String provider, String apiKey);

    /**
     * 删除用户音乐 provider API Key。
     */
    void deleteMusicApiKey(Long userId, String provider);

    /**
     * 查询用户音乐 provider API Key 状态（不返回明文）。
     */
    MusicApiKeyStatusResponse getMusicApiKeyStatus(Long userId, String provider);

    /**
     * 内部调用：读取用户音乐 provider API Key 明文。
     */
    String getMusicApiKeyPlaintext(Long userId, String provider);

    /**
     * 查询当前用户音乐源账号绑定状态列表（cookie 模式）。
     */
    List<MusicSourceAccountStatusResponse> listMusicSourceAccountStatus(Long userId);

    /**
     * 绑定或更新当前用户音乐源账号 Cookie。
     */
    MusicSourceAccountStatusResponse upsertMusicSourceAccountCookie(Long userId, String provider, String cookie);

    /**
     * 删除当前用户音乐源账号 Cookie。
     */
    void deleteMusicSourceAccount(Long userId, String provider);

    /**
     * 查询当前用户音乐源账号 Cookie 状态。
     */
    MusicSourceAccountStatusResponse getMusicSourceAccountCookieStatus(Long userId, String provider);

    /**
     * 内部调用：读取当前用户音乐源账号 Cookie 明文。
     */
    String getMusicSourceAccountCookiePlaintext(Long userId, String provider);
}
