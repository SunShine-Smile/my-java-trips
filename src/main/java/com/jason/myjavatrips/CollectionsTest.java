package com.jason.myjavatrips;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

public class CollectionsTest
{
	public static void main(String[] args)
	{
		List<BigDecimal> list = new ArrayList<>();
		list.add(new BigDecimal(1.2));
		list.add(new BigDecimal(1.1));
		list.add(new BigDecimal(1.3));
		Collections.sort(list, new Comparator<BigDecimal>() {
			public int compare(BigDecimal a, BigDecimal b) {
				return a.compareTo(b);
			}
		});
		List<Float> list1 = list.stream().map(s -> Float.parseFloat(s.toString())).collect(Collectors.toList());
		for(Float double1 : list1) {
			System.out.println(double1.TYPE);
//			list1.remove(double1);
			System.out.println(JSON.toJSONString(list1));
		}
		
		
		List<ActivityAreaDto> activityAreaDtos = new ArrayList<>();
		ActivityAreaDto activityAreaDto = new ActivityAreaDto();
		activityAreaDto.setActivityId(1);
		activityAreaDto.setAreaId(1);
		activityAreaDtos.add(activityAreaDto);
		ActivityAreaDto activityAreaDto1 = new ActivityAreaDto();
		activityAreaDto1.setActivityId(2);
		activityAreaDto1.setAreaId(1);
		activityAreaDtos.add(activityAreaDto1);
		ActivityAreaDto activityAreaDto2 = new ActivityAreaDto();
		activityAreaDto2.setActivityId(4);
		activityAreaDto2.setAreaId(1);
		activityAreaDtos.add(activityAreaDto2);
		ActivityAreaDto activityAreaDto3 = new ActivityAreaDto();
		activityAreaDto3.setActivityId(2);
		activityAreaDto3.setAreaId(2);
		activityAreaDtos.add(activityAreaDto3);
		ActivityAreaDto activityAreaDto4 = new ActivityAreaDto();
		activityAreaDto4.setActivityId(1);
		activityAreaDto4.setAreaId(2);
		activityAreaDtos.add(activityAreaDto4);
		ActivityAreaDto activityAreaDto5 = new ActivityAreaDto();
		activityAreaDto5.setActivityId(3);
		activityAreaDto5.setAreaId(2);
		activityAreaDtos.add(activityAreaDto5);
		

       System.out.println(activityAreaDtos.stream().collect(Collectors.groupingBy(ActivityAreaDto::getAreaId, Collectors.mapping(ActivityAreaDto::getActivityId, Collectors.toSet())))); 
    
       String[] arrays = {"1","2","3"};
       List<String> arrayList = new ArrayList<>(arrays.length);
       Collections.addAll(arrayList, arrays);
       System.out.println(JSON.toJSONString(arrayList));
	}
	
	static class  ActivityAreaDto implements Serializable {
	    private static final long serialVersionUID = 1311048729855060381L;

	    public Integer getActivityId() {
	        return activityId;
	    }

	    public void setActivityId(Integer activityId) {
	        this.activityId = activityId;
	    }

	    private Integer activityId;

	    public Integer getAreaId() {
	        return areaId;
	    }

	    public void setAreaId(Integer areaId) {
	        this.areaId = areaId;
	    }

	    private Integer areaId;
	}
}
