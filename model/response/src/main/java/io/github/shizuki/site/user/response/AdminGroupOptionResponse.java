package io.github.shizuki.site.user.response;

public record AdminGroupOptionResponse(String groupCode,
                                       String displayName,
                                       String status,
                                       Integer builtIn) {
}
