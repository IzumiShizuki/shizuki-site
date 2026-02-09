package io.github.shizuki.common.core.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecretValueValidatorTest {

    private final SecretValueValidator validator = new SecretValueValidator();

    @Test
    void shouldTreatBlankAsInvalid() {
        Assertions.assertTrue(validator.isInvalid(""));
        Assertions.assertTrue(validator.isInvalid("  "));
        Assertions.assertTrue(validator.isInvalid(null));
    }

    @Test
    void shouldTreatPlaceholderAsInvalid() {
        Assertions.assertTrue(validator.isInvalid("replace_me"));
        Assertions.assertTrue(validator.isInvalid("CHANGE_ME"));
        Assertions.assertTrue(validator.isInvalid("your_secret"));
    }

    @Test
    void shouldTreatEncValueAsValid() {
        Assertions.assertFalse(validator.isInvalid("ENC(AES:abc123)"));
    }

    @Test
    void shouldTreatNormalSecretAsValid() {
        Assertions.assertFalse(validator.isInvalid("x9mA!2kL-88"));
    }
}
