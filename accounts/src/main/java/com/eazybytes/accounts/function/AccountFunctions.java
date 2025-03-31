package com.eazybytes.accounts.function;

import com.eazybytes.accounts.service.IAccountsService;
import com.eazybytes.common.dto.MobileNumberUpdateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class AccountFunctions {

    @Bean
    public Consumer<MobileNumberUpdateDto> updateAccountMobileNumber(IAccountsService accountsService) {
        return (mobileNumberUpdateDto) -> {
            log.info("Received update Mobile Number for Account: {}", mobileNumberUpdateDto);
            accountsService.updateMobileNumber(mobileNumberUpdateDto);
        };
    }

    @Bean
    public Consumer<MobileNumberUpdateDto> rollbackAccountMobileNumber(IAccountsService accountsService) {
        return (mobileNumberUpdateDto) -> {
            log.info("Rollback update Mobile Number for Account: {}", mobileNumberUpdateDto);
            accountsService.rollbackMobileNumber(mobileNumberUpdateDto);
        };
    }

}
