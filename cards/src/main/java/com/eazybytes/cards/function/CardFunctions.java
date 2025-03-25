package com.eazybytes.cards.function;

import com.eazybytes.cards.service.ICardsService;
import com.eazybytes.common.dto.MobileNumberUpdateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class CardFunctions {

    @Bean
    public Consumer<MobileNumberUpdateDto> updateCardMobileNumber(ICardsService cardsService) {
        return (mobileNumberUpdateDto) -> {
            log.info("Received update Mobile Number for Card: {}", mobileNumberUpdateDto);
            cardsService.updateMobileNumber(mobileNumberUpdateDto);
        };
    }
}
