package day14;

import java.util.Scanner;

public class exception03 {
	public static void main(String[] args) {
		// Scanner 객체는 메인에서 받고
		// 메서드 호출하여 결과 출력
		exception03 e3 = new exception03();
		
		System.out.println(e3.calc(4, 0, '+'));
		System.out.println(e3.calc(4, 0, '-'));
		System.out.println(e3.calc(4, 0, '*'));
		System.out.println(e3.calc(4, 2, '/')); //exception 발생위치
		System.out.println(e3.calc(4, 0, '%')); //exception 발생위치
		
		System.out.println(e3.calc(5, 0, '+'));
		System.out.println(e3.calc(5, 0, '-'));
		
		System.out.println("--메서드에서 넘어온 예외처리--");
		// 메서드에서 넘어온 throw 처리
		
		try {
			System.out.println(e3.calc2(5, 0, '+'));
			System.out.println(e3.calc2(5, 0, '-'));
			System.out.println(e3.calc2(5, 0, '!'));
			System.out.println(e3.calc2(5, 0, '/')); // 예외발생시점
			System.out.println(e3.calc2(5, 0, '%'));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(e3.calc2(5, 3, '+'));
		System.out.println(e3.calc2(5, 3, '*'));
		
		
		System.out.println(e3.calc2(5, 0, '+'));
		System.out.println(e3.calc2(5, 0, '-'));
		System.out.println(e3.calc2(5, 0, '!')); // 예외발생시점
		System.out.println(e3.calc2(5, 0, '/')); // 예외발생시점
		System.out.println(e3.calc2(5, 0, '%'));
		
		

	}
	
	// 예외 떠넘기기 : throws
	// method 자체에서 예외처리를 하지 않고, 
	// 나를 호출하는 대상에게 예외처리를 넘기는 상태
	// 예외 발생시키기 : throw new 
	public double calc2(int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		
		if((op=='/' || op=='%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		default:
			throw new RuntimeException("산술연산자가 아닙니다.");
		}
		
		return result;
	}
	
	
	
	
	
	// method 
	// 두 정수와, 연산자를 입력받아 char 
	// + - * / % 연산의 결과를 리턴하는 메서드
	// / %  연산자 일 경우 피연산자 0이면 Exception  오류처리
	
	// 메서드에서 직접 예외를 처리한 케이스
	public double calc(int num1, int num2, char op) {
		double result = 0;
		
		switch(op) {
		case '+': result = num1 + num2;  break;
		case '-': result = num1 - num2;  break;
		case '*': result = num1 * num2;  break;
		case '/': 
			try {
				result = num1 / num2;  
			}catch(Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case '%': 
			try {
				result = num1 % num2;  
			}catch(Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;

		default : 
		}
		return result;
	}

	
	
	
	
}


//	public static void main(String[] args) {
//		// 
//		Scanner scan = new Scanner(System.in);
//		
//		exception03 ex = new exception03();
//		
////		int t = 1;
////		while(t==1) {
////			System.out.println("정수1, 정수2, 연산자 입력");
////			int a = scan.nextInt();
////			int b = scan.nextInt();
////			char c = scan.next().charAt(0);
////			System.out.println(ex.calc(a,b,c));
////			System.out.println("계속하고싶으면1입력.");
////			t = scan.nextInt();
////		}
//		System.out.println(ex.calc(4, 0, '%'));
//		
//		//예외 떠넘기기 throws
//		//예외처리를 하지않고 나를 호출하는 대상에게 예외처리를 넘기는상태
//	}
//	
//	//메서드
//	//두 정수와 연산자char로 입력받아 사칙연산을 실행. 결과 리턴의 메서드.
//	//입력은 main에서.scanner을 main에서.
//	//메서드 호출하여 결과 출력하는 형태.
//	//나누기와 나머지 연산자의 경우 피연산자가 0이면 exception 발생을 오류처리로.
//
//	public double calc2(int num1, int num2, char op) {
//		double result = 0;
//		//예외 발생시키기
//		if((op == '/' || op == '%')&& num2==0) {
//			throw new RuntimeException("num2는 0이 될수 없다.")
//		}
//		switch(op) {
//		case '+': num1 + num2; break;
//		}
//		return result;
//	}
//	
//	
//	
//	public double calc(int num1, int num2, char op) {
//		//switch case로 할걸 그랬지 아 ㅋㅋㅋㅋ
//		if(op=='+') {
//			return num1 + num2;
//		} else if(op=='-') {
//			return num1 - num2;
//		}else if(op=='*') {
//			return num1 * num2;
//		}else if(op=='%') {
//			try {
//				return num1 % num2;
//			}catch(ArithmeticException e){
//				System.out.println("0으로 나눌수 없습니다.");
//				return 0;
//			}
//		}else if(op=='/') {
//			try {
//				return num1 / num2;
//			}catch(ArithmeticException e){
//				System.out.println("0으로 나눌수 없습니다.");
//				return 0;
//			}
//		}else {
//			return -1;
//		}
//		
//	}
//	
//	
//	
//}
