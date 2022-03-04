package com.example.conversioncalculator.conversion;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import com.example.conversioncalculator.strategy.ConversionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class ConvertKgToG implements ConversionServiceInterface {

    private final String CONVERSIONCODE = "kg to g";

    @Override
    public String getConversionCode() {
        return CONVERSIONCODE;
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

    public static float getResult(float fromValue) {
        return fromValue * 1000;
    }
}

