package io.github.shizuki.common.security.aspect;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.security.service.AdminPrivilegeService;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

class AdminPrivilegeAspectTest {

    private final AdminPrivilegeService adminPrivilegeService = Mockito.mock(AdminPrivilegeService.class);
    private final AdminPrivilegeAspect aspect = new AdminPrivilegeAspect(adminPrivilegeService);

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
        RequestContextHolder.resetRequestAttributes();
    }

    @Test
    void shouldRejectWhenLoginMissing() {
        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> aspect.checkAdminPrivilege(null)
        );
        Assertions.assertEquals(ErrorCode.UNAUTHORIZED, ex.getErrorCode());
    }

    @Test
    void shouldRejectWhenPrivilegeNotUnlocked() {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        Mockito.when(adminPrivilegeService.isUnlocked(Mockito.any(), Mockito.anyString())).thenReturn(false);
        Mockito.when(adminPrivilegeService.getUnlockTtlSeconds()).thenReturn(1800L);

        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> aspect.checkAdminPrivilege(null)
        );
        Assertions.assertEquals(ErrorCode.FORBIDDEN, ex.getErrorCode());
        Assertions.assertEquals("ADMIN_PRIVILEGE_REQUIRED", ex.getDetails().get("reason"));
    }

    @Test
    void shouldPassWhenPrivilegeUnlocked() {
        LoginUserContext.set(new LoginUser(1L, Set.of("ADMIN"), Set.of()));
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader("Authorization", "Bearer abc123");
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        Mockito.when(adminPrivilegeService.isUnlocked(Mockito.any(), Mockito.eq("Bearer abc123"))).thenReturn(true);

        Assertions.assertDoesNotThrow(() -> aspect.checkAdminPrivilege(null));
    }
}
