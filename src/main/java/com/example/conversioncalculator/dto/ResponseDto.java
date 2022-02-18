package com.example.conversioncalculator.dto;

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

}
