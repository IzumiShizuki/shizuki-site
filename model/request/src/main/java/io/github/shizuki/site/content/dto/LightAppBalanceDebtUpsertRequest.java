package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "轻应用负债创建/更新请求")
public class LightAppBalanceDebtUpsertRequest {

    @NotBlank
    @Size(max = 200)
    @Schema(description = "负债标题")
    private String title;

    @Size(max = 120)
    @Schema(description = "债权方")
    private String creditor;

    @NotNull
    @DecimalMin(value = "0.0001")
    @Schema(description = "金额")
    private BigDecimal amount;

    @NotBlank
    @Size(max = 16)
    @Schema(description = "币种代码")
    private String currencyCode;

    @NotNull
    @Schema(description = "发生时间")
    private LocalDateTime occurredAt;

    @Schema(description = "到期时间")
    private LocalDateTime dueAt;

    @Schema(description = "状态 OPEN/CLOSED")
    private String status;

    @Size(max = 1024)
    @Schema(description = "备注")
    private String note;

    @Schema(description = "排序值")
    private Integer sortNum;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
