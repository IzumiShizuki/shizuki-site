package io.github.shizuki.common.audit.controller;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.annotation.RequireGroup;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/audit-logs")
@RequireGroup("ADMIN")
public class AuditLogQueryController {

    private final ObjectProvider<JdbcTemplate> jdbcTemplateProvider;

    public AuditLogQueryController(ObjectProvider<JdbcTemplate> jdbcTemplateProvider) {
        this.jdbcTemplateProvider = jdbcTemplateProvider;
    }

    @GetMapping
    public ApiResponse<PageResponse<Map<String, Object>>> list(
        @RequestParam(value = "trace_id", required = false) String traceId,
        @RequestParam(value = "user_id", required = false) Long userId,
        @RequestParam(value = "action", required = false) String action,
        @RequestParam(value = "start_at", required = false) LocalDateTime startAt,
        @RequestParam(value = "end_at", required = false) LocalDateTime endAt,
        @RequestParam(value = "page_no", defaultValue = "1") long pageNo,
        @RequestParam(value = "page_size", defaultValue = "20") long pageSize
    ) {
        JdbcTemplate jdbcTemplate = jdbcTemplateProvider.getIfAvailable();
        if (jdbcTemplate == null) {
            return ApiResponse.success(PageResponse.of(List.of(), 0, pageNo, pageSize));
        }

        StringBuilder where = new StringBuilder(" WHERE 1=1 ");
        List<Object> args = new ArrayList<>();

        if (StringUtils.hasText(traceId)) {
            where.append(" AND trace_code = ? ");
            args.add(traceId);
        }
        if (userId != null) {
            where.append(" AND user_id = ? ");
            args.add(userId);
        }
        if (StringUtils.hasText(action)) {
            where.append(" AND action_code = ? ");
            args.add(action);
        }
        if (startAt != null) {
            where.append(" AND create_time >= ? ");
            args.add(Timestamp.valueOf(startAt));
        }
        if (endAt != null) {
            where.append(" AND create_time <= ? ");
            args.add(Timestamp.valueOf(endAt));
        }

        String countSql = "SELECT COUNT(1) FROM AUD_LOG" + where;
        Long total = jdbcTemplate.queryForObject(countSql, args.toArray(), Long.class);

        long offset = (pageNo - 1) * pageSize;
        String dataSql = "SELECT id, trace_code AS trace_id, user_id, action_code AS action_name, "
            + "resource_code AS resource_name, result_status AS result, error_code, cost_value AS cost_ms, "
            + "create_time AS created_at "
            + "FROM AUD_LOG" + where + " ORDER BY id DESC LIMIT ? OFFSET ?";

        List<Object> dataArgs = new ArrayList<>(args);
        dataArgs.add(pageSize);
        dataArgs.add(offset);

        List<Map<String, Object>> items = jdbcTemplate.queryForList(dataSql, dataArgs.toArray());
        return ApiResponse.success(PageResponse.of(items, total == null ? 0 : total, pageNo, pageSize));
    }
}
