CREATE TABLE USR_CONTACT_BINDING (
 id VARCHAR(36) PRIMARY KEY,
 user_id BIGINT NOT NULL,
 platform_code VARCHAR(16) NOT NULL,
 platform_id VARCHAR(128) NOT NULL,
 sender_id VARCHAR(256) NOT NULL,
 origin_text VARCHAR(768) NOT NULL,
 identity_hash VARCHAR(64) NOT NULL UNIQUE,
 masked_identity VARCHAR(96) NOT NULL,
 binding_version VARCHAR(36) NOT NULL,
 todo_edit_enabled BOOLEAN NOT NULL DEFAULT TRUE,
 todo_notify_enabled BOOLEAN NOT NULL DEFAULT TRUE,
 active BOOLEAN NOT NULL DEFAULT TRUE,
 bound_at TIMESTAMP NOT NULL,
 CONSTRAINT fk_usr_contact_binding_user FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id),
 CONSTRAINT ck_usr_contact_platform CHECK (platform_code IN ('QQ','WECHAT'))
);
CREATE INDEX ix_usr_contact_user_active ON USR_CONTACT_BINDING(user_id, active);

CREATE TABLE USR_CONTACT_CHALLENGE (
 user_id BIGINT NOT NULL,
 platform_code VARCHAR(16) NOT NULL,
 code_hash VARCHAR(64) NOT NULL UNIQUE,
 expires_at TIMESTAMP NOT NULL,
 issued_at TIMESTAMP NOT NULL,
 PRIMARY KEY(user_id, platform_code),
 CONSTRAINT fk_usr_contact_challenge_user FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id),
 CONSTRAINT ck_usr_contact_challenge_platform CHECK (platform_code IN ('QQ','WECHAT'))
);

INSERT INTO USR_CONTACT_BINDING (
 id, user_id, platform_code, platform_id, sender_id, origin_text, identity_hash, masked_identity,
 binding_version, todo_edit_enabled, todo_notify_enabled, active, bound_at
)
SELECT binding_version, user_id, 'WECHAT', platform_id, sender_id, origin_text, identity_hash,
 CONCAT('微信 ···', RIGHT(sender_id, 4)), binding_version, TRUE, TRUE, TRUE, bound_at
FROM WX_NOTIFY_PREFERENCE
WHERE binding_version IS NOT NULL AND platform_id IS NOT NULL AND sender_id IS NOT NULL
  AND origin_text IS NOT NULL AND identity_hash IS NOT NULL AND bound_at IS NOT NULL;
