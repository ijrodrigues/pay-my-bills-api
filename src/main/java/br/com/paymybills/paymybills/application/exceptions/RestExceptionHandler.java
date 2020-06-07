package br.com.paymybills.paymybills.application.exceptions;

import br.com.paymybills.paymybills.application.response.DefaultErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public DefaultErrorResponse handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = ex.getBindingResult().getAllErrors().stream()
                .collect(toMap(field -> ((FieldError) field).getField(), field -> requireNonNull(field.getDefaultMessage())));
        return new DefaultErrorResponse(ErrorMessage.INVALID_FORM_DATA, errors);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public DefaultErrorResponse handleDefaultException(Exception ex) {
        log.error("M=handleDefaultException, error={}", ex.getMessage(), ex);
        return new DefaultErrorResponse(ErrorMessage.DEFAULT_EXCEPTION);
    }
}