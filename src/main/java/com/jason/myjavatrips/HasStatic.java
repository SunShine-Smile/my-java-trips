package com.jason.myjavatrips;
/**
 * @author Jason Wang
 * @time 2016年10月21日 下午3:43:55
 */
public class HasStatic
{
	private static int x = 100;

	public static void main(String args[]){
		HasStatic hs1=new HasStatic();
		hs1.x++;
		hs1=new HasStatic();
		hs1.x++;
		HasStatic.x--;
		System.out.println("x="+x);
		System.out.println(toLower('B'));
		System.out.println(Character.isLowerCase('a'));
	}
	
	private static int toLower(char c) {
        if ((c >= 'A') && (c <= 'Z'))
            return c + ('a' - 'A');
        return c;
    }
}
