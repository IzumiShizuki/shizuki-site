package io.github.shizuki.common.audit.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.JdbcTemplate;

class AuditLogQueryControllerTest {

    @Mock
    private ObjectProvider<JdbcTemplate> jdbcTemplateProvider;

    @Mock
    private JdbcTemplate jdbcTemplate;

    private AuditLogQueryController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new AuditLogQueryController(jdbcTemplateProvider);
    }

    @Test
    void shouldReturnPagedResultWhenJdbcTemplateAvailable() {
        Mockito.when(jdbcTemplateProvider.getIfAvailable()).thenReturn(jdbcTemplate);
        Mockito.when(jdbcTemplate.queryForObject(
            ArgumentMatchers.any(String.class),
            ArgumentMatchers.any(Object[].class),
            ArgumentMatchers.eq(Long.class)
        )).thenReturn(1L);
        Mockito.when(jdbcTemplate.queryForList(
            ArgumentMatchers.any(String.class),
            ArgumentMatchers.any(Object[].class)
        ))
            .thenReturn(List.of(Map.of("id", 1L, "trace_id", "trace-001")));

        ApiResponse<PageResponse<Map<String, Object>>> response = controller.list(
            "trace-001",
            1L,
            "oauth.token.exchange",
            null,
            null,
            1L,
            20L
        );

        Assertions.assertEquals("OK", response.code());
        Assertions.assertEquals(1L, response.data().total());
        Assertions.assertFalse(response.data().items().isEmpty());
        Mockito.verify(jdbcTemplate).queryForObject(
            ArgumentMatchers.any(String.class),
            ArgumentMatchers.any(Object[].class),
            ArgumentMatchers.eq(Long.class)
        );
        Mockito.verify(jdbcTemplate).queryForList(
            ArgumentMatchers.any(String.class),
            ArgumentMatchers.any(Object[].class)
        );
    }
}
