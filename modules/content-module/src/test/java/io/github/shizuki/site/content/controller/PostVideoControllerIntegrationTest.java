package io.github.shizuki.site.content.controller;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import io.github.shizuki.site.content.response.PostVideoToolStatus;
import io.github.shizuki.site.content.response.PostVideoTranscriptResponse;
import io.github.shizuki.site.content.service.PostVideoService;
import io.github.shizuki.site.content.support.ApiErrorAssertions;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(PostVideoController.class)
class PostVideoControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostVideoService postVideoService;

    @Test
    void shouldInspectVideoSuccessfully() throws Exception {
        Mockito.when(postVideoService.inspect(ArgumentMatchers.any()))
            .thenReturn(new PostVideoSourceResponse(
                "https://www.youtube.com/watch?v=abc",
                "youtube",
                "Demo Video",
                "Author",
                120,
                "https://example.com/thumb.jpg",
                List.of(new PostVideoSourceResponse.ChapterItem("Intro", 0.0, 30.0)),
                List.of("en"),
                List.of("zh-Hans"),
                false,
                Map.of("id", "abc")
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/posts/video/inspect")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "source_url": "https://www.youtube.com/watch?v=abc"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.platform").value("youtube"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("Demo Video"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.chapters[0].title").value("Intro"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.available_subtitles[0]").value("en"));
    }

    @Test
    void shouldSummarizeVideoSuccessfully() throws Exception {
        PostVideoSourceResponse source = new PostVideoSourceResponse(
            "https://www.bilibili.com/video/BV1xx411c7mD",
            "bilibili",
            "Bili Demo",
            "UP",
            60,
            "",
            List.of(),
            List.of(),
            List.of(),
            false,
            Map.of()
        );
        PostVideoTranscriptResponse transcript = new PostVideoTranscriptResponse(
            source,
            "platform_subtitle",
            List.of(new PostVideoTranscriptResponse.SegmentItem(0.0, 3.0, "hello")),
            new PostVideoTranscriptResponse.FormatBundle("hello", "- [00:00:00] hello", "1\n00:00:00,000 --> 00:00:03,000\nhello", "WEBVTT", List.of()),
            List.of()
        );
        Mockito.when(postVideoService.summarize(ArgumentMatchers.any()))
            .thenReturn(new PostVideoSummaryResponse(
                source,
                "# Bili Demo\n",
                List.of("hello"),
                List.of(new PostVideoSummaryResponse.TimelineItem(0.0, 3.0, "Intro", "hello")),
                List.of(new PostVideoSummaryResponse.KeyframeItem("keyframe-0001", 0.0, "")),
                List.of(new PostVideoSummaryResponse.OcrItem("keyframe-0001", 0.0, List.of("Slide title"))),
                transcript,
                List.of(new PostVideoToolStatus("yt-dlp", true, "ok"))
            ));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/posts/video/summarize")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "source_url": "https://www.bilibili.com/video/BV1xx411c7mD"
                    }
                    """))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("OK"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.markdown").value("# Bili Demo\n"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.timeline[0].title").value("Intro"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.ocr[0].texts[0]").value("Slide title"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.data.tool_status[0].name").value("yt-dlp"));
    }

    @Test
    void shouldReturnProblemWhenVideoDomainRejected() throws Exception {
        Mockito.when(postVideoService.inspect(ArgumentMatchers.any()))
            .thenThrow(new BusinessException(ErrorCode.BAD_REQUEST, "Video URL domain is not allowed"));

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/me/posts/video/inspect")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "source_url": "https://example.com/video"
                    }
                    """))
            .andExpect(ApiErrorAssertions.hasProblem(400, "BAD_REQUEST"));
    }
}
