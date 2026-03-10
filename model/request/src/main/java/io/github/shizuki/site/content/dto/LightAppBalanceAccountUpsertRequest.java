package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

@Schema(description = "轻应用余额账户创建/更新请求")
public class LightAppBalanceAccountUpsertRequest {

    @NotBlank
    @Size(max = 64)
    @Schema(description = "支付渠道编码")
    private String channelCode;

    @NotBlank
    @Size(max = 120)
    @Schema(description = "支付渠道名称")
    private String channelName;

    @NotBlank
    @Size(max = 120)
    @Schema(description = "账户名称")
    private String accountName;

    @NotBlank
    @Size(max = 16)
    @Schema(description = "币种代码", example = "CNY")
    private String currencyCode;

    @NotNull
    @DecimalMin(value = "0.0")
    @Schema(description = "账户余额")
    private BigDecimal balanceAmount;

    @Schema(description = "排序值")
    private Integer sortNum;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
