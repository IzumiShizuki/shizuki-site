package io.github.shizuki.site.content.response;

public record ContentReportCreateResponse(Long reportId,
                                          String targetType,
                                          Long targetId,
                                          String status) {
}
