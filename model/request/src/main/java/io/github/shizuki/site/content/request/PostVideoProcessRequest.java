package io.github.shizuki.site.content.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Size;
import java.util.List;

public class PostVideoProcessRequest {

    @JsonAlias("sourceUrl")
    @Size(max = 2048)
    private String sourceUrl;

    @JsonAlias("filePath")
    @Size(max = 1024)
    private String filePath;

    @JsonAlias("preferredLanguages")
    private List<String> preferredLanguages;

    @JsonAlias("maxKeyframes")
    private Integer maxKeyframes;

    @JsonAlias("includeVision")
    private Boolean includeVision;

    @JsonAlias("outputFormat")
    @Size(max = 16)
    private String outputFormat;

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getPreferredLanguages() {
        return preferredLanguages;
    }

    public void setPreferredLanguages(List<String> preferredLanguages) {
        this.preferredLanguages = preferredLanguages;
    }

    public Integer getMaxKeyframes() {
        return maxKeyframes;
    }

    public void setMaxKeyframes(Integer maxKeyframes) {
        this.maxKeyframes = maxKeyframes;
    }

    public Boolean getIncludeVision() {
        return includeVision;
    }

    public void setIncludeVision(Boolean includeVision) {
        this.includeVision = includeVision;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }
}
