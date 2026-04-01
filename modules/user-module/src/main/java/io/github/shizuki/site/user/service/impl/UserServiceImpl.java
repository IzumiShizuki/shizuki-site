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
import io.github.shizuki.site.user.request.AdminGroupCreateRequest;
import io.github.shizuki.site.user.dto.AdminGroupItemResponse;
import io.github.shizuki.site.user.dto.AdminGroupOptionResponse;
import io.github.shizuki.site.user.dto.AdminGroupPageResponse;
import io.github.shizuki.site.user.request.AdminGroupUpdateRequest;
import io.github.shizuki.site.user.dto.AdminOptionsResponse;
import io.github.shizuki.site.user.dto.AdminUserItemResponse;
import io.github.shizuki.site.user.dto.AdminUserPageResponse;
import io.github.shizuki.site.user.dto.GroupPermissionsResponse;
import io.github.shizuki.site.user.dto.MeAccountResponse;
import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.dto.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.dto.OAuthBindingResponse;
import io.github.shizuki.site.user.request.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.request.ProfileUpdateRequest;
import io.github.shizuki.site.user.request.QuotaPolicyRequest;
import io.github.shizuki.site.user.dto.QuotaPolicyResponse;
import io.github.shizuki.site.user.dto.UserGroupsResponse;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.entity.GroupCatalogEntity;
import io.github.shizuki.site.user.entity.GroupPermissionEntity;
import io.github.shizuki.site.user.entity.GroupQuotaPolicyEntity;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import io.github.shizuki.site.user.entity.OAuthLoginEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.entity.UserPreferenceEntity;
import io.github.shizuki.site.user.entity.UserProviderSecretEntity;
import io.github.shizuki.site.user.mapper.GroupCatalogMapper;
import io.github.shizuki.site.user.mapper.GroupPermissionMapper;
import io.github.shizuki.site.user.mapper.GroupQuotaPolicyMapper;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.mapper.UserPreferenceMapper;
import io.github.shizuki.site.user.mapper.UserProviderSecretMapper;
import io.github.shizuki.site.user.service.UserService;
import io.github.shizuki.site.user.service.security.MusicApiKeyCryptoService;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    private static final String OAUTH_STATUS_PENDING = "PENDING";
    private static final String OAUTH_STATUS_SUCCESS = "SUCCESS";
    private static final String OAUTH_STATUS_FAILED = "FAILED";
    private static final String GROUP_STATUS_ACTIVE = "ACTIVE";
    private static final String GROUP_STATUS_DISABLED = "DISABLED";
    private static final int DEFAULT_GROUP_PAGE_SIZE = 20;
    private static final Set<String> SUPPORTED_MUSIC_PROVIDERS = Set.of("tunehub", "spotify", "asmr");
    private static final Set<String> SUPPORTED_MUSIC_SOURCE_PROVIDERS = Set.of("netease", "qqmusic", "kugou", "tunehub", "spotify");
    private static final List<String> DEFAULT_SOURCE_PROVIDER_ORDER = List.of("netease", "qqmusic", "kugou", "tunehub", "spotify");
    private static final String SOURCE_ACCOUNT_PROVIDER_PREFIX = "music_cookie_";

    private final OAuthStateService oAuthStateService;
    private final GitHubOAuthClient gitHubOAuthClient;
    private final OAuthProperties oAuthProperties;
    private final UserAccountMapper userAccountMapper;
    private final UserPreferenceMapper userPreferenceMapper;
    private final OAuthLoginMapper oAuthLoginMapper;
    private final OAuthBindingMapper oAuthBindingMapper;
    private final GroupCatalogMapper groupCatalogMapper;
    private final GroupPermissionMapper groupPermissionMapper;
    private final GroupQuotaPolicyMapper groupQuotaPolicyMapper;
    private final UserProviderSecretMapper userProviderSecretMapper;
    private final MusicApiKeyCryptoService musicApiKeyCryptoService;
    private final JdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper;

    public UserServiceImpl(OAuthStateService oAuthStateService,
                        GitHubOAuthClient gitHubOAuthClient,
                        OAuthProperties oAuthProperties,
                        UserAccountMapper userAccountMapper,
                        UserPreferenceMapper userPreferenceMapper,
                        OAuthLoginMapper oAuthLoginMapper,
                        OAuthBindingMapper oAuthBindingMapper,
                        GroupCatalogMapper groupCatalogMapper,
                        GroupPermissionMapper groupPermissionMapper,
                        GroupQuotaPolicyMapper groupQuotaPolicyMapper,
                        UserProviderSecretMapper userProviderSecretMapper,
                        MusicApiKeyCryptoService musicApiKeyCryptoService,
                        JdbcTemplate jdbcTemplate,
                        ObjectMapper objectMapper) {
        this.oAuthStateService = oAuthStateService;
        this.gitHubOAuthClient = gitHubOAuthClient;
        this.oAuthProperties = oAuthProperties;
        this.userAccountMapper = userAccountMapper;
        this.userPreferenceMapper = userPreferenceMapper;
        this.oAuthLoginMapper = oAuthLoginMapper;
        this.oAuthBindingMapper = oAuthBindingMapper;
        this.groupCatalogMapper = groupCatalogMapper;
        this.groupPermissionMapper = groupPermissionMapper;
        this.groupQuotaPolicyMapper = groupQuotaPolicyMapper;
        this.userProviderSecretMapper = userProviderSecretMapper;
        this.musicApiKeyCryptoService = musicApiKeyCryptoService;
        this.jdbcTemplate = jdbcTemplate;
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
                    account == null ? null : account.getAvatarUrl(),
                    loginUser.getGroups(),
                    loginUser.getPermissions()
                );
            })
            .orElse(new MeResponse(0L, "guest", null, Set.of("GUEST"), Set.of()));
    }

    @Override
    public MeAccountResponse getAccountProfile(Long userId) {
        Long checkedUserId = requireValidUserId(userId);
        UserAccountEntity account = userAccountMapper.selectById(checkedUserId);
        if (account == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Account not found");
        }

        List<OAuthBindingResponse> oauthBindings = oAuthBindingMapper.selectList(
                new LambdaQueryWrapper<OAuthBindingEntity>()
                    .eq(OAuthBindingEntity::getUserId, checkedUserId)
                    .orderByDesc(OAuthBindingEntity::getCreatedAt)
            ).stream()
            .map(item -> new OAuthBindingResponse(item.getProvider(), item.getProviderLogin(), item.getCreatedAt()))
            .toList();

        return new MeAccountResponse(
            account.getId(),
            account.getUsername(),
            account.getNickname(),
            account.getEmail(),
            account.getEmailVerified(),
            account.getAvatarUrl(),
            StringUtils.hasText(account.getPassword()),
            oauthBindings
        );
    }

    @Override
    public MeAccountResponse updateProfile(Long userId, ProfileUpdateRequest request) {
        Long checkedUserId = requireValidUserId(userId);
        UserAccountEntity account = userAccountMapper.selectById(checkedUserId);
        if (account == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Account not found");
        }
        if (request == null) {
            return getAccountProfile(checkedUserId);
        }

        if (request.getNickname() != null) {
            String nickname = request.getNickname().trim();
            if (nickname.isEmpty()) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Nickname cannot be empty");
            }
            if (nickname.length() > 128) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Nickname is too long");
            }
            account.setNickname(nickname);
        }

        if (request.getAvatarUrl() != null) {
            String avatarUrl = request.getAvatarUrl().trim();
            if (!avatarUrl.isEmpty()) {
                if (avatarUrl.length() > 512) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Avatar url is too long");
                }
                String normalized = avatarUrl.toLowerCase();
                if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Avatar url must be http/https");
                }
                account.setAvatarUrl(avatarUrl);
            } else {
                account.setAvatarUrl(null);
            }
        }

        account.setUpdatedAt(LocalDateTime.now());
        userAccountMapper.updateById(account);
        return getAccountProfile(checkedUserId);
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
    public List<QuotaPolicyResponse> listQuotaPolicies() {
        return groupQuotaPolicyMapper.selectList(new LambdaQueryWrapper<GroupQuotaPolicyEntity>().orderByAsc(GroupQuotaPolicyEntity::getPolicyId))
            .stream()
            .map(this::toQuotaPolicyResponse)
            .toList();
    }

    @Override
    public QuotaPolicyResponse updateQuotaPolicy(String policyId, QuotaPolicyRequest request) {
        GroupQuotaPolicyEntity entity = groupQuotaPolicyMapper.selectOne(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>().eq(GroupQuotaPolicyEntity::getPolicyId, policyId)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Policy not found");
        }

        validateQuotaPolicyRequest(request);
        entity.setPolicyId(policyId);
        entity.setGroupCode(normalizeGroupCode(request.getGroupCode()));
        entity.setQuotaCode(normalizeQuotaCode(request.getQuotaCode()));
        entity.setQuotaValue(request.getValue());
        entity.setUpdatedAt(LocalDateTime.now());
        groupQuotaPolicyMapper.updateById(entity);
        return toQuotaPolicyResponse(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<QuotaPolicyResponse> batchUpsertQuotaPolicies(List<QuotaPolicyRequest> requests) {
        if (requests == null || requests.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Quota policy batch items are required");
        }

        Set<String> dedup = new LinkedHashSet<>();
        List<QuotaPolicyResponse> result = new java.util.ArrayList<>();
        for (QuotaPolicyRequest request : requests) {
            validateQuotaPolicyRequest(request);
            String groupCode = normalizeGroupCode(request.getGroupCode());
            String quotaCode = normalizeQuotaCode(request.getQuotaCode());
            String dedupKey = groupCode + "::" + quotaCode;
            if (!dedup.add(dedupKey)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Duplicated group_code + quota_code in request");
            }

            GroupQuotaPolicyEntity entity = findPolicyForUpsert(request.getPolicyId(), groupCode, quotaCode);
            LocalDateTime now = LocalDateTime.now();
            if (entity == null) {
                entity = new GroupQuotaPolicyEntity();
                entity.setPolicyId(request.getPolicyId().trim());
                entity.setGroupCode(groupCode);
                entity.setQuotaCode(quotaCode);
                entity.setQuotaValue(request.getValue());
                entity.setCreatedAt(now);
                entity.setUpdatedAt(now);
                try {
                    groupQuotaPolicyMapper.insert(entity);
                } catch (DuplicateKeyException ex) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Policy id or group/quota already exists");
                }
            } else {
                entity.setPolicyId(request.getPolicyId().trim());
                entity.setGroupCode(groupCode);
                entity.setQuotaCode(quotaCode);
                entity.setQuotaValue(request.getValue());
                entity.setUpdatedAt(now);
                groupQuotaPolicyMapper.updateById(entity);
            }
            result.add(toQuotaPolicyResponse(entity));
        }
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicApiKeyStatusResponse upsertMusicApiKey(Long userId, String provider, String apiKey) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        if (!StringUtils.hasText(apiKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "API key is required");
        }

        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, normalizedProvider)
        );

        String cipherText = musicApiKeyCryptoService.encrypt(apiKey.trim());
        String keyMask = maskApiKey(apiKey.trim());
        LocalDateTime now = LocalDateTime.now();
        if (entity == null) {
            entity = new UserProviderSecretEntity();
            entity.setUserId(checkedUserId);
            entity.setProviderCode(normalizedProvider);
            entity.setCipherText(cipherText);
            entity.setKeyMask(keyMask);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            userProviderSecretMapper.insert(entity);
        } else {
            entity.setCipherText(cipherText);
            entity.setKeyMask(keyMask);
            entity.setUpdatedAt(now);
            userProviderSecretMapper.updateById(entity);
        }
        return new MusicApiKeyStatusResponse(normalizedProvider, true, keyMask, entity.getUpdatedAt());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMusicApiKey(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, normalizedProvider)
        );
        if (entity != null) {
            userProviderSecretMapper.deleteById(entity.getId());
        }
    }

    @Override
    public MusicApiKeyStatusResponse getMusicApiKeyStatus(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, normalizedProvider)
        );
        if (entity == null) {
            return new MusicApiKeyStatusResponse(normalizedProvider, false, null, null);
        }
        return new MusicApiKeyStatusResponse(normalizedProvider, true, entity.getKeyMask(), entity.getUpdatedAt());
    }

    @Override
    public String getMusicApiKeyPlaintext(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, normalizedProvider)
        );
        if (entity == null) {
            return "";
        }
        return musicApiKeyCryptoService.decrypt(entity.getCipherText());
    }

    @Override
    public List<MusicSourceAccountStatusResponse> listMusicSourceAccountStatus(Long userId) {
        Long checkedUserId = requireValidUserId(userId);
        List<MusicSourceAccountStatusResponse> result = new ArrayList<>();
        for (String provider : DEFAULT_SOURCE_PROVIDER_ORDER) {
            result.add(loadMusicSourceAccountStatus(checkedUserId, provider));
        }
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public MusicSourceAccountStatusResponse upsertMusicSourceAccountCookie(Long userId, String provider, String cookie) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        if (!StringUtils.hasText(cookie)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cookie is required");
        }
        String normalizedCookie = cookie.trim();
        if (normalizedCookie.length() < 8) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cookie is invalid");
        }

        String providerCode = toSourceAccountProviderCode(normalizedProvider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, providerCode)
                .last("LIMIT 1")
        );

        String cipherText = musicApiKeyCryptoService.encrypt(normalizedCookie);
        String keyMask = maskApiKey(normalizedCookie);
        LocalDateTime now = LocalDateTime.now();
        if (entity == null) {
            entity = new UserProviderSecretEntity();
            entity.setUserId(checkedUserId);
            entity.setProviderCode(providerCode);
            entity.setCipherText(cipherText);
            entity.setKeyMask(keyMask);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            userProviderSecretMapper.insert(entity);
        } else {
            entity.setCipherText(cipherText);
            entity.setKeyMask(keyMask);
            entity.setUpdatedAt(now);
            userProviderSecretMapper.updateById(entity);
        }
        return toMusicSourceAccountStatus(normalizedProvider, entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMusicSourceAccount(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        String providerCode = toSourceAccountProviderCode(normalizedProvider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, providerCode)
                .last("LIMIT 1")
        );
        if (entity != null) {
            userProviderSecretMapper.deleteById(entity.getId());
        }
    }

    @Override
    public MusicSourceAccountStatusResponse getMusicSourceAccountCookieStatus(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        return loadMusicSourceAccountStatus(checkedUserId, normalizedProvider);
    }

    @Override
    public String getMusicSourceAccountCookiePlaintext(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        String providerCode = toSourceAccountProviderCode(normalizedProvider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, checkedUserId)
                .eq(UserProviderSecretEntity::getProviderCode, providerCode)
                .last("LIMIT 1")
        );
        if (entity == null) {
            return "";
        }
        return musicApiKeyCryptoService.decrypt(entity.getCipherText());
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
    public AdminUserPageResponse listAdminUsers(Integer page, Integer pageSize, String keyword) {
        int resolvedPage = page == null || page < 1 ? 1 : page;
        int resolvedPageSize = pageSize == null ? 20 : Math.min(Math.max(pageSize, 1), 100);
        int offset = (resolvedPage - 1) * resolvedPageSize;
        String normalizedKeyword = StringUtils.hasText(keyword) ? keyword.trim() : "";

        LambdaQueryWrapper<UserAccountEntity> countWrapper = buildAdminUserSearchWrapper(normalizedKeyword);
        long total = userAccountMapper.selectCount(countWrapper);
        if (total <= 0) {
            return new AdminUserPageResponse(resolvedPage, resolvedPageSize, 0L, List.of());
        }

        LambdaQueryWrapper<UserAccountEntity> listWrapper = buildAdminUserSearchWrapper(normalizedKeyword)
            .orderByDesc(UserAccountEntity::getId)
            .last("LIMIT " + offset + "," + resolvedPageSize);
        List<UserAccountEntity> users = userAccountMapper.selectList(listWrapper);

        List<AdminUserItemResponse> items = new ArrayList<>(users.size());
        for (UserAccountEntity account : users) {
            Set<String> groups = normalizeGroupCodes(parseStringSet(account.getGroupsJson()));
            Set<String> permissions = normalizePermissionCodes(parseStringSet(account.getPermissionsJson()));
            items.add(new AdminUserItemResponse(
                account.getId(),
                account.getUsername(),
                account.getNickname(),
                account.getEmail(),
                account.getEmailVerified(),
                account.getAvatarUrl(),
                groups,
                permissions,
                account.getCreatedAt(),
                account.getUpdatedAt()
            ));
        }
        items.sort(Comparator.comparing(AdminUserItemResponse::userId).reversed());
        return new AdminUserPageResponse(resolvedPage, resolvedPageSize, total, items);
    }

    @Override
    public AdminGroupPageResponse listAdminGroups(Integer page, Integer pageSize, String keyword, String status) {
        int resolvedPage = page == null || page < 1 ? 1 : page;
        int resolvedPageSize = pageSize == null ? DEFAULT_GROUP_PAGE_SIZE : Math.min(Math.max(pageSize, 1), 100);
        int offset = (resolvedPage - 1) * resolvedPageSize;
        String normalizedKeyword = StringUtils.hasText(keyword) ? keyword.trim() : "";
        String normalizedStatus = normalizeGroupStatusNullable(status);

        LambdaQueryWrapper<GroupCatalogEntity> countWrapper = buildAdminGroupSearchWrapper(normalizedKeyword, normalizedStatus);
        long total = groupCatalogMapper.selectCount(countWrapper);
        if (total <= 0) {
            return new AdminGroupPageResponse(resolvedPage, resolvedPageSize, 0L, List.of());
        }

        LambdaQueryWrapper<GroupCatalogEntity> listWrapper = buildAdminGroupSearchWrapper(normalizedKeyword, normalizedStatus)
            .orderByAsc(GroupCatalogEntity::getSortNum)
            .orderByAsc(GroupCatalogEntity::getGroupCode)
            .last("LIMIT " + offset + "," + resolvedPageSize);
        List<GroupCatalogEntity> groups = groupCatalogMapper.selectList(listWrapper);
        List<AdminGroupItemResponse> items = groups.stream()
            .map(this::toAdminGroupItemResponse)
            .toList();
        return new AdminGroupPageResponse(resolvedPage, resolvedPageSize, total, items);
    }

    @Override
    @Transactional
    public AdminGroupItemResponse createAdminGroup(AdminGroupCreateRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }
        String displayName = normalizeDisplayName(request.getDisplayName());
        String description = normalizeGroupDescription(request.getDescription());
        String baseCode = generateGroupCodeBase(displayName);

        GroupCatalogEntity entity = null;
        for (int attempt = 1; attempt <= 50; attempt++) {
            String candidate = attempt == 1 ? baseCode : appendGroupCodeSuffix(baseCode, attempt);
            entity = new GroupCatalogEntity();
            entity.setGroupCode(candidate);
            entity.setDisplayName(displayName);
            entity.setDescriptionText(description);
            entity.setStatusCode(GROUP_STATUS_ACTIVE);
            entity.setBuiltInFlag(0);
            entity.setSortNum(1000);
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
            try {
                groupCatalogMapper.insert(entity);
                return toAdminGroupItemResponse(entity);
            } catch (DuplicateKeyException ex) {
                // 保持重试，直到拿到未占用分组编码。
            }
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Failed to create group: too many naming conflicts");
    }

    @Override
    @Transactional
    public AdminGroupItemResponse updateAdminGroup(String groupCode, AdminGroupUpdateRequest request) {
        String normalizedGroupCode = normalizeGroupCode(groupCode);
        GroupCatalogEntity entity = groupCatalogMapper.selectOne(
            new LambdaQueryWrapper<GroupCatalogEntity>().eq(GroupCatalogEntity::getGroupCode, normalizedGroupCode)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Group not found");
        }
        if (request == null) {
            return toAdminGroupItemResponse(entity);
        }

        if (request.getDisplayName() != null) {
            entity.setDisplayName(normalizeDisplayName(request.getDisplayName()));
        }
        if (request.getDescription() != null) {
            entity.setDescriptionText(normalizeGroupDescription(request.getDescription()));
        }
        if (request.getStatus() != null) {
            String normalizedStatus = normalizeGroupStatus(request.getStatus());
            if ("ADMIN".equals(normalizedGroupCode) && !GROUP_STATUS_ACTIVE.equals(normalizedStatus)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "ADMIN group status must stay ACTIVE");
            }
            entity.setStatusCode(normalizedStatus);
        }
        entity.setUpdatedAt(LocalDateTime.now());
        groupCatalogMapper.updateById(entity);
        return toAdminGroupItemResponse(entity);
    }

    @Override
    @Transactional
    public void deleteAdminGroup(String groupCode) {
        String normalizedGroupCode = normalizeGroupCode(groupCode);
        if ("ADMIN".equals(normalizedGroupCode)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "ADMIN group cannot be deleted");
        }
        GroupCatalogEntity entity = groupCatalogMapper.selectOne(
            new LambdaQueryWrapper<GroupCatalogEntity>().eq(GroupCatalogEntity::getGroupCode, normalizedGroupCode)
        );
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Group not found");
        }

        groupPermissionMapper.delete(new LambdaQueryWrapper<GroupPermissionEntity>()
            .eq(GroupPermissionEntity::getGroupCode, normalizedGroupCode));
        groupQuotaPolicyMapper.delete(new LambdaQueryWrapper<GroupQuotaPolicyEntity>()
            .eq(GroupQuotaPolicyEntity::getGroupCode, normalizedGroupCode));

        jdbcTemplate.update("DELETE FROM CTN_POST_GROUP_ACL WHERE group_code = ?", normalizedGroupCode);
        jdbcTemplate.update("DELETE FROM CTN_APP_GROUP_ACL WHERE group_code = ?", normalizedGroupCode);
        jdbcTemplate.update("DELETE FROM MDA_ASSET_GROUP_ACL WHERE group_code = ?", normalizedGroupCode);
        jdbcTemplate.update(
            "UPDATE USR_ACCOUNT "
                + "SET groups_json = JSON_REMOVE(groups_json, JSON_UNQUOTE(JSON_SEARCH(groups_json, 'one', ?))) "
                + "WHERE JSON_SEARCH(groups_json, 'one', ?) IS NOT NULL",
            normalizedGroupCode,
            normalizedGroupCode
        );

        groupCatalogMapper.deleteById(entity.getId());
    }

    @Override
    public AdminOptionsResponse getAdminOptions() {
        List<GroupCatalogEntity> groups = groupCatalogMapper.selectList(
            new LambdaQueryWrapper<GroupCatalogEntity>()
                .orderByAsc(GroupCatalogEntity::getSortNum)
                .orderByAsc(GroupCatalogEntity::getGroupCode)
        );
        List<AdminGroupOptionResponse> groupOptions = groups.stream()
            .map(entity -> new AdminGroupOptionResponse(
                entity.getGroupCode(),
                entity.getDisplayName(),
                entity.getStatusCode(),
                entity.getBuiltInFlag()
            ))
            .toList();

        List<String> permissionCatalog = groupPermissionMapper.selectList(
            new LambdaQueryWrapper<GroupPermissionEntity>().orderByAsc(GroupPermissionEntity::getPermissionCode)
        ).stream()
            .map(GroupPermissionEntity::getPermissionCode)
            .filter(StringUtils::hasText)
            .map(String::trim)
            .distinct()
            .toList();

        List<String> quotaCatalog = groupQuotaPolicyMapper.selectList(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>().orderByAsc(GroupQuotaPolicyEntity::getQuotaCode)
        ).stream()
            .map(GroupQuotaPolicyEntity::getQuotaCode)
            .filter(StringUtils::hasText)
            .map(String::trim)
            .distinct()
            .toList();

        return new AdminOptionsResponse(groupOptions, permissionCatalog, quotaCatalog);
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

    private LambdaQueryWrapper<UserAccountEntity> buildAdminUserSearchWrapper(String normalizedKeyword) {
        LambdaQueryWrapper<UserAccountEntity> wrapper = new LambdaQueryWrapper<>();
        if (!StringUtils.hasText(normalizedKeyword)) {
            return wrapper;
        }

        wrapper.and(q -> {
            q.like(UserAccountEntity::getUsername, normalizedKeyword)
                .or()
                .like(UserAccountEntity::getNickname, normalizedKeyword)
                .or()
                .like(UserAccountEntity::getEmail, normalizedKeyword);
            Long maybeUserId = parsePositiveLong(normalizedKeyword);
            if (maybeUserId != null) {
                q.or().eq(UserAccountEntity::getId, maybeUserId);
            }
        });
        return wrapper;
    }

    private LambdaQueryWrapper<GroupCatalogEntity> buildAdminGroupSearchWrapper(String normalizedKeyword, String normalizedStatus) {
        LambdaQueryWrapper<GroupCatalogEntity> wrapper = new LambdaQueryWrapper<>();
        if (StringUtils.hasText(normalizedStatus)) {
            wrapper.eq(GroupCatalogEntity::getStatusCode, normalizedStatus);
        }
        if (StringUtils.hasText(normalizedKeyword)) {
            wrapper.and(q -> q.like(GroupCatalogEntity::getGroupCode, normalizedKeyword)
                .or()
                .like(GroupCatalogEntity::getDisplayName, normalizedKeyword)
                .or()
                .like(GroupCatalogEntity::getDescriptionText, normalizedKeyword));
        }
        return wrapper;
    }

    private AdminGroupItemResponse toAdminGroupItemResponse(GroupCatalogEntity entity) {
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Group not found");
        }
        String groupCode = normalizeGroupCode(entity.getGroupCode());
        long userCount = queryUserCountByGroup(groupCode);
        long permissionCount = groupPermissionMapper.selectCount(
            new LambdaQueryWrapper<GroupPermissionEntity>().eq(GroupPermissionEntity::getGroupCode, groupCode)
        );
        long quotaCount = groupQuotaPolicyMapper.selectCount(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>().eq(GroupQuotaPolicyEntity::getGroupCode, groupCode)
        );
        return new AdminGroupItemResponse(
            groupCode,
            entity.getDisplayName(),
            entity.getDescriptionText(),
            normalizeGroupStatus(entity.getStatusCode()),
            entity.getBuiltInFlag() == null ? 0 : entity.getBuiltInFlag(),
            entity.getSortNum() == null ? 0 : entity.getSortNum(),
            userCount,
            permissionCount,
            quotaCount,
            entity.getCreatedAt(),
            entity.getUpdatedAt()
        );
    }

    private long queryUserCountByGroup(String groupCode) {
        Long count = jdbcTemplate.queryForObject(
            "SELECT COUNT(1) FROM USR_ACCOUNT WHERE deleted_flag = 0 AND JSON_SEARCH(groups_json, 'one', ?) IS NOT NULL",
            Long.class,
            groupCode
        );
        return count == null ? 0L : count;
    }

    private String normalizeDisplayName(String displayName) {
        if (!StringUtils.hasText(displayName)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Display name is required");
        }
        String normalized = displayName.trim();
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Display name is too long");
        }
        return normalized;
    }

    private String normalizeGroupDescription(String description) {
        if (description == null) {
            return null;
        }
        String normalized = description.trim();
        if (normalized.isEmpty()) {
            return null;
        }
        if (normalized.length() > 255) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Description is too long");
        }
        return normalized;
    }

    private String normalizeGroupStatus(String status) {
        String normalized = normalizeGroupStatusNullable(status);
        if (!StringUtils.hasText(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Status is required");
        }
        return normalized;
    }

    private String normalizeGroupStatusNullable(String status) {
        if (!StringUtils.hasText(status)) {
            return null;
        }
        String normalized = status.trim().toUpperCase();
        if (Objects.equals(normalized, GROUP_STATUS_ACTIVE) || Objects.equals(normalized, GROUP_STATUS_DISABLED)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported status value");
    }

    private String generateGroupCodeBase(String displayName) {
        String normalized = displayName.toUpperCase()
            .replaceAll("[^A-Z0-9]+", "_")
            .replaceAll("_+", "_")
            .replaceAll("^_+", "")
            .replaceAll("_+$", "");
        if (!StringUtils.hasText(normalized)) {
            normalized = "GROUP";
        }
        if (Character.isDigit(normalized.charAt(0))) {
            normalized = "G_" + normalized;
        }
        if (normalized.length() > 32) {
            normalized = normalized.substring(0, 32);
        }
        normalized = normalized.replaceAll("_+$", "");
        return StringUtils.hasText(normalized) ? normalized : "GROUP";
    }

    private String appendGroupCodeSuffix(String baseCode, int attempt) {
        String suffix = "_" + attempt;
        int maxBaseLen = Math.max(1, 32 - suffix.length());
        String normalizedBase = baseCode;
        if (normalizedBase.length() > maxBaseLen) {
            normalizedBase = normalizedBase.substring(0, maxBaseLen);
        }
        normalizedBase = normalizedBase.replaceAll("_+$", "");
        if (!StringUtils.hasText(normalizedBase)) {
            normalizedBase = "G";
        }
        return normalizedBase + suffix;
    }

    private Long parsePositiveLong(String raw) {
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        try {
            long value = Long.parseLong(raw.trim());
            return value > 0 ? value : null;
        } catch (NumberFormatException ex) {
            return null;
        }
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

    private QuotaPolicyResponse toQuotaPolicyResponse(GroupQuotaPolicyEntity entity) {
        return new QuotaPolicyResponse(
            entity.getPolicyId(),
            entity.getGroupCode(),
            entity.getQuotaCode(),
            entity.getQuotaValue()
        );
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

    private void validateQuotaPolicyRequest(QuotaPolicyRequest request) {
        if (request == null
            || !StringUtils.hasText(request.getPolicyId())
            || !StringUtils.hasText(request.getGroupCode())
            || !StringUtils.hasText(request.getQuotaCode())
            || request.getValue() == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "policy_id/group_code/quota_code/value are required");
        }
        if (request.getValue() < -1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "quota value must be -1 or non-negative");
        }
    }

    private GroupQuotaPolicyEntity findPolicyForUpsert(String policyId, String groupCode, String quotaCode) {
        GroupQuotaPolicyEntity byPolicyId = groupQuotaPolicyMapper.selectOne(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>().eq(GroupQuotaPolicyEntity::getPolicyId, policyId)
        );
        if (byPolicyId != null) {
            return byPolicyId;
        }
        return groupQuotaPolicyMapper.selectOne(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>()
                .eq(GroupQuotaPolicyEntity::getGroupCode, groupCode)
                .eq(GroupQuotaPolicyEntity::getQuotaCode, quotaCode)
        );
    }

    private String normalizeQuotaCode(String quotaCode) {
        if (!StringUtils.hasText(quotaCode)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Quota code is required");
        }
        return quotaCode.trim().toLowerCase();
    }

    private Long requireValidUserId(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
    }

    private String normalizeProvider(String provider) {
        if (!StringUtils.hasText(provider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider is required");
        }
        String normalized = provider.trim().toLowerCase();
        if (!SUPPORTED_MUSIC_PROVIDERS.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported provider: " + provider);
        }
        return normalized;
    }

    private String normalizeSourceAccountProvider(String provider) {
        if (!StringUtils.hasText(provider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider is required");
        }
        String normalized = provider.trim().toLowerCase(Locale.ROOT);
        if (!SUPPORTED_MUSIC_SOURCE_PROVIDERS.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        }
        return normalized;
    }

    private String toSourceAccountProviderCode(String normalizedProvider) {
        return SOURCE_ACCOUNT_PROVIDER_PREFIX + normalizedProvider;
    }

    private MusicSourceAccountStatusResponse loadMusicSourceAccountStatus(Long userId, String provider) {
        String normalizedProvider = normalizeSourceAccountProvider(provider);
        String providerCode = toSourceAccountProviderCode(normalizedProvider);
        UserProviderSecretEntity entity = userProviderSecretMapper.selectOne(
            new LambdaQueryWrapper<UserProviderSecretEntity>()
                .eq(UserProviderSecretEntity::getUserId, userId)
                .eq(UserProviderSecretEntity::getProviderCode, providerCode)
                .last("LIMIT 1")
        );
        return toMusicSourceAccountStatus(normalizedProvider, entity);
    }

    private MusicSourceAccountStatusResponse toMusicSourceAccountStatus(String provider, UserProviderSecretEntity entity) {
        if (entity == null) {
            return new MusicSourceAccountStatusResponse(
                provider,
                "cookie",
                false,
                null,
                "UNBOUND",
                null,
                null,
                null
            );
        }
        LocalDateTime updatedAt = entity.getUpdatedAt();
        return new MusicSourceAccountStatusResponse(
            provider,
            "cookie",
            true,
            entity.getKeyMask() == null ? "" : entity.getKeyMask(),
            "BOUND",
            updatedAt,
            updatedAt,
            null
        );
    }

    private String maskApiKey(String apiKey) {
        if (!StringUtils.hasText(apiKey)) {
            return "****";
        }
        String raw = apiKey.trim();
        if (raw.length() <= 8) {
            return "****";
        }
        return raw.substring(0, 4) + "****" + raw.substring(raw.length() - 4);
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
