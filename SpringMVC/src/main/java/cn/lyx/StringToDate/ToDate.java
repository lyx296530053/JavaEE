package cn.lyx.StringToDate;

import javafx.scene.input.DataFormat;
import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDate implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if(s==null){
            throw  new RuntimeException("请输入参数");
        }
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse=null;
        try {
          parse = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
