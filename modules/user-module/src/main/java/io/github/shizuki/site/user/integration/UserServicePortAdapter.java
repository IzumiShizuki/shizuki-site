package io.github.shizuki.site.user.integration;

import io.github.shizuki.common.integration.user.UserServicePort;
import io.github.shizuki.site.user.response.MeAccountResponse;
import io.github.shizuki.site.user.response.MusicApiKeyStatusResponse;
import io.github.shizuki.site.user.response.MusicSourceAccountStatusResponse;
import io.github.shizuki.site.user.service.UserService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * 把 user-module 的 {@link UserService} 暴露为 {@link UserServicePort}（boundary
 * port，位于 libs/common-integration）。
 *
 * <p>引入此适配器的目的：让 ai-module / media-module 等业务模块仅依赖
 * {@code common-integration} 中的 {@code UserServicePort} 而无需直接依赖
 * {@code modules/user-module}，从而消除 modules → modules 的 compile 时强耦合
 * （评审 finding {@code 2380d72adfeb} / {@code 7315fcf997e4}）。
 *
 * <p>本适配器是单体模式下的"零开销直转发"实现。未来若 user-module 拆为独立微服务，
 * 这里的实现可被替换为 HTTP / gRPC 客户端，调用方代码无需修改。
 */
@Component
public class UserServicePortAdapter implements UserServicePort {

    private final UserService userService;

    public UserServicePortAdapter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Long resolveQuota(String quotaCode, Set<String> groupCodes, Long defaultValue) {
        return userService.resolveQuota(quotaCode, groupCodes, defaultValue);
    }

    @Override
    public MeAccountResponse getAccountProfile(Long userId) {
        return userService.getAccountProfile(userId);
    }

    @Override
    public Map<String, Object> getPreference(Long userId) {
        return userService.getPreference(userId);
    }

    @Override
    public MusicApiKeyStatusResponse getMusicApiKeyStatus(Long userId, String provider) {
        return userService.getMusicApiKeyStatus(userId, provider);
    }

    @Override
    public String getMusicApiKeyPlaintext(Long userId, String provider) {
        return userService.getMusicApiKeyPlaintext(userId, provider);
    }

    @Override
    public List<MusicSourceAccountStatusResponse> listMusicSourceAccountStatus(Long userId) {
        return userService.listMusicSourceAccountStatus(userId);
    }

    @Override
    public MusicSourceAccountStatusResponse getMusicSourceAccountCookieStatus(Long userId, String provider) {
        return userService.getMusicSourceAccountCookieStatus(userId, provider);
    }

    @Override
    public String getMusicSourceAccountCookiePlaintext(Long userId, String provider) {
        return userService.getMusicSourceAccountCookiePlaintext(userId, provider);
    }
}
