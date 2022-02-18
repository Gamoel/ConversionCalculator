package com.example.conversioncalculator.dto;

import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class RequestDto {

    @Positive
    private final float fromValue;
    @NotBlank
    private final String fromType;
    @NotBlank
    private final String toType;

    public RequestDto(float fromValue, String fromType, String toType) {
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    public float getFromValue() {
        return fromValue;
    }

    public String getFromType() {
        return fromType;
    }

    public String getToType() {
        return toType;
    }
}
