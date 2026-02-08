package io.github.shizuki.site.media.dto;

public record UploadPolicyResponse(String bucket, String key, String uploadUrl, long expireSeconds) {
}
