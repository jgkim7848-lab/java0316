package day04;

import java.util.Scanner;

public class Exam310 {

	public static void main(String[] args) {
		// 메뉴 넣을거임
		/*1더하기 2빼기 3곱하기 4나누기/ 5나머지% 6종료
		 * 사칙연산을 메뉴로 만들었음.
		 * 두 수를 입력해달라고 할거임.
		 * 숫자 2개를 따로 받아도 되고 각자 받아도 되고.
		 * 메뉴에 따라서 case 1: 
		 * 단 메뉴 4에서 입력한 피연산자가 0이면 다시 해달라고 요청할거임.
		 * 예외 발생 가능성의 상황에선 아예 안받을거임.
		 * */
		Scanner scan = new Scanner(System.in);
		
		a: while(true) {
			
			System.out.println("1더하기 2빼기 3곱하기 4나누기/ 5나머지 6종료 입니다. \n사용하고픈 메뉴의 번호를 입력해주세요. >> ");
			int menu = scan.nextInt();
			if(menu == 6) {
				System.out.println("종료합니다.");
				break;
			} else if(menu < 1 || menu > 6) {
				System.out.println("1에서 6 사이의 메뉴 숫자를 입력해주세요.");
				continue;
			} else {
			}
			
			System.out.println("두 숫자를 입력해주세요.");
			
			int num1;
			int num2;
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			b: switch(menu) {
			case 1: System.out.println("덧셈을 고르셨습니다. " + (num1+num2));break;
			case 2: System.out.println("뺄셈을 고르셨습니다. " + (num1-num2));break;
			case 3: System.out.println("곱셈을 고르셨습니다. " + (num1*num2));break;
			case 4: if(num2==0) {
				System.out.println("올바르지 않은 계산 메뉴에 대한 입력값입니다. 다시해주세요.");
				break;
			} else {
				System.out.println("나눗셈을 고르셨습니다. " + (num1/num2));break;
			}
			case 5: if(num2==0) {
				System.out.println("올바르지 않은 계산 메뉴에 대한 입력값입니다. 다시해주세요.");
				break;
			} else {
				System.out.println("나머지를 고르셨습니다. " + (num1%num2)); break;
			}
			default: break;
			}
			
		}

		
	}

}
