# Meguri prompt-cache monitoring

The monolith accepts content-free snapshots at:

```text
POST /api/v1/internal/meguri/prompt-cache
X-Meguri-Metrics-Token: <shared secret>
```

Configure the receiving secret through `MEGURI_METRICS_INGEST_TOKEN`. The
internal path bypasses user-token introspection but still fails closed unless
the dedicated metrics token matches in constant time. Do not reuse an admin
password, LLM key or login token.

Flyway migrations create one latest-snapshot row per Meguri source. The payload
contains numeric Token Usage, cache hit/miss counts, prompt SHA-256, daily
aggregates and recent numeric samples. It must never contain prompt text,
conversation content, RAG chunks, memories or replies.

Authenticated users in the `ADMIN` group can open:

```text
/author?tab=admin%3Aprompt-cache
```

The page calls `GET /api/v1/admin/ops/meguri/prompt-cache`. Data older than
`MEGURI_METRICS_STALE_AFTER_SECONDS` is marked stale; the default is 300
seconds.
