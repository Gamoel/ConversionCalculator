package com.example.conversioncalculator.service;

import com.example.conversioncalculator.dto.RequestDto;
import com.example.conversioncalculator.dto.ResponseDto;
import com.example.conversioncalculator.strategy.ConversionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CustomConversionFromAutowireService {
    private final Map<String, ConversionServiceInterface> serviceByConversionString;

    @Autowired
    CustomConversionFromAutowireService(List<ConversionServiceInterface> conversionServiceInterface) {
        serviceByConversionString = conversionServiceInterface.stream()
                .collect(Collectors.toMap(ConversionServiceInterface::getConversionCode, Function.identity()));
    }

    public ResponseDto doConvert(RequestDto requestDto) {

        String conversionCode = requestDto.getFromType().toLowerCase(Locale.ROOT).concat(" to ").concat(requestDto.getToType()).toLowerCase(Locale.ROOT);

        ConversionServiceInterface service = serviceByConversionString.get(conversionCode);
//        if(service== null){
//            throw new NullPointerException("We dont know these units =* !");
//        }else {
//            Optional<ResponseDto> result = Optional.ofNullable(service.convert(request)); // semantisch
//            return result;
//        }
        return service.doConvert(requestDto);
    }

}
