package com.example.conversioncalculator.controller;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import com.example.conversioncalculator.service.CustomConversionFromAutowireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin
@RestController
public class ConversionController {

    @Autowired
    CustomConversionFromAutowireService customConversionFromAutowireService;

    @PostMapping(path = "/api/convert")
    public ResponseEntity<ResponseDto> convertUnits(@Valid @RequestBody RequestDto requestDto) {

        try {
            ResponseDto response = customConversionFromAutowireService.doConvert(requestDto);
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
//
//
//        ResponseDto response = customConversionFromAutowireService.doConvert(requestDto);
//        if (response != null){
//
//        }
//                .orElseThrow(()
//                -> new IllegalArgumentException("Conversion from " +
//                requestDto.getFromType() +
//                " to " + requestDto.getToType() +
//                " not valid"));
//        return ResponseEntity.ok(response);
    }
}
