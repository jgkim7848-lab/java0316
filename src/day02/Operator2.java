package day02;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//변수의 기본 자료형 8종
		/*정수 byte, short, int, long, char
		 *실수 float, double
		 *논리 boolean
		 *
		 * 
		 * 연산자
		 * 산술연산자 + - * / %(나머지) 
		 * 대입: = += -= 
		 * 		=을 기준으로 오른쪽에 있는 값을 왼쪽 변수에 저장함.
		 * 		왼쪽값은 반드시 변수여야함.
		 * 
		 * int a= 1;
		 * a = b;
		 * 1 = a는 안됨
		 * a += b 라는건 a에 a+b를 넣으란 뜻.
		 * */
		
		int a = 1;
		int b = 5;
		
		System.out.println(a);
		System.out.println(b);
		
		
		a = b;
		System.out.println(a);
		
		
		a+=b;
		System.out.println(a);
		
		/*증감연산자
		 * ++ --
		 * 각각 1 증가 1감소
		 * 
		 * */
		a++; //(현재 a에 1증가)
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(++a);
		
		/*
		 * 나누기
		 *10/3을 때리면 3.3333333333333333이 나오지만 /이거 연산은 소수점 띠고 보여줌
		 *%는 나머지를 보여줌.*/
		System.out.println(10/3);
		System.out.println(10.0/3.0);
		System.out.println(10/3.0);
		//정수/0는 예외가 발생하지만 실수/0은 infinity가 발생한다.
		
		//논리연산자 && 둘다 참이어야함. ||하나만 잠이면 됨.  
		 
		/*연산연결자
		 * 데이터의 결과가 문자일 경우에만 가능
		 * 
		 * */
		
		
		/*조건선택연산자
		 * 조건식 ? true false
		 * 
		 * */
		int num1 = 95;
		int num2 = 100;
		System.out.println(num1>num2 ? "num1이 더 큼" :  "num2가 더 큼");
		
		
		//--------------------------------------------------------
		//짝수인지 홀수인지 알아보기???
		int number;
		number = 23;
		//number라는 변수 선언, 값 입력후 이것이 짝수인지 홀수인지 판별하기
		System.out.println(number%2 == 0 ? "number"+ number + "은 짝수" : "number" + number + "은 홀수");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
