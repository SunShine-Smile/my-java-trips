package com.jason.myjavatrips;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

/** 
 * @author Jason Wang
 * @time   2016年11月21日 下午1:24:03 
 */
public class TestShift
{
	public static void main(String[] args)
	{
		System.out.println(Integer.toBinaryString(1 << 3));
		System.out.println(1 << 4);
		System.out.println(1 << 30);
		System.out.println(tableSizeFor(11));
		
		List<ActivityOi> ActivityOiList = new ArrayList<>();
		ActivityOi activityOi = new ActivityOi();
		activityOi.setActionId(1L);
		activityOi.setOrderId(2L);
		ActivityOiList.add(activityOi);
		ActivityOi activityOi2 = new ActivityOi();
		activityOi2.setActionId(1L);
		activityOi2.setOrderId(2L);
		ActivityOiList.add(activityOi2);
		System.out.println(JSON.toJSONString(ActivityOiList));
	}
	
	static final int tableSizeFor(int cap) {
		int MAXIMUM_CAPACITY = 1 << 30;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
	
	static class ActivityOi implements Serializable {
	    private Long orderId;
	    private Long actionId;
		public Long getOrderId()
		{
			return orderId;
		}
		public void setOrderId(Long orderId)
		{
			this.orderId = orderId;
		}
		public Long getActionId()
		{
			return actionId;
		}
		public void setActionId(Long actionId)
		{
			this.actionId = actionId;
		}
	}
}
