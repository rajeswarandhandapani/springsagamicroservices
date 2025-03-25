package com.eazybytes.customer.function;

import com.eazybytes.common.dto.MobileNumberUpdateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class CustomerFunctions {

     @Bean
     public Consumer<MobileNumberUpdateDto> updateMobileNumberStatus() {
         return (mobileNumberUpdateDto) -> {
             log.info("Updated Mobile Number for Customer: {}", mobileNumberUpdateDto);
         };
     }
}
