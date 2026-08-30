package io.github.shizuki.site.content.service.widget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import java.math.BigDecimal;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SiteWidgetConfigurationServiceTest {

    @Mock
    private SiteLocationMapper locationMapper;
    @Mock
    private SiteWidgetConfigMapper configMapper;
    @Mock
    private SiteWidgetCacheInvalidator cacheInvalidator;

    private SiteWidgetConfigurationService service;

    @BeforeEach
    void setUp() {
        service = new SiteWidgetConfigurationService(locationMapper, configMapper, cacheInvalidator);
        LoginUserContext.set(new LoginUser(
            7L,
            Set.of("ADMIN"),
            Set.of("site.widgets.manage")
        ));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void createsSingletonAndAtomicallySelectsOnlyTheValidatedLocation() {
        when(configMapper.selectById(SiteWidgetConfigurationService.SINGLETON_KEY)).thenReturn(null);
        when(locationMapper.insert(any(SiteLocationEntity.class))).thenAnswer(invocation -> {
            SiteLocationEntity location = invocation.getArgument(0);
            location.setId(31L);
            return 1;
        });
        when(configMapper.insert(any(SiteWidgetConfigEntity.class))).thenReturn(1);

        SiteWidgetConfigurationSnapshot saved = service.save(command(0, " 上海 ", "31.2304004", "121.4737004"));

        assertThat(saved.version()).isEqualTo(1);
        assertThat(saved.activeLocationId()).isEqualTo(31L);
        assertThat(saved.displayName()).isEqualTo("上海");
        assertThat(saved.latitude()).isEqualByComparingTo("31.230400");
        assertThat(saved.longitude()).isEqualByComparingTo("121.473700");
        ArgumentCaptor<SiteWidgetConfigEntity> config = ArgumentCaptor.forClass(SiteWidgetConfigEntity.class);
        verify(configMapper).insert(config.capture());
        assertThat(config.getValue().getSingletonKey()).isEqualTo("SITE");
        assertThat(config.getValue().getVersion()).isEqualTo(1);
        InOrder switchOrder = inOrder(locationMapper);
        switchOrder.verify(locationMapper).disableAllExcept(31L);
        switchOrder.verify(locationMapper).enableIfDisabled(31L);
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(null, 31L, true, true));
    }

    @Test
    void sameLocationUsesOptimisticUpdateWithoutCreatingADuplicateLocation() {
        SiteLocationEntity location = location(31L, "上海", "31.230400", "121.473700", "Asia/Shanghai");
        SiteWidgetConfigEntity current = config(3, 31L, true, 360, "LOCAL", false);
        when(configMapper.selectById("SITE")).thenReturn(current);
        when(locationMapper.selectById(31L)).thenReturn(location);
        when(configMapper.updateVersioned("SITE", 3, 31L, 1, 360, "LOCAL", 0)).thenReturn(1);

        SiteWidgetConfigurationSnapshot saved = service.save(command(3, "上海", "31.2304", "121.4737"));

        assertThat(saved.version()).isEqualTo(4);
        verify(locationMapper, never()).insert(any(SiteLocationEntity.class));
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(31L, 31L, false, false));
    }

    @Test
    void staleVersionReportsCurrentVersionAndPerformsNoWrites() {
        when(configMapper.selectById("SITE")).thenReturn(config(5, 31L, true, 360, "LOCAL", false));

        assertThatThrownBy(() -> service.save(command(4, "上海", "31.2304", "121.4737")))
            .isInstanceOfSatisfying(BusinessException.class, exception -> {
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
                assertThat(exception.getDetails()).containsEntry("currentVersion", 5);
            });
        verify(locationMapper, never()).insert(any(SiteLocationEntity.class));
        verify(configMapper, never()).updateVersioned(
            anyString(), anyInt(), anyLong(), anyInt(), anyInt(), anyString(), anyInt()
        );
        verify(cacheInvalidator, never()).invalidate(any());
    }

    @Test
    void sourceModeSwitchIsVersionedAndInvalidatesOnlyQuoteCache() {
        SiteLocationEntity location = location(31L, "上海", "31.230400", "121.473700", "Asia/Shanghai");
        SiteWidgetConfigEntity current = config(2, 31L, true, 360, "HITOKOTO", true);
        when(configMapper.selectById("SITE")).thenReturn(current);
        when(locationMapper.selectById(31L)).thenReturn(location);
        when(configMapper.updateVersioned("SITE", 2, 31L, 1, 360, "LOCAL", 0)).thenReturn(1);
        SiteWidgetConfigurationCommand command = new SiteWidgetConfigurationCommand(
            2,
            "上海",
            new BigDecimal("31.2304"),
            new BigDecimal("121.4737"),
            "Asia/Shanghai",
            true,
            360,
            "LOCAL",
            false
        );

        SiteWidgetConfigurationSnapshot saved = service.save(command);

        assertThat(saved.quoteSourceMode()).isEqualTo(SiteWidgetQuoteSourceMode.LOCAL);
        assertThat(saved.hitokotoEnabled()).isFalse();
        verify(cacheInvalidator).invalidate(new SiteWidgetCacheInvalidation(31L, 31L, false, true));
        verify(locationMapper, never()).insert(any(SiteLocationEntity.class));
    }

    @Test
    void rejectsInvalidSettingsAndRequiresScopedAdministrator() {
        assertThatThrownBy(() -> service.save(new SiteWidgetConfigurationCommand(
            0,
            "上海",
            new BigDecimal("91"),
            new BigDecimal("121.47"),
            "Asia/Shanghai",
            true,
            360,
            "LOCAL",
            false
        ))).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));

        LoginUserContext.set(new LoginUser(8L, Set.of("ADMIN"), Set.of()));
        assertThatThrownBy(() -> service.save(command(0, "上海", "31.23", "121.47")))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.FORBIDDEN));
        verify(configMapper, never()).insert(any(SiteWidgetConfigEntity.class));
    }

    private SiteWidgetConfigurationCommand command(
        int version,
        String displayName,
        String latitude,
        String longitude
    ) {
        return new SiteWidgetConfigurationCommand(
            version,
            displayName,
            new BigDecimal(latitude),
            new BigDecimal(longitude),
            "Asia/Shanghai",
            true,
            360,
            "LOCAL",
            false
        );
    }

    private SiteLocationEntity location(
        long id,
        String displayName,
        String latitude,
        String longitude,
        String timezone
    ) {
        SiteLocationEntity location = new SiteLocationEntity();
        location.setId(id);
        location.setDisplayName(displayName);
        location.setLatitude(new BigDecimal(latitude));
        location.setLongitude(new BigDecimal(longitude));
        location.setTimezone(timezone);
        location.setEnabled(true);
        location.setDeleted(0);
        location.setVersion(1);
        return location;
    }

    private SiteWidgetConfigEntity config(
        int version,
        long locationId,
        boolean weatherEnabled,
        int maxStaleMinutes,
        String quoteSourceMode,
        boolean hitokotoEnabled
    ) {
        SiteWidgetConfigEntity config = new SiteWidgetConfigEntity();
        config.setSingletonKey("SITE");
        config.setActiveLocationId(locationId);
        config.setWeatherEnabled(weatherEnabled);
        config.setWeatherMaxStaleMinutes(maxStaleMinutes);
        config.setQuoteSourceMode(quoteSourceMode);
        config.setHitokotoEnabled(hitokotoEnabled);
        config.setDeleted(0);
        config.setVersion(version);
        return config;
    }
}
