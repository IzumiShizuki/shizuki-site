package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_DEBT")
public class LightAppBalanceDebtEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("creditor_text")
    private String creditor;

    @TableField("amount_value")
    private BigDecimal amount;

    @TableField("currency_code")
    private String currencyCode;

    @TableField("occurred_datetime")
    private LocalDateTime occurredAt;

    @TableField("due_datetime")
    private LocalDateTime dueAt;

    @TableField("status_code")
    private String statusCode;

    @TableField("note_text")
    private String note;

    @TableField("linked_transaction_id")
    private Long linkedTransactionId;

    @TableField("sort_num")
    private Integer sortNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
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

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }

    public LocalDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getLinkedTransactionId() {
        return linkedTransactionId;
    }

    public void setLinkedTransactionId(Long linkedTransactionId) {
        this.linkedTransactionId = linkedTransactionId;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
