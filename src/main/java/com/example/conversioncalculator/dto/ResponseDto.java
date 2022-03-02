package com.example.conversioncalculator.dto;

import java.util.Objects;

public class ResponseDto {
    private boolean valid;
    private float result;
    private float fromValue;
    private String fromType;
    private String toType;

    public ResponseDto(boolean valid, float result, float fromValue, String fromType, String toType) {
        this.valid = valid;
        this.result = result;
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public float getFromValue() {
        return fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "valid=" + valid +
                ", result=" + result +
                ", fromValue=" + fromValue +
                ", fromType='" + fromType + '\'' +
                ", toType='" + toType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseDto that = (ResponseDto) o;
        return valid == that.valid &&
                Math.abs(that.result - result) < 0.0001 &&
                Math.abs(that.fromValue - fromValue) < 0.0001 &&
                Objects.equals(fromType, that.fromType) &&
                Objects.equals(toType, that.toType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valid, result, fromValue, fromType, toType);
    }
}
