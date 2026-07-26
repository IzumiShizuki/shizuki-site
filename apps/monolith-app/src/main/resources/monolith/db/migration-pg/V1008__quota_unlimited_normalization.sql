-- 统一配额“无限”语义为 -1。
-- 历史数据用 Long.MAX_VALUE (9223372036854775807) 表示无限，该值超过 JS Number
-- 安全整数范围 (2^53-1)，在管理后台前端会丢失精度并导致保存时 Long 溢出报错。
-- 自本迁移起：quota_value = -1 表示无限；消费方（AI/音乐模块）本就按 “值 < 0 即无限” 判断。
UPDATE USR_QUOTA_POLICY
SET quota_value = -1,
    update_time = CURRENT_TIMESTAMP
WHERE quota_value >= 9007199254740991;
