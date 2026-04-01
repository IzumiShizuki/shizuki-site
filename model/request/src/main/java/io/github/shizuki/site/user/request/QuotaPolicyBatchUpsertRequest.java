package io.github.shizuki.site.user.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 分组配额策略批量创建/更新请求。
 *
 * <p>用于管理员在参数中心一次提交多条策略变更，服务端按 policy_id 或 (group_code, quota_code)
 * 执行 upsert。
 */
public class QuotaPolicyBatchUpsertRequest {

    /**
     * 待批量 upsert 的策略列表。
     */
    @Valid
    @NotEmpty
    private List<QuotaPolicyRequest> items;

    public List<QuotaPolicyRequest> getItems() {
        return items;
    }

    public void setItems(List<QuotaPolicyRequest> items) {
        this.items = items;
    }
}
