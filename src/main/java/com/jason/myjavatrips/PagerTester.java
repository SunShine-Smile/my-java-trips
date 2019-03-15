package com.jason.myjavatrips;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/** 
 * @author Jason
 * @time   2017年5月2日 上午11:25:40 
 */
public class PagerTester
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Pager<String> pager = new Pager<String>();
        
        List<String> content = new ArrayList<String>();
        content.add("str1");
        content.add("str2");
        content.add("str3");
        content.add("str4");
        content.add("str5");
        content.add("str6");
        content.add("str7");
        content.add("str8");
        content.add("str9");
        content.add("str10");
        
        pager.setCurrentPage(1);
        pager.setPageSize(1);
        pager.setRecordTotal(10);
        pager.setContent(content);
        
        System.out.println(pager);
        
        System.out.println("结果" + getFormateTableIndex("_0",1));
	}
	
	
	private static String getFormateTableIndex(String style, long tbIndex) {
        String tableIndex = null;
        DecimalFormat df = new DecimalFormat();
        if (StringUtils.isEmpty(style)) {
            return "";
        }
        df.applyPattern(style);
        tableIndex = df.format(tbIndex);
        return tableIndex;
    }

}
