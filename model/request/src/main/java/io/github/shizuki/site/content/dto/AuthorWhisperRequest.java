package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "作者悄悄话请求")
public class AuthorWhisperRequest {

    @NotBlank
    @Size(max = 180)
    @Schema(description = "悄悄话正文", example = "你好，博客很棒，想交流前端动画实现思路。")
    private String content;

    @Size(max = 40)
    @Schema(description = "昵称（可选）", example = "匿名访客")
    private String nickname;

    @Size(max = 120)
    @Schema(description = "备注/联系方式（可选）", example = "可回邮件：demo@example.com")
    private String remark;

    @Schema(description = "关联文章 ID（可选）", example = "1001")
    private Long postId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
