#!/usr/bin/env bash

set -euo pipefail

VOLUME_NAME="${1:-shizuki-memoryos_memoryos-data}"
MODEL_REPO="${2:-sentence-transformers/all-MiniLM-L6-v2}"
HF_ENDPOINT="${HF_ENDPOINT:-https://hf-mirror.com}"
PARTS="${PARTS:-8}"

if ! command -v docker >/dev/null 2>&1; then
  echo "docker is required" >&2
  exit 1
fi

if ! command -v curl >/dev/null 2>&1; then
  echo "curl is required" >&2
  exit 1
fi

if ! command -v python3 >/dev/null 2>&1; then
  echo "python3 is required" >&2
  exit 1
fi

MODEL_NAME="${MODEL_REPO##*/}"
VOLUME_ROOT="$(docker volume inspect --format '{{ .Mountpoint }}' "$VOLUME_NAME")"
MODEL_ROOT="${VOLUME_ROOT}/models/${MODEL_NAME}"
TMP_DIR="/tmp/${MODEL_NAME}-parts"
MODEL_URL="${HF_ENDPOINT}/${MODEL_REPO}/resolve/main/model.safetensors"

mkdir -p "${MODEL_ROOT}/1_Pooling" "${TMP_DIR}"

fetch_small() {
  local rel="$1"
  local dest="${MODEL_ROOT}/${rel}"
  mkdir -p "$(dirname "${dest}")"
  echo "small ${rel}"
  curl -fsSL -o "${dest}" "${HF_ENDPOINT}/${MODEL_REPO}/resolve/main/${rel}"
}

for rel in \
  modules.json \
  config.json \
  config_sentence_transformers.json \
  data_config.json \
  sentence_bert_config.json \
  special_tokens_map.json \
  tokenizer.json \
  tokenizer_config.json \
  vocab.txt \
  1_Pooling/config.json
do
  fetch_small "${rel}"
done

MODEL_SIZE="$(
  curl -sIL "${MODEL_URL}" \
    | tr -d '\r' \
    | awk 'tolower($1)=="content-length:" {print $2}' \
    | tail -1
)"

if [[ -z "${MODEL_SIZE}" ]]; then
  echo "failed to detect model size from ${MODEL_URL}" >&2
  exit 1
fi

CHUNK_SIZE="$(((MODEL_SIZE + PARTS - 1) / PARTS))"
rm -f "${TMP_DIR}"/part.* "${TMP_DIR}"/part.*.tmp

download_part() {
  local index="$1"
  local start="$((index * CHUNK_SIZE))"
  local end="$((start + CHUNK_SIZE - 1))"
  local expected_size="$CHUNK_SIZE"
  local part="${TMP_DIR}/part.${index}"
  local tmp="${TMP_DIR}/part.${index}.tmp"
  local current_size=0

  if (( end >= MODEL_SIZE )); then
    end="$((MODEL_SIZE - 1))"
    expected_size="$((end - start + 1))"
  fi

  while (( current_size < expected_size )); do
    local range_start="$((start + current_size))"
    echo "part ${index} ${range_start}-${end}"
    rm -f "${tmp}"
    curl -fL \
      --retry 8 \
      --retry-delay 3 \
      --retry-all-errors \
      -r "${range_start}-${end}" \
      -o "${tmp}" \
      "${MODEL_URL}"
    cat "${tmp}" >> "${part}"
    rm -f "${tmp}"
    current_size="$(stat -c%s "${part}")"
  done

  if (( current_size != expected_size )); then
    echo "part ${index} size mismatch: expected ${expected_size}, got ${current_size}" >&2
    exit 1
  fi
}

pids=()
for ((i = 0; i < PARTS; i++)); do
  download_part "${i}" &
  pids+=("$!")
done

for pid in "${pids[@]}"; do
  wait "${pid}"
done

cat "${TMP_DIR}"/part.* > "${MODEL_ROOT}/model.safetensors"

python3 - <<PY
import json
from pathlib import Path

root = Path("${MODEL_ROOT}")
required_json = [
    "modules.json",
    "config.json",
    "config_sentence_transformers.json",
    "data_config.json",
    "sentence_bert_config.json",
    "special_tokens_map.json",
    "tokenizer.json",
    "tokenizer_config.json",
    "1_Pooling/config.json",
]

for rel in required_json:
    json.loads((root / rel).read_text())

model_size = (root / "model.safetensors").stat().st_size
if model_size != int("${MODEL_SIZE}"):
    raise SystemExit(f"model size mismatch: expected ${MODEL_SIZE}, got {model_size}")

print(f"model ready: {root}")
print(f"model size: {model_size}")
print(f"use MEMORYOS_EMBEDDING_MODEL_NAME=/var/lib/memoryos/models/${MODEL_NAME}")
PY
