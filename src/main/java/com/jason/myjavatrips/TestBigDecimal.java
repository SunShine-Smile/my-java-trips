package com.jason.myjavatrips;
import java.math.BigDecimal;
import java.math.RoundingMode;

/** 
 * @author Jason
 * @time   2017年8月25日 下午8:21:59 
 */
public class TestBigDecimal
{
	public static void main(String[] args)
	{
		System.out.println(new BigDecimal(1000).divide(new BigDecimal(1000), 3, RoundingMode.HALF_UP));
		System.out.println("【杭州新建售卖区】Fw: Re: 云仓柯桥店-杭州试点售卖区开通申请".contains("柯桥店"));
		
		System.out.println(new BigDecimal("0.0"));
//		System.out.println(getStrFromInt(0));
	}
	
	public static String getStrFromInt(Integer date){
        String str = date.toString();
        String pre = str.substring(0,str.length()-2);
        String end = str.substring(str.length()-2, str.length());
        if(str.length()==3){
            return "0"+ pre+":"+end;
        }else{
            return pre+":"+end;
        }
    }
}
