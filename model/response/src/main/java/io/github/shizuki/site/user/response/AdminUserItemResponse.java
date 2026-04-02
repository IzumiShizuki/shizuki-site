package io.github.shizuki.site.user.response;

import java.time.LocalDateTime;
import java.util.Set;

public record AdminUserItemResponse(Long userId,
                                    String username,
                                    String nickname,
                                    String email,
                                    Integer emailVerified,
                                    String avatarUrl,
                                    Set<String> groups,
                                    Set<String> permissions,
                                    LocalDateTime createdAt,
                                    LocalDateTime updatedAt) {
}
