package com.jason.myjavatrips;
import java.util.List;

import com.ijustyce.xlsx.cellModel;
import com.ijustyce.xlsx.xlsx;

/** 
 * @author Jason Wang
 * @time   2016年5月5日 下午2:58:07 
 */
public class importArea
{
	public static void main(String[] args)
	{
		List<cellModel> exCellModels = xlsx.readStringFromXlsx("D:\\文档\\融e购\\融e购配送区域匹配完毕.xls", "DataSelect1_0");
		int importCount = 0;
		int errorCount = 0;
//		List<String[]> importList = new ArrayList<String[]>();
		StringBuilder sb = new StringBuilder();
		StringBuilder sbError = new StringBuilder();
		String[] arr = null;
		for(int i=1;i<exCellModels.size();i++){
			arr = exCellModels.get(i).getCell();
			if(arr.length==6 || arr.length ==7 || arr.length == 8){
//				System.out.println(arr.length);
				sbError.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+"\n");
				errorCount ++;
				continue;
			}
			if(arr[6]==null){
				sbError.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+"\n");
				errorCount ++;
				continue;
			}
			sb.append("insert into area_relation (third_province_name,third_city_name,third_district_name,province_id,city_id,district_id,relation_type,uid,ctime,third_province_id,third_city_id,third_district_id) values ('"+arr[1]+"','"+arr[3]+"','"+arr[5]+"','"+arr[6].replace(".0", "")+"','"+arr[7].replace(".0", "")+"','"+arr[8].replace(".0", "")+"','6','0',now(),'"+arr[0]+"','"+arr[2]+"','"+arr[4]+"');\n");
			importCount ++;
//			System.out.println(importCount);
		}
		System.out.println("/********************************未导入区域信息如下*********************************/\n");
		System.out.println(sbError.toString());
		System.out.println("/********************************已转换sql区域如下*********************************/\n");
		System.out.println(sb.toString());
		System.out.println("/**********************************转换统计如下***********************************/\n");
		System.out.println("总条数为："+ (exCellModels.size()-1));
		System.out.println("导入条数为："+ importCount);
		System.out.println("失败数为："+ errorCount);
	}

}
