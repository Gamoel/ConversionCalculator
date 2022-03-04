package com.example.conversioncalculator.conversion;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertFToCTest {
    ConvertFToC convertFToC = new ConvertFToC();

    @Test
    public void convertFToC() {
        assertThat(ConvertFToC.getResult(100f)).isEqualTo(37.77778f);
    }

    @Test
    public void checkObjects() {
        ResponseDto responseDto = new ResponseDto(true, 37.77778f, 100f, "f", "c");
        RequestDto requestDto = new RequestDto(100f, "f", "c");
        assertThat(convertFToC.doConvert(requestDto)).isEqualTo(responseDto);
    }

    @Test
    public void checkObjectsWithZero() {
        ResponseDto responseDto = new ResponseDto(true, -17.77778f, 0, "f", "c");
        RequestDto requestDto = new RequestDto(0f, "f", "c");
        assertThat(convertFToC.doConvert(requestDto)).isEqualTo(responseDto);
    }

    @Test
    public void checkConversionCode() {
        assertThat(convertFToC.getConversionCode()).isEqualTo("f to c");
    }
}