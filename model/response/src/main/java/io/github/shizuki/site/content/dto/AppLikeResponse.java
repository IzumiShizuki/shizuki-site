package io.github.shizuki.site.content.dto;

public record AppLikeResponse(Long appId,
                              Boolean liked,
                              Long likeCount) {
}
