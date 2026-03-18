package day03;

public class while104 {

	public static void main(String[] args) {
		// 표현 방식만 다른 for문
		//그러면 언제 뭘 쓰는가????
		//for문 - 횟수가 적고 정해진 횟수가 있을때.
		//ex 구구단...반복의 횟수가 정해져있을때 사용함.
		//while문 - 실행 횟수가 일정하지않을때.
		System.out.println("for문");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("for문");
		
		System.out.println("=================================");
		
		//반복을 위한 변수의 별도 제작
		System.out.println("while문");
		int count = 1;
		while(count <=10) {
			System.out.print(count + " ");
			//반복 변수가 종료되기위한 조건을 넣음으로서 무한루프를 방지함.
			count++;
			/*
			 * if(count ==5) { break; }
			 * 물론 이런 조건 달아넣으면 while안에 count<=10의 의미가 없어지긴함.
			 */
		}
		
		System.out.println("while문");
		

		System.out.println("=================================");
		
		//while로 짝수만 출력
		int two = 1;
		while(two <=10) {
			if(two % 2 == 0) {
				System.out.println(two);
			}
			two ++;
			//while(true) 박아놓고 if (two > 10) {break;} 박아도 됨.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
