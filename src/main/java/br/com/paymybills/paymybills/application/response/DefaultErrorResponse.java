package br.com.paymybills.paymybills.application.response;

import br.com.paymybills.paymybills.application.exceptions.ErrorMessage;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record DefaultErrorResponse(String code, String message, Map<String, String>fields) {

    public DefaultErrorResponse(ErrorMessage errorMessage) {
        this(errorMessage.getCode(), errorMessage.getMessage(), null);
    }

    public DefaultErrorResponse(ErrorMessage errorMessage, Map<String, String>fields) {
        this(errorMessage.getCode(), errorMessage.getMessage(), fields);
    }
}