package io.github.shizuki.site.ai.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.user.service.UserService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserQuotaGatewayTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserQuotaGateway userQuotaClient;

    @Test
    void shouldResolveQuotaByLocalService() {
        Set<String> groups = Set.of("USER");
        when(userService.resolveQuota("ai_round_total", groups, 5L)).thenReturn(9L);

        Long value = userQuotaClient.resolveQuota("ai_round_total", groups, 5L);

        assertThat(value).isEqualTo(9L);
    }

    @Test
    void shouldFallbackWhenLocalServiceThrows() {
        Set<String> groups = Set.of("USER");
        when(userService.resolveQuota("ai_round_total", groups, 5L))
            .thenThrow(new RuntimeException("boom"));

        Long value = userQuotaClient.resolveQuota("ai_round_total", groups, 5L);

        assertThat(value).isEqualTo(5L);
    }

    @Test
    void shouldUseDefaultFallbackWhenDefaultValueMissing() {
        Set<String> groups = Set.of("USER");
        when(userService.resolveQuota("ai_round_total", groups, 5L))
            .thenThrow(new RuntimeException("boom"));

        Long value = userQuotaClient.resolveQuota("ai_round_total", groups, null);

        assertThat(value).isEqualTo(5L);
    }
}
