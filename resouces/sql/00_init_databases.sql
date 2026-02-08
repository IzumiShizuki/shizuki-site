-- database: shizuki_all
-- last_modified_at: 2026-02-08 20:50:00

-- modified_at: 2026-02-08 20:50:00
-- change: init all service databases for local middleware bootstrap
CREATE DATABASE IF NOT EXISTS shizuki_user DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE IF NOT EXISTS shizuki_content DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE IF NOT EXISTS shizuki_media DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE IF NOT EXISTS shizuki_ai DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
