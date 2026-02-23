package io.github.shizuki.common.security.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.config.AdminPrivilegeProperties;
import io.github.shizuki.common.security.model.LoginUser;
import java.time.Duration;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.crypto.bcrypt.BCrypt;

class AdminPrivilegeServiceTest {

    private StringRedisTemplate redisTemplate;
    private ValueOperations<String, String> valueOperations;
    private AdminPrivilegeProperties properties;
    private AdminPrivilegeService service;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redisTemplate = Mockito.mock(StringRedisTemplate.class);
        valueOperations = Mockito.mock(ValueOperations.class);
        Mockito.when(redisTemplate.opsForValue()).thenReturn(valueOperations);

        properties = new AdminPrivilegeProperties();
        properties.setUnlockTtlSeconds(1800);
        properties.setCodePlain("Izumi2486");
        service = new AdminPrivilegeService(redisTemplate, properties);
    }

    @Test
    void shouldVerifyAndUnlockWithPlainCode() {
        LoginUser loginUser = new LoginUser(7L, Set.of("ADMIN"), Set.of());

        service.verifyAndUnlock(loginUser, "Bearer mock-token", "Izumi2486");

        Mockito.verify(valueOperations).set(
            ArgumentMatchers.contains("admin:privilege:unlock:7:"),
            ArgumentMatchers.eq("1"),
            ArgumentMatchers.eq(Duration.ofSeconds(1800))
        );
    }

    @Test
    void shouldVerifyAndUnlockWithHashCode() {
        properties.setCodePlain("");
        properties.setCodeHash(BCrypt.hashpw("Izumi2486", BCrypt.gensalt()));
        LoginUser loginUser = new LoginUser(9L, Set.of("ADMIN"), Set.of());

        service.verifyAndUnlock(loginUser, "Bearer mock-token", "Izumi2486");

        Mockito.verify(valueOperations).set(
            ArgumentMatchers.contains("admin:privilege:unlock:9:"),
            ArgumentMatchers.eq("1"),
            ArgumentMatchers.eq(Duration.ofSeconds(1800))
        );
    }

    @Test
    void shouldRejectWhenCodeMismatch() {
        LoginUser loginUser = new LoginUser(7L, Set.of("ADMIN"), Set.of());

        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> service.verifyAndUnlock(loginUser, "Bearer mock-token", "wrong")
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, ex.getErrorCode());
    }

    @Test
    void shouldRejectWhenNotAdmin() {
        LoginUser loginUser = new LoginUser(7L, Set.of("USER"), Set.of());

        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> service.verifyAndUnlock(loginUser, "Bearer mock-token", "Izumi2486")
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, ex.getErrorCode());
    }

    @Test
    void shouldReportUnlockedByRedisKey() {
        LoginUser loginUser = new LoginUser(7L, Set.of("ADMIN"), Set.of());
        Mockito.when(redisTemplate.hasKey(ArgumentMatchers.anyString())).thenReturn(true);

        boolean unlocked = service.isUnlocked(loginUser, "Bearer token");

        Assertions.assertTrue(unlocked);
    }
}
