package day03;

import java.util.Random;
import java.util.Scanner;

public class for203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Random rand = new Random();
		
		rand.nextInt();
		
		//1~10의 수중 랜덤 5개 출력. 중복 가능
		for(int i = 1; i <=5; i++) {
			System.out.println(rand.nextInt(10)+1);
		}
		
		int dan;
		dan = 2;
		System.out.println(dan + "단 = ");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
		
		System.out.println("--------------------------------------");
		System.out.println("VVVVVVVVVV랜덤 숫자로 구구단 출력");
		//1~10의 수중 랜덤 5개 출력. 중복 가능
		
		int a = rand.nextInt(10)+1;
		for(int i = 1; i <=9; i++) {
			System.out.println("a * i = " + a * i);
		}
		
		
		
		
		System.out.println("--------------------------------------");
		System.out.println("VVVVVVVVVV숫자 입력으로 구구단 출력");
		Scanner scan = new Scanner(System.in);

		int dannum = scan.nextInt();
		if(dannum > 9 || dannum < 1) {
			System.out.println("잘못된 숫자 입력입니다.");
			return;
		}
		System.out.println(dannum+"단 출력");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dannum + "*" + i + "=" + dannum * i);
		}
		

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
