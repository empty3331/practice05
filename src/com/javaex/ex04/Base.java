package com.javaex.ex04;

public class Base {
	
	//필드
	private String day;
	
    //생성자
	
	public Base() {}
	public Base(String day) {
		this.day = day;
	}

	//g/s
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
	//일반 메소드
    public void service(String day) {  
    	if(day=="낮") {
        System.out.println("낮에는 열심히 수업듣자");}
    	else if(day == "밤") {
    	System.out.println("밤에는 숙면");}
    	else if(day == "오후") {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    	}
  
    }
	
}

