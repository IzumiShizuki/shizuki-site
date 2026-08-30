package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.math.BigDecimal;

/** Administrator-maintained site weather location. */
@TableName(value = "CTN_SITE_LOCATION", autoResultMap = true)
public class SiteLocationEntity extends BaseEntity {

    @TableField("display_name")
    private String displayName;

    @TableField("latitude_value")
    private BigDecimal latitude;

    @TableField("longitude_value")
    private BigDecimal longitude;

    @TableField("timezone_code")
    private String timezone;

    @TableField(value = "enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean enabled;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
