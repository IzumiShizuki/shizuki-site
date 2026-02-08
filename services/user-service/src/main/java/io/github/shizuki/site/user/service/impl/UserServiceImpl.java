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
import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import io.github.shizuki.site.user.entity.GroupQuotaPolicyEntity;
import io.github.shizuki.site.user.entity.OAuthBindingEntity;
import io.github.shizuki.site.user.entity.OAuthLoginEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.entity.UserPreferenceEntity;
import io.github.shizuki.site.user.mapper.GroupQuotaPolicyMapper;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.mapper.UserPreferenceMapper;
import io.github.shizuki.site.user.service.UserService;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
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
    private final GroupQuotaPolicyMapper groupQuotaPolicyMapper;
    private final ObjectMapper objectMapper;

    public UserServiceImpl(OAuthStateService oAuthStateService,
                        GitHubOAuthClient gitHubOAuthClient,
                        OAuthProperties oAuthProperties,
                        UserAccountMapper userAccountMapper,
                        UserPreferenceMapper userPreferenceMapper,
                        OAuthLoginMapper oAuthLoginMapper,
                        OAuthBindingMapper oAuthBindingMapper,
                        GroupQuotaPolicyMapper groupQuotaPolicyMapper,
                        ObjectMapper objectMapper) {
        this.oAuthStateService = oAuthStateService;
        this.gitHubOAuthClient = gitHubOAuthClient;
        this.oAuthProperties = oAuthProperties;
        this.userAccountMapper = userAccountMapper;
        this.userPreferenceMapper = userPreferenceMapper;
        this.oAuthLoginMapper = oAuthLoginMapper;
        this.oAuthBindingMapper = oAuthBindingMapper;
        this.groupQuotaPolicyMapper = groupQuotaPolicyMapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public MeResponse currentUser() {
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
    public OAuthLoginCreateResponse createOAuthLogin(OAuthLoginCreateRequest request) {
        if (!"github".equalsIgnoreCase(request.getProvider())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Only github provider is supported");
        }

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
        if (!oAuthStateService.validateAndConsume(oauthLoginId, state)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid oauth state");
        }

        OAuthLoginEntity oauthLogin = oAuthLoginMapper.selectById(oauthLoginId);
        if (oauthLogin == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "OAuth login not found");
        }

        try {
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
        GroupQuotaPolicyEntity entity = groupQuotaPolicyMapper.selectById(policyId);
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
    public AuthLoginResponse login(String username, String password) {
        UserAccountEntity account = userAccountMapper.selectOne(
            new LambdaQueryWrapper<UserAccountEntity>().eq(UserAccountEntity::getUsername, username)
        );
        if (account == null || !StringUtils.hasText(account.getPassword()) || !account.getPassword().equals(password)) {
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

        return new AuthIntrospectResponse(
            userId,
            parseStringSet(account.getGroupsJson()),
            parseStringSet(account.getPermissionsJson())
        );
    }

    @Override
    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        long fallback = defaultValue == null ? 5L : defaultValue;
        if (groupCodes == null || groupCodes.isEmpty()) {
            return fallback;
        }

        List<GroupQuotaPolicyEntity> policies = groupQuotaPolicyMapper.selectList(
            new LambdaQueryWrapper<GroupQuotaPolicyEntity>()
                .eq(GroupQuotaPolicyEntity::getQuotaCode, quotaCode)
                .in(GroupQuotaPolicyEntity::getGroupCode, groupCodes)
        );
        if (policies == null || policies.isEmpty()) {
            return fallback;
        }

        return policies.stream().map(GroupQuotaPolicyEntity::getQuotaValue).min(Long::compareTo).orElse(fallback);
    }

    private Long bindOrCreateUser(GitHubUserResponse userResponse) {
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

    private Set<String> parseStringSet(String json) {
        if (!StringUtils.hasText(json)) {
            return Set.of();
        }
        try {
            List<String> values = objectMapper.readValue(json, new TypeReference<List<String>>() {
            });
            return values == null ? Set.of() : values.stream().filter(StringUtils::hasText).collect(Collectors.toSet());
        } catch (Exception ex) {
            return Set.of();
        }
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
