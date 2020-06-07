package br.com.paymybills.paymybills.application.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {
    INVALID_FORM_DATA("0001", "Invalid form data"),
    DEFAULT_EXCEPTION("9999", "Your request cannot be completed");

    private final String code;
    private final String message;
}
