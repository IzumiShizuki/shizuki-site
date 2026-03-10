package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "轻应用定期扣费规则创建/更新请求")
public class LightAppBalanceRecurringChargeUpsertRequest {

    @Schema(description = "扣款账户ID")
    private Long accountId;

    @NotBlank
    @Size(max = 200)
    @Schema(description = "规则标题")
    private String title;

    @NotNull
    @DecimalMin(value = "0.0001")
    @Schema(description = "每次扣款金额")
    private BigDecimal amount;

    @NotBlank
    @Size(max = 16)
    @Schema(description = "币种代码")
    private String currencyCode;

    @Size(max = 120)
    @Schema(description = "分类")
    private String category;

    @Size(max = 1024)
    @Schema(description = "备注")
    private String note;

    @NotBlank
    @Size(max = 64)
    @Schema(description = "Cron表达式（xxl-job风格）")
    private String cronExpr;

    @Size(max = 64)
    @Schema(description = "时区ID")
    private String timeZoneId;

    @Schema(description = "开始生效时间")
    private LocalDateTime startAt;

    @Schema(description = "结束生效时间")
    private LocalDateTime endAt;

    @Schema(description = "启用标记")
    private Boolean enabled;

    @Schema(description = "排序值")
    private Integer sortNum;

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
