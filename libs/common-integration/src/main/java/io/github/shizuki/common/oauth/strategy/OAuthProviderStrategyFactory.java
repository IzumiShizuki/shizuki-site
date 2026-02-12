package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * OAuth provider 策略工厂。
 *
 * <p>按 provider code 分发到具体策略实现。
 */
@Component
public class OAuthProviderStrategyFactory {

    /**
     * provider code 到策略实例映射。
     */
    private final Map<String, OAuthProviderStrategy> strategyMap;

    /**
     * 初始化策略映射。
     *
     * @param strategies Spring 注入的策略实现列表
     */
    public OAuthProviderStrategyFactory(List<OAuthProviderStrategy> strategies) {
        this.strategyMap = new LinkedHashMap<>();
        for (OAuthProviderStrategy strategy : strategies) {
            this.strategyMap.put(strategy.providerCode().toLowerCase(Locale.ROOT), strategy);
        }
    }

    /**
     * 获取 provider 对应策略。
     *
     * @param providerCode provider code
     * @return 策略实例
     */
    public OAuthProviderStrategy get(String providerCode) {
        if (!StringUtils.hasText(providerCode)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth provider is required");
        }
        OAuthProviderStrategy strategy = strategyMap.get(providerCode.toLowerCase(Locale.ROOT));
        if (strategy == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported OAuth provider: " + providerCode);
        }
        return strategy;
    }
}
