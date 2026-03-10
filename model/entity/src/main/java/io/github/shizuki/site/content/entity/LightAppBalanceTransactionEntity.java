package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_TRANSACTION")
public class LightAppBalanceTransactionEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("account_id")
    private Long accountId;

    @TableField("direction_code")
    private String directionCode;

    @TableField("amount_value")
    private BigDecimal amount;

    @TableField("currency_code")
    private String currencyCode;

    @TableField("category_text")
    private String category;

    @TableField("note_text")
    private String note;

    @TableField("occurred_datetime")
    private LocalDateTime occurredAt;

    @TableField("recurring_charge_id")
    private Long recurringChargeId;

    @TableField("recurring_instance_datetime")
    private LocalDateTime recurringInstanceAt;

    @TableField("sort_num")
    private Integer sortNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(String directionCode) {
        this.directionCode = directionCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }

    public Long getRecurringChargeId() {
        return recurringChargeId;
    }

    public void setRecurringChargeId(Long recurringChargeId) {
        this.recurringChargeId = recurringChargeId;
    }

    public LocalDateTime getRecurringInstanceAt() {
        return recurringInstanceAt;
    }

    public void setRecurringInstanceAt(LocalDateTime recurringInstanceAt) {
        this.recurringInstanceAt = recurringInstanceAt;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
