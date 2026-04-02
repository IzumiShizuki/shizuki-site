package io.github.shizuki.site.content.response;

public record PostLikeResponse(Long postId,
                               Boolean liked,
                               Long likeCount) {
}
