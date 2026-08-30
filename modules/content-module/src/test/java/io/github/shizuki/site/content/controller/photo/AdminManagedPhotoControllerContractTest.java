package io.github.shizuki.site.content.controller.photo;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;

class AdminManagedPhotoControllerContractTest {

    @Test
    void keepsThePhotoLibraryInsideTheScopedAdministratorNamespace() {
        RequestMapping mapping = AdminManagedPhotoController.class.getAnnotation(RequestMapping.class);
        RequireGroup group = AdminManagedPhotoController.class.getAnnotation(RequireGroup.class);
        RequirePermission permission = AdminManagedPhotoController.class.getAnnotation(RequirePermission.class);

        assertThat(mapping.value()).containsExactly("/api/v1/admin/life/photos");
        assertThat(group.value()).isEqualTo("ADMIN");
        assertThat(permission.value()).isEqualTo("life.content.manage");
    }

    @Test
    void neverReturnsAnAssetIdOrStorageIdentity() {
        Set<String> responseFields = Arrays.stream(AdminManagedPhotoResponse.class.getRecordComponents())
            .map(component -> component.getName().toLowerCase())
            .collect(Collectors.toSet());

        assertThat(responseFields)
            .doesNotContain("assetid", "originalassetid", "bucket", "key", "objectkey", "storagekey");
    }
}
