package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@TableName("CTN_LA_FX_RATE")
public class LightAppFxRateEntity extends BaseEntity {

    @TableField("base_currency_code")
    private String baseCurrencyCode;

    @TableField("quote_currency_code")
    private String quoteCurrencyCode;

    @TableField("rate_value")
    private BigDecimal rateValue;

    @TableField("provider_code")
    private String providerCode;

    @TableField("rate_datetime")
    private LocalDateTime rateAt;

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getQuoteCurrencyCode() {
        return quoteCurrencyCode;
    }

    public void setQuoteCurrencyCode(String quoteCurrencyCode) {
        this.quoteCurrencyCode = quoteCurrencyCode;
    }

    public BigDecimal getRateValue() {
        return rateValue;
    }

    public void setRateValue(BigDecimal rateValue) {
        this.rateValue = rateValue;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public LocalDateTime getRateAt() {
        return rateAt;
    }

    public void setRateAt(LocalDateTime rateAt) {
        this.rateAt = rateAt;
    }
}
