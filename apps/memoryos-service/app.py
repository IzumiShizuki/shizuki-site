from __future__ import annotations

import hashlib
import json
import os
import threading
from collections import defaultdict
from dataclasses import dataclass
from datetime import datetime, timezone
from pathlib import Path
from typing import Any

from flask import Flask, jsonify, request
from memoryos import Memoryos


def _env_int(name: str, default: int) -> int:
    value = os.getenv(name, "").strip()
    if not value:
        return default
    return int(value)


def _env_float(name: str, default: float) -> float:
    value = os.getenv(name, "").strip()
    if not value:
        return default
    return float(value)


@dataclass(frozen=True)
class Settings:
    port: int
    data_root: Path
    openai_api_key: str
    openai_base_url: str | None
    assistant_id: str
    llm_model: str
    embedding_model_name: str
    short_term_capacity: int
    mid_term_capacity: int
    long_term_knowledge_capacity: int
    retrieval_queue_capacity: int
    mid_term_heat_threshold: float
    mid_term_similarity_threshold: float
    default_journal_limit: int


def load_settings() -> Settings:
    return Settings(
        port=_env_int("MEMORYOS_PORT", 8788),
        data_root=Path(os.getenv("MEMORYOS_DATA_ROOT", "/var/lib/memoryos/data")).resolve(),
        openai_api_key=os.getenv("MEMORYOS_OPENAI_API_KEY", "").strip(),
        openai_base_url=os.getenv("MEMORYOS_OPENAI_BASE_URL", "").strip() or None,
        assistant_id=os.getenv("MEMORYOS_DEFAULT_ASSISTANT_ID", "shizuki_memory"),
        llm_model=os.getenv("MEMORYOS_LLM_MODEL", "gpt-4o-mini"),
        embedding_model_name=os.getenv("MEMORYOS_EMBEDDING_MODEL_NAME", "all-MiniLM-L6-v2"),
        short_term_capacity=_env_int("MEMORYOS_SHORT_TERM_CAPACITY", 6),
        mid_term_capacity=_env_int("MEMORYOS_MID_TERM_CAPACITY", 2000),
        long_term_knowledge_capacity=_env_int("MEMORYOS_LONG_TERM_KNOWLEDGE_CAPACITY", 100),
        retrieval_queue_capacity=_env_int("MEMORYOS_RETRIEVAL_QUEUE_CAPACITY", 7),
        mid_term_heat_threshold=_env_float("MEMORYOS_MID_TERM_HEAT_THRESHOLD", 5.0),
        mid_term_similarity_threshold=_env_float("MEMORYOS_MID_TERM_SIMILARITY_THRESHOLD", 0.6),
        default_journal_limit=_env_int("MEMORYOS_DEFAULT_JOURNAL_LIMIT", 20),
    )


SETTINGS = load_settings()
SETTINGS.data_root.mkdir(parents=True, exist_ok=True)

app = Flask(__name__)

_memory_cache: dict[str, Memoryos] = {}
_memory_cache_lock = threading.Lock()
_scope_locks: dict[str, threading.Lock] = defaultdict(threading.Lock)
_scope_locks_lock = threading.Lock()


class ApiError(Exception):
    def __init__(self, message: str, status_code: int = 400) -> None:
        super().__init__(message)
        self.message = message
        self.status_code = status_code


def now_iso() -> str:
    return datetime.now(timezone.utc).isoformat()


def scope_key(scope_id: str) -> str:
    normalized = (scope_id or "").strip()
    if not normalized:
        raise ApiError("scope_id is required", 400)
    digest = hashlib.sha1(normalized.encode("utf-8")).hexdigest()[:12]
    safe_prefix = "".join(ch if ch.isalnum() or ch in "._-" else "_" for ch in normalized).strip("._-")
    if not safe_prefix:
        safe_prefix = "scope"
    return f"{safe_prefix[:64]}-{digest}"


def scope_paths(scope_id: str) -> dict[str, Path]:
    key = scope_key(scope_id)
    root = SETTINGS.data_root / key
    return {
        "root": root,
        "memory_root": root / "memoryos",
        "journal_root": root / "journal",
        "metadata_file": root / "scope.json",
    }


def get_scope_lock(scope_id: str) -> threading.Lock:
    key = scope_key(scope_id)
    with _scope_locks_lock:
        return _scope_locks[key]


def ensure_scope_layout(scope_id: str) -> dict[str, Path]:
    paths = scope_paths(scope_id)
    paths["memory_root"].mkdir(parents=True, exist_ok=True)
    paths["journal_root"].mkdir(parents=True, exist_ok=True)
    metadata_file = paths["metadata_file"]
    if not metadata_file.exists():
        metadata_file.write_text(
            json.dumps(
                {
                    "scope_id": scope_id,
                    "scope_key": scope_key(scope_id),
                    "created_at": now_iso(),
                },
                ensure_ascii=False,
                indent=2,
            ),
            encoding="utf-8",
        )
    return paths


def get_memory(scope_id: str) -> Memoryos:
    key = scope_key(scope_id)
    with _memory_cache_lock:
        cached = _memory_cache.get(key)
        if cached is not None:
            return cached

    paths = ensure_scope_layout(scope_id)
    memory = Memoryos(
        user_id=key,
        openai_api_key=SETTINGS.openai_api_key,
        openai_base_url=SETTINGS.openai_base_url,
        data_storage_path=str(paths["memory_root"]),
        assistant_id=SETTINGS.assistant_id,
        short_term_capacity=SETTINGS.short_term_capacity,
        mid_term_capacity=SETTINGS.mid_term_capacity,
        long_term_knowledge_capacity=SETTINGS.long_term_knowledge_capacity,
        retrieval_queue_capacity=SETTINGS.retrieval_queue_capacity,
        mid_term_heat_threshold=SETTINGS.mid_term_heat_threshold,
        mid_term_similarity_threshold=SETTINGS.mid_term_similarity_threshold,
        llm_model=SETTINGS.llm_model,
        embedding_model_name=SETTINGS.embedding_model_name,
    )

    with _memory_cache_lock:
        existing = _memory_cache.get(key)
        if existing is not None:
            return existing
        _memory_cache[key] = memory
        return memory


def append_journal(scope_id: str, payload: dict[str, Any]) -> dict[str, Any]:
    paths = ensure_scope_layout(scope_id)
    timestamp = str(payload.get("timestamp") or now_iso())
    date_key = timestamp[:10]
    journal_file = paths["journal_root"] / f"{date_key}.jsonl"
    entry = {
        "timestamp": timestamp,
        "scope_id": scope_id,
        "user_input": payload.get("user_input", ""),
        "assistant_response": payload.get("assistant_response", ""),
        "meta_data": payload.get("meta_data") or {},
    }
    with journal_file.open("a", encoding="utf-8") as handle:
        handle.write(json.dumps(entry, ensure_ascii=False) + "\n")
    return entry


def read_journal(scope_id: str, limit: int) -> list[dict[str, Any]]:
    paths = ensure_scope_layout(scope_id)
    remaining = max(limit, 0)
    if remaining == 0:
        return []

    results: list[dict[str, Any]] = []
    for journal_file in sorted(paths["journal_root"].glob("*.jsonl"), reverse=True):
        try:
            lines = journal_file.read_text(encoding="utf-8").splitlines()
        except FileNotFoundError:
            continue
        for raw_line in reversed(lines):
            if not raw_line.strip():
                continue
            try:
                results.append(json.loads(raw_line))
            except json.JSONDecodeError:
                continue
            if len(results) >= remaining:
                return results
    return results


def build_memory_snapshot(memory: Memoryos, scope_id: str, query: str, max_results: int, journal_limit: int) -> dict[str, Any]:
    retrieval_results = memory.retriever.retrieve_context(
        user_query=query,
        user_id=memory.user_id,
    )
    short_term_memory = memory.short_term_memory.get_all()
    user_profile = memory.get_user_profile_summary()
    assistant_knowledge = memory.get_assistant_knowledge_summary()

    episodic = [
        {
            "user_input": page.get("user_input", ""),
            "assistant_response": page.get("agent_response", ""),
            "timestamp": page.get("timestamp", ""),
            "meta_info": page.get("meta_info", ""),
        }
        for page in retrieval_results.get("retrieved_pages", [])[:max_results]
    ]

    summary = {
        "short_term_count": len(short_term_memory),
        "episodic_total": len(retrieval_results.get("retrieved_pages", [])),
        "user_knowledge_total": len(retrieval_results.get("retrieved_user_knowledge", [])),
        "assistant_knowledge_total": len(retrieval_results.get("retrieved_assistant_knowledge", [])),
        "retrieved_user_knowledge": [
            {
                "knowledge": item.get("knowledge", ""),
                "timestamp": item.get("timestamp", ""),
            }
            for item in retrieval_results.get("retrieved_user_knowledge", [])[:max_results]
        ],
        "retrieved_assistant_knowledge": [
            {
                "knowledge": item.get("knowledge", ""),
                "timestamp": item.get("timestamp", ""),
            }
            for item in retrieval_results.get("retrieved_assistant_knowledge", [])[:max_results]
        ],
        "assistant_knowledge": assistant_knowledge[:max_results],
    }

    return {
        "scope_id": scope_id,
        "query": query,
        "profile": user_profile,
        "episodic": episodic,
        "summary": summary,
        "journal": read_journal(scope_id, journal_limit),
        "short_term": short_term_memory,
    }


def get_json_payload() -> dict[str, Any]:
    payload = request.get_json(silent=True)
    if payload is None:
        return {}
    if not isinstance(payload, dict):
        raise ApiError("request body must be a JSON object", 400)
    return payload


def success(payload: dict[str, Any], status_code: int = 200):
    return jsonify({"success": True, "data": payload}), status_code


@app.errorhandler(ApiError)
def handle_api_error(error: ApiError):
    return jsonify({"success": False, "message": error.message}), error.status_code


@app.errorhandler(Exception)
def handle_unexpected_error(error: Exception):
    return jsonify({"success": False, "message": str(error)}), 500


@app.get("/health")
def health():
    return success(
        {
            "service": "memoryos-http",
            "status": "ok",
            "openai_base_url": SETTINGS.openai_base_url or "https://api.openai.com/v1",
            "embedding_model_name": SETTINGS.embedding_model_name,
            "cached_scopes": len(_memory_cache),
        }
    )


@app.post("/api/v1/memory/sessions/<path:scope_id>/records")
def add_record(scope_id: str):
    payload = get_json_payload()
    user_input = str(payload.get("user_input", "")).strip()
    assistant_response = str(payload.get("assistant_response", "")).strip()
    if not user_input:
        raise ApiError("user_input is required", 400)
    if not assistant_response:
        raise ApiError("assistant_response is required", 400)

    timestamp = str(payload.get("timestamp") or now_iso())
    meta_data = payload.get("meta_data")
    if meta_data is not None and not isinstance(meta_data, dict):
        raise ApiError("meta_data must be an object", 400)

    with get_scope_lock(scope_id):
        memory = get_memory(scope_id)
        memory.add_memory(
            user_input=user_input,
            agent_response=assistant_response,
            timestamp=timestamp,
            meta_data=meta_data or {},
        )
        journal_entry = append_journal(
            scope_id,
            {
                "timestamp": timestamp,
                "user_input": user_input,
                "assistant_response": assistant_response,
                "meta_data": meta_data or {},
            },
        )

    return success(
        {
            "scope_id": scope_id,
            "scope_key": scope_key(scope_id),
            "timestamp": timestamp,
            "journal_entry": journal_entry,
        },
        status_code=201,
    )


@app.post("/api/v1/memory/sessions/<path:scope_id>/retrieve")
def retrieve(scope_id: str):
    payload = get_json_payload()
    query = str(payload.get("query", "")).strip()
    if not query:
        raise ApiError("query is required", 400)

    max_results = int(payload.get("max_results") or 10)
    journal_limit = int(payload.get("journal_limit") or SETTINGS.default_journal_limit)
    if max_results < 1:
        raise ApiError("max_results must be greater than 0", 400)
    if journal_limit < 0:
        raise ApiError("journal_limit must be greater than or equal to 0", 400)

    with get_scope_lock(scope_id):
        memory = get_memory(scope_id)
        snapshot = build_memory_snapshot(memory, scope_id, query, max_results, journal_limit)

    return success(snapshot)


@app.get("/api/v1/memory/sessions/<path:scope_id>/profile")
def profile(scope_id: str):
    include_journal = request.args.get("include_journal", "false").lower() == "true"
    journal_limit = int(request.args.get("journal_limit") or SETTINGS.default_journal_limit)
    with get_scope_lock(scope_id):
        memory = get_memory(scope_id)
        payload = {
            "scope_id": scope_id,
            "scope_key": scope_key(scope_id),
            "profile": memory.get_user_profile_summary(),
            "assistant_knowledge": memory.get_assistant_knowledge_summary(),
        }
        if include_journal:
            payload["journal"] = read_journal(scope_id, journal_limit)
    return success(payload)


@app.get("/api/v1/memory/sessions/<path:scope_id>/journal")
def journal(scope_id: str):
    limit = int(request.args.get("limit") or SETTINGS.default_journal_limit)
    if limit < 0:
        raise ApiError("limit must be greater than or equal to 0", 400)
    return success(
        {
            "scope_id": scope_id,
            "entries": read_journal(scope_id, limit),
        }
    )


@app.post("/api/v1/memory/sessions/<path:scope_id>/respond")
def respond(scope_id: str):
    payload = get_json_payload()
    query = str(payload.get("query", "")).strip()
    if not query:
        raise ApiError("query is required", 400)

    relationship_with_user = str(payload.get("relationship_with_user") or "friend")
    style_hint = str(payload.get("style_hint") or "")

    with get_scope_lock(scope_id):
        memory = get_memory(scope_id)
        response_text = memory.get_response(
            query=query,
            relationship_with_user=relationship_with_user,
            style_hint=style_hint,
        )
        journal_entry = append_journal(
            scope_id,
            {
                "timestamp": now_iso(),
                "user_input": query,
                "assistant_response": response_text,
                "meta_data": {
                    "relationship_with_user": relationship_with_user,
                    "style_hint": style_hint,
                },
            },
        )

    return success(
        {
            "scope_id": scope_id,
            "response": response_text,
            "journal_entry": journal_entry,
        }
    )


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=SETTINGS.port)
