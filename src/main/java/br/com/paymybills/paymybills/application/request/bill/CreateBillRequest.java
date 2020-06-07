package br.com.paymybills.paymybills.application.request.bill;

import br.com.paymybills.paymybills.domain.Bill;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.time.LocalDate;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import static lombok.AccessLevel.PRIVATE;

@Getter
@ToString
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class CreateBillRequest {

    public enum Status {
        PENDING, PAID, CANCELED, OVERDUE, RESCHEDULE
    }

    public enum Type {
        TO_PAY, TO_RECEIVE
    }

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private Type type;

    @NotNull
    @PositiveOrZero
    private BigDecimal amount;

    @JsonFormat(shape = STRING, pattern = "dd-MM-yyyy")
    private LocalDate dueDate;

    private Status status;

    public Bill toModel() {
        return null;
    }
}