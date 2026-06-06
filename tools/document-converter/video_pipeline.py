from __future__ import annotations

import argparse
import html
import json
import os
import re
import shutil
import subprocess
import tempfile
import time
import urllib.parse
import uuid
from dataclasses import dataclass
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from pathlib import Path
from typing import Any


DEFAULT_ALLOWED_DOMAINS = (
    "youtube.com,www.youtube.com,youtu.be,"
    "bilibili.com,www.bilibili.com,m.bilibili.com,b23.tv"
)


class ApiError(Exception):
    def __init__(self, message: str, status_code: int = 400) -> None:
        super().__init__(message)
        self.message = message
        self.status_code = status_code


@dataclass(frozen=True)
class Settings:
    host: str
    port: int
    work_root: Path
    allowed_domains: tuple[str, ...]
    local_roots: tuple[Path, ...]
    max_duration_seconds: int
    max_download_bytes: int
    max_keyframes: int
    cookies_file: str
    whisper_model: str
    whisper_device: str
    whisper_compute_type: str
    enable_vision: bool
    vision_command: str


def env_int(name: str, default: int) -> int:
    raw = os.getenv(name, "").strip()
    if not raw:
        return default
    try:
        return int(raw)
    except ValueError:
        return default


def env_bool(name: str, default: bool = False) -> bool:
    raw = os.getenv(name, "").strip().lower()
    if not raw:
        return default
    return raw in {"1", "true", "yes", "on"}


def split_csv(raw: str) -> tuple[str, ...]:
    return tuple(item.strip().lower() for item in raw.split(",") if item.strip())


def load_settings() -> Settings:
    work_root = Path(os.getenv("VIDEO_WORK_ROOT", tempfile.gettempdir())).resolve() / "shizuki-video"
    local_roots = tuple(
        Path(item).resolve()
        for item in split_csv(os.getenv("VIDEO_LOCAL_ROOTS", ""))
    )
    return Settings(
        host=os.getenv("VIDEO_CONVERTER_HOST", "0.0.0.0"),
        port=env_int("VIDEO_CONVERTER_PORT", 3220),
        work_root=work_root,
        allowed_domains=split_csv(os.getenv("VIDEO_ALLOWED_DOMAINS", DEFAULT_ALLOWED_DOMAINS)),
        local_roots=local_roots,
        max_duration_seconds=env_int("VIDEO_MAX_DURATION_SECONDS", 7200),
        max_download_bytes=env_int("VIDEO_MAX_DOWNLOAD_BYTES", 1024 * 1024 * 1024),
        max_keyframes=env_int("VIDEO_MAX_KEYFRAMES", 12),
        cookies_file=os.getenv("VIDEO_COOKIES_FILE", "").strip(),
        whisper_model=os.getenv("VIDEO_WHISPER_MODEL", "small"),
        whisper_device=os.getenv("VIDEO_WHISPER_DEVICE", "cpu"),
        whisper_compute_type=os.getenv("VIDEO_WHISPER_COMPUTE_TYPE", "int8"),
        enable_vision=env_bool("VIDEO_ENABLE_VISION", False),
        vision_command=os.getenv("VIDEO_VISION_COMMAND", "").strip(),
    )


SETTINGS = load_settings()


def now_ms() -> int:
    return int(time.time() * 1000)


def command_exists(name: str) -> bool:
    return shutil.which(name) is not None


def tool_status(name: str, available: bool, detail: str = "") -> dict[str, Any]:
    return {"name": name, "available": available, "detail": detail}


def run_command(args: list[str], timeout: int = 300, cwd: Path | None = None) -> subprocess.CompletedProcess[str]:
    return subprocess.run(
        args,
        cwd=str(cwd) if cwd else None,
        check=False,
        capture_output=True,
        text=True,
        timeout=timeout,
    )


def validate_url(source_url: str) -> str:
    normalized = str(source_url or "").strip()
    if not normalized:
        raise ApiError("source_url is required", 400)
    parsed = urllib.parse.urlparse(normalized)
    if parsed.scheme not in {"http", "https"}:
        raise ApiError("Only http/https video URLs are supported", 400)
    host = (parsed.hostname or "").lower()
    if not host:
        raise ApiError("Video URL host is required", 400)
    if not any(host == domain or host.endswith("." + domain) for domain in SETTINGS.allowed_domains):
        raise ApiError("Video URL domain is not allowed", 400)
    return normalized


def validate_local_file(raw_path: str) -> Path:
    if not SETTINGS.local_roots:
        raise ApiError("Local file processing is not enabled", 400)
    path = Path(str(raw_path or "").strip()).resolve()
    if not path.exists() or not path.is_file():
        raise ApiError("Local video file was not found", 404)
    if not any(path == root or root in path.parents for root in SETTINGS.local_roots):
        raise ApiError("Local video file is outside allowed roots", 400)
    return path


def classify_platform(source_url: str) -> str:
    host = (urllib.parse.urlparse(source_url).hostname or "").lower()
    if "youtube.com" in host or host == "youtu.be":
        return "youtube"
    if "bilibili.com" in host or host == "b23.tv":
        return "bilibili"
    return "generic"


def base_yt_dlp_args() -> list[str]:
    args = ["yt-dlp", "--no-warnings", "--no-call-home"]
    if SETTINGS.cookies_file:
        args.extend(["--cookies", SETTINGS.cookies_file])
    return args


def parse_yt_error(stderr: str) -> tuple[str, bool]:
    message = (stderr or "").strip()
    lower = message.lower()
    needs_cookies = any(token in lower for token in ("sign in", "login", "private", "cookies", "members-only"))
    if not message:
        message = "yt-dlp failed"
    return message[-500:], needs_cookies


def inspect_url(source_url: str) -> dict[str, Any]:
    url = validate_url(source_url)
    if not command_exists("yt-dlp"):
        raise ApiError("yt-dlp is not installed", 503)
    result = run_command(
        base_yt_dlp_args() + ["--dump-single-json", "--skip-download", "--no-playlist", url],
        timeout=90,
    )
    if result.returncode != 0:
        message, needs_cookies = parse_yt_error(result.stderr)
        raise ApiError(
            json.dumps({"message": message, "needsCookies": needs_cookies}, ensure_ascii=False),
            403 if needs_cookies else 502,
        )
    try:
        payload = json.loads(result.stdout or "{}")
    except json.JSONDecodeError as exc:
        raise ApiError(f"yt-dlp returned invalid metadata: {exc}", 502)

    duration = int(payload.get("duration") or 0)
    if duration > SETTINGS.max_duration_seconds:
        raise ApiError(f"Video duration exceeds limit: {duration}s", 413)

    subtitles = sorted((payload.get("subtitles") or {}).keys())
    auto_captions = sorted((payload.get("automatic_captions") or {}).keys())
    chapters = [
        {
            "title": str(item.get("title") or "").strip() or "Chapter",
            "start": float(item.get("start_time") or 0),
            "end": float(item.get("end_time") or 0),
        }
        for item in payload.get("chapters") or []
        if isinstance(item, dict)
    ]
    return {
        "sourceUrl": url,
        "platform": classify_platform(url),
        "title": str(payload.get("title") or "").strip(),
        "author": str(payload.get("uploader") or payload.get("channel") or "").strip(),
        "durationSeconds": duration,
        "thumbnailUrl": str(payload.get("thumbnail") or "").strip(),
        "chapters": chapters,
        "availableSubtitles": subtitles,
        "availableAutoCaptions": auto_captions,
        "needsCookies": False,
        "metadata": {
            "id": payload.get("id"),
            "webpageUrl": payload.get("webpage_url") or url,
            "uploadDate": payload.get("upload_date"),
        },
    }


def source_from_payload(payload: dict[str, Any]) -> dict[str, Any]:
    source_url = str(payload.get("sourceUrl") or payload.get("source_url") or payload.get("url") or "").strip()
    file_path = str(payload.get("filePath") or payload.get("file_path") or "").strip()
    if source_url:
        return {"kind": "url", "url": validate_url(source_url)}
    if file_path:
        return {"kind": "file", "path": validate_local_file(file_path)}
    raise ApiError("source_url or file_path is required", 400)


def inspect_source(source: dict[str, Any]) -> dict[str, Any]:
    if source["kind"] == "url":
        return inspect_url(source["url"])
    path = source["path"]
    return {
        "sourceUrl": "",
        "platform": "local",
        "title": path.stem,
        "author": "",
        "durationSeconds": probe_local_duration(path),
        "thumbnailUrl": "",
        "chapters": [],
        "availableSubtitles": [],
        "availableAutoCaptions": [],
        "needsCookies": False,
        "metadata": {"fileName": path.name},
    }


def probe_local_duration(path: Path) -> int:
    if not command_exists("ffprobe"):
        return 0
    result = run_command(
        [
            "ffprobe",
            "-v",
            "error",
            "-show_entries",
            "format=duration",
            "-of",
            "default=noprint_wrappers=1:nokey=1",
            str(path),
        ],
        timeout=30,
    )
    if result.returncode != 0:
        return 0
    try:
        return int(float((result.stdout or "0").strip()))
    except ValueError:
        return 0


def make_work_dir() -> Path:
    SETTINGS.work_root.mkdir(parents=True, exist_ok=True)
    return Path(tempfile.mkdtemp(prefix=f"job-{now_ms()}-", dir=SETTINGS.work_root))


def safe_unlink_tree(path: Path) -> None:
    shutil.rmtree(path, ignore_errors=True)


def choose_subtitle_files(work_dir: Path) -> list[Path]:
    return sorted(
        [
            path
            for path in work_dir.rglob("*")
            if path.suffix.lower() in {".vtt", ".srt"} and path.is_file()
        ],
        key=lambda item: (item.suffix.lower() != ".vtt", item.name),
    )


def download_subtitles(source_url: str, work_dir: Path, languages: list[str]) -> tuple[list[Path], dict[str, Any]]:
    if not command_exists("yt-dlp"):
        return [], tool_status("yt-dlp subtitles", False, "yt-dlp is not installed")
    lang_expr = ",".join(languages or ["zh-Hans", "zh-Hant", "zh", "en", "en.*"])
    output = str(work_dir / "subtitle.%(ext)s")
    result = run_command(
        base_yt_dlp_args()
        + [
            "--skip-download",
            "--write-subs",
            "--write-auto-subs",
            "--sub-langs",
            lang_expr,
            "--sub-format",
            "vtt/srt/best",
            "-o",
            output,
            source_url,
        ],
        timeout=180,
    )
    files = choose_subtitle_files(work_dir)
    if files:
        return files, tool_status("yt-dlp subtitles", True, f"loaded {len(files)} subtitle file(s)")
    if result.returncode != 0:
        message, _ = parse_yt_error(result.stderr)
        return [], tool_status("yt-dlp subtitles", False, message)
    return [], tool_status("yt-dlp subtitles", True, "no platform subtitles found")


TIMESTAMP_RE = re.compile(
    r"(?P<h>\d{1,2}):(?P<m>\d{2}):(?P<s>\d{2})(?P<frac>[,.]\d{1,3})?"
)


def parse_timestamp(raw: str) -> float:
    match = TIMESTAMP_RE.search(raw)
    if not match:
        return 0.0
    frac = (match.group("frac") or "").replace(",", ".")
    return (
        int(match.group("h")) * 3600
        + int(match.group("m")) * 60
        + int(match.group("s"))
        + float(frac or 0)
    )


def clean_caption_text(raw: str) -> str:
    text = re.sub(r"<[^>]+>", "", raw)
    text = html.unescape(text)
    text = re.sub(r"\s+", " ", text)
    return text.strip()


def parse_subtitle_file(path: Path) -> list[dict[str, Any]]:
    lines = path.read_text(encoding="utf-8", errors="ignore").splitlines()
    segments: list[dict[str, Any]] = []
    index = 0
    while index < len(lines):
        line = lines[index].strip()
        if "-->" not in line:
            index += 1
            continue
        start_raw, end_raw = line.split("-->", 1)
        index += 1
        text_lines = []
        while index < len(lines) and lines[index].strip():
            candidate = lines[index].strip()
            if not re.match(r"^\d+$", candidate):
                text_lines.append(candidate)
            index += 1
        text = clean_caption_text(" ".join(text_lines))
        if text:
            segments.append(
                {
                    "start": round(parse_timestamp(start_raw), 3),
                    "end": round(parse_timestamp(end_raw), 3),
                    "text": text,
                }
            )
        index += 1
    return merge_duplicate_segments(segments)


def merge_duplicate_segments(segments: list[dict[str, Any]]) -> list[dict[str, Any]]:
    merged: list[dict[str, Any]] = []
    previous_text = ""
    for segment in segments:
        text = str(segment.get("text") or "").strip()
        if not text or text == previous_text:
            continue
        merged.append(segment)
        previous_text = text
    return merged


def segments_to_text(segments: list[dict[str, Any]]) -> str:
    return "\n".join(str(item.get("text") or "").strip() for item in segments if str(item.get("text") or "").strip())


def format_time(seconds: float) -> str:
    total = max(0, int(seconds))
    hour = total // 3600
    minute = (total % 3600) // 60
    second = total % 60
    return f"{hour:02d}:{minute:02d}:{second:02d}"


def segments_to_markdown(segments: list[dict[str, Any]]) -> str:
    return "\n".join(
        f"- [{format_time(float(item.get('start') or 0))}] {item.get('text', '')}"
        for item in segments
    )


def segments_to_srt(segments: list[dict[str, Any]]) -> str:
    blocks = []
    for index, item in enumerate(segments, start=1):
        blocks.append(
            "\n".join(
                [
                    str(index),
                    f"{format_srt_time(float(item.get('start') or 0))} --> {format_srt_time(float(item.get('end') or 0))}",
                    str(item.get("text") or ""),
                ]
            )
        )
    return "\n\n".join(blocks)


def format_srt_time(seconds: float) -> str:
    total_ms = max(0, int(seconds * 1000))
    hour = total_ms // 3_600_000
    minute = (total_ms % 3_600_000) // 60_000
    second = (total_ms % 60_000) // 1000
    ms = total_ms % 1000
    return f"{hour:02d}:{minute:02d}:{second:02d},{ms:03d}"


def segments_to_vtt(segments: list[dict[str, Any]]) -> str:
    lines = ["WEBVTT", ""]
    for item in segments:
        lines.append(f"{format_vtt_time(float(item.get('start') or 0))} --> {format_vtt_time(float(item.get('end') or 0))}")
        lines.append(str(item.get("text") or ""))
        lines.append("")
    return "\n".join(lines).strip() + "\n"


def format_vtt_time(seconds: float) -> str:
    return format_srt_time(seconds).replace(",", ".")


def download_audio(source: dict[str, Any], work_dir: Path) -> tuple[Path | None, dict[str, Any]]:
    output = work_dir / "audio.wav"
    if source["kind"] == "url":
        if not command_exists("yt-dlp"):
            return None, tool_status("yt-dlp audio", False, "yt-dlp is not installed")
        temp_output = str(work_dir / "audio.%(ext)s")
        result = run_command(
            base_yt_dlp_args()
            + [
                "--no-playlist",
                "--max-filesize",
                str(SETTINGS.max_download_bytes),
                "-f",
                "ba/bestaudio/best",
                "-x",
                "--audio-format",
                "wav",
                "-o",
                temp_output,
                source["url"],
            ],
            timeout=600,
        )
        if result.returncode != 0:
            message, _ = parse_yt_error(result.stderr)
            return None, tool_status("yt-dlp audio", False, message)
        candidates = sorted(work_dir.glob("audio*.wav"))
        return (candidates[0], tool_status("yt-dlp audio", True, "audio extracted")) if candidates else (None, tool_status("yt-dlp audio", False, "audio file missing"))

    if not command_exists("ffmpeg"):
        return None, tool_status("ffmpeg audio", False, "ffmpeg is not installed")
    result = run_command(
        ["ffmpeg", "-y", "-i", str(source["path"]), "-vn", "-ac", "1", "-ar", "16000", str(output)],
        timeout=600,
    )
    if result.returncode != 0:
        return None, tool_status("ffmpeg audio", False, (result.stderr or "").strip()[-500:])
    return output, tool_status("ffmpeg audio", True, "audio extracted")


def transcribe_audio(audio_path: Path) -> tuple[list[dict[str, Any]], dict[str, Any]]:
    try:
        from faster_whisper import WhisperModel  # type: ignore
    except Exception:
        return [], tool_status("faster-whisper", False, "faster-whisper is not installed")
    try:
        model = WhisperModel(
            SETTINGS.whisper_model,
            device=SETTINGS.whisper_device,
            compute_type=SETTINGS.whisper_compute_type,
        )
        segments_iter, info = model.transcribe(str(audio_path), beam_size=5)
        segments = [
            {"start": round(float(segment.start), 3), "end": round(float(segment.end), 3), "text": segment.text.strip()}
            for segment in segments_iter
            if segment.text.strip()
        ]
        language = getattr(info, "language", "")
        return segments, tool_status("faster-whisper", True, f"language={language}")
    except Exception as exc:
        return [], tool_status("faster-whisper", False, str(exc)[-500:])


def transcribe_source(payload: dict[str, Any]) -> dict[str, Any]:
    source = source_from_payload(payload)
    languages = payload.get("preferredLanguages") or payload.get("preferred_languages") or []
    if not isinstance(languages, list):
        languages = []
    work_dir = make_work_dir()
    statuses: list[dict[str, Any]] = []
    try:
        metadata = inspect_source(source)
        segments: list[dict[str, Any]] = []
        transcript_source = "none"
        if source["kind"] == "url":
            subtitle_files, status = download_subtitles(source["url"], work_dir, [str(item) for item in languages])
            statuses.append(status)
            if subtitle_files:
                segments = parse_subtitle_file(subtitle_files[0])
                transcript_source = "platform_subtitle"
        if not segments:
            audio_path, status = download_audio(source, work_dir)
            statuses.append(status)
            if audio_path:
                segments, status = transcribe_audio(audio_path)
                statuses.append(status)
                if segments:
                    transcript_source = "asr"
        text = segments_to_text(segments)
        return {
            "source": metadata,
            "transcriptSource": transcript_source,
            "segments": segments,
            "formats": {
                "txt": text,
                "md": segments_to_markdown(segments),
                "srt": segments_to_srt(segments),
                "vtt": segments_to_vtt(segments),
                "json": segments,
            },
            "toolStatus": statuses,
        }
    finally:
        safe_unlink_tree(work_dir)


def download_video(source: dict[str, Any], work_dir: Path) -> tuple[Path | None, dict[str, Any]]:
    if source["kind"] == "file":
        return source["path"], tool_status("local video", True, "using local file")
    if not command_exists("yt-dlp"):
        return None, tool_status("yt-dlp video", False, "yt-dlp is not installed")
    output = str(work_dir / "video.%(ext)s")
    result = run_command(
        base_yt_dlp_args()
        + [
            "--no-playlist",
            "--max-filesize",
            str(SETTINGS.max_download_bytes),
            "-f",
            "bv*[ext=mp4]+ba/b[ext=mp4]/best",
            "-o",
            output,
            source["url"],
        ],
        timeout=900,
    )
    if result.returncode != 0:
        message, _ = parse_yt_error(result.stderr)
        return None, tool_status("yt-dlp video", False, message)
    candidates = sorted([item for item in work_dir.glob("video.*") if item.is_file()])
    return (candidates[0], tool_status("yt-dlp video", True, "video downloaded")) if candidates else (None, tool_status("yt-dlp video", False, "video file missing"))


def extract_keyframes(video_path: Path, work_dir: Path, max_keyframes: int) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    statuses: list[dict[str, Any]] = []
    frames_dir = work_dir / "frames"
    frames_dir.mkdir(parents=True, exist_ok=True)
    scene_detect_available = command_exists("scenedetect")
    sampler_available = command_exists("video-sampler")
    statuses.append(tool_status("PySceneDetect", scene_detect_available, "available" if scene_detect_available else "not installed"))
    statuses.append(tool_status("video-sampler", sampler_available, "available" if sampler_available else "not installed"))
    if not command_exists("ffmpeg"):
        statuses.append(tool_status("ffmpeg keyframes", False, "ffmpeg is not installed"))
        return [], statuses
    max_frames = max(1, min(max_keyframes, SETTINGS.max_keyframes))
    duration = probe_local_duration(video_path)
    interval = max(10, int((duration or 300) / max_frames))
    result = run_command(
        [
            "ffmpeg",
            "-y",
            "-i",
            str(video_path),
            "-vf",
            f"fps=1/{interval},scale='min(960,iw)':-1",
            "-frames:v",
            str(max_frames),
            str(frames_dir / "keyframe-%04d.jpg"),
        ],
        timeout=300,
    )
    if result.returncode != 0:
        statuses.append(tool_status("ffmpeg keyframes", False, (result.stderr or "").strip()[-500:]))
        return [], statuses
    frames = []
    for index, frame_path in enumerate(sorted(frames_dir.glob("*.jpg")), start=1):
        frames.append(
            {
                "id": frame_path.stem,
                "timestamp": (index - 1) * interval,
                "path": str(frame_path),
                "description": "",
            }
        )
    statuses.append(tool_status("ffmpeg keyframes", True, f"extracted {len(frames)} frame(s)"))
    return frames, statuses


def run_ocr(frames: list[dict[str, Any]]) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    if not frames:
        return [], []
    try:
        from rapidocr_onnxruntime import RapidOCR  # type: ignore
        engine = RapidOCR()
        results = []
        for frame in frames:
            ocr_result, _ = engine(frame["path"])
            texts = []
            for item in ocr_result or []:
                if len(item) >= 2 and str(item[1]).strip():
                    texts.append(str(item[1]).strip())
            results.append({"frameId": frame["id"], "timestamp": frame["timestamp"], "texts": texts})
        return results, [tool_status("RapidOCR", True, "OCR completed")]
    except Exception as rapid_exc:
        try:
            import easyocr  # type: ignore
            reader = easyocr.Reader(["ch_sim", "en"], gpu=False)
            results = []
            for frame in frames:
                items = reader.readtext(frame["path"], detail=0)
                results.append({"frameId": frame["id"], "timestamp": frame["timestamp"], "texts": [str(item) for item in items]})
            return results, [
                tool_status("RapidOCR", False, str(rapid_exc)[-200:]),
                tool_status("EasyOCR", True, "OCR completed"),
            ]
        except Exception as easy_exc:
            return [], [
                tool_status("RapidOCR", False, str(rapid_exc)[-200:]),
                tool_status("EasyOCR", False, str(easy_exc)[-200:]),
            ]


def summarize_text(text: str, max_items: int = 6) -> list[str]:
    normalized = re.sub(r"\s+", " ", text or "").strip()
    if not normalized:
        return []
    sentences = re.split(r"(?<=[。.!?！？])\s+", normalized)
    seen = set()
    result = []
    for sentence in sentences:
        item = sentence.strip()
        if len(item) < 8:
            continue
        key = item[:80]
        if key in seen:
            continue
        seen.add(key)
        result.append(item[:180])
        if len(result) >= max_items:
            break
    return result


def build_timeline(segments: list[dict[str, Any]], chapters: list[dict[str, Any]]) -> list[dict[str, Any]]:
    if chapters:
        return [
            {
                "start": item.get("start", 0),
                "end": item.get("end", 0),
                "title": item.get("title", "Chapter"),
                "summary": "",
            }
            for item in chapters
        ]
    if not segments:
        return []
    every = max(1, len(segments) // 8)
    timeline = []
    for index in range(0, len(segments), every):
        chunk = segments[index:index + every]
        text = " ".join(str(item.get("text") or "") for item in chunk)
        timeline.append(
            {
                "start": chunk[0].get("start", 0),
                "end": chunk[-1].get("end", 0),
                "title": summarize_text(text, 1)[0] if summarize_text(text, 1) else "片段",
                "summary": text[:240],
            }
        )
        if len(timeline) >= 8:
            break
    return timeline


def build_markdown_note(source: dict[str, Any], transcript: dict[str, Any], keyframes: list[dict[str, Any]], ocr: list[dict[str, Any]], timeline: list[dict[str, Any]]) -> str:
    title = source.get("title") or "Video Notes"
    text = transcript.get("formats", {}).get("txt", "")
    bullets = summarize_text(text)
    lines = [f"# {title}", ""]
    if source.get("author"):
        lines.extend([f"- 作者：{source.get('author')}", f"- 平台：{source.get('platform', '')}", f"- 时长：{format_time(float(source.get('durationSeconds') or 0))}", ""])
    lines.extend(["## 摘要", ""])
    if bullets:
        lines.extend([f"- {item}" for item in bullets])
    else:
        lines.append("- 暂无可用字幕或转写文本，已保留视频元数据与关键帧/OCR 结果。")
    lines.extend(["", "## 时间线", ""])
    if timeline:
        for item in timeline:
            lines.append(f"- [{format_time(float(item.get('start') or 0))}] {item.get('title') or item.get('summary') or '片段'}")
    else:
        lines.append("- 暂无时间线。")
    lines.extend(["", "## 关键帧", ""])
    if keyframes:
        for frame in keyframes:
            lines.append(f"- [{format_time(float(frame.get('timestamp') or 0))}] {frame.get('id')}")
    else:
        lines.append("- 未生成关键帧。")
    lines.extend(["", "## 画面文字 OCR", ""])
    has_ocr_text = False
    if ocr:
        for item in ocr:
            texts = " / ".join(item.get("texts") or [])
            if texts:
                has_ocr_text = True
                lines.append(f"- [{format_time(float(item.get('timestamp') or 0))}] {texts}")
    if not has_ocr_text:
        lines.append("- 未识别到画面文字。")
    lines.extend(["", "## 完整转写", ""])
    lines.append(transcript.get("formats", {}).get("md", "") or "暂无转写。")
    lines.extend(["", "> 请确认使用视频内容符合平台规则与版权限制。"])
    return "\n".join(lines).strip() + "\n"


def summarize_source(payload: dict[str, Any]) -> dict[str, Any]:
    source = source_from_payload(payload)
    max_keyframes = int(payload.get("maxKeyframes") or payload.get("max_keyframes") or SETTINGS.max_keyframes)
    transcript = transcribe_source(payload)
    work_dir = make_work_dir()
    statuses = list(transcript.get("toolStatus") or [])
    try:
        source_info = transcript.get("source") or inspect_source(source)
        video_path, status = download_video(source, work_dir)
        statuses.append(status)
        keyframes: list[dict[str, Any]] = []
        ocr: list[dict[str, Any]] = []
        if video_path:
            keyframes, frame_statuses = extract_keyframes(video_path, work_dir, max_keyframes)
            statuses.extend(frame_statuses)
            ocr, ocr_statuses = run_ocr(keyframes)
            statuses.extend(ocr_statuses)
        timeline = build_timeline(transcript.get("segments") or [], source_info.get("chapters") or [])
        markdown = build_markdown_note(source_info, transcript, keyframes, ocr, timeline)
        visual_status = tool_status(
            "visual model",
            SETTINGS.enable_vision and bool(SETTINGS.vision_command),
            "disabled" if not SETTINGS.enable_vision else "external command configured",
        )
        statuses.append(visual_status)
        return {
            "source": source_info,
            "markdown": markdown,
            "summary": summarize_text(transcript.get("formats", {}).get("txt", "")),
            "timeline": timeline,
            "keyframes": [
                {
                    "id": item.get("id"),
                    "timestamp": item.get("timestamp"),
                    "description": item.get("description", ""),
                }
                for item in keyframes
            ],
            "ocr": ocr,
            "transcript": transcript,
            "toolStatus": statuses,
        }
    finally:
        safe_unlink_tree(work_dir)


class Handler(BaseHTTPRequestHandler):
    server_version = "ShizukiDocumentConverter/0.1"

    def log_message(self, format: str, *args: Any) -> None:
        return

    def send_json(self, status: int, payload: dict[str, Any]) -> None:
        body = json.dumps(payload, ensure_ascii=False).encode("utf-8")
        self.send_response(status)
        self.send_header("Content-Type", "application/json; charset=utf-8")
        self.send_header("Content-Length", str(len(body)))
        self.end_headers()
        self.wfile.write(body)

    def read_json(self) -> dict[str, Any]:
        size = int(self.headers.get("Content-Length") or "0")
        if size > 5 * 1024 * 1024:
            raise ApiError("request body too large", 413)
        raw = self.rfile.read(size)
        try:
            payload = json.loads(raw.decode("utf-8") or "{}")
        except json.JSONDecodeError:
            raise ApiError("request body must be JSON", 400)
        if not isinstance(payload, dict):
            raise ApiError("request body must be a JSON object", 400)
        return payload

    def do_GET(self) -> None:
        if self.path == "/health":
            self.send_json(
                200,
                {
                    "success": True,
                    "data": {
                        "service": "document-converter",
                        "status": "ok",
                        "tools": {
                            "ytDlp": command_exists("yt-dlp"),
                            "ffmpeg": command_exists("ffmpeg"),
                            "ffprobe": command_exists("ffprobe"),
                        },
                    },
                },
            )
            return
        self.send_json(404, {"success": False, "message": "Not found"})

    def do_POST(self) -> None:
        request_id = uuid.uuid4().hex
        try:
            payload = self.read_json()
            if self.path == "/v1/video/inspect":
                data = inspect_source(source_from_payload(payload))
            elif self.path == "/v1/video/transcribe":
                data = transcribe_source(payload)
            elif self.path == "/v1/video/summarize":
                data = summarize_source(payload)
            else:
                self.send_json(404, {"success": False, "message": "Not found", "requestId": request_id})
                return
            self.send_json(200, {"success": True, "data": data, "requestId": request_id})
        except ApiError as exc:
            message = exc.message
            extra: dict[str, Any] = {}
            if message.startswith("{"):
                try:
                    parsed = json.loads(message)
                    message = parsed.get("message") or message
                    extra = {key: value for key, value in parsed.items() if key != "message"}
                except json.JSONDecodeError:
                    pass
            self.send_json(exc.status_code, {"success": False, "message": message, "requestId": request_id, **extra})
        except Exception as exc:
            self.send_json(500, {"success": False, "message": str(exc), "requestId": request_id})


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--host", default=SETTINGS.host)
    parser.add_argument("--port", type=int, default=SETTINGS.port)
    args = parser.parse_args()
    SETTINGS.work_root.mkdir(parents=True, exist_ok=True)
    server = ThreadingHTTPServer((args.host, args.port), Handler)
    print(f"document-converter listening on {args.host}:{args.port}", flush=True)
    server.serve_forever()


if __name__ == "__main__":
    main()
