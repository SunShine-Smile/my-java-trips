package com.jason.myjavatrips;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
/** 
 * @author Jason Wang
 * @time   2016年8月23日 下午2:47:35 
 */
public class SuningArea
{

	public static void main(String[] args)
	{
		String filePath="D:\\文档\\第三方对接\\苏宁易购\\area.txt";
        readTxtFile(filePath);

	}
	
	/**
     * 功能：Java读取txt文件的内容
     * 步骤：1：先获得文件句柄
     * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
     * 3：读取到输入流后，需要读取生成字节流
     * 4：一行一行的输出。readline()。
     * 备注：需要考虑的是异常情况
     * @param filePath
     */
    public static void readTxtFile(String filePath){
        try {
                String encoding="gbk";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    JSONArray jsonArray = new JSONArray();
                    while((lineTxt = bufferedReader.readLine())!= null){
                    	jsonArray = JSONArray.parseArray(lineTxt);
                    }
                    JSONObject jsonObject = new JSONObject();
                    for(int i=0;i<jsonArray.size();i++){
                    	jsonObject = jsonArray.getJSONObject(i);
                    	System.out.println(String.format("%s|%s|%s|%s|%s|%s", jsonObject.get("provinceName"),jsonObject.get("provinceCode"),jsonObject.get("cityName"),jsonObject.get("cityCode"),jsonObject.get("districtName"),jsonObject.get("districtCode")));
                    }
//                    System.out.println(jsonArray);
                    read.close();
	        }else{
	            System.out.println("找不到指定的文件");
	        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }     
    }
}
