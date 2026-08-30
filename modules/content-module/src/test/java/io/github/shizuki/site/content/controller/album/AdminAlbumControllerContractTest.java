package io.github.shizuki.site.content.controller.album;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;

class AdminAlbumControllerContractTest {

    @Test
    void controllerRequiresAdminAndScopedPermissionForReadsAndWrites() throws Exception {
        RequireGroup group = AdminAlbumController.class.getAnnotation(RequireGroup.class);
        RequirePermission permission = AdminAlbumController.class.getAnnotation(RequirePermission.class);

        assertThat(group).isNotNull();
        assertThat(group.value()).isEqualTo("ADMIN");
        assertThat(permission).isNotNull();
        assertThat(permission.value()).isEqualTo("life.content.manage");

        assertThat(Arrays.stream(AdminAlbumController.class.getDeclaredMethods())
            .filter(method -> method.isAnnotationPresent(AuditLog.class))
            .count()).isGreaterThanOrEqualTo(9);
    }

    @Test
    void previewIsDedicatedAdminRoute() throws Exception {
        Method preview = AdminAlbumController.class.getDeclaredMethod("preview", long.class);
        GetMapping mapping = preview.getAnnotation(GetMapping.class);

        assertThat(mapping.value()).containsExactly("/{album_id}/preview");
        assertThat(HttpHeaders.IF_MATCH).isEqualTo("If-Match");
    }
}
