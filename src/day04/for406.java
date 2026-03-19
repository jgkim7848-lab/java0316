package day04;

import java.util.Scanner;

public class for406 {

	public static void main(String[] args) {
		// 약수 구하기????
		//6의 약수 1 2 3 6
		Scanner scan = new Scanner(System.in);
		
		int num = 32;
		
		for(int i = 1; i <= num;i++) {
			if(num % i == 0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
		
		
		//  최소공배수
		
		int num1 = 15;
		int num2 = 10;
		
		for(int i = 1; i > 0; i++) {
			int c = num1 * i;
			if(c %num2 == 0) {
				System.out.println("최소공배수: " + c);
				break;
			}
		}
		
		
		
	}

}
