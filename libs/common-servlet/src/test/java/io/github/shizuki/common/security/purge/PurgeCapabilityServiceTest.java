package io.github.shizuki.common.security.purge;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

class PurgeCapabilityServiceTest {

    private StringRedisTemplate redis;
    private ValueOperations<String, String> values;
    private PurgeCapabilityService service;

    @BeforeEach
    @SuppressWarnings("unchecked")
    void setUp() {
        redis = Mockito.mock(StringRedisTemplate.class);
        values = Mockito.mock(ValueOperations.class);
        when(redis.opsForValue()).thenReturn(values);
        when(values.setIfAbsent(anyString(), anyString(), any(Duration.class))).thenReturn(true);
        service = new PurgeCapabilityService(
            redis,
            new SecureRandom(new byte[] {1, 2, 3}),
            Clock.fixed(Instant.parse("2026-08-29T08:00:00Z"), ZoneOffset.UTC),
            Duration.ofMinutes(5)
        );
        LoginUserContext.set(new LoginUser(9L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void bindsOpaqueGrantToAdministratorTargetVersionAndExpiry() {
        PurgeCapabilityGrant grant = service.issue("album", 7L, 4);
        ArgumentCaptor<String> value = ArgumentCaptor.forClass(String.class);
        verify(values).setIfAbsent(anyString(), value.capture(), any(Duration.class));
        when(values.getAndDelete(anyString())).thenReturn(value.getValue());

        service.consume(grant.capability(), "ALBUM", 7L, 4);

        assertThat(grant.expiresAt()).isEqualTo(Instant.parse("2026-08-29T08:05:00Z"));
        verify(values).getAndDelete(anyString());
    }

    @Test
    void rejectsReplayChangedTargetAndChangedAdministrator() {
        PurgeCapabilityGrant grant = service.issue("MOMENT", 8L, 2);
        ArgumentCaptor<String> value = ArgumentCaptor.forClass(String.class);
        verify(values).setIfAbsent(anyString(), value.capture(), any(Duration.class));

        when(values.getAndDelete(anyString())).thenReturn(value.getValue(), null, value.getValue());
        service.consume(grant.capability(), "MOMENT", 8L, 2);
        assertThatThrownBy(() -> service.consume(grant.capability(), "MOMENT", 8L, 2))
            .isInstanceOf(BusinessException.class);
        LoginUserContext.set(new LoginUser(10L, Set.of("ADMIN"), Set.of("life.content.manage")));
        assertThatThrownBy(() -> service.consume(grant.capability(), "MOMENT", 9L, 2))
            .isInstanceOf(BusinessException.class);
    }

    @Test
    void failsClosedWhenRedisIsUnavailable() {
        when(values.setIfAbsent(anyString(), anyString(), any(Duration.class)))
            .thenThrow(new IllegalStateException("redis down"));
        assertThatThrownBy(() -> service.issue("PHOTO", 7L, 1))
            .isInstanceOf(BusinessException.class);
    }

    @Test
    @SuppressWarnings("unchecked")
    void rejectsExpiredGrantEvenWhenRedisStillReturnsItsClaims() {
        Clock movingClock = Mockito.mock(Clock.class);
        Instant issuedAt = Instant.parse("2026-08-29T08:00:00Z");
        when(movingClock.instant()).thenReturn(issuedAt, issuedAt.plus(Duration.ofMinutes(6)));
        StringRedisTemplate localRedis = Mockito.mock(StringRedisTemplate.class);
        ValueOperations<String, String> localValues = Mockito.mock(ValueOperations.class);
        when(localRedis.opsForValue()).thenReturn(localValues);
        when(localValues.setIfAbsent(anyString(), anyString(), any(Duration.class))).thenReturn(true);
        PurgeCapabilityService expiringService = new PurgeCapabilityService(
            localRedis,
            new SecureRandom(new byte[] {4, 5, 6}),
            movingClock,
            Duration.ofMinutes(5)
        );
        ArgumentCaptor<String> claims = ArgumentCaptor.forClass(String.class);

        PurgeCapabilityGrant grant = expiringService.issue("PHOTO", 7L, 3);
        verify(localValues).setIfAbsent(anyString(), claims.capture(), any(Duration.class));
        when(localValues.getAndDelete(anyString())).thenReturn(claims.getValue());

        assertThatThrownBy(() -> expiringService.consume(grant.capability(), "PHOTO", 7L, 3))
            .isInstanceOf(BusinessException.class);
    }
}
