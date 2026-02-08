package io.github.shizuki.common.core.security;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SecretValueValidatorTest {

    private final SecretValueValidator validator = new SecretValueValidator();

    @Test
    void shouldTreatBlankAsInvalid() {
        assertTrue(validator.isInvalid(""));
        assertTrue(validator.isInvalid("  "));
        assertTrue(validator.isInvalid(null));
    }

    @Test
    void shouldTreatPlaceholderAsInvalid() {
        assertTrue(validator.isInvalid("replace_me"));
        assertTrue(validator.isInvalid("CHANGE_ME"));
        assertTrue(validator.isInvalid("your_secret"));
    }

    @Test
    void shouldTreatEncValueAsValid() {
        assertFalse(validator.isInvalid("ENC(AES:abc123)"));
    }

    @Test
    void shouldTreatNormalSecretAsValid() {
        assertFalse(validator.isInvalid("x9mA!2kL-88"));
    }
}
