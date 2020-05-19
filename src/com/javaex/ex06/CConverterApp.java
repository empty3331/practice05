package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {
    	
    	CConverter.setRate(1118.70);
    	
        double dollar = CConverter.toDoller(1000000);
        double won = CConverter.toKWR(100);
                
        System.out.println("백만원은 "+dollar+"달러입니다.");    
        System.out.println("백달러는 "+won+"입니다.");
        
       
    }

}
