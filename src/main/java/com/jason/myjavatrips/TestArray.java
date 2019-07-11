package com.jason.myjavatrips;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class TestArray
{
	public static void main(String[] args)
	{
		int array1[]=new int[]{1,23,456,7,78};
		int array2[];
		array2=array1;

//		Base64
		System.out.println("array1"+array1);
		System.out.println("array2"+array2);
		for(int i=0; i<array2.length;i++)
		{
			if(i%2==0)
			 {
				array2[i]=i;
//			System.out.print(array2[i]+"\t");
			}
			
			System.out.print(array1[i]+"\t");
		}
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		
		List<String> redisActCityKeys=new ArrayList<String>();
		redisActCityKeys.add("1");
		redisActCityKeys.add("2");
		System.out.println(redisActCityKeys.toArray(new String[]{})[0]);
		List<myclass> array = new ArrayList<>();
		for (myclass string : array)
		{
			System.out.println(string);
		}
		array.addAll(null);
		System.out.println(JSON.toJSONString(array));
	}
	
	class myclass{
		String name;
		String age;
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public String getAge()
		{
			return age;
		}
		public void setAge(String age)
		{
			this.age = age;
		}
		
	}
}
