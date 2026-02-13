package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_POST")
public class PostEntity extends BaseEntity {

    @TableField("post_num")
    private Long postNum;

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("summary_text")
    private String summary;

    @TableField("visibility_status")
    private String visibility;

    @TableField("like_value")
    private Long likeCount;

    public Long getPostNum() {
        return postNum;
    }

    public void setPostNum(Long postNum) {
        this.postNum = postNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

}
