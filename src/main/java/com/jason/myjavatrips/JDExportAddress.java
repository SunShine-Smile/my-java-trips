package com.jason.myjavatrips;

//import com.jd.open.api.sdk.DefaultJdClient;
//import com.jd.open.api.sdk.JdClient;
//import com.jd.open.api.sdk.JdException;
//import com.jd.open.api.sdk.domain.address.BaseAreaService.BaseAreaServiceResponse;
//import com.jd.open.api.sdk.request.address.AreasCityGetRequest;
//import com.jd.open.api.sdk.request.address.AreasCountyGetRequest;
//import com.jd.open.api.sdk.request.address.AreasProvinceGetRequest;
//import com.jd.open.api.sdk.response.address.AreasCityGetResponse;
//import com.jd.open.api.sdk.response.address.AreasCountyGetResponse;
//import com.jd.open.api.sdk.response.address.AreasProvinceGetResponse;

public class JDExportAddress {
//public static final String SERVER_URL = "http://api.jd.com/routerjson";
//	
//	public static final String accessToken = "05628685-2483-4c80-aabe-04b8ffc420ca";
//	
//	public static final String appKey = "A7DEDD1B1A69991DE5FB0B4ED16BA046";
//	
//	public static final String appSecret = "90378834ecc14a8c9407679987efda64";
//	
//	public static void main(String[] args) {
////		JdClient client = new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
////		AreasProvinceGetRequest request = new AreasProvinceGetRequest();
////		try {
////			AreasProvinceGetResponse response = client.execute(request);
////			BaseAreaServiceResponse provinceList = response.getBaseAreaServiceResponse();
////			
////			for(int i=0;i<provinceList.getData().size();i++){
//////				System.out.println(provinceList[i].getId() + " ; " + provinceList[i].getName());
////				
////				AreasCityGetRequest request2 = new AreasCityGetRequest();
////				request2.setParentId(provinceList.getData().get(i).getAreaId());
////				AreasCityGetResponse response2 = client.execute(request2);
////				BaseAreaServiceResponse cityArr = response2.getBaseAreaServiceResponse();
////				for(int j=0;j<cityArr.getData().size();j++){
//////					System.out.println(cityArr[j].getId() + " ; " + cityArr[j].getName());
////					
////					AreasCountyGetRequest request3 = new AreasCountyGetRequest();
////					request3.setParentId(cityArr.getData().get(j).getAreaId());
////					AreasCountyGetResponse response3 = client.execute(request3);
////					BaseAreaServiceResponse countyArr = response3.getBaseAreaServiceResponse();
////					for(int k=0;k<countyArr.getData().size();k++){
//////						System.out.println(countyArr[k].getId() + " ; " + countyArr[k].getName());
////						System.out.println(provinceList.getData().get(i).getAreaName()+ "|" + provinceList.getData().get(i).getAreaId() + "|" + cityArr.getData().get(j).getAreaName() + "|" + cityArr.getData().get(j).getAreaId() + "|" + countyArr.getData().get(k).getAreaName() + "|" + countyArr.getData().get(k).getAreaId());
////					}
////				}
////			}
////			
////		} catch (JdException e) {
////			e.printStackTrace();
////		}
//	}
}
