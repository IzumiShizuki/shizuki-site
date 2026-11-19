-- Additive account MCP token storage; no default grants or plaintext.
CREATE TABLE IF NOT EXISTS USR_MCP_ACCOUNT_TOKEN (
    user_id BIGINT NOT NULL PRIMARY KEY,
    token_sha256 VARCHAR(64) UNIQUE,
    token_created_at TIMESTAMP NULL,
    token_rotated_at TIMESTAMP NULL,
    todo_project_id BIGINT,
    CONSTRAINT FK_USR_MCP_TOKEN_ACCOUNT FOREIGN KEY (user_id)
        REFERENCES USR_ACCOUNT(id) ON DELETE CASCADE
);
