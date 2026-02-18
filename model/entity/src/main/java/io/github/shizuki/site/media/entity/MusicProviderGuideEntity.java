package io.github.shizuki.site.media.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

/**
 * 音乐 provider API Key 引导文档实体。
 */
@TableName("MDA_MUSIC_PROVIDER_GUIDE")
public class MusicProviderGuideEntity extends BaseEntity {

    @TableField("provider_code")
    private String providerCode;

    @TableField("guide_title")
    private String guideTitle;

    @TableField("guide_text")
    private String guideText;

    @TableField("guide_link")
    private String guideLink;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getGuideTitle() {
        return guideTitle;
    }

    public void setGuideTitle(String guideTitle) {
        this.guideTitle = guideTitle;
    }

    public String getGuideText() {
        return guideText;
    }

    public void setGuideText(String guideText) {
        this.guideText = guideText;
    }

    public String getGuideLink() {
        return guideLink;
    }

    public void setGuideLink(String guideLink) {
        this.guideLink = guideLink;
    }
}
