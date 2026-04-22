-- 默认授予 FRIEND + ADMIN 音声访问权限（幂等）。
INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
VALUES
    ('FRIEND', 'music.asmr.access'),
    ('ADMIN', 'music.asmr.access')
ON DUPLICATE KEY UPDATE
    permission_code = VALUES(permission_code);
