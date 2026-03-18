package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main 이 있어야 실행됨. 실행 메서드.
		
		 System.out.println("hello woirld!");

		 System.out.println("*");
		 System.out.println("**");
		 System.out.println("***");
		 System.out.println("****");
		 System.out.println("*****");
		 
		 byte b; //byte타입은 잘 안씀 너무 작아
		 
		 int c;
		 c = 500;
		 
		 char ch = 'a';
		 //반드시 ''  작은 따옴표로 묶어줘야함.
		 //작은 따옴표와 큰 따옴표의 차이점.
		 
		 //유니코드 문자표.
		 //a가 들어가도 문자표에 의거해 65가 들어감????? 시발 이거 맞나 몰라 아이 시발 젠장.....
		 
		 int d = 100;
		 long lo = 123456L;
		 //long  과  float은 접미사 L과 f를 붙여줄것
		 float f = 1.1f;
		 double dou = 1.9876564234523;
		 
		
		 //원래 클래스는 정의하는 방법이 다르지만 string만은 예외로 자료형처럼 정의 가능함.
		 String str = "asdf";
		 
		 int ACOUNT = 394; // 대문자로 시작하는 변수는 상수일때의 규칙.
		 
		 System.out.println("asdf" + "qwer");
		 
		 
		 
		 if(ACOUNT == dou) {
			 System.out.println("same");
		 } else {
			 System.out.println("different");
		 }
		 
		 int alter;
		 alter = 0;
		 
		 
	}
	  
}