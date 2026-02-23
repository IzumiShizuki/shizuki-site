package io.github.shizuki.common.security.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.annotation.RequireAdminPrivilege;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 管理员敏感操作二次验证切面。
 */
@Aspect
@Component
public class AdminPrivilegeAspect {

    private final AdminPrivilegeService adminPrivilegeService;

    public AdminPrivilegeAspect(AdminPrivilegeService adminPrivilegeService) {
        this.adminPrivilegeService = adminPrivilegeService;
    }

    @Before("@annotation(requireAdminPrivilege)")
    public void checkAdminPrivilege(RequireAdminPrivilege requireAdminPrivilege) {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }

        String authorizationHeader = resolveAuthorizationHeader();
        if (adminPrivilegeService.isUnlocked(loginUser, authorizationHeader)) {
            return;
        }

        throw new BusinessException(
            ErrorCode.FORBIDDEN,
            "Admin privilege verification required",
            Map.of(
                "reason", "ADMIN_PRIVILEGE_REQUIRED",
                "privilege_ttl_seconds", adminPrivilegeService.getUnlockTtlSeconds()
            )
        );
    }

    private String resolveAuthorizationHeader() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return "";
        }
        HttpServletRequest request = attributes.getRequest();
        if (request == null) {
            return "";
        }
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);
        return header == null ? "" : header;
    }
}
