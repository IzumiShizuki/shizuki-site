package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.JsonStringTypeHandler;
import java.time.LocalDateTime;
import org.apache.ibatis.type.JdbcType;

/** Durable last-good weather snapshot for a configured site location. */
@TableName(value = "CTN_WEATHER_SNAPSHOT", autoResultMap = true)
public class WeatherSnapshotEntity extends BaseEntity {

    @TableField("site_location_id")
    private Long siteLocationId;

    @TableField("provider_code")
    private String providerCode;

    @TableField(value = "payload_json", typeHandler = JsonStringTypeHandler.class, jdbcType = JdbcType.OTHER)
    private String payloadJson;

    @TableField("observed_at")
    private LocalDateTime observedAt;

    @TableField("fetched_at")
    private LocalDateTime fetchedAt;

    public Long getSiteLocationId() {
        return siteLocationId;
    }

    public void setSiteLocationId(Long siteLocationId) {
        this.siteLocationId = siteLocationId;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getPayloadJson() {
        return payloadJson;
    }

    public void setPayloadJson(String payloadJson) {
        this.payloadJson = payloadJson;
    }

    public LocalDateTime getObservedAt() {
        return observedAt;
    }

    public void setObservedAt(LocalDateTime observedAt) {
        this.observedAt = observedAt;
    }

    public LocalDateTime getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(LocalDateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
    }
}
