package io.github.shizuki.common.security.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AclChecker;
import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.core.BridgeMethodResolver;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PermissionAspect {

    private final ObjectProvider<AclChecker> aclCheckerProvider;

    public PermissionAspect(ObjectProvider<AclChecker> aclCheckerProvider) {
        this.aclCheckerProvider = aclCheckerProvider;
    }

    @Before("@within(io.github.shizuki.common.security.annotation.RequireGroup)"
        + " || @annotation(io.github.shizuki.common.security.annotation.RequireGroup)"
        + " || @within(io.github.shizuki.common.security.annotation.RequirePermission)"
        + " || @annotation(io.github.shizuki.common.security.annotation.RequirePermission)")
    public void checkAuthorization(JoinPoint joinPoint) {
        AuthorizationRequirements requirements = resolveRequirements(joinPoint);
        if (requirements.group() == null && requirements.permission() == null) {
            return;
        }

        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        if (requirements.group() != null) {
            checkGroup(loginUser, requirements.group());
        }
        if (requirements.permission() != null) {
            checkPermission(loginUser, requirements.permission());
        }
    }

    private void checkPermission(LoginUser loginUser, RequirePermission requirePermission) {
        if (loginUser.inGroup("ADMIN")) {
            return;
        }

        AclChecker aclChecker = aclCheckerProvider.getIfAvailable();
        boolean permitted = aclChecker == null
            ? loginUser.hasPermission(requirePermission.value())
            : aclChecker.hasPermission(loginUser, requirePermission.value());

        if (!permitted) {
            throw new BusinessException(ErrorCode.FORBIDDEN,
                "Permission denied: " + requirePermission.value());
        }
    }

    private void checkGroup(LoginUser loginUser, RequireGroup requireGroup) {
        AclChecker aclChecker = aclCheckerProvider.getIfAvailable();
        boolean inGroup = aclChecker == null
            ? loginUser.inGroup(requireGroup.value())
            : aclChecker.inGroup(loginUser, requireGroup.value());

        if (!inGroup) {
            throw new BusinessException(ErrorCode.FORBIDDEN,
                "Group required: " + requireGroup.value());
        }
    }

    private AuthorizationRequirements resolveRequirements(JoinPoint joinPoint) {
        if (!(joinPoint.getSignature() instanceof MethodSignature methodSignature)) {
            return AuthorizationRequirements.NONE;
        }

        Method signatureMethod = methodSignature.getMethod();
        Class<?> targetClass = joinPoint.getTarget() == null
            ? signatureMethod.getDeclaringClass()
            : AopUtils.getTargetClass(joinPoint.getTarget());
        Method targetMethod = BridgeMethodResolver.findBridgedMethod(
            AopUtils.getMostSpecificMethod(signatureMethod, targetClass)
        );

        RequireGroup methodGroup = findMethodAnnotation(
            targetMethod,
            signatureMethod,
            RequireGroup.class
        );
        RequirePermission methodPermission = findMethodAnnotation(
            targetMethod,
            signatureMethod,
            RequirePermission.class
        );
        RequireGroup classGroup = AnnotatedElementUtils.findMergedAnnotation(targetClass, RequireGroup.class);
        RequirePermission classPermission = AnnotatedElementUtils.findMergedAnnotation(
            targetClass,
            RequirePermission.class
        );

        return new AuthorizationRequirements(
            methodGroup == null ? classGroup : methodGroup,
            methodPermission == null ? classPermission : methodPermission
        );
    }

    private <A extends java.lang.annotation.Annotation> A findMethodAnnotation(
        Method targetMethod,
        Method signatureMethod,
        Class<A> annotationType
    ) {
        A annotation = AnnotatedElementUtils.findMergedAnnotation(targetMethod, annotationType);
        if (annotation == null && !targetMethod.equals(signatureMethod)) {
            annotation = AnnotatedElementUtils.findMergedAnnotation(signatureMethod, annotationType);
        }
        return annotation;
    }

    private record AuthorizationRequirements(
        RequireGroup group,
        RequirePermission permission
    ) {
        private static final AuthorizationRequirements NONE = new AuthorizationRequirements(null, null);
    }
}
