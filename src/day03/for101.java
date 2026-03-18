package day03;

public class for101 {

	public static void main(String[] args) {
		//101 >>> 01번째 작업 for1
		
		/*
		 * for() {
		 * 
		 * }
		 * 초기화 - 생략이 가능함.  단 세미콜론";"은 있어야함.
		 * 조건식 - 만족하는동안 계속 돌림. false가 되는 순간 빠져나감.
		 * 
		 * 반복문 - 규칙적인 작업을 반복적으로 할때 사용하는 문법.
		 * for while do while등이 존재.  for while은 동작방식이 같다.
		 * 조건에 따라서 작동하므로 조건이 안맞으면 실행 횟수 0번도 가능함.
		 * 단 do while은 1단 실행을 함. = 1번은 실행한다는 소리.
		 * 
		 * 
		 */

		for(int a=1; a<10; a++) {
			for(int b = 0; b<a; b++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		int i = 1;
		for( ; i <=9; i++) {
			System.out.print(i + " ");
		}
		System.out.println(i);
		
		
		
	}

}




















