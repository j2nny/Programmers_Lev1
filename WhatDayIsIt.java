package level1;

import java.util.Calendar;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12901

public class WhatDayIsIt {

	public WhatDayIsIt() {
		System.out.println(solution(5, 24));
	}
	
    public String solution(int a, int b) {
    	
    	Calendar now = Calendar.getInstance();
    	now.set(2016, a-1, b);
    	
    	
        return " ,SUN,MON,TUE,WED,THU,FRI,SAT".split(",")[now.get(Calendar.DAY_OF_WEEK)];
    }
	
	public static void main(String[] args) {
		new WhatDayIsIt();
	}

}
