package com.jason.myjavatrips;
/** 
 * @author Jason Wang
 * @time   2016年9月22日 上午10:03:19 
 */
public class TestSpilt
{
	public static void main(String[] args)
	{
		String[] string = String.valueOf("JJuctGNrH_海马刀_9.00_0.0_1_^HJuWAnSp3_*V骑士-盾牌红葡萄酒 2012_258.00_149.5_2_^").split("\\^");
		for(String item:string){
			if(item.length()>0){
				System.out.println(item);
			}
		}
		
		String string2 = "cal_ssu_money(custom_filter(ssuList, str('!arrayIn(array(4,5), sellType) && !arrayIn(array(3,4,6,1), activityType) && arrayIn(array(7), saleClass1)'))) >= 2.00";
		System.out.println(string2.contains("cal_ssu_money") + "," + string2.split(">=")[0]+","+string2.split(">=")[1]);
	}
}
