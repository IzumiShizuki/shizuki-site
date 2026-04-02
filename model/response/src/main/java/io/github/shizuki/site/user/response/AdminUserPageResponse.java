package io.github.shizuki.site.user.response;

import java.util.List;

public record AdminUserPageResponse(Integer page,
                                    Integer pageSize,
                                    Long total,
                                    List<AdminUserItemResponse> items) {
}
