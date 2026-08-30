package io.github.shizuki.site.content.config;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Keeps staged studio endpoints unavailable until the personal-content studio feature is enabled.
 */
@Aspect
@Component
public class PersonalContentStudioFeatureAspect {

    private final PersonalContentFeatureProperties featureProperties;

    public PersonalContentStudioFeatureAspect(PersonalContentFeatureProperties featureProperties) {
        this.featureProperties = featureProperties;
    }

    @Before("@within(io.github.shizuki.site.content.annotation.RequirePersonalContentStudio)"
        + " || @annotation(io.github.shizuki.site.content.annotation.RequirePersonalContentStudio)")
    public void requireStudioAvailable(JoinPoint joinPoint) {
        if (!featureProperties.isStudioAvailable()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "Personal content studio is disabled");
        }
    }
}
