package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class OAuthProviderStrategyFactory {

    private final Map<String, OAuthProviderStrategy> strategyMap;

    public OAuthProviderStrategyFactory(List<OAuthProviderStrategy> strategies) {
        this.strategyMap = new LinkedHashMap<>();
        for (OAuthProviderStrategy strategy : strategies) {
            this.strategyMap.put(strategy.providerCode().toLowerCase(Locale.ROOT), strategy);
        }
    }

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

