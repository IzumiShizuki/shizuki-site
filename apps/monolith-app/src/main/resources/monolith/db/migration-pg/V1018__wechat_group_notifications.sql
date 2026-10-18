-- Notification tables store UTC timestamps. Binding codes and lease secrets are hashed.
CREATE TABLE WX_NOTIFY_MUTEX (id INTEGER PRIMARY KEY);
INSERT INTO WX_NOTIFY_MUTEX(id) VALUES (1);
CREATE TABLE WX_NOTIFY_PREFERENCE (
 user_id BIGINT PRIMARY KEY,
 paused BOOLEAN NOT NULL DEFAULT FALSE,
 quiet_start INTEGER,
 quiet_end INTEGER,
 platform_id VARCHAR(128),
 sender_id VARCHAR(256),
 origin_text VARCHAR(768),
 identity_hash VARCHAR(64) UNIQUE,
 binding_version VARCHAR(36),
 bound_at TIMESTAMP,
 last_sent_at TIMESTAMP,
 CONSTRAINT fk_wxn_user FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
);
CREATE TABLE WX_NOTIFY_CHALLENGE (
 user_id BIGINT PRIMARY KEY,
 code_hash VARCHAR(64) NOT NULL UNIQUE,
 expires_at TIMESTAMP NOT NULL,
 issued_at TIMESTAMP NOT NULL,
 CONSTRAINT fk_wxn_challenge FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
);
CREATE TABLE WX_NOTIFY_SUBSCRIPTION (
 user_id BIGINT NOT NULL,
 group_code VARCHAR(64) NOT NULL,
 content_kind VARCHAR(16) NOT NULL,
 PRIMARY KEY(user_id, group_code, content_kind),
 CONSTRAINT fk_wxn_sub FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
);
CREATE TABLE WX_NOTIFY_DELIVERY (
 id VARCHAR(36) PRIMARY KEY,
 event_key VARCHAR(160) NOT NULL,
 user_id BIGINT NOT NULL,
 content_kind VARCHAR(16) NOT NULL,
 source_id VARCHAR(64) NOT NULL,
 author_id BIGINT NOT NULL,
 binding_version VARCHAR(36) NOT NULL,
 status_code VARCHAR(16) NOT NULL,
 attempts INTEGER NOT NULL DEFAULT 0,
 available_at TIMESTAMP NOT NULL,
 lease_hash VARCHAR(64),
 lease_until TIMESTAMP,
 error_code VARCHAR(48),
 created_at TIMESTAMP NOT NULL,
 updated_at TIMESTAMP NOT NULL,
 CONSTRAINT ak_wxn_event UNIQUE(event_key, user_id),
 CONSTRAINT fk_wxn_delivery FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
);
CREATE INDEX ix_wxn_pending ON WX_NOTIFY_DELIVERY(status_code, available_at);
CREATE INDEX ix_wxn_history ON WX_NOTIFY_DELIVERY(user_id, created_at);
ALTER TABLE CTN_MOMENT ADD COLUMN author_user_id BIGINT;
