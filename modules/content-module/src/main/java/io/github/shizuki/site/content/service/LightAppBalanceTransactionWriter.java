package io.github.shizuki.site.content.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LightAppBalanceAccountEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceTransactionEntity;
import io.github.shizuki.site.content.mapper.LightAppBalanceAccountMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceTransactionMapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Objects;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Component
public class LightAppBalanceTransactionWriter {

    private static final String BASE_CURRENCY_CNY = "CNY";
    private static final String DIRECTION_INCOME = "INCOME";
    private static final String DIRECTION_EXPENSE = "EXPENSE";

    private final LightAppBalanceAccountMapper balanceAccountMapper;
    private final LightAppBalanceTransactionMapper balanceTransactionMapper;

    public LightAppBalanceTransactionWriter(LightAppBalanceAccountMapper balanceAccountMapper,
                                           LightAppBalanceTransactionMapper balanceTransactionMapper) {
        this.balanceAccountMapper = balanceAccountMapper;
        this.balanceTransactionMapper = balanceTransactionMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceTransactionEntity createImportedTransaction(Long userId,
                                                                     Long accountId,
                                                                     String direction,
                                                                     BigDecimal amount,
                                                                     String currencyCode,
                                                                     String category,
                                                                     String note,
                                                                     LocalDateTime occurredAt) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        LightAppBalanceAccountEntity account = requireBalanceAccount(userId, accountId);
        String normalizedDirection = normalizeDirection(direction);
        BigDecimal normalizedAmount = normalizeMoney(amount, "amount");
        String normalizedCurrency = normalizeCurrencyCode(currencyCode, account.getCurrencyCode());
        if (!Objects.equals(account.getCurrencyCode(), normalizedCurrency)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Account currency does not match transaction currency");
        }
        if (occurredAt == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "occurred_at is required");
        }

        LightAppBalanceTransactionEntity entity = new LightAppBalanceTransactionEntity();
        entity.setUserId(userId);
        entity.setAccountId(accountId);
        entity.setDirectionCode(normalizedDirection);
        entity.setAmount(normalizedAmount);
        entity.setCurrencyCode(normalizedCurrency);
        entity.setCategory(normalizeOptionalText(category));
        entity.setNote(normalizeOptionalText(note));
        entity.setOccurredAt(occurredAt);
        entity.setRecurringChargeId(null);
        entity.setRecurringInstanceAt(null);
        entity.setSortNum(resolveNextSortNum(userId));
        balanceTransactionMapper.insert(entity);

        BigDecimal delta = DIRECTION_INCOME.equals(normalizedDirection) ? normalizedAmount : normalizedAmount.negate();
        BigDecimal nextBalance = safeAmount(account.getBalanceAmount()).add(delta).setScale(4, RoundingMode.HALF_UP);
        account.setBalanceAmount(nextBalance);
        balanceAccountMapper.updateById(account);
        return entity;
    }

    private LightAppBalanceAccountEntity requireBalanceAccount(Long userId, Long accountId) {
        if (accountId == null || accountId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "target_account_id is required");
        }
        LightAppBalanceAccountEntity entity = balanceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getId, accountId)
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Balance account not found");
        }
        return entity;
    }

    private Integer resolveNextSortNum(Long userId) {
        Integer maxSortNum = balanceTransactionMapper.selectMaxSortNumByUserId(userId);
        return (maxSortNum == null ? 0 : maxSortNum) + 10;
    }

    private String normalizeDirection(String raw) {
        String normalized = String.valueOf(raw == null ? DIRECTION_EXPENSE : raw).trim().toUpperCase(Locale.ROOT);
        if (DIRECTION_INCOME.equals(normalized) || DIRECTION_EXPENSE.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported transaction direction");
    }

    private BigDecimal normalizeMoney(BigDecimal raw, String fieldName) {
        if (raw == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " is required");
        }
        if (raw.compareTo(BigDecimal.ZERO) <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, fieldName + " must be greater than zero");
        }
        return raw.setScale(4, RoundingMode.HALF_UP);
    }

    private String normalizeCurrencyCode(String raw, String fallback) {
        String normalized = String.valueOf(StringUtils.hasText(raw) ? raw : fallback).trim().toUpperCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : BASE_CURRENCY_CNY;
    }

    private String normalizeOptionalText(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        return StringUtils.hasText(normalized) ? normalized : null;
    }

    private BigDecimal safeAmount(BigDecimal raw) {
        return raw == null ? BigDecimal.ZERO.setScale(4, RoundingMode.HALF_UP) : raw.setScale(4, RoundingMode.HALF_UP);
    }
}
