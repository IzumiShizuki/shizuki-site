package io.github.shizuki.site.user.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.site.user.response.AdminPermissionOptionResponse;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class AdminCatalogDefaultsTest {

    @Test
    void exposesPersonalContentPermissionsAsBuiltInAdminOptions() {
        Map<String, AdminPermissionOptionResponse> options = AdminCatalogDefaults.builtinPermissions().stream()
            .collect(Collectors.toMap(AdminPermissionOptionResponse::code, Function.identity()));

        assertThat(options)
            .containsKeys("life.content.manage", "site.widgets.manage", "media.derivative.manage");
        assertThat(options.get("life.content.manage").builtIn()).isTrue();
        assertThat(options.get("site.widgets.manage").category()).isEqualTo("后台·站点");
        assertThat(options.get("media.derivative.manage").category()).isEqualTo("后台·媒体");
    }

    @Test
    void classifiesPersonalContentPermissionPrefixes() {
        assertThat(AdminCatalogDefaults.customPermission("life.custom").category()).isEqualTo("后台·内容");
        assertThat(AdminCatalogDefaults.customPermission("site.custom").category()).isEqualTo("后台·站点");
        assertThat(AdminCatalogDefaults.customPermission("media.custom").category()).isEqualTo("后台·媒体");
    }
}
