package day02;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수와 연산자
		
		/*주석의 달달구리함....단축기 ctrl+ /*/
//		오 시발 존나 달달해 ctrl+/
		
//		askdlfjasdf
		
		//출력할때 System.out.println <<<< console 출력을 의미함.
		
		//문자열은 꼭 큰 따옴표로 묶어줘야하고 한글자는 작은 따옴표 숫자는 따옴표 없음.
		
		
//		System.out.println ln없으면 자동 줄바꿈 안됨.
		
		
		
		System.out.println("Hello world");
		
		System.out.print("asdf");
		System.out.print("asdf");
		System.out.print("asdf");
		
		//printf 지시자: %d정수형 %f실수형 %s문자열 %c한글자 %n줄바꿈.
		
		
		System.out.printf("%n내 나이는 %d살입니다.", 1234256);
		int age = 65432;
		String name = "jason";
		System.out.printf("%n내 나이는 %d살인 %s입니다.", age, name);

		System.out.printf("%n내 이름은 "+name+"이고 나이는 " + age + "살입니다.");
		
		//syso 누르고 ctrl + space하면 자동완성으로 System.out.println가 나옴.
		System.out.println();
		
		/*변수란 리터럴 값을 담을 저장 공간의 정의를 해준다.
		 * 변수 타입을 먼저 내어주고 (무슨 값을 담을지) < 선언만 한거고
		 * 타입에 변수명 주고 값을 담으면  선언하고 값을 저장한게 된다.
		 * 
		 * 같은 이름 변수 존재 불가.
		 * 단 값의 변경은 가능.
		 * 
		 * 변수의 스코프: 변수가 허용되는 범위.
		 * 
		 * */
		System.out.println();
		
		int a = 100;
		a = 50;
		//int a = 50
		
		int c;
		
		{
			int b = 100;
			System.out.println(b);
			System.out.println(a);
			System.out.println(a+b);
			c = a + b;
		}
		
		System.out.println("{}안에서 더해진 a+b의 값: "+ c);
		
		//System.out.println(b);   이건 에러남 왜????
		//변수의 사용 범위를 넘어섰기때문.
		
		
		
		
		
		
		
	}

}
