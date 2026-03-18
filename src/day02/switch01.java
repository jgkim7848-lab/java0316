package day02;

public class switch01 {

	public static void main(String[] args) {
		//switch
		/*변수, 값이 들어갈수있는 식을 주면 된디
		 * 그 안에 값으로 case에 대해 변수나 식의 값이 1번 케이스에 만족한다면 case값1: 실행문 끝난뒤 break;
		 * 이것이 한 구문이다.
		 * */

		//break란?> 구문을 빠져나갈때 사용함.
		//보통 break 사용시 조건문을 동반해 사용하는 편이다.
		
		int number = 6;
		//switch로 홀짝 확인
		//number % 2
		switch(number % 2) {
		case 0: System.out.println("짝수"); break;
		case 1: System.out.println("홀수"); break;
		default : System.out.println("잘못된 값");
		}
		System.out.println("\n\n---------------------------------\n\n");
		//num값이 123이라 가정하고 1이면 1칸 2면 2칸 3이면 3칸 전진일 경우에.
		//num이 123이 아니면 다시 입력하라고 적게된다면???
		int num = 1;
		
		switch(num) {
		case 1: System.out.println("+1");break;
		case 2: System.out.println("+2");break;
		case 3: System.out.println("+3");break;
		default : System.out.println("retry");
		}
		
		
		
		System.out.println("\n\n---------------------------------\n\n");
		int num1 = 1;
		
		switch(num1) {//switch에서 하나로 묶기
		case 1: case 2: case 3: System.out.println(num1 + " 칸 전진");break;
		default : System.out.println("retry");
		}

		System.out.println("\n\n---------------------------------\n\n");
		int wea;
		wea = 3;
		//345는 봄 678 여름 9 10 11 가을 12 1 2 겨울
		switch (wea) {
		case 3: case 4: case 5: System.out.println("spring"); break;
		case 6: case 7: case 8: System.out.println("summer"); break;
		case 9: case 10: case 11: System.out.println("autumn"); break;
		case 12: case 1: case 2: System.out.println("winter"); break;
		default : System.out.println("out of range");
		}
		
		
		//지금 버전으론 yield 못함. 한번 확인해볼것.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
