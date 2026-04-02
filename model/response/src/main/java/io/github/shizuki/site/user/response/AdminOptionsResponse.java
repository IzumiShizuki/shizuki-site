package io.github.shizuki.site.user.response;

import java.util.List;

public record AdminOptionsResponse(List<AdminGroupOptionResponse> groups,
                                   List<String> permissionCatalog,
                                   List<String> quotaCatalog) {
}
