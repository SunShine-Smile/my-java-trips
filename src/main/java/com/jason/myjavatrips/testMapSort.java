package com.jason.myjavatrips;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/** 
 * @author Jason Wang
 * @time   2016年6月22日 下午7:44:27 
 */
public class testMapSort
{

	public static void main(String[] args) throws Exception
	{
		Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
		map.put("b", new BigDecimal(0));
		map.put("1", new BigDecimal(0));
		map.put("c", new BigDecimal(0));
		map.put("d", new BigDecimal(0));
		System.out.println("拆分之前map为"+map);
		Map<String, BigDecimal> result = apartAmount(new BigDecimal(0.0001),map,3);
		System.out.println("拆分之后result为"+result);
		System.out.println("拆分之后map为"+map);
	}
	
	public static Map<String, BigDecimal> apartAmount(BigDecimal totleAmount, Map<String, BigDecimal> map,int scale) throws Exception{
		if(scale<0){
			scale = 0;
		}
//		if(totleAmount.compareTo(BigDecimal.ZERO)==0){
//			return map;
//		}
		//用于保存map中所有value之和
		BigDecimal mapTotalAmount = BigDecimal.ZERO;
		//map排序
		Map<String, BigDecimal> sortedMap = new LinkedHashMap<String, BigDecimal>();  
		List<Map.Entry<String, BigDecimal>> entryList = new ArrayList<Map.Entry<String, BigDecimal>>(map.entrySet());  
	    if (map != null && !map.isEmpty()) {  
	        Collections.sort(entryList,  
	                new Comparator<Map.Entry<String, BigDecimal>>() {  
	                    public int compare(Entry<String, BigDecimal> entry1,  
	                            Entry<String, BigDecimal> entry2) {  
	                    	BigDecimal value1 = BigDecimal.ZERO, value2 = BigDecimal.ZERO;  
	                        try {  
	                            value1 = entry1.getValue();  
	                            value2 = entry2.getValue();  
	                        } catch (Exception e) {  
	                            value1 = BigDecimal.ZERO;  
	                            value2 = BigDecimal.ZERO;  
	                        }  
	                        return value1.compareTo(value2);  
	                    }  
	                });  
	        Iterator<Map.Entry<String, BigDecimal>> iter = entryList.iterator();  
	        Map.Entry<String, BigDecimal> tmpEntry = null;  
	        while (iter.hasNext()) {  
	            tmpEntry = iter.next();  
	            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
	            mapTotalAmount = mapTotalAmount.add(tmpEntry.getValue());
	        }  
	    }
	    
		if(mapTotalAmount.compareTo(totleAmount)==0){
			System.out.println("拆分金额和map中的金额只和相等，不需拆分");
			return sortedMap;
		}
		if (mapTotalAmount.compareTo(BigDecimal.ZERO)==0)
		{
			return sortedMap;
		}
		BigDecimal totalRefund = new BigDecimal(0.00);
		BigDecimal seller_price = new BigDecimal(0.00);
		
		for(int i=0;i<entryList.size();i++){
			//判断若拆分金额大于需要拆分的总金额，则以后拆分金额均为0
			//若不为BigDecimal.ROUND_DOWN，则需考试是否要添加以下注释代码
//			if(totalRefund.compareTo(totleAmount)==1){
//				seller_price = new BigDecimal(0);
//			}else 
			if (i == entryList.size() - 1) {
				//若不为BigDecimal.ROUND_DOWN，则需考虑已拆分金额之和--totalRefund是否已大于totleAmount
				seller_price = totleAmount.subtract(totalRefund).setScale(scale, BigDecimal.ROUND_DOWN);
				//判断若之前拆分金额为0，且最后一次也为零，则抛出异常
				if(totalRefund.compareTo(BigDecimal.ZERO)==0 && seller_price.compareTo(BigDecimal.ZERO)==0 && totleAmount.compareTo(BigDecimal.ZERO)!=0){
					throw new Exception("小数点位数太少，无法拆分");
				}
			} else {
				//若不为BigDecimal.ROUND_DOWN，则需考虑已拆分金额之和--totalRefund是否已大于totleAmount
				seller_price = totleAmount.multiply(entryList.get(i).getValue()).divide(mapTotalAmount, scale, BigDecimal.ROUND_DOWN);
				totalRefund = totalRefund.add(seller_price);
			}
			sortedMap.put(entryList.get(i).getKey(), seller_price);
		}
		return sortedMap;
	}

}
