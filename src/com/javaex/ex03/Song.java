package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("song(파라미터0개)");
	}

	public Song(String title, String artist, String album, String composer, String year) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("song(파라미터5개)");//실행확인용 문구
	}

	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,artist,album,composer,year); //파라미터5개의 생성자가 먼저 실행되고 그 값을 받아 작업하는 형식
		this.track = track;
		System.out.println("song(파라미터6개)");//실행확인용 문구
	}

	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
		
}



