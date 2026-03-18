package day03;

import java.util.Random;

public class math102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Math 클래스 - 수학 관련 기능 존재
		 * Math.round(값) - 반올림
		 * Math.ceil(값) 올림
		 * Math.floor(값) 버림
		 * Math.random() - 0~1사이 아무 수를 double 리턴.
		 * 
		 * */
		double num = 3.141592;
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		long roundNum = Math.round(num);
		System.out.println(roundNum);
		
		double ceilNum = Math.ceil(num);
		System.out.println((int)ceilNum);
		
		int floornum = (int) Math.floor(num);
		//return double
		System.out.println(floornum);
		
		
		System.out.println(Math.max(ceilNum, floornum));
		
		System.out.println();
		
		//Math.random()
		System.out.println((int)(Math.random()*100));
		
		//random 클래스
		Random rand = new Random();
		
		rand.nextInt();
		System.out.println(rand.nextInt(10));
		
	}

}
