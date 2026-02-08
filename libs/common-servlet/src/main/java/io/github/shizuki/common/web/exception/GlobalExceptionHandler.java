package io.github.shizuki.common.web.exception;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import jakarta.servlet.http.HttpServletRequest;
import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ProblemDetail handleBusinessException(BusinessException exception, HttpServletRequest request) {
        ErrorCode errorCode = exception.getErrorCode();
        HttpStatus status = switch (errorCode) {
            case BAD_REQUEST -> HttpStatus.BAD_REQUEST;
            case UNAUTHORIZED -> HttpStatus.UNAUTHORIZED;
            case FORBIDDEN -> HttpStatus.FORBIDDEN;
            case NOT_FOUND -> HttpStatus.NOT_FOUND;
            case TOO_MANY_REQUESTS -> HttpStatus.TOO_MANY_REQUESTS;
            default -> HttpStatus.BAD_REQUEST;
        };

        ProblemDetail detail = ProblemDetail.forStatusAndDetail(status, exception.getMessage());
        detail.setTitle(errorCode.code());
        detail.setType(URI.create("https://shizuki.dev/problems/" + errorCode.code().toLowerCase()));
        detail.setProperty("code", errorCode.code());
        detail.setProperty("request_id", request.getHeader("X-Request-Id"));
        exception.getDetails().forEach(detail::setProperty);
        return detail;
    }

    @ExceptionHandler(Exception.class)
    public ProblemDetail handleException(Exception exception, HttpServletRequest request) {
        ProblemDetail detail = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        detail.setTitle(ErrorCode.INTERNAL_ERROR.code());
        detail.setType(URI.create("https://shizuki.dev/problems/internal-error"));
        detail.setProperty("code", ErrorCode.INTERNAL_ERROR.code());
        detail.setProperty("request_id", request.getHeader("X-Request-Id"));
        return detail;
    }
}
