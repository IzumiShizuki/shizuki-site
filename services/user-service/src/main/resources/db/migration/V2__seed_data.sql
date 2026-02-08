INSERT INTO user_account (id, username, password, nickname, email, groups_json, permissions_json)
VALUES (1, 'admin', 'admin123', 'Administrator', 'admin@shizuki.dev', JSON_ARRAY('ADMIN', 'USER'), JSON_ARRAY('*'))
ON DUPLICATE KEY UPDATE nickname = VALUES(nickname), updated_at = CURRENT_TIMESTAMP(3);

INSERT INTO group_quota_policy (policy_id, group_code, quota_code, quota_value)
VALUES
    ('user-ai-rounds-user', 'USER', 'ai_round_total', 5),
    ('user-ai-rounds-interviewer', 'INTERVIEWER', 'ai_round_total', 20),
    ('user-ai-rounds-admin', 'ADMIN', 'ai_round_total', 999999)
ON DUPLICATE KEY UPDATE quota_value = VALUES(quota_value), updated_at = CURRENT_TIMESTAMP(3);
