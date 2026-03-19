package day04;

import java.util.Scanner;

public class Exam101 {

	public static void main(String[] args) {
		/*
		 * 2주차 exam2 
		 * 기본적인건 같지만 
		 * equals() 
		 * char = scan.next().charAt(0) 
		 * / %연산 사용시 피연산자가 0이면
		 * 0으로 나눌수 없습니다 출력.
		 * string 문자열 == '+' 말고 다른거 쓰기.
		 */
		
		//https://olppaemmit.tistory.com/234  꼭 확인.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 2개와 연산자를 순서대로 입력하시오.\n a>> ");
		int a = scan.nextInt();
		
		System.out.println("b>> ");
		int b = scan.nextInt();
		
		System.out.println("연산자 pn>> ");
		
		System.out.println("+ - * % / 중 1개 입력");
		String pn = scan.next();

		if(pn.equals("+")) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if(pn.equals("-")){
			System.out.println(a + " - " + b + " = " + (a - b));
		}else if(pn.equals("*")){
			System.out.println(a + " * " + b + " = " + (a * b));
		}else if(pn.equals("/")){
			if(b!=0) {
				System.out.println(a + " / " + b + " = " + (a / b));
			} else {
				System.out.println("피연산자가 0이면 0으로 나눌수 없습니다.");
				
			}
		}else if(pn.equals("%")){
			if(b!=0) {
				System.out.println(a + " % " + b + " = " + (a % b));
			} else {
				System.out.println("피연산자가 0이면 0으로 나눌수 없습니다.");
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		/*
		 * char라면 switch에서 case '+' 
		 * Stirng이라면 case "+"
		 */
		
		System.out.println("--------------------------------");
		//미리 안되는 케이스 배제하기
		/*
		 * if(b != 0) { System.out.println("연산자 pn>> ");
		 * 
		 * System.out.println("+ - * % / 중 1개 입력"); String pn = scan.next(); } else {
		 * System.out.println("연산자 pn>> ");
		 * 
		 * System.out.println("+ - * 중 1개 입력");
		 * 
		 * String pn = scan.next(); if(pn.equals("%") || pn.equals("/")) {
		 * System.out.println("피연산자가 0인경우 실행할수 없는 연산입니다."); } }
		 */
		
		scan.close();
	}

}
