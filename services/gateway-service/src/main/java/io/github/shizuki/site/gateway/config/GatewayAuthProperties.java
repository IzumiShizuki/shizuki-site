package io.github.shizuki.site.gateway.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.gateway.auth")
public class GatewayAuthProperties {

    private boolean enabled = true;
    private String userServiceIntrospectUrl = "http://localhost:8081/api/v1/auth/introspect";
    private List<String> publicPaths = new ArrayList<>();
    private List<String> guestPaths = new ArrayList<>();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUserServiceIntrospectUrl() {
        return userServiceIntrospectUrl;
    }

    public void setUserServiceIntrospectUrl(String userServiceIntrospectUrl) {
        this.userServiceIntrospectUrl = userServiceIntrospectUrl;
    }

    public List<String> getPublicPaths() {
        return publicPaths;
    }

    public void setPublicPaths(List<String> publicPaths) {
        this.publicPaths = publicPaths;
    }

    public List<String> getGuestPaths() {
        return guestPaths;
    }

    public void setGuestPaths(List<String> guestPaths) {
        this.guestPaths = guestPaths;
    }
}
