package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * 授权策略工厂。
 *
 * <p>在启动阶段把可用策略按 {@link AuthGrantType} 建立映射，运行时 O(1) 分发。
 */
@Component
public class AuthGrantStrategyFactory {

    /**
     * 授权类型到策略实例的映射。
     */
    private final Map<AuthGrantType, AuthGrantStrategy> strategyMap = new LinkedHashMap<>();

    /**
     * 初始化策略映射。
     *
     * @param strategies Spring 注入的全部策略实现
     */
    public AuthGrantStrategyFactory(List<AuthGrantStrategy> strategies) {
        // 关键逻辑：按枚举定义顺序选中首个 supports(type) 的策略，实现“单一类型唯一策略”约束。
        for (AuthGrantType type : AuthGrantType.values()) {
            for (AuthGrantStrategy strategy : strategies) {
                if (strategy.supports(type)) {
                    strategyMap.put(type, strategy);
                    break;
                }
            }
        }
    }

    /**
     * 根据授权类型获取对应策略。
     *
     * @param grantType 授权类型
     * @return 策略实例
     */
    public AuthGrantStrategy get(AuthGrantType grantType) {
        AuthGrantStrategy strategy = strategyMap.get(grantType);
        if (strategy == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported grant_type: " + grantType);
        }
        return strategy;
    }
}
