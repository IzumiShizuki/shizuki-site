# MemoryOS Deployment

## Files

- `Dockerfile.memoryos`: builds a slim HTTP wrapper around the official `MemoryOS` repository.
- `deploy/docker-compose.memoryos.yml`: standalone deployment for `MemoryOS`.
- `deploy/.env.memoryos.example`: environment template.
- `deploy/prefetch_memoryos_model.sh`: host-side helper that preloads the embedding model into the Docker volume.
- `apps/memoryos-service/app.py`: HTTP service that adds `scope_id` isolation and journal persistence.

## Service Shape

This deployment uses a vendored snapshot of the official `memoryos-chromadb` implementation and wraps it in a small Flask service.

- `profile`: served from MemoryOS long-term profile.
- `episodic`: served from MemoryOS retrieval results.
- `summary`: returned as structured retrieval counts and knowledge slices.
- `journal`: appended locally as JSONL per `scope_id` and date.

## Endpoints

- `GET /health`
- `POST /api/v1/memory/sessions/<scope_id>/records`
- `POST /api/v1/memory/sessions/<scope_id>/retrieve`
- `GET /api/v1/memory/sessions/<scope_id>/profile`
- `GET /api/v1/memory/sessions/<scope_id>/journal`
- `POST /api/v1/memory/sessions/<scope_id>/respond`

## Server Steps

```bash
cd /opt/shizuki-site/deploy
cp .env.memoryos.example .env.memoryos
# fill MEMORYOS_OPENAI_API_KEY before first boot
docker compose -f docker-compose.memoryos.yml --env-file .env.memoryos up -d --build
docker compose -f docker-compose.memoryos.yml --env-file .env.memoryos ps
curl http://127.0.0.1:8788/health

# preload the embedding model into the Docker volume
./prefetch_memoryos_model.sh

# then pin the runtime to the local model path
sed -i 's#^MEMORYOS_EMBEDDING_MODEL_NAME=.*#MEMORYOS_EMBEDDING_MODEL_NAME=/var/lib/memoryos/models/all-MiniLM-L6-v2#' .env.memoryos
docker compose -f docker-compose.memoryos.yml --env-file .env.memoryos up -d --force-recreate
```

## Notes

- The compose file defaults to `http://host.docker.internal:3000/v1` so the container can reuse the existing `new-api` gateway on the host.
- The compose file also defaults `MEMORYOS_HF_ENDPOINT` to `https://hf-mirror.com`, but on this server the most reliable path is to prefetch `all-MiniLM-L6-v2` into the Docker volume and switch `MEMORYOS_EMBEDDING_MODEL_NAME` to `/var/lib/memoryos/models/all-MiniLM-L6-v2`.
- `MEMORYOS_EMBEDDING_MODEL_NAME=all-MiniLM-L6-v2` is intentionally conservative to reduce memory pressure before the local model path is prepared.
- Verified access patterns:
  - host local: `http://127.0.0.1:8788`
  - same-host containers: `http://host.docker.internal:8788`
- Public access to `8788` may still depend on cloud security-group or ingress configuration outside Docker. Treat the server-local endpoint as the primary integration target.
- Persistent data lives in the Docker volume `memoryos-data`.
- Upstream source snapshot is recorded in `third_party/memoryos-chromadb/UPSTREAM_SOURCE.md`.
