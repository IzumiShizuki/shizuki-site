package io.github.shizuki.site.content.dto;

public record PostLikeResponse(Long postId,
                               Boolean liked,
                               Long likeCount) {
}
