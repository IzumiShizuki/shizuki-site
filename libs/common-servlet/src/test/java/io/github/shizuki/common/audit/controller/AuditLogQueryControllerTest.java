package io.github.shizuki.common.audit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
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
        when(jdbcTemplateProvider.getIfAvailable()).thenReturn(jdbcTemplate);
        when(jdbcTemplate.queryForObject(any(String.class), any(Object[].class), eq(Long.class))).thenReturn(1L);
        when(jdbcTemplate.queryForList(any(String.class), any(Object[].class)))
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

        assertEquals("OK", response.code());
        assertEquals(1L, response.data().total());
        assertFalse(response.data().items().isEmpty());
        verify(jdbcTemplate).queryForObject(any(String.class), any(Object[].class), eq(Long.class));
        verify(jdbcTemplate).queryForList(any(String.class), any(Object[].class));
    }
}
