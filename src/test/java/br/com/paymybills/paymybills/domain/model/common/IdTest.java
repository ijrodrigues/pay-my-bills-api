package br.com.paymybills.paymybills.domain.model.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IdTest {

    @Test
    public void should_return_uuid_when_call_no_args_constructor() {
        var id = new Id();
        assertNotNull(id.getValue());
        assertEquals(36, id.getValue().length());
    }

    @Test
    public void should_return_same_value_when_call_constructor_with_args() {
        var id = new Id("1234-1234");
        assertNotNull(id.getValue());
        assertEquals("1234-1234", id.getValue());
    }
}