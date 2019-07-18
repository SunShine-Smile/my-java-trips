package com.jason.myjavatrips;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * @author Jason Wang
 * @time   2016年10月21日 下午2:37:31 
 */
public class TestCalendar
{
	public static void main(String[] args)
	{
		System.out.println(Math.round(1000000000));
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date=new Date();
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, -8);
//		String to_exportDate = df.format(cal.getTime());
//		System.out.println("to_exportDate: "+to_exportDate);
//		System.out.println("to_exportDate: "+cal.getTimeInMillis()/1000);
//		cal.add(Calendar.DATE, -1);
//		String from_exportDate = df.format(cal.getTime());
//		System.out.println("from_exportDate: "+from_exportDate);
//		System.out.println(String.valueOf(System.currentTimeMillis()));
		System.out.println(cal.get(Calendar.MINUTE));
//		cal.setTime(date);
//		cal.add(Calendar.HOUR_OF_DAY, +2);
//		System.out.println(cal);
		
//		cal.set(Calendar.YEAR, 2006);
//		cal.set(Calendar.MONTH, 8);
//		cal.set(Calendar.DAY_OF_MONTH, 3);
//		System.out.println(df.format(cal.getTime()));
//		cal.roll(Calendar.DATE, -4);
//		date=cal.getTime();
//		System.out.println(df.format(date));
//		cal.roll(Calendar.DATE, 4);
//		date=cal.getTime();
//		System.out.println(df.format(date));
	}
}
