package io.github.shizuki.site.content.provider.weather;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.config.ExternalWidgetFeatureProperties;
import io.github.shizuki.site.content.provider.BoundedProviderJsonParser;
import io.github.shizuki.site.content.provider.ExternalWidgetProviderPolicies;
import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.ProviderHttpPolicy;
import io.github.shizuki.site.content.provider.ProviderHttpTransport;
import io.github.shizuki.site.content.provider.StrictProviderJson;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

/** Strict adapter for the official Open-Meteo forecast endpoint. */
@Component
public class OpenMeteoWeatherProvider implements WeatherProvider {

    static final int FORECAST_DAYS = 5;
    static final ProviderAttribution ATTRIBUTION = new ProviderAttribution(
        "Open-Meteo",
        URI.create("https://open-meteo.com")
    );

    private static final ProviderHttpPolicy POLICY = ExternalWidgetProviderPolicies.OPEN_METEO;
    private static final Set<String> ROOT_REQUIRED = Set.of(
        "latitude", "longitude", "generationtime_ms", "utc_offset_seconds", "timezone",
        "timezone_abbreviation", "elevation", "current_units", "current", "daily_units", "daily"
    );
    private static final Set<String> CURRENT_FIELDS = Set.of(
        "time", "interval", "temperature_2m", "relative_humidity_2m",
        "apparent_temperature", "weather_code", "wind_speed_10m"
    );
    private static final Set<String> DAILY_FIELDS = Set.of(
        "time", "weather_code", "temperature_2m_max", "temperature_2m_min",
        "precipitation_probability_max"
    );

    private final ProviderHttpTransport transport;
    private final BoundedProviderJsonParser parser;
    private final ExternalWidgetFeatureProperties featureProperties;

    public OpenMeteoWeatherProvider(
        ProviderHttpTransport transport,
        BoundedProviderJsonParser parser,
        ExternalWidgetFeatureProperties featureProperties
    ) {
        this.transport = transport;
        this.parser = parser;
        this.featureProperties = featureProperties;
    }

    @Override
    public String providerCode() {
        return POLICY.providerCode();
    }

    @Override
    public ProviderAttribution attribution() {
        return ATTRIBUTION;
    }

    @Override
    public NormalizedWeather fetch(WeatherProviderRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("weather provider request is required");
        }
        if (!featureProperties.canContactWeatherUpstream()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "weather upstream requests are disabled");
        }
        URI endpoint = buildEndpoint(request);
        try (InputStream response = transport.get(endpoint, POLICY)) {
            return parser.parse(response, POLICY, root -> normalize(root, request));
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException | RuntimeException exception) {
            throw unavailable();
        }
    }

    URI buildEndpoint(WeatherProviderRequest request) {
        String query = String.join("&",
            parameter("latitude", coordinate(request.latitude())),
            parameter("longitude", coordinate(request.longitude())),
            parameter("current", String.join(",",
                "temperature_2m", "relative_humidity_2m", "apparent_temperature",
                "weather_code", "wind_speed_10m")),
            parameter("daily", String.join(",",
                "weather_code", "temperature_2m_max", "temperature_2m_min",
                "precipitation_probability_max")),
            parameter("timezone", request.timezone().getId()),
            parameter("forecast_days", String.valueOf(FORECAST_DAYS))
        );
        return POLICY.requireAllowedEndpoint(URI.create(POLICY.baseUri() + "/v1/forecast?" + query));
    }

    private NormalizedWeather normalize(JsonNode root, WeatherProviderRequest request) {
        StrictProviderJson.requireExactFields(root, ROOT_REQUIRED, Set.of());
        requireGeographicCoordinate(root, "latitude", -90D, 90D);
        requireGeographicCoordinate(root, "longitude", -180D, 180D);
        requireFinite(root, "generationtime_ms");
        int utcOffsetSeconds = requireInteger(root, "utc_offset_seconds", -64_800, 64_800);
        requireFinite(root, "elevation");
        String timezone = StrictProviderJson.requiredText(root, "timezone", 64);
        requireTimezone(timezone, request.timezone());
        StrictProviderJson.requiredText(root, "timezone_abbreviation", 32);

        validateCurrentUnits(requireObject(root, "current_units"));
        JsonNode current = requireObject(root, "current");
        StrictProviderJson.requireExactFields(current, CURRENT_FIELDS, Set.of());
        double temperature = requireFinite(current, "temperature_2m");
        double apparentTemperature = requireFinite(current, "apparent_temperature");
        int relativeHumidity = requireInteger(current, "relative_humidity_2m", 0, 100);
        int weatherCode = requireInteger(current, "weather_code", 0, 99);
        double windSpeed = requireFinite(current, "wind_speed_10m");
        if (windSpeed < 0) {
            throw unavailable();
        }
        requireInteger(current, "interval", 1, 86_400);
        Instant observedAt = parseObservation(
            StrictProviderJson.requiredText(current, "time", 64),
            request.timezone(),
            utcOffsetSeconds
        );

        validateDailyUnits(requireObject(root, "daily_units"));
        List<NormalizedWeatherDay> forecast = normalizeDaily(requireObject(root, "daily"));
        return new NormalizedWeather(
            providerCode(),
            request.locationLabel(),
            temperature,
            apparentTemperature,
            relativeHumidity,
            weatherCode,
            windSpeed,
            observedAt,
            forecast,
            ATTRIBUTION
        );
    }

    private List<NormalizedWeatherDay> normalizeDaily(JsonNode daily) {
        StrictProviderJson.requireExactFields(daily, DAILY_FIELDS, Set.of());
        JsonNode dates = requireArray(daily, "time");
        JsonNode codes = requireArray(daily, "weather_code");
        JsonNode maximums = requireArray(daily, "temperature_2m_max");
        JsonNode minimums = requireArray(daily, "temperature_2m_min");
        JsonNode precipitation = requireArray(daily, "precipitation_probability_max");
        int size = dates.size();
        if (size < 1 || size > FORECAST_DAYS
            || codes.size() != size || maximums.size() != size
            || minimums.size() != size || precipitation.size() != size) {
            throw unavailable();
        }
        List<NormalizedWeatherDay> days = new ArrayList<>(size);
        LocalDate previousDate = null;
        for (int index = 0; index < size; index++) {
            try {
                LocalDate date = LocalDate.parse(requireArrayText(dates, index, 32));
                if (previousDate != null && !date.isAfter(previousDate)) {
                    throw unavailable();
                }
                days.add(new NormalizedWeatherDay(
                    date,
                    requireArrayFinite(minimums, index),
                    requireArrayFinite(maximums, index),
                    requireArrayInteger(codes, index, 0, 99),
                    requireArrayInteger(precipitation, index, 0, 100)
                ));
                previousDate = date;
            } catch (DateTimeException | IllegalArgumentException exception) {
                throw unavailable();
            }
        }
        return List.copyOf(days);
    }

    private void validateCurrentUnits(JsonNode units) {
        StrictProviderJson.requireExactFields(units, CURRENT_FIELDS, Set.of());
        requireUnit(units, "time", "iso8601");
        requireUnit(units, "interval", "seconds");
        requireUnit(units, "temperature_2m", "°C");
        requireUnit(units, "relative_humidity_2m", "%");
        requireUnit(units, "apparent_temperature", "°C");
        requireUnit(units, "weather_code", "wmo code");
        requireUnit(units, "wind_speed_10m", "km/h");
    }

    private void validateDailyUnits(JsonNode units) {
        StrictProviderJson.requireExactFields(units, DAILY_FIELDS, Set.of());
        requireUnit(units, "time", "iso8601");
        requireUnit(units, "weather_code", "wmo code");
        requireUnit(units, "temperature_2m_max", "°C");
        requireUnit(units, "temperature_2m_min", "°C");
        requireUnit(units, "precipitation_probability_max", "%");
    }

    private void requireUnit(JsonNode units, String field, String expected) {
        if (!expected.equals(StrictProviderJson.requiredText(units, field, 32))) {
            throw unavailable();
        }
    }

    private JsonNode requireObject(JsonNode root, String field) {
        JsonNode value = root.get(field);
        if (value == null || !value.isObject()) {
            throw unavailable();
        }
        return value;
    }

    private JsonNode requireArray(JsonNode root, String field) {
        JsonNode value = root.get(field);
        if (value == null || !value.isArray()) {
            throw unavailable();
        }
        return value;
    }

    private String requireArrayText(JsonNode array, int index, int maxLength) {
        JsonNode value = array.get(index);
        if (value == null || !value.isTextual()) {
            throw unavailable();
        }
        String text = value.textValue().trim();
        if (text.isEmpty() || text.length() > maxLength) {
            throw unavailable();
        }
        return text;
    }

    private double requireArrayFinite(JsonNode array, int index) {
        JsonNode value = array.get(index);
        if (value == null || !value.isNumber() || !Double.isFinite(value.doubleValue())) {
            throw unavailable();
        }
        return value.doubleValue();
    }

    private int requireArrayInteger(JsonNode array, int index, int minimum, int maximum) {
        JsonNode value = array.get(index);
        if (value == null || !value.isIntegralNumber()) {
            throw unavailable();
        }
        int result = value.intValue();
        if (result < minimum || result > maximum) {
            throw unavailable();
        }
        return result;
    }

    private double requireFinite(JsonNode root, String field) {
        double value = StrictProviderJson.requiredFiniteNumber(root, field);
        if (!Double.isFinite(value)) {
            throw unavailable();
        }
        return value;
    }

    private int requireInteger(JsonNode root, String field, int minimum, int maximum) {
        JsonNode value = root.get(field);
        if (value == null || !value.isIntegralNumber()) {
            throw unavailable();
        }
        int result = value.intValue();
        if (result < minimum || result > maximum) {
            throw unavailable();
        }
        return result;
    }

    private void requireGeographicCoordinate(JsonNode root, String field, double minimum, double maximum) {
        double value = requireFinite(root, field);
        if (value < minimum || value > maximum) {
            throw unavailable();
        }
    }

    private void requireTimezone(String providerTimezone, ZoneId expected) {
        try {
            ZoneId actual = ZoneId.of(providerTimezone);
            if (!actual.equals(expected)) {
                throw unavailable();
            }
        } catch (DateTimeException exception) {
            throw unavailable();
        }
    }

    private Instant parseObservation(String value, ZoneId timezone, int utcOffsetSeconds) {
        try {
            ZoneOffset providerOffset = ZoneOffset.ofTotalSeconds(utcOffsetSeconds);
            try {
                OffsetDateTime observation = OffsetDateTime.parse(value);
                Instant instant = observation.toInstant();
                if (!observation.getOffset().equals(providerOffset)
                    || !timezone.getRules().getOffset(instant).equals(providerOffset)) {
                    throw unavailable();
                }
                return instant;
            } catch (DateTimeParseException ignored) {
                LocalDateTime observation = LocalDateTime.parse(value);
                if (!timezone.getRules().getValidOffsets(observation).contains(providerOffset)) {
                    throw unavailable();
                }
                return observation.toInstant(providerOffset);
            }
        } catch (DateTimeParseException ignored) {
            throw unavailable();
        } catch (DateTimeException exception) {
            throw unavailable();
        }
    }

    private String coordinate(BigDecimal value) {
        return value.stripTrailingZeros().toPlainString();
    }

    private String parameter(String name, String value) {
        return encode(name) + "=" + encode(value);
    }

    private String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
    }

    private BusinessException unavailable() {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Open-Meteo response is unavailable or invalid");
    }
}
