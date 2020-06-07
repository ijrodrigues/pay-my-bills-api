package br.com.paymybills.paymybills.application.request.bill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

import static lombok.AccessLevel.PRIVATE;

@Getter
@ToString
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class AmountRequest {
    private BigDecimal amount;
}