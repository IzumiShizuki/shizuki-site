package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "轻应用番茄钟模板创建/更新请求")
public class LightAppPomodoroUpsertRequest {

    @NotBlank
    @Size(max = 120)
    @Schema(description = "模板标题", example = "学习冲刺")
    private String title;

    @NotNull
    @Min(5)
    @Max(120)
    @Schema(description = "专注时长（分钟）", example = "25")
    private Integer focusMinutes;

    @NotNull
    @Min(1)
    @Max(60)
    @Schema(description = "短休息时长（分钟）", example = "5")
    private Integer shortBreakMinutes;

    @NotNull
    @Min(5)
    @Max(90)
    @Schema(description = "长休息时长（分钟）", example = "15")
    private Integer longBreakMinutes;

    @NotNull
    @Min(2)
    @Max(12)
    @Schema(description = "长休息间隔（轮）", example = "4")
    private Integer longBreakEvery;

    @Schema(description = "是否自动开始下一段", example = "false")
    private Boolean autoStartNext;

    @Size(max = 16)
    @Schema(description = "铃声类型 BUILTIN/UPLOAD", example = "BUILTIN")
    private String ringtoneType;

    @Size(max = 120)
    @Schema(description = "铃声名称", example = "Soft Bell")
    private String ringtoneName;

    @Size(max = 64)
    @Schema(description = "内置铃声编码（ringtone_type=BUILTIN 时使用）", example = "soft-bell")
    private String ringtoneCode;

    @Schema(description = "上传铃声资产ID（ringtone_type=UPLOAD 时使用）", example = "123")
    private Long ringtoneAssetId;

    @Schema(description = "排序值", example = "10")
    private Integer sortNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFocusMinutes() {
        return focusMinutes;
    }

    public void setFocusMinutes(Integer focusMinutes) {
        this.focusMinutes = focusMinutes;
    }

    public Integer getShortBreakMinutes() {
        return shortBreakMinutes;
    }

    public void setShortBreakMinutes(Integer shortBreakMinutes) {
        this.shortBreakMinutes = shortBreakMinutes;
    }

    public Integer getLongBreakMinutes() {
        return longBreakMinutes;
    }

    public void setLongBreakMinutes(Integer longBreakMinutes) {
        this.longBreakMinutes = longBreakMinutes;
    }

    public Integer getLongBreakEvery() {
        return longBreakEvery;
    }

    public void setLongBreakEvery(Integer longBreakEvery) {
        this.longBreakEvery = longBreakEvery;
    }

    public Boolean getAutoStartNext() {
        return autoStartNext;
    }

    public void setAutoStartNext(Boolean autoStartNext) {
        this.autoStartNext = autoStartNext;
    }

    public String getRingtoneType() {
        return ringtoneType;
    }

    public void setRingtoneType(String ringtoneType) {
        this.ringtoneType = ringtoneType;
    }

    public String getRingtoneName() {
        return ringtoneName;
    }

    public void setRingtoneName(String ringtoneName) {
        this.ringtoneName = ringtoneName;
    }

    public String getRingtoneCode() {
        return ringtoneCode;
    }

    public void setRingtoneCode(String ringtoneCode) {
        this.ringtoneCode = ringtoneCode;
    }

    public Long getRingtoneAssetId() {
        return ringtoneAssetId;
    }

    public void setRingtoneAssetId(Long ringtoneAssetId) {
        this.ringtoneAssetId = ringtoneAssetId;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
