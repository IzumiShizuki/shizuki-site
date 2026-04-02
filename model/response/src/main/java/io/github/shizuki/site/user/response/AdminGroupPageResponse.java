package io.github.shizuki.site.user.response;

import java.util.List;

public record AdminGroupPageResponse(Integer page,
                                     Integer pageSize,
                                     Long total,
                                     List<AdminGroupItemResponse> items) {
}
