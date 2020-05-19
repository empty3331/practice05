package com.javaex.ex02;

public class Goods {
	
	    //필드
		private String name;
		private int price;
		
		
		//생성자
		
		public Goods() {} //생성자를 새로 만들면 디폴트값 생성자가 사라지므로 따로 적어줘야 함
		
		public Goods(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		
		//g/s
		public String getName() {
			return name;
		}


		public void setNeme(String name) {
			this.name = name;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}
		
		
		//일반메소드
		public void showInfo() {
			System.out.println("상품명: "+name+", 가격: "+price);
		}
		
	
	
}




