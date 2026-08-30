package io.github.shizuki.common.web.exception;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.mock.web.MockHttpServletRequest;

class GlobalExceptionHandlerContractTest {

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @ParameterizedTest
    @MethodSource("newContractCodes")
    void mapsPersonalExperienceCodesToStableHttpStatuses(ErrorCode code, HttpStatus expectedStatus) {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader("X-Request-Id", "req-contract");

        ProblemDetail problem = handler.handleBusinessException(
            new BusinessException(code, code.defaultMessage()),
            request
        );

        assertThat(problem.getStatus()).isEqualTo(expectedStatus.value());
        assertThat(problem.getProperties())
            .containsEntry("code", code.code())
            .containsEntry("request_id", "req-contract");
    }

    private static Stream<Arguments> newContractCodes() {
        return Stream.of(
            Arguments.of(ErrorCode.INVALID_CURSOR, HttpStatus.BAD_REQUEST),
            Arguments.of(ErrorCode.FEATURE_DISABLED, HttpStatus.NOT_FOUND),
            Arguments.of(ErrorCode.MEDIA_NOT_READY, HttpStatus.SERVICE_UNAVAILABLE),
            Arguments.of(ErrorCode.UPSTREAM_UNAVAILABLE, HttpStatus.SERVICE_UNAVAILABLE)
        );
    }
}
