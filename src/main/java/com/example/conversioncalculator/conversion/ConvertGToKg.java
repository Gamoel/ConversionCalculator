package com.example.conversioncalculator.conversion;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import com.example.conversioncalculator.strategy.ConversionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class ConvertGToKg implements ConversionServiceInterface {

    String conversionCode = "g to kg";

    @Override
    public String getConversionCode() {
        return conversionCode;
    }

    @Override
    public ResponseDto doConvert(RequestDto requestDto) {

        float fromValue = requestDto.getFromValue();
        float result = fromValue / 1000;

        ResponseDto responseDto = new ResponseDto(
                true,
                result,
                fromValue,
                requestDto.getFromType(),
                requestDto.getToType());

        return responseDto;

    }
}
