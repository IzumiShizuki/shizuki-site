package io.github.shizuki.site.content.request;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PostNotionSyncJobCreateRequest {

    private String direction;

    @JsonAlias("targetType")
    private String targetType;

    @JsonAlias("postId")
    private Long postId;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
