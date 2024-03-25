package com.javaex.oop.song.v3;

import com.javaex.oop.point.v1.Point;

public class SongApp {

	public static void main(String[] args) {
//		Song s1 = new Song();
		Song s1 = new Song("아이유","좋은날","Real","이민수 작곡","3번 track",2010);
//		s1.setTitle("좋은날");
//		s1.setart("아이유");
//		s1.setalb("Real");
//		s1.setcomp("이민수 작곡");
//		s1.setyear(2010);
//		s1.settrack("3번 track");
		
//		Song s2 = new Song();
		Song s2 = new Song("BIGBANG","거짓말","Always","G-Dragon 작곡","2번 track",2007);
//		s2.setTitle("거짓말");
//		s2.setart("BIGBANG");
//		s2.setalb("Always");
//		s2.setcomp("G-Dragon 작곡");
//		s2.setyear(2007);
//		s2.settrack("2번 track");
		
//		Song s3 = new Song();
		Song s3 = new Song("버스커버스커","벚꽃엔딩","버스커버스커1집","장범준 작곡","4번 track",2012);
//		s3.setTitle("벚꽃엔딩");
//		s3.setart("버스커버스커");
//		s3.setalb("버스커버스커1집");
//		s3.setcomp("장범준 작곡");
//		s3.setyear(2012);
//		s3.settrack("4번 track");
		
				
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
