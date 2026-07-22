CREATE TABLE IF NOT EXISTS MEGURI_PROMPT_CACHE_METRICS (
    id BIGINT NOT NULL AUTO_INCREMENT,
    source_id VARCHAR(80) NOT NULL,
    observed_at VARCHAR(48) NOT NULL,
    received_at TIMESTAMP NOT NULL,
    payload_json TEXT NOT NULL,
    create_time TIMESTAMP NOT NULL,
    update_time TIMESTAMP NOT NULL,
    deleted_flag INT NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    PRIMARY KEY (id),
    UNIQUE KEY uk_meguri_prompt_cache_source (source_id)
);
