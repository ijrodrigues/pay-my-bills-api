package br.com.paymybills.paymybills.domain.model.common;

import static java.util.UUID.randomUUID;

public record Id(String value) {

    public Id() {
        this(randomUUID().toString());
    }
}