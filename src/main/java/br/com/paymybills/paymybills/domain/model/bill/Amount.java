package br.com.paymybills.paymybills.domain.model.bill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Amount {
    private BigDecimal value;
}