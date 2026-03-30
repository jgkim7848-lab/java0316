package day11;

import java.util.Scanner;

public class Method09 {
	public int fact(int num) {
		int result = 1;
		if(num<0) {
			return 0;
		}
		if(num==0||num==1) {
			return 1;
		}
		for(int i = 2; i < num; i++) {
			result *=i;
		}
		return result;
	}
	
	//재귀메서드로 변경하면???
	public int factorial(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0||num==1) {
			return 1;
		}
		
		return num * factorial(num-1);
	}

	public static void main(String[] args) {
		// 재귀메서드로 팩토리얼을
		Scanner scan = new Scanner(System.in);
		
		Method09 m9 = new Method09();
		
		
		System.out.println(m9.fact(7));
		
		
		
		int a = scan.nextInt();
		
		System.out.println(m9.fact(a));
		
	}

}
