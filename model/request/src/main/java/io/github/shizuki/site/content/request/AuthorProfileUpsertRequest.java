package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.NotEmpty;
import java.util.Map;

public class AuthorProfileUpsertRequest {

    @NotEmpty
    private Map<String, Object> profileJson;

    private Boolean enabled;

    public Map<String, Object> getProfileJson() {
        return profileJson;
    }

    public void setProfileJson(Map<String, Object> profileJson) {
        this.profileJson = profileJson;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
