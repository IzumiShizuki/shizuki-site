package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.common.audit.util.SensitiveMasker;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.QuoteEntity;
import io.github.shizuki.site.content.mapper.QuoteMapper;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Administrator-only local library; edited content returns to draft review and is disabled. */
@Service
public class LocalQuoteCurationService {

    private static final String MANAGE_PERMISSION = "site.widgets.manage";
    private static final Pattern PROVIDER_PATTERN = Pattern.compile("[A-Z0-9_]{1,32}");
    private static final Set<String> LOCAL_PROVIDER_CODES = Set.of("LOCAL");

    private final QuoteMapper quoteMapper;
    private final SiteWidgetCacheInvalidator cacheInvalidator;

    public LocalQuoteCurationService(
        QuoteMapper quoteMapper,
        SiteWidgetCacheInvalidator cacheInvalidator
    ) {
        this.quoteMapper = quoteMapper;
        this.cacheInvalidator = cacheInvalidator;
    }

    @Transactional(rollbackFor = Exception.class)
    public QuoteEntity create(LocalQuoteCommand command) {
        requireAdministrator();
        ValidatedQuote validated = validate(command);
        QuoteEntity entity = toEntity(validated);
        entity.setApprovalStatus(QuoteApprovalStatus.DRAFT.name());
        entity.setEnabled(false);
        entity.setDeleted(0);
        entity.setVersion(0);
        if (quoteMapper.insert(entity) != 1) {
            throw conflict("local quote was not created", 0);
        }
        return entity;
    }

    @Transactional(rollbackFor = Exception.class)
    public QuoteEntity edit(long quoteId, int expectedVersion, LocalQuoteCommand command) {
        requireAdministrator();
        QuoteEntity current = requireQuote(quoteId);
        requireVersion(current, expectedVersion);
        ValidatedQuote validated = validate(command);
        int updated = quoteMapper.updateContentVersioned(
            quoteId,
            expectedVersion,
            validated.text(),
            validated.author(),
            validated.sourceTitle(),
            validated.categoryCode(),
            validated.providerCode(),
            validated.providerUuid(),
            validated.sourceUrl()
        );
        if (updated != 1) {
            throw latestConflict(quoteId);
        }
        QuoteEntity edited = toEntity(validated);
        edited.setId(quoteId);
        edited.setApprovalStatus(QuoteApprovalStatus.DRAFT.name());
        edited.setEnabled(false);
        edited.setDeleted(0);
        edited.setVersion(expectedVersion + 1);
        invalidateQuoteCache();
        return edited;
    }

    @Transactional(rollbackFor = Exception.class)
    public QuoteEntity review(
        long quoteId,
        int expectedVersion,
        String requestedStatus,
        boolean enabled
    ) {
        requireAdministrator();
        QuoteEntity current = requireQuote(quoteId);
        requireVersion(current, expectedVersion);
        QuoteApprovalStatus status;
        try {
            status = QuoteApprovalStatus.parse(requestedStatus);
        } catch (IllegalArgumentException exception) {
            throw badRequest(exception.getMessage());
        }
        if (enabled && status != QuoteApprovalStatus.APPROVED) {
            throw badRequest("only an approved quote may be enabled");
        }
        if (quoteMapper.reviewVersioned(quoteId, expectedVersion, status.name(), enabled ? 1 : 0) != 1) {
            throw latestConflict(quoteId);
        }
        current.setApprovalStatus(status.name());
        current.setEnabled(enabled);
        current.setVersion(expectedVersion + 1);
        invalidateQuoteCache();
        return current;
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(long quoteId, int expectedVersion) {
        requireAdministrator();
        QuoteEntity current = requireQuote(quoteId);
        requireVersion(current, expectedVersion);
        if (quoteMapper.softDeleteVersioned(quoteId, expectedVersion) != 1) {
            throw latestConflict(quoteId);
        }
        invalidateQuoteCache();
    }

    @Transactional(readOnly = true)
    public QuoteEntity get(long quoteId) {
        requireAdministrator();
        return requireQuote(quoteId);
    }

    @Transactional(readOnly = true)
    public List<QuoteEntity> list(int requestedLimit) {
        requireAdministrator();
        int limit = Math.max(1, Math.min(requestedLimit, 500));
        List<QuoteEntity> rows = quoteMapper.selectAdminList(limit);
        return rows == null ? List.of() : List.copyOf(rows);
    }

    private ValidatedQuote validate(LocalQuoteCommand command) {
        if (command == null) {
            throw badRequest("quote content is required");
        }
        String text = required(command.text(), 1000, "quote text");
        String author = optional(command.author(), 256, "quote author");
        String sourceTitle = optional(command.sourceTitle(), 256, "quote source title");
        String category = optional(command.categoryCode(), 64, "quote category");
        String provider = optional(command.providerCode(), 32, "quote provider");
        provider = provider == null ? "LOCAL" : provider.toUpperCase(Locale.ROOT);
        if (!PROVIDER_PATTERN.matcher(provider).matches()) {
            throw badRequest("quote provider code is invalid");
        }
        String providerUuid = optional(command.providerUuid(), 128, "quote provider identifier");
        String sourceUrl = optional(command.sourceUrl(), 1024, "quote source URL");
        if (!LOCAL_PROVIDER_CODES.contains(provider)) {
            if (providerUuid == null || sourceUrl == null) {
                throw badRequest("external quote provenance requires an identifier and HTTPS source URL");
            }
        }
        if (sourceUrl != null) {
            URI source;
            try {
                source = URI.create(sourceUrl);
            } catch (IllegalArgumentException exception) {
                throw badRequest("quote source URL must use HTTPS");
            }
            if (!"https".equalsIgnoreCase(source.getScheme())
                || source.getHost() == null
                || source.getUserInfo() != null
                || source.getFragment() != null
                || SensitiveMasker.REDACTED.equals(SensitiveMasker.maskText(sourceUrl))) {
                throw badRequest("quote source URL must be a safe HTTPS attribution link");
            }
            sourceUrl = source.toString();
        }
        return new ValidatedQuote(text, author, sourceTitle, category, provider, providerUuid, sourceUrl);
    }

    private QuoteEntity toEntity(ValidatedQuote value) {
        QuoteEntity entity = new QuoteEntity();
        entity.setText(value.text());
        entity.setAuthor(value.author());
        entity.setSourceTitle(value.sourceTitle());
        entity.setCategoryCode(value.categoryCode());
        entity.setProviderCode(value.providerCode());
        entity.setProviderUuid(value.providerUuid());
        entity.setSourceUrl(value.sourceUrl());
        return entity;
    }

    private QuoteEntity requireQuote(long quoteId) {
        if (quoteId <= 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Quote was not found");
        }
        QuoteEntity entity = quoteMapper.selectById(quoteId);
        if (entity == null || Integer.valueOf(1).equals(entity.getDeleted())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Quote was not found");
        }
        return entity;
    }

    private void requireVersion(QuoteEntity entity, int expectedVersion) {
        int currentVersion = entity.getVersion() == null ? 0 : entity.getVersion();
        if (expectedVersion < 0 || currentVersion != expectedVersion) {
            throw conflict("quote version changed", currentVersion);
        }
    }

    private BusinessException latestConflict(long quoteId) {
        QuoteEntity latest = quoteMapper.selectById(quoteId);
        int version = latest == null || latest.getVersion() == null ? 0 : latest.getVersion();
        return conflict("quote version changed", version);
    }

    private void invalidateQuoteCache() {
        cacheInvalidator.invalidate(new SiteWidgetCacheInvalidation(null, 0L, false, true));
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "site widget management permission is required");
        }
    }

    private String required(String value, int maxLength, String field) {
        String normalized = optional(value, maxLength, field);
        if (normalized == null) {
            throw badRequest(field + " is required");
        }
        return normalized;
    }

    private String optional(String value, int maxLength, String field) {
        if (value == null || value.isBlank()) {
            return null;
        }
        String normalized = value.trim();
        if (normalized.length() > maxLength) {
            throw badRequest(field + " exceeds its maximum length");
        }
        return normalized;
    }

    private BusinessException badRequest(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private BusinessException conflict(String message, int currentVersion) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            message,
            Map.of("currentVersion", currentVersion)
        );
    }

    private record ValidatedQuote(
        String text,
        String author,
        String sourceTitle,
        String categoryCode,
        String providerCode,
        String providerUuid,
        String sourceUrl
    ) {
    }
}
