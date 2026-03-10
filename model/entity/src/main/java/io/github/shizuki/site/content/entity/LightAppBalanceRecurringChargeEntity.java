package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_RECURRING_CHARGE")
public class LightAppBalanceRecurringChargeEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("account_id")
    private Long accountId;

    @TableField("title_text")
    private String title;

    @TableField("amount_value")
    private BigDecimal amount;

    @TableField("currency_code")
    private String currencyCode;

    @TableField("category_text")
    private String category;

    @TableField("note_text")
    private String note;

    @TableField("cron_expr")
    private String cronExpr;

    @TableField("time_zone_id")
    private String timeZoneId;

    @TableField("start_datetime")
    private LocalDateTime startAt;

    @TableField("end_datetime")
    private LocalDateTime endAt;

    @TableField("last_trigger_datetime")
    private LocalDateTime lastTriggerAt;

    @TableField("enabled_flag")
    private Boolean enabled;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getCronExpr() {
        return cronExpr;
    }

    public void setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public LocalDateTime getLastTriggerAt() {
        return lastTriggerAt;
    }

    public void setLastTriggerAt(LocalDateTime lastTriggerAt) {
        this.lastTriggerAt = lastTriggerAt;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
