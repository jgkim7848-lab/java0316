package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/*계산기 만들기
		 * menu
		 * 1 덧셈 2뺄셈 3곱 4나눗 5나머지 6종료
		 * 메뉴선택 > 1
		 * 숫자입력 두 정수 > 1 3
		 * 결과: 1 + 3 = 4
		 * */
		
		_06_Method3 m3 = new _06_Method3();
		Scanner scan = new Scanner(System.in);
		
		int a;
		int n = 0;
		int m = 0;
		
		System.out.println("1덧셈 2뺄셈 3곱 4나눗 5나머지 6종료");
			
		while(true) {
			System.out.print("사용하고싶은 메뉴 번호 입력>> ");
			a = scan.nextInt();
			System.out.println("숫자 2개 입력>> ");
			switch(a) {
			case 1: n = scan.nextInt(); m = scan.nextInt(); System.out.println(n + " + " + m + " = " + m3.hap(n,m)); break;
			case 2: n = scan.nextInt(); m = scan.nextInt(); System.out.println(n + " - " + m + " = " + m3.cha(n,m)); break;
			case 3: n = scan.nextInt(); m = scan.nextInt(); System.out.println(n + " * " + m + " = " + m3.gop(n,m)); break;
			case 4: n = scan.nextInt(); m = scan.nextInt(); 
			while(m == 0) {
				System.out.println("피 연산자는 0이 될수 없습니다. \n피연산자만 다시 입력해주세요.\n>> ");
				m = scan.nextInt();
			} System.out.println(n + " / " + m + " = " + m3.nanum(n,m)); break;
			
			case 5: n = scan.nextInt(); m = scan.nextInt(); 
			while(m == 0) {
				System.out.println("피 연산자는 0이 될수 없습니다. \n피연산자만 다시 입력해주세요.\n>> ");
				m = scan.nextInt();
				
			} System.out.println(n + " % " + m + " = " + m3.namuji(n,m)); break;

			case 6: System.out.println("종료");return;
			default: System.out.println("다시 입력해주세요"); continue;
			}
		}
	}

}
