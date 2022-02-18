package com.example.conversioncalculator.strategy;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;

public interface ConversionServiceInterface {

    String getConversionCode();
    ResponseDto doConvert(RequestDto requestDto);

}
