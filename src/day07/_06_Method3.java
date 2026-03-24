package day07;

public class _06_Method3 {
	//메서드 정의 >> 기능의 정의 역할
	/*
	 * 접근제어자 리턴타입 메서드명(매개변수) { 구현; } 
	 * public - 누구나 접근 가능 
	 * 리턴 타입 - 기능 구현후 결과로 반환할 값의 타입
	 * 매개변수 - 기능 구현을 위한 외부에서 받아오는 값 
	 * 메서드명 - 의미있게 소문자로 작성하면 좋음.
	 * + - *   / %의 기능을 만들고 값을 리턴하는 메서드의 작성
	 * 한 기능에 하나의 리턴.
	 */
	
	public int hap(int num1, int num2) {
		return num1 + num2;
	} //static은 안붙어도 되던데 뭐임 이거??
	//
	public int cha(int num1, int num2) {
		return num1 - num2;
	}
	public int gop(int num1, int num2) {
		return num1 * num2;
	}
	public int nanum(int num1, int num2) {
		return num1 / num2;
	}
	public int namuji(int num1, int num2) {
		return num1 % num2;
	}
	public static void main(String[] args) {
		// 
		_06_Method3 me02 = new _06_Method3();
		/*
		 * _05_Method2 me021 = new _05_Method2();
		 * 
		 * me021.sum(0,0); // 다른 클래스에서 정의한 메서드도 호출 가능하다.
		 */		//		메서드 실행
//		1. 클래스로 객체 정의
//		클래스명 객체명 = new 클래스명();
//		2 객체명으로 메서드 호출
		
		int n = 90;
		int m = 33;
		
		System.out.println(
//				me02.hap(n,m) +" " +
//				cha(n,m) +" " +
//				gop(n,m) +" " +
//				nanum(n,m) +" " +
//				namuji(n,m)
				);
		
	}

}
