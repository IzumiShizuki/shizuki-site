package io.github.shizuki.site.user.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.oauth.client.GitHubOAuthClient;
import io.github.shizuki.common.oauth.config.OAuthProperties;
import io.github.shizuki.common.oauth.service.OAuthStateService;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.entity.GroupQuotaPolicyEntity;
import io.github.shizuki.site.user.mapper.GroupQuotaPolicyMapper;
import io.github.shizuki.site.user.mapper.OAuthBindingMapper;
import io.github.shizuki.site.user.mapper.OAuthLoginMapper;
import io.github.shizuki.site.user.mapper.UserAccountMapper;
import io.github.shizuki.site.user.mapper.UserPreferenceMapper;
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
    private GroupQuotaPolicyMapper groupQuotaPolicyMapper;

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
            groupQuotaPolicyMapper,
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
    void should_return_min_quota_when_multiple_group_policies_matched() {
        GroupQuotaPolicyEntity userPolicy = new GroupQuotaPolicyEntity();
        userPolicy.setQuotaValue(20L);
        GroupQuotaPolicyEntity interviewerPolicy = new GroupQuotaPolicyEntity();
        interviewerPolicy.setQuotaValue(10L);
        Mockito.when(groupQuotaPolicyMapper.selectList(ArgumentMatchers.any())).thenReturn(List.of(userPolicy, interviewerPolicy));

        Long quota = userService.resolveQuota("ai_round_total", Set.of("USER", "INTERVIEWER"), 5L);
        Assertions.assertEquals(10L, quota);
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
            groupQuotaPolicyMapper,
            brokenObjectMapper
        );

        BusinessException exception = Assertions.assertThrows(
            BusinessException.class,
            () -> failingService.savePreference(1L, new HashMap<>())
        );
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }
}
