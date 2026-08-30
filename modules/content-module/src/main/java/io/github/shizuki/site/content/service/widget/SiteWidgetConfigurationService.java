package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.entity.SiteLocationEntity;
import io.github.shizuki.site.content.entity.SiteWidgetConfigEntity;
import io.github.shizuki.site.content.mapper.SiteLocationMapper;
import io.github.shizuki.site.content.mapper.SiteWidgetConfigMapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Versioned, singleton administration service for site weather and quote source settings. */
@Service
public class SiteWidgetConfigurationService {

    public static final String SINGLETON_KEY = "SITE";
    public static final int DEFAULT_MAX_STALE_MINUTES = 360;
    static final int MIN_MAX_STALE_MINUTES = 15;
    static final int MAX_MAX_STALE_MINUTES = 10_080;
    private static final String MANAGE_PERMISSION = "site.widgets.manage";

    private final SiteLocationMapper locationMapper;
    private final SiteWidgetConfigMapper configMapper;
    private final SiteWidgetCacheInvalidator cacheInvalidator;

    public SiteWidgetConfigurationService(
        SiteLocationMapper locationMapper,
        SiteWidgetConfigMapper configMapper,
        SiteWidgetCacheInvalidator cacheInvalidator
    ) {
        this.locationMapper = locationMapper;
        this.configMapper = configMapper;
        this.cacheInvalidator = cacheInvalidator;
    }

    @Transactional(readOnly = true)
    public SiteWidgetConfigurationSnapshot getConfiguration() {
        requireAdministrator();
        SiteWidgetConfigEntity config = configMapper.selectById(SINGLETON_KEY);
        if (config == null || Integer.valueOf(1).equals(config.getDeleted())) {
            return null;
        }
        SiteLocationEntity location = requireActiveLocation(config.getActiveLocationId());
        return snapshot(config, location);
    }

    @Transactional(rollbackFor = Exception.class)
    public SiteWidgetConfigurationSnapshot save(SiteWidgetConfigurationCommand command) {
        requireAdministrator();
        ValidatedConfiguration validated = validate(command);
        SiteWidgetConfigEntity current = configMapper.selectById(SINGLETON_KEY);
        requireExpectedVersion(current, validated.expectedVersion());
        SiteLocationEntity previousLocation = activeLocation(current);
        SiteLocationEntity activeLocation = sameLocation(previousLocation, validated)
            ? previousLocation
            : insertLocation(validated);

        int nextVersion = validated.expectedVersion() + 1;
        if (current == null) {
            insertConfiguration(activeLocation.getId(), nextVersion, validated);
        } else {
            int updated = configMapper.updateVersioned(
                SINGLETON_KEY,
                validated.expectedVersion(),
                activeLocation.getId(),
                validated.weatherEnabled() ? 1 : 0,
                validated.weatherMaxStaleMinutes(),
                validated.quoteSourceMode().name(),
                validated.hitokotoEnabled() ? 1 : 0
            );
            if (updated != 1) {
                SiteWidgetConfigEntity latest = configMapper.selectById(SINGLETON_KEY);
                throw versionConflict(latest == null ? 0 : valueOrZero(latest.getVersion()));
            }
        }

        locationMapper.disableAllExcept(activeLocation.getId());
        locationMapper.enableIfDisabled(activeLocation.getId());
        boolean weatherChanged = weatherChanged(current, previousLocation, activeLocation, validated);
        boolean quoteSourceChanged = quoteSourceChanged(current, validated);
        cacheInvalidator.invalidate(new SiteWidgetCacheInvalidation(
            previousLocation == null ? null : previousLocation.getId(),
            activeLocation.getId(),
            weatherChanged,
            quoteSourceChanged
        ));

        SiteWidgetConfigEntity saved = toEntity(activeLocation.getId(), nextVersion, validated);
        return snapshot(saved, activeLocation);
    }

    private ValidatedConfiguration validate(SiteWidgetConfigurationCommand command) {
        if (command == null || command.expectedVersion() < 0) {
            throw badRequest("configuration version must be non-negative");
        }
        String displayName = command.displayName() == null ? "" : command.displayName().trim();
        if (displayName.isEmpty() || displayName.length() > 128) {
            throw badRequest("site location display name must contain 1 to 128 characters");
        }
        BigDecimal latitude = normalizeCoordinate(command.latitude(), -90, 90, "latitude");
        BigDecimal longitude = normalizeCoordinate(command.longitude(), -180, 180, "longitude");
        String timezone = command.timezone() == null ? "" : command.timezone().trim();
        if (timezone.isEmpty() || timezone.length() > 64) {
            throw badRequest("site location timezone is invalid");
        }
        try {
            timezone = ZoneId.of(timezone).getId();
        } catch (DateTimeException exception) {
            throw badRequest("site location timezone is invalid");
        }
        if (command.weatherMaxStaleMinutes() < MIN_MAX_STALE_MINUTES
            || command.weatherMaxStaleMinutes() > MAX_MAX_STALE_MINUTES) {
            throw badRequest("weather maximum stale age must be between 15 minutes and 7 days");
        }
        SiteWidgetQuoteSourceMode sourceMode;
        try {
            sourceMode = SiteWidgetQuoteSourceMode.parse(command.quoteSourceMode());
        } catch (IllegalArgumentException exception) {
            throw badRequest(exception.getMessage());
        }
        if (sourceMode == SiteWidgetQuoteSourceMode.HITOKOTO && !command.hitokotoEnabled()) {
            throw badRequest("Hitokoto source mode requires Hitokoto to be enabled");
        }
        return new ValidatedConfiguration(
            command.expectedVersion(),
            displayName,
            latitude,
            longitude,
            timezone,
            command.weatherEnabled(),
            command.weatherMaxStaleMinutes(),
            sourceMode,
            command.hitokotoEnabled()
        );
    }

    private SiteLocationEntity insertLocation(ValidatedConfiguration value) {
        SiteLocationEntity location = new SiteLocationEntity();
        location.setDisplayName(value.displayName());
        location.setLatitude(value.latitude());
        location.setLongitude(value.longitude());
        location.setTimezone(value.timezone());
        location.setEnabled(false);
        location.setDeleted(0);
        location.setVersion(0);
        if (locationMapper.insert(location) != 1 || location.getId() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "site location was not created");
        }
        return location;
    }

    private void insertConfiguration(long locationId, int nextVersion, ValidatedConfiguration value) {
        SiteWidgetConfigEntity config = toEntity(locationId, nextVersion, value);
        if (configMapper.insert(config) != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "site widget configuration was not created");
        }
    }

    private SiteWidgetConfigEntity toEntity(
        long locationId,
        int version,
        ValidatedConfiguration value
    ) {
        SiteWidgetConfigEntity config = new SiteWidgetConfigEntity();
        config.setSingletonKey(SINGLETON_KEY);
        config.setActiveLocationId(locationId);
        config.setWeatherEnabled(value.weatherEnabled());
        config.setWeatherMaxStaleMinutes(value.weatherMaxStaleMinutes());
        config.setQuoteSourceMode(value.quoteSourceMode().name());
        config.setHitokotoEnabled(value.hitokotoEnabled());
        config.setDeleted(0);
        config.setVersion(version);
        return config;
    }

    private SiteLocationEntity activeLocation(SiteWidgetConfigEntity config) {
        if (config == null || Integer.valueOf(1).equals(config.getDeleted()) || config.getActiveLocationId() == null) {
            return null;
        }
        return requireActiveLocation(config.getActiveLocationId());
    }

    private SiteLocationEntity requireActiveLocation(Long locationId) {
        if (locationId == null || locationId <= 0) {
            throw new BusinessException(ErrorCode.CONFLICT, "site widget configuration has no active location");
        }
        SiteLocationEntity location = locationMapper.selectById(locationId);
        if (location == null || location.getId() == null || Integer.valueOf(1).equals(location.getDeleted())) {
            throw new BusinessException(ErrorCode.CONFLICT, "active site location is unavailable");
        }
        return location;
    }

    private boolean sameLocation(SiteLocationEntity location, ValidatedConfiguration value) {
        return location != null
            && Objects.equals(location.getDisplayName(), value.displayName())
            && location.getLatitude() != null && location.getLatitude().compareTo(value.latitude()) == 0
            && location.getLongitude() != null && location.getLongitude().compareTo(value.longitude()) == 0
            && Objects.equals(location.getTimezone(), value.timezone());
    }

    private boolean weatherChanged(
        SiteWidgetConfigEntity current,
        SiteLocationEntity previous,
        SiteLocationEntity active,
        ValidatedConfiguration value
    ) {
        return current == null
            || previous == null
            || !Objects.equals(previous.getId(), active.getId())
            || !Objects.equals(Boolean.TRUE.equals(current.getWeatherEnabled()), value.weatherEnabled())
            || valueOrZero(current.getWeatherMaxStaleMinutes()) != value.weatherMaxStaleMinutes();
    }

    private boolean quoteSourceChanged(SiteWidgetConfigEntity current, ValidatedConfiguration value) {
        return current == null
            || !value.quoteSourceMode().name().equals(current.getQuoteSourceMode())
            || !Objects.equals(Boolean.TRUE.equals(current.getHitokotoEnabled()), value.hitokotoEnabled());
    }

    private void requireExpectedVersion(SiteWidgetConfigEntity current, int expectedVersion) {
        int currentVersion = current == null ? 0 : valueOrZero(current.getVersion());
        if (current != null && Integer.valueOf(1).equals(current.getDeleted())) {
            throw versionConflict(currentVersion);
        }
        if (currentVersion != expectedVersion) {
            throw versionConflict(currentVersion);
        }
    }

    private SiteWidgetConfigurationSnapshot snapshot(
        SiteWidgetConfigEntity config,
        SiteLocationEntity location
    ) {
        return new SiteWidgetConfigurationSnapshot(
            valueOrZero(config.getVersion()),
            location.getId(),
            location.getDisplayName(),
            location.getLatitude(),
            location.getLongitude(),
            location.getTimezone(),
            Boolean.TRUE.equals(config.getWeatherEnabled()),
            valueOrZero(config.getWeatherMaxStaleMinutes()),
            SiteWidgetQuoteSourceMode.parse(config.getQuoteSourceMode()),
            Boolean.TRUE.equals(config.getHitokotoEnabled())
        );
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "site widget management permission is required");
        }
    }

    private BigDecimal normalizeCoordinate(BigDecimal value, int minimum, int maximum, String field) {
        if (value == null || value.compareTo(BigDecimal.valueOf(minimum)) < 0
            || value.compareTo(BigDecimal.valueOf(maximum)) > 0) {
            throw badRequest("site location " + field + " is outside the geographic range");
        }
        return value.setScale(6, RoundingMode.HALF_UP);
    }

    private BusinessException badRequest(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private BusinessException versionConflict(int currentVersion) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            "site widget configuration version changed",
            Map.of("currentVersion", currentVersion)
        );
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private record ValidatedConfiguration(
        int expectedVersion,
        String displayName,
        BigDecimal latitude,
        BigDecimal longitude,
        String timezone,
        boolean weatherEnabled,
        int weatherMaxStaleMinutes,
        SiteWidgetQuoteSourceMode quoteSourceMode,
        boolean hitokotoEnabled
    ) {
    }
}
