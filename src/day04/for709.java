package day04;

public class for709 {

	public static void main(String[] args) {
		// 그 유명한 별찍기
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
				//* ** *** **** *****
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println("--------------------------");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------------");
	}

}
