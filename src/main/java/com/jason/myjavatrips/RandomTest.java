package com.jason.myjavatrips;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class RandomTest
{
//	@Override
//	public String toString() {
//        Iterator<E> it = iterator();
//        if (! it.hasNext())
//            return "[]";
//
//        StringBuilder sb = new StringBuilder();
//        sb.append('[');
//        for (;;) {
//            E e = it.next();
//            sb.append(e == this ? "(this Collection)" : e);
//            if (! it.hasNext())
//                return sb.append(']').toString();
//            sb.append(',').append(' ');
//        }
//    }
	
	public static void main(String[] args)
	{
		factory(15,1);
		factory(3,2);
	}
	
	/**
	 * 构造工厂
	 * @param count 注数
	 * @param type LotterTypes
	 */
	public static void factory(int count, int type) {
		int num = 0;
		
		int redCount = 0;
		int redRange = 0;
		int blueCount = 0;
		int blueRange = 0;
		String description = "";
		if(type == LotterTypes.DOUBLECHROMOSPHERE.getType()) {
			redCount = 6;
			redRange = 33;
			blueCount = 1;
			blueRange = 16;
			description = LotterTypes.DOUBLECHROMOSPHERE.getName();
		}else if(type == LotterTypes.SUPERLOTTO.getType()) {
			redCount = 5;
			redRange = 35;
			blueCount = 2;
			blueRange = 12;
			description = LotterTypes.SUPERLOTTO.getName();
		}
		System.out.println("您的" + count + "注" + description + "机选结果为：");
		Random random = new Random();
		for(int j =0 ; j < count; j++) {
			List<Integer> redList = new ArrayList<Integer>();
			List<Integer> blueList =  new ArrayList<Integer>();
			for(int i =0 ; i< redCount ; i++) {
				num = random.nextInt(redRange);
				if(0 != num && !redList.contains(num)) {
					redList.add(num);
				}
				else {
					i--;
				}
			}
			
			for(int i = 0 ; i< blueCount; i++) {
				num = random.nextInt(blueRange);
				if(0 != num && !blueList.contains(num)) {
					blueList.add(num);
				}
				else {
					i--;
				}
			}
			Collections.sort(redList);
			Collections.sort(blueList);
			System.out.println(redList.toString().replace(",", "") + " " + blueList.toString().replace(",", ""));
		}
	}

	enum LotterTypes{
		SUPERLOTTO(1,"大乐透"),
		DOUBLECHROMOSPHERE(2,"双色球");
		
		private int type;
		private String name;
		
		private LotterTypes(int type, String name) {
			this.type = type;
			this.name = name;
		}

		public int getType()
		{
			return type;
		}

		public String getName()
		{
			return name;
		}
	}
}
