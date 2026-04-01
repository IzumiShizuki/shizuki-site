package io.github.shizuki.site.user.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.oauth.client.GitHubOAuthClient;
import io.github.shizuki.common.oauth.config.OAuthProperties;
import io.github.shizuki.common.oauth.service.OAuthStateService;
import io.github.shizuki.site.user.request.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.request.ProfileUpdateRequest;
import io.github.shizuki.site.user.request.AdminGroupCreateRequest;
import io.github.shizuki.site.user.request.AdminGroupUpdateRequest;
import io.github.shizuki.site.user.entity.GroupCatalogEntity;
import io.github.shizuki.site.user.entity.GroupQuotaPolicyEntity;
import io.github.shizuki.site.user.entity.UserAccountEntity;
import io.github.shizuki.site.user.entity.UserPreferenceEntity;
import io.github.shizuki.site.user.mapper.GroupCatalogMapper;
import io.github.shizuki.site.user.mapper.GroupPermissionMapper;
import io.github.shizuki.site.user.mapper.GroupQuotaPolicyMapper;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.mapper.UserPreferenceMapper;
import io.github.shizuki.site.user.mapper.UserProviderSecretMapper;
import io.github.shizuki.site.user.service.security.MusicApiKeyCryptoService;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private OAuthStateService oAuthStateService;
    @Mock
    private GitHubOAuthClient gitHubOAuthClient;
    @Mock
    private UserAccountMapper userAccountMapper;
    @Mock
    private UserPreferenceMapper userPreferenceMapper;
    @Mock
    private OAuthLoginMapper oAuthLoginMapper;
    @Mock
    private OAuthBindingMapper oAuthBindingMapper;
    @Mock
    private GroupCatalogMapper groupCatalogMapper;
    @Mock
    private GroupPermissionMapper groupPermissionMapper;
    @Mock
    private GroupQuotaPolicyMapper groupQuotaPolicyMapper;
    @Mock
    private UserProviderSecretMapper userProviderSecretMapper;
    @Mock
    private MusicApiKeyCryptoService musicApiKeyCryptoService;
    @Mock
    private JdbcTemplate jdbcTemplate;

    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        OAuthProperties oAuthProperties = new OAuthProperties();
        oAuthProperties.setClientId("test-client");
        userService = new UserServiceImpl(
            oAuthStateService,
            gitHubOAuthClient,
            oAuthProperties,
            userAccountMapper,
            userPreferenceMapper,
            oAuthLoginMapper,
            oAuthBindingMapper,
            groupCatalogMapper,
            groupPermissionMapper,
            groupQuotaPolicyMapper,
            userProviderSecretMapper,
            musicApiKeyCryptoService,
            jdbcTemplate,
            new ObjectMapper()
        );
    }

    @Test
    void should_throw_bad_request_when_provider_not_supported() {
        OAuthLoginCreateRequest request = new OAuthLoginCreateRequest();
        request.setProvider("google");
        request.setRedirectUri("https://example.com/callback");

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> userService.createOAuthLogin(request));
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void should_throw_bad_request_when_oauth_state_invalid() {
        Mockito.when(oAuthStateService.validateAndConsume("login-001", "expired-state")).thenReturn(false);

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.exchangeOAuthToken("login-001", "code-001", "expired-state")
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void should_throw_unauthorized_when_login_user_not_found() {
        Mockito.when(userAccountMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.login("admin", "admin123")
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void should_return_default_quota_when_group_codes_empty() {
        Long quota = userService.resolveQuota("ai_round_total", Set.of(), 7L);
        Assertions.assertEquals(7L, quota);
    }

    @Test
    void should_return_max_quota_when_multiple_group_policies_matched() {
        GroupQuotaPolicyEntity userPolicy = new GroupQuotaPolicyEntity();
        userPolicy.setQuotaValue(20L);
        GroupQuotaPolicyEntity interviewerPolicy = new GroupQuotaPolicyEntity();
        interviewerPolicy.setQuotaValue(10L);
        Mockito.when(groupQuotaPolicyMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(userPolicy, interviewerPolicy));

        Long quota = userService.resolveQuota("ai_round_total", Set.of("USER", "INTERVIEWER"), 5L);
        Assertions.assertEquals(20L, quota);
    }

    @Test
    void should_return_guest_quota_when_guest_policy_exists() {
        GroupQuotaPolicyEntity guestPolicy = new GroupQuotaPolicyEntity();
        guestPolicy.setQuotaValue(0L);
        Mockito.when(groupQuotaPolicyMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(guestPolicy));

        Long quota = userService.resolveQuota("ai_round_total", Set.of("GUEST"), 9L);

        Assertions.assertEquals(0L, quota);
    }

    @Test
    void should_throw_unauthorized_when_save_preference_user_id_invalid() {
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.savePreference(0L, Map.of("theme", "dark"))
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void should_throw_bad_request_when_preference_json_serialization_failed() {
        ObjectMapper brokenObjectMapper = Mockito.mock(ObjectMapper.class);
        try {
            Mockito.when(brokenObjectMapper.writeValueAsString(ArgumentMatchers.any()))
                .thenThrow(new com.fasterxml.jackson.core.JsonProcessingException("mock serialize error") {
                });
        } catch (com.fasterxml.jackson.core.JsonProcessingException exception) {
            throw new RuntimeException(exception);
        }

        UserServiceImpl failingService = new UserServiceImpl(
            oAuthStateService,
            gitHubOAuthClient,
            new OAuthProperties(),
            userAccountMapper,
            userPreferenceMapper,
            oAuthLoginMapper,
            oAuthBindingMapper,
            groupCatalogMapper,
            groupPermissionMapper,
            groupQuotaPolicyMapper,
            userProviderSecretMapper,
            musicApiKeyCryptoService,
            jdbcTemplate,
            brokenObjectMapper
        );

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> failingService.savePreference(1L, new HashMap<>())
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void should_throw_unauthorized_when_get_preference_user_id_invalid() {
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.getPreference(0L)
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, exception.getErrorCode());
    }

    @Test
    void should_return_empty_map_when_preference_not_exists() {
        Mockito.when(userPreferenceMapper.selectOne(ArgumentMatchers.any())).thenReturn(null);

        Map<String, Object> result = userService.getPreference(1L);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void should_return_preference_map_when_preference_exists() {
        UserPreferenceEntity entity = new UserPreferenceEntity();
        entity.setPreferenceJson("{\"theme\":\"glass\",\"active_role\":101}");
        Mockito.when(userPreferenceMapper.selectOne(ArgumentMatchers.any())).thenReturn(entity);

        Map<String, Object> result = userService.getPreference(1L);
        Assertions.assertEquals("glass", result.get("theme"));
        Assertions.assertEquals(101, result.get("active_role"));
    }

    @Test
    void should_throw_bad_request_when_update_profile_avatar_url_not_http() {
        UserAccountEntity account = new UserAccountEntity();
        account.setId(1L);
        account.setNickname("demo");
        Mockito.when(userAccountMapper.selectById(1L)).thenReturn(account);

        ProfileUpdateRequest request = new ProfileUpdateRequest();
        request.setAvatarUrl("javascript:alert(1)");

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.updateProfile(1L, request)
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
        Assertions.assertTrue(exception.getMessage().contains("Avatar url"));
    }

    @Test
    void should_generate_unique_group_code_when_base_group_code_conflicts() {
        Mockito.doThrow(new org.springframework.dao.DuplicateKeyException("duplicated"))
            .doAnswer(invocation -> {
                GroupCatalogEntity entity = invocation.getArgument(0);
                entity.setId(101L);
                return 1;
            })
            .when(groupCatalogMapper)
            .insert(ArgumentMatchers.any(GroupCatalogEntity.class));

        Mockito.when(jdbcTemplate.queryForObject(ArgumentMatchers.anyString(), ArgumentMatchers.eq(Long.class), ArgumentMatchers.any()))
            .thenReturn(0L);
        Mockito.when(groupPermissionMapper.selectCount(ArgumentMatchers.any())).thenReturn(0L);
        Mockito.when(groupQuotaPolicyMapper.selectCount(ArgumentMatchers.any())).thenReturn(0L);

        AdminGroupCreateRequest request = new AdminGroupCreateRequest();
        request.setDisplayName("Content Ops");
        request.setDescription("group for content ops");

        var response = userService.createAdminGroup(request);

        Assertions.assertEquals("CONTENT_OPS_2", response.groupCode());
    }

    @Test
    void should_reject_delete_admin_group() {
        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.deleteAdminGroup("ADMIN")
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void should_reject_set_admin_group_to_disabled() {
        GroupCatalogEntity admin = new GroupCatalogEntity();
        admin.setId(1L);
        admin.setGroupCode("ADMIN");
        admin.setDisplayName("管理员");
        admin.setStatusCode("ACTIVE");
        Mockito.when(groupCatalogMapper.selectOne(ArgumentMatchers.any())).thenReturn(admin);

        AdminGroupUpdateRequest request = new AdminGroupUpdateRequest();
        request.setStatus("DISABLED");

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> userService.updateAdminGroup("ADMIN", request)
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }
}
