package com.eazybytes.loans.function;

import com.eazybytes.common.dto.MobileNumberUpdateDto;
import com.eazybytes.loans.service.ILoansService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class LoanFunctions {

    @Bean
    public Consumer<MobileNumberUpdateDto> updateLoanMobileNumber(ILoansService loansService) {
        return (mobileNumberUpdateDto) -> {
            log.info("Received update Mobile Number for Card: {}", mobileNumberUpdateDto);
            loansService.updateMobileNumber(mobileNumberUpdateDto);
        };
    }
}
