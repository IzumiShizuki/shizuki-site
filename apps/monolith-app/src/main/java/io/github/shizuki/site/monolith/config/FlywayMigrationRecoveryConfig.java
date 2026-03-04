package io.github.shizuki.site.monolith.config;

import org.flywaydb.core.api.exception.FlywayValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

@Configuration
public class FlywayMigrationRecoveryConfig {

    private static final Logger log = LoggerFactory.getLogger(FlywayMigrationRecoveryConfig.class);

    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy(
            Environment environment,
            @Value("${shizuki.flyway.auto-repair-on-validate-error:true}") boolean autoRepairOnValidateError,
            @Value("${shizuki.flyway.allow-auto-repair-in-prod:false}") boolean allowAutoRepairInProd) {
        return flyway -> {
            try {
                flyway.migrate();
            } catch (FlywayValidateException validateException) {
                if (!shouldAutoRepair(validateException, environment, autoRepairOnValidateError, allowAutoRepairInProd)) {
                    throw validateException;
                }
                log.warn("Flyway checksum mismatch detected, running repair() and retrying migrate().");
                flyway.repair();
                flyway.migrate();
            }
        };
    }

    private static boolean shouldAutoRepair(
            FlywayValidateException exception,
            Environment environment,
            boolean autoRepairOnValidateError,
            boolean allowAutoRepairInProd) {
        if (!autoRepairOnValidateError) {
            return false;
        }
        if (isProd(environment) && !allowAutoRepairInProd) {
            return false;
        }
        String message = exception.getMessage();
        return message != null && message.contains("Migration checksum mismatch");
    }

    private static boolean isProd(Environment environment) {
        return environment.acceptsProfiles(Profiles.of("prod", "production"));
    }
}
