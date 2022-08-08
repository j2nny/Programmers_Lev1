package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//문제: https://programmers.co.kr/learn/courses/30/lessons/92334

public class ReportMail {

	public ReportMail() {
		int[] res = solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi frodo","apeach muzi"}, 1);
//		int[] res = solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
//		int[] res = solution(new String[] {"con", "ryan"}, new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
		System.out.println(Arrays.toString(res));
	}

	public int[] solution(String[] id_list, String[] report, int k) {
		
		int[] answer = {};

		LinkedHashMap<String, LinkedHashSet<String>> map1 = new LinkedHashMap<String, LinkedHashSet<String>>();
		
		for (String id : id_list) {
			map1.put(id, new LinkedHashSet<String>());
		}
		
		for (String each_report : report) {
			map1.get(each_report.split(" ")[0]).add(each_report.split(" ")[1]);
		}
		
		System.out.println(map1.toString());
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		LinkedHashSet<String> stop_list = new LinkedHashSet<String>();

		for (LinkedHashSet<String> set : map1.values()) {
			for (String reported_id : set) {
				if(!map2.containsKey(reported_id)) {
					map2.put(reported_id, 0);
				}
				if(map2.get(reported_id)>=k) {
					stop_list.add(reported_id);
					continue;
				}
				map2.put(reported_id, map2.get(reported_id)+1);
				if(map2.get(reported_id)>=k) {
					stop_list.add(reported_id);
					continue;
				}
			}
		}

		System.out.println(map2.toString());
		System.out.println(stop_list.toString());

		answer = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			String id = id_list[i];
			int cnt = 0;
			for (String reported_id : map1.get(id)) {
				if(stop_list.contains(reported_id)) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}

		return answer;
	}




	//	public int[] solution(String[] id_list, String[] report, int k) {
	//        int[] answer = {};
	//        
	//        LinkedHashMap<String, LinkedHashSet<String>> map1 = new LinkedHashMap<String, LinkedHashSet<String>>();
	//        
	//        for (String id : id_list) {
	//        	LinkedHashSet<String> myRep = new LinkedHashSet<String>();
	//        	for (String eachReport : report) {
	//				if(eachReport.split(" ")[0].equals(id)) {
	//					myRep.add(eachReport.split(" ")[1]);
	//				}
	//			}
	//        	map1.put(id, myRep);
	//		}
	//        
	//        
	//        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
	//        for (String id : id_list) {
	//        	int cnt = 0;
	//        	for (LinkedHashSet<String> eachSet : map1.values()) {
	//        		for (String reportedId : eachSet) {
	//        			if(reportedId.equals(id)) {
	//        				cnt++;
	//        			}
	//        		}
	//        	}
	//        	map2.put(id, cnt);
	//		}
	//        
	//       	ArrayList<String> stop_list = new ArrayList<String>();
	//        
	//        for (String id : map2.keySet()) {
	//			if(map2.get(id)>=k) {
	//				stop_list.add(id);
	//			}
	//		}
	//        
	//        answer = new int[id_list.length];
	//        
	//        for (int i = 0; i < id_list.length; i++) {
	//        	String id = id_list[i];
	//        	int cnt = 0;
	//			for (String reportedId : map1.get(id)) {
	//				for (String stopId : stop_list) {
	//					if(reportedId.equals(stopId)) {
	//						cnt++;
	//					}
	//				}
	//			}
	//			answer[i] = cnt;
	//		}
	//        
	//        return answer;
	//    }

	public static void main(String[] args) {
		new ReportMail();
	}

}
