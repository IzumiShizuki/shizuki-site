package io.github.shizuki.common.security.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AclChecker;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PermissionAspect {

    private final ObjectProvider<AclChecker> aclCheckerProvider;

    public PermissionAspect(ObjectProvider<AclChecker> aclCheckerProvider) {
        this.aclCheckerProvider = aclCheckerProvider;
    }

    @Before("@annotation(requirePermission)")
    public void checkPermission(JoinPoint joinPoint, RequirePermission requirePermission) {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
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

    @Before("@annotation(requireGroup)")
    public void checkGroup(JoinPoint joinPoint, RequireGroup requireGroup) {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        AclChecker aclChecker = aclCheckerProvider.getIfAvailable();
        boolean inGroup = aclChecker == null
            ? loginUser.inGroup(requireGroup.value())
            : aclChecker.inGroup(loginUser, requireGroup.value());

        if (!inGroup) {
            throw new BusinessException(ErrorCode.FORBIDDEN,
                "Group required: " + requireGroup.value());
        }
    }
}
