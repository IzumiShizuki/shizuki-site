-- 统一配额“无限”语义为 -1（与 monolith migration-pg V1008 保持一致）。
-- 历史 Long.MAX_VALUE 写法超出 JS 安全整数范围，会导致管理后台保存溢出报错。
UPDATE USR_QUOTA_POLICY
SET quota_value = -1,
    update_time = CURRENT_TIMESTAMP
WHERE quota_value >= 9007199254740991;
