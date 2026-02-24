package io.github.shizuki.site.user.dto;

public record AdminGroupOptionResponse(String groupCode,
                                       String displayName,
                                       String status,
                                       Integer builtIn) {
}
