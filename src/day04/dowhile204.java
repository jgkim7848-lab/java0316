package day04;

import java.util.Scanner;

public class dowhile204 {

	public static void main(String[] args) {
		//메뉴구성
		//1 저장  2 새로만들기 3종료
				
		Scanner scan = new Scanner(System.in);
		
		int menu;
		menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1 저장    |2 새로만들기    |3종료");
			System.out.println("menu> ");
			menu = scan.nextInt();
			
			//실제 기능 처리 구현 구문
			switch(menu) {
			case 1: break;
			case 2: break;
			case 3: break;
			default: System.out.println("worng menu");
			}
		}while(menu != 3);
		
		


				
			
		
		scan.close();
	}


}

