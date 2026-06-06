# Shizuki Document Converter

Sidecar for video URL inspection, transcription, keyframe extraction, OCR, and Markdown note generation.

## Endpoints

- `GET /health`
- `POST /v1/video/inspect`
- `POST /v1/video/transcribe`
- `POST /v1/video/summarize`

JSON inputs accept `source_url`/`sourceUrl` for YouTube and Bilibili URLs. Local files are accepted only when `VIDEO_LOCAL_ROOTS` is configured and the supplied `file_path` is inside an allowed root.

## Runtime

The service validates URL domains before calling `yt-dlp`. Cookies are configured only through `VIDEO_COOKIES_FILE`; the frontend must not submit raw cookies.

Default allowed domains:

- `youtube.com`
- `youtu.be`
- `bilibili.com`
- `b23.tv`

Optional visual model integration is disabled by default. Set `VIDEO_ENABLE_VISION=true` and provide a local adapter command through `VIDEO_VISION_COMMAND` after installing a compatible model stack.
