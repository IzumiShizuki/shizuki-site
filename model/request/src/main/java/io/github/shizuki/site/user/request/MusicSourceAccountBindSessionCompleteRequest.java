package io.github.shizuki.site.user.request;

import jakarta.validation.constraints.NotBlank;

/**
 * 音乐源账号绑定会话完成请求。
 */
public class MusicSourceAccountBindSessionCompleteRequest {

    @NotBlank
    private String bindToken;

    @NotBlank
    private String cookieBundle;

    private String helperVersion;

    public String getBindToken() {
        return bindToken;
    }

    public void setBindToken(String bindToken) {
        this.bindToken = bindToken;
    }

    public String getCookieBundle() {
        return cookieBundle;
    }

    public void setCookieBundle(String cookieBundle) {
        this.cookieBundle = cookieBundle;
    }

    public String getHelperVersion() {
        return helperVersion;
    }

    public void setHelperVersion(String helperVersion) {
        this.helperVersion = helperVersion;
    }
}
