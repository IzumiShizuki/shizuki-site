-- Site-wide login page appearance configuration (theme preset + anime background/mascot images).
-- Additive singleton; the auth entry page reads this publicly so all visitors share the owner's setup.

CREATE TABLE IF NOT EXISTS CTN_LOGIN_APPEARANCE (
    singleton_key VARCHAR(32) PRIMARY KEY,
    theme_preset VARCHAR(32) NOT NULL DEFAULT 'milkshake',
    bg_image_url TEXT NULL,
    mascot_image_url TEXT NULL,
    create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_flag SMALLINT NOT NULL DEFAULT 0,
    version_num INTEGER NOT NULL DEFAULT 0
);

INSERT INTO CTN_LOGIN_APPEARANCE (singleton_key) VALUES ('SITE')
ON CONFLICT (singleton_key) DO NOTHING;

INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
VALUES ('ADMIN', 'site.login_appearance.manage')
ON CONFLICT (group_code, permission_code) DO UPDATE
SET update_time = CURRENT_TIMESTAMP,
    deleted_flag = 0;
