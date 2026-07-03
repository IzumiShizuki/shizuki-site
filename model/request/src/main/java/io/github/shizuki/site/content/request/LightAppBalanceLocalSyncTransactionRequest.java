package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "本地 companion 推送的单条账单流水")
public class LightAppBalanceLocalSyncTransactionRequest {

    @Size(max = 128)
    @Schema(description = "外部流水号")
    private String externalId;

    @NotNull
    @Schema(description = "发生时间")
    private LocalDateTime occurredAt;

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
    @Schema(description = "交易对手")
    private String counterparty;

    @Size(max = 120)
    @Schema(description = "分类提示")
    private String categoryHint;

    @Size(max = 2048)
    @Schema(description = "备注")
    private String note;

    @Size(max = 8192)
    @Schema(description = "原始行 payload")
    private String rawPayload;

    @Size(max = 128)
    @Schema(description = "指纹摘要")
    private String digest;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
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

    public String getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty;
    }

    public String getCategoryHint() {
        return categoryHint;
    }

    public void setCategoryHint(String categoryHint) {
        this.categoryHint = categoryHint;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRawPayload() {
        return rawPayload;
    }

    public void setRawPayload(String rawPayload) {
        this.rawPayload = rawPayload;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
