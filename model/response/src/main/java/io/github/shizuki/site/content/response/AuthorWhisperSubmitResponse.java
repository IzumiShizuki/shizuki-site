package io.github.shizuki.site.content.response;

public record AuthorWhisperSubmitResponse(Long whisperId,
                                          String status,
                                          Long targetPostId,
                                          Boolean accepted) {
}
