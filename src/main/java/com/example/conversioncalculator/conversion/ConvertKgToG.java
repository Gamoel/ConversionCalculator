package com.example.conversioncalculator.conversion;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import com.example.conversioncalculator.strategy.ConversionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class ConvertKgToG implements ConversionServiceInterface {

    @Override
    public String getConversionCode() {
        return "kg to g";
    }

    @Override
    public ResponseDto doConvert(RequestDto requestDto) {

        float fromValue = requestDto.getFromValue();
        float result = getResult(fromValue);

        return new ResponseDto(
              true,
                result,
                requestDto.getFromValue(),
                requestDto.getFromType(),
                requestDto.getToType()
        );
    }

    public float getResult(float fromValue) {
        return fromValue *1000;
    }
}

