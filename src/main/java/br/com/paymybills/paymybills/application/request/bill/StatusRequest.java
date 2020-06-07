package br.com.paymybills.paymybills.application.request.bill;

import lombok.ToString;

@ToString
public enum StatusRequest {
    PENDING, PAID, CANCELED, OVERDUE, RESCHEDULE
}