package io.github.shizuki.site.content.request;

import java.util.Set;

public class PostCategoryPolicyUpdateRequest {

    private Boolean enabled;

    private Set<String> allowedGroupCodes;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<String> getAllowedGroupCodes() {
        return allowedGroupCodes;
    }

    public void setAllowedGroupCodes(Set<String> allowedGroupCodes) {
        this.allowedGroupCodes = allowedGroupCodes;
    }
}
