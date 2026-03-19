package day04;

public class for608 {

	public static void main(String[] args) {
		
		// 구구단
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단: ");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + " = " +  i * j + "  ");
			}
			System.out.println();
		}
		
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + " = " +  i * j + "  ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
