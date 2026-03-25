package day08;

import java.util.Arrays;
import java.util.Random;

public class _03_Method6 {
	//1번의 매개변수 없고, 리턴타입은 int[]
	public int[] arr() {
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
	
	//2번 매개변수
	public double avg(int[] arr) {
		int agr = 0;
		
		for(int a = 0; a < arr.length; a++) {
			agr = agr + arr[a];
		}
		
		return agr / (double)arr.length;
	}
	
	//3번	
	public void syso(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			//System.out.print(); 이건 진짜 아무 출력이 없어서 오류가 남
			//ln이 붙어있으면 이건 줄바꿈이라도 출력을 해줘서 오류가 없음.
			
		}
		
	}

	public static void main(String[] args) {
		// 메서드로 배열 만들기.
		/*1 랜덤수 0 부터 100까지. 랜덤의 정수 5개를 갖는 배열 생성하여 리턴하는 메서드
		 * 메서드 안에서 이걸 다 할수있을것.
		 * 리턴 타입이 정 수 배 열  int[] 이거인거임...
		 * 2. 정수배열을 매개변수로 받아서 그 배열의 평균값을 리턴하는 메서드
		 * 3. 정수 배열을 매개변수로 받아서 출력하는 매서드
		 * */
		
		
		Random rand = new Random();
		_03_Method6 me6 = new _03_Method6();
		
		int[] result = me6.arr();
		System.out.println(me6.avg(result));
		me6.syso(result);
	}

}
