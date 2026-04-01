package io.github.shizuki.site.content.dto;

public record ContentReportCreateResponse(Long reportId,
                                          String targetType,
                                          Long targetId,
                                          String status) {
}
