package com.example.conversioncalculator.conversion;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertKgToGTest {
    ConvertKgToG convertKgToG = new ConvertKgToG();

    @Test
    public void convertKgToG() {
        assertThat(ConvertKgToG.getResult((float) 2.34)).isEqualTo(2340);
    }

    @Test
    public void checkObjects() {
        ResponseDto responseDto = new ResponseDto(true, 2340, (float) 2.34, "kg", "g");
        RequestDto requestDto = new RequestDto(2.34f, "kg", "g");
        assertThat(convertKgToG.doConvert(requestDto)).isEqualTo(responseDto);
    }

    @Test
    public void checkObjectsWithZero() {
        ResponseDto responseDto = new ResponseDto(true, 0, (float) 0, "kg", "g");
        RequestDto requestDto = new RequestDto(0f, "kg", "g");
        assertThat(convertKgToG.doConvert(requestDto)).isEqualTo(responseDto);
    }

    @Test
    public void checkConversionCode() {
        assertThat(convertKgToG.getConversionCode()).isEqualTo("kg to g");
    }
}
