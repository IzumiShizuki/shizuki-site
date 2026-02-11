package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class AuthGrantStrategyFactory {

    private final Map<AuthGrantType, AuthGrantStrategy> strategyMap = new LinkedHashMap<>();

    public AuthGrantStrategyFactory(List<AuthGrantStrategy> strategies) {
        for (AuthGrantType type : AuthGrantType.values()) {
            for (AuthGrantStrategy strategy : strategies) {
                if (strategy.supports(type)) {
                    strategyMap.put(type, strategy);
                    break;
                }
            }
        }
    }

    public AuthGrantStrategy get(AuthGrantType grantType) {
        AuthGrantStrategy strategy = strategyMap.get(grantType);
        if (strategy == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported grant_type: " + grantType);
        }
        return strategy;
    }
}

