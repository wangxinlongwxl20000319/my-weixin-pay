package com.xinlong.common.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    public static String getTime(){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        String format = simpleDateFormat.format(date);
        return format;
    }
}

