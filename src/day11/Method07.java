package day11;//4번째.

public class Method07 {
	//2정수를 입력받아 합을 리턴하는 매서도
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	//세 정수를 입력받아 합 리턴 메서드
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	//두 실수를 입력받아 합 리턴 메서드
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	//실수 3개
	public double sum(double num1, double num2, double num3) {
		return num1 + num2+num3;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 특별한 메서드를 R아보자.
		/*메서드 오버로딩
		 * 동일한 이름의 메서드를 여러개 만드는 케이스에서 사용함.
		 * 매개변수만 다르게해서 여러 케이스로 받아서 사용하는거임.
		 * 오버로딩의 조건
		 * 1 매개변수의 개수가 다르면 가능.
		 * 2 매개변수의 타입이 다르면 가능하다
		 *    - 리턴타입은 상관이 없고 매개변수의 이름도 상관이 없다.
		 * 
		 * */
		Method07 m7 = new Method07();
		System.out.println(m7.sum(100, 200));
		System.out.println(m7.sum(100, 200, 300));
		System.out.println(m7.sum(10.8, 20.6));
		System.out.println(m7.sum(10.8, 20.6, 6.3));
	}

}
