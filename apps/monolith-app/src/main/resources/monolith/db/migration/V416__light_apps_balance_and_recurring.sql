CREATE TABLE IF NOT EXISTS CTN_LA_BAL_ACCOUNT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_BAL_ACCOUNT.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_BAL_ACCOUNT.user_id 用户ID',
    channel_code VARCHAR(64) NOT NULL COMMENT 'CTN_LA_BAL_ACCOUNT.channel_code 渠道编码',
    channel_name_text VARCHAR(120) NOT NULL COMMENT 'CTN_LA_BAL_ACCOUNT.channel_name_text 渠道名称',
    account_name_text VARCHAR(120) NOT NULL COMMENT 'CTN_LA_BAL_ACCOUNT.account_name_text 账户名称',
    currency_code VARCHAR(16) NOT NULL DEFAULT 'CNY' COMMENT 'CTN_LA_BAL_ACCOUNT.currency_code 币种代码',
    balance_amount DECIMAL(19,4) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_ACCOUNT.balance_amount 账户余额',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_ACCOUNT.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_ACCOUNT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_ACCOUNT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_ACCOUNT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_ACCOUNT.version_num 版本号',
    CONSTRAINT PK_CTN_LA_BAL_ACCOUNT PRIMARY KEY (id),
    KEY IX_CTN_LA_BAL_ACCOUNT_1 (user_id, sort_num, update_time),
    KEY IX_CTN_LA_BAL_ACCOUNT_2 (user_id, channel_code)
) COMMENT='轻应用余额账户表';

CREATE TABLE IF NOT EXISTS CTN_LA_BAL_TRANSACTION (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_BAL_TRANSACTION.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.user_id 用户ID',
    account_id BIGINT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.account_id 关联账户ID',
    direction_code VARCHAR(16) NOT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.direction_code 收支方向 INCOME/EXPENSE',
    amount_value DECIMAL(19,4) NOT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.amount_value 金额',
    currency_code VARCHAR(16) NOT NULL DEFAULT 'CNY' COMMENT 'CTN_LA_BAL_TRANSACTION.currency_code 币种代码',
    category_text VARCHAR(120) NULL COMMENT 'CTN_LA_BAL_TRANSACTION.category_text 分类',
    note_text VARCHAR(1024) NULL COMMENT 'CTN_LA_BAL_TRANSACTION.note_text 备注',
    occurred_datetime DATETIME NOT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.occurred_datetime 发生时间',
    recurring_charge_id BIGINT NULL COMMENT 'CTN_LA_BAL_TRANSACTION.recurring_charge_id 定期扣费规则ID',
    recurring_instance_datetime DATETIME NULL COMMENT 'CTN_LA_BAL_TRANSACTION.recurring_instance_datetime 周期实例触发时间',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_TRANSACTION.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_TRANSACTION.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_TRANSACTION.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_TRANSACTION.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_TRANSACTION.version_num 版本号',
    CONSTRAINT PK_CTN_LA_BAL_TRANSACTION PRIMARY KEY (id),
    CONSTRAINT FK_CTN_LA_BAL_TRANSACTION_1 FOREIGN KEY (account_id) REFERENCES CTN_LA_BAL_ACCOUNT(id),
    KEY IX_CTN_LA_BAL_TRANSACTION_1 (user_id, occurred_datetime, direction_code),
    KEY IX_CTN_LA_BAL_TRANSACTION_2 (user_id, account_id),
    KEY IX_CTN_LA_BAL_TRANSACTION_3 (user_id, recurring_charge_id, recurring_instance_datetime),
    CONSTRAINT AK_CTN_LA_BAL_TRANSACTION_1 UNIQUE (user_id, recurring_charge_id, recurring_instance_datetime)
) COMMENT='轻应用收支流水表';

CREATE TABLE IF NOT EXISTS CTN_LA_BAL_DEBT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_BAL_DEBT.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_BAL_DEBT.user_id 用户ID',
    title_text VARCHAR(200) NOT NULL COMMENT 'CTN_LA_BAL_DEBT.title_text 负债标题',
    creditor_text VARCHAR(120) NULL COMMENT 'CTN_LA_BAL_DEBT.creditor_text 债权方',
    amount_value DECIMAL(19,4) NOT NULL COMMENT 'CTN_LA_BAL_DEBT.amount_value 负债金额',
    currency_code VARCHAR(16) NOT NULL DEFAULT 'CNY' COMMENT 'CTN_LA_BAL_DEBT.currency_code 币种代码',
    occurred_datetime DATETIME NOT NULL COMMENT 'CTN_LA_BAL_DEBT.occurred_datetime 发生时间',
    due_datetime DATETIME NULL COMMENT 'CTN_LA_BAL_DEBT.due_datetime 到期时间',
    status_code VARCHAR(32) NOT NULL DEFAULT 'OPEN' COMMENT 'CTN_LA_BAL_DEBT.status_code 状态 OPEN/CLOSED',
    note_text VARCHAR(1024) NULL COMMENT 'CTN_LA_BAL_DEBT.note_text 备注',
    linked_transaction_id BIGINT NULL COMMENT 'CTN_LA_BAL_DEBT.linked_transaction_id 关联流水ID',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_DEBT.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_DEBT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_DEBT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_DEBT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_DEBT.version_num 版本号',
    CONSTRAINT PK_CTN_LA_BAL_DEBT PRIMARY KEY (id),
    KEY IX_CTN_LA_BAL_DEBT_1 (user_id, status_code, occurred_datetime),
    KEY IX_CTN_LA_BAL_DEBT_2 (user_id, due_datetime)
) COMMENT='轻应用负债表';

CREATE TABLE IF NOT EXISTS CTN_LA_BAL_RECURRING_CHARGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.user_id 用户ID',
    account_id BIGINT NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.account_id 扣款账户ID',
    title_text VARCHAR(200) NOT NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.title_text 规则标题',
    amount_value DECIMAL(19,4) NOT NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.amount_value 扣款金额',
    currency_code VARCHAR(16) NOT NULL DEFAULT 'CNY' COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.currency_code 币种代码',
    category_text VARCHAR(120) NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.category_text 分类',
    note_text VARCHAR(1024) NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.note_text 备注',
    cron_expr VARCHAR(64) NOT NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.cron_expr Cron表达式',
    time_zone_id VARCHAR(64) NOT NULL DEFAULT 'Asia/Shanghai' COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.time_zone_id 时区ID',
    start_datetime DATETIME NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.start_datetime 生效开始时间',
    end_datetime DATETIME NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.end_datetime 生效结束时间',
    last_trigger_datetime DATETIME NULL COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.last_trigger_datetime 最近执行时间',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.enabled_flag 启用标记',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_BAL_RECURRING_CHARGE.version_num 版本号',
    CONSTRAINT PK_CTN_LA_BAL_RECURRING_CHARGE PRIMARY KEY (id),
    CONSTRAINT FK_CTN_LA_BAL_RECURRING_CHARGE_1 FOREIGN KEY (account_id) REFERENCES CTN_LA_BAL_ACCOUNT(id),
    KEY IX_CTN_LA_BAL_RECURRING_CHARGE_1 (user_id, enabled_flag, sort_num),
    KEY IX_CTN_LA_BAL_RECURRING_CHARGE_2 (user_id, last_trigger_datetime)
) COMMENT='轻应用定期扣费规则表';

CREATE TABLE IF NOT EXISTS CTN_LA_FX_RATE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_FX_RATE.id 自增长ID',
    base_currency_code VARCHAR(16) NOT NULL COMMENT 'CTN_LA_FX_RATE.base_currency_code 基准币种',
    quote_currency_code VARCHAR(16) NOT NULL COMMENT 'CTN_LA_FX_RATE.quote_currency_code 报价币种',
    rate_value DECIMAL(19,8) NOT NULL COMMENT 'CTN_LA_FX_RATE.rate_value 汇率值',
    provider_code VARCHAR(64) NOT NULL COMMENT 'CTN_LA_FX_RATE.provider_code 提供方',
    rate_datetime DATETIME NOT NULL COMMENT 'CTN_LA_FX_RATE.rate_datetime 汇率时间',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_FX_RATE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_FX_RATE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_FX_RATE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_FX_RATE.version_num 版本号',
    CONSTRAINT PK_CTN_LA_FX_RATE PRIMARY KEY (id),
    CONSTRAINT AK_CTN_LA_FX_RATE_1 UNIQUE (base_currency_code, quote_currency_code),
    KEY IX_CTN_LA_FX_RATE_1 (base_currency_code, rate_datetime)
) COMMENT='轻应用汇率快照表';

CREATE TABLE IF NOT EXISTS CTN_LA_TODO_RECUR_RULE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_TODO_RECUR_RULE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.user_id 用户ID',
    project_id BIGINT NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.project_id 关联项目ID',
    title_text VARCHAR(200) NOT NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.title_text 标题模板',
    detail_text VARCHAR(2000) NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.detail_text 详情模板',
    priority_code VARCHAR(16) NOT NULL DEFAULT 'MEDIUM' COMMENT 'CTN_LA_TODO_RECUR_RULE.priority_code 优先级',
    cron_expr VARCHAR(64) NOT NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.cron_expr Cron表达式',
    time_zone_id VARCHAR(64) NOT NULL DEFAULT 'Asia/Shanghai' COMMENT 'CTN_LA_TODO_RECUR_RULE.time_zone_id 时区ID',
    start_datetime DATETIME NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.start_datetime 生效开始时间',
    end_datetime DATETIME NULL COMMENT 'CTN_LA_TODO_RECUR_RULE.end_datetime 生效结束时间',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_TODO_RECUR_RULE.enabled_flag 启用标记',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TODO_RECUR_RULE.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_TODO_RECUR_RULE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_TODO_RECUR_RULE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TODO_RECUR_RULE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TODO_RECUR_RULE.version_num 版本号',
    CONSTRAINT PK_CTN_LA_TODO_RECUR_RULE PRIMARY KEY (id),
    KEY IX_CTN_LA_TODO_RECUR_RULE_1 (user_id, enabled_flag, sort_num),
    KEY IX_CTN_LA_TODO_RECUR_RULE_2 (user_id, project_id)
) COMMENT='轻应用Todo周期规则表';

CREATE TABLE IF NOT EXISTS CTN_LA_TASK_RECUR_RULE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_TASK_RECUR_RULE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.user_id 用户ID',
    project_id BIGINT NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.project_id 关联项目ID',
    column_code VARCHAR(64) NOT NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.column_code 目标列编码',
    title_text VARCHAR(200) NOT NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.title_text 标题模板',
    detail_text VARCHAR(2000) NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.detail_text 详情模板',
    cron_expr VARCHAR(64) NOT NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.cron_expr Cron表达式',
    time_zone_id VARCHAR(64) NOT NULL DEFAULT 'Asia/Shanghai' COMMENT 'CTN_LA_TASK_RECUR_RULE.time_zone_id 时区ID',
    start_datetime DATETIME NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.start_datetime 生效开始时间',
    end_datetime DATETIME NULL COMMENT 'CTN_LA_TASK_RECUR_RULE.end_datetime 生效结束时间',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_TASK_RECUR_RULE.enabled_flag 启用标记',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TASK_RECUR_RULE.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_TASK_RECUR_RULE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_TASK_RECUR_RULE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TASK_RECUR_RULE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TASK_RECUR_RULE.version_num 版本号',
    CONSTRAINT PK_CTN_LA_TASK_RECUR_RULE PRIMARY KEY (id),
    KEY IX_CTN_LA_TASK_RECUR_RULE_1 (user_id, enabled_flag, sort_num),
    KEY IX_CTN_LA_TASK_RECUR_RULE_2 (user_id, project_id)
) COMMENT='轻应用Task周期规则表';

CREATE TABLE IF NOT EXISTS CTN_LA_SCHEDULE_RECUR_RULE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.user_id 用户ID',
    project_id BIGINT NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.project_id 关联项目ID',
    title_text VARCHAR(200) NOT NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.title_text 标题模板',
    detail_text VARCHAR(2000) NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.detail_text 详情模板',
    duration_minutes INT NOT NULL DEFAULT 60 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.duration_minutes 默认时长（分钟）',
    all_day_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.all_day_flag 全天标记',
    location_text VARCHAR(255) NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.location_text 地点',
    status_code VARCHAR(32) NOT NULL DEFAULT 'ACTIVE' COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.status_code 状态',
    cron_expr VARCHAR(64) NOT NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.cron_expr Cron表达式',
    time_zone_id VARCHAR(64) NOT NULL DEFAULT 'Asia/Shanghai' COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.time_zone_id 时区ID',
    start_datetime DATETIME NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.start_datetime 生效开始时间',
    end_datetime DATETIME NULL COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.end_datetime 生效结束时间',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.enabled_flag 启用标记',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_SCHEDULE_RECUR_RULE.version_num 版本号',
    CONSTRAINT PK_CTN_LA_SCHEDULE_RECUR_RULE PRIMARY KEY (id),
    KEY IX_CTN_LA_SCHEDULE_RECUR_RULE_1 (user_id, enabled_flag, sort_num),
    KEY IX_CTN_LA_SCHEDULE_RECUR_RULE_2 (user_id, project_id)
) COMMENT='轻应用Schedule周期规则表';

ALTER TABLE CTN_LA_TODO
    ADD COLUMN recurring_rule_id BIGINT NULL COMMENT 'CTN_LA_TODO.recurring_rule_id 周期规则ID' AFTER project_id,
    ADD COLUMN recurring_instance_datetime DATETIME NULL COMMENT 'CTN_LA_TODO.recurring_instance_datetime 周期实例时间' AFTER due_datetime,
    ADD KEY IX_CTN_LA_TODO_3 (user_id, recurring_rule_id, recurring_instance_datetime),
    ADD CONSTRAINT AK_CTN_LA_TODO_1 UNIQUE (user_id, recurring_rule_id, recurring_instance_datetime);

ALTER TABLE CTN_LA_TASK
    ADD COLUMN recurring_rule_id BIGINT NULL COMMENT 'CTN_LA_TASK.recurring_rule_id 周期规则ID' AFTER project_id,
    ADD COLUMN recurring_instance_datetime DATETIME NULL COMMENT 'CTN_LA_TASK.recurring_instance_datetime 周期实例时间' AFTER due_datetime,
    ADD KEY IX_CTN_LA_TASK_3 (user_id, recurring_rule_id, recurring_instance_datetime),
    ADD CONSTRAINT AK_CTN_LA_TASK_1 UNIQUE (user_id, recurring_rule_id, recurring_instance_datetime);

ALTER TABLE CTN_LA_SCHEDULE_EVENT
    ADD COLUMN recurring_rule_id BIGINT NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.recurring_rule_id 周期规则ID' AFTER project_id,
    ADD COLUMN recurring_instance_datetime DATETIME NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.recurring_instance_datetime 周期实例时间' AFTER end_datetime,
    ADD KEY IX_CTN_LA_SCHEDULE_EVENT_3 (user_id, recurring_rule_id, recurring_instance_datetime),
    ADD CONSTRAINT AK_CTN_LA_SCHEDULE_EVENT_1 UNIQUE (user_id, recurring_rule_id, recurring_instance_datetime);
