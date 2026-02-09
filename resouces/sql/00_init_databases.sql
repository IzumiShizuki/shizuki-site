-- database: shizuki_all
-- last_modified_at: 2026-02-09 16:17:30

-- modified_at: 2026-02-09 16:17:30
-- change: rebuild all service databases (drop + create) for empty-db bootstrap
DROP DATABASE IF EXISTS shizuki_user;
DROP DATABASE IF EXISTS shizuki_content;
DROP DATABASE IF EXISTS shizuki_media;
DROP DATABASE IF EXISTS shizuki_ai;

CREATE DATABASE shizuki_user DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE shizuki_content DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE shizuki_media DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE DATABASE shizuki_ai DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
