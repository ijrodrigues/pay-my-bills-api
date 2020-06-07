package br.com.paymybills.paymybills.domain;

import br.com.paymybills.paymybills.domain.model.bill.Amount;
import br.com.paymybills.paymybills.domain.model.bill.DueDate;
import br.com.paymybills.paymybills.domain.model.bill.Status;
import br.com.paymybills.paymybills.domain.model.bill.Title;
import br.com.paymybills.paymybills.domain.model.common.Description;
import br.com.paymybills.paymybills.domain.model.common.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Type;

import static lombok.AccessLevel.PRIVATE;

@Getter
@AllArgsConstructor(access = PRIVATE)
public class Bill {

    private final Id id;
    private final Title title;
    private final Description description;
    private final Type type;
    private final Amount amount;
    private final DueDate dueDate;
    private final Status status;
}