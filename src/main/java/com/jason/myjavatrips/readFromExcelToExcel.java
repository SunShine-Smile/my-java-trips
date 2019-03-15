package com.jason.myjavatrips;
import java.beans.Transient;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.ijustyce.xlsx.cellModel;
import com.ijustyce.xlsx.xlsx;

public class readFromExcelToExcel
{
private static List<cellModel> list;
	
@Transient
	public static void main(String[] args) {

		list = xlsx.readStringFromXlsx("E:\\工作文档\\营销中心 接口\\t_promotion_activity_trigger.xlsx", "t_promotion_activity_trigger");
		int size = list.size();
		int size_value = 0;
		List<String[]> resultList = new ArrayList<String[]>(); 
		for (int i = 1; i < size; i++) {
			cellModel model = list.get(i);
			String[] tmp = model.getCell();
			resultList.add(tmp);
		}
		
		Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://127.0.0.1:3306/mysqls?useUnicode=true&characterEncoding=utf8";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "root";
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            String sqlStr = "";
            sqlStr = "insert into tempTable1 (ssuId,ssuName,ssuPrice,companyId,thresholdPrice) values ";
            StringBuilder sBuilder = new StringBuilder();
            		
			for(int i = 0; i<resultList.size() ;i++){
	//			System.out.println(i + 1);
				String[] tempArr = resultList.get(i);
				String companyId = tempArr[0];
				ActivityRuleExtendDto activityRuleExtendDto = JSON.parseObject(tempArr[1],ActivityRuleExtendDto.class);
				BigDecimal thresholdPrice = activityRuleExtendDto.getThresholdPrice();
				for(int j = 0;j<activityRuleExtendDto.getGiftInfos().size(); j++) {
					Integer ssuId = activityRuleExtendDto.getGiftInfos().get(j).getGiftId();
					String ssuName = activityRuleExtendDto.getGiftInfos().get(j).getGiftName();
					BigDecimal ssuPrice = activityRuleExtendDto.getGiftInfos().get(j).getThresholdCost();
					size_value++;
					sBuilder.append("(" + ssuId + ",'" + ssuName + "','" + ssuPrice + "'," + companyId + ",'"+ thresholdPrice + "'),");
					
				}
//				System.out.println(sqlStr);
			}
			statement.addBatch(sqlStr+sBuilder.substring(0, sBuilder.length() - 1));
			statement.executeBatch();
			statement.close();
            con.close();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
		
		int value1 = size;
		System.out.println( "原表条数：" + value1);
		System.out.println( "实际条数：" + size_value);
	}
}
