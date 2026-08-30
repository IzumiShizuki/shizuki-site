-- Keep PostgreSQL voice-library access aligned with the FRIEND + ADMIN policy.
INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
VALUES
    ('FRIEND', 'music.asmr.access'),
    ('ADMIN', 'music.asmr.access')
ON CONFLICT (group_code, permission_code) DO UPDATE
SET deleted_flag = 0,
    update_time = CURRENT_TIMESTAMP;
