package io.github.shizuki.site.user.dto;

import java.time.LocalDateTime;

public record AdminGroupItemResponse(String groupCode,
                                     String displayName,
                                     String description,
                                     String status,
                                     Integer builtIn,
                                     Integer sortNum,
                                     Long userCount,
                                     Long permissionCount,
                                     Long quotaCount,
                                     LocalDateTime createdAt,
                                     LocalDateTime updatedAt) {
}
