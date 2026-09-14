package io.github.shizuki.site.content.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LoginAppearanceEntity;
import io.github.shizuki.site.content.mapper.LoginAppearanceMapper;
import io.github.shizuki.site.content.request.LoginAppearanceSaveRequest;
import io.github.shizuki.site.content.response.LoginAppearanceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LoginAppearanceServiceTest {

    @Mock
    private LoginAppearanceMapper appearanceMapper;

    private LoginAppearanceService service() {
        return new LoginAppearanceService(appearanceMapper);
    }

    @Test
    void publicSnapshotReturnsNullWhenNothingIsConfigured() {
        when(appearanceMapper.selectById(LoginAppearanceService.SINGLETON_KEY)).thenReturn(null);

        assertThat(service().publicSnapshot()).isNull();
    }

    @Test
    void saveInsertsFirstConfigurationWithNextVersion() {
        when(appearanceMapper.selectById(LoginAppearanceService.SINGLETON_KEY)).thenReturn(null);

        LoginAppearanceResponse result = service().save(new LoginAppearanceSaveRequest(
            0, "peach", "https://example.com/bg.png", "https://example.com/mascot.png"
        ));

        assertThat(result.themePreset()).isEqualTo("peach");
        assertThat(result.bgImageUrl()).isEqualTo("https://example.com/bg.png");
        assertThat(result.mascotImageUrl()).isEqualTo("https://example.com/mascot.png");
        assertThat(result.version()).isEqualTo(1);

        ArgumentCaptor<LoginAppearanceEntity> captor = ArgumentCaptor.forClass(LoginAppearanceEntity.class);
        verify(appearanceMapper).insert(captor.capture());
        assertThat(captor.getValue().getSingletonKey()).isEqualTo(LoginAppearanceService.SINGLETON_KEY);
        assertThat(captor.getValue().getVersion()).isEqualTo(1);
    }

    @Test
    void saveRejectsUnknownPreset() {
        assertThatThrownBy(() -> service().save(new LoginAppearanceSaveRequest(0, "neon", "", "")))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("unsupported theme preset");
    }

    @Test
    void saveRejectsNonHttpImageUrls() {
        assertThatThrownBy(() -> service().save(new LoginAppearanceSaveRequest(0, "milkshake", "javascript:alert(1)", "")))
            .isInstanceOf(BusinessException.class)
            .hasMessageContaining("image url");
    }

    @Test
    void saveThrowsConflictOnStaleVersion() {
        LoginAppearanceEntity existing = existing(3);
        when(appearanceMapper.selectById(LoginAppearanceService.SINGLETON_KEY)).thenReturn(existing);

        assertThatThrownBy(() -> service().save(new LoginAppearanceSaveRequest(1, "milkshake", "", "")))
            .isInstanceOf(BusinessException.class)
            .extracting("errorCode")
            .isEqualTo(ErrorCode.CONFLICT);
    }

    @Test
    void saveUpdatesExistingRowViaVersionedSql() {
        LoginAppearanceEntity existing = existing(2);
        LoginAppearanceEntity updated = updated(3);
        when(appearanceMapper.selectById(LoginAppearanceService.SINGLETON_KEY)).thenReturn(existing, updated);
        when(appearanceMapper.updateVersioned(
            LoginAppearanceService.SINGLETON_KEY, 2, "mint", "", "https://example.com/mascot.png"
        )).thenReturn(1);

        LoginAppearanceResponse result = service().save(new LoginAppearanceSaveRequest(
            2, "mint", "", "https://example.com/mascot.png"
        ));

        assertThat(result.themePreset()).isEqualTo("mint");
        assertThat(result.mascotImageUrl()).isEqualTo("https://example.com/mascot.png");
        assertThat(result.version()).isEqualTo(3);
    }

    private static LoginAppearanceEntity existing(int version) {
        LoginAppearanceEntity entity = new LoginAppearanceEntity();
        entity.setSingletonKey(LoginAppearanceService.SINGLETON_KEY);
        entity.setThemePreset("milkshake");
        entity.setDeleted(0);
        entity.setVersion(version);
        return entity;
    }

    private static LoginAppearanceEntity updated(int version) {
        LoginAppearanceEntity entity = existing(version);
        entity.setThemePreset("mint");
        entity.setMascotImageUrl("https://example.com/mascot.png");
        return entity;
    }
}
