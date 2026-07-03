package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_LA_BAL_IMPORT_MAPPING")
public class LightAppBalanceImportMappingEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("provider_code")
    private String providerCode;

    @TableField("source_account_id")
    private Long sourceAccountId;

    @TableField("import_job_id")
    private Long importJobId;

    @TableField("transaction_id")
    private Long transactionId;

    @TableField("external_id")
    private String externalId;

    @TableField("digest_code")
    private String digestCode;

    @TableField("occurred_datetime")
    private LocalDateTime occurredAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public Long getImportJobId() {
        return importJobId;
    }

    public void setImportJobId(Long importJobId) {
        this.importJobId = importJobId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getDigestCode() {
        return digestCode;
    }

    public void setDigestCode(String digestCode) {
        this.digestCode = digestCode;
    }

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(LocalDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }
}
