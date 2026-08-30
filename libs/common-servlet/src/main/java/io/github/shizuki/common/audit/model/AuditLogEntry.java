package io.github.shizuki.common.audit.model;

import java.time.Instant;
import java.util.Map;

/**
 * 审计日志领域对象。
 */
public class AuditLogEntry {

    /**
     * 链路追踪 ID。
     */
    private String traceId;
    /**
     * 操作用户 ID。
     */
    private Long userId;
    /**
     * 审计动作编码。
     */
    private String action;
    /**
     * 审计资源编码。
     */
    private String resource;
    /**
     * 被操作目标的稳定标识，不包含对象存储键或签名地址。
     */
    private String target;
    /**
     * 已脱敏的审计补充信息。
     */
    private Map<String, Object> details = Map.of();
    /**
     * 执行结果（SUCCESS/FAILED）。
     */
    private String result;
    /**
     * 异常编码或类型。
     */
    private String errorCode;
    /**
     * 执行耗时毫秒。
     */
    private long costMs;
    /**
     * 日志创建时间。
     */
    private Instant createdAt;

    /**
     * 获取 traceId。
     *
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 设置 traceId。
     *
     * @param traceId traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * 获取 userId。
     *
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 userId。
     *
     * @param userId userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 action。
     *
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置 action。
     *
     * @param action action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 获取 resource。
     *
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置 resource。
     *
     * @param resource resource
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 获取被操作目标。
     *
     * @return 被操作目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置被操作目标。
     *
     * @param target 被操作目标
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * 获取已脱敏的补充信息。
     *
     * @return 补充信息
     */
    public Map<String, Object> getDetails() {
        return details;
    }

    /**
     * 设置已脱敏的补充信息。
     *
     * @param details 补充信息
     */
    public void setDetails(Map<String, Object> details) {
        this.details = details == null ? Map.of() : details;
    }

    /**
     * 获取 result。
     *
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置 result。
     *
     * @param result result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取 errorCode。
     *
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置 errorCode。
     *
     * @param errorCode errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 获取耗时毫秒。
     *
     * @return 耗时毫秒
     */
    public long getCostMs() {
        return costMs;
    }

    /**
     * 设置耗时毫秒。
     *
     * @param costMs 耗时毫秒
     */
    public void setCostMs(long costMs) {
        this.costMs = costMs;
    }

    /**
     * 获取创建时间。
     *
     * @return 创建时间
     */
    public Instant getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间。
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
