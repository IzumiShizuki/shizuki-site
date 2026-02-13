package io.github.shizuki.site.user.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.oauth.client.GitHubOAuthClient;
import io.github.shizuki.common.oauth.config.OAuthProperties;
import io.github.shizuki.common.oauth.model.GitHubTokenResponse;
import io.github.shizuki.common.oauth.model.GitHubUserResponse;
import io.github.shizuki.common.oauth.service.OAuthStateService;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.GroupPermissionsResponse;
import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.dto.UserGroupsResponse;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.entity.GroupPermissionEntity;
import io.github.shizuki.site.user.entity.GroupQuotaPolicyEntity;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import io.github.shizuki.site.user.entity.OAuthLoginEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.entity.UserPreferenceEntity;
import io.github.shizuki.site.user.mapper.GroupPermissionMapper;
import io.github.shizuki.site.user.mapper.GroupQuotaPolicyMapper;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.mapper.UserPreferenceMapper;
import io.github.shizuki.site.user.service.UserService;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    private static final String OAUTH_STATUS_PENDING = "PENDING";
    private static final String OAUTH_STATUS_SUCCESS = "SUCCESS";
    private static final String OAUTH_STATUS_FAILED = "FAILED";

    private final OAuthStateService oAuthStateService;
    private final GitHubOAuthClient gitHubOAuthClient;
    private final OAuthProperties oAuthProperties;
    private final UserAccountMapper userAccountMapper;
    private final UserPreferenceMapper userPreferenceMapper;
    private final OAuthLoginMapper oAuthLoginMapper;
    private final OAuthBindingMapper oAuthBindingMapper;
    private final GroupPermissionMapper groupPermissionMapper;
    private final GroupQuotaPolicyMapper groupQuotaPolicyMapper;
    private final ObjectMapper objectMapper;

    public UserServiceImpl(OAuthStateService oAuthStateService,
                        GitHubOAuthClient gitHubOAuthClient,
                        OAuthProperties oAuthProperties,
                        UserAccountMapper userAccountMapper,
                        UserPreferenceMapper userPreferenceMapper,
                        OAuthLoginMapper oAuthLoginMapper,
                        OAuthBindingMapper oAuthBindingMapper,
                        GroupPermissionMapper groupPermissionMapper,
                        GroupQuotaPolicyMapper groupQuotaPolicyMapper,
                        ObjectMapper objectMapper) {
        this.oAuthStateService = oAuthStateService;
        this.gitHubOAuthClient = gitHubOAuthClient;
        this.oAuthProperties = oAuthProperties;
        this.userAccountMapper = userAccountMapper;
        this.userPreferenceMapper = userPreferenceMapper;
        this.oAuthLoginMapper = oAuthLoginMapper;
        this.oAuthBindingMapper = oAuthBindingMapper;
        this.groupPermissionMapper = groupPermissionMapper;
        this.groupQuotaPolicyMapper = groupQuotaPolicyMapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public MeResponse currentUser() {
        // 从网关注入的上下文中读取当前用户，再回表补齐昵称等信息。
        return LoginUserContext.get()
            .map(loginUser -> {
                UserAccountEntity account = userAccountMapper.selectById(loginUser.getUserId());
                String nickname = account == null ? "user-" + loginUser.getUserId() : account.getNickname();
                return new MeResponse(
                    loginUser.getUserId(),
                    nickname,
                    loginUser.getGroups(),
                    loginUser.getPermissions()
                );
            })
            .orElse(new MeResponse(0L, "guest", Set.of("GUEST"), Set.of()));
    }

    @Override
    public void savePreference(Long userId, Map<String, Object> preferenceJson) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        // user_id 唯一，按“有则更新、无则插入”处理用户偏好。
        UserPreferenceEntity found = userPreferenceMapper.selectOne(
            new LambdaQueryWrapper<UserPreferenceEntity>().eq(UserPreferenceEntity::getUserId, userId)
        );

        String json = writeJson(preferenceJson);
        if (found == null) {
            UserPreferenceEntity entity = new UserPreferenceEntity();
            entity.setUserId(userId);
            entity.setPreferenceJson(json);
            userPreferenceMapper.insert(entity);
            return;
        }

        found.setPreferenceJson(json);
        userPreferenceMapper.updateById(found);
    }

    @Override
    public Map<String, Object> getPreference(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        UserPreferenceEntity found = userPreferenceMapper.selectOne(
            new LambdaQueryWrapper<UserPreferenceEntity>().eq(UserPreferenceEntity::getUserId, userId)
        );
        if (found == null || !StringUtils.hasText(found.getPreferenceJson())) {
            return Collections.emptyMap();
        }
        try {
            return objectMapper.readValue(found.getPreferenceJson(), new TypeReference<Map<String, Object>>() {
            });
        } catch (JsonProcessingException exception) {
            return Collections.emptyMap();
        }
    }

    @Override
    public OAuthLoginCreateResponse createOAuthLogin(OAuthLoginCreateRequest request) {
        if (!"github".equalsIgnoreCase(request.getProvider())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Only github provider is supported");
        }

        // 每次登录申请生成独立事务 ID + state，防止回调串号和重放。
        String loginId = UUID.randomUUID().toString();
        String state = oAuthStateService.createState(loginId);
        String authorizeUrl = gitHubAuthorizeUrl(state, request.getRedirectUri());

        OAuthLoginEntity oauthLogin = new OAuthLoginEntity();
        oauthLogin.setOauthLoginId(loginId);
        oauthLogin.setProvider("github");
        oauthLogin.setRedirectUri(request.getRedirectUri());
        oauthLogin.setState(state);
        oauthLogin.setStatus(OAUTH_STATUS_PENDING);
        oauthLogin.setCreatedAt(LocalDateTime.now());
        oauthLogin.setUpdatedAt(LocalDateTime.now());
        oAuthLoginMapper.insert(oauthLogin);

        return new OAuthLoginCreateResponse(loginId, authorizeUrl, state);
    }

    @Override
    public String exchangeOAuthToken(String oauthLoginId, String code, String state) {
        // state 通过后立即消费，避免同一 state 重放。
        if (!oAuthStateService.validateAndConsume(oauthLoginId, state)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid oauth state");
        }

        OAuthLoginEntity oauthLogin = oAuthLoginMapper.selectOne(
            new LambdaQueryWrapper<OAuthLoginEntity>()
                .eq(OAuthLoginEntity::getOauthLoginId, oauthLoginId)
        );
        if (oauthLogin == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "OAuth login not found");
        }

        try {
            // 标准 OAuth 闭环：code -> token -> 第三方用户信息 -> 本地账号绑定。
            GitHubTokenResponse tokenResponse = gitHubOAuthClient.exchangeCode(code, oauthLogin.getRedirectUri());
            if (tokenResponse == null || !StringUtils.hasText(tokenResponse.getAccessToken())) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth token exchange failed");
            }

            GitHubUserResponse userResponse = gitHubOAuthClient.fetchUser(tokenResponse.getAccessToken());
            if (userResponse == null || userResponse.getId() == null) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth user info fetch failed");
            }

            Long userId = bindOrCreateUser(userResponse);
            StpUtil.login(userId);

            oauthLogin.setStatus(OAUTH_STATUS_SUCCESS);
            oauthLogin.setProviderUserId(String.valueOf(userResponse.getId()));
            oauthLogin.setUserId(userId);
            oauthLogin.setUpdatedAt(LocalDateTime.now());
            oAuthLoginMapper.updateById(oauthLogin);

            return StpUtil.getTokenValue();
        } catch (Exception ex) {
            // 无论业务异常还是系统异常，都把失败原因落到 oauth_login 便于审计追踪。
            oauthLogin.setStatus(OAUTH_STATUS_FAILED);
            oauthLogin.setErrorMessage(ex.getMessage());
            oauthLogin.setUpdatedAt(LocalDateTime.now());
            oAuthLoginMapper.updateById(oauthLogin);
            if (ex instanceof BusinessException businessException) {
                throw businessException;
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth exchange failed");
        }
    }

    @Override
    public List<QuotaPolicyDto> listQuotaPolicies() {
        return groupQuotaPolicyMapper.selectList(new LambdaQueryWrapper<GroupQuotaPolicyEntity>().orderByAsc(GroupQuotaPolicyEntity::getPolicyId))
            .stream()
            .map(this::toQuotaPolicyDto)
            .toList();
    }

    @Override
    public QuotaPolicyDto updateQuotaPolicy(String policyId, QuotaPolicyDto request) {
        GroupQuotaPolicyEntity entity = groupQuotaPolicyMapper.selectOne(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>().eq(GroupQuotaPolicyEntity::getPolicyId, policyId)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Policy not found");
        }

        entity.setPolicyId(policyId);
        entity.setGroupCode(request.getGroupCode());
        entity.setQuotaCode(request.getQuotaCode());
        entity.setQuotaValue(request.getValue());
        entity.setUpdatedAt(LocalDateTime.now());
        groupQuotaPolicyMapper.updateById(entity);
        return toQuotaPolicyDto(entity);
    }

    @Override
    public UserGroupsResponse getUserGroups(Long userId) {
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "User not found");
        }
        return new UserGroupsResponse(userId, normalizeGroupCodes(parseStringSet(account.getGroupsJson())));
    }

    @Override
    public UserGroupsResponse replaceUserGroups(Long userId, Set<String> groups) {
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "User not found");
        }

        Set<String> normalizedGroups = normalizeGroupCodes(groups);
        account.setGroupsJson(writeJson(normalizedGroups));
        account.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.updateById(account);
        return new UserGroupsResponse(userId, normalizedGroups);
    }

    @Override
    public GroupPermissionsResponse getGroupPermissions(String groupCode) {
        String normalizedGroup = normalizeGroupCode(groupCode);
        Set<String> permissions = groupPermissionMapper.selectList(
                new LambdaQueryWrapper<GroupPermissionEntity>()
                    .eq(GroupPermissionEntity::getGroupCode, normalizedGroup)
                    .orderByAsc(GroupPermissionEntity::getPermissionCode)
            ).stream()
            .map(GroupPermissionEntity::getPermissionCode)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return new GroupPermissionsResponse(normalizedGroup, permissions);
    }

    @Override
    public GroupPermissionsResponse replaceGroupPermissions(String groupCode, Set<String> permissions) {
        String normalizedGroup = normalizeGroupCode(groupCode);
        Set<String> normalizedPermissions = normalizePermissionCodes(permissions);

        List<GroupPermissionEntity> existing = groupPermissionMapper.selectList(
            new LambdaQueryWrapper<GroupPermissionEntity>().eq(GroupPermissionEntity::getGroupCode, normalizedGroup)
        );
        existing.forEach(entity -> groupPermissionMapper.deleteById(entity.getId()));

        LocalDateTime now = LocalDateTime.now();
        for (String permission : normalizedPermissions) {
            GroupPermissionEntity entity = new GroupPermissionEntity();
            entity.setGroupCode(normalizedGroup);
            entity.setPermissionCode(permission);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            groupPermissionMapper.insert(entity);
        }
        return new GroupPermissionsResponse(normalizedGroup, normalizedPermissions);
    }

    @Override
    public List<GroupPermissionsResponse> listGroupPermissions() {
        List<GroupPermissionEntity> mappings = groupPermissionMapper.selectList(
            new LambdaQueryWrapper<GroupPermissionEntity>()
                .orderByAsc(GroupPermissionEntity::getGroupCode)
                .orderByAsc(GroupPermissionEntity::getPermissionCode)
        );
        Map<String, Set<String>> grouped = new LinkedHashMap<>();
        for (GroupPermissionEntity mapping : mappings) {
            grouped.computeIfAbsent(mapping.getGroupCode(), key -> new LinkedHashSet<>())
                .add(mapping.getPermissionCode());
        }
        return grouped.entrySet().stream()
            .map(entry -> new GroupPermissionsResponse(entry.getKey(), entry.getValue()))
            .toList();
    }

    @Override
    public AuthLoginResponse login(String username, String password) {
        UserAccountEntity account = userAccountMapper.selectOne(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getUsername, username)
        );
        if (account == null || !matchesPassword(password, account)) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Invalid username or password");
        }

        StpUtil.login(account.getId());
        return new AuthLoginResponse(StpUtil.getTokenValue(), "Bearer", account.getId());
    }

    @Override
    public void logout() {
        StpUtil.checkLogin();
        StpUtil.logout();
    }

    @Override
    public AuthIntrospectResponse introspect() {
        StpUtil.checkLogin();
        Long userId = StpUtil.getLoginIdAsLong();
        UserAccountEntity account = userAccountMapper.selectById(userId);
        if (account == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Account not found");
        }

        Set<String> groups = normalizeGroupCodes(parseStringSet(account.getGroupsJson()));
        Set<String> userPermissions = normalizePermissionCodes(parseStringSet(account.getPermissionsJson()));
        Set<String> effectivePermissions = new LinkedHashSet<>(userPermissions);
        effectivePermissions.addAll(resolveGroupPermissions(groups));

        return new AuthIntrospectResponse(
            userId,
            groups,
            effectivePermissions
        );
    }

    @Override
    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        long fallback = defaultValue == null ? 5L : defaultValue;
        Set<String> normalizedGroups = normalizeGroupCodes(groupCodes);
        if (normalizedGroups.isEmpty()) {
            return fallback;
        }

        List<GroupQuotaPolicyEntity> policies = groupQuotaPolicyMapper.selectList(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>()
                .eq(GroupQuotaPolicyEntity::getQuotaCode, quotaCode)
                .in(GroupQuotaPolicyEntity::getGroupCode, normalizedGroups)
        );
        if (policies == null || policies.isEmpty()) {
            return fallback;
        }

        return policies.stream().map(GroupQuotaPolicyEntity::getQuotaValue).max(Long::compareTo).orElse(fallback);
    }

    private Long bindOrCreateUser(GitHubUserResponse userResponse) {
        // provider + provider_user_id 唯一，已绑定时直接复用本地账号。
        OAuthBindingEntity binding = oAuthBindingMapper.selectOne(
            new LambdaQueryWrapper<OAuthBindingEntity>()
                .eq(OAuthBindingEntity::getProvider, "github")
                .eq(OAuthBindingEntity::getProviderUserId, String.valueOf(userResponse.getId()))
        );
        if (binding != null) {
            return binding.getUserId();
        }

        UserAccountEntity account = new UserAccountEntity();
        String githubLogin = StringUtils.hasText(userResponse.getLogin()) ? userResponse.getLogin() : "github-" + userResponse.getId();
        account.setUsername("gh_" + githubLogin);
        account.setPassword(null);
        account.setNickname(githubLogin);
        account.setEmail(userResponse.getEmail());
        account.setGroupsJson(writeJson(List.of("USER")));
        account.setPermissionsJson(writeJson(List.of()));
        userAccountMapper.insert(account);

        OAuthBindingEntity newBinding = new OAuthBindingEntity();
        newBinding.setUserId(account.getId());
        newBinding.setProvider("github");
        newBinding.setProviderUserId(String.valueOf(userResponse.getId()));
        newBinding.setProviderLogin(userResponse.getLogin());
        newBinding.setProviderEmail(userResponse.getEmail());
        oAuthBindingMapper.insert(newBinding);

        return account.getId();
    }

    private QuotaPolicyDto toQuotaPolicyDto(GroupQuotaPolicyEntity entity) {
        QuotaPolicyDto dto = new QuotaPolicyDto();
        dto.setPolicyId(entity.getPolicyId());
        dto.setGroupCode(entity.getGroupCode());
        dto.setQuotaCode(entity.getQuotaCode());
        dto.setValue(entity.getQuotaValue());
        return dto;
    }

    /**
     * 兼容历史明文数据：首次登录成功后自动升级为 BCrypt 哈希，避免长期明文留存。
     */
    private boolean matchesPassword(String rawPassword, UserAccountEntity account) {
        String stored = account.getPassword();
        if (!StringUtils.hasText(stored)) {
            return false;
        }

        if (isBcryptHash(stored)) {
            return BCrypt.checkpw(rawPassword, stored);
        }

        if (!stored.equals(rawPassword)) {
            return false;
        }

        account.setPassword(BCrypt.hashpw(rawPassword, BCrypt.gensalt(10)));
        account.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.updateById(account);
        return true;
    }

    private boolean isBcryptHash(String value) {
        return value.startsWith("$2a$") || value.startsWith("$2b$") || value.startsWith("$2y$");
    }

    private Set<String> parseStringSet(String json) {
        if (!StringUtils.hasText(json)) {
            return Set.of();
        }
        try {
            List<String> values = objectMapper.readValue(json, new TypeReference<List<String>>() {
            });
            if (values == null || values.isEmpty()) {
                return Set.of();
            }
            return values.stream()
                .map(value -> value == null ? null : value.trim())
                .filter(StringUtils::hasText)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        } catch (Exception ex) {
            // 容错处理：历史脏数据不应阻断登录态解析流程。
            return Set.of();
        }
    }

    private Set<String> resolveGroupPermissions(Set<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        return groupPermissionMapper.selectList(
                new LambdaQueryWrapper<GroupPermissionEntity>().in(GroupPermissionEntity::getGroupCode, groups)
            ).stream()
            .map(GroupPermissionEntity::getPermissionCode)
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private Set<String> normalizeGroupCodes(Collection<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        LinkedHashSet<String> normalized = groups.stream()
            .map(this::normalizeGroupCodeNullable)
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private String normalizeGroupCode(String groupCode) {
        String normalized = normalizeGroupCodeNullable(groupCode);
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Group code is required");
        }
        return normalized;
    }

    private String normalizeGroupCodeNullable(String groupCode) {
        if (!StringUtils.hasText(groupCode)) {
            return null;
        }
        return groupCode.trim().toUpperCase();
    }

    private Set<String> normalizePermissionCodes(Collection<String> permissions) {
        if (permissions == null || permissions.isEmpty()) {
            return Set.of();
        }
        LinkedHashSet<String> normalized = permissions.stream()
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private String writeJson(Object value) {
        try {
            return objectMapper.writeValueAsString(value == null ? Collections.emptyMap() : value);
        } catch (JsonProcessingException e) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "JSON serialization failed");
        }
    }

    private String gitHubAuthorizeUrl(String state, String redirectUri) {
        return oAuthProperties.getAuthorizeUrl() + "?client_id=" + oAuthProperties.getClientId() + "&state=" + state
            + "&redirect_uri=" + URLEncoder.encode(redirectUri, StandardCharsets.UTF_8);
    }
}
