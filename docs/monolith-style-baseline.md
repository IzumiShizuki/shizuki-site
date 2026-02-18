# Monolith Style Baseline

## Package Prefixes
```
io.github.shizuki.common.audit
io.github.shizuki.common.core
io.github.shizuki.common.oauth
io.github.shizuki.common.ratelimit
io.github.shizuki.common.security
io.github.shizuki.common.storage
io.github.shizuki.common.web
io.github.shizuki.common.xss
io.github.shizuki.site.ai
io.github.shizuki.site.content
io.github.shizuki.site.gateway
io.github.shizuki.site.media
io.github.shizuki.site.user
```

## Comment Baseline
- Java comment markers found: 1104
- Current code uses Chinese comments and JavaDoc heavily; keep this convention.

## Annotation Usage Sample
```
libs/common-core/src/main/java/io/github/shizuki/common/core/time/SystemClockProvider.java:9:@Component
services/gateway-service/src/main/java/io/github/shizuki/site/gateway/filter/TraceIdGatewayFilter.java:10:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/xss/service/HtmlSanitizerService.java:7:@Component
services/gateway-service/src/main/java/io/github/shizuki/site/gateway/filter/AuthGatewayFilter.java:32:@Component
libs/common-core/src/main/java/io/github/shizuki/common/core/security/SecretValueValidator.java:11:@Component
services/gateway-service/src/main/java/io/github/shizuki/site/gateway/config/GatewayAuthProperties.java:9:@Component
services/gateway-service/src/main/java/io/github/shizuki/site/gateway/config/GatewayAuthProperties.java:10:@ConfigurationProperties(prefix = "shizuki.gateway.auth")
libs/common-servlet/src/main/java/io/github/shizuki/common/web/filter/TraceIdFilter.java:13:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/web/filter/RequestIdFilter.java:12:@Component
libs/common-integration/src/main/java/io/github/shizuki/common/storage/config/OssProperties.java:6:@Component
libs/common-integration/src/main/java/io/github/shizuki/common/storage/config/OssProperties.java:7:@ConfigurationProperties(prefix = "shizuki.oss")
libs/common-servlet/src/main/java/io/github/shizuki/common/ratelimit/aspect/RateLimitAspect.java:22:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/web/config/WebMvcConfig.java:10:@Configuration
libs/common-servlet/src/main/java/io/github/shizuki/common/web/exception/GlobalExceptionHandler.java:16:@RestControllerAdvice
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/task/AuditOutboxRetryTask.java:11:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/ratelimit/service/InMemoryQuotaService.java:7:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/config/AuditPublisherProperties.java:11:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/config/AuditPublisherProperties.java:12:@ConfigurationProperties(prefix = "shizuki.audit.publisher")
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/LoggingAuditLogService.java:11:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/security/filter/LoginUserContextFilter.java:17:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/config/AuditOutboxSchedulingConfiguration.java:11:@Configuration
libs/common-core/src/main/java/io/github/shizuki/common/core/resilience/SpringRetryExecutor.java:17:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/JdbcAuditLogService.java:19:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/config/AuditOutboxProperties.java:11:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/config/AuditOutboxProperties.java:12:@ConfigurationProperties(prefix = "shizuki.audit.outbox")
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/aspect/AuditLogAspect.java:21:@Component
libs/common-integration/src/main/java/io/github/shizuki/common/storage/client/AliyunOssClient.java:23:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/impl/NoopAuditOutboxPublisher.java:14:@Component
services/ai-service/src/main/java/io/github/shizuki/site/ai/service/impl/AiServiceImpl.java:28:@Service
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/controller/AuditLogQueryController.java:24:@RestController
services/ai-service/src/main/java/io/github/shizuki/site/ai/mapper/AiSessionMapper.java:7:@Mapper
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/impl/KafkaAuditOutboxPublisher.java:15:@Component
services/content-service/src/main/java/io/github/shizuki/site/content/service/impl/ContentServiceImpl.java:35:@Service
libs/common-servlet/src/main/java/io/github/shizuki/common/security/aspect/PermissionAspect.java:17:@Component
services/ai-service/src/main/java/io/github/shizuki/site/ai/mapper/AiQuotaUsageMapper.java:7:@Mapper
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/impl/JdbcAuditOutboxServiceImpl.java:24:@Service
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/AuditOutboxPublisherRouter.java:19:@Service
services/ai-service/src/main/java/io/github/shizuki/site/ai/mapper/AiMessageMapper.java:7:@Mapper
libs/common-integration/src/main/java/io/github/shizuki/common/oauth/strategy/OAuthProviderStrategyFactory.java:17:@Component
libs/common-servlet/src/main/java/io/github/shizuki/common/audit/service/impl/ElkAuditOutboxPublisher.java:14:@Component
```

## Naming & Layering Snapshot
- Preserve package root: `io.github.shizuki.site.*`
- Preserve controller/service/mapper/entity/dto layering and file naming.
- Preserve `ApiResponse` / `BusinessException` / `ErrorCode` error style.

## Migration Writing Rules
- Prefer copy/move + small adaptation.
- Avoid renaming DTO fields or changing public path contract.
- Keep existing Chinese inline comments and JavaDoc density.
