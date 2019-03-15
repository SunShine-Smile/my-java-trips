package com.jason.myjavatrips;
public class OrderArea {

//	public static void main(String[] args) throws Exception {
////		File file = new File("d:/order_address_0803_1.txt");
////		File file = new File("d:/order_address_0812_2.txt");
////		File file = new File("d:/order_address_0914_1.txt");
////		File file = new File("d:/order_address_0914_2.txt");
////		File file = new File("d:/order_address_1223.txt");
//		File file = new File("d:/order_address_0418.txt");
//		file.createNewFile();
//		final PrintWriter out = new PrintWriter(file);
//		final Map<String, Map<String, Object>> areas = getAreaDataAll();
//		new QFileRead() {
//			@Override
//			public void disposeFileDate(String data) {
//				String[] arrs = data.split("\\|");
//				int area1 = 0;
//				String name1 = "";
//				int parentid1 = 0;
//				int area2 = 0;
//				String name2 = "";
//				int parentid2 = 0;
//				int area3 = 0;
//				String name3 = "";
//				Iterator<Entry<String, Map<String, Object>>> iter = areas.entrySet().iterator();
//				Set<String> area2s = new HashSet<String>();
//				while(iter.hasNext()) {
//					Entry<String, Map<String, Object>> entry = iter.next();
//					Map<String, Object> area = entry.getValue();
//					String areaname = String.valueOf(area.get("AREA_NAME"));
//					String level = String.valueOf(area.get("LEVEL"));
//					int pid = Integer.parseInt(String.valueOf(area.get("PARENT_ID")));
//					
////					if(arrs[1].indexOf(areaname) != -1) {
//					if(arrs[3].indexOf(areaname) != -1) {
//						if("1".equals(level)) {
//							area1 = Integer.parseInt(entry.getKey());
//							name1 = areaname;
//						} else if("2".equals(level) && area1 == pid) {
//							area2 = Integer.parseInt(entry.getKey());
//							parentid1 = pid;
//							name2 = areaname;
//						} else if("3".equals(level) && area2 == pid) {
//							area3 = Integer.parseInt(entry.getKey());
//							parentid2 = pid;
//							name3 = areaname;
//						} /*else if("3".equals(level) && area2s.contains(pid + "")) {
//							int _pid = Integer.parseInt(String.valueOf(areas.get(pid + "").get("PARENT_ID")));
//							if(area1 == _pid) {
//								area3 = Integer.parseInt(entry.getKey());
//								parentid2 = pid;
//								name3 = areaname + "*";
//								area2 = pid;
//								parentid1 = Integer.parseInt(String.valueOf(areas.get(pid + "").get("PARENT_ID")));;
//								name2 = String.valueOf(areas.get(pid + "").get("AREA_NAME"));;
//							}
//						}*/
//					} else if("2".equals(level) && pid == area1) {
//						area2s.add(entry.getKey());
//					}
//				}
//				out.println(String.format("%s|%s|%s|%s|%s|%s|%s", data, area1, name1, area2, name2, area3, name3));
//				
//			}
////		}.readFile("C:/Users/Administrator/Desktop/address1", "utf-8");
////		}.readFile("d:/order_address_0812_1.txt", "utf-8");
////		}.readFile("d:/order_area_source1.txt", "utf-8");
////		}.readFile("d:/order_area_source2.txt", "utf-8");
////		}.readFile("d:/order_area_source_1223.txt", "utf-8");
//		}.readFile("d:/order_area_source_0418.txt", "utf-8");
//		out.flush();
//		out.close();
//		CoreFactory.shutdown();
//		System.out.println("finished");
//	}
//	
//	public static Map<String, Map<String, Object>> getAreaDataAll() throws Exception {
//		String sql = "select * from area order by level, area_id";
//		DBQueryBean qb = new DBQueryBean();
//		qb.setSql(sql);
//		qb.setSqlIndex("");
//		qb.setConnect("address_shipping");
//		qb.setCacheAble(false);
//		DBResultBean rb = (DBResultBean)CoreFactory.getInstance().getQueryResult(qb);
//		Map<String, Map<String, Object>> areas = new LinkedHashMap<String, Map<String, Object>>();
//		for(int i = 0, len = rb.size(); i < len; i++) {
//			Map<String, Object> data = (Map<String, Object>)rb.getResultMap(i);
//			String areaid = String.valueOf(data.get("AREA_ID"));
//			areas.put(areaid, data);
//		}
//		return areas;
//	}

	
}
