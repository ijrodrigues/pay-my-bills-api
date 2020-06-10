package br.com.paymybills.paymybills.domain.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static java.util.UUID.randomUUID;

@Getter
@AllArgsConstructor
public class Id {

    private final String value;

    public Id() {
        this(randomUUID().toString());
    }
}