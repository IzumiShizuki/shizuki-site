package io.github.shizuki.site.monolith.ops;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.admin.entity.MeguriPromptCacheMetricsEntity;
import io.github.shizuki.site.admin.request.MeguriPromptCacheMetricsRequest;
import io.github.shizuki.site.admin.response.AdminPromptCacheMetricsResponse;
import io.github.shizuki.site.admin.response.MeguriPromptCacheIngestResponse;
import io.github.shizuki.site.monolith.config.MeguriPromptCacheMetricsProperties;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/** Authenticates, persists, and serves content-free Meguri cache telemetry. */
@Service
public class MeguriPromptCacheMetricsService {
    private final MeguriPromptCacheMetricsMapper metricsMapper;
    private final MeguriPromptCacheMetricsProperties properties;
    private final ObjectMapper objectMapper;
    private final Clock clock;

    public MeguriPromptCacheMetricsService(MeguriPromptCacheMetricsMapper metricsMapper,
                                           MeguriPromptCacheMetricsProperties properties,
                                           ObjectMapper objectMapper) {
        this(metricsMapper, properties, objectMapper, Clock.systemUTC());
    }

    MeguriPromptCacheMetricsService(MeguriPromptCacheMetricsMapper metricsMapper,
                                    MeguriPromptCacheMetricsProperties properties,
                                    ObjectMapper objectMapper,
                                    Clock clock) {
        this.metricsMapper = metricsMapper;
        this.properties = properties;
        this.objectMapper = objectMapper;
        this.clock = clock.withZone(ZoneOffset.UTC);
    }

    @Transactional
    public MeguriPromptCacheIngestResponse ingest(MeguriPromptCacheMetricsRequest request, String suppliedToken) {
        requireValidToken(suppliedToken);
        validateSnapshot(request);
        LocalDateTime now = LocalDateTime.now(clock);
        MeguriPromptCacheMetricsEntity entity = metricsMapper.selectOne(
            new LambdaQueryWrapper<MeguriPromptCacheMetricsEntity>()
                .eq(MeguriPromptCacheMetricsEntity::getSourceId, request.sourceId())
                .last("LIMIT 1")
        );
        boolean create = entity == null;
        if (create) {
            entity = new MeguriPromptCacheMetricsEntity();
            entity.setSourceId(request.sourceId().trim());
            entity.setCreatedAt(now);
            entity.setDeleted(0);
            entity.setVersion(0);
        }
        entity.setObservedAt(request.observedAt().trim());
        entity.setReceivedAt(now);
        entity.setUpdatedAt(now);
        try {
            entity.setPayloadJson(objectMapper.writeValueAsString(request));
        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Meguri metrics payload is not serializable");
        }
        if (create) {
            metricsMapper.insert(entity);
        } else {
            metricsMapper.updateById(entity);
        }
        return new MeguriPromptCacheIngestResponse(entity.getSourceId(), now.toInstant(ZoneOffset.UTC).toString());
    }

    public AdminPromptCacheMetricsResponse latest() {
        MeguriPromptCacheMetricsEntity entity = metricsMapper.selectOne(
            new LambdaQueryWrapper<MeguriPromptCacheMetricsEntity>()
                .orderByDesc(MeguriPromptCacheMetricsEntity::getReceivedAt)
                .last("LIMIT 1")
        );
        if (entity == null) {
            return new AdminPromptCacheMetricsResponse(false, "", 0L, true, Map.of());
        }
        Map<String, Object> metrics;
        try {
            metrics = objectMapper.readValue(entity.getPayloadJson(), new TypeReference<LinkedHashMap<String, Object>>() {});
        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Stored Meguri metrics payload is invalid");
        }
        Instant receivedAt = entity.getReceivedAt().toInstant(ZoneOffset.UTC);
        long ageSeconds = Math.max(0L, Duration.between(receivedAt, Instant.now(clock)).getSeconds());
        return new AdminPromptCacheMetricsResponse(
            true,
            receivedAt.toString(),
            ageSeconds,
            ageSeconds > properties.getStaleAfterSeconds(),
            metrics
        );
    }

    private void requireValidToken(String suppliedToken) {
        String expected = properties.getIngestToken();
        if (!StringUtils.hasText(expected)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Meguri metrics ingest is not configured");
        }
        byte[] expectedBytes = expected.getBytes(StandardCharsets.UTF_8);
        byte[] suppliedBytes = (suppliedToken == null ? "" : suppliedToken.trim()).getBytes(StandardCharsets.UTF_8);
        if (!MessageDigest.isEqual(expectedBytes, suppliedBytes)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Invalid Meguri metrics token");
        }
    }

    private void validateSnapshot(MeguriPromptCacheMetricsRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Meguri metrics payload is required");
        }
        try {
            Instant.parse(request.observedAt());
            Instant.parse(request.collectingSince());
        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Meguri metrics timestamps must be ISO-8601 instants");
        }
        validateRate(request.cacheHitRate(), "cacheHitRate");
        validateRate(request.usageCoverageRate(), "usageCoverageRate");
        if (request.successfulRequests() + request.failedRequests() > request.totalRequests()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Meguri metrics request totals are inconsistent");
        }
    }

    private void validateRate(Double value, String field) {
        if (value != null && (!Double.isFinite(value) || value < 0.0 || value > 1.0)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, field + " must be between 0 and 1");
        }
    }
}
