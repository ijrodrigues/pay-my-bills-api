package br.com.paymybills.paymybills.domain.model.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IdTest {

    @Test
    public void should_return_uuid_when_call_no_args_constructor() {
        Id id = new Id();
        assertNotNull(id.value());
        assertEquals(36, id.value().length());
    }

    @Test
    public void should_return_same_value_when_call_constructor_with_args() {
        Id id = new Id("1234-1234");
        assertNotNull(id.value());
        assertEquals("1234-1234", id.value());
    }
}