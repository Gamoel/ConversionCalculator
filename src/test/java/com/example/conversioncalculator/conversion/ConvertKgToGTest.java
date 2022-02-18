package com.example.conversioncalculator.conversion;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConvertKgToGTest {
    ConvertKgToG convertKgToG = new ConvertKgToG();

    @Test
    public void convertKgToG() {
        assertThat(convertKgToG.getResult((float) 2.34)).isEqualTo(2340);
    }
}
