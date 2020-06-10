package br.com.paymybills.paymybills.application.response;

import br.com.paymybills.paymybills.application.exceptions.ErrorMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultErrorResponse {

    private String code;
    private String message;
    private Map<String, String>fields;

    public DefaultErrorResponse(ErrorMessage errorMessage) {
        this(errorMessage.getCode(), errorMessage.getMessage(), null);
    }

    public DefaultErrorResponse(ErrorMessage errorMessage, Map<String, String>fields) {
        this(errorMessage.getCode(), errorMessage.getMessage(), fields);
    }
}