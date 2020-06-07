package br.com.paymybills.paymybills.application.controller;

import br.com.paymybills.paymybills.application.request.bill.CreateBillRequest;
import br.com.paymybills.paymybills.application.response.IdResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/bills")
public class BillController {

    @PostMapping
    public IdResponse create(@RequestBody CreateBillRequest request) {
        log.info("M=create, creating bill, request={}", request);
        return new IdResponse(UUID.randomUUID().toString());
    }

}