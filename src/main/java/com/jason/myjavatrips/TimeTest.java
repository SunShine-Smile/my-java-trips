package com.jason.myjavatrips;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Jason Wang
 * @time 2016年8月3日 上午11:01:02
 */
public class TimeTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -1);
        System.out.println(sdf.format(calendar.getTime()));

        Integer timespan = 1512728376;
        Integer timeDiff = timespan - 1800;
        System.out.println(timeDiff >= System.currentTimeMillis() / 1000);

    }

}
