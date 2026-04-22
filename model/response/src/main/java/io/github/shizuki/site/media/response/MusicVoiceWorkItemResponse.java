package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * 音声作品卡片。
 */
@Schema(description = "音声作品卡片")
public record MusicVoiceWorkItemResponse(
    @Schema(description = "作品 ID") long workId,
    @Schema(description = "标题") String title,
    @Schema(description = "社团") String circle,
    @Schema(description = "封面") String cover,
    @Schema(description = "发布日期") String releaseDate,
    @Schema(description = "总时长（秒）") Integer durationSec,
    @Schema(description = "销量") Integer dlCount,
    @Schema(description = "评论数") Integer reviewCount,
    @Schema(description = "评分人数") Integer rateCount,
    @Schema(description = "平均评分") Double rateAverage,
    @Schema(description = "NSFW") boolean nsfw,
    @Schema(description = "年龄分级") String ageCategory,
    @Schema(description = "来源编号（如 RJ 号）") String sourceId,
    @Schema(description = "来源链接") String sourceUrl,
    @Schema(description = "标签列表") List<MusicVoiceTagResponse> tags,
    @Schema(description = "CV 列表") List<String> vas
) {
}
