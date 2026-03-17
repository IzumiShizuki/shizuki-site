ALTER TABLE CTN_LA_TODO
    ADD COLUMN show_on_calendar_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_TODO.show_on_calendar_flag 是否显示日历' AFTER due_datetime,
    ADD COLUMN time_precision_code VARCHAR(16) NOT NULL DEFAULT 'MINUTE' COMMENT 'CTN_LA_TODO.time_precision_code 时间精度 DAY/MINUTE' AFTER show_on_calendar_flag,
    ADD COLUMN timing_mode_code VARCHAR(16) NOT NULL DEFAULT 'DEADLINE' COMMENT 'CTN_LA_TODO.timing_mode_code 时间模式 DEADLINE/RANGE' AFTER time_precision_code,
    ADD COLUMN range_start_datetime DATETIME NULL COMMENT 'CTN_LA_TODO.range_start_datetime 范围开始时间' AFTER timing_mode_code,
    ADD COLUMN reminder_enabled_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TODO.reminder_enabled_flag 是否启用提醒' AFTER range_start_datetime,
    ADD COLUMN start_remind_value INT NULL COMMENT 'CTN_LA_TODO.start_remind_value 起始提醒提前量' AFTER reminder_enabled_flag,
    ADD COLUMN start_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_TODO.start_remind_unit_code 起始提醒单位' AFTER start_remind_value,
    ADD COLUMN deadline_remind_value INT NULL COMMENT 'CTN_LA_TODO.deadline_remind_value 截止提醒提前量' AFTER start_remind_unit_code,
    ADD COLUMN deadline_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_TODO.deadline_remind_unit_code 截止提醒单位' AFTER deadline_remind_value;

ALTER TABLE CTN_LA_TASK
    ADD COLUMN show_on_calendar_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_TASK.show_on_calendar_flag 是否显示日历' AFTER due_datetime,
    ADD COLUMN time_precision_code VARCHAR(16) NOT NULL DEFAULT 'MINUTE' COMMENT 'CTN_LA_TASK.time_precision_code 时间精度 DAY/MINUTE' AFTER show_on_calendar_flag,
    ADD COLUMN timing_mode_code VARCHAR(16) NOT NULL DEFAULT 'DEADLINE' COMMENT 'CTN_LA_TASK.timing_mode_code 时间模式 DEADLINE/RANGE' AFTER time_precision_code,
    ADD COLUMN range_start_datetime DATETIME NULL COMMENT 'CTN_LA_TASK.range_start_datetime 范围开始时间' AFTER timing_mode_code,
    ADD COLUMN reminder_enabled_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_TASK.reminder_enabled_flag 是否启用提醒' AFTER range_start_datetime,
    ADD COLUMN start_remind_value INT NULL COMMENT 'CTN_LA_TASK.start_remind_value 起始提醒提前量' AFTER reminder_enabled_flag,
    ADD COLUMN start_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_TASK.start_remind_unit_code 起始提醒单位' AFTER start_remind_value,
    ADD COLUMN deadline_remind_value INT NULL COMMENT 'CTN_LA_TASK.deadline_remind_value 截止提醒提前量' AFTER start_remind_unit_code,
    ADD COLUMN deadline_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_TASK.deadline_remind_unit_code 截止提醒单位' AFTER deadline_remind_value;

ALTER TABLE CTN_LA_SCHEDULE_EVENT
    ADD COLUMN show_on_calendar_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_LA_SCHEDULE_EVENT.show_on_calendar_flag 是否显示日历' AFTER end_datetime,
    ADD COLUMN time_precision_code VARCHAR(16) NOT NULL DEFAULT 'MINUTE' COMMENT 'CTN_LA_SCHEDULE_EVENT.time_precision_code 时间精度 DAY/MINUTE' AFTER show_on_calendar_flag,
    ADD COLUMN timing_mode_code VARCHAR(16) NOT NULL DEFAULT 'RANGE' COMMENT 'CTN_LA_SCHEDULE_EVENT.timing_mode_code 时间模式 DEADLINE/RANGE' AFTER time_precision_code,
    ADD COLUMN range_start_datetime DATETIME NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.range_start_datetime 范围开始时间' AFTER timing_mode_code,
    ADD COLUMN reminder_enabled_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_SCHEDULE_EVENT.reminder_enabled_flag 是否启用提醒' AFTER range_start_datetime,
    ADD COLUMN start_remind_value INT NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.start_remind_value 起始提醒提前量' AFTER reminder_enabled_flag,
    ADD COLUMN start_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.start_remind_unit_code 起始提醒单位' AFTER start_remind_value,
    ADD COLUMN deadline_remind_value INT NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.deadline_remind_value 截止提醒提前量' AFTER start_remind_unit_code,
    ADD COLUMN deadline_remind_unit_code VARCHAR(16) NULL COMMENT 'CTN_LA_SCHEDULE_EVENT.deadline_remind_unit_code 截止提醒单位' AFTER deadline_remind_value;

UPDATE CTN_LA_SCHEDULE_EVENT
SET
    range_start_datetime = COALESCE(range_start_datetime, start_datetime),
    timing_mode_code = 'RANGE'
WHERE deleted_flag = 0;
