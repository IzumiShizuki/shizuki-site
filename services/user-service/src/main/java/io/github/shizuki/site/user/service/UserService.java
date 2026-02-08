package io.github.shizuki.site.user.service;

import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.OAuthLoginCreateRequest;
import io.github.shizuki.site.user.dto.OAuthLoginCreateResponse;
import io.github.shizuki.site.user.dto.QuotaPolicyDto;
import io.github.shizuki.site.user.dto.auth.AuthIntrospectResponse;
import io.github.shizuki.site.user.dto.auth.AuthLoginResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {

    MeResponse currentUser();

    void savePreference(Long userId, Map<String, Object> preferenceJson);

    OAuthLoginCreateResponse createOAuthLogin(OAuthLoginCreateRequest request);

    String exchangeOAuthToken(String oauthLoginId, String code, String state);

    List<QuotaPolicyDto> listQuotaPolicies();

    QuotaPolicyDto updateQuotaPolicy(String policyId, QuotaPolicyDto request);

    AuthLoginResponse login(String username, String password);

    void logout();

    AuthIntrospectResponse introspect();

    Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue);
}
