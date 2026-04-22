package io.github.shizuki.site.media.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import java.util.Map;

/**
 * 音声作品详情。
 */
@Schema(description = "音声作品详情")
public record MusicVoiceWorkDetailResponse(
    @Schema(description = "作品 ID") long workId,
    @Schema(description = "标题") String title,
    @Schema(description = "社团") String circle,
    @Schema(description = "封面") String cover,
    @Schema(description = "NSFW") boolean nsfw,
    @Schema(description = "年龄分级") String ageCategory,
    @Schema(description = "发布日期") String releaseDate,
    @Schema(description = "总时长（秒）") Integer durationSec,
    @Schema(description = "销量") Integer dlCount,
    @Schema(description = "评论数") Integer reviewCount,
    @Schema(description = "评分人数") Integer rateCount,
    @Schema(description = "平均评分") Double rateAverage,
    @Schema(description = "排行信息") Map<String, Object> rank,
    @Schema(description = "标签列表") List<MusicVoiceTagResponse> tags,
    @Schema(description = "CV 列表") List<String> vas,
    @Schema(description = "语言版本信息") List<Map<String, Object>> languageEditions,
    @Schema(description = "来源编号（如 RJ 号）") String sourceId,
    @Schema(description = "来源链接") String sourceUrl,
    @Schema(description = "原始作品编号") String originalWorkNo,
    @Schema(description = "作品简介 / 评论文本") String reviewText,
    @Schema(description = "原始扩展字段") Map<String, Object> extra
) {
}
