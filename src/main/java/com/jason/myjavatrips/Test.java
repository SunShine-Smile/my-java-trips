package com.jason.myjavatrips;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class Test
{
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	{
//		String resource="config/conf.xml";
////		Reader reader=Resources.getResourceAsReader(resource);
//		Reader reader = new FileReader(resource);
//		SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(reader);
//		SqlSession session=sessionFactory.openSession();
//		String statement="userMapper.getUser";
//		User user=session.selectOne(statement, 1);
//		System.out.println(user);
		BigDecimal bg1, bg2;
		bg1=new BigDecimal("10");
		bg2=new BigDecimal("10");
		System.out.println(bg1.compareTo(bg2)==0);
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		
		Integer a = 2;
		byte b = 2;
		System.out.println(a ==b);
		
		String string="00000000";
		System.out.println(Integer.parseInt(string));
		try{}catch(Exception e){
			System.out.println("sadfsadf");
			return;}
		System.out.println("dsfsadf");
		test1();
		test2();	
			Date date = new Date();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
			
		Object str= "{\"rows\":[{\"invoice_amount\":100,\"payment_execution_id\":\"469\",\"payment_method_id\":\"COD\"},{\"invoice_amount\":990,\"payment_execution_id\":\"673\",\"payment_method_id\":\"ACC-VA\"}],\"total\":1090}";
		List<Map<String, Object>> maps = (List<Map<String,Object>>) str;
		System.out.println(maps.get(0).get("TOTAL"));
		
	}
	
	public static void test1()
	{
		try{
			String [] arr={"1"};
			System.out.println(arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
	public static void test2() throws NullPointerException
	{
		System.out.println("12312311111`");
	}

}
