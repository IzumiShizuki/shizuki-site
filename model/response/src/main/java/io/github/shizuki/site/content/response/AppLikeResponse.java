package io.github.shizuki.site.content.response;

public record AppLikeResponse(Long appId,
                              Boolean liked,
                              Long likeCount) {
}
