package com.yjq.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConverter implements Converter<String, Date> {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        if (s != null&& !"".equals(s)){
            try {
                return simpleDateFormat.parse(s);
            }catch (ParseException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
