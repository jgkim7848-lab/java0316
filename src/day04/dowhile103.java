package day04;

import java.util.Scanner;

public class dowhile103 {

	public static void main(String[] args) {
		/*
		 * // 반복문 do while do(실행문) while(조건); 
		 * 실행문부터 실행하고 나중에 조건을 봄
		 * 한글자를 입력받아 그 한글자를 출력하고싶다.
		 * 반복적으로 하고싶다.
		 * 'y' 입력하면 종료.
		 */
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("한글자 입력");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
		}while(ch != 'y'/*이런 형태 잘못쓰면 do 안에서 선언한걸 여기서 못알아봄*/);
		
		System.out.println("종료");
		
		scan.close();
		
	}

}
