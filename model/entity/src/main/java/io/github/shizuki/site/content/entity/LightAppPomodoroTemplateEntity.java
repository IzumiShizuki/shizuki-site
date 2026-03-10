package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_LA_POMODORO_TEMPLATE")
public class LightAppPomodoroTemplateEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("focus_minutes")
    private Integer focusMinutes;

    @TableField("short_break_minutes")
    private Integer shortBreakMinutes;

    @TableField("long_break_minutes")
    private Integer longBreakMinutes;

    @TableField("long_break_every")
    private Integer longBreakEvery;

    @TableField("auto_start_next_flag")
    private Boolean autoStartNext;

    @TableField("ringtone_type_code")
    private String ringtoneTypeCode;

    @TableField("ringtone_name_text")
    private String ringtoneName;

    @TableField("ringtone_code")
    private String ringtoneCode;

    @TableField("ringtone_asset_id")
    private Long ringtoneAssetId;

    @TableField("sort_num")
    private Integer sortNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public String getRingtoneTypeCode() {
        return ringtoneTypeCode;
    }

    public void setRingtoneTypeCode(String ringtoneTypeCode) {
        this.ringtoneTypeCode = ringtoneTypeCode;
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
