-- database: shizuki_app
-- last_modified_at: 2026-02-18 21:59:41

-- modified_at: 2026-02-18 21:59:41
-- change: monolith single database bootstrap (drop + create)
DROP DATABASE IF EXISTS shizuki_app;
CREATE DATABASE shizuki_app DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
