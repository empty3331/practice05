package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member("jws","정우성",5000);
		Member m2 = new Member("yfs","유재석",3000);
		Member m3 = new Member("lhr","이효리",8000);
		
		m1.showinfo();
		m2.showinfo();
		m3.showinfo();
		
	}

}
