package com.eazybytes.common.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class MobileNumberUpdateDto {

    @NotEmpty(message = "Current Mobile Number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile Number should be 10 digits")
    private String currentMobileNumber;


    @NotEmpty(message = "New Mobile Number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile Number should be 10 digits")
    private String newMobileNumber;
}
