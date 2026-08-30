package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.io.Serializable;
import java.time.LocalDateTime;

/** Singleton site-widget configuration. */
@TableName(value = "CTN_SITE_WIDGET_CONFIG", autoResultMap = true)
public class SiteWidgetConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "singleton_key", type = IdType.INPUT)
    private String singletonKey;

    @TableField("active_location_id")
    private Long activeLocationId;

    @TableField(value = "weather_enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean weatherEnabled;

    @TableField("weather_max_stale_minutes")
    private Integer weatherMaxStaleMinutes;

    @TableField("quote_source_mode")
    private String quoteSourceMode;

    @TableField(value = "hitokoto_enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean hitokotoEnabled;

    @TableField("create_time")
    private LocalDateTime createdAt;

    @TableField("update_time")
    private LocalDateTime updatedAt;

    /** Permanent-purge tombstone; never used to disable a provider. */
    @TableField("deleted_flag")
    private Integer deleted;

    @TableField("version_num")
    private Integer version;

    public String getSingletonKey() {
        return singletonKey;
    }

    public void setSingletonKey(String singletonKey) {
        this.singletonKey = singletonKey;
    }

    public Long getActiveLocationId() {
        return activeLocationId;
    }

    public void setActiveLocationId(Long activeLocationId) {
        this.activeLocationId = activeLocationId;
    }

    public Boolean getWeatherEnabled() {
        return weatherEnabled;
    }

    public void setWeatherEnabled(Boolean weatherEnabled) {
        this.weatherEnabled = weatherEnabled;
    }

    public Integer getWeatherMaxStaleMinutes() {
        return weatherMaxStaleMinutes;
    }

    public void setWeatherMaxStaleMinutes(Integer weatherMaxStaleMinutes) {
        this.weatherMaxStaleMinutes = weatherMaxStaleMinutes;
    }

    public String getQuoteSourceMode() {
        return quoteSourceMode;
    }

    public void setQuoteSourceMode(String quoteSourceMode) {
        this.quoteSourceMode = quoteSourceMode;
    }

    public Boolean getHitokotoEnabled() {
        return hitokotoEnabled;
    }

    public void setHitokotoEnabled(Boolean hitokotoEnabled) {
        this.hitokotoEnabled = hitokotoEnabled;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
