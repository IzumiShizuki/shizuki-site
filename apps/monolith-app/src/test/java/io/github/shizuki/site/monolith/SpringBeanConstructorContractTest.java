package io.github.shizuki.site.monolith;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.util.ClassUtils;

class SpringBeanConstructorContractTest {

    @Test
    void beansWithMultipleConstructorsDeclareInjectionConstructor() {
        ClassPathScanningCandidateComponentProvider scanner =
            new ClassPathScanningCandidateComponentProvider(true);

        List<String> violations = scanner.findCandidateComponents("io.github.shizuki").stream()
            .map(beanDefinition -> beanDefinition.getBeanClassName())
            .filter(Objects::nonNull)
            .map(className -> ClassUtils.resolveClassName(className, getClass().getClassLoader()))
            .filter(type -> type.getDeclaredConstructors().length > 1)
            .filter(type -> Arrays.stream(type.getDeclaredConstructors())
                .noneMatch(constructor -> constructor.isAnnotationPresent(Autowired.class)))
            .map(Class::getName)
            .sorted()
            .toList();

        assertTrue(
            violations.isEmpty(),
            () -> "Spring beans with ambiguous constructors: " + String.join(", ", violations)
        );
    }
}
