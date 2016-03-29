package com.zf;

import org.springframework.format.datetime.DateFormatter;

import java.util.Date;
import java.util.Locale;

/**
 * DateTest
 *
 * @author zf
 * @date 16/3/28
 */
public class DateTest {

    public static void main(String[] args) {
        DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd HH:mm:ss");
        System.out.print(dateFormatter.print(new Date(), Locale.CHINA));
    }
}
