package io.github.shizuki.common.core.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 公共基础实体。
 *
 * <p>约定主键、创建时间、更新时间、删除标记与版本号字段。
 */
public class BaseEntity implements Serializable {

    /**
     * 序列化版本号。
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键 ID。
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间。
     */
    @TableField("create_time")
    private LocalDateTime createdAt;

    /**
     * 更新时间。
     */
    @TableField("update_time")
    private LocalDateTime updatedAt;

    /**
     * 逻辑删除标记。
     */
    @TableField("deleted_flag")
    private Integer deleted;

    /**
     * 版本号。
     */
    @TableField("version_num")
    private Integer version;

    /**
     * 获取主键 ID。
     *
     * @return 主键 ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键 ID。
     *
     * @param id 主键 ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取创建时间。
     *
     * @return 创建时间
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间。
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取更新时间。
     *
     * @return 更新时间
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置更新时间。
     *
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取删除标记。
     *
     * @return 删除标记
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标记。
     *
     * @param deleted 删除标记
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取版本号。
     *
     * @return 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号。
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}
