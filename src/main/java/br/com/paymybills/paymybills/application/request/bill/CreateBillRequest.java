package br.com.paymybills.paymybills.application.request.bill;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static lombok.AccessLevel.PRIVATE;

@Getter
@ToString
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class CreateBillRequest {

    @JsonUnwrapped
    private TitleRequest title;

    @JsonUnwrapped
    private DescriptionRequest description;

    @JsonUnwrapped
    private TypeRequest type;

    @JsonUnwrapped
    private AmountRequest amount;

    @JsonUnwrapped
    private DueDateRequest dueDate;

    @JsonUnwrapped
    private StatusRequest status;
}