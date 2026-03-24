package day07;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*숫자를 입력받아 입력받은 숫자의 합꼐와 평균을 출력
		 * 근데 12345를 입력하면 1 + 2 + 3 + 4 + 5를 보여줄거임.
		 * 그리고 이거의 합계와 평균을 보여줄거임.
		 * 123456789하면 1부터 9까지 더해서 그 합계와 평균을 보여주는거임.
		 * 0이나 음수값 입력시 종료.*/ 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		double a;
		int count = 0;
		int all = 0;
		while(true) {
			System.out.println("긴 양수를 입력해주세요.");
			a = scan.nextDouble();
			if(a > 0) {
				double gajung = 0;
				gajung = a;
				
				while (gajung > 1) {
				    gajung /= 10;
				    count++;
				}
				int[] arr = new int[count];
				for(int b = count-1; b >= 0; b--) {
					arr[b] = (int) (a % 10);
					
					a = (int)(a / 10);
				}
				for(int i = 0; i < count; i++) {
					System.out.print(arr[i] + " ");
					all = all + arr[i];
				}
				System.out.println("\n합계: " + all + "\n평균: " + all/count);
				
				count = 0;
				all = 0;
			} else {
				System.out.println("종료하겠습니다.");
				return;
			}
			
			
			
			
		}
		
		
		
		
	}

}
