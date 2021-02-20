package com.jason.myjavatrips;

import java.sql.Timestamp;
import java.util.Date;

/**
 * java.util.Date.after(Date)进行时间比较时，当入参是java.sql.Timestamp时，会触发JDK BUG(JDK9已修复)，可能导致比较时的意外结果。
 *
 * @author Jason.Wang1
 * @date 2021/2/18 17:49
 */
public class DateTest {

    public static void main(String[] args) {
        Long date = System.currentTimeMillis();
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        Timestamp timestamp = new Timestamp(date);
        System.out.println(date1.after(timestamp));
        System.out.println(date1.after(date2));
    }
}
