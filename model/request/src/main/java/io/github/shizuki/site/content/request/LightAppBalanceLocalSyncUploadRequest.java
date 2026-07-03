package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Schema(description = "本地 companion 推送账单到服务器的请求")
public class LightAppBalanceLocalSyncUploadRequest {

    @Size(max = 64)
    @Schema(description = "本地 companion 名称")
    private String sourceLabel;

    @Size(max = 512)
    @Schema(description = "本地原始账单路径")
    private String rawFilePath;

    @Size(max = 255)
    @Schema(description = "原始账单文件名")
    private String rawFileName;

    @Schema(description = "本次 companion 扫描窗口起点")
    private LocalDateTime requestFromAt;

    @Schema(description = "本次 companion 扫描窗口终点")
    private LocalDateTime requestToAt;

    @Valid
    @Schema(description = "本次推送的标准化流水")
    private List<LightAppBalanceLocalSyncTransactionRequest> transactions = new ArrayList<>();

    public String getSourceLabel() {
        return sourceLabel;
    }

    public void setSourceLabel(String sourceLabel) {
        this.sourceLabel = sourceLabel;
    }

    public String getRawFilePath() {
        return rawFilePath;
    }

    public void setRawFilePath(String rawFilePath) {
        this.rawFilePath = rawFilePath;
    }

    public String getRawFileName() {
        return rawFileName;
    }

    public void setRawFileName(String rawFileName) {
        this.rawFileName = rawFileName;
    }

    public LocalDateTime getRequestFromAt() {
        return requestFromAt;
    }

    public void setRequestFromAt(LocalDateTime requestFromAt) {
        this.requestFromAt = requestFromAt;
    }

    public LocalDateTime getRequestToAt() {
        return requestToAt;
    }

    public void setRequestToAt(LocalDateTime requestToAt) {
        this.requestToAt = requestToAt;
    }

    public List<LightAppBalanceLocalSyncTransactionRequest> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<LightAppBalanceLocalSyncTransactionRequest> transactions) {
        this.transactions = transactions == null ? new ArrayList<>() : transactions;
    }
}
