package com.jason.myjavatrips;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCExample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			//加载mysql数据库驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/testmysql?user=root&password=123456asd";
			Connection connection=DriverManager.getConnection(url);    //建立连接对象
			Statement stmtStatement=connection.createStatement();    //建立陈述对象
			ResultSet rSet=stmtStatement.executeQuery("select * from student");    //返回ResultSet对象
			
			//遍历ResultSet对象中的各个字段
			while(rSet.next())
			{
				System.out.println("学生的学号："+rSet.getInt(1));
				System.out.println("\t学生的名字："+rSet.getString(2));
				System.out.println("\t学生的性别："+rSet.getBoolean(3));
			}
			rSet.close();    //关闭ResultSet对象
			stmtStatement.close();    //关闭陈述对象
			connection.close();    //关闭连接对象 
		}
		catch(ClassNotFoundException e){
			System.out.println("找不到指定的驱动程序类");
		}
		catch(SQLException e){
			e.printStackTrace();
		}

	}

}
