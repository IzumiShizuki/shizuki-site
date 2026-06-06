from __future__ import annotations

import unittest
from pathlib import Path
import sys

sys.path.insert(0, str(Path(__file__).resolve().parents[1]))
import video_pipeline


class VideoPipelineTest(unittest.TestCase):
    def test_rejects_non_whitelisted_domain(self) -> None:
        with self.assertRaises(video_pipeline.ApiError) as ctx:
            video_pipeline.validate_url("https://example.com/watch?v=1")

        self.assertEqual(400, ctx.exception.status_code)
        self.assertIn("domain is not allowed", ctx.exception.message)

    def test_accepts_youtube_and_bilibili_domains(self) -> None:
        self.assertEqual(
            "https://www.youtube.com/watch?v=abc",
            video_pipeline.validate_url("https://www.youtube.com/watch?v=abc"),
        )
        self.assertEqual(
            "https://www.bilibili.com/video/BV1xx411c7mD",
            video_pipeline.validate_url("https://www.bilibili.com/video/BV1xx411c7mD"),
        )

    def test_parses_vtt_segments(self) -> None:
        temp_dir = video_pipeline.make_work_dir()
        try:
            subtitle = temp_dir / "sample.vtt"
            subtitle.write_text(
                "\n".join(
                    [
                        "WEBVTT",
                        "",
                        "00:00:00.000 --> 00:00:02.000",
                        "Hello <b>world</b>",
                        "",
                        "00:00:02.000 --> 00:00:04.500",
                        "Hello <b>world</b>",
                        "",
                        "00:00:05.000 --> 00:00:08.000",
                        "Next point",
                    ]
                ),
                encoding="utf-8",
            )

            segments = video_pipeline.parse_subtitle_file(subtitle)

            self.assertEqual(2, len(segments))
            self.assertEqual("Hello world", segments[0]["text"])
            self.assertEqual(5.0, segments[1]["start"])
        finally:
            video_pipeline.safe_unlink_tree(temp_dir)

    def test_builds_markdown_note_without_transcript(self) -> None:
        markdown = video_pipeline.build_markdown_note(
            {"title": "Demo", "platform": "youtube", "durationSeconds": 60},
            {"formats": {"md": "", "txt": ""}},
            [],
            [],
            [],
        )

        self.assertIn("# Demo", markdown)
        self.assertIn("暂无可用字幕或转写文本", markdown)
        self.assertIn("请确认使用视频内容符合平台规则与版权限制", markdown)


if __name__ == "__main__":
    unittest.main()
