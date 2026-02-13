package io.github.shizuki.site.user.service;

import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.GroupPermissionsResponse;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.dto.UserGroupsResponse;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {

    /**
     * 获取当前登录用户信息。
     */
    MeResponse currentUser();

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
    List<QuotaPolicyDto> listQuotaPolicies();

    /**
     * 更新指定策略。
     */
    QuotaPolicyDto updateQuotaPolicy(String policyId, QuotaPolicyDto request);

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
}
