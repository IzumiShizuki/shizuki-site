package io.github.shizuki.common.web.exception;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import jakarta.servlet.http.HttpServletRequest;
import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({
        MethodArgumentNotValidException.class,
        BindException.class,
        MissingServletRequestParameterException.class,
        MethodArgumentTypeMismatchException.class
    })
    public ProblemDetail handleBadRequest(Exception exception, HttpServletRequest request) {
        return buildProblem(
            HttpStatus.BAD_REQUEST,
            ErrorCode.BAD_REQUEST.code(),
            "https://shizuki.dev/problems/bad-request",
            exception.getMessage(),
            request
        );
    }

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
        if (isBadRequestException(exception) || isBadRequestException(exception.getCause())) {
            return buildProblem(
                HttpStatus.BAD_REQUEST,
                ErrorCode.BAD_REQUEST.code(),
                "https://shizuki.dev/problems/bad-request",
                exception.getMessage(),
                request
            );
        }
        return buildProblem(
            HttpStatus.INTERNAL_SERVER_ERROR,
            ErrorCode.INTERNAL_ERROR.code(),
            "https://shizuki.dev/problems/internal-error",
            exception.getMessage(),
            request
        );
    }

    private boolean isBadRequestException(Throwable throwable) {
        if (throwable == null) {
            return false;
        }
        return throwable instanceof MethodArgumentNotValidException
            || throwable instanceof BindException
            || throwable instanceof MissingServletRequestParameterException
            || throwable instanceof MethodArgumentTypeMismatchException
            || "jakarta.validation.ConstraintViolationException".equals(throwable.getClass().getName());
    }

    private ProblemDetail buildProblem(HttpStatus status, String code, String type, String detailMessage,
                                       HttpServletRequest request) {
        ProblemDetail detail = ProblemDetail.forStatusAndDetail(status, detailMessage);
        detail.setTitle(code);
        detail.setType(URI.create(type));
        detail.setProperty("code", code);
        detail.setProperty("request_id", request.getHeader("X-Request-Id"));
        return detail;
    }
}
