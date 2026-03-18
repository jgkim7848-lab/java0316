package day02;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//casting 자료형 변환

		/*a에 b라는 변수를 넣고싶은데 2 변수의 자료형이 안맞으면??? 오류난다.
		 * int에 string? 못넣지.
		 * 
		 * 자동 자료형 변환 auto casting
		 * byte가 int에 들어가는건 범위상 문제가 안되는....이런건 자동 캐스팅이 된다.
		 * 같은 정수의 작은 메모리 크기를 갖는게 큰걸로 들어가는건 문제가 안된다.
		 * int 입장에선 포함되는 범위인 byte가 못들어갈 이유가 없다.
		 * 
		 * byte < short < char < int < long
		 * float < double*/
		int a = 1;
		String b = "111";
		//a = b; 이렇게 적으면 타입의 미스매치로 나온다.
		
		byte c = 11;
		System.out.println(c + "  byte c의 값");
		
		a = c;  
		//안담길 가능성이 존재조차 하지않을경우에 가능함. (byte는 무조건 범위상 int내에 들어가므로
		long l;
		l = a;
		
		
		/*그럼 형 변환의 반대의 케이스는????
		 * 값은 가능하지만 만약에 값이 달라져서 범위를 벗어나면 못들어가지??
		 * */
		//byte c의 반대 케이스
		//c = a;  이렇게 적으면 오류남. byte에 int 넣기가 안되니까 이 순간만 a를 byte로
		c = (byte)a; 
		//a값이 byte범위내에 들어가므로 일시적으로 byte 단위로 바꿔줘서 c에 들어가는것.
		
		//근데 이러면 메모리는 a값을 알수있는가???
		//a가 200이 되도 문제가 안생긴다? byte는 128까진데 어째서??
		a = 200;
		c = (byte)a; 
		System.out.println(c); //127에서 -로 넘어가버린, 이상해져버린 무언가임.
		//부정확한 코딩이 될 가능성이 존재하므로 반드시 넘지 않는다는 보장이 있을때만
		//형변환을 할것.
		
		
		
		
		
		char ch = 'a'; //아스키코드의 문자로 표현 마려움. a가 97
		System.out.println("a의 아스키코드값: "+(int)ch);
		//(int)로 형변환을 했기에 아스키코드값의 확인이 가능해짐. 
		
		
		System.out.println("=========================================");
		double d = 3.141592;
		System.out.println("d 그대로 출력: " + d);
		System.out.println("int로 형변환한 d는? : " + (int)d);
		int num = 100;
		System.out.println("실수형 num은?: " + (double)num);
		
		long l2 = num;
		System.out.println(l2);

		System.out.println("=========================================");
		
		
		/* 문자를 숫자로 바구고시프다아으ㅏ으ㅏ아
		 * string을 int로??
		 * */
		String str = "123";//""를 뗐을때 숫자가 되는거만
				//int 기본 자료형>>>>>>더많은기능제공class자료형을 제공함.
				//int의 래퍼 클래스라고 부름 (시발 뭐지이건
				//int -> Integer / long -> Long / boolean -> Boolean
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber);
		//str이 123이 아니라 abc면 오류남.
		
		
		
		
		/*
		 * 숫자를 문자로. int를 String으로. 
		 * 사실상 "" 붙이고 떼고지만 간단한건 아니다
		 * */
		int numberStr = 12345;
		String numberStr2 = String.valueOf(numberStr);
		System.out.println(numberStr2);
	}

}
