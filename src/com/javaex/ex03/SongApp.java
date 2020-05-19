package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		System.out.println(s1.toString());
		
		//출력예상
		//song(파라미터5개)
		//song(파라미터6개)
		//Song [title=좋은날, artist=아이유, album=Real, composer=이민수, year=2010, track=3]

		
	}

}


