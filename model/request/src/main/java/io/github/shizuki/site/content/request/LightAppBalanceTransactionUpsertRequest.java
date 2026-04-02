package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "轻应用收支创建/更新请求")
public class LightAppBalanceTransactionUpsertRequest {

    @Schema(description = "账户ID")
    private Long accountId;

    @NotBlank
    @Size(max = 16)
    @Schema(description = "收支方向 INCOME/EXPENSE")
    private String direction;

    @NotNull
    @DecimalMin(value = "0.0001")
    @Schema(description = "金额")
    private BigDecimal amount;

    @NotBlank
    @Size(max = 16)
    @Schema(description = "币种代码")
    private String currencyCode;

    @Size(max = 120)
    @Schema(description = "收支分类")
    private String category;

    @Size(max = 1024)
    @Schema(description = "备注")
    private String note;

    @NotNull
    @Schema(description = "发生时间")
    private LocalDateTime occurredAt;

    @Schema(description = "排序值")
    private Integer sortNum;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
