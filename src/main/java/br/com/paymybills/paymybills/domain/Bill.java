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

    private Id id;
    private Title title;
    private Description description;
    private Type type;
    private Amount amount;
    private DueDate dueDate;
    private Status status;
}