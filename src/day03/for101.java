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
		
		
		System.out.println("==============================");
		
		int sum = 0;
		for(int a = 1; a <=10; a++) {
			sum =sum+a; 
			System.out.println(sum);
		}
		System.out.println(sum);
		
		System.out.println("==============================");
		System.out.println("1부터 10까지 중 짝수만 합계");
		int sum2 = 0;
		for(int i1 = 1; i1 <= 10; i1++) {
			if(i1 % 2 == 0) {
				sum2 = sum2 + i1;
			}
		}
		System.out.println("1부터 10까지 중 짝수 합: " + sum2);
		System.out.println("==============================");
		System.out.println("1부터 10까지 중 홀수만 합계");
		int sum21 = 0;
		for(int i1 = 1; i1 <= 10; i1++) {
			if(i1 % 2 == 1) {
				sum21 = sum21 + i1;
			}
		}
		System.out.println("1부터 10까지 중 홀수 합: " + sum21);
		
		
		//지역변수에 대하여.
		/*
		 * int a 같이 선언시 메모리에 공간이 생김. 비어있다와 0은 다른 의미를 갖는다. 
		 * int a = 0 적어놓고 a +=i같은걸 적으면
		 * 문제가 된다 연산을 안하고 sum = i를 했으면 sum의 초기화가 실행됨
		 *지역변수는 반드시 초기화를 해줘야 사용이 가능하다.
		 */
		
	}

}




















