package io.github.shizuki.site.user.dto;

import jakarta.validation.constraints.NotNull;
import java.util.Map;

public class PreferenceUpdateRequest {

    @NotNull
    private Map<String, Object> preferenceJson;

    public Map<String, Object> getPreferenceJson() {
        return preferenceJson;
    }

    public void setPreferenceJson(Map<String, Object> preferenceJson) {
        this.preferenceJson = preferenceJson;
    }
}
