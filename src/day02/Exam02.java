package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 과제임.
		//정수2개, 연산자 1개를 입력받아서 두 정수와 내가 입력한 연산자의 결과값을 출력하고싶다.
		//ex) 2 3 +입력시 5가 출력되는걸로.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 2개와 연산자를 순서대로 입력하시오.\n a>> ");
		int a = scan.nextInt();
		
		System.out.println("b>> ");
		int b = scan.nextInt();
		
		System.out.println("연산자 pn>> ");
		
		System.out.println("+ - * % / 중 1개 입력");
		char pn = scan.next().charAt(0); //return이 char로 들어감.
		//1글자만 추출함으로서 ==으로 비교가 가능한 char의 사용이 가능해짐.
		if(pn == '+') {
			System.out.println(a + b);
		}else if(pn == '-') {
			System.out.println(a - b);
		}else if(pn == '*') {
			System.out.println(a * b);
		}else if(pn == '%') {
			System.out.println((float)a % (float)b);
		}else if(pn == '/') {
			System.out.println((float)a / (float)b);
		}else {
			System.out.println("worng input");
		}
		
		
		
		
//		String str = scan.next();
//		if(str.equals("+"))
		
		scan.close();
	}

}
