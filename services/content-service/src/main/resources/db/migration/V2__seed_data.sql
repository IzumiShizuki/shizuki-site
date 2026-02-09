INSERT INTO CTN_POST (id, post_num, title_text, summary_text, visibility_status)
VALUES
    (1, 1001, 'Shizuki v0.1', 'Project kickoff post', 'PUBLIC'),
    (2, 1002, 'Architecture Notes', 'Microservice baseline', 'PUBLIC')
ON DUPLICATE KEY UPDATE
    summary_text = VALUES(summary_text),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO CTN_APP (id, app_num, name_text, category_type, pin_flag)
VALUES
    (1, 2001, 'Focus Timer', 'study', 1),
    (2, 2002, 'Ambient Mixer', 'tool', 1)
ON DUPLICATE KEY UPDATE
    category_type = VALUES(category_type),
    update_time = CURRENT_TIMESTAMP;
