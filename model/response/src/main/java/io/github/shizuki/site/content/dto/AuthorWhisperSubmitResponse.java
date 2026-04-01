package io.github.shizuki.site.content.dto;

public record AuthorWhisperSubmitResponse(Long whisperId,
                                          String status,
                                          Long targetPostId,
                                          Boolean accepted) {
}
